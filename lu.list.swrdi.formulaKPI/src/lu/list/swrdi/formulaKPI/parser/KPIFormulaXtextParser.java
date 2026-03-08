package lu.list.swrdi.formulaKPI.parser;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import lu.list.swrdi.formulaKPI.KPIFormulaDSLStandaloneSetup;
import lu.list.swrdi.formulaKPI.QualityModelUtils;
import lu.list.swrdi.formulaKPI.evaluation.KPIFormulaEvaluator;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Computable;
import lu.list.swrdi.formulaKPI.model.formulaKPI.ComputableRef;
import lu.list.swrdi.formulaKPI.model.formulaKPI.KPIFormula;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Metric;


public class KPIFormulaXtextParser implements KPIFormulaParser {
	
	public KPIFormulaXtextParser() {
		QualityModelUtils.updateQualityModelResource();
	}

	@Override
	public DslParseResult parse(String dslExpression) {
		Resource resource;
		try {
			resource = getResourceFor(dslExpression);
		} catch (IOException e) {
			e.printStackTrace();
			return DslParseResult.failure(new DslValidationError(0,0, "Error in EMF resource creation"), dslExpression);
		}
		
		KPIFormula formulas = (KPIFormula) resource.getContents().get(0);
		Set<String> usedMetrics = EcoreUtil2.getAllContentsOfType(formulas, ComputableRef.class).stream()
									.filter(elem -> elem.getComputable() instanceof Metric)
									.map(metric -> ((Computable) metric).getName())
									.collect(Collectors.toSet());
		
		usedMetrics.retainAll(getKnownMetricKeys());
		return DslParseResult.success(
				new KPIFormulaEvaluator(formulas), 
				usedMetrics, 
				dslExpression);
	}

	@Override
	public DslParseResult validate(String dslExpression) {
		return parse(dslExpression);
	}

	@Override
	public Set<String> getKnownMetricKeys() {
		return QualityModelUtils.listKnownMetrics();
	}

	@Override
	public void registerMetricKeys(Set<String> metricKeys) {
		for (String name : metricKeys) {
			QualityModelUtils.addMetric(name);
		}
	}
	
	private Resource getResourceFor(String code) throws IOException {
		Injector injector = new KPIFormulaDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		Resource resource = resourceSet.createResource(URI.createURI("temp"));
		resource.load(new ByteArrayInputStream(code.getBytes()), null);
		return resource;
	}
}
