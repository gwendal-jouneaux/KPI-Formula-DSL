package lu.list.swrdi.formulaKPI;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import lu.list.swrdi.formulaKPI.model.formulaKPI.Computable;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Metric;
import lu.list.swrdi.formulaKPI.model.formulaKPI.QualityAttribute;
import lu.list.swrdi.formulaKPI.model.formulaKPI.QualityCharacteristic;
import lu.list.swrdi.formulaKPI.model.formulaKPI.QualityModel;
import lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIFactory;

public class QualityModelUtils {
	
	private static Resource resourceQM = null;
	private static Injector injector = null;
	
	public static void populateQualityModelResource() {
        String[] characs = {"Functional_Suitability", 
        					"Performance_Efficiency", 
        					"Compatibility", 
        					"Interaction_Capability", 
        					"Reliability", 
        					"Security", 
        					"Maintainability", 
        					"Flexibility",
        					"Safety",
        					"Understandability",
        					"Sustainability",
        					"Output_Properties"
        };
        String[][] attributes = {
    		{"Functional_Completeness","Functional_Correctness","Functional_Appropriateness","Functional_Adaptability"}, 
    		{"Time_Behavior","Resource_Utilization","Capacity"}, 
    		{"Coexistance","Interoperability"}, 
    		{"Appropriateness_Recognisability","Learnability","Operability","User_Error_Protection","User_Engagement","Inclusivity","User_Assistance","Self_Descriptiveness","User_Controlability","Autonomy"}, 
    		{"Faultlessness","Availability","Fault_Tolerance","Recoverability","Robustness","Fairness"}, 
    		{"Confidentiality","Integrity","Non-repudiation","Accountability","Authenticity","Resistance","Intervenability"}, 
    		{"Modularity","Reusability","Analysability","Modifiability","Testability"}, 
    		{"Adaptability","Scalability","Installability","Replaceability"},
    		{"Operational_Constraint","Risk_Identification","Fail_Safe","Hazard_Warning","Safe_Integration","Ethics"},
    		{"Transparency","Interpretability","Explainability","Justifiability"},
    		{"Training_Impact","Inference_Impact","Mitigation"},
    		{"Creativity","Diversity","Conciseness","Repeatability","Reproducibility","Replicability"}
        };
        QualityModel model = formulaKPIFactory.eINSTANCE.createQualityModel();
        for(int i = 0; i<characs.length; i++) {
        	QualityCharacteristic charac = formulaKPIFactory.eINSTANCE.createQualityCharacteristic();
        	charac.setName(characs[i]);
        	model.getQualitycharacteristics().add(charac);
        	QualityModelUtils.resourceQM.getContents().add(charac);
            
            for(String attr_name: attributes[i]) {
            	QualityAttribute attr = formulaKPIFactory.eINSTANCE.createQualityAttribute();
            	attr.setName(attr_name);
            	charac.getQualityattributes().add(attr);
            	QualityModelUtils.resourceQM.getContents().add(attr);
            }
        }
    }
    
    public static void updateQualityModelResource() {
    	if(QualityModelUtils.resourceQM != null) return;
    	
    	// Use the StandaloneSetup to properly register EMF factories and Xtext infrastructure
    	if(injector == null) {
    		injector = new KPIFormulaDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
    	}
        XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
        
        // IMPORTANT: Use .kpi extension as registered in KPIFormulaDSLStandaloneSetupGenerated
        URI uri = URI.createURI("__quality_model__.kpi");
        QualityModelUtils.resourceQM = rs.createResource(uri);
        if(QualityModelUtils.resourceQM != null) {
        	QualityModelUtils.populateQualityModelResource();
        }
    }
    
    @SuppressWarnings("unchecked") // The QM is only composed of Computable
	public static Collection<? extends Computable> getQualityModelElements() {
    	QualityModelUtils.updateQualityModelResource();
    	return (Collection<? extends Computable>) (Collection<?>) QualityModelUtils.resourceQM.getContents();
    }
    
    public static void addMetric(String metricName) {
    	QualityModelUtils.updateQualityModelResource();
    	Metric metric = formulaKPIFactory.eINSTANCE.createMetric();
        metric.setName(metricName);
        QualityModelUtils.resourceQM.getContents().add(metric);
    }
    
    public static Set<String> listKnownMetrics() {
    	QualityModelUtils.updateQualityModelResource();
        return QualityModelUtils.resourceQM.getContents().stream()
        									.filter(elem -> elem instanceof Metric)
        									.map(elem -> ((Metric) elem).getName())
        									.collect(Collectors.toSet());
    }
}
