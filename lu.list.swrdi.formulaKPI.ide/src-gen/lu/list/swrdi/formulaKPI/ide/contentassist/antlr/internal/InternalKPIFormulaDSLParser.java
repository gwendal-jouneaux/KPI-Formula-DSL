package lu.list.swrdi.formulaKPI.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import lu.list.swrdi.formulaKPI.services.KPIFormulaDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKPIFormulaDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_STRING", "RULE_FQN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'seconds'", "'minutes'", "'hours'", "'days'", "'measurements'", "'milliseconds'", "'liters'", "'cubic meter'", "'Wh'", "'kWh'", "'gCO2eq'", "'kgCO2eq'", "'='", "'of'", "'type'", "'KPI'", "'int'", "'real'", "'text'", "'bool'", "'{'", "'}'", "'aggregate'", "'for'", "'drift'", "'Minimum'", "'Maximum'", "'Average'", "'Median'", "'Standard'", "'deviation'", "'otherwise'", "'->'", "';'", "'or'", "'and'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'!'", "'AVERAGE'", "','", "'WEIGHTED_SUM'", "':'", "'MIN'", "'MAX'", "'THRESHOLD'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int RULE_FQN=8;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=6;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalKPIFormulaDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKPIFormulaDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKPIFormulaDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKPIFormulaDSL.g"; }


    	private KPIFormulaDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(KPIFormulaDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleKPIFormulaDSL"
    // InternalKPIFormulaDSL.g:54:1: entryRuleKPIFormulaDSL : ruleKPIFormulaDSL EOF ;
    public final void entryRuleKPIFormulaDSL() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:55:1: ( ruleKPIFormulaDSL EOF )
            // InternalKPIFormulaDSL.g:56:1: ruleKPIFormulaDSL EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKPIFormulaDSLRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleKPIFormulaDSL();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKPIFormulaDSLRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKPIFormulaDSL"


    // $ANTLR start "ruleKPIFormulaDSL"
    // InternalKPIFormulaDSL.g:63:1: ruleKPIFormulaDSL : ( ( rule__KPIFormulaDSL__Group__0 ) ) ;
    public final void ruleKPIFormulaDSL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:67:2: ( ( ( rule__KPIFormulaDSL__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:68:2: ( ( rule__KPIFormulaDSL__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:68:2: ( ( rule__KPIFormulaDSL__Group__0 ) )
            // InternalKPIFormulaDSL.g:69:3: ( rule__KPIFormulaDSL__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKPIFormulaDSLAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:70:3: ( rule__KPIFormulaDSL__Group__0 )
            // InternalKPIFormulaDSL.g:70:4: rule__KPIFormulaDSL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KPIFormulaDSL__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKPIFormulaDSLAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKPIFormulaDSL"


    // $ANTLR start "entryRuleDeclaration"
    // InternalKPIFormulaDSL.g:79:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:80:1: ( ruleDeclaration EOF )
            // InternalKPIFormulaDSL.g:81:1: ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalKPIFormulaDSL.g:88:1: ruleDeclaration : ( ( rule__Declaration__DeclaredAssignment ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:92:2: ( ( ( rule__Declaration__DeclaredAssignment ) ) )
            // InternalKPIFormulaDSL.g:93:2: ( ( rule__Declaration__DeclaredAssignment ) )
            {
            // InternalKPIFormulaDSL.g:93:2: ( ( rule__Declaration__DeclaredAssignment ) )
            // InternalKPIFormulaDSL.g:94:3: ( rule__Declaration__DeclaredAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getDeclaredAssignment()); 
            }
            // InternalKPIFormulaDSL.g:95:3: ( rule__Declaration__DeclaredAssignment )
            // InternalKPIFormulaDSL.g:95:4: rule__Declaration__DeclaredAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__DeclaredAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getDeclaredAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleComputation"
    // InternalKPIFormulaDSL.g:104:1: entryRuleComputation : ruleComputation EOF ;
    public final void entryRuleComputation() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:105:1: ( ruleComputation EOF )
            // InternalKPIFormulaDSL.g:106:1: ruleComputation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComputationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComputation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComputationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComputation"


    // $ANTLR start "ruleComputation"
    // InternalKPIFormulaDSL.g:113:1: ruleComputation : ( ( rule__Computation__Group__0 ) ) ;
    public final void ruleComputation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:117:2: ( ( ( rule__Computation__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:118:2: ( ( rule__Computation__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:118:2: ( ( rule__Computation__Group__0 ) )
            // InternalKPIFormulaDSL.g:119:3: ( rule__Computation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComputationAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:120:3: ( rule__Computation__Group__0 )
            // InternalKPIFormulaDSL.g:120:4: rule__Computation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Computation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComputationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComputation"


    // $ANTLR start "entryRuleDeclarable"
    // InternalKPIFormulaDSL.g:129:1: entryRuleDeclarable : ruleDeclarable EOF ;
    public final void entryRuleDeclarable() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:130:1: ( ruleDeclarable EOF )
            // InternalKPIFormulaDSL.g:131:1: ruleDeclarable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDeclarable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclarable"


    // $ANTLR start "ruleDeclarable"
    // InternalKPIFormulaDSL.g:138:1: ruleDeclarable : ( ( rule__Declarable__Alternatives ) ) ;
    public final void ruleDeclarable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:142:2: ( ( ( rule__Declarable__Alternatives ) ) )
            // InternalKPIFormulaDSL.g:143:2: ( ( rule__Declarable__Alternatives ) )
            {
            // InternalKPIFormulaDSL.g:143:2: ( ( rule__Declarable__Alternatives ) )
            // InternalKPIFormulaDSL.g:144:3: ( rule__Declarable__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarableAccess().getAlternatives()); 
            }
            // InternalKPIFormulaDSL.g:145:3: ( rule__Declarable__Alternatives )
            // InternalKPIFormulaDSL.g:145:4: rule__Declarable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Declarable__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarableAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclarable"


    // $ANTLR start "entryRuleMetric"
    // InternalKPIFormulaDSL.g:154:1: entryRuleMetric : ruleMetric EOF ;
    public final void entryRuleMetric() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:155:1: ( ruleMetric EOF )
            // InternalKPIFormulaDSL.g:156:1: ruleMetric EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMetric();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetric"


    // $ANTLR start "ruleMetric"
    // InternalKPIFormulaDSL.g:163:1: ruleMetric : ( ( rule__Metric__Group__0 ) ) ;
    public final void ruleMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:167:2: ( ( ( rule__Metric__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:168:2: ( ( rule__Metric__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:168:2: ( ( rule__Metric__Group__0 ) )
            // InternalKPIFormulaDSL.g:169:3: ( rule__Metric__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:170:3: ( rule__Metric__Group__0 )
            // InternalKPIFormulaDSL.g:170:4: rule__Metric__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Metric__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetric"


    // $ANTLR start "entryRuleKPI"
    // InternalKPIFormulaDSL.g:179:1: entryRuleKPI : ruleKPI EOF ;
    public final void entryRuleKPI() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:180:1: ( ruleKPI EOF )
            // InternalKPIFormulaDSL.g:181:1: ruleKPI EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKPIRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleKPI();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKPIRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKPI"


    // $ANTLR start "ruleKPI"
    // InternalKPIFormulaDSL.g:188:1: ruleKPI : ( ( rule__KPI__Group__0 ) ) ;
    public final void ruleKPI() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:192:2: ( ( ( rule__KPI__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:193:2: ( ( rule__KPI__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:193:2: ( ( rule__KPI__Group__0 ) )
            // InternalKPIFormulaDSL.g:194:3: ( rule__KPI__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKPIAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:195:3: ( rule__KPI__Group__0 )
            // InternalKPIFormulaDSL.g:195:4: rule__KPI__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KPI__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKPIAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKPI"


    // $ANTLR start "entryRuleValueType"
    // InternalKPIFormulaDSL.g:204:1: entryRuleValueType : ruleValueType EOF ;
    public final void entryRuleValueType() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:205:1: ( ruleValueType EOF )
            // InternalKPIFormulaDSL.g:206:1: ruleValueType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValueType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueType"


    // $ANTLR start "ruleValueType"
    // InternalKPIFormulaDSL.g:213:1: ruleValueType : ( ( rule__ValueType__Alternatives ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:217:2: ( ( ( rule__ValueType__Alternatives ) ) )
            // InternalKPIFormulaDSL.g:218:2: ( ( rule__ValueType__Alternatives ) )
            {
            // InternalKPIFormulaDSL.g:218:2: ( ( rule__ValueType__Alternatives ) )
            // InternalKPIFormulaDSL.g:219:3: ( rule__ValueType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueTypeAccess().getAlternatives()); 
            }
            // InternalKPIFormulaDSL.g:220:3: ( rule__ValueType__Alternatives )
            // InternalKPIFormulaDSL.g:220:4: rule__ValueType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValueType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueType"


    // $ANTLR start "entryRuleIntegerValue"
    // InternalKPIFormulaDSL.g:229:1: entryRuleIntegerValue : ruleIntegerValue EOF ;
    public final void entryRuleIntegerValue() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:230:1: ( ruleIntegerValue EOF )
            // InternalKPIFormulaDSL.g:231:1: ruleIntegerValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIntegerValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // InternalKPIFormulaDSL.g:238:1: ruleIntegerValue : ( ( rule__IntegerValue__Group__0 ) ) ;
    public final void ruleIntegerValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:242:2: ( ( ( rule__IntegerValue__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:243:2: ( ( rule__IntegerValue__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:243:2: ( ( rule__IntegerValue__Group__0 ) )
            // InternalKPIFormulaDSL.g:244:3: ( rule__IntegerValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:245:3: ( rule__IntegerValue__Group__0 )
            // InternalKPIFormulaDSL.g:245:4: rule__IntegerValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleRealValue"
    // InternalKPIFormulaDSL.g:254:1: entryRuleRealValue : ruleRealValue EOF ;
    public final void entryRuleRealValue() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:255:1: ( ruleRealValue EOF )
            // InternalKPIFormulaDSL.g:256:1: ruleRealValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRealValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRealValue"


    // $ANTLR start "ruleRealValue"
    // InternalKPIFormulaDSL.g:263:1: ruleRealValue : ( ( rule__RealValue__Group__0 ) ) ;
    public final void ruleRealValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:267:2: ( ( ( rule__RealValue__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:268:2: ( ( rule__RealValue__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:268:2: ( ( rule__RealValue__Group__0 ) )
            // InternalKPIFormulaDSL.g:269:3: ( rule__RealValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealValueAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:270:3: ( rule__RealValue__Group__0 )
            // InternalKPIFormulaDSL.g:270:4: rule__RealValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RealValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealValueAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRealValue"


    // $ANTLR start "entryRuleTextualValue"
    // InternalKPIFormulaDSL.g:279:1: entryRuleTextualValue : ruleTextualValue EOF ;
    public final void entryRuleTextualValue() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:280:1: ( ruleTextualValue EOF )
            // InternalKPIFormulaDSL.g:281:1: ruleTextualValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextualValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTextualValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextualValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextualValue"


    // $ANTLR start "ruleTextualValue"
    // InternalKPIFormulaDSL.g:288:1: ruleTextualValue : ( ( rule__TextualValue__Group__0 ) ) ;
    public final void ruleTextualValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:292:2: ( ( ( rule__TextualValue__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:293:2: ( ( rule__TextualValue__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:293:2: ( ( rule__TextualValue__Group__0 ) )
            // InternalKPIFormulaDSL.g:294:3: ( rule__TextualValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextualValueAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:295:3: ( rule__TextualValue__Group__0 )
            // InternalKPIFormulaDSL.g:295:4: rule__TextualValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TextualValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextualValueAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextualValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalKPIFormulaDSL.g:304:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:305:1: ( ruleBooleanValue EOF )
            // InternalKPIFormulaDSL.g:306:1: ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalKPIFormulaDSL.g:313:1: ruleBooleanValue : ( ( rule__BooleanValue__Group__0 ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:317:2: ( ( ( rule__BooleanValue__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:318:2: ( ( rule__BooleanValue__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:318:2: ( ( rule__BooleanValue__Group__0 ) )
            // InternalKPIFormulaDSL.g:319:3: ( rule__BooleanValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:320:3: ( rule__BooleanValue__Group__0 )
            // InternalKPIFormulaDSL.g:320:4: rule__BooleanValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleEnumerationValue"
    // InternalKPIFormulaDSL.g:329:1: entryRuleEnumerationValue : ruleEnumerationValue EOF ;
    public final void entryRuleEnumerationValue() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:330:1: ( ruleEnumerationValue EOF )
            // InternalKPIFormulaDSL.g:331:1: ruleEnumerationValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnumerationValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumerationValue"


    // $ANTLR start "ruleEnumerationValue"
    // InternalKPIFormulaDSL.g:338:1: ruleEnumerationValue : ( ( rule__EnumerationValue__Group__0 ) ) ;
    public final void ruleEnumerationValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:342:2: ( ( ( rule__EnumerationValue__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:343:2: ( ( rule__EnumerationValue__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:343:2: ( ( rule__EnumerationValue__Group__0 ) )
            // InternalKPIFormulaDSL.g:344:3: ( rule__EnumerationValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationValueAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:345:3: ( rule__EnumerationValue__Group__0 )
            // InternalKPIFormulaDSL.g:345:4: rule__EnumerationValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationValueAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationValue"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalKPIFormulaDSL.g:354:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:355:1: ( ruleEnumerationLiteral EOF )
            // InternalKPIFormulaDSL.g:356:1: ruleEnumerationLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnumerationLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // InternalKPIFormulaDSL.g:363:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__NameAssignment ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:367:2: ( ( ( rule__EnumerationLiteral__NameAssignment ) ) )
            // InternalKPIFormulaDSL.g:368:2: ( ( rule__EnumerationLiteral__NameAssignment ) )
            {
            // InternalKPIFormulaDSL.g:368:2: ( ( rule__EnumerationLiteral__NameAssignment ) )
            // InternalKPIFormulaDSL.g:369:3: ( rule__EnumerationLiteral__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment()); 
            }
            // InternalKPIFormulaDSL.g:370:3: ( rule__EnumerationLiteral__NameAssignment )
            // InternalKPIFormulaDSL.g:370:4: rule__EnumerationLiteral__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleUnitValue"
    // InternalKPIFormulaDSL.g:379:1: entryRuleUnitValue : ruleUnitValue EOF ;
    public final void entryRuleUnitValue() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:380:1: ( ruleUnitValue EOF )
            // InternalKPIFormulaDSL.g:381:1: ruleUnitValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUnitValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnitValue"


    // $ANTLR start "ruleUnitValue"
    // InternalKPIFormulaDSL.g:388:1: ruleUnitValue : ( ( rule__UnitValue__UnitAssignment ) ) ;
    public final void ruleUnitValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:392:2: ( ( ( rule__UnitValue__UnitAssignment ) ) )
            // InternalKPIFormulaDSL.g:393:2: ( ( rule__UnitValue__UnitAssignment ) )
            {
            // InternalKPIFormulaDSL.g:393:2: ( ( rule__UnitValue__UnitAssignment ) )
            // InternalKPIFormulaDSL.g:394:3: ( rule__UnitValue__UnitAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitValueAccess().getUnitAssignment()); 
            }
            // InternalKPIFormulaDSL.g:395:3: ( rule__UnitValue__UnitAssignment )
            // InternalKPIFormulaDSL.g:395:4: rule__UnitValue__UnitAssignment
            {
            pushFollow(FOLLOW_2);
            rule__UnitValue__UnitAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitValueAccess().getUnitAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnitValue"


    // $ANTLR start "entryRuleAggregationValue"
    // InternalKPIFormulaDSL.g:404:1: entryRuleAggregationValue : ruleAggregationValue EOF ;
    public final void entryRuleAggregationValue() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:405:1: ( ruleAggregationValue EOF )
            // InternalKPIFormulaDSL.g:406:1: ruleAggregationValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregationValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAggregationValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregationValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAggregationValue"


    // $ANTLR start "ruleAggregationValue"
    // InternalKPIFormulaDSL.g:413:1: ruleAggregationValue : ( ( rule__AggregationValue__Group__0 ) ) ;
    public final void ruleAggregationValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:417:2: ( ( ( rule__AggregationValue__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:418:2: ( ( rule__AggregationValue__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:418:2: ( ( rule__AggregationValue__Group__0 ) )
            // InternalKPIFormulaDSL.g:419:3: ( rule__AggregationValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregationValueAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:420:3: ( rule__AggregationValue__Group__0 )
            // InternalKPIFormulaDSL.g:420:4: rule__AggregationValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AggregationValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregationValueAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAggregationValue"


    // $ANTLR start "entryRuleDriftValue"
    // InternalKPIFormulaDSL.g:429:1: entryRuleDriftValue : ruleDriftValue EOF ;
    public final void entryRuleDriftValue() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:430:1: ( ruleDriftValue EOF )
            // InternalKPIFormulaDSL.g:431:1: ruleDriftValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDriftValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDriftValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDriftValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDriftValue"


    // $ANTLR start "ruleDriftValue"
    // InternalKPIFormulaDSL.g:438:1: ruleDriftValue : ( ( rule__DriftValue__Group__0 ) ) ;
    public final void ruleDriftValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:442:2: ( ( ( rule__DriftValue__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:443:2: ( ( rule__DriftValue__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:443:2: ( ( rule__DriftValue__Group__0 ) )
            // InternalKPIFormulaDSL.g:444:3: ( rule__DriftValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDriftValueAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:445:3: ( rule__DriftValue__Group__0 )
            // InternalKPIFormulaDSL.g:445:4: rule__DriftValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DriftValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDriftValueAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDriftValue"


    // $ANTLR start "entryRuleOperation"
    // InternalKPIFormulaDSL.g:454:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:455:1: ( ruleOperation EOF )
            // InternalKPIFormulaDSL.g:456:1: ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalKPIFormulaDSL.g:463:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:467:2: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalKPIFormulaDSL.g:468:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalKPIFormulaDSL.g:468:2: ( ( rule__Operation__Alternatives ) )
            // InternalKPIFormulaDSL.g:469:3: ( rule__Operation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getAlternatives()); 
            }
            // InternalKPIFormulaDSL.g:470:3: ( rule__Operation__Alternatives )
            // InternalKPIFormulaDSL.g:470:4: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleMinimum"
    // InternalKPIFormulaDSL.g:479:1: entryRuleMinimum : ruleMinimum EOF ;
    public final void entryRuleMinimum() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:480:1: ( ruleMinimum EOF )
            // InternalKPIFormulaDSL.g:481:1: ruleMinimum EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinimumRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMinimum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinimumRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMinimum"


    // $ANTLR start "ruleMinimum"
    // InternalKPIFormulaDSL.g:488:1: ruleMinimum : ( ( rule__Minimum__Group__0 ) ) ;
    public final void ruleMinimum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:492:2: ( ( ( rule__Minimum__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:493:2: ( ( rule__Minimum__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:493:2: ( ( rule__Minimum__Group__0 ) )
            // InternalKPIFormulaDSL.g:494:3: ( rule__Minimum__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinimumAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:495:3: ( rule__Minimum__Group__0 )
            // InternalKPIFormulaDSL.g:495:4: rule__Minimum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Minimum__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinimumAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMinimum"


    // $ANTLR start "entryRuleMaximum"
    // InternalKPIFormulaDSL.g:504:1: entryRuleMaximum : ruleMaximum EOF ;
    public final void entryRuleMaximum() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:505:1: ( ruleMaximum EOF )
            // InternalKPIFormulaDSL.g:506:1: ruleMaximum EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaximumRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMaximum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMaximumRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaximum"


    // $ANTLR start "ruleMaximum"
    // InternalKPIFormulaDSL.g:513:1: ruleMaximum : ( ( rule__Maximum__Group__0 ) ) ;
    public final void ruleMaximum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:517:2: ( ( ( rule__Maximum__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:518:2: ( ( rule__Maximum__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:518:2: ( ( rule__Maximum__Group__0 ) )
            // InternalKPIFormulaDSL.g:519:3: ( rule__Maximum__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaximumAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:520:3: ( rule__Maximum__Group__0 )
            // InternalKPIFormulaDSL.g:520:4: rule__Maximum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Maximum__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMaximumAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaximum"


    // $ANTLR start "entryRuleAverage"
    // InternalKPIFormulaDSL.g:529:1: entryRuleAverage : ruleAverage EOF ;
    public final void entryRuleAverage() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:530:1: ( ruleAverage EOF )
            // InternalKPIFormulaDSL.g:531:1: ruleAverage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAverageRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAverage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAverageRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAverage"


    // $ANTLR start "ruleAverage"
    // InternalKPIFormulaDSL.g:538:1: ruleAverage : ( ( rule__Average__Group__0 ) ) ;
    public final void ruleAverage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:542:2: ( ( ( rule__Average__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:543:2: ( ( rule__Average__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:543:2: ( ( rule__Average__Group__0 ) )
            // InternalKPIFormulaDSL.g:544:3: ( rule__Average__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAverageAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:545:3: ( rule__Average__Group__0 )
            // InternalKPIFormulaDSL.g:545:4: rule__Average__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Average__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAverageAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAverage"


    // $ANTLR start "entryRuleMedian"
    // InternalKPIFormulaDSL.g:554:1: entryRuleMedian : ruleMedian EOF ;
    public final void entryRuleMedian() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:555:1: ( ruleMedian EOF )
            // InternalKPIFormulaDSL.g:556:1: ruleMedian EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMedianRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMedian();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMedianRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMedian"


    // $ANTLR start "ruleMedian"
    // InternalKPIFormulaDSL.g:563:1: ruleMedian : ( ( rule__Median__Group__0 ) ) ;
    public final void ruleMedian() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:567:2: ( ( ( rule__Median__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:568:2: ( ( rule__Median__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:568:2: ( ( rule__Median__Group__0 ) )
            // InternalKPIFormulaDSL.g:569:3: ( rule__Median__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMedianAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:570:3: ( rule__Median__Group__0 )
            // InternalKPIFormulaDSL.g:570:4: rule__Median__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Median__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMedianAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMedian"


    // $ANTLR start "entryRuleStandardDeviation"
    // InternalKPIFormulaDSL.g:579:1: entryRuleStandardDeviation : ruleStandardDeviation EOF ;
    public final void entryRuleStandardDeviation() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:580:1: ( ruleStandardDeviation EOF )
            // InternalKPIFormulaDSL.g:581:1: ruleStandardDeviation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStandardDeviationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStandardDeviation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStandardDeviationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStandardDeviation"


    // $ANTLR start "ruleStandardDeviation"
    // InternalKPIFormulaDSL.g:588:1: ruleStandardDeviation : ( ( rule__StandardDeviation__Group__0 ) ) ;
    public final void ruleStandardDeviation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:592:2: ( ( ( rule__StandardDeviation__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:593:2: ( ( rule__StandardDeviation__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:593:2: ( ( rule__StandardDeviation__Group__0 ) )
            // InternalKPIFormulaDSL.g:594:3: ( rule__StandardDeviation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStandardDeviationAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:595:3: ( rule__StandardDeviation__Group__0 )
            // InternalKPIFormulaDSL.g:595:4: rule__StandardDeviation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StandardDeviation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStandardDeviationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStandardDeviation"


    // $ANTLR start "entryRuleCondition"
    // InternalKPIFormulaDSL.g:604:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:605:1: ( ruleCondition EOF )
            // InternalKPIFormulaDSL.g:606:1: ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalKPIFormulaDSL.g:613:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:617:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:618:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:618:2: ( ( rule__Condition__Group__0 ) )
            // InternalKPIFormulaDSL.g:619:3: ( rule__Condition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:620:3: ( rule__Condition__Group__0 )
            // InternalKPIFormulaDSL.g:620:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleExpression"
    // InternalKPIFormulaDSL.g:629:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:630:1: ( ruleExpression EOF )
            // InternalKPIFormulaDSL.g:631:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalKPIFormulaDSL.g:638:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:642:2: ( ( ruleOr ) )
            // InternalKPIFormulaDSL.g:643:2: ( ruleOr )
            {
            // InternalKPIFormulaDSL.g:643:2: ( ruleOr )
            // InternalKPIFormulaDSL.g:644:3: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalKPIFormulaDSL.g:654:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:655:1: ( ruleOr EOF )
            // InternalKPIFormulaDSL.g:656:1: ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalKPIFormulaDSL.g:663:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:667:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:668:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:668:2: ( ( rule__Or__Group__0 ) )
            // InternalKPIFormulaDSL.g:669:3: ( rule__Or__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:670:3: ( rule__Or__Group__0 )
            // InternalKPIFormulaDSL.g:670:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalKPIFormulaDSL.g:679:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:680:1: ( ruleAnd EOF )
            // InternalKPIFormulaDSL.g:681:1: ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalKPIFormulaDSL.g:688:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:692:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:693:2: ( ( rule__And__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:693:2: ( ( rule__And__Group__0 ) )
            // InternalKPIFormulaDSL.g:694:3: ( rule__And__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:695:3: ( rule__And__Group__0 )
            // InternalKPIFormulaDSL.g:695:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalKPIFormulaDSL.g:704:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:705:1: ( ruleEquality EOF )
            // InternalKPIFormulaDSL.g:706:1: ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalKPIFormulaDSL.g:713:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:717:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:718:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:718:2: ( ( rule__Equality__Group__0 ) )
            // InternalKPIFormulaDSL.g:719:3: ( rule__Equality__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:720:3: ( rule__Equality__Group__0 )
            // InternalKPIFormulaDSL.g:720:4: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalKPIFormulaDSL.g:729:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:730:1: ( ruleComparison EOF )
            // InternalKPIFormulaDSL.g:731:1: ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalKPIFormulaDSL.g:738:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:742:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:743:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:743:2: ( ( rule__Comparison__Group__0 ) )
            // InternalKPIFormulaDSL.g:744:3: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:745:3: ( rule__Comparison__Group__0 )
            // InternalKPIFormulaDSL.g:745:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalKPIFormulaDSL.g:754:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:755:1: ( rulePlusOrMinus EOF )
            // InternalKPIFormulaDSL.g:756:1: rulePlusOrMinus EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalKPIFormulaDSL.g:763:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:767:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:768:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:768:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalKPIFormulaDSL.g:769:3: ( rule__PlusOrMinus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:770:3: ( rule__PlusOrMinus__Group__0 )
            // InternalKPIFormulaDSL.g:770:4: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalKPIFormulaDSL.g:779:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:780:1: ( ruleMulOrDiv EOF )
            // InternalKPIFormulaDSL.g:781:1: ruleMulOrDiv EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalKPIFormulaDSL.g:788:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:792:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:793:2: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:793:2: ( ( rule__MulOrDiv__Group__0 ) )
            // InternalKPIFormulaDSL.g:794:3: ( rule__MulOrDiv__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:795:3: ( rule__MulOrDiv__Group__0 )
            // InternalKPIFormulaDSL.g:795:4: rule__MulOrDiv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalKPIFormulaDSL.g:804:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:805:1: ( rulePrimary EOF )
            // InternalKPIFormulaDSL.g:806:1: rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalKPIFormulaDSL.g:813:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:817:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalKPIFormulaDSL.g:818:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalKPIFormulaDSL.g:818:2: ( ( rule__Primary__Alternatives ) )
            // InternalKPIFormulaDSL.g:819:3: ( rule__Primary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            }
            // InternalKPIFormulaDSL.g:820:3: ( rule__Primary__Alternatives )
            // InternalKPIFormulaDSL.g:820:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalKPIFormulaDSL.g:829:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:830:1: ( ruleAtomic EOF )
            // InternalKPIFormulaDSL.g:831:1: ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAtomic();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalKPIFormulaDSL.g:838:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:842:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalKPIFormulaDSL.g:843:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalKPIFormulaDSL.g:843:2: ( ( rule__Atomic__Alternatives ) )
            // InternalKPIFormulaDSL.g:844:3: ( rule__Atomic__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getAlternatives()); 
            }
            // InternalKPIFormulaDSL.g:845:3: ( rule__Atomic__Alternatives )
            // InternalKPIFormulaDSL.g:845:4: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "ruleWindowUnit"
    // InternalKPIFormulaDSL.g:854:1: ruleWindowUnit : ( ( rule__WindowUnit__Alternatives ) ) ;
    public final void ruleWindowUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:858:1: ( ( ( rule__WindowUnit__Alternatives ) ) )
            // InternalKPIFormulaDSL.g:859:2: ( ( rule__WindowUnit__Alternatives ) )
            {
            // InternalKPIFormulaDSL.g:859:2: ( ( rule__WindowUnit__Alternatives ) )
            // InternalKPIFormulaDSL.g:860:3: ( rule__WindowUnit__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWindowUnitAccess().getAlternatives()); 
            }
            // InternalKPIFormulaDSL.g:861:3: ( rule__WindowUnit__Alternatives )
            // InternalKPIFormulaDSL.g:861:4: rule__WindowUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WindowUnit__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWindowUnitAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWindowUnit"


    // $ANTLR start "ruleValueUnit"
    // InternalKPIFormulaDSL.g:870:1: ruleValueUnit : ( ( rule__ValueUnit__Alternatives ) ) ;
    public final void ruleValueUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:874:1: ( ( ( rule__ValueUnit__Alternatives ) ) )
            // InternalKPIFormulaDSL.g:875:2: ( ( rule__ValueUnit__Alternatives ) )
            {
            // InternalKPIFormulaDSL.g:875:2: ( ( rule__ValueUnit__Alternatives ) )
            // InternalKPIFormulaDSL.g:876:3: ( rule__ValueUnit__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueUnitAccess().getAlternatives()); 
            }
            // InternalKPIFormulaDSL.g:877:3: ( rule__ValueUnit__Alternatives )
            // InternalKPIFormulaDSL.g:877:4: rule__ValueUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValueUnit__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueUnitAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueUnit"


    // $ANTLR start "rule__Computation__FormulaAlternatives_2_0"
    // InternalKPIFormulaDSL.g:885:1: rule__Computation__FormulaAlternatives_2_0 : ( ( ruleExpression ) | ( ruleCondition ) );
    public final void rule__Computation__FormulaAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:889:1: ( ( ruleExpression ) | ( ruleCondition ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_FQN)||(LA1_0>=13 && LA1_0<=14)||LA1_0==58||LA1_0==61||(LA1_0>=63 && LA1_0<=64)||LA1_0==66||(LA1_0>=68 && LA1_0<=70)) ) {
                alt1=1;
            }
            else if ( (LA1_0==35) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalKPIFormulaDSL.g:890:2: ( ruleExpression )
                    {
                    // InternalKPIFormulaDSL.g:890:2: ( ruleExpression )
                    // InternalKPIFormulaDSL.g:891:3: ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComputationAccess().getFormulaExpressionParserRuleCall_2_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComputationAccess().getFormulaExpressionParserRuleCall_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:896:2: ( ruleCondition )
                    {
                    // InternalKPIFormulaDSL.g:896:2: ( ruleCondition )
                    // InternalKPIFormulaDSL.g:897:3: ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComputationAccess().getFormulaConditionParserRuleCall_2_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCondition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComputationAccess().getFormulaConditionParserRuleCall_2_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Computation__FormulaAlternatives_2_0"


    // $ANTLR start "rule__Declarable__Alternatives"
    // InternalKPIFormulaDSL.g:906:1: rule__Declarable__Alternatives : ( ( ruleKPI ) | ( ruleMetric ) );
    public final void rule__Declarable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:910:1: ( ( ruleKPI ) | ( ruleMetric ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalKPIFormulaDSL.g:911:2: ( ruleKPI )
                    {
                    // InternalKPIFormulaDSL.g:911:2: ( ruleKPI )
                    // InternalKPIFormulaDSL.g:912:3: ruleKPI
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarableAccess().getKPIParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleKPI();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclarableAccess().getKPIParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:917:2: ( ruleMetric )
                    {
                    // InternalKPIFormulaDSL.g:917:2: ( ruleMetric )
                    // InternalKPIFormulaDSL.g:918:3: ruleMetric
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarableAccess().getMetricParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMetric();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclarableAccess().getMetricParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarable__Alternatives"


    // $ANTLR start "rule__ValueType__Alternatives"
    // InternalKPIFormulaDSL.g:927:1: rule__ValueType__Alternatives : ( ( ruleIntegerValue ) | ( ruleRealValue ) | ( ruleTextualValue ) | ( ruleBooleanValue ) | ( ruleEnumerationValue ) | ( ruleAggregationValue ) | ( ruleDriftValue ) | ( ruleUnitValue ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:931:1: ( ( ruleIntegerValue ) | ( ruleRealValue ) | ( ruleTextualValue ) | ( ruleBooleanValue ) | ( ruleEnumerationValue ) | ( ruleAggregationValue ) | ( ruleDriftValue ) | ( ruleUnitValue ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt3=1;
                }
                break;
            case 32:
                {
                alt3=2;
                }
                break;
            case 33:
                {
                alt3=3;
                }
                break;
            case 34:
                {
                alt3=4;
                }
                break;
            case 35:
                {
                alt3=5;
                }
                break;
            case 37:
                {
                alt3=6;
                }
                break;
            case 39:
                {
                alt3=7;
                }
                break;
            case 15:
            case 16:
            case 17:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                {
                alt3=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalKPIFormulaDSL.g:932:2: ( ruleIntegerValue )
                    {
                    // InternalKPIFormulaDSL.g:932:2: ( ruleIntegerValue )
                    // InternalKPIFormulaDSL.g:933:3: ruleIntegerValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getIntegerValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIntegerValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getIntegerValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:938:2: ( ruleRealValue )
                    {
                    // InternalKPIFormulaDSL.g:938:2: ( ruleRealValue )
                    // InternalKPIFormulaDSL.g:939:3: ruleRealValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getRealValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRealValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getRealValueParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKPIFormulaDSL.g:944:2: ( ruleTextualValue )
                    {
                    // InternalKPIFormulaDSL.g:944:2: ( ruleTextualValue )
                    // InternalKPIFormulaDSL.g:945:3: ruleTextualValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getTextualValueParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTextualValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getTextualValueParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKPIFormulaDSL.g:950:2: ( ruleBooleanValue )
                    {
                    // InternalKPIFormulaDSL.g:950:2: ( ruleBooleanValue )
                    // InternalKPIFormulaDSL.g:951:3: ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getBooleanValueParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getBooleanValueParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKPIFormulaDSL.g:956:2: ( ruleEnumerationValue )
                    {
                    // InternalKPIFormulaDSL.g:956:2: ( ruleEnumerationValue )
                    // InternalKPIFormulaDSL.g:957:3: ruleEnumerationValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getEnumerationValueParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEnumerationValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getEnumerationValueParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKPIFormulaDSL.g:962:2: ( ruleAggregationValue )
                    {
                    // InternalKPIFormulaDSL.g:962:2: ( ruleAggregationValue )
                    // InternalKPIFormulaDSL.g:963:3: ruleAggregationValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getAggregationValueParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAggregationValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getAggregationValueParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKPIFormulaDSL.g:968:2: ( ruleDriftValue )
                    {
                    // InternalKPIFormulaDSL.g:968:2: ( ruleDriftValue )
                    // InternalKPIFormulaDSL.g:969:3: ruleDriftValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getDriftValueParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDriftValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getDriftValueParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalKPIFormulaDSL.g:974:2: ( ruleUnitValue )
                    {
                    // InternalKPIFormulaDSL.g:974:2: ( ruleUnitValue )
                    // InternalKPIFormulaDSL.g:975:3: ruleUnitValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueTypeAccess().getUnitValueParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleUnitValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueTypeAccess().getUnitValueParserRuleCall_7()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueType__Alternatives"


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalKPIFormulaDSL.g:984:1: rule__Operation__Alternatives : ( ( ruleMinimum ) | ( ruleMaximum ) | ( ruleAverage ) | ( ruleMedian ) | ( ruleStandardDeviation ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:988:1: ( ( ruleMinimum ) | ( ruleMaximum ) | ( ruleAverage ) | ( ruleMedian ) | ( ruleStandardDeviation ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt4=1;
                }
                break;
            case 41:
                {
                alt4=2;
                }
                break;
            case 42:
                {
                alt4=3;
                }
                break;
            case 43:
                {
                alt4=4;
                }
                break;
            case 44:
                {
                alt4=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalKPIFormulaDSL.g:989:2: ( ruleMinimum )
                    {
                    // InternalKPIFormulaDSL.g:989:2: ( ruleMinimum )
                    // InternalKPIFormulaDSL.g:990:3: ruleMinimum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationAccess().getMinimumParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMinimum();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperationAccess().getMinimumParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:995:2: ( ruleMaximum )
                    {
                    // InternalKPIFormulaDSL.g:995:2: ( ruleMaximum )
                    // InternalKPIFormulaDSL.g:996:3: ruleMaximum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationAccess().getMaximumParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMaximum();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperationAccess().getMaximumParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKPIFormulaDSL.g:1001:2: ( ruleAverage )
                    {
                    // InternalKPIFormulaDSL.g:1001:2: ( ruleAverage )
                    // InternalKPIFormulaDSL.g:1002:3: ruleAverage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationAccess().getAverageParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAverage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperationAccess().getAverageParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKPIFormulaDSL.g:1007:2: ( ruleMedian )
                    {
                    // InternalKPIFormulaDSL.g:1007:2: ( ruleMedian )
                    // InternalKPIFormulaDSL.g:1008:3: ruleMedian
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationAccess().getMedianParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMedian();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperationAccess().getMedianParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKPIFormulaDSL.g:1013:2: ( ruleStandardDeviation )
                    {
                    // InternalKPIFormulaDSL.g:1013:2: ( ruleStandardDeviation )
                    // InternalKPIFormulaDSL.g:1014:3: ruleStandardDeviation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationAccess().getStandardDeviationParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStandardDeviation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperationAccess().getStandardDeviationParserRuleCall_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__Equality__Alternatives_1_0"
    // InternalKPIFormulaDSL.g:1023:1: rule__Equality__Alternatives_1_0 : ( ( ( rule__Equality__Group_1_0_0__0 ) ) | ( ( rule__Equality__Group_1_0_1__0 ) ) );
    public final void rule__Equality__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1027:1: ( ( ( rule__Equality__Group_1_0_0__0 ) ) | ( ( rule__Equality__Group_1_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==51) ) {
                alt5=1;
            }
            else if ( (LA5_0==52) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalKPIFormulaDSL.g:1028:2: ( ( rule__Equality__Group_1_0_0__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1028:2: ( ( rule__Equality__Group_1_0_0__0 ) )
                    // InternalKPIFormulaDSL.g:1029:3: ( rule__Equality__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getGroup_1_0_0()); 
                    }
                    // InternalKPIFormulaDSL.g:1030:3: ( rule__Equality__Group_1_0_0__0 )
                    // InternalKPIFormulaDSL.g:1030:4: rule__Equality__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Equality__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:1034:2: ( ( rule__Equality__Group_1_0_1__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1034:2: ( ( rule__Equality__Group_1_0_1__0 ) )
                    // InternalKPIFormulaDSL.g:1035:3: ( rule__Equality__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getGroup_1_0_1()); 
                    }
                    // InternalKPIFormulaDSL.g:1036:3: ( rule__Equality__Group_1_0_1__0 )
                    // InternalKPIFormulaDSL.g:1036:4: rule__Equality__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Equality__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Alternatives_1_0"


    // $ANTLR start "rule__Comparison__Alternatives_1_0"
    // InternalKPIFormulaDSL.g:1044:1: rule__Comparison__Alternatives_1_0 : ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) | ( ( rule__Comparison__Group_1_0_3__0 ) ) );
    public final void rule__Comparison__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1048:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) | ( ( rule__Comparison__Group_1_0_3__0 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt6=1;
                }
                break;
            case 54:
                {
                alt6=2;
                }
                break;
            case 55:
                {
                alt6=3;
                }
                break;
            case 56:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalKPIFormulaDSL.g:1049:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1049:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    // InternalKPIFormulaDSL.g:1050:3: ( rule__Comparison__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    }
                    // InternalKPIFormulaDSL.g:1051:3: ( rule__Comparison__Group_1_0_0__0 )
                    // InternalKPIFormulaDSL.g:1051:4: rule__Comparison__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:1055:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1055:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    // InternalKPIFormulaDSL.g:1056:3: ( rule__Comparison__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    }
                    // InternalKPIFormulaDSL.g:1057:3: ( rule__Comparison__Group_1_0_1__0 )
                    // InternalKPIFormulaDSL.g:1057:4: rule__Comparison__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKPIFormulaDSL.g:1061:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1061:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    // InternalKPIFormulaDSL.g:1062:3: ( rule__Comparison__Group_1_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 
                    }
                    // InternalKPIFormulaDSL.g:1063:3: ( rule__Comparison__Group_1_0_2__0 )
                    // InternalKPIFormulaDSL.g:1063:4: rule__Comparison__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKPIFormulaDSL.g:1067:2: ( ( rule__Comparison__Group_1_0_3__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1067:2: ( ( rule__Comparison__Group_1_0_3__0 ) )
                    // InternalKPIFormulaDSL.g:1068:3: ( rule__Comparison__Group_1_0_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_3()); 
                    }
                    // InternalKPIFormulaDSL.g:1069:3: ( rule__Comparison__Group_1_0_3__0 )
                    // InternalKPIFormulaDSL.g:1069:4: rule__Comparison__Group_1_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_1_0_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Alternatives_1_0"


    // $ANTLR start "rule__PlusOrMinus__Alternatives_1_0"
    // InternalKPIFormulaDSL.g:1077:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1081:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==57) ) {
                alt7=1;
            }
            else if ( (LA7_0==58) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalKPIFormulaDSL.g:1082:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1082:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalKPIFormulaDSL.g:1083:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    }
                    // InternalKPIFormulaDSL.g:1084:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalKPIFormulaDSL.g:1084:4: rule__PlusOrMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:1088:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1088:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalKPIFormulaDSL.g:1089:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    }
                    // InternalKPIFormulaDSL.g:1090:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalKPIFormulaDSL.g:1090:4: rule__PlusOrMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Alternatives_1_0"


    // $ANTLR start "rule__MulOrDiv__Alternatives_1_0"
    // InternalKPIFormulaDSL.g:1098:1: rule__MulOrDiv__Alternatives_1_0 : ( ( ( rule__MulOrDiv__Group_1_0_0__0 ) ) | ( ( rule__MulOrDiv__Group_1_0_1__0 ) ) );
    public final void rule__MulOrDiv__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1102:1: ( ( ( rule__MulOrDiv__Group_1_0_0__0 ) ) | ( ( rule__MulOrDiv__Group_1_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==59) ) {
                alt8=1;
            }
            else if ( (LA8_0==60) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalKPIFormulaDSL.g:1103:2: ( ( rule__MulOrDiv__Group_1_0_0__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1103:2: ( ( rule__MulOrDiv__Group_1_0_0__0 ) )
                    // InternalKPIFormulaDSL.g:1104:3: ( rule__MulOrDiv__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getGroup_1_0_0()); 
                    }
                    // InternalKPIFormulaDSL.g:1105:3: ( rule__MulOrDiv__Group_1_0_0__0 )
                    // InternalKPIFormulaDSL.g:1105:4: rule__MulOrDiv__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MulOrDiv__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMulOrDivAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:1109:2: ( ( rule__MulOrDiv__Group_1_0_1__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1109:2: ( ( rule__MulOrDiv__Group_1_0_1__0 ) )
                    // InternalKPIFormulaDSL.g:1110:3: ( rule__MulOrDiv__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getGroup_1_0_1()); 
                    }
                    // InternalKPIFormulaDSL.g:1111:3: ( rule__MulOrDiv__Group_1_0_1__0 )
                    // InternalKPIFormulaDSL.g:1111:4: rule__MulOrDiv__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MulOrDiv__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMulOrDivAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Alternatives_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalKPIFormulaDSL.g:1119:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ( rule__Primary__Group_4__0 ) ) | ( ( rule__Primary__Group_5__0 ) ) | ( ( rule__Primary__Group_6__0 ) ) | ( ( rule__Primary__Group_7__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1123:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ( rule__Primary__Group_3__0 ) ) | ( ( rule__Primary__Group_4__0 ) ) | ( ( rule__Primary__Group_5__0 ) ) | ( ( rule__Primary__Group_6__0 ) ) | ( ( rule__Primary__Group_7__0 ) ) | ( ruleAtomic ) )
            int alt9=9;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt9=1;
                }
                break;
            case 63:
                {
                alt9=2;
                }
                break;
            case 58:
                {
                alt9=3;
                }
                break;
            case 64:
                {
                alt9=4;
                }
                break;
            case 66:
                {
                alt9=5;
                }
                break;
            case 68:
                {
                alt9=6;
                }
                break;
            case 69:
                {
                alt9=7;
                }
                break;
            case 70:
                {
                alt9=8;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_STRING:
            case RULE_FQN:
            case 13:
            case 14:
                {
                alt9=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalKPIFormulaDSL.g:1124:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1124:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalKPIFormulaDSL.g:1125:3: ( rule__Primary__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    }
                    // InternalKPIFormulaDSL.g:1126:3: ( rule__Primary__Group_0__0 )
                    // InternalKPIFormulaDSL.g:1126:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:1130:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1130:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalKPIFormulaDSL.g:1131:3: ( rule__Primary__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    }
                    // InternalKPIFormulaDSL.g:1132:3: ( rule__Primary__Group_1__0 )
                    // InternalKPIFormulaDSL.g:1132:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKPIFormulaDSL.g:1136:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1136:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalKPIFormulaDSL.g:1137:3: ( rule__Primary__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    }
                    // InternalKPIFormulaDSL.g:1138:3: ( rule__Primary__Group_2__0 )
                    // InternalKPIFormulaDSL.g:1138:4: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKPIFormulaDSL.g:1142:2: ( ( rule__Primary__Group_3__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1142:2: ( ( rule__Primary__Group_3__0 ) )
                    // InternalKPIFormulaDSL.g:1143:3: ( rule__Primary__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    }
                    // InternalKPIFormulaDSL.g:1144:3: ( rule__Primary__Group_3__0 )
                    // InternalKPIFormulaDSL.g:1144:4: rule__Primary__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKPIFormulaDSL.g:1148:2: ( ( rule__Primary__Group_4__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1148:2: ( ( rule__Primary__Group_4__0 ) )
                    // InternalKPIFormulaDSL.g:1149:3: ( rule__Primary__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_4()); 
                    }
                    // InternalKPIFormulaDSL.g:1150:3: ( rule__Primary__Group_4__0 )
                    // InternalKPIFormulaDSL.g:1150:4: rule__Primary__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKPIFormulaDSL.g:1154:2: ( ( rule__Primary__Group_5__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1154:2: ( ( rule__Primary__Group_5__0 ) )
                    // InternalKPIFormulaDSL.g:1155:3: ( rule__Primary__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_5()); 
                    }
                    // InternalKPIFormulaDSL.g:1156:3: ( rule__Primary__Group_5__0 )
                    // InternalKPIFormulaDSL.g:1156:4: rule__Primary__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKPIFormulaDSL.g:1160:2: ( ( rule__Primary__Group_6__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1160:2: ( ( rule__Primary__Group_6__0 ) )
                    // InternalKPIFormulaDSL.g:1161:3: ( rule__Primary__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_6()); 
                    }
                    // InternalKPIFormulaDSL.g:1162:3: ( rule__Primary__Group_6__0 )
                    // InternalKPIFormulaDSL.g:1162:4: rule__Primary__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalKPIFormulaDSL.g:1166:2: ( ( rule__Primary__Group_7__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1166:2: ( ( rule__Primary__Group_7__0 ) )
                    // InternalKPIFormulaDSL.g:1167:3: ( rule__Primary__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_7()); 
                    }
                    // InternalKPIFormulaDSL.g:1168:3: ( rule__Primary__Group_7__0 )
                    // InternalKPIFormulaDSL.g:1168:4: rule__Primary__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalKPIFormulaDSL.g:1172:2: ( ruleAtomic )
                    {
                    // InternalKPIFormulaDSL.g:1172:2: ( ruleAtomic )
                    // InternalKPIFormulaDSL.g:1173:3: ruleAtomic
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_8()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAtomic();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_8()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Atomic__Alternatives"
    // InternalKPIFormulaDSL.g:1182:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) | ( ( rule__Atomic__Group_5__0 ) ) | ( ( rule__Atomic__Group_6__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1186:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) | ( ( rule__Atomic__Group_5__0 ) ) | ( ( rule__Atomic__Group_6__0 ) ) )
            int alt10=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt10=1;
                }
                break;
            case RULE_DOUBLE:
                {
                int LA10_2 = input.LA(2);

                if ( ((LA10_2>=15 && LA10_2<=17)||(LA10_2>=20 && LA10_2<=26)) ) {
                    alt10=5;
                }
                else if ( (LA10_2==EOF||LA10_2==RULE_ID||LA10_2==36||(LA10_2>=47 && LA10_2<=60)||LA10_2==62||LA10_2==65||LA10_2==67) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt10=3;
                }
                break;
            case 13:
            case 14:
                {
                alt10=4;
                }
                break;
            case RULE_FQN:
                {
                alt10=6;
                }
                break;
            case RULE_ID:
                {
                alt10=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalKPIFormulaDSL.g:1187:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1187:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalKPIFormulaDSL.g:1188:3: ( rule__Atomic__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    }
                    // InternalKPIFormulaDSL.g:1189:3: ( rule__Atomic__Group_0__0 )
                    // InternalKPIFormulaDSL.g:1189:4: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:1193:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1193:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalKPIFormulaDSL.g:1194:3: ( rule__Atomic__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    }
                    // InternalKPIFormulaDSL.g:1195:3: ( rule__Atomic__Group_1__0 )
                    // InternalKPIFormulaDSL.g:1195:4: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKPIFormulaDSL.g:1199:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1199:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalKPIFormulaDSL.g:1200:3: ( rule__Atomic__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    }
                    // InternalKPIFormulaDSL.g:1201:3: ( rule__Atomic__Group_2__0 )
                    // InternalKPIFormulaDSL.g:1201:4: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKPIFormulaDSL.g:1205:2: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1205:2: ( ( rule__Atomic__Group_3__0 ) )
                    // InternalKPIFormulaDSL.g:1206:3: ( rule__Atomic__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    }
                    // InternalKPIFormulaDSL.g:1207:3: ( rule__Atomic__Group_3__0 )
                    // InternalKPIFormulaDSL.g:1207:4: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKPIFormulaDSL.g:1211:2: ( ( rule__Atomic__Group_4__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1211:2: ( ( rule__Atomic__Group_4__0 ) )
                    // InternalKPIFormulaDSL.g:1212:3: ( rule__Atomic__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_4()); 
                    }
                    // InternalKPIFormulaDSL.g:1213:3: ( rule__Atomic__Group_4__0 )
                    // InternalKPIFormulaDSL.g:1213:4: rule__Atomic__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKPIFormulaDSL.g:1217:2: ( ( rule__Atomic__Group_5__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1217:2: ( ( rule__Atomic__Group_5__0 ) )
                    // InternalKPIFormulaDSL.g:1218:3: ( rule__Atomic__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_5()); 
                    }
                    // InternalKPIFormulaDSL.g:1219:3: ( rule__Atomic__Group_5__0 )
                    // InternalKPIFormulaDSL.g:1219:4: rule__Atomic__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKPIFormulaDSL.g:1223:2: ( ( rule__Atomic__Group_6__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1223:2: ( ( rule__Atomic__Group_6__0 ) )
                    // InternalKPIFormulaDSL.g:1224:3: ( rule__Atomic__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_6()); 
                    }
                    // InternalKPIFormulaDSL.g:1225:3: ( rule__Atomic__Group_6__0 )
                    // InternalKPIFormulaDSL.g:1225:4: rule__Atomic__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__Atomic__ValueAlternatives_3_1_0"
    // InternalKPIFormulaDSL.g:1233:1: rule__Atomic__ValueAlternatives_3_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1237:1: ( ( 'true' ) | ( 'false' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            else if ( (LA11_0==14) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalKPIFormulaDSL.g:1238:2: ( 'true' )
                    {
                    // InternalKPIFormulaDSL.g:1238:2: ( 'true' )
                    // InternalKPIFormulaDSL.g:1239:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getValueTrueKeyword_3_1_0_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getValueTrueKeyword_3_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:1244:2: ( 'false' )
                    {
                    // InternalKPIFormulaDSL.g:1244:2: ( 'false' )
                    // InternalKPIFormulaDSL.g:1245:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getValueFalseKeyword_3_1_0_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getValueFalseKeyword_3_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAlternatives_3_1_0"


    // $ANTLR start "rule__WindowUnit__Alternatives"
    // InternalKPIFormulaDSL.g:1254:1: rule__WindowUnit__Alternatives : ( ( ( 'seconds' ) ) | ( ( 'minutes' ) ) | ( ( 'hours' ) ) | ( ( 'days' ) ) | ( ( 'measurements' ) ) );
    public final void rule__WindowUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1258:1: ( ( ( 'seconds' ) ) | ( ( 'minutes' ) ) | ( ( 'hours' ) ) | ( ( 'days' ) ) | ( ( 'measurements' ) ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt12=1;
                }
                break;
            case 16:
                {
                alt12=2;
                }
                break;
            case 17:
                {
                alt12=3;
                }
                break;
            case 18:
                {
                alt12=4;
                }
                break;
            case 19:
                {
                alt12=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalKPIFormulaDSL.g:1259:2: ( ( 'seconds' ) )
                    {
                    // InternalKPIFormulaDSL.g:1259:2: ( ( 'seconds' ) )
                    // InternalKPIFormulaDSL.g:1260:3: ( 'seconds' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWindowUnitAccess().getSECEnumLiteralDeclaration_0()); 
                    }
                    // InternalKPIFormulaDSL.g:1261:3: ( 'seconds' )
                    // InternalKPIFormulaDSL.g:1261:4: 'seconds'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWindowUnitAccess().getSECEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:1265:2: ( ( 'minutes' ) )
                    {
                    // InternalKPIFormulaDSL.g:1265:2: ( ( 'minutes' ) )
                    // InternalKPIFormulaDSL.g:1266:3: ( 'minutes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWindowUnitAccess().getMINEnumLiteralDeclaration_1()); 
                    }
                    // InternalKPIFormulaDSL.g:1267:3: ( 'minutes' )
                    // InternalKPIFormulaDSL.g:1267:4: 'minutes'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWindowUnitAccess().getMINEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKPIFormulaDSL.g:1271:2: ( ( 'hours' ) )
                    {
                    // InternalKPIFormulaDSL.g:1271:2: ( ( 'hours' ) )
                    // InternalKPIFormulaDSL.g:1272:3: ( 'hours' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWindowUnitAccess().getHOUREnumLiteralDeclaration_2()); 
                    }
                    // InternalKPIFormulaDSL.g:1273:3: ( 'hours' )
                    // InternalKPIFormulaDSL.g:1273:4: 'hours'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWindowUnitAccess().getHOUREnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKPIFormulaDSL.g:1277:2: ( ( 'days' ) )
                    {
                    // InternalKPIFormulaDSL.g:1277:2: ( ( 'days' ) )
                    // InternalKPIFormulaDSL.g:1278:3: ( 'days' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWindowUnitAccess().getDAYEnumLiteralDeclaration_3()); 
                    }
                    // InternalKPIFormulaDSL.g:1279:3: ( 'days' )
                    // InternalKPIFormulaDSL.g:1279:4: 'days'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWindowUnitAccess().getDAYEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKPIFormulaDSL.g:1283:2: ( ( 'measurements' ) )
                    {
                    // InternalKPIFormulaDSL.g:1283:2: ( ( 'measurements' ) )
                    // InternalKPIFormulaDSL.g:1284:3: ( 'measurements' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWindowUnitAccess().getMEASUREMENTEnumLiteralDeclaration_4()); 
                    }
                    // InternalKPIFormulaDSL.g:1285:3: ( 'measurements' )
                    // InternalKPIFormulaDSL.g:1285:4: 'measurements'
                    {
                    match(input,19,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWindowUnitAccess().getMEASUREMENTEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WindowUnit__Alternatives"


    // $ANTLR start "rule__ValueUnit__Alternatives"
    // InternalKPIFormulaDSL.g:1293:1: rule__ValueUnit__Alternatives : ( ( ( 'milliseconds' ) ) | ( ( 'seconds' ) ) | ( ( 'minutes' ) ) | ( ( 'hours' ) ) | ( ( 'liters' ) ) | ( ( 'cubic meter' ) ) | ( ( 'Wh' ) ) | ( ( 'kWh' ) ) | ( ( 'gCO2eq' ) ) | ( ( 'kgCO2eq' ) ) );
    public final void rule__ValueUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1297:1: ( ( ( 'milliseconds' ) ) | ( ( 'seconds' ) ) | ( ( 'minutes' ) ) | ( ( 'hours' ) ) | ( ( 'liters' ) ) | ( ( 'cubic meter' ) ) | ( ( 'Wh' ) ) | ( ( 'kWh' ) ) | ( ( 'gCO2eq' ) ) | ( ( 'kgCO2eq' ) ) )
            int alt13=10;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt13=1;
                }
                break;
            case 15:
                {
                alt13=2;
                }
                break;
            case 16:
                {
                alt13=3;
                }
                break;
            case 17:
                {
                alt13=4;
                }
                break;
            case 21:
                {
                alt13=5;
                }
                break;
            case 22:
                {
                alt13=6;
                }
                break;
            case 23:
                {
                alt13=7;
                }
                break;
            case 24:
                {
                alt13=8;
                }
                break;
            case 25:
                {
                alt13=9;
                }
                break;
            case 26:
                {
                alt13=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalKPIFormulaDSL.g:1298:2: ( ( 'milliseconds' ) )
                    {
                    // InternalKPIFormulaDSL.g:1298:2: ( ( 'milliseconds' ) )
                    // InternalKPIFormulaDSL.g:1299:3: ( 'milliseconds' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getMILLIEnumLiteralDeclaration_0()); 
                    }
                    // InternalKPIFormulaDSL.g:1300:3: ( 'milliseconds' )
                    // InternalKPIFormulaDSL.g:1300:4: 'milliseconds'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueUnitAccess().getMILLIEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:1304:2: ( ( 'seconds' ) )
                    {
                    // InternalKPIFormulaDSL.g:1304:2: ( ( 'seconds' ) )
                    // InternalKPIFormulaDSL.g:1305:3: ( 'seconds' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getSECEnumLiteralDeclaration_1()); 
                    }
                    // InternalKPIFormulaDSL.g:1306:3: ( 'seconds' )
                    // InternalKPIFormulaDSL.g:1306:4: 'seconds'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueUnitAccess().getSECEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKPIFormulaDSL.g:1310:2: ( ( 'minutes' ) )
                    {
                    // InternalKPIFormulaDSL.g:1310:2: ( ( 'minutes' ) )
                    // InternalKPIFormulaDSL.g:1311:3: ( 'minutes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getMINEnumLiteralDeclaration_2()); 
                    }
                    // InternalKPIFormulaDSL.g:1312:3: ( 'minutes' )
                    // InternalKPIFormulaDSL.g:1312:4: 'minutes'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueUnitAccess().getMINEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKPIFormulaDSL.g:1316:2: ( ( 'hours' ) )
                    {
                    // InternalKPIFormulaDSL.g:1316:2: ( ( 'hours' ) )
                    // InternalKPIFormulaDSL.g:1317:3: ( 'hours' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getHOUREnumLiteralDeclaration_3()); 
                    }
                    // InternalKPIFormulaDSL.g:1318:3: ( 'hours' )
                    // InternalKPIFormulaDSL.g:1318:4: 'hours'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueUnitAccess().getHOUREnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKPIFormulaDSL.g:1322:2: ( ( 'liters' ) )
                    {
                    // InternalKPIFormulaDSL.g:1322:2: ( ( 'liters' ) )
                    // InternalKPIFormulaDSL.g:1323:3: ( 'liters' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getLITERSEnumLiteralDeclaration_4()); 
                    }
                    // InternalKPIFormulaDSL.g:1324:3: ( 'liters' )
                    // InternalKPIFormulaDSL.g:1324:4: 'liters'
                    {
                    match(input,21,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueUnitAccess().getLITERSEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKPIFormulaDSL.g:1328:2: ( ( 'cubic meter' ) )
                    {
                    // InternalKPIFormulaDSL.g:1328:2: ( ( 'cubic meter' ) )
                    // InternalKPIFormulaDSL.g:1329:3: ( 'cubic meter' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getM3EnumLiteralDeclaration_5()); 
                    }
                    // InternalKPIFormulaDSL.g:1330:3: ( 'cubic meter' )
                    // InternalKPIFormulaDSL.g:1330:4: 'cubic meter'
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueUnitAccess().getM3EnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKPIFormulaDSL.g:1334:2: ( ( 'Wh' ) )
                    {
                    // InternalKPIFormulaDSL.g:1334:2: ( ( 'Wh' ) )
                    // InternalKPIFormulaDSL.g:1335:3: ( 'Wh' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getWhEnumLiteralDeclaration_6()); 
                    }
                    // InternalKPIFormulaDSL.g:1336:3: ( 'Wh' )
                    // InternalKPIFormulaDSL.g:1336:4: 'Wh'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueUnitAccess().getWhEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalKPIFormulaDSL.g:1340:2: ( ( 'kWh' ) )
                    {
                    // InternalKPIFormulaDSL.g:1340:2: ( ( 'kWh' ) )
                    // InternalKPIFormulaDSL.g:1341:3: ( 'kWh' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getKWhEnumLiteralDeclaration_7()); 
                    }
                    // InternalKPIFormulaDSL.g:1342:3: ( 'kWh' )
                    // InternalKPIFormulaDSL.g:1342:4: 'kWh'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueUnitAccess().getKWhEnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalKPIFormulaDSL.g:1346:2: ( ( 'gCO2eq' ) )
                    {
                    // InternalKPIFormulaDSL.g:1346:2: ( ( 'gCO2eq' ) )
                    // InternalKPIFormulaDSL.g:1347:3: ( 'gCO2eq' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getGCO2eqEnumLiteralDeclaration_8()); 
                    }
                    // InternalKPIFormulaDSL.g:1348:3: ( 'gCO2eq' )
                    // InternalKPIFormulaDSL.g:1348:4: 'gCO2eq'
                    {
                    match(input,25,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueUnitAccess().getGCO2eqEnumLiteralDeclaration_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalKPIFormulaDSL.g:1352:2: ( ( 'kgCO2eq' ) )
                    {
                    // InternalKPIFormulaDSL.g:1352:2: ( ( 'kgCO2eq' ) )
                    // InternalKPIFormulaDSL.g:1353:3: ( 'kgCO2eq' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getKgCO2eqEnumLiteralDeclaration_9()); 
                    }
                    // InternalKPIFormulaDSL.g:1354:3: ( 'kgCO2eq' )
                    // InternalKPIFormulaDSL.g:1354:4: 'kgCO2eq'
                    {
                    match(input,26,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueUnitAccess().getKgCO2eqEnumLiteralDeclaration_9()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueUnit__Alternatives"


    // $ANTLR start "rule__KPIFormulaDSL__Group__0"
    // InternalKPIFormulaDSL.g:1362:1: rule__KPIFormulaDSL__Group__0 : rule__KPIFormulaDSL__Group__0__Impl rule__KPIFormulaDSL__Group__1 ;
    public final void rule__KPIFormulaDSL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1366:1: ( rule__KPIFormulaDSL__Group__0__Impl rule__KPIFormulaDSL__Group__1 )
            // InternalKPIFormulaDSL.g:1367:2: rule__KPIFormulaDSL__Group__0__Impl rule__KPIFormulaDSL__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__KPIFormulaDSL__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__KPIFormulaDSL__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KPIFormulaDSL__Group__0"


    // $ANTLR start "rule__KPIFormulaDSL__Group__0__Impl"
    // InternalKPIFormulaDSL.g:1374:1: rule__KPIFormulaDSL__Group__0__Impl : ( ( ( rule__KPIFormulaDSL__DeclarationsAssignment_0 ) ) ( ( rule__KPIFormulaDSL__DeclarationsAssignment_0 )* ) ) ;
    public final void rule__KPIFormulaDSL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1378:1: ( ( ( ( rule__KPIFormulaDSL__DeclarationsAssignment_0 ) ) ( ( rule__KPIFormulaDSL__DeclarationsAssignment_0 )* ) ) )
            // InternalKPIFormulaDSL.g:1379:1: ( ( ( rule__KPIFormulaDSL__DeclarationsAssignment_0 ) ) ( ( rule__KPIFormulaDSL__DeclarationsAssignment_0 )* ) )
            {
            // InternalKPIFormulaDSL.g:1379:1: ( ( ( rule__KPIFormulaDSL__DeclarationsAssignment_0 ) ) ( ( rule__KPIFormulaDSL__DeclarationsAssignment_0 )* ) )
            // InternalKPIFormulaDSL.g:1380:2: ( ( rule__KPIFormulaDSL__DeclarationsAssignment_0 ) ) ( ( rule__KPIFormulaDSL__DeclarationsAssignment_0 )* )
            {
            // InternalKPIFormulaDSL.g:1380:2: ( ( rule__KPIFormulaDSL__DeclarationsAssignment_0 ) )
            // InternalKPIFormulaDSL.g:1381:3: ( rule__KPIFormulaDSL__DeclarationsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKPIFormulaDSLAccess().getDeclarationsAssignment_0()); 
            }
            // InternalKPIFormulaDSL.g:1382:3: ( rule__KPIFormulaDSL__DeclarationsAssignment_0 )
            // InternalKPIFormulaDSL.g:1382:4: rule__KPIFormulaDSL__DeclarationsAssignment_0
            {
            pushFollow(FOLLOW_4);
            rule__KPIFormulaDSL__DeclarationsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKPIFormulaDSLAccess().getDeclarationsAssignment_0()); 
            }

            }

            // InternalKPIFormulaDSL.g:1385:2: ( ( rule__KPIFormulaDSL__DeclarationsAssignment_0 )* )
            // InternalKPIFormulaDSL.g:1386:3: ( rule__KPIFormulaDSL__DeclarationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKPIFormulaDSLAccess().getDeclarationsAssignment_0()); 
            }
            // InternalKPIFormulaDSL.g:1387:3: ( rule__KPIFormulaDSL__DeclarationsAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==28) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:1387:4: rule__KPIFormulaDSL__DeclarationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__KPIFormulaDSL__DeclarationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKPIFormulaDSLAccess().getDeclarationsAssignment_0()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KPIFormulaDSL__Group__0__Impl"


    // $ANTLR start "rule__KPIFormulaDSL__Group__1"
    // InternalKPIFormulaDSL.g:1396:1: rule__KPIFormulaDSL__Group__1 : rule__KPIFormulaDSL__Group__1__Impl ;
    public final void rule__KPIFormulaDSL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1400:1: ( rule__KPIFormulaDSL__Group__1__Impl )
            // InternalKPIFormulaDSL.g:1401:2: rule__KPIFormulaDSL__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KPIFormulaDSL__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KPIFormulaDSL__Group__1"


    // $ANTLR start "rule__KPIFormulaDSL__Group__1__Impl"
    // InternalKPIFormulaDSL.g:1407:1: rule__KPIFormulaDSL__Group__1__Impl : ( ( ( rule__KPIFormulaDSL__ComputationsAssignment_1 ) ) ( ( rule__KPIFormulaDSL__ComputationsAssignment_1 )* ) ) ;
    public final void rule__KPIFormulaDSL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1411:1: ( ( ( ( rule__KPIFormulaDSL__ComputationsAssignment_1 ) ) ( ( rule__KPIFormulaDSL__ComputationsAssignment_1 )* ) ) )
            // InternalKPIFormulaDSL.g:1412:1: ( ( ( rule__KPIFormulaDSL__ComputationsAssignment_1 ) ) ( ( rule__KPIFormulaDSL__ComputationsAssignment_1 )* ) )
            {
            // InternalKPIFormulaDSL.g:1412:1: ( ( ( rule__KPIFormulaDSL__ComputationsAssignment_1 ) ) ( ( rule__KPIFormulaDSL__ComputationsAssignment_1 )* ) )
            // InternalKPIFormulaDSL.g:1413:2: ( ( rule__KPIFormulaDSL__ComputationsAssignment_1 ) ) ( ( rule__KPIFormulaDSL__ComputationsAssignment_1 )* )
            {
            // InternalKPIFormulaDSL.g:1413:2: ( ( rule__KPIFormulaDSL__ComputationsAssignment_1 ) )
            // InternalKPIFormulaDSL.g:1414:3: ( rule__KPIFormulaDSL__ComputationsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKPIFormulaDSLAccess().getComputationsAssignment_1()); 
            }
            // InternalKPIFormulaDSL.g:1415:3: ( rule__KPIFormulaDSL__ComputationsAssignment_1 )
            // InternalKPIFormulaDSL.g:1415:4: rule__KPIFormulaDSL__ComputationsAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__KPIFormulaDSL__ComputationsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKPIFormulaDSLAccess().getComputationsAssignment_1()); 
            }

            }

            // InternalKPIFormulaDSL.g:1418:2: ( ( rule__KPIFormulaDSL__ComputationsAssignment_1 )* )
            // InternalKPIFormulaDSL.g:1419:3: ( rule__KPIFormulaDSL__ComputationsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKPIFormulaDSLAccess().getComputationsAssignment_1()); 
            }
            // InternalKPIFormulaDSL.g:1420:3: ( rule__KPIFormulaDSL__ComputationsAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:1420:4: rule__KPIFormulaDSL__ComputationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__KPIFormulaDSL__ComputationsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKPIFormulaDSLAccess().getComputationsAssignment_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KPIFormulaDSL__Group__1__Impl"


    // $ANTLR start "rule__Computation__Group__0"
    // InternalKPIFormulaDSL.g:1430:1: rule__Computation__Group__0 : rule__Computation__Group__0__Impl rule__Computation__Group__1 ;
    public final void rule__Computation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1434:1: ( rule__Computation__Group__0__Impl rule__Computation__Group__1 )
            // InternalKPIFormulaDSL.g:1435:2: rule__Computation__Group__0__Impl rule__Computation__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Computation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Computation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Computation__Group__0"


    // $ANTLR start "rule__Computation__Group__0__Impl"
    // InternalKPIFormulaDSL.g:1442:1: rule__Computation__Group__0__Impl : ( ( rule__Computation__ComputedAssignment_0 ) ) ;
    public final void rule__Computation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1446:1: ( ( ( rule__Computation__ComputedAssignment_0 ) ) )
            // InternalKPIFormulaDSL.g:1447:1: ( ( rule__Computation__ComputedAssignment_0 ) )
            {
            // InternalKPIFormulaDSL.g:1447:1: ( ( rule__Computation__ComputedAssignment_0 ) )
            // InternalKPIFormulaDSL.g:1448:2: ( rule__Computation__ComputedAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComputationAccess().getComputedAssignment_0()); 
            }
            // InternalKPIFormulaDSL.g:1449:2: ( rule__Computation__ComputedAssignment_0 )
            // InternalKPIFormulaDSL.g:1449:3: rule__Computation__ComputedAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Computation__ComputedAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComputationAccess().getComputedAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Computation__Group__0__Impl"


    // $ANTLR start "rule__Computation__Group__1"
    // InternalKPIFormulaDSL.g:1457:1: rule__Computation__Group__1 : rule__Computation__Group__1__Impl rule__Computation__Group__2 ;
    public final void rule__Computation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1461:1: ( rule__Computation__Group__1__Impl rule__Computation__Group__2 )
            // InternalKPIFormulaDSL.g:1462:2: rule__Computation__Group__1__Impl rule__Computation__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Computation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Computation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Computation__Group__1"


    // $ANTLR start "rule__Computation__Group__1__Impl"
    // InternalKPIFormulaDSL.g:1469:1: rule__Computation__Group__1__Impl : ( '=' ) ;
    public final void rule__Computation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1473:1: ( ( '=' ) )
            // InternalKPIFormulaDSL.g:1474:1: ( '=' )
            {
            // InternalKPIFormulaDSL.g:1474:1: ( '=' )
            // InternalKPIFormulaDSL.g:1475:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComputationAccess().getEqualsSignKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComputationAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Computation__Group__1__Impl"


    // $ANTLR start "rule__Computation__Group__2"
    // InternalKPIFormulaDSL.g:1484:1: rule__Computation__Group__2 : rule__Computation__Group__2__Impl ;
    public final void rule__Computation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1488:1: ( rule__Computation__Group__2__Impl )
            // InternalKPIFormulaDSL.g:1489:2: rule__Computation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Computation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Computation__Group__2"


    // $ANTLR start "rule__Computation__Group__2__Impl"
    // InternalKPIFormulaDSL.g:1495:1: rule__Computation__Group__2__Impl : ( ( rule__Computation__FormulaAssignment_2 ) ) ;
    public final void rule__Computation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1499:1: ( ( ( rule__Computation__FormulaAssignment_2 ) ) )
            // InternalKPIFormulaDSL.g:1500:1: ( ( rule__Computation__FormulaAssignment_2 ) )
            {
            // InternalKPIFormulaDSL.g:1500:1: ( ( rule__Computation__FormulaAssignment_2 ) )
            // InternalKPIFormulaDSL.g:1501:2: ( rule__Computation__FormulaAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComputationAccess().getFormulaAssignment_2()); 
            }
            // InternalKPIFormulaDSL.g:1502:2: ( rule__Computation__FormulaAssignment_2 )
            // InternalKPIFormulaDSL.g:1502:3: rule__Computation__FormulaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Computation__FormulaAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComputationAccess().getFormulaAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Computation__Group__2__Impl"


    // $ANTLR start "rule__Metric__Group__0"
    // InternalKPIFormulaDSL.g:1511:1: rule__Metric__Group__0 : rule__Metric__Group__0__Impl rule__Metric__Group__1 ;
    public final void rule__Metric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1515:1: ( rule__Metric__Group__0__Impl rule__Metric__Group__1 )
            // InternalKPIFormulaDSL.g:1516:2: rule__Metric__Group__0__Impl rule__Metric__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Metric__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Metric__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group__0"


    // $ANTLR start "rule__Metric__Group__0__Impl"
    // InternalKPIFormulaDSL.g:1523:1: rule__Metric__Group__0__Impl : ( ( rule__Metric__NameAssignment_0 ) ) ;
    public final void rule__Metric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1527:1: ( ( ( rule__Metric__NameAssignment_0 ) ) )
            // InternalKPIFormulaDSL.g:1528:1: ( ( rule__Metric__NameAssignment_0 ) )
            {
            // InternalKPIFormulaDSL.g:1528:1: ( ( rule__Metric__NameAssignment_0 ) )
            // InternalKPIFormulaDSL.g:1529:2: ( rule__Metric__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricAccess().getNameAssignment_0()); 
            }
            // InternalKPIFormulaDSL.g:1530:2: ( rule__Metric__NameAssignment_0 )
            // InternalKPIFormulaDSL.g:1530:3: rule__Metric__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Metric__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group__0__Impl"


    // $ANTLR start "rule__Metric__Group__1"
    // InternalKPIFormulaDSL.g:1538:1: rule__Metric__Group__1 : rule__Metric__Group__1__Impl rule__Metric__Group__2 ;
    public final void rule__Metric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1542:1: ( rule__Metric__Group__1__Impl rule__Metric__Group__2 )
            // InternalKPIFormulaDSL.g:1543:2: rule__Metric__Group__1__Impl rule__Metric__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Metric__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Metric__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group__1"


    // $ANTLR start "rule__Metric__Group__1__Impl"
    // InternalKPIFormulaDSL.g:1550:1: rule__Metric__Group__1__Impl : ( 'of' ) ;
    public final void rule__Metric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1554:1: ( ( 'of' ) )
            // InternalKPIFormulaDSL.g:1555:1: ( 'of' )
            {
            // InternalKPIFormulaDSL.g:1555:1: ( 'of' )
            // InternalKPIFormulaDSL.g:1556:2: 'of'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricAccess().getOfKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricAccess().getOfKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group__1__Impl"


    // $ANTLR start "rule__Metric__Group__2"
    // InternalKPIFormulaDSL.g:1565:1: rule__Metric__Group__2 : rule__Metric__Group__2__Impl rule__Metric__Group__3 ;
    public final void rule__Metric__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1569:1: ( rule__Metric__Group__2__Impl rule__Metric__Group__3 )
            // InternalKPIFormulaDSL.g:1570:2: rule__Metric__Group__2__Impl rule__Metric__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Metric__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Metric__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group__2"


    // $ANTLR start "rule__Metric__Group__2__Impl"
    // InternalKPIFormulaDSL.g:1577:1: rule__Metric__Group__2__Impl : ( 'type' ) ;
    public final void rule__Metric__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1581:1: ( ( 'type' ) )
            // InternalKPIFormulaDSL.g:1582:1: ( 'type' )
            {
            // InternalKPIFormulaDSL.g:1582:1: ( 'type' )
            // InternalKPIFormulaDSL.g:1583:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricAccess().getTypeKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricAccess().getTypeKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group__2__Impl"


    // $ANTLR start "rule__Metric__Group__3"
    // InternalKPIFormulaDSL.g:1592:1: rule__Metric__Group__3 : rule__Metric__Group__3__Impl ;
    public final void rule__Metric__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1596:1: ( rule__Metric__Group__3__Impl )
            // InternalKPIFormulaDSL.g:1597:2: rule__Metric__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Metric__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group__3"


    // $ANTLR start "rule__Metric__Group__3__Impl"
    // InternalKPIFormulaDSL.g:1603:1: rule__Metric__Group__3__Impl : ( ( rule__Metric__TypeAssignment_3 ) ) ;
    public final void rule__Metric__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1607:1: ( ( ( rule__Metric__TypeAssignment_3 ) ) )
            // InternalKPIFormulaDSL.g:1608:1: ( ( rule__Metric__TypeAssignment_3 ) )
            {
            // InternalKPIFormulaDSL.g:1608:1: ( ( rule__Metric__TypeAssignment_3 ) )
            // InternalKPIFormulaDSL.g:1609:2: ( rule__Metric__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricAccess().getTypeAssignment_3()); 
            }
            // InternalKPIFormulaDSL.g:1610:2: ( rule__Metric__TypeAssignment_3 )
            // InternalKPIFormulaDSL.g:1610:3: rule__Metric__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Metric__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricAccess().getTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group__3__Impl"


    // $ANTLR start "rule__KPI__Group__0"
    // InternalKPIFormulaDSL.g:1619:1: rule__KPI__Group__0 : rule__KPI__Group__0__Impl rule__KPI__Group__1 ;
    public final void rule__KPI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1623:1: ( rule__KPI__Group__0__Impl rule__KPI__Group__1 )
            // InternalKPIFormulaDSL.g:1624:2: rule__KPI__Group__0__Impl rule__KPI__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__KPI__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__KPI__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KPI__Group__0"


    // $ANTLR start "rule__KPI__Group__0__Impl"
    // InternalKPIFormulaDSL.g:1631:1: rule__KPI__Group__0__Impl : ( 'KPI' ) ;
    public final void rule__KPI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1635:1: ( ( 'KPI' ) )
            // InternalKPIFormulaDSL.g:1636:1: ( 'KPI' )
            {
            // InternalKPIFormulaDSL.g:1636:1: ( 'KPI' )
            // InternalKPIFormulaDSL.g:1637:2: 'KPI'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKPIAccess().getKPIKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKPIAccess().getKPIKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KPI__Group__0__Impl"


    // $ANTLR start "rule__KPI__Group__1"
    // InternalKPIFormulaDSL.g:1646:1: rule__KPI__Group__1 : rule__KPI__Group__1__Impl rule__KPI__Group__2 ;
    public final void rule__KPI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1650:1: ( rule__KPI__Group__1__Impl rule__KPI__Group__2 )
            // InternalKPIFormulaDSL.g:1651:2: rule__KPI__Group__1__Impl rule__KPI__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__KPI__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__KPI__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KPI__Group__1"


    // $ANTLR start "rule__KPI__Group__1__Impl"
    // InternalKPIFormulaDSL.g:1658:1: rule__KPI__Group__1__Impl : ( ( rule__KPI__NameAssignment_1 ) ) ;
    public final void rule__KPI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1662:1: ( ( ( rule__KPI__NameAssignment_1 ) ) )
            // InternalKPIFormulaDSL.g:1663:1: ( ( rule__KPI__NameAssignment_1 ) )
            {
            // InternalKPIFormulaDSL.g:1663:1: ( ( rule__KPI__NameAssignment_1 ) )
            // InternalKPIFormulaDSL.g:1664:2: ( rule__KPI__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKPIAccess().getNameAssignment_1()); 
            }
            // InternalKPIFormulaDSL.g:1665:2: ( rule__KPI__NameAssignment_1 )
            // InternalKPIFormulaDSL.g:1665:3: rule__KPI__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__KPI__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKPIAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KPI__Group__1__Impl"


    // $ANTLR start "rule__KPI__Group__2"
    // InternalKPIFormulaDSL.g:1673:1: rule__KPI__Group__2 : rule__KPI__Group__2__Impl rule__KPI__Group__3 ;
    public final void rule__KPI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1677:1: ( rule__KPI__Group__2__Impl rule__KPI__Group__3 )
            // InternalKPIFormulaDSL.g:1678:2: rule__KPI__Group__2__Impl rule__KPI__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__KPI__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__KPI__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KPI__Group__2"


    // $ANTLR start "rule__KPI__Group__2__Impl"
    // InternalKPIFormulaDSL.g:1685:1: rule__KPI__Group__2__Impl : ( 'of' ) ;
    public final void rule__KPI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1689:1: ( ( 'of' ) )
            // InternalKPIFormulaDSL.g:1690:1: ( 'of' )
            {
            // InternalKPIFormulaDSL.g:1690:1: ( 'of' )
            // InternalKPIFormulaDSL.g:1691:2: 'of'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKPIAccess().getOfKeyword_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKPIAccess().getOfKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KPI__Group__2__Impl"


    // $ANTLR start "rule__KPI__Group__3"
    // InternalKPIFormulaDSL.g:1700:1: rule__KPI__Group__3 : rule__KPI__Group__3__Impl rule__KPI__Group__4 ;
    public final void rule__KPI__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1704:1: ( rule__KPI__Group__3__Impl rule__KPI__Group__4 )
            // InternalKPIFormulaDSL.g:1705:2: rule__KPI__Group__3__Impl rule__KPI__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__KPI__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__KPI__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KPI__Group__3"


    // $ANTLR start "rule__KPI__Group__3__Impl"
    // InternalKPIFormulaDSL.g:1712:1: rule__KPI__Group__3__Impl : ( 'type' ) ;
    public final void rule__KPI__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1716:1: ( ( 'type' ) )
            // InternalKPIFormulaDSL.g:1717:1: ( 'type' )
            {
            // InternalKPIFormulaDSL.g:1717:1: ( 'type' )
            // InternalKPIFormulaDSL.g:1718:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKPIAccess().getTypeKeyword_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKPIAccess().getTypeKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KPI__Group__3__Impl"


    // $ANTLR start "rule__KPI__Group__4"
    // InternalKPIFormulaDSL.g:1727:1: rule__KPI__Group__4 : rule__KPI__Group__4__Impl ;
    public final void rule__KPI__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1731:1: ( rule__KPI__Group__4__Impl )
            // InternalKPIFormulaDSL.g:1732:2: rule__KPI__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KPI__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KPI__Group__4"


    // $ANTLR start "rule__KPI__Group__4__Impl"
    // InternalKPIFormulaDSL.g:1738:1: rule__KPI__Group__4__Impl : ( ( rule__KPI__TypeAssignment_4 ) ) ;
    public final void rule__KPI__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1742:1: ( ( ( rule__KPI__TypeAssignment_4 ) ) )
            // InternalKPIFormulaDSL.g:1743:1: ( ( rule__KPI__TypeAssignment_4 ) )
            {
            // InternalKPIFormulaDSL.g:1743:1: ( ( rule__KPI__TypeAssignment_4 ) )
            // InternalKPIFormulaDSL.g:1744:2: ( rule__KPI__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKPIAccess().getTypeAssignment_4()); 
            }
            // InternalKPIFormulaDSL.g:1745:2: ( rule__KPI__TypeAssignment_4 )
            // InternalKPIFormulaDSL.g:1745:3: rule__KPI__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__KPI__TypeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKPIAccess().getTypeAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KPI__Group__4__Impl"


    // $ANTLR start "rule__IntegerValue__Group__0"
    // InternalKPIFormulaDSL.g:1754:1: rule__IntegerValue__Group__0 : rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 ;
    public final void rule__IntegerValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1758:1: ( rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 )
            // InternalKPIFormulaDSL.g:1759:2: rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__IntegerValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IntegerValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__0"


    // $ANTLR start "rule__IntegerValue__Group__0__Impl"
    // InternalKPIFormulaDSL.g:1766:1: rule__IntegerValue__Group__0__Impl : ( () ) ;
    public final void rule__IntegerValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1770:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:1771:1: ( () )
            {
            // InternalKPIFormulaDSL.g:1771:1: ( () )
            // InternalKPIFormulaDSL.g:1772:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueAccess().getIntegerValueAction_0()); 
            }
            // InternalKPIFormulaDSL.g:1773:2: ()
            // InternalKPIFormulaDSL.g:1773:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueAccess().getIntegerValueAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__0__Impl"


    // $ANTLR start "rule__IntegerValue__Group__1"
    // InternalKPIFormulaDSL.g:1781:1: rule__IntegerValue__Group__1 : rule__IntegerValue__Group__1__Impl ;
    public final void rule__IntegerValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1785:1: ( rule__IntegerValue__Group__1__Impl )
            // InternalKPIFormulaDSL.g:1786:2: rule__IntegerValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__1"


    // $ANTLR start "rule__IntegerValue__Group__1__Impl"
    // InternalKPIFormulaDSL.g:1792:1: rule__IntegerValue__Group__1__Impl : ( 'int' ) ;
    public final void rule__IntegerValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1796:1: ( ( 'int' ) )
            // InternalKPIFormulaDSL.g:1797:1: ( 'int' )
            {
            // InternalKPIFormulaDSL.g:1797:1: ( 'int' )
            // InternalKPIFormulaDSL.g:1798:2: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueAccess().getIntKeyword_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueAccess().getIntKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValue__Group__1__Impl"


    // $ANTLR start "rule__RealValue__Group__0"
    // InternalKPIFormulaDSL.g:1808:1: rule__RealValue__Group__0 : rule__RealValue__Group__0__Impl rule__RealValue__Group__1 ;
    public final void rule__RealValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1812:1: ( rule__RealValue__Group__0__Impl rule__RealValue__Group__1 )
            // InternalKPIFormulaDSL.g:1813:2: rule__RealValue__Group__0__Impl rule__RealValue__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__RealValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RealValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group__0"


    // $ANTLR start "rule__RealValue__Group__0__Impl"
    // InternalKPIFormulaDSL.g:1820:1: rule__RealValue__Group__0__Impl : ( () ) ;
    public final void rule__RealValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1824:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:1825:1: ( () )
            {
            // InternalKPIFormulaDSL.g:1825:1: ( () )
            // InternalKPIFormulaDSL.g:1826:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealValueAccess().getRealValueAction_0()); 
            }
            // InternalKPIFormulaDSL.g:1827:2: ()
            // InternalKPIFormulaDSL.g:1827:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealValueAccess().getRealValueAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group__0__Impl"


    // $ANTLR start "rule__RealValue__Group__1"
    // InternalKPIFormulaDSL.g:1835:1: rule__RealValue__Group__1 : rule__RealValue__Group__1__Impl ;
    public final void rule__RealValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1839:1: ( rule__RealValue__Group__1__Impl )
            // InternalKPIFormulaDSL.g:1840:2: rule__RealValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RealValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group__1"


    // $ANTLR start "rule__RealValue__Group__1__Impl"
    // InternalKPIFormulaDSL.g:1846:1: rule__RealValue__Group__1__Impl : ( 'real' ) ;
    public final void rule__RealValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1850:1: ( ( 'real' ) )
            // InternalKPIFormulaDSL.g:1851:1: ( 'real' )
            {
            // InternalKPIFormulaDSL.g:1851:1: ( 'real' )
            // InternalKPIFormulaDSL.g:1852:2: 'real'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealValueAccess().getRealKeyword_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealValueAccess().getRealKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealValue__Group__1__Impl"


    // $ANTLR start "rule__TextualValue__Group__0"
    // InternalKPIFormulaDSL.g:1862:1: rule__TextualValue__Group__0 : rule__TextualValue__Group__0__Impl rule__TextualValue__Group__1 ;
    public final void rule__TextualValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1866:1: ( rule__TextualValue__Group__0__Impl rule__TextualValue__Group__1 )
            // InternalKPIFormulaDSL.g:1867:2: rule__TextualValue__Group__0__Impl rule__TextualValue__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__TextualValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TextualValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextualValue__Group__0"


    // $ANTLR start "rule__TextualValue__Group__0__Impl"
    // InternalKPIFormulaDSL.g:1874:1: rule__TextualValue__Group__0__Impl : ( () ) ;
    public final void rule__TextualValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1878:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:1879:1: ( () )
            {
            // InternalKPIFormulaDSL.g:1879:1: ( () )
            // InternalKPIFormulaDSL.g:1880:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextualValueAccess().getTextualValueAction_0()); 
            }
            // InternalKPIFormulaDSL.g:1881:2: ()
            // InternalKPIFormulaDSL.g:1881:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextualValueAccess().getTextualValueAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextualValue__Group__0__Impl"


    // $ANTLR start "rule__TextualValue__Group__1"
    // InternalKPIFormulaDSL.g:1889:1: rule__TextualValue__Group__1 : rule__TextualValue__Group__1__Impl ;
    public final void rule__TextualValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1893:1: ( rule__TextualValue__Group__1__Impl )
            // InternalKPIFormulaDSL.g:1894:2: rule__TextualValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextualValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextualValue__Group__1"


    // $ANTLR start "rule__TextualValue__Group__1__Impl"
    // InternalKPIFormulaDSL.g:1900:1: rule__TextualValue__Group__1__Impl : ( 'text' ) ;
    public final void rule__TextualValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1904:1: ( ( 'text' ) )
            // InternalKPIFormulaDSL.g:1905:1: ( 'text' )
            {
            // InternalKPIFormulaDSL.g:1905:1: ( 'text' )
            // InternalKPIFormulaDSL.g:1906:2: 'text'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextualValueAccess().getTextKeyword_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextualValueAccess().getTextKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextualValue__Group__1__Impl"


    // $ANTLR start "rule__BooleanValue__Group__0"
    // InternalKPIFormulaDSL.g:1916:1: rule__BooleanValue__Group__0 : rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 ;
    public final void rule__BooleanValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1920:1: ( rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 )
            // InternalKPIFormulaDSL.g:1921:2: rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__BooleanValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__0"


    // $ANTLR start "rule__BooleanValue__Group__0__Impl"
    // InternalKPIFormulaDSL.g:1928:1: rule__BooleanValue__Group__0__Impl : ( () ) ;
    public final void rule__BooleanValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1932:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:1933:1: ( () )
            {
            // InternalKPIFormulaDSL.g:1933:1: ( () )
            // InternalKPIFormulaDSL.g:1934:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getBooleanValueAction_0()); 
            }
            // InternalKPIFormulaDSL.g:1935:2: ()
            // InternalKPIFormulaDSL.g:1935:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getBooleanValueAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__0__Impl"


    // $ANTLR start "rule__BooleanValue__Group__1"
    // InternalKPIFormulaDSL.g:1943:1: rule__BooleanValue__Group__1 : rule__BooleanValue__Group__1__Impl ;
    public final void rule__BooleanValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1947:1: ( rule__BooleanValue__Group__1__Impl )
            // InternalKPIFormulaDSL.g:1948:2: rule__BooleanValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__1"


    // $ANTLR start "rule__BooleanValue__Group__1__Impl"
    // InternalKPIFormulaDSL.g:1954:1: rule__BooleanValue__Group__1__Impl : ( 'bool' ) ;
    public final void rule__BooleanValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1958:1: ( ( 'bool' ) )
            // InternalKPIFormulaDSL.g:1959:1: ( 'bool' )
            {
            // InternalKPIFormulaDSL.g:1959:1: ( 'bool' )
            // InternalKPIFormulaDSL.g:1960:2: 'bool'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getBoolKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getBoolKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__Group__1__Impl"


    // $ANTLR start "rule__EnumerationValue__Group__0"
    // InternalKPIFormulaDSL.g:1970:1: rule__EnumerationValue__Group__0 : rule__EnumerationValue__Group__0__Impl rule__EnumerationValue__Group__1 ;
    public final void rule__EnumerationValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1974:1: ( rule__EnumerationValue__Group__0__Impl rule__EnumerationValue__Group__1 )
            // InternalKPIFormulaDSL.g:1975:2: rule__EnumerationValue__Group__0__Impl rule__EnumerationValue__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EnumerationValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnumerationValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValue__Group__0"


    // $ANTLR start "rule__EnumerationValue__Group__0__Impl"
    // InternalKPIFormulaDSL.g:1982:1: rule__EnumerationValue__Group__0__Impl : ( '{' ) ;
    public final void rule__EnumerationValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1986:1: ( ( '{' ) )
            // InternalKPIFormulaDSL.g:1987:1: ( '{' )
            {
            // InternalKPIFormulaDSL.g:1987:1: ( '{' )
            // InternalKPIFormulaDSL.g:1988:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationValueAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationValueAccess().getLeftCurlyBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValue__Group__0__Impl"


    // $ANTLR start "rule__EnumerationValue__Group__1"
    // InternalKPIFormulaDSL.g:1997:1: rule__EnumerationValue__Group__1 : rule__EnumerationValue__Group__1__Impl rule__EnumerationValue__Group__2 ;
    public final void rule__EnumerationValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2001:1: ( rule__EnumerationValue__Group__1__Impl rule__EnumerationValue__Group__2 )
            // InternalKPIFormulaDSL.g:2002:2: rule__EnumerationValue__Group__1__Impl rule__EnumerationValue__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__EnumerationValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EnumerationValue__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValue__Group__1"


    // $ANTLR start "rule__EnumerationValue__Group__1__Impl"
    // InternalKPIFormulaDSL.g:2009:1: rule__EnumerationValue__Group__1__Impl : ( ( ( rule__EnumerationValue__LiteralsAssignment_1 ) ) ( ( rule__EnumerationValue__LiteralsAssignment_1 )* ) ) ;
    public final void rule__EnumerationValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2013:1: ( ( ( ( rule__EnumerationValue__LiteralsAssignment_1 ) ) ( ( rule__EnumerationValue__LiteralsAssignment_1 )* ) ) )
            // InternalKPIFormulaDSL.g:2014:1: ( ( ( rule__EnumerationValue__LiteralsAssignment_1 ) ) ( ( rule__EnumerationValue__LiteralsAssignment_1 )* ) )
            {
            // InternalKPIFormulaDSL.g:2014:1: ( ( ( rule__EnumerationValue__LiteralsAssignment_1 ) ) ( ( rule__EnumerationValue__LiteralsAssignment_1 )* ) )
            // InternalKPIFormulaDSL.g:2015:2: ( ( rule__EnumerationValue__LiteralsAssignment_1 ) ) ( ( rule__EnumerationValue__LiteralsAssignment_1 )* )
            {
            // InternalKPIFormulaDSL.g:2015:2: ( ( rule__EnumerationValue__LiteralsAssignment_1 ) )
            // InternalKPIFormulaDSL.g:2016:3: ( rule__EnumerationValue__LiteralsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationValueAccess().getLiteralsAssignment_1()); 
            }
            // InternalKPIFormulaDSL.g:2017:3: ( rule__EnumerationValue__LiteralsAssignment_1 )
            // InternalKPIFormulaDSL.g:2017:4: rule__EnumerationValue__LiteralsAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__EnumerationValue__LiteralsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationValueAccess().getLiteralsAssignment_1()); 
            }

            }

            // InternalKPIFormulaDSL.g:2020:2: ( ( rule__EnumerationValue__LiteralsAssignment_1 )* )
            // InternalKPIFormulaDSL.g:2021:3: ( rule__EnumerationValue__LiteralsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationValueAccess().getLiteralsAssignment_1()); 
            }
            // InternalKPIFormulaDSL.g:2022:3: ( rule__EnumerationValue__LiteralsAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:2022:4: rule__EnumerationValue__LiteralsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__EnumerationValue__LiteralsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationValueAccess().getLiteralsAssignment_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValue__Group__1__Impl"


    // $ANTLR start "rule__EnumerationValue__Group__2"
    // InternalKPIFormulaDSL.g:2031:1: rule__EnumerationValue__Group__2 : rule__EnumerationValue__Group__2__Impl ;
    public final void rule__EnumerationValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2035:1: ( rule__EnumerationValue__Group__2__Impl )
            // InternalKPIFormulaDSL.g:2036:2: rule__EnumerationValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationValue__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValue__Group__2"


    // $ANTLR start "rule__EnumerationValue__Group__2__Impl"
    // InternalKPIFormulaDSL.g:2042:1: rule__EnumerationValue__Group__2__Impl : ( '}' ) ;
    public final void rule__EnumerationValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2046:1: ( ( '}' ) )
            // InternalKPIFormulaDSL.g:2047:1: ( '}' )
            {
            // InternalKPIFormulaDSL.g:2047:1: ( '}' )
            // InternalKPIFormulaDSL.g:2048:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationValueAccess().getRightCurlyBracketKeyword_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationValueAccess().getRightCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValue__Group__2__Impl"


    // $ANTLR start "rule__AggregationValue__Group__0"
    // InternalKPIFormulaDSL.g:2058:1: rule__AggregationValue__Group__0 : rule__AggregationValue__Group__0__Impl rule__AggregationValue__Group__1 ;
    public final void rule__AggregationValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2062:1: ( rule__AggregationValue__Group__0__Impl rule__AggregationValue__Group__1 )
            // InternalKPIFormulaDSL.g:2063:2: rule__AggregationValue__Group__0__Impl rule__AggregationValue__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__AggregationValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AggregationValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationValue__Group__0"


    // $ANTLR start "rule__AggregationValue__Group__0__Impl"
    // InternalKPIFormulaDSL.g:2070:1: rule__AggregationValue__Group__0__Impl : ( 'aggregate' ) ;
    public final void rule__AggregationValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2074:1: ( ( 'aggregate' ) )
            // InternalKPIFormulaDSL.g:2075:1: ( 'aggregate' )
            {
            // InternalKPIFormulaDSL.g:2075:1: ( 'aggregate' )
            // InternalKPIFormulaDSL.g:2076:2: 'aggregate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregationValueAccess().getAggregateKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregationValueAccess().getAggregateKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationValue__Group__0__Impl"


    // $ANTLR start "rule__AggregationValue__Group__1"
    // InternalKPIFormulaDSL.g:2085:1: rule__AggregationValue__Group__1 : rule__AggregationValue__Group__1__Impl rule__AggregationValue__Group__2 ;
    public final void rule__AggregationValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2089:1: ( rule__AggregationValue__Group__1__Impl rule__AggregationValue__Group__2 )
            // InternalKPIFormulaDSL.g:2090:2: rule__AggregationValue__Group__1__Impl rule__AggregationValue__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__AggregationValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AggregationValue__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationValue__Group__1"


    // $ANTLR start "rule__AggregationValue__Group__1__Impl"
    // InternalKPIFormulaDSL.g:2097:1: rule__AggregationValue__Group__1__Impl : ( ( rule__AggregationValue__OperationAssignment_1 ) ) ;
    public final void rule__AggregationValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2101:1: ( ( ( rule__AggregationValue__OperationAssignment_1 ) ) )
            // InternalKPIFormulaDSL.g:2102:1: ( ( rule__AggregationValue__OperationAssignment_1 ) )
            {
            // InternalKPIFormulaDSL.g:2102:1: ( ( rule__AggregationValue__OperationAssignment_1 ) )
            // InternalKPIFormulaDSL.g:2103:2: ( rule__AggregationValue__OperationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregationValueAccess().getOperationAssignment_1()); 
            }
            // InternalKPIFormulaDSL.g:2104:2: ( rule__AggregationValue__OperationAssignment_1 )
            // InternalKPIFormulaDSL.g:2104:3: rule__AggregationValue__OperationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AggregationValue__OperationAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregationValueAccess().getOperationAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationValue__Group__1__Impl"


    // $ANTLR start "rule__AggregationValue__Group__2"
    // InternalKPIFormulaDSL.g:2112:1: rule__AggregationValue__Group__2 : rule__AggregationValue__Group__2__Impl rule__AggregationValue__Group__3 ;
    public final void rule__AggregationValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2116:1: ( rule__AggregationValue__Group__2__Impl rule__AggregationValue__Group__3 )
            // InternalKPIFormulaDSL.g:2117:2: rule__AggregationValue__Group__2__Impl rule__AggregationValue__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__AggregationValue__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AggregationValue__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationValue__Group__2"


    // $ANTLR start "rule__AggregationValue__Group__2__Impl"
    // InternalKPIFormulaDSL.g:2124:1: rule__AggregationValue__Group__2__Impl : ( 'for' ) ;
    public final void rule__AggregationValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2128:1: ( ( 'for' ) )
            // InternalKPIFormulaDSL.g:2129:1: ( 'for' )
            {
            // InternalKPIFormulaDSL.g:2129:1: ( 'for' )
            // InternalKPIFormulaDSL.g:2130:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregationValueAccess().getForKeyword_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregationValueAccess().getForKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationValue__Group__2__Impl"


    // $ANTLR start "rule__AggregationValue__Group__3"
    // InternalKPIFormulaDSL.g:2139:1: rule__AggregationValue__Group__3 : rule__AggregationValue__Group__3__Impl rule__AggregationValue__Group__4 ;
    public final void rule__AggregationValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2143:1: ( rule__AggregationValue__Group__3__Impl rule__AggregationValue__Group__4 )
            // InternalKPIFormulaDSL.g:2144:2: rule__AggregationValue__Group__3__Impl rule__AggregationValue__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__AggregationValue__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AggregationValue__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationValue__Group__3"


    // $ANTLR start "rule__AggregationValue__Group__3__Impl"
    // InternalKPIFormulaDSL.g:2151:1: rule__AggregationValue__Group__3__Impl : ( ( rule__AggregationValue__WindowAssignment_3 ) ) ;
    public final void rule__AggregationValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2155:1: ( ( ( rule__AggregationValue__WindowAssignment_3 ) ) )
            // InternalKPIFormulaDSL.g:2156:1: ( ( rule__AggregationValue__WindowAssignment_3 ) )
            {
            // InternalKPIFormulaDSL.g:2156:1: ( ( rule__AggregationValue__WindowAssignment_3 ) )
            // InternalKPIFormulaDSL.g:2157:2: ( rule__AggregationValue__WindowAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregationValueAccess().getWindowAssignment_3()); 
            }
            // InternalKPIFormulaDSL.g:2158:2: ( rule__AggregationValue__WindowAssignment_3 )
            // InternalKPIFormulaDSL.g:2158:3: rule__AggregationValue__WindowAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AggregationValue__WindowAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregationValueAccess().getWindowAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationValue__Group__3__Impl"


    // $ANTLR start "rule__AggregationValue__Group__4"
    // InternalKPIFormulaDSL.g:2166:1: rule__AggregationValue__Group__4 : rule__AggregationValue__Group__4__Impl ;
    public final void rule__AggregationValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2170:1: ( rule__AggregationValue__Group__4__Impl )
            // InternalKPIFormulaDSL.g:2171:2: rule__AggregationValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AggregationValue__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationValue__Group__4"


    // $ANTLR start "rule__AggregationValue__Group__4__Impl"
    // InternalKPIFormulaDSL.g:2177:1: rule__AggregationValue__Group__4__Impl : ( ( rule__AggregationValue__WindowUnitAssignment_4 ) ) ;
    public final void rule__AggregationValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2181:1: ( ( ( rule__AggregationValue__WindowUnitAssignment_4 ) ) )
            // InternalKPIFormulaDSL.g:2182:1: ( ( rule__AggregationValue__WindowUnitAssignment_4 ) )
            {
            // InternalKPIFormulaDSL.g:2182:1: ( ( rule__AggregationValue__WindowUnitAssignment_4 ) )
            // InternalKPIFormulaDSL.g:2183:2: ( rule__AggregationValue__WindowUnitAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregationValueAccess().getWindowUnitAssignment_4()); 
            }
            // InternalKPIFormulaDSL.g:2184:2: ( rule__AggregationValue__WindowUnitAssignment_4 )
            // InternalKPIFormulaDSL.g:2184:3: rule__AggregationValue__WindowUnitAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AggregationValue__WindowUnitAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregationValueAccess().getWindowUnitAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationValue__Group__4__Impl"


    // $ANTLR start "rule__DriftValue__Group__0"
    // InternalKPIFormulaDSL.g:2193:1: rule__DriftValue__Group__0 : rule__DriftValue__Group__0__Impl rule__DriftValue__Group__1 ;
    public final void rule__DriftValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2197:1: ( rule__DriftValue__Group__0__Impl rule__DriftValue__Group__1 )
            // InternalKPIFormulaDSL.g:2198:2: rule__DriftValue__Group__0__Impl rule__DriftValue__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__DriftValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DriftValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DriftValue__Group__0"


    // $ANTLR start "rule__DriftValue__Group__0__Impl"
    // InternalKPIFormulaDSL.g:2205:1: rule__DriftValue__Group__0__Impl : ( 'drift' ) ;
    public final void rule__DriftValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2209:1: ( ( 'drift' ) )
            // InternalKPIFormulaDSL.g:2210:1: ( 'drift' )
            {
            // InternalKPIFormulaDSL.g:2210:1: ( 'drift' )
            // InternalKPIFormulaDSL.g:2211:2: 'drift'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDriftValueAccess().getDriftKeyword_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDriftValueAccess().getDriftKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DriftValue__Group__0__Impl"


    // $ANTLR start "rule__DriftValue__Group__1"
    // InternalKPIFormulaDSL.g:2220:1: rule__DriftValue__Group__1 : rule__DriftValue__Group__1__Impl rule__DriftValue__Group__2 ;
    public final void rule__DriftValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2224:1: ( rule__DriftValue__Group__1__Impl rule__DriftValue__Group__2 )
            // InternalKPIFormulaDSL.g:2225:2: rule__DriftValue__Group__1__Impl rule__DriftValue__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__DriftValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DriftValue__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DriftValue__Group__1"


    // $ANTLR start "rule__DriftValue__Group__1__Impl"
    // InternalKPIFormulaDSL.g:2232:1: rule__DriftValue__Group__1__Impl : ( 'of' ) ;
    public final void rule__DriftValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2236:1: ( ( 'of' ) )
            // InternalKPIFormulaDSL.g:2237:1: ( 'of' )
            {
            // InternalKPIFormulaDSL.g:2237:1: ( 'of' )
            // InternalKPIFormulaDSL.g:2238:2: 'of'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDriftValueAccess().getOfKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDriftValueAccess().getOfKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DriftValue__Group__1__Impl"


    // $ANTLR start "rule__DriftValue__Group__2"
    // InternalKPIFormulaDSL.g:2247:1: rule__DriftValue__Group__2 : rule__DriftValue__Group__2__Impl rule__DriftValue__Group__3 ;
    public final void rule__DriftValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2251:1: ( rule__DriftValue__Group__2__Impl rule__DriftValue__Group__3 )
            // InternalKPIFormulaDSL.g:2252:2: rule__DriftValue__Group__2__Impl rule__DriftValue__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__DriftValue__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DriftValue__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DriftValue__Group__2"


    // $ANTLR start "rule__DriftValue__Group__2__Impl"
    // InternalKPIFormulaDSL.g:2259:1: rule__DriftValue__Group__2__Impl : ( ( rule__DriftValue__OperationAssignment_2 ) ) ;
    public final void rule__DriftValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2263:1: ( ( ( rule__DriftValue__OperationAssignment_2 ) ) )
            // InternalKPIFormulaDSL.g:2264:1: ( ( rule__DriftValue__OperationAssignment_2 ) )
            {
            // InternalKPIFormulaDSL.g:2264:1: ( ( rule__DriftValue__OperationAssignment_2 ) )
            // InternalKPIFormulaDSL.g:2265:2: ( rule__DriftValue__OperationAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDriftValueAccess().getOperationAssignment_2()); 
            }
            // InternalKPIFormulaDSL.g:2266:2: ( rule__DriftValue__OperationAssignment_2 )
            // InternalKPIFormulaDSL.g:2266:3: rule__DriftValue__OperationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DriftValue__OperationAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDriftValueAccess().getOperationAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DriftValue__Group__2__Impl"


    // $ANTLR start "rule__DriftValue__Group__3"
    // InternalKPIFormulaDSL.g:2274:1: rule__DriftValue__Group__3 : rule__DriftValue__Group__3__Impl rule__DriftValue__Group__4 ;
    public final void rule__DriftValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2278:1: ( rule__DriftValue__Group__3__Impl rule__DriftValue__Group__4 )
            // InternalKPIFormulaDSL.g:2279:2: rule__DriftValue__Group__3__Impl rule__DriftValue__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__DriftValue__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DriftValue__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DriftValue__Group__3"


    // $ANTLR start "rule__DriftValue__Group__3__Impl"
    // InternalKPIFormulaDSL.g:2286:1: rule__DriftValue__Group__3__Impl : ( 'for' ) ;
    public final void rule__DriftValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2290:1: ( ( 'for' ) )
            // InternalKPIFormulaDSL.g:2291:1: ( 'for' )
            {
            // InternalKPIFormulaDSL.g:2291:1: ( 'for' )
            // InternalKPIFormulaDSL.g:2292:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDriftValueAccess().getForKeyword_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDriftValueAccess().getForKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DriftValue__Group__3__Impl"


    // $ANTLR start "rule__DriftValue__Group__4"
    // InternalKPIFormulaDSL.g:2301:1: rule__DriftValue__Group__4 : rule__DriftValue__Group__4__Impl rule__DriftValue__Group__5 ;
    public final void rule__DriftValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2305:1: ( rule__DriftValue__Group__4__Impl rule__DriftValue__Group__5 )
            // InternalKPIFormulaDSL.g:2306:2: rule__DriftValue__Group__4__Impl rule__DriftValue__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__DriftValue__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DriftValue__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DriftValue__Group__4"


    // $ANTLR start "rule__DriftValue__Group__4__Impl"
    // InternalKPIFormulaDSL.g:2313:1: rule__DriftValue__Group__4__Impl : ( ( rule__DriftValue__WindowAssignment_4 ) ) ;
    public final void rule__DriftValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2317:1: ( ( ( rule__DriftValue__WindowAssignment_4 ) ) )
            // InternalKPIFormulaDSL.g:2318:1: ( ( rule__DriftValue__WindowAssignment_4 ) )
            {
            // InternalKPIFormulaDSL.g:2318:1: ( ( rule__DriftValue__WindowAssignment_4 ) )
            // InternalKPIFormulaDSL.g:2319:2: ( rule__DriftValue__WindowAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDriftValueAccess().getWindowAssignment_4()); 
            }
            // InternalKPIFormulaDSL.g:2320:2: ( rule__DriftValue__WindowAssignment_4 )
            // InternalKPIFormulaDSL.g:2320:3: rule__DriftValue__WindowAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DriftValue__WindowAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDriftValueAccess().getWindowAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DriftValue__Group__4__Impl"


    // $ANTLR start "rule__DriftValue__Group__5"
    // InternalKPIFormulaDSL.g:2328:1: rule__DriftValue__Group__5 : rule__DriftValue__Group__5__Impl ;
    public final void rule__DriftValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2332:1: ( rule__DriftValue__Group__5__Impl )
            // InternalKPIFormulaDSL.g:2333:2: rule__DriftValue__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DriftValue__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DriftValue__Group__5"


    // $ANTLR start "rule__DriftValue__Group__5__Impl"
    // InternalKPIFormulaDSL.g:2339:1: rule__DriftValue__Group__5__Impl : ( ( rule__DriftValue__WindowUnitAssignment_5 ) ) ;
    public final void rule__DriftValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2343:1: ( ( ( rule__DriftValue__WindowUnitAssignment_5 ) ) )
            // InternalKPIFormulaDSL.g:2344:1: ( ( rule__DriftValue__WindowUnitAssignment_5 ) )
            {
            // InternalKPIFormulaDSL.g:2344:1: ( ( rule__DriftValue__WindowUnitAssignment_5 ) )
            // InternalKPIFormulaDSL.g:2345:2: ( rule__DriftValue__WindowUnitAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDriftValueAccess().getWindowUnitAssignment_5()); 
            }
            // InternalKPIFormulaDSL.g:2346:2: ( rule__DriftValue__WindowUnitAssignment_5 )
            // InternalKPIFormulaDSL.g:2346:3: rule__DriftValue__WindowUnitAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DriftValue__WindowUnitAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDriftValueAccess().getWindowUnitAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DriftValue__Group__5__Impl"


    // $ANTLR start "rule__Minimum__Group__0"
    // InternalKPIFormulaDSL.g:2355:1: rule__Minimum__Group__0 : rule__Minimum__Group__0__Impl rule__Minimum__Group__1 ;
    public final void rule__Minimum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2359:1: ( rule__Minimum__Group__0__Impl rule__Minimum__Group__1 )
            // InternalKPIFormulaDSL.g:2360:2: rule__Minimum__Group__0__Impl rule__Minimum__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Minimum__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Minimum__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Minimum__Group__0"


    // $ANTLR start "rule__Minimum__Group__0__Impl"
    // InternalKPIFormulaDSL.g:2367:1: rule__Minimum__Group__0__Impl : ( () ) ;
    public final void rule__Minimum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2371:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:2372:1: ( () )
            {
            // InternalKPIFormulaDSL.g:2372:1: ( () )
            // InternalKPIFormulaDSL.g:2373:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinimumAccess().getMinimumAction_0()); 
            }
            // InternalKPIFormulaDSL.g:2374:2: ()
            // InternalKPIFormulaDSL.g:2374:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinimumAccess().getMinimumAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Minimum__Group__0__Impl"


    // $ANTLR start "rule__Minimum__Group__1"
    // InternalKPIFormulaDSL.g:2382:1: rule__Minimum__Group__1 : rule__Minimum__Group__1__Impl ;
    public final void rule__Minimum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2386:1: ( rule__Minimum__Group__1__Impl )
            // InternalKPIFormulaDSL.g:2387:2: rule__Minimum__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Minimum__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Minimum__Group__1"


    // $ANTLR start "rule__Minimum__Group__1__Impl"
    // InternalKPIFormulaDSL.g:2393:1: rule__Minimum__Group__1__Impl : ( 'Minimum' ) ;
    public final void rule__Minimum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2397:1: ( ( 'Minimum' ) )
            // InternalKPIFormulaDSL.g:2398:1: ( 'Minimum' )
            {
            // InternalKPIFormulaDSL.g:2398:1: ( 'Minimum' )
            // InternalKPIFormulaDSL.g:2399:2: 'Minimum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinimumAccess().getMinimumKeyword_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinimumAccess().getMinimumKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Minimum__Group__1__Impl"


    // $ANTLR start "rule__Maximum__Group__0"
    // InternalKPIFormulaDSL.g:2409:1: rule__Maximum__Group__0 : rule__Maximum__Group__0__Impl rule__Maximum__Group__1 ;
    public final void rule__Maximum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2413:1: ( rule__Maximum__Group__0__Impl rule__Maximum__Group__1 )
            // InternalKPIFormulaDSL.g:2414:2: rule__Maximum__Group__0__Impl rule__Maximum__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Maximum__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Maximum__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maximum__Group__0"


    // $ANTLR start "rule__Maximum__Group__0__Impl"
    // InternalKPIFormulaDSL.g:2421:1: rule__Maximum__Group__0__Impl : ( () ) ;
    public final void rule__Maximum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2425:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:2426:1: ( () )
            {
            // InternalKPIFormulaDSL.g:2426:1: ( () )
            // InternalKPIFormulaDSL.g:2427:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaximumAccess().getMaximumAction_0()); 
            }
            // InternalKPIFormulaDSL.g:2428:2: ()
            // InternalKPIFormulaDSL.g:2428:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMaximumAccess().getMaximumAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maximum__Group__0__Impl"


    // $ANTLR start "rule__Maximum__Group__1"
    // InternalKPIFormulaDSL.g:2436:1: rule__Maximum__Group__1 : rule__Maximum__Group__1__Impl ;
    public final void rule__Maximum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2440:1: ( rule__Maximum__Group__1__Impl )
            // InternalKPIFormulaDSL.g:2441:2: rule__Maximum__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Maximum__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maximum__Group__1"


    // $ANTLR start "rule__Maximum__Group__1__Impl"
    // InternalKPIFormulaDSL.g:2447:1: rule__Maximum__Group__1__Impl : ( 'Maximum' ) ;
    public final void rule__Maximum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2451:1: ( ( 'Maximum' ) )
            // InternalKPIFormulaDSL.g:2452:1: ( 'Maximum' )
            {
            // InternalKPIFormulaDSL.g:2452:1: ( 'Maximum' )
            // InternalKPIFormulaDSL.g:2453:2: 'Maximum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaximumAccess().getMaximumKeyword_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMaximumAccess().getMaximumKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maximum__Group__1__Impl"


    // $ANTLR start "rule__Average__Group__0"
    // InternalKPIFormulaDSL.g:2463:1: rule__Average__Group__0 : rule__Average__Group__0__Impl rule__Average__Group__1 ;
    public final void rule__Average__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2467:1: ( rule__Average__Group__0__Impl rule__Average__Group__1 )
            // InternalKPIFormulaDSL.g:2468:2: rule__Average__Group__0__Impl rule__Average__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Average__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Average__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Average__Group__0"


    // $ANTLR start "rule__Average__Group__0__Impl"
    // InternalKPIFormulaDSL.g:2475:1: rule__Average__Group__0__Impl : ( () ) ;
    public final void rule__Average__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2479:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:2480:1: ( () )
            {
            // InternalKPIFormulaDSL.g:2480:1: ( () )
            // InternalKPIFormulaDSL.g:2481:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAverageAccess().getAverageAction_0()); 
            }
            // InternalKPIFormulaDSL.g:2482:2: ()
            // InternalKPIFormulaDSL.g:2482:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAverageAccess().getAverageAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Average__Group__0__Impl"


    // $ANTLR start "rule__Average__Group__1"
    // InternalKPIFormulaDSL.g:2490:1: rule__Average__Group__1 : rule__Average__Group__1__Impl ;
    public final void rule__Average__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2494:1: ( rule__Average__Group__1__Impl )
            // InternalKPIFormulaDSL.g:2495:2: rule__Average__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Average__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Average__Group__1"


    // $ANTLR start "rule__Average__Group__1__Impl"
    // InternalKPIFormulaDSL.g:2501:1: rule__Average__Group__1__Impl : ( 'Average' ) ;
    public final void rule__Average__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2505:1: ( ( 'Average' ) )
            // InternalKPIFormulaDSL.g:2506:1: ( 'Average' )
            {
            // InternalKPIFormulaDSL.g:2506:1: ( 'Average' )
            // InternalKPIFormulaDSL.g:2507:2: 'Average'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAverageAccess().getAverageKeyword_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAverageAccess().getAverageKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Average__Group__1__Impl"


    // $ANTLR start "rule__Median__Group__0"
    // InternalKPIFormulaDSL.g:2517:1: rule__Median__Group__0 : rule__Median__Group__0__Impl rule__Median__Group__1 ;
    public final void rule__Median__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2521:1: ( rule__Median__Group__0__Impl rule__Median__Group__1 )
            // InternalKPIFormulaDSL.g:2522:2: rule__Median__Group__0__Impl rule__Median__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Median__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Median__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Median__Group__0"


    // $ANTLR start "rule__Median__Group__0__Impl"
    // InternalKPIFormulaDSL.g:2529:1: rule__Median__Group__0__Impl : ( () ) ;
    public final void rule__Median__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2533:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:2534:1: ( () )
            {
            // InternalKPIFormulaDSL.g:2534:1: ( () )
            // InternalKPIFormulaDSL.g:2535:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMedianAccess().getMedianAction_0()); 
            }
            // InternalKPIFormulaDSL.g:2536:2: ()
            // InternalKPIFormulaDSL.g:2536:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMedianAccess().getMedianAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Median__Group__0__Impl"


    // $ANTLR start "rule__Median__Group__1"
    // InternalKPIFormulaDSL.g:2544:1: rule__Median__Group__1 : rule__Median__Group__1__Impl ;
    public final void rule__Median__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2548:1: ( rule__Median__Group__1__Impl )
            // InternalKPIFormulaDSL.g:2549:2: rule__Median__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Median__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Median__Group__1"


    // $ANTLR start "rule__Median__Group__1__Impl"
    // InternalKPIFormulaDSL.g:2555:1: rule__Median__Group__1__Impl : ( 'Median' ) ;
    public final void rule__Median__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2559:1: ( ( 'Median' ) )
            // InternalKPIFormulaDSL.g:2560:1: ( 'Median' )
            {
            // InternalKPIFormulaDSL.g:2560:1: ( 'Median' )
            // InternalKPIFormulaDSL.g:2561:2: 'Median'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMedianAccess().getMedianKeyword_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMedianAccess().getMedianKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Median__Group__1__Impl"


    // $ANTLR start "rule__StandardDeviation__Group__0"
    // InternalKPIFormulaDSL.g:2571:1: rule__StandardDeviation__Group__0 : rule__StandardDeviation__Group__0__Impl rule__StandardDeviation__Group__1 ;
    public final void rule__StandardDeviation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2575:1: ( rule__StandardDeviation__Group__0__Impl rule__StandardDeviation__Group__1 )
            // InternalKPIFormulaDSL.g:2576:2: rule__StandardDeviation__Group__0__Impl rule__StandardDeviation__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__StandardDeviation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StandardDeviation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardDeviation__Group__0"


    // $ANTLR start "rule__StandardDeviation__Group__0__Impl"
    // InternalKPIFormulaDSL.g:2583:1: rule__StandardDeviation__Group__0__Impl : ( () ) ;
    public final void rule__StandardDeviation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2587:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:2588:1: ( () )
            {
            // InternalKPIFormulaDSL.g:2588:1: ( () )
            // InternalKPIFormulaDSL.g:2589:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStandardDeviationAccess().getStandardDeviationAction_0()); 
            }
            // InternalKPIFormulaDSL.g:2590:2: ()
            // InternalKPIFormulaDSL.g:2590:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStandardDeviationAccess().getStandardDeviationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardDeviation__Group__0__Impl"


    // $ANTLR start "rule__StandardDeviation__Group__1"
    // InternalKPIFormulaDSL.g:2598:1: rule__StandardDeviation__Group__1 : rule__StandardDeviation__Group__1__Impl rule__StandardDeviation__Group__2 ;
    public final void rule__StandardDeviation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2602:1: ( rule__StandardDeviation__Group__1__Impl rule__StandardDeviation__Group__2 )
            // InternalKPIFormulaDSL.g:2603:2: rule__StandardDeviation__Group__1__Impl rule__StandardDeviation__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__StandardDeviation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StandardDeviation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardDeviation__Group__1"


    // $ANTLR start "rule__StandardDeviation__Group__1__Impl"
    // InternalKPIFormulaDSL.g:2610:1: rule__StandardDeviation__Group__1__Impl : ( 'Standard' ) ;
    public final void rule__StandardDeviation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2614:1: ( ( 'Standard' ) )
            // InternalKPIFormulaDSL.g:2615:1: ( 'Standard' )
            {
            // InternalKPIFormulaDSL.g:2615:1: ( 'Standard' )
            // InternalKPIFormulaDSL.g:2616:2: 'Standard'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStandardDeviationAccess().getStandardKeyword_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStandardDeviationAccess().getStandardKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardDeviation__Group__1__Impl"


    // $ANTLR start "rule__StandardDeviation__Group__2"
    // InternalKPIFormulaDSL.g:2625:1: rule__StandardDeviation__Group__2 : rule__StandardDeviation__Group__2__Impl ;
    public final void rule__StandardDeviation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2629:1: ( rule__StandardDeviation__Group__2__Impl )
            // InternalKPIFormulaDSL.g:2630:2: rule__StandardDeviation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StandardDeviation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardDeviation__Group__2"


    // $ANTLR start "rule__StandardDeviation__Group__2__Impl"
    // InternalKPIFormulaDSL.g:2636:1: rule__StandardDeviation__Group__2__Impl : ( 'deviation' ) ;
    public final void rule__StandardDeviation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2640:1: ( ( 'deviation' ) )
            // InternalKPIFormulaDSL.g:2641:1: ( 'deviation' )
            {
            // InternalKPIFormulaDSL.g:2641:1: ( 'deviation' )
            // InternalKPIFormulaDSL.g:2642:2: 'deviation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStandardDeviationAccess().getDeviationKeyword_2()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStandardDeviationAccess().getDeviationKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardDeviation__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalKPIFormulaDSL.g:2652:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2656:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalKPIFormulaDSL.g:2657:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Condition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalKPIFormulaDSL.g:2664:1: rule__Condition__Group__0__Impl : ( '{' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2668:1: ( ( '{' ) )
            // InternalKPIFormulaDSL.g:2669:1: ( '{' )
            {
            // InternalKPIFormulaDSL.g:2669:1: ( '{' )
            // InternalKPIFormulaDSL.g:2670:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalKPIFormulaDSL.g:2679:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2683:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalKPIFormulaDSL.g:2684:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Condition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalKPIFormulaDSL.g:2691:1: rule__Condition__Group__1__Impl : ( ( ( rule__Condition__Group_1__0 ) ) ( ( rule__Condition__Group_1__0 )* ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2695:1: ( ( ( ( rule__Condition__Group_1__0 ) ) ( ( rule__Condition__Group_1__0 )* ) ) )
            // InternalKPIFormulaDSL.g:2696:1: ( ( ( rule__Condition__Group_1__0 ) ) ( ( rule__Condition__Group_1__0 )* ) )
            {
            // InternalKPIFormulaDSL.g:2696:1: ( ( ( rule__Condition__Group_1__0 ) ) ( ( rule__Condition__Group_1__0 )* ) )
            // InternalKPIFormulaDSL.g:2697:2: ( ( rule__Condition__Group_1__0 ) ) ( ( rule__Condition__Group_1__0 )* )
            {
            // InternalKPIFormulaDSL.g:2697:2: ( ( rule__Condition__Group_1__0 ) )
            // InternalKPIFormulaDSL.g:2698:3: ( rule__Condition__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup_1()); 
            }
            // InternalKPIFormulaDSL.g:2699:3: ( rule__Condition__Group_1__0 )
            // InternalKPIFormulaDSL.g:2699:4: rule__Condition__Group_1__0
            {
            pushFollow(FOLLOW_27);
            rule__Condition__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getGroup_1()); 
            }

            }

            // InternalKPIFormulaDSL.g:2702:2: ( ( rule__Condition__Group_1__0 )* )
            // InternalKPIFormulaDSL.g:2703:3: ( rule__Condition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup_1()); 
            }
            // InternalKPIFormulaDSL.g:2704:3: ( rule__Condition__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_FQN)||(LA17_0>=13 && LA17_0<=14)||LA17_0==58||LA17_0==61||(LA17_0>=63 && LA17_0<=64)||LA17_0==66||(LA17_0>=68 && LA17_0<=70)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:2704:4: rule__Condition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Condition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getGroup_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalKPIFormulaDSL.g:2713:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2717:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalKPIFormulaDSL.g:2718:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Condition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalKPIFormulaDSL.g:2725:1: rule__Condition__Group__2__Impl : ( ( 'otherwise' ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2729:1: ( ( ( 'otherwise' ) ) )
            // InternalKPIFormulaDSL.g:2730:1: ( ( 'otherwise' ) )
            {
            // InternalKPIFormulaDSL.g:2730:1: ( ( 'otherwise' ) )
            // InternalKPIFormulaDSL.g:2731:2: ( 'otherwise' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getOtherwiseKeyword_2()); 
            }
            // InternalKPIFormulaDSL.g:2732:2: ( 'otherwise' )
            // InternalKPIFormulaDSL.g:2732:3: 'otherwise'
            {
            match(input,46,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getOtherwiseKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__3"
    // InternalKPIFormulaDSL.g:2740:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl rule__Condition__Group__4 ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2744:1: ( rule__Condition__Group__3__Impl rule__Condition__Group__4 )
            // InternalKPIFormulaDSL.g:2745:2: rule__Condition__Group__3__Impl rule__Condition__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Condition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // InternalKPIFormulaDSL.g:2752:1: rule__Condition__Group__3__Impl : ( '->' ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2756:1: ( ( '->' ) )
            // InternalKPIFormulaDSL.g:2757:1: ( '->' )
            {
            // InternalKPIFormulaDSL.g:2757:1: ( '->' )
            // InternalKPIFormulaDSL.g:2758:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group__4"
    // InternalKPIFormulaDSL.g:2767:1: rule__Condition__Group__4 : rule__Condition__Group__4__Impl rule__Condition__Group__5 ;
    public final void rule__Condition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2771:1: ( rule__Condition__Group__4__Impl rule__Condition__Group__5 )
            // InternalKPIFormulaDSL.g:2772:2: rule__Condition__Group__4__Impl rule__Condition__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Condition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__4"


    // $ANTLR start "rule__Condition__Group__4__Impl"
    // InternalKPIFormulaDSL.g:2779:1: rule__Condition__Group__4__Impl : ( ( rule__Condition__ResultsAssignment_4 ) ) ;
    public final void rule__Condition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2783:1: ( ( ( rule__Condition__ResultsAssignment_4 ) ) )
            // InternalKPIFormulaDSL.g:2784:1: ( ( rule__Condition__ResultsAssignment_4 ) )
            {
            // InternalKPIFormulaDSL.g:2784:1: ( ( rule__Condition__ResultsAssignment_4 ) )
            // InternalKPIFormulaDSL.g:2785:2: ( rule__Condition__ResultsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getResultsAssignment_4()); 
            }
            // InternalKPIFormulaDSL.g:2786:2: ( rule__Condition__ResultsAssignment_4 )
            // InternalKPIFormulaDSL.g:2786:3: rule__Condition__ResultsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ResultsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getResultsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__4__Impl"


    // $ANTLR start "rule__Condition__Group__5"
    // InternalKPIFormulaDSL.g:2794:1: rule__Condition__Group__5 : rule__Condition__Group__5__Impl ;
    public final void rule__Condition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2798:1: ( rule__Condition__Group__5__Impl )
            // InternalKPIFormulaDSL.g:2799:2: rule__Condition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__5"


    // $ANTLR start "rule__Condition__Group__5__Impl"
    // InternalKPIFormulaDSL.g:2805:1: rule__Condition__Group__5__Impl : ( '}' ) ;
    public final void rule__Condition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2809:1: ( ( '}' ) )
            // InternalKPIFormulaDSL.g:2810:1: ( '}' )
            {
            // InternalKPIFormulaDSL.g:2810:1: ( '}' )
            // InternalKPIFormulaDSL.g:2811:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__5__Impl"


    // $ANTLR start "rule__Condition__Group_1__0"
    // InternalKPIFormulaDSL.g:2821:1: rule__Condition__Group_1__0 : rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 ;
    public final void rule__Condition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2825:1: ( rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 )
            // InternalKPIFormulaDSL.g:2826:2: rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Condition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__0"


    // $ANTLR start "rule__Condition__Group_1__0__Impl"
    // InternalKPIFormulaDSL.g:2833:1: rule__Condition__Group_1__0__Impl : ( ( rule__Condition__ConditionsAssignment_1_0 ) ) ;
    public final void rule__Condition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2837:1: ( ( ( rule__Condition__ConditionsAssignment_1_0 ) ) )
            // InternalKPIFormulaDSL.g:2838:1: ( ( rule__Condition__ConditionsAssignment_1_0 ) )
            {
            // InternalKPIFormulaDSL.g:2838:1: ( ( rule__Condition__ConditionsAssignment_1_0 ) )
            // InternalKPIFormulaDSL.g:2839:2: ( rule__Condition__ConditionsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getConditionsAssignment_1_0()); 
            }
            // InternalKPIFormulaDSL.g:2840:2: ( rule__Condition__ConditionsAssignment_1_0 )
            // InternalKPIFormulaDSL.g:2840:3: rule__Condition__ConditionsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ConditionsAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getConditionsAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__0__Impl"


    // $ANTLR start "rule__Condition__Group_1__1"
    // InternalKPIFormulaDSL.g:2848:1: rule__Condition__Group_1__1 : rule__Condition__Group_1__1__Impl rule__Condition__Group_1__2 ;
    public final void rule__Condition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2852:1: ( rule__Condition__Group_1__1__Impl rule__Condition__Group_1__2 )
            // InternalKPIFormulaDSL.g:2853:2: rule__Condition__Group_1__1__Impl rule__Condition__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__Condition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__1"


    // $ANTLR start "rule__Condition__Group_1__1__Impl"
    // InternalKPIFormulaDSL.g:2860:1: rule__Condition__Group_1__1__Impl : ( '->' ) ;
    public final void rule__Condition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2864:1: ( ( '->' ) )
            // InternalKPIFormulaDSL.g:2865:1: ( '->' )
            {
            // InternalKPIFormulaDSL.g:2865:1: ( '->' )
            // InternalKPIFormulaDSL.g:2866:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getHyphenMinusGreaterThanSignKeyword_1_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getHyphenMinusGreaterThanSignKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__1__Impl"


    // $ANTLR start "rule__Condition__Group_1__2"
    // InternalKPIFormulaDSL.g:2875:1: rule__Condition__Group_1__2 : rule__Condition__Group_1__2__Impl rule__Condition__Group_1__3 ;
    public final void rule__Condition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2879:1: ( rule__Condition__Group_1__2__Impl rule__Condition__Group_1__3 )
            // InternalKPIFormulaDSL.g:2880:2: rule__Condition__Group_1__2__Impl rule__Condition__Group_1__3
            {
            pushFollow(FOLLOW_29);
            rule__Condition__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__2"


    // $ANTLR start "rule__Condition__Group_1__2__Impl"
    // InternalKPIFormulaDSL.g:2887:1: rule__Condition__Group_1__2__Impl : ( ( rule__Condition__ResultsAssignment_1_2 ) ) ;
    public final void rule__Condition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2891:1: ( ( ( rule__Condition__ResultsAssignment_1_2 ) ) )
            // InternalKPIFormulaDSL.g:2892:1: ( ( rule__Condition__ResultsAssignment_1_2 ) )
            {
            // InternalKPIFormulaDSL.g:2892:1: ( ( rule__Condition__ResultsAssignment_1_2 ) )
            // InternalKPIFormulaDSL.g:2893:2: ( rule__Condition__ResultsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getResultsAssignment_1_2()); 
            }
            // InternalKPIFormulaDSL.g:2894:2: ( rule__Condition__ResultsAssignment_1_2 )
            // InternalKPIFormulaDSL.g:2894:3: rule__Condition__ResultsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ResultsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getResultsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__2__Impl"


    // $ANTLR start "rule__Condition__Group_1__3"
    // InternalKPIFormulaDSL.g:2902:1: rule__Condition__Group_1__3 : rule__Condition__Group_1__3__Impl ;
    public final void rule__Condition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2906:1: ( rule__Condition__Group_1__3__Impl )
            // InternalKPIFormulaDSL.g:2907:2: rule__Condition__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__3"


    // $ANTLR start "rule__Condition__Group_1__3__Impl"
    // InternalKPIFormulaDSL.g:2913:1: rule__Condition__Group_1__3__Impl : ( ';' ) ;
    public final void rule__Condition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2917:1: ( ( ';' ) )
            // InternalKPIFormulaDSL.g:2918:1: ( ';' )
            {
            // InternalKPIFormulaDSL.g:2918:1: ( ';' )
            // InternalKPIFormulaDSL.g:2919:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getSemicolonKeyword_1_3()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getSemicolonKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__3__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalKPIFormulaDSL.g:2929:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2933:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalKPIFormulaDSL.g:2934:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Or__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalKPIFormulaDSL.g:2941:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2945:1: ( ( ruleAnd ) )
            // InternalKPIFormulaDSL.g:2946:1: ( ruleAnd )
            {
            // InternalKPIFormulaDSL.g:2946:1: ( ruleAnd )
            // InternalKPIFormulaDSL.g:2947:2: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalKPIFormulaDSL.g:2956:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2960:1: ( rule__Or__Group__1__Impl )
            // InternalKPIFormulaDSL.g:2961:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalKPIFormulaDSL.g:2967:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2971:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalKPIFormulaDSL.g:2972:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalKPIFormulaDSL.g:2972:1: ( ( rule__Or__Group_1__0 )* )
            // InternalKPIFormulaDSL.g:2973:2: ( rule__Or__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1()); 
            }
            // InternalKPIFormulaDSL.g:2974:2: ( rule__Or__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==49) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:2974:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Or__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalKPIFormulaDSL.g:2983:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2987:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalKPIFormulaDSL.g:2988:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Or__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalKPIFormulaDSL.g:2995:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2999:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3000:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3000:1: ( () )
            // InternalKPIFormulaDSL.g:3001:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            }
            // InternalKPIFormulaDSL.g:3002:2: ()
            // InternalKPIFormulaDSL.g:3002:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalKPIFormulaDSL.g:3010:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3014:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalKPIFormulaDSL.g:3015:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__Or__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalKPIFormulaDSL.g:3022:1: rule__Or__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3026:1: ( ( 'or' ) )
            // InternalKPIFormulaDSL.g:3027:1: ( 'or' )
            {
            // InternalKPIFormulaDSL.g:3027:1: ( 'or' )
            // InternalKPIFormulaDSL.g:3028:2: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrKeyword_1_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getOrKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalKPIFormulaDSL.g:3037:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3041:1: ( rule__Or__Group_1__2__Impl )
            // InternalKPIFormulaDSL.g:3042:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalKPIFormulaDSL.g:3048:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3052:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalKPIFormulaDSL.g:3053:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalKPIFormulaDSL.g:3053:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalKPIFormulaDSL.g:3054:2: ( rule__Or__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            }
            // InternalKPIFormulaDSL.g:3055:2: ( rule__Or__RightAssignment_1_2 )
            // InternalKPIFormulaDSL.g:3055:3: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalKPIFormulaDSL.g:3064:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3068:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalKPIFormulaDSL.g:3069:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__And__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalKPIFormulaDSL.g:3076:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3080:1: ( ( ruleEquality ) )
            // InternalKPIFormulaDSL.g:3081:1: ( ruleEquality )
            {
            // InternalKPIFormulaDSL.g:3081:1: ( ruleEquality )
            // InternalKPIFormulaDSL.g:3082:2: ruleEquality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalKPIFormulaDSL.g:3091:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3095:1: ( rule__And__Group__1__Impl )
            // InternalKPIFormulaDSL.g:3096:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalKPIFormulaDSL.g:3102:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3106:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalKPIFormulaDSL.g:3107:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalKPIFormulaDSL.g:3107:1: ( ( rule__And__Group_1__0 )* )
            // InternalKPIFormulaDSL.g:3108:2: ( rule__And__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1()); 
            }
            // InternalKPIFormulaDSL.g:3109:2: ( rule__And__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==50) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:3109:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__And__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalKPIFormulaDSL.g:3118:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3122:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalKPIFormulaDSL.g:3123:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__And__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalKPIFormulaDSL.g:3130:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3134:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3135:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3135:1: ( () )
            // InternalKPIFormulaDSL.g:3136:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            }
            // InternalKPIFormulaDSL.g:3137:2: ()
            // InternalKPIFormulaDSL.g:3137:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalKPIFormulaDSL.g:3145:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3149:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalKPIFormulaDSL.g:3150:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__And__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalKPIFormulaDSL.g:3157:1: rule__And__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3161:1: ( ( 'and' ) )
            // InternalKPIFormulaDSL.g:3162:1: ( 'and' )
            {
            // InternalKPIFormulaDSL.g:3162:1: ( 'and' )
            // InternalKPIFormulaDSL.g:3163:2: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndKeyword_1_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAndKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalKPIFormulaDSL.g:3172:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3176:1: ( rule__And__Group_1__2__Impl )
            // InternalKPIFormulaDSL.g:3177:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalKPIFormulaDSL.g:3183:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3187:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalKPIFormulaDSL.g:3188:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalKPIFormulaDSL.g:3188:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalKPIFormulaDSL.g:3189:2: ( rule__And__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            }
            // InternalKPIFormulaDSL.g:3190:2: ( rule__And__RightAssignment_1_2 )
            // InternalKPIFormulaDSL.g:3190:3: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // InternalKPIFormulaDSL.g:3199:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3203:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalKPIFormulaDSL.g:3204:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Equality__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // InternalKPIFormulaDSL.g:3211:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3215:1: ( ( ruleComparison ) )
            // InternalKPIFormulaDSL.g:3216:1: ( ruleComparison )
            {
            // InternalKPIFormulaDSL.g:3216:1: ( ruleComparison )
            // InternalKPIFormulaDSL.g:3217:2: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // InternalKPIFormulaDSL.g:3226:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3230:1: ( rule__Equality__Group__1__Impl )
            // InternalKPIFormulaDSL.g:3231:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // InternalKPIFormulaDSL.g:3237:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3241:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalKPIFormulaDSL.g:3242:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalKPIFormulaDSL.g:3242:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalKPIFormulaDSL.g:3243:2: ( rule__Equality__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup_1()); 
            }
            // InternalKPIFormulaDSL.g:3244:2: ( rule__Equality__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=51 && LA20_0<=52)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:3244:3: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // InternalKPIFormulaDSL.g:3253:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3257:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalKPIFormulaDSL.g:3258:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0"


    // $ANTLR start "rule__Equality__Group_1__0__Impl"
    // InternalKPIFormulaDSL.g:3265:1: rule__Equality__Group_1__0__Impl : ( ( rule__Equality__Alternatives_1_0 ) ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3269:1: ( ( ( rule__Equality__Alternatives_1_0 ) ) )
            // InternalKPIFormulaDSL.g:3270:1: ( ( rule__Equality__Alternatives_1_0 ) )
            {
            // InternalKPIFormulaDSL.g:3270:1: ( ( rule__Equality__Alternatives_1_0 ) )
            // InternalKPIFormulaDSL.g:3271:2: ( rule__Equality__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getAlternatives_1_0()); 
            }
            // InternalKPIFormulaDSL.g:3272:2: ( rule__Equality__Alternatives_1_0 )
            // InternalKPIFormulaDSL.g:3272:3: rule__Equality__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // InternalKPIFormulaDSL.g:3280:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3284:1: ( rule__Equality__Group_1__1__Impl )
            // InternalKPIFormulaDSL.g:3285:2: rule__Equality__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1"


    // $ANTLR start "rule__Equality__Group_1__1__Impl"
    // InternalKPIFormulaDSL.g:3291:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__RightAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3295:1: ( ( ( rule__Equality__RightAssignment_1_1 ) ) )
            // InternalKPIFormulaDSL.g:3296:1: ( ( rule__Equality__RightAssignment_1_1 ) )
            {
            // InternalKPIFormulaDSL.g:3296:1: ( ( rule__Equality__RightAssignment_1_1 ) )
            // InternalKPIFormulaDSL.g:3297:2: ( rule__Equality__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getRightAssignment_1_1()); 
            }
            // InternalKPIFormulaDSL.g:3298:2: ( rule__Equality__RightAssignment_1_1 )
            // InternalKPIFormulaDSL.g:3298:3: rule__Equality__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Equality__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1_0_0__0"
    // InternalKPIFormulaDSL.g:3307:1: rule__Equality__Group_1_0_0__0 : rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1 ;
    public final void rule__Equality__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3311:1: ( rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1 )
            // InternalKPIFormulaDSL.g:3312:2: rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1
            {
            pushFollow(FOLLOW_36);
            rule__Equality__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_0__0"


    // $ANTLR start "rule__Equality__Group_1_0_0__0__Impl"
    // InternalKPIFormulaDSL.g:3319:1: rule__Equality__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3323:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3324:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3324:1: ( () )
            // InternalKPIFormulaDSL.g:3325:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0_0_0()); 
            }
            // InternalKPIFormulaDSL.g:3326:2: ()
            // InternalKPIFormulaDSL.g:3326:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Equality__Group_1_0_0__1"
    // InternalKPIFormulaDSL.g:3334:1: rule__Equality__Group_1_0_0__1 : rule__Equality__Group_1_0_0__1__Impl ;
    public final void rule__Equality__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3338:1: ( rule__Equality__Group_1_0_0__1__Impl )
            // InternalKPIFormulaDSL.g:3339:2: rule__Equality__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_0__1"


    // $ANTLR start "rule__Equality__Group_1_0_0__1__Impl"
    // InternalKPIFormulaDSL.g:3345:1: rule__Equality__Group_1_0_0__1__Impl : ( '==' ) ;
    public final void rule__Equality__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3349:1: ( ( '==' ) )
            // InternalKPIFormulaDSL.g:3350:1: ( '==' )
            {
            // InternalKPIFormulaDSL.g:3350:1: ( '==' )
            // InternalKPIFormulaDSL.g:3351:2: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_0_1()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Equality__Group_1_0_1__0"
    // InternalKPIFormulaDSL.g:3361:1: rule__Equality__Group_1_0_1__0 : rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1 ;
    public final void rule__Equality__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3365:1: ( rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1 )
            // InternalKPIFormulaDSL.g:3366:2: rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1
            {
            pushFollow(FOLLOW_34);
            rule__Equality__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_1__0"


    // $ANTLR start "rule__Equality__Group_1_0_1__0__Impl"
    // InternalKPIFormulaDSL.g:3373:1: rule__Equality__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3377:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3378:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3378:1: ( () )
            // InternalKPIFormulaDSL.g:3379:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getInequalityLeftAction_1_0_1_0()); 
            }
            // InternalKPIFormulaDSL.g:3380:2: ()
            // InternalKPIFormulaDSL.g:3380:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getInequalityLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1_0_1__1"
    // InternalKPIFormulaDSL.g:3388:1: rule__Equality__Group_1_0_1__1 : rule__Equality__Group_1_0_1__1__Impl ;
    public final void rule__Equality__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3392:1: ( rule__Equality__Group_1_0_1__1__Impl )
            // InternalKPIFormulaDSL.g:3393:2: rule__Equality__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_1__1"


    // $ANTLR start "rule__Equality__Group_1_0_1__1__Impl"
    // InternalKPIFormulaDSL.g:3399:1: rule__Equality__Group_1_0_1__1__Impl : ( '!=' ) ;
    public final void rule__Equality__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3403:1: ( ( '!=' ) )
            // InternalKPIFormulaDSL.g:3404:1: ( '!=' )
            {
            // InternalKPIFormulaDSL.g:3404:1: ( '!=' )
            // InternalKPIFormulaDSL.g:3405:2: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalKPIFormulaDSL.g:3415:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3419:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalKPIFormulaDSL.g:3420:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Comparison__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalKPIFormulaDSL.g:3427:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3431:1: ( ( rulePlusOrMinus ) )
            // InternalKPIFormulaDSL.g:3432:1: ( rulePlusOrMinus )
            {
            // InternalKPIFormulaDSL.g:3432:1: ( rulePlusOrMinus )
            // InternalKPIFormulaDSL.g:3433:2: rulePlusOrMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalKPIFormulaDSL.g:3442:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3446:1: ( rule__Comparison__Group__1__Impl )
            // InternalKPIFormulaDSL.g:3447:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalKPIFormulaDSL.g:3453:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3457:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalKPIFormulaDSL.g:3458:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalKPIFormulaDSL.g:3458:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalKPIFormulaDSL.g:3459:2: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // InternalKPIFormulaDSL.g:3460:2: ( rule__Comparison__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=53 && LA21_0<=56)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:3460:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // InternalKPIFormulaDSL.g:3469:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3473:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalKPIFormulaDSL.g:3474:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // InternalKPIFormulaDSL.g:3481:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Alternatives_1_0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3485:1: ( ( ( rule__Comparison__Alternatives_1_0 ) ) )
            // InternalKPIFormulaDSL.g:3486:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            {
            // InternalKPIFormulaDSL.g:3486:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            // InternalKPIFormulaDSL.g:3487:2: ( rule__Comparison__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            }
            // InternalKPIFormulaDSL.g:3488:2: ( rule__Comparison__Alternatives_1_0 )
            // InternalKPIFormulaDSL.g:3488:3: rule__Comparison__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // InternalKPIFormulaDSL.g:3496:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3500:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalKPIFormulaDSL.g:3501:2: rule__Comparison__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // InternalKPIFormulaDSL.g:3507:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3511:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // InternalKPIFormulaDSL.g:3512:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // InternalKPIFormulaDSL.g:3512:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // InternalKPIFormulaDSL.g:3513:2: ( rule__Comparison__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            }
            // InternalKPIFormulaDSL.g:3514:2: ( rule__Comparison__RightAssignment_1_1 )
            // InternalKPIFormulaDSL.g:3514:3: rule__Comparison__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_0__0"
    // InternalKPIFormulaDSL.g:3523:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3527:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalKPIFormulaDSL.g:3528:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
            {
            pushFollow(FOLLOW_39);
            rule__Comparison__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__0"


    // $ANTLR start "rule__Comparison__Group_1_0_0__0__Impl"
    // InternalKPIFormulaDSL.g:3535:1: rule__Comparison__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3539:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3540:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3540:1: ( () )
            // InternalKPIFormulaDSL.g:3541:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGreaterEqLeftAction_1_0_0_0()); 
            }
            // InternalKPIFormulaDSL.g:3542:2: ()
            // InternalKPIFormulaDSL.g:3542:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGreaterEqLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_0__1"
    // InternalKPIFormulaDSL.g:3550:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3554:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalKPIFormulaDSL.g:3555:2: rule__Comparison__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__1"


    // $ANTLR start "rule__Comparison__Group_1_0_0__1__Impl"
    // InternalKPIFormulaDSL.g:3561:1: rule__Comparison__Group_1_0_0__1__Impl : ( '>=' ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3565:1: ( ( '>=' ) )
            // InternalKPIFormulaDSL.g:3566:1: ( '>=' )
            {
            // InternalKPIFormulaDSL.g:3566:1: ( '>=' )
            // InternalKPIFormulaDSL.g:3567:2: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_1__0"
    // InternalKPIFormulaDSL.g:3577:1: rule__Comparison__Group_1_0_1__0 : rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 ;
    public final void rule__Comparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3581:1: ( rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 )
            // InternalKPIFormulaDSL.g:3582:2: rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1
            {
            pushFollow(FOLLOW_40);
            rule__Comparison__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_1__0"


    // $ANTLR start "rule__Comparison__Group_1_0_1__0__Impl"
    // InternalKPIFormulaDSL.g:3589:1: rule__Comparison__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3593:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3594:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3594:1: ( () )
            // InternalKPIFormulaDSL.g:3595:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessEqLeftAction_1_0_1_0()); 
            }
            // InternalKPIFormulaDSL.g:3596:2: ()
            // InternalKPIFormulaDSL.g:3596:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getLessEqLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_1__1"
    // InternalKPIFormulaDSL.g:3604:1: rule__Comparison__Group_1_0_1__1 : rule__Comparison__Group_1_0_1__1__Impl ;
    public final void rule__Comparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3608:1: ( rule__Comparison__Group_1_0_1__1__Impl )
            // InternalKPIFormulaDSL.g:3609:2: rule__Comparison__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_1__1"


    // $ANTLR start "rule__Comparison__Group_1_0_1__1__Impl"
    // InternalKPIFormulaDSL.g:3615:1: rule__Comparison__Group_1_0_1__1__Impl : ( '<=' ) ;
    public final void rule__Comparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3619:1: ( ( '<=' ) )
            // InternalKPIFormulaDSL.g:3620:1: ( '<=' )
            {
            // InternalKPIFormulaDSL.g:3620:1: ( '<=' )
            // InternalKPIFormulaDSL.g:3621:2: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_1_1()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_2__0"
    // InternalKPIFormulaDSL.g:3631:1: rule__Comparison__Group_1_0_2__0 : rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 ;
    public final void rule__Comparison__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3635:1: ( rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 )
            // InternalKPIFormulaDSL.g:3636:2: rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1
            {
            pushFollow(FOLLOW_41);
            rule__Comparison__Group_1_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_2__0"


    // $ANTLR start "rule__Comparison__Group_1_0_2__0__Impl"
    // InternalKPIFormulaDSL.g:3643:1: rule__Comparison__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3647:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3648:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3648:1: ( () )
            // InternalKPIFormulaDSL.g:3649:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGreaterLeftAction_1_0_2_0()); 
            }
            // InternalKPIFormulaDSL.g:3650:2: ()
            // InternalKPIFormulaDSL.g:3650:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGreaterLeftAction_1_0_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_2__1"
    // InternalKPIFormulaDSL.g:3658:1: rule__Comparison__Group_1_0_2__1 : rule__Comparison__Group_1_0_2__1__Impl ;
    public final void rule__Comparison__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3662:1: ( rule__Comparison__Group_1_0_2__1__Impl )
            // InternalKPIFormulaDSL.g:3663:2: rule__Comparison__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_2__1"


    // $ANTLR start "rule__Comparison__Group_1_0_2__1__Impl"
    // InternalKPIFormulaDSL.g:3669:1: rule__Comparison__Group_1_0_2__1__Impl : ( '>' ) ;
    public final void rule__Comparison__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3673:1: ( ( '>' ) )
            // InternalKPIFormulaDSL.g:3674:1: ( '>' )
            {
            // InternalKPIFormulaDSL.g:3674:1: ( '>' )
            // InternalKPIFormulaDSL.g:3675:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_2_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_3__0"
    // InternalKPIFormulaDSL.g:3685:1: rule__Comparison__Group_1_0_3__0 : rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1 ;
    public final void rule__Comparison__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3689:1: ( rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1 )
            // InternalKPIFormulaDSL.g:3690:2: rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1
            {
            pushFollow(FOLLOW_37);
            rule__Comparison__Group_1_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_3__0"


    // $ANTLR start "rule__Comparison__Group_1_0_3__0__Impl"
    // InternalKPIFormulaDSL.g:3697:1: rule__Comparison__Group_1_0_3__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3701:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3702:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3702:1: ( () )
            // InternalKPIFormulaDSL.g:3703:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessLeftAction_1_0_3_0()); 
            }
            // InternalKPIFormulaDSL.g:3704:2: ()
            // InternalKPIFormulaDSL.g:3704:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getLessLeftAction_1_0_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_3__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_3__1"
    // InternalKPIFormulaDSL.g:3712:1: rule__Comparison__Group_1_0_3__1 : rule__Comparison__Group_1_0_3__1__Impl ;
    public final void rule__Comparison__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3716:1: ( rule__Comparison__Group_1_0_3__1__Impl )
            // InternalKPIFormulaDSL.g:3717:2: rule__Comparison__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_3__1"


    // $ANTLR start "rule__Comparison__Group_1_0_3__1__Impl"
    // InternalKPIFormulaDSL.g:3723:1: rule__Comparison__Group_1_0_3__1__Impl : ( '<' ) ;
    public final void rule__Comparison__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3727:1: ( ( '<' ) )
            // InternalKPIFormulaDSL.g:3728:1: ( '<' )
            {
            // InternalKPIFormulaDSL.g:3728:1: ( '<' )
            // InternalKPIFormulaDSL.g:3729:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_3_1()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_3__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // InternalKPIFormulaDSL.g:3739:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3743:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalKPIFormulaDSL.g:3744:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0"


    // $ANTLR start "rule__PlusOrMinus__Group__0__Impl"
    // InternalKPIFormulaDSL.g:3751:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3755:1: ( ( ruleMulOrDiv ) )
            // InternalKPIFormulaDSL.g:3756:1: ( ruleMulOrDiv )
            {
            // InternalKPIFormulaDSL.g:3756:1: ( ruleMulOrDiv )
            // InternalKPIFormulaDSL.g:3757:2: ruleMulOrDiv
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__1"
    // InternalKPIFormulaDSL.g:3766:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3770:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalKPIFormulaDSL.g:3771:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1"


    // $ANTLR start "rule__PlusOrMinus__Group__1__Impl"
    // InternalKPIFormulaDSL.g:3777:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3781:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalKPIFormulaDSL.g:3782:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalKPIFormulaDSL.g:3782:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalKPIFormulaDSL.g:3783:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            }
            // InternalKPIFormulaDSL.g:3784:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=57 && LA22_0<=58)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:3784:3: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0"
    // InternalKPIFormulaDSL.g:3793:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3797:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalKPIFormulaDSL.g:3798:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0__Impl"
    // InternalKPIFormulaDSL.g:3805:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3809:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalKPIFormulaDSL.g:3810:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalKPIFormulaDSL.g:3810:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalKPIFormulaDSL.g:3811:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            }
            // InternalKPIFormulaDSL.g:3812:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalKPIFormulaDSL.g:3812:3: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1"
    // InternalKPIFormulaDSL.g:3820:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3824:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalKPIFormulaDSL.g:3825:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1__Impl"
    // InternalKPIFormulaDSL.g:3831:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3835:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalKPIFormulaDSL.g:3836:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalKPIFormulaDSL.g:3836:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalKPIFormulaDSL.g:3837:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            }
            // InternalKPIFormulaDSL.g:3838:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalKPIFormulaDSL.g:3838:3: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0"
    // InternalKPIFormulaDSL.g:3847:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3851:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalKPIFormulaDSL.g:3852:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_44);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0__Impl"
    // InternalKPIFormulaDSL.g:3859:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3863:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3864:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3864:1: ( () )
            // InternalKPIFormulaDSL.g:3865:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            }
            // InternalKPIFormulaDSL.g:3866:2: ()
            // InternalKPIFormulaDSL.g:3866:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1"
    // InternalKPIFormulaDSL.g:3874:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3878:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalKPIFormulaDSL.g:3879:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1__Impl"
    // InternalKPIFormulaDSL.g:3885:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3889:1: ( ( '+' ) )
            // InternalKPIFormulaDSL.g:3890:1: ( '+' )
            {
            // InternalKPIFormulaDSL.g:3890:1: ( '+' )
            // InternalKPIFormulaDSL.g:3891:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0"
    // InternalKPIFormulaDSL.g:3901:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3905:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalKPIFormulaDSL.g:3906:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_42);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0__Impl"
    // InternalKPIFormulaDSL.g:3913:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3917:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3918:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3918:1: ( () )
            // InternalKPIFormulaDSL.g:3919:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            }
            // InternalKPIFormulaDSL.g:3920:2: ()
            // InternalKPIFormulaDSL.g:3920:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1"
    // InternalKPIFormulaDSL.g:3928:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3932:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalKPIFormulaDSL.g:3933:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1__Impl"
    // InternalKPIFormulaDSL.g:3939:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3943:1: ( ( '-' ) )
            // InternalKPIFormulaDSL.g:3944:1: ( '-' )
            {
            // InternalKPIFormulaDSL.g:3944:1: ( '-' )
            // InternalKPIFormulaDSL.g:3945:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__0"
    // InternalKPIFormulaDSL.g:3955:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3959:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalKPIFormulaDSL.g:3960:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__0"


    // $ANTLR start "rule__MulOrDiv__Group__0__Impl"
    // InternalKPIFormulaDSL.g:3967:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3971:1: ( ( rulePrimary ) )
            // InternalKPIFormulaDSL.g:3972:1: ( rulePrimary )
            {
            // InternalKPIFormulaDSL.g:3972:1: ( rulePrimary )
            // InternalKPIFormulaDSL.g:3973:2: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__1"
    // InternalKPIFormulaDSL.g:3982:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3986:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalKPIFormulaDSL.g:3987:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__1"


    // $ANTLR start "rule__MulOrDiv__Group__1__Impl"
    // InternalKPIFormulaDSL.g:3993:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3997:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalKPIFormulaDSL.g:3998:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalKPIFormulaDSL.g:3998:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalKPIFormulaDSL.g:3999:2: ( rule__MulOrDiv__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            }
            // InternalKPIFormulaDSL.g:4000:2: ( rule__MulOrDiv__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=59 && LA23_0<=60)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:4000:3: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__0"
    // InternalKPIFormulaDSL.g:4009:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4013:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalKPIFormulaDSL.g:4014:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1__0__Impl"
    // InternalKPIFormulaDSL.g:4021:1: rule__MulOrDiv__Group_1__0__Impl : ( ( rule__MulOrDiv__Alternatives_1_0 ) ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4025:1: ( ( ( rule__MulOrDiv__Alternatives_1_0 ) ) )
            // InternalKPIFormulaDSL.g:4026:1: ( ( rule__MulOrDiv__Alternatives_1_0 ) )
            {
            // InternalKPIFormulaDSL.g:4026:1: ( ( rule__MulOrDiv__Alternatives_1_0 ) )
            // InternalKPIFormulaDSL.g:4027:2: ( rule__MulOrDiv__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getAlternatives_1_0()); 
            }
            // InternalKPIFormulaDSL.g:4028:2: ( rule__MulOrDiv__Alternatives_1_0 )
            // InternalKPIFormulaDSL.g:4028:3: rule__MulOrDiv__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__1"
    // InternalKPIFormulaDSL.g:4036:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4040:1: ( rule__MulOrDiv__Group_1__1__Impl )
            // InternalKPIFormulaDSL.g:4041:2: rule__MulOrDiv__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1__1__Impl"
    // InternalKPIFormulaDSL.g:4047:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4051:1: ( ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) )
            // InternalKPIFormulaDSL.g:4052:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            {
            // InternalKPIFormulaDSL.g:4052:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            // InternalKPIFormulaDSL.g:4053:2: ( rule__MulOrDiv__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); 
            }
            // InternalKPIFormulaDSL.g:4054:2: ( rule__MulOrDiv__RightAssignment_1_1 )
            // InternalKPIFormulaDSL.g:4054:3: rule__MulOrDiv__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_0__0"
    // InternalKPIFormulaDSL.g:4063:1: rule__MulOrDiv__Group_1_0_0__0 : rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1 ;
    public final void rule__MulOrDiv__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4067:1: ( rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1 )
            // InternalKPIFormulaDSL.g:4068:2: rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1
            {
            pushFollow(FOLLOW_47);
            rule__MulOrDiv__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_0__0"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_0__0__Impl"
    // InternalKPIFormulaDSL.g:4075:1: rule__MulOrDiv__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4079:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4080:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4080:1: ( () )
            // InternalKPIFormulaDSL.g:4081:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getMultiplyLeftAction_1_0_0_0()); 
            }
            // InternalKPIFormulaDSL.g:4082:2: ()
            // InternalKPIFormulaDSL.g:4082:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getMultiplyLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_0__1"
    // InternalKPIFormulaDSL.g:4090:1: rule__MulOrDiv__Group_1_0_0__1 : rule__MulOrDiv__Group_1_0_0__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4094:1: ( rule__MulOrDiv__Group_1_0_0__1__Impl )
            // InternalKPIFormulaDSL.g:4095:2: rule__MulOrDiv__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_0__1"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_0__1__Impl"
    // InternalKPIFormulaDSL.g:4101:1: rule__MulOrDiv__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MulOrDiv__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4105:1: ( ( '*' ) )
            // InternalKPIFormulaDSL.g:4106:1: ( '*' )
            {
            // InternalKPIFormulaDSL.g:4106:1: ( '*' )
            // InternalKPIFormulaDSL.g:4107:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_1__0"
    // InternalKPIFormulaDSL.g:4117:1: rule__MulOrDiv__Group_1_0_1__0 : rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1 ;
    public final void rule__MulOrDiv__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4121:1: ( rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1 )
            // InternalKPIFormulaDSL.g:4122:2: rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1
            {
            pushFollow(FOLLOW_45);
            rule__MulOrDiv__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_1__0__Impl"
    // InternalKPIFormulaDSL.g:4129:1: rule__MulOrDiv__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4133:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4134:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4134:1: ( () )
            // InternalKPIFormulaDSL.g:4135:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getDivideLeftAction_1_0_1_0()); 
            }
            // InternalKPIFormulaDSL.g:4136:2: ()
            // InternalKPIFormulaDSL.g:4136:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getDivideLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_1__1"
    // InternalKPIFormulaDSL.g:4144:1: rule__MulOrDiv__Group_1_0_1__1 : rule__MulOrDiv__Group_1_0_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4148:1: ( rule__MulOrDiv__Group_1_0_1__1__Impl )
            // InternalKPIFormulaDSL.g:4149:2: rule__MulOrDiv__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_1__1__Impl"
    // InternalKPIFormulaDSL.g:4155:1: rule__MulOrDiv__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MulOrDiv__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4159:1: ( ( '/' ) )
            // InternalKPIFormulaDSL.g:4160:1: ( '/' )
            {
            // InternalKPIFormulaDSL.g:4160:1: ( '/' )
            // InternalKPIFormulaDSL.g:4161:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalKPIFormulaDSL.g:4171:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4175:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalKPIFormulaDSL.g:4176:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalKPIFormulaDSL.g:4183:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4187:1: ( ( '(' ) )
            // InternalKPIFormulaDSL.g:4188:1: ( '(' )
            {
            // InternalKPIFormulaDSL.g:4188:1: ( '(' )
            // InternalKPIFormulaDSL.g:4189:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalKPIFormulaDSL.g:4198:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4202:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalKPIFormulaDSL.g:4203:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_48);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalKPIFormulaDSL.g:4210:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4214:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:4215:1: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:4215:1: ( ruleExpression )
            // InternalKPIFormulaDSL.g:4216:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // InternalKPIFormulaDSL.g:4225:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4229:1: ( rule__Primary__Group_0__2__Impl )
            // InternalKPIFormulaDSL.g:4230:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // InternalKPIFormulaDSL.g:4236:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4240:1: ( ( ')' ) )
            // InternalKPIFormulaDSL.g:4241:1: ( ')' )
            {
            // InternalKPIFormulaDSL.g:4241:1: ( ')' )
            // InternalKPIFormulaDSL.g:4242:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalKPIFormulaDSL.g:4252:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4256:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalKPIFormulaDSL.g:4257:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_49);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalKPIFormulaDSL.g:4264:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4268:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4269:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4269:1: ( () )
            // InternalKPIFormulaDSL.g:4270:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            }
            // InternalKPIFormulaDSL.g:4271:2: ()
            // InternalKPIFormulaDSL.g:4271:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalKPIFormulaDSL.g:4279:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4283:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalKPIFormulaDSL.g:4284:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalKPIFormulaDSL.g:4291:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4295:1: ( ( '!' ) )
            // InternalKPIFormulaDSL.g:4296:1: ( '!' )
            {
            // InternalKPIFormulaDSL.g:4296:1: ( '!' )
            // InternalKPIFormulaDSL.g:4297:2: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalKPIFormulaDSL.g:4306:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4310:1: ( rule__Primary__Group_1__2__Impl )
            // InternalKPIFormulaDSL.g:4311:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalKPIFormulaDSL.g:4317:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4321:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // InternalKPIFormulaDSL.g:4322:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // InternalKPIFormulaDSL.g:4322:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // InternalKPIFormulaDSL.g:4323:2: ( rule__Primary__ExpressionAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            }
            // InternalKPIFormulaDSL.g:4324:2: ( rule__Primary__ExpressionAssignment_1_2 )
            // InternalKPIFormulaDSL.g:4324:3: rule__Primary__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_2__0"
    // InternalKPIFormulaDSL.g:4333:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4337:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalKPIFormulaDSL.g:4338:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_50);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // InternalKPIFormulaDSL.g:4345:1: rule__Primary__Group_2__0__Impl : ( () ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4349:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4350:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4350:1: ( () )
            // InternalKPIFormulaDSL.g:4351:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getUnaryMinusAction_2_0()); 
            }
            // InternalKPIFormulaDSL.g:4352:2: ()
            // InternalKPIFormulaDSL.g:4352:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getUnaryMinusAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // InternalKPIFormulaDSL.g:4360:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4364:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalKPIFormulaDSL.g:4365:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // InternalKPIFormulaDSL.g:4372:1: rule__Primary__Group_2__1__Impl : ( '-' ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4376:1: ( ( '-' ) )
            // InternalKPIFormulaDSL.g:4377:1: ( '-' )
            {
            // InternalKPIFormulaDSL.g:4377:1: ( '-' )
            // InternalKPIFormulaDSL.g:4378:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__2"
    // InternalKPIFormulaDSL.g:4387:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4391:1: ( rule__Primary__Group_2__2__Impl )
            // InternalKPIFormulaDSL.g:4392:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2"


    // $ANTLR start "rule__Primary__Group_2__2__Impl"
    // InternalKPIFormulaDSL.g:4398:1: rule__Primary__Group_2__2__Impl : ( ( rule__Primary__ExpressionAssignment_2_2 ) ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4402:1: ( ( ( rule__Primary__ExpressionAssignment_2_2 ) ) )
            // InternalKPIFormulaDSL.g:4403:1: ( ( rule__Primary__ExpressionAssignment_2_2 ) )
            {
            // InternalKPIFormulaDSL.g:4403:1: ( ( rule__Primary__ExpressionAssignment_2_2 ) )
            // InternalKPIFormulaDSL.g:4404:2: ( rule__Primary__ExpressionAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionAssignment_2_2()); 
            }
            // InternalKPIFormulaDSL.g:4405:2: ( rule__Primary__ExpressionAssignment_2_2 )
            // InternalKPIFormulaDSL.g:4405:3: rule__Primary__ExpressionAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2__Impl"


    // $ANTLR start "rule__Primary__Group_3__0"
    // InternalKPIFormulaDSL.g:4414:1: rule__Primary__Group_3__0 : rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 ;
    public final void rule__Primary__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4418:1: ( rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1 )
            // InternalKPIFormulaDSL.g:4419:2: rule__Primary__Group_3__0__Impl rule__Primary__Group_3__1
            {
            pushFollow(FOLLOW_51);
            rule__Primary__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0"


    // $ANTLR start "rule__Primary__Group_3__0__Impl"
    // InternalKPIFormulaDSL.g:4426:1: rule__Primary__Group_3__0__Impl : ( () ) ;
    public final void rule__Primary__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4430:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4431:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4431:1: ( () )
            // InternalKPIFormulaDSL.g:4432:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getAvgOpAction_3_0()); 
            }
            // InternalKPIFormulaDSL.g:4433:2: ()
            // InternalKPIFormulaDSL.g:4433:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getAvgOpAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__0__Impl"


    // $ANTLR start "rule__Primary__Group_3__1"
    // InternalKPIFormulaDSL.g:4441:1: rule__Primary__Group_3__1 : rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 ;
    public final void rule__Primary__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4445:1: ( rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2 )
            // InternalKPIFormulaDSL.g:4446:2: rule__Primary__Group_3__1__Impl rule__Primary__Group_3__2
            {
            pushFollow(FOLLOW_52);
            rule__Primary__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1"


    // $ANTLR start "rule__Primary__Group_3__1__Impl"
    // InternalKPIFormulaDSL.g:4453:1: rule__Primary__Group_3__1__Impl : ( 'AVERAGE' ) ;
    public final void rule__Primary__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4457:1: ( ( 'AVERAGE' ) )
            // InternalKPIFormulaDSL.g:4458:1: ( 'AVERAGE' )
            {
            // InternalKPIFormulaDSL.g:4458:1: ( 'AVERAGE' )
            // InternalKPIFormulaDSL.g:4459:2: 'AVERAGE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getAVERAGEKeyword_3_1()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getAVERAGEKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__1__Impl"


    // $ANTLR start "rule__Primary__Group_3__2"
    // InternalKPIFormulaDSL.g:4468:1: rule__Primary__Group_3__2 : rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3 ;
    public final void rule__Primary__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4472:1: ( rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3 )
            // InternalKPIFormulaDSL.g:4473:2: rule__Primary__Group_3__2__Impl rule__Primary__Group_3__3
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2"


    // $ANTLR start "rule__Primary__Group_3__2__Impl"
    // InternalKPIFormulaDSL.g:4480:1: rule__Primary__Group_3__2__Impl : ( '(' ) ;
    public final void rule__Primary__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4484:1: ( ( '(' ) )
            // InternalKPIFormulaDSL.g:4485:1: ( '(' )
            {
            // InternalKPIFormulaDSL.g:4485:1: ( '(' )
            // InternalKPIFormulaDSL.g:4486:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_2()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__2__Impl"


    // $ANTLR start "rule__Primary__Group_3__3"
    // InternalKPIFormulaDSL.g:4495:1: rule__Primary__Group_3__3 : rule__Primary__Group_3__3__Impl rule__Primary__Group_3__4 ;
    public final void rule__Primary__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4499:1: ( rule__Primary__Group_3__3__Impl rule__Primary__Group_3__4 )
            // InternalKPIFormulaDSL.g:4500:2: rule__Primary__Group_3__3__Impl rule__Primary__Group_3__4
            {
            pushFollow(FOLLOW_53);
            rule__Primary__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__3"


    // $ANTLR start "rule__Primary__Group_3__3__Impl"
    // InternalKPIFormulaDSL.g:4507:1: rule__Primary__Group_3__3__Impl : ( ( rule__Primary__ExpressionsAssignment_3_3 ) ) ;
    public final void rule__Primary__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4511:1: ( ( ( rule__Primary__ExpressionsAssignment_3_3 ) ) )
            // InternalKPIFormulaDSL.g:4512:1: ( ( rule__Primary__ExpressionsAssignment_3_3 ) )
            {
            // InternalKPIFormulaDSL.g:4512:1: ( ( rule__Primary__ExpressionsAssignment_3_3 ) )
            // InternalKPIFormulaDSL.g:4513:2: ( rule__Primary__ExpressionsAssignment_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionsAssignment_3_3()); 
            }
            // InternalKPIFormulaDSL.g:4514:2: ( rule__Primary__ExpressionsAssignment_3_3 )
            // InternalKPIFormulaDSL.g:4514:3: rule__Primary__ExpressionsAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionsAssignment_3_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionsAssignment_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__3__Impl"


    // $ANTLR start "rule__Primary__Group_3__4"
    // InternalKPIFormulaDSL.g:4522:1: rule__Primary__Group_3__4 : rule__Primary__Group_3__4__Impl rule__Primary__Group_3__5 ;
    public final void rule__Primary__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4526:1: ( rule__Primary__Group_3__4__Impl rule__Primary__Group_3__5 )
            // InternalKPIFormulaDSL.g:4527:2: rule__Primary__Group_3__4__Impl rule__Primary__Group_3__5
            {
            pushFollow(FOLLOW_53);
            rule__Primary__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__4"


    // $ANTLR start "rule__Primary__Group_3__4__Impl"
    // InternalKPIFormulaDSL.g:4534:1: rule__Primary__Group_3__4__Impl : ( ( rule__Primary__Group_3_4__0 )* ) ;
    public final void rule__Primary__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4538:1: ( ( ( rule__Primary__Group_3_4__0 )* ) )
            // InternalKPIFormulaDSL.g:4539:1: ( ( rule__Primary__Group_3_4__0 )* )
            {
            // InternalKPIFormulaDSL.g:4539:1: ( ( rule__Primary__Group_3_4__0 )* )
            // InternalKPIFormulaDSL.g:4540:2: ( rule__Primary__Group_3_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getGroup_3_4()); 
            }
            // InternalKPIFormulaDSL.g:4541:2: ( rule__Primary__Group_3_4__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==65) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:4541:3: rule__Primary__Group_3_4__0
            	    {
            	    pushFollow(FOLLOW_54);
            	    rule__Primary__Group_3_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getGroup_3_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__4__Impl"


    // $ANTLR start "rule__Primary__Group_3__5"
    // InternalKPIFormulaDSL.g:4549:1: rule__Primary__Group_3__5 : rule__Primary__Group_3__5__Impl ;
    public final void rule__Primary__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4553:1: ( rule__Primary__Group_3__5__Impl )
            // InternalKPIFormulaDSL.g:4554:2: rule__Primary__Group_3__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_3__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__5"


    // $ANTLR start "rule__Primary__Group_3__5__Impl"
    // InternalKPIFormulaDSL.g:4560:1: rule__Primary__Group_3__5__Impl : ( ')' ) ;
    public final void rule__Primary__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4564:1: ( ( ')' ) )
            // InternalKPIFormulaDSL.g:4565:1: ( ')' )
            {
            // InternalKPIFormulaDSL.g:4565:1: ( ')' )
            // InternalKPIFormulaDSL.g:4566:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_5()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3__5__Impl"


    // $ANTLR start "rule__Primary__Group_3_4__0"
    // InternalKPIFormulaDSL.g:4576:1: rule__Primary__Group_3_4__0 : rule__Primary__Group_3_4__0__Impl rule__Primary__Group_3_4__1 ;
    public final void rule__Primary__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4580:1: ( rule__Primary__Group_3_4__0__Impl rule__Primary__Group_3_4__1 )
            // InternalKPIFormulaDSL.g:4581:2: rule__Primary__Group_3_4__0__Impl rule__Primary__Group_3_4__1
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_3_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_3_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3_4__0"


    // $ANTLR start "rule__Primary__Group_3_4__0__Impl"
    // InternalKPIFormulaDSL.g:4588:1: rule__Primary__Group_3_4__0__Impl : ( ',' ) ;
    public final void rule__Primary__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4592:1: ( ( ',' ) )
            // InternalKPIFormulaDSL.g:4593:1: ( ',' )
            {
            // InternalKPIFormulaDSL.g:4593:1: ( ',' )
            // InternalKPIFormulaDSL.g:4594:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getCommaKeyword_3_4_0()); 
            }
            match(input,65,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getCommaKeyword_3_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3_4__0__Impl"


    // $ANTLR start "rule__Primary__Group_3_4__1"
    // InternalKPIFormulaDSL.g:4603:1: rule__Primary__Group_3_4__1 : rule__Primary__Group_3_4__1__Impl ;
    public final void rule__Primary__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4607:1: ( rule__Primary__Group_3_4__1__Impl )
            // InternalKPIFormulaDSL.g:4608:2: rule__Primary__Group_3_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_3_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3_4__1"


    // $ANTLR start "rule__Primary__Group_3_4__1__Impl"
    // InternalKPIFormulaDSL.g:4614:1: rule__Primary__Group_3_4__1__Impl : ( ( rule__Primary__ExpressionsAssignment_3_4_1 ) ) ;
    public final void rule__Primary__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4618:1: ( ( ( rule__Primary__ExpressionsAssignment_3_4_1 ) ) )
            // InternalKPIFormulaDSL.g:4619:1: ( ( rule__Primary__ExpressionsAssignment_3_4_1 ) )
            {
            // InternalKPIFormulaDSL.g:4619:1: ( ( rule__Primary__ExpressionsAssignment_3_4_1 ) )
            // InternalKPIFormulaDSL.g:4620:2: ( rule__Primary__ExpressionsAssignment_3_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionsAssignment_3_4_1()); 
            }
            // InternalKPIFormulaDSL.g:4621:2: ( rule__Primary__ExpressionsAssignment_3_4_1 )
            // InternalKPIFormulaDSL.g:4621:3: rule__Primary__ExpressionsAssignment_3_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionsAssignment_3_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionsAssignment_3_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_3_4__1__Impl"


    // $ANTLR start "rule__Primary__Group_4__0"
    // InternalKPIFormulaDSL.g:4630:1: rule__Primary__Group_4__0 : rule__Primary__Group_4__0__Impl rule__Primary__Group_4__1 ;
    public final void rule__Primary__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4634:1: ( rule__Primary__Group_4__0__Impl rule__Primary__Group_4__1 )
            // InternalKPIFormulaDSL.g:4635:2: rule__Primary__Group_4__0__Impl rule__Primary__Group_4__1
            {
            pushFollow(FOLLOW_55);
            rule__Primary__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__0"


    // $ANTLR start "rule__Primary__Group_4__0__Impl"
    // InternalKPIFormulaDSL.g:4642:1: rule__Primary__Group_4__0__Impl : ( () ) ;
    public final void rule__Primary__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4646:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4647:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4647:1: ( () )
            // InternalKPIFormulaDSL.g:4648:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getWeightedSumOpAction_4_0()); 
            }
            // InternalKPIFormulaDSL.g:4649:2: ()
            // InternalKPIFormulaDSL.g:4649:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getWeightedSumOpAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__0__Impl"


    // $ANTLR start "rule__Primary__Group_4__1"
    // InternalKPIFormulaDSL.g:4657:1: rule__Primary__Group_4__1 : rule__Primary__Group_4__1__Impl rule__Primary__Group_4__2 ;
    public final void rule__Primary__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4661:1: ( rule__Primary__Group_4__1__Impl rule__Primary__Group_4__2 )
            // InternalKPIFormulaDSL.g:4662:2: rule__Primary__Group_4__1__Impl rule__Primary__Group_4__2
            {
            pushFollow(FOLLOW_52);
            rule__Primary__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__1"


    // $ANTLR start "rule__Primary__Group_4__1__Impl"
    // InternalKPIFormulaDSL.g:4669:1: rule__Primary__Group_4__1__Impl : ( 'WEIGHTED_SUM' ) ;
    public final void rule__Primary__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4673:1: ( ( 'WEIGHTED_SUM' ) )
            // InternalKPIFormulaDSL.g:4674:1: ( 'WEIGHTED_SUM' )
            {
            // InternalKPIFormulaDSL.g:4674:1: ( 'WEIGHTED_SUM' )
            // InternalKPIFormulaDSL.g:4675:2: 'WEIGHTED_SUM'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getWEIGHTED_SUMKeyword_4_1()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getWEIGHTED_SUMKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__1__Impl"


    // $ANTLR start "rule__Primary__Group_4__2"
    // InternalKPIFormulaDSL.g:4684:1: rule__Primary__Group_4__2 : rule__Primary__Group_4__2__Impl rule__Primary__Group_4__3 ;
    public final void rule__Primary__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4688:1: ( rule__Primary__Group_4__2__Impl rule__Primary__Group_4__3 )
            // InternalKPIFormulaDSL.g:4689:2: rule__Primary__Group_4__2__Impl rule__Primary__Group_4__3
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__2"


    // $ANTLR start "rule__Primary__Group_4__2__Impl"
    // InternalKPIFormulaDSL.g:4696:1: rule__Primary__Group_4__2__Impl : ( '(' ) ;
    public final void rule__Primary__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4700:1: ( ( '(' ) )
            // InternalKPIFormulaDSL.g:4701:1: ( '(' )
            {
            // InternalKPIFormulaDSL.g:4701:1: ( '(' )
            // InternalKPIFormulaDSL.g:4702:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_2()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__2__Impl"


    // $ANTLR start "rule__Primary__Group_4__3"
    // InternalKPIFormulaDSL.g:4711:1: rule__Primary__Group_4__3 : rule__Primary__Group_4__3__Impl rule__Primary__Group_4__4 ;
    public final void rule__Primary__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4715:1: ( rule__Primary__Group_4__3__Impl rule__Primary__Group_4__4 )
            // InternalKPIFormulaDSL.g:4716:2: rule__Primary__Group_4__3__Impl rule__Primary__Group_4__4
            {
            pushFollow(FOLLOW_56);
            rule__Primary__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_4__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__3"


    // $ANTLR start "rule__Primary__Group_4__3__Impl"
    // InternalKPIFormulaDSL.g:4723:1: rule__Primary__Group_4__3__Impl : ( ( rule__Primary__ExpressionsAssignment_4_3 ) ) ;
    public final void rule__Primary__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4727:1: ( ( ( rule__Primary__ExpressionsAssignment_4_3 ) ) )
            // InternalKPIFormulaDSL.g:4728:1: ( ( rule__Primary__ExpressionsAssignment_4_3 ) )
            {
            // InternalKPIFormulaDSL.g:4728:1: ( ( rule__Primary__ExpressionsAssignment_4_3 ) )
            // InternalKPIFormulaDSL.g:4729:2: ( rule__Primary__ExpressionsAssignment_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionsAssignment_4_3()); 
            }
            // InternalKPIFormulaDSL.g:4730:2: ( rule__Primary__ExpressionsAssignment_4_3 )
            // InternalKPIFormulaDSL.g:4730:3: rule__Primary__ExpressionsAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionsAssignment_4_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionsAssignment_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__3__Impl"


    // $ANTLR start "rule__Primary__Group_4__4"
    // InternalKPIFormulaDSL.g:4738:1: rule__Primary__Group_4__4 : rule__Primary__Group_4__4__Impl rule__Primary__Group_4__5 ;
    public final void rule__Primary__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4742:1: ( rule__Primary__Group_4__4__Impl rule__Primary__Group_4__5 )
            // InternalKPIFormulaDSL.g:4743:2: rule__Primary__Group_4__4__Impl rule__Primary__Group_4__5
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_4__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_4__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__4"


    // $ANTLR start "rule__Primary__Group_4__4__Impl"
    // InternalKPIFormulaDSL.g:4750:1: rule__Primary__Group_4__4__Impl : ( ':' ) ;
    public final void rule__Primary__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4754:1: ( ( ':' ) )
            // InternalKPIFormulaDSL.g:4755:1: ( ':' )
            {
            // InternalKPIFormulaDSL.g:4755:1: ( ':' )
            // InternalKPIFormulaDSL.g:4756:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getColonKeyword_4_4()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getColonKeyword_4_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__4__Impl"


    // $ANTLR start "rule__Primary__Group_4__5"
    // InternalKPIFormulaDSL.g:4765:1: rule__Primary__Group_4__5 : rule__Primary__Group_4__5__Impl rule__Primary__Group_4__6 ;
    public final void rule__Primary__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4769:1: ( rule__Primary__Group_4__5__Impl rule__Primary__Group_4__6 )
            // InternalKPIFormulaDSL.g:4770:2: rule__Primary__Group_4__5__Impl rule__Primary__Group_4__6
            {
            pushFollow(FOLLOW_53);
            rule__Primary__Group_4__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_4__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__5"


    // $ANTLR start "rule__Primary__Group_4__5__Impl"
    // InternalKPIFormulaDSL.g:4777:1: rule__Primary__Group_4__5__Impl : ( ( rule__Primary__WeightsAssignment_4_5 ) ) ;
    public final void rule__Primary__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4781:1: ( ( ( rule__Primary__WeightsAssignment_4_5 ) ) )
            // InternalKPIFormulaDSL.g:4782:1: ( ( rule__Primary__WeightsAssignment_4_5 ) )
            {
            // InternalKPIFormulaDSL.g:4782:1: ( ( rule__Primary__WeightsAssignment_4_5 ) )
            // InternalKPIFormulaDSL.g:4783:2: ( rule__Primary__WeightsAssignment_4_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getWeightsAssignment_4_5()); 
            }
            // InternalKPIFormulaDSL.g:4784:2: ( rule__Primary__WeightsAssignment_4_5 )
            // InternalKPIFormulaDSL.g:4784:3: rule__Primary__WeightsAssignment_4_5
            {
            pushFollow(FOLLOW_2);
            rule__Primary__WeightsAssignment_4_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getWeightsAssignment_4_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__5__Impl"


    // $ANTLR start "rule__Primary__Group_4__6"
    // InternalKPIFormulaDSL.g:4792:1: rule__Primary__Group_4__6 : rule__Primary__Group_4__6__Impl rule__Primary__Group_4__7 ;
    public final void rule__Primary__Group_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4796:1: ( rule__Primary__Group_4__6__Impl rule__Primary__Group_4__7 )
            // InternalKPIFormulaDSL.g:4797:2: rule__Primary__Group_4__6__Impl rule__Primary__Group_4__7
            {
            pushFollow(FOLLOW_53);
            rule__Primary__Group_4__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_4__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__6"


    // $ANTLR start "rule__Primary__Group_4__6__Impl"
    // InternalKPIFormulaDSL.g:4804:1: rule__Primary__Group_4__6__Impl : ( ( rule__Primary__Group_4_6__0 )* ) ;
    public final void rule__Primary__Group_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4808:1: ( ( ( rule__Primary__Group_4_6__0 )* ) )
            // InternalKPIFormulaDSL.g:4809:1: ( ( rule__Primary__Group_4_6__0 )* )
            {
            // InternalKPIFormulaDSL.g:4809:1: ( ( rule__Primary__Group_4_6__0 )* )
            // InternalKPIFormulaDSL.g:4810:2: ( rule__Primary__Group_4_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getGroup_4_6()); 
            }
            // InternalKPIFormulaDSL.g:4811:2: ( rule__Primary__Group_4_6__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==65) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:4811:3: rule__Primary__Group_4_6__0
            	    {
            	    pushFollow(FOLLOW_54);
            	    rule__Primary__Group_4_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getGroup_4_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__6__Impl"


    // $ANTLR start "rule__Primary__Group_4__7"
    // InternalKPIFormulaDSL.g:4819:1: rule__Primary__Group_4__7 : rule__Primary__Group_4__7__Impl ;
    public final void rule__Primary__Group_4__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4823:1: ( rule__Primary__Group_4__7__Impl )
            // InternalKPIFormulaDSL.g:4824:2: rule__Primary__Group_4__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_4__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__7"


    // $ANTLR start "rule__Primary__Group_4__7__Impl"
    // InternalKPIFormulaDSL.g:4830:1: rule__Primary__Group_4__7__Impl : ( ')' ) ;
    public final void rule__Primary__Group_4__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4834:1: ( ( ')' ) )
            // InternalKPIFormulaDSL.g:4835:1: ( ')' )
            {
            // InternalKPIFormulaDSL.g:4835:1: ( ')' )
            // InternalKPIFormulaDSL.g:4836:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_4_7()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_4_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4__7__Impl"


    // $ANTLR start "rule__Primary__Group_4_6__0"
    // InternalKPIFormulaDSL.g:4846:1: rule__Primary__Group_4_6__0 : rule__Primary__Group_4_6__0__Impl rule__Primary__Group_4_6__1 ;
    public final void rule__Primary__Group_4_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4850:1: ( rule__Primary__Group_4_6__0__Impl rule__Primary__Group_4_6__1 )
            // InternalKPIFormulaDSL.g:4851:2: rule__Primary__Group_4_6__0__Impl rule__Primary__Group_4_6__1
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_4_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_4_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4_6__0"


    // $ANTLR start "rule__Primary__Group_4_6__0__Impl"
    // InternalKPIFormulaDSL.g:4858:1: rule__Primary__Group_4_6__0__Impl : ( ',' ) ;
    public final void rule__Primary__Group_4_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4862:1: ( ( ',' ) )
            // InternalKPIFormulaDSL.g:4863:1: ( ',' )
            {
            // InternalKPIFormulaDSL.g:4863:1: ( ',' )
            // InternalKPIFormulaDSL.g:4864:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getCommaKeyword_4_6_0()); 
            }
            match(input,65,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getCommaKeyword_4_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4_6__0__Impl"


    // $ANTLR start "rule__Primary__Group_4_6__1"
    // InternalKPIFormulaDSL.g:4873:1: rule__Primary__Group_4_6__1 : rule__Primary__Group_4_6__1__Impl rule__Primary__Group_4_6__2 ;
    public final void rule__Primary__Group_4_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4877:1: ( rule__Primary__Group_4_6__1__Impl rule__Primary__Group_4_6__2 )
            // InternalKPIFormulaDSL.g:4878:2: rule__Primary__Group_4_6__1__Impl rule__Primary__Group_4_6__2
            {
            pushFollow(FOLLOW_56);
            rule__Primary__Group_4_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_4_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4_6__1"


    // $ANTLR start "rule__Primary__Group_4_6__1__Impl"
    // InternalKPIFormulaDSL.g:4885:1: rule__Primary__Group_4_6__1__Impl : ( ( rule__Primary__ExpressionsAssignment_4_6_1 ) ) ;
    public final void rule__Primary__Group_4_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4889:1: ( ( ( rule__Primary__ExpressionsAssignment_4_6_1 ) ) )
            // InternalKPIFormulaDSL.g:4890:1: ( ( rule__Primary__ExpressionsAssignment_4_6_1 ) )
            {
            // InternalKPIFormulaDSL.g:4890:1: ( ( rule__Primary__ExpressionsAssignment_4_6_1 ) )
            // InternalKPIFormulaDSL.g:4891:2: ( rule__Primary__ExpressionsAssignment_4_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionsAssignment_4_6_1()); 
            }
            // InternalKPIFormulaDSL.g:4892:2: ( rule__Primary__ExpressionsAssignment_4_6_1 )
            // InternalKPIFormulaDSL.g:4892:3: rule__Primary__ExpressionsAssignment_4_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionsAssignment_4_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionsAssignment_4_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4_6__1__Impl"


    // $ANTLR start "rule__Primary__Group_4_6__2"
    // InternalKPIFormulaDSL.g:4900:1: rule__Primary__Group_4_6__2 : rule__Primary__Group_4_6__2__Impl rule__Primary__Group_4_6__3 ;
    public final void rule__Primary__Group_4_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4904:1: ( rule__Primary__Group_4_6__2__Impl rule__Primary__Group_4_6__3 )
            // InternalKPIFormulaDSL.g:4905:2: rule__Primary__Group_4_6__2__Impl rule__Primary__Group_4_6__3
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_4_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_4_6__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4_6__2"


    // $ANTLR start "rule__Primary__Group_4_6__2__Impl"
    // InternalKPIFormulaDSL.g:4912:1: rule__Primary__Group_4_6__2__Impl : ( ':' ) ;
    public final void rule__Primary__Group_4_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4916:1: ( ( ':' ) )
            // InternalKPIFormulaDSL.g:4917:1: ( ':' )
            {
            // InternalKPIFormulaDSL.g:4917:1: ( ':' )
            // InternalKPIFormulaDSL.g:4918:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getColonKeyword_4_6_2()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getColonKeyword_4_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4_6__2__Impl"


    // $ANTLR start "rule__Primary__Group_4_6__3"
    // InternalKPIFormulaDSL.g:4927:1: rule__Primary__Group_4_6__3 : rule__Primary__Group_4_6__3__Impl ;
    public final void rule__Primary__Group_4_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4931:1: ( rule__Primary__Group_4_6__3__Impl )
            // InternalKPIFormulaDSL.g:4932:2: rule__Primary__Group_4_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_4_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4_6__3"


    // $ANTLR start "rule__Primary__Group_4_6__3__Impl"
    // InternalKPIFormulaDSL.g:4938:1: rule__Primary__Group_4_6__3__Impl : ( ( rule__Primary__WeightsAssignment_4_6_3 ) ) ;
    public final void rule__Primary__Group_4_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4942:1: ( ( ( rule__Primary__WeightsAssignment_4_6_3 ) ) )
            // InternalKPIFormulaDSL.g:4943:1: ( ( rule__Primary__WeightsAssignment_4_6_3 ) )
            {
            // InternalKPIFormulaDSL.g:4943:1: ( ( rule__Primary__WeightsAssignment_4_6_3 ) )
            // InternalKPIFormulaDSL.g:4944:2: ( rule__Primary__WeightsAssignment_4_6_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getWeightsAssignment_4_6_3()); 
            }
            // InternalKPIFormulaDSL.g:4945:2: ( rule__Primary__WeightsAssignment_4_6_3 )
            // InternalKPIFormulaDSL.g:4945:3: rule__Primary__WeightsAssignment_4_6_3
            {
            pushFollow(FOLLOW_2);
            rule__Primary__WeightsAssignment_4_6_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getWeightsAssignment_4_6_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_4_6__3__Impl"


    // $ANTLR start "rule__Primary__Group_5__0"
    // InternalKPIFormulaDSL.g:4954:1: rule__Primary__Group_5__0 : rule__Primary__Group_5__0__Impl rule__Primary__Group_5__1 ;
    public final void rule__Primary__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4958:1: ( rule__Primary__Group_5__0__Impl rule__Primary__Group_5__1 )
            // InternalKPIFormulaDSL.g:4959:2: rule__Primary__Group_5__0__Impl rule__Primary__Group_5__1
            {
            pushFollow(FOLLOW_57);
            rule__Primary__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5__0"


    // $ANTLR start "rule__Primary__Group_5__0__Impl"
    // InternalKPIFormulaDSL.g:4966:1: rule__Primary__Group_5__0__Impl : ( () ) ;
    public final void rule__Primary__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4970:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4971:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4971:1: ( () )
            // InternalKPIFormulaDSL.g:4972:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getMinOpAction_5_0()); 
            }
            // InternalKPIFormulaDSL.g:4973:2: ()
            // InternalKPIFormulaDSL.g:4973:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getMinOpAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5__0__Impl"


    // $ANTLR start "rule__Primary__Group_5__1"
    // InternalKPIFormulaDSL.g:4981:1: rule__Primary__Group_5__1 : rule__Primary__Group_5__1__Impl rule__Primary__Group_5__2 ;
    public final void rule__Primary__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4985:1: ( rule__Primary__Group_5__1__Impl rule__Primary__Group_5__2 )
            // InternalKPIFormulaDSL.g:4986:2: rule__Primary__Group_5__1__Impl rule__Primary__Group_5__2
            {
            pushFollow(FOLLOW_52);
            rule__Primary__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5__1"


    // $ANTLR start "rule__Primary__Group_5__1__Impl"
    // InternalKPIFormulaDSL.g:4993:1: rule__Primary__Group_5__1__Impl : ( 'MIN' ) ;
    public final void rule__Primary__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4997:1: ( ( 'MIN' ) )
            // InternalKPIFormulaDSL.g:4998:1: ( 'MIN' )
            {
            // InternalKPIFormulaDSL.g:4998:1: ( 'MIN' )
            // InternalKPIFormulaDSL.g:4999:2: 'MIN'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getMINKeyword_5_1()); 
            }
            match(input,68,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getMINKeyword_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5__1__Impl"


    // $ANTLR start "rule__Primary__Group_5__2"
    // InternalKPIFormulaDSL.g:5008:1: rule__Primary__Group_5__2 : rule__Primary__Group_5__2__Impl rule__Primary__Group_5__3 ;
    public final void rule__Primary__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5012:1: ( rule__Primary__Group_5__2__Impl rule__Primary__Group_5__3 )
            // InternalKPIFormulaDSL.g:5013:2: rule__Primary__Group_5__2__Impl rule__Primary__Group_5__3
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_5__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5__2"


    // $ANTLR start "rule__Primary__Group_5__2__Impl"
    // InternalKPIFormulaDSL.g:5020:1: rule__Primary__Group_5__2__Impl : ( '(' ) ;
    public final void rule__Primary__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5024:1: ( ( '(' ) )
            // InternalKPIFormulaDSL.g:5025:1: ( '(' )
            {
            // InternalKPIFormulaDSL.g:5025:1: ( '(' )
            // InternalKPIFormulaDSL.g:5026:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_5_2()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5__2__Impl"


    // $ANTLR start "rule__Primary__Group_5__3"
    // InternalKPIFormulaDSL.g:5035:1: rule__Primary__Group_5__3 : rule__Primary__Group_5__3__Impl rule__Primary__Group_5__4 ;
    public final void rule__Primary__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5039:1: ( rule__Primary__Group_5__3__Impl rule__Primary__Group_5__4 )
            // InternalKPIFormulaDSL.g:5040:2: rule__Primary__Group_5__3__Impl rule__Primary__Group_5__4
            {
            pushFollow(FOLLOW_53);
            rule__Primary__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_5__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5__3"


    // $ANTLR start "rule__Primary__Group_5__3__Impl"
    // InternalKPIFormulaDSL.g:5047:1: rule__Primary__Group_5__3__Impl : ( ( rule__Primary__ExpressionsAssignment_5_3 ) ) ;
    public final void rule__Primary__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5051:1: ( ( ( rule__Primary__ExpressionsAssignment_5_3 ) ) )
            // InternalKPIFormulaDSL.g:5052:1: ( ( rule__Primary__ExpressionsAssignment_5_3 ) )
            {
            // InternalKPIFormulaDSL.g:5052:1: ( ( rule__Primary__ExpressionsAssignment_5_3 ) )
            // InternalKPIFormulaDSL.g:5053:2: ( rule__Primary__ExpressionsAssignment_5_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionsAssignment_5_3()); 
            }
            // InternalKPIFormulaDSL.g:5054:2: ( rule__Primary__ExpressionsAssignment_5_3 )
            // InternalKPIFormulaDSL.g:5054:3: rule__Primary__ExpressionsAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionsAssignment_5_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionsAssignment_5_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5__3__Impl"


    // $ANTLR start "rule__Primary__Group_5__4"
    // InternalKPIFormulaDSL.g:5062:1: rule__Primary__Group_5__4 : rule__Primary__Group_5__4__Impl rule__Primary__Group_5__5 ;
    public final void rule__Primary__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5066:1: ( rule__Primary__Group_5__4__Impl rule__Primary__Group_5__5 )
            // InternalKPIFormulaDSL.g:5067:2: rule__Primary__Group_5__4__Impl rule__Primary__Group_5__5
            {
            pushFollow(FOLLOW_53);
            rule__Primary__Group_5__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_5__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5__4"


    // $ANTLR start "rule__Primary__Group_5__4__Impl"
    // InternalKPIFormulaDSL.g:5074:1: rule__Primary__Group_5__4__Impl : ( ( rule__Primary__Group_5_4__0 )* ) ;
    public final void rule__Primary__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5078:1: ( ( ( rule__Primary__Group_5_4__0 )* ) )
            // InternalKPIFormulaDSL.g:5079:1: ( ( rule__Primary__Group_5_4__0 )* )
            {
            // InternalKPIFormulaDSL.g:5079:1: ( ( rule__Primary__Group_5_4__0 )* )
            // InternalKPIFormulaDSL.g:5080:2: ( rule__Primary__Group_5_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getGroup_5_4()); 
            }
            // InternalKPIFormulaDSL.g:5081:2: ( rule__Primary__Group_5_4__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==65) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:5081:3: rule__Primary__Group_5_4__0
            	    {
            	    pushFollow(FOLLOW_54);
            	    rule__Primary__Group_5_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getGroup_5_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5__4__Impl"


    // $ANTLR start "rule__Primary__Group_5__5"
    // InternalKPIFormulaDSL.g:5089:1: rule__Primary__Group_5__5 : rule__Primary__Group_5__5__Impl ;
    public final void rule__Primary__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5093:1: ( rule__Primary__Group_5__5__Impl )
            // InternalKPIFormulaDSL.g:5094:2: rule__Primary__Group_5__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_5__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5__5"


    // $ANTLR start "rule__Primary__Group_5__5__Impl"
    // InternalKPIFormulaDSL.g:5100:1: rule__Primary__Group_5__5__Impl : ( ')' ) ;
    public final void rule__Primary__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5104:1: ( ( ')' ) )
            // InternalKPIFormulaDSL.g:5105:1: ( ')' )
            {
            // InternalKPIFormulaDSL.g:5105:1: ( ')' )
            // InternalKPIFormulaDSL.g:5106:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_5_5()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_5_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5__5__Impl"


    // $ANTLR start "rule__Primary__Group_5_4__0"
    // InternalKPIFormulaDSL.g:5116:1: rule__Primary__Group_5_4__0 : rule__Primary__Group_5_4__0__Impl rule__Primary__Group_5_4__1 ;
    public final void rule__Primary__Group_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5120:1: ( rule__Primary__Group_5_4__0__Impl rule__Primary__Group_5_4__1 )
            // InternalKPIFormulaDSL.g:5121:2: rule__Primary__Group_5_4__0__Impl rule__Primary__Group_5_4__1
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_5_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_5_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5_4__0"


    // $ANTLR start "rule__Primary__Group_5_4__0__Impl"
    // InternalKPIFormulaDSL.g:5128:1: rule__Primary__Group_5_4__0__Impl : ( ',' ) ;
    public final void rule__Primary__Group_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5132:1: ( ( ',' ) )
            // InternalKPIFormulaDSL.g:5133:1: ( ',' )
            {
            // InternalKPIFormulaDSL.g:5133:1: ( ',' )
            // InternalKPIFormulaDSL.g:5134:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getCommaKeyword_5_4_0()); 
            }
            match(input,65,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getCommaKeyword_5_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5_4__0__Impl"


    // $ANTLR start "rule__Primary__Group_5_4__1"
    // InternalKPIFormulaDSL.g:5143:1: rule__Primary__Group_5_4__1 : rule__Primary__Group_5_4__1__Impl ;
    public final void rule__Primary__Group_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5147:1: ( rule__Primary__Group_5_4__1__Impl )
            // InternalKPIFormulaDSL.g:5148:2: rule__Primary__Group_5_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_5_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5_4__1"


    // $ANTLR start "rule__Primary__Group_5_4__1__Impl"
    // InternalKPIFormulaDSL.g:5154:1: rule__Primary__Group_5_4__1__Impl : ( ( rule__Primary__ExpressionsAssignment_5_4_1 ) ) ;
    public final void rule__Primary__Group_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5158:1: ( ( ( rule__Primary__ExpressionsAssignment_5_4_1 ) ) )
            // InternalKPIFormulaDSL.g:5159:1: ( ( rule__Primary__ExpressionsAssignment_5_4_1 ) )
            {
            // InternalKPIFormulaDSL.g:5159:1: ( ( rule__Primary__ExpressionsAssignment_5_4_1 ) )
            // InternalKPIFormulaDSL.g:5160:2: ( rule__Primary__ExpressionsAssignment_5_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionsAssignment_5_4_1()); 
            }
            // InternalKPIFormulaDSL.g:5161:2: ( rule__Primary__ExpressionsAssignment_5_4_1 )
            // InternalKPIFormulaDSL.g:5161:3: rule__Primary__ExpressionsAssignment_5_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionsAssignment_5_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionsAssignment_5_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_5_4__1__Impl"


    // $ANTLR start "rule__Primary__Group_6__0"
    // InternalKPIFormulaDSL.g:5170:1: rule__Primary__Group_6__0 : rule__Primary__Group_6__0__Impl rule__Primary__Group_6__1 ;
    public final void rule__Primary__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5174:1: ( rule__Primary__Group_6__0__Impl rule__Primary__Group_6__1 )
            // InternalKPIFormulaDSL.g:5175:2: rule__Primary__Group_6__0__Impl rule__Primary__Group_6__1
            {
            pushFollow(FOLLOW_58);
            rule__Primary__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6__0"


    // $ANTLR start "rule__Primary__Group_6__0__Impl"
    // InternalKPIFormulaDSL.g:5182:1: rule__Primary__Group_6__0__Impl : ( () ) ;
    public final void rule__Primary__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5186:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:5187:1: ( () )
            {
            // InternalKPIFormulaDSL.g:5187:1: ( () )
            // InternalKPIFormulaDSL.g:5188:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getMaxOpAction_6_0()); 
            }
            // InternalKPIFormulaDSL.g:5189:2: ()
            // InternalKPIFormulaDSL.g:5189:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getMaxOpAction_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6__0__Impl"


    // $ANTLR start "rule__Primary__Group_6__1"
    // InternalKPIFormulaDSL.g:5197:1: rule__Primary__Group_6__1 : rule__Primary__Group_6__1__Impl rule__Primary__Group_6__2 ;
    public final void rule__Primary__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5201:1: ( rule__Primary__Group_6__1__Impl rule__Primary__Group_6__2 )
            // InternalKPIFormulaDSL.g:5202:2: rule__Primary__Group_6__1__Impl rule__Primary__Group_6__2
            {
            pushFollow(FOLLOW_52);
            rule__Primary__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6__1"


    // $ANTLR start "rule__Primary__Group_6__1__Impl"
    // InternalKPIFormulaDSL.g:5209:1: rule__Primary__Group_6__1__Impl : ( 'MAX' ) ;
    public final void rule__Primary__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5213:1: ( ( 'MAX' ) )
            // InternalKPIFormulaDSL.g:5214:1: ( 'MAX' )
            {
            // InternalKPIFormulaDSL.g:5214:1: ( 'MAX' )
            // InternalKPIFormulaDSL.g:5215:2: 'MAX'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getMAXKeyword_6_1()); 
            }
            match(input,69,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getMAXKeyword_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6__1__Impl"


    // $ANTLR start "rule__Primary__Group_6__2"
    // InternalKPIFormulaDSL.g:5224:1: rule__Primary__Group_6__2 : rule__Primary__Group_6__2__Impl rule__Primary__Group_6__3 ;
    public final void rule__Primary__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5228:1: ( rule__Primary__Group_6__2__Impl rule__Primary__Group_6__3 )
            // InternalKPIFormulaDSL.g:5229:2: rule__Primary__Group_6__2__Impl rule__Primary__Group_6__3
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_6__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6__2"


    // $ANTLR start "rule__Primary__Group_6__2__Impl"
    // InternalKPIFormulaDSL.g:5236:1: rule__Primary__Group_6__2__Impl : ( '(' ) ;
    public final void rule__Primary__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5240:1: ( ( '(' ) )
            // InternalKPIFormulaDSL.g:5241:1: ( '(' )
            {
            // InternalKPIFormulaDSL.g:5241:1: ( '(' )
            // InternalKPIFormulaDSL.g:5242:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_6_2()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6__2__Impl"


    // $ANTLR start "rule__Primary__Group_6__3"
    // InternalKPIFormulaDSL.g:5251:1: rule__Primary__Group_6__3 : rule__Primary__Group_6__3__Impl rule__Primary__Group_6__4 ;
    public final void rule__Primary__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5255:1: ( rule__Primary__Group_6__3__Impl rule__Primary__Group_6__4 )
            // InternalKPIFormulaDSL.g:5256:2: rule__Primary__Group_6__3__Impl rule__Primary__Group_6__4
            {
            pushFollow(FOLLOW_53);
            rule__Primary__Group_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_6__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6__3"


    // $ANTLR start "rule__Primary__Group_6__3__Impl"
    // InternalKPIFormulaDSL.g:5263:1: rule__Primary__Group_6__3__Impl : ( ( rule__Primary__ExpressionsAssignment_6_3 ) ) ;
    public final void rule__Primary__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5267:1: ( ( ( rule__Primary__ExpressionsAssignment_6_3 ) ) )
            // InternalKPIFormulaDSL.g:5268:1: ( ( rule__Primary__ExpressionsAssignment_6_3 ) )
            {
            // InternalKPIFormulaDSL.g:5268:1: ( ( rule__Primary__ExpressionsAssignment_6_3 ) )
            // InternalKPIFormulaDSL.g:5269:2: ( rule__Primary__ExpressionsAssignment_6_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionsAssignment_6_3()); 
            }
            // InternalKPIFormulaDSL.g:5270:2: ( rule__Primary__ExpressionsAssignment_6_3 )
            // InternalKPIFormulaDSL.g:5270:3: rule__Primary__ExpressionsAssignment_6_3
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionsAssignment_6_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionsAssignment_6_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6__3__Impl"


    // $ANTLR start "rule__Primary__Group_6__4"
    // InternalKPIFormulaDSL.g:5278:1: rule__Primary__Group_6__4 : rule__Primary__Group_6__4__Impl rule__Primary__Group_6__5 ;
    public final void rule__Primary__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5282:1: ( rule__Primary__Group_6__4__Impl rule__Primary__Group_6__5 )
            // InternalKPIFormulaDSL.g:5283:2: rule__Primary__Group_6__4__Impl rule__Primary__Group_6__5
            {
            pushFollow(FOLLOW_53);
            rule__Primary__Group_6__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_6__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6__4"


    // $ANTLR start "rule__Primary__Group_6__4__Impl"
    // InternalKPIFormulaDSL.g:5290:1: rule__Primary__Group_6__4__Impl : ( ( rule__Primary__Group_6_4__0 )* ) ;
    public final void rule__Primary__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5294:1: ( ( ( rule__Primary__Group_6_4__0 )* ) )
            // InternalKPIFormulaDSL.g:5295:1: ( ( rule__Primary__Group_6_4__0 )* )
            {
            // InternalKPIFormulaDSL.g:5295:1: ( ( rule__Primary__Group_6_4__0 )* )
            // InternalKPIFormulaDSL.g:5296:2: ( rule__Primary__Group_6_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getGroup_6_4()); 
            }
            // InternalKPIFormulaDSL.g:5297:2: ( rule__Primary__Group_6_4__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==65) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:5297:3: rule__Primary__Group_6_4__0
            	    {
            	    pushFollow(FOLLOW_54);
            	    rule__Primary__Group_6_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getGroup_6_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6__4__Impl"


    // $ANTLR start "rule__Primary__Group_6__5"
    // InternalKPIFormulaDSL.g:5305:1: rule__Primary__Group_6__5 : rule__Primary__Group_6__5__Impl ;
    public final void rule__Primary__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5309:1: ( rule__Primary__Group_6__5__Impl )
            // InternalKPIFormulaDSL.g:5310:2: rule__Primary__Group_6__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_6__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6__5"


    // $ANTLR start "rule__Primary__Group_6__5__Impl"
    // InternalKPIFormulaDSL.g:5316:1: rule__Primary__Group_6__5__Impl : ( ')' ) ;
    public final void rule__Primary__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5320:1: ( ( ')' ) )
            // InternalKPIFormulaDSL.g:5321:1: ( ')' )
            {
            // InternalKPIFormulaDSL.g:5321:1: ( ')' )
            // InternalKPIFormulaDSL.g:5322:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_6_5()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_6_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6__5__Impl"


    // $ANTLR start "rule__Primary__Group_6_4__0"
    // InternalKPIFormulaDSL.g:5332:1: rule__Primary__Group_6_4__0 : rule__Primary__Group_6_4__0__Impl rule__Primary__Group_6_4__1 ;
    public final void rule__Primary__Group_6_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5336:1: ( rule__Primary__Group_6_4__0__Impl rule__Primary__Group_6_4__1 )
            // InternalKPIFormulaDSL.g:5337:2: rule__Primary__Group_6_4__0__Impl rule__Primary__Group_6_4__1
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_6_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_6_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6_4__0"


    // $ANTLR start "rule__Primary__Group_6_4__0__Impl"
    // InternalKPIFormulaDSL.g:5344:1: rule__Primary__Group_6_4__0__Impl : ( ',' ) ;
    public final void rule__Primary__Group_6_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5348:1: ( ( ',' ) )
            // InternalKPIFormulaDSL.g:5349:1: ( ',' )
            {
            // InternalKPIFormulaDSL.g:5349:1: ( ',' )
            // InternalKPIFormulaDSL.g:5350:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getCommaKeyword_6_4_0()); 
            }
            match(input,65,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getCommaKeyword_6_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6_4__0__Impl"


    // $ANTLR start "rule__Primary__Group_6_4__1"
    // InternalKPIFormulaDSL.g:5359:1: rule__Primary__Group_6_4__1 : rule__Primary__Group_6_4__1__Impl ;
    public final void rule__Primary__Group_6_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5363:1: ( rule__Primary__Group_6_4__1__Impl )
            // InternalKPIFormulaDSL.g:5364:2: rule__Primary__Group_6_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_6_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6_4__1"


    // $ANTLR start "rule__Primary__Group_6_4__1__Impl"
    // InternalKPIFormulaDSL.g:5370:1: rule__Primary__Group_6_4__1__Impl : ( ( rule__Primary__ExpressionsAssignment_6_4_1 ) ) ;
    public final void rule__Primary__Group_6_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5374:1: ( ( ( rule__Primary__ExpressionsAssignment_6_4_1 ) ) )
            // InternalKPIFormulaDSL.g:5375:1: ( ( rule__Primary__ExpressionsAssignment_6_4_1 ) )
            {
            // InternalKPIFormulaDSL.g:5375:1: ( ( rule__Primary__ExpressionsAssignment_6_4_1 ) )
            // InternalKPIFormulaDSL.g:5376:2: ( rule__Primary__ExpressionsAssignment_6_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionsAssignment_6_4_1()); 
            }
            // InternalKPIFormulaDSL.g:5377:2: ( rule__Primary__ExpressionsAssignment_6_4_1 )
            // InternalKPIFormulaDSL.g:5377:3: rule__Primary__ExpressionsAssignment_6_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionsAssignment_6_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionsAssignment_6_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_6_4__1__Impl"


    // $ANTLR start "rule__Primary__Group_7__0"
    // InternalKPIFormulaDSL.g:5386:1: rule__Primary__Group_7__0 : rule__Primary__Group_7__0__Impl rule__Primary__Group_7__1 ;
    public final void rule__Primary__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5390:1: ( rule__Primary__Group_7__0__Impl rule__Primary__Group_7__1 )
            // InternalKPIFormulaDSL.g:5391:2: rule__Primary__Group_7__0__Impl rule__Primary__Group_7__1
            {
            pushFollow(FOLLOW_59);
            rule__Primary__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_7__0"


    // $ANTLR start "rule__Primary__Group_7__0__Impl"
    // InternalKPIFormulaDSL.g:5398:1: rule__Primary__Group_7__0__Impl : ( () ) ;
    public final void rule__Primary__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5402:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:5403:1: ( () )
            {
            // InternalKPIFormulaDSL.g:5403:1: ( () )
            // InternalKPIFormulaDSL.g:5404:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getThresholdOpAction_7_0()); 
            }
            // InternalKPIFormulaDSL.g:5405:2: ()
            // InternalKPIFormulaDSL.g:5405:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getThresholdOpAction_7_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_7__0__Impl"


    // $ANTLR start "rule__Primary__Group_7__1"
    // InternalKPIFormulaDSL.g:5413:1: rule__Primary__Group_7__1 : rule__Primary__Group_7__1__Impl rule__Primary__Group_7__2 ;
    public final void rule__Primary__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5417:1: ( rule__Primary__Group_7__1__Impl rule__Primary__Group_7__2 )
            // InternalKPIFormulaDSL.g:5418:2: rule__Primary__Group_7__1__Impl rule__Primary__Group_7__2
            {
            pushFollow(FOLLOW_52);
            rule__Primary__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_7__1"


    // $ANTLR start "rule__Primary__Group_7__1__Impl"
    // InternalKPIFormulaDSL.g:5425:1: rule__Primary__Group_7__1__Impl : ( 'THRESHOLD' ) ;
    public final void rule__Primary__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5429:1: ( ( 'THRESHOLD' ) )
            // InternalKPIFormulaDSL.g:5430:1: ( 'THRESHOLD' )
            {
            // InternalKPIFormulaDSL.g:5430:1: ( 'THRESHOLD' )
            // InternalKPIFormulaDSL.g:5431:2: 'THRESHOLD'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getTHRESHOLDKeyword_7_1()); 
            }
            match(input,70,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getTHRESHOLDKeyword_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_7__1__Impl"


    // $ANTLR start "rule__Primary__Group_7__2"
    // InternalKPIFormulaDSL.g:5440:1: rule__Primary__Group_7__2 : rule__Primary__Group_7__2__Impl rule__Primary__Group_7__3 ;
    public final void rule__Primary__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5444:1: ( rule__Primary__Group_7__2__Impl rule__Primary__Group_7__3 )
            // InternalKPIFormulaDSL.g:5445:2: rule__Primary__Group_7__2__Impl rule__Primary__Group_7__3
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_7__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_7__2"


    // $ANTLR start "rule__Primary__Group_7__2__Impl"
    // InternalKPIFormulaDSL.g:5452:1: rule__Primary__Group_7__2__Impl : ( '(' ) ;
    public final void rule__Primary__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5456:1: ( ( '(' ) )
            // InternalKPIFormulaDSL.g:5457:1: ( '(' )
            {
            // InternalKPIFormulaDSL.g:5457:1: ( '(' )
            // InternalKPIFormulaDSL.g:5458:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_7_2()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_7__2__Impl"


    // $ANTLR start "rule__Primary__Group_7__3"
    // InternalKPIFormulaDSL.g:5467:1: rule__Primary__Group_7__3 : rule__Primary__Group_7__3__Impl rule__Primary__Group_7__4 ;
    public final void rule__Primary__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5471:1: ( rule__Primary__Group_7__3__Impl rule__Primary__Group_7__4 )
            // InternalKPIFormulaDSL.g:5472:2: rule__Primary__Group_7__3__Impl rule__Primary__Group_7__4
            {
            pushFollow(FOLLOW_60);
            rule__Primary__Group_7__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_7__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_7__3"


    // $ANTLR start "rule__Primary__Group_7__3__Impl"
    // InternalKPIFormulaDSL.g:5479:1: rule__Primary__Group_7__3__Impl : ( ( rule__Primary__ExpressionAssignment_7_3 ) ) ;
    public final void rule__Primary__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5483:1: ( ( ( rule__Primary__ExpressionAssignment_7_3 ) ) )
            // InternalKPIFormulaDSL.g:5484:1: ( ( rule__Primary__ExpressionAssignment_7_3 ) )
            {
            // InternalKPIFormulaDSL.g:5484:1: ( ( rule__Primary__ExpressionAssignment_7_3 ) )
            // InternalKPIFormulaDSL.g:5485:2: ( rule__Primary__ExpressionAssignment_7_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionAssignment_7_3()); 
            }
            // InternalKPIFormulaDSL.g:5486:2: ( rule__Primary__ExpressionAssignment_7_3 )
            // InternalKPIFormulaDSL.g:5486:3: rule__Primary__ExpressionAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_7_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionAssignment_7_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_7__3__Impl"


    // $ANTLR start "rule__Primary__Group_7__4"
    // InternalKPIFormulaDSL.g:5494:1: rule__Primary__Group_7__4 : rule__Primary__Group_7__4__Impl rule__Primary__Group_7__5 ;
    public final void rule__Primary__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5498:1: ( rule__Primary__Group_7__4__Impl rule__Primary__Group_7__5 )
            // InternalKPIFormulaDSL.g:5499:2: rule__Primary__Group_7__4__Impl rule__Primary__Group_7__5
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_7__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_7__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_7__4"


    // $ANTLR start "rule__Primary__Group_7__4__Impl"
    // InternalKPIFormulaDSL.g:5506:1: rule__Primary__Group_7__4__Impl : ( ',' ) ;
    public final void rule__Primary__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5510:1: ( ( ',' ) )
            // InternalKPIFormulaDSL.g:5511:1: ( ',' )
            {
            // InternalKPIFormulaDSL.g:5511:1: ( ',' )
            // InternalKPIFormulaDSL.g:5512:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getCommaKeyword_7_4()); 
            }
            match(input,65,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getCommaKeyword_7_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_7__4__Impl"


    // $ANTLR start "rule__Primary__Group_7__5"
    // InternalKPIFormulaDSL.g:5521:1: rule__Primary__Group_7__5 : rule__Primary__Group_7__5__Impl rule__Primary__Group_7__6 ;
    public final void rule__Primary__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5525:1: ( rule__Primary__Group_7__5__Impl rule__Primary__Group_7__6 )
            // InternalKPIFormulaDSL.g:5526:2: rule__Primary__Group_7__5__Impl rule__Primary__Group_7__6
            {
            pushFollow(FOLLOW_48);
            rule__Primary__Group_7__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_7__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_7__5"


    // $ANTLR start "rule__Primary__Group_7__5__Impl"
    // InternalKPIFormulaDSL.g:5533:1: rule__Primary__Group_7__5__Impl : ( ( rule__Primary__ThresholdAssignment_7_5 ) ) ;
    public final void rule__Primary__Group_7__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5537:1: ( ( ( rule__Primary__ThresholdAssignment_7_5 ) ) )
            // InternalKPIFormulaDSL.g:5538:1: ( ( rule__Primary__ThresholdAssignment_7_5 ) )
            {
            // InternalKPIFormulaDSL.g:5538:1: ( ( rule__Primary__ThresholdAssignment_7_5 ) )
            // InternalKPIFormulaDSL.g:5539:2: ( rule__Primary__ThresholdAssignment_7_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getThresholdAssignment_7_5()); 
            }
            // InternalKPIFormulaDSL.g:5540:2: ( rule__Primary__ThresholdAssignment_7_5 )
            // InternalKPIFormulaDSL.g:5540:3: rule__Primary__ThresholdAssignment_7_5
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ThresholdAssignment_7_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getThresholdAssignment_7_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_7__5__Impl"


    // $ANTLR start "rule__Primary__Group_7__6"
    // InternalKPIFormulaDSL.g:5548:1: rule__Primary__Group_7__6 : rule__Primary__Group_7__6__Impl ;
    public final void rule__Primary__Group_7__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5552:1: ( rule__Primary__Group_7__6__Impl )
            // InternalKPIFormulaDSL.g:5553:2: rule__Primary__Group_7__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_7__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_7__6"


    // $ANTLR start "rule__Primary__Group_7__6__Impl"
    // InternalKPIFormulaDSL.g:5559:1: rule__Primary__Group_7__6__Impl : ( ')' ) ;
    public final void rule__Primary__Group_7__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5563:1: ( ( ')' ) )
            // InternalKPIFormulaDSL.g:5564:1: ( ')' )
            {
            // InternalKPIFormulaDSL.g:5564:1: ( ')' )
            // InternalKPIFormulaDSL.g:5565:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_7_6()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_7_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_7__6__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // InternalKPIFormulaDSL.g:5575:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5579:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalKPIFormulaDSL.g:5580:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_18);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // InternalKPIFormulaDSL.g:5587:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5591:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:5592:1: ( () )
            {
            // InternalKPIFormulaDSL.g:5592:1: ( () )
            // InternalKPIFormulaDSL.g:5593:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 
            }
            // InternalKPIFormulaDSL.g:5594:2: ()
            // InternalKPIFormulaDSL.g:5594:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // InternalKPIFormulaDSL.g:5602:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5606:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalKPIFormulaDSL.g:5607:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // InternalKPIFormulaDSL.g:5613:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5617:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalKPIFormulaDSL.g:5618:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalKPIFormulaDSL.g:5618:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalKPIFormulaDSL.g:5619:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            }
            // InternalKPIFormulaDSL.g:5620:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalKPIFormulaDSL.g:5620:3: rule__Atomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_1__0"
    // InternalKPIFormulaDSL.g:5629:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5633:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalKPIFormulaDSL.g:5634:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_61);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // InternalKPIFormulaDSL.g:5641:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5645:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:5646:1: ( () )
            {
            // InternalKPIFormulaDSL.g:5646:1: ( () )
            // InternalKPIFormulaDSL.g:5647:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getRealConstantAction_1_0()); 
            }
            // InternalKPIFormulaDSL.g:5648:2: ()
            // InternalKPIFormulaDSL.g:5648:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getRealConstantAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // InternalKPIFormulaDSL.g:5656:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5660:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalKPIFormulaDSL.g:5661:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // InternalKPIFormulaDSL.g:5667:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5671:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // InternalKPIFormulaDSL.g:5672:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // InternalKPIFormulaDSL.g:5672:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // InternalKPIFormulaDSL.g:5673:2: ( rule__Atomic__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            }
            // InternalKPIFormulaDSL.g:5674:2: ( rule__Atomic__ValueAssignment_1_1 )
            // InternalKPIFormulaDSL.g:5674:3: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // InternalKPIFormulaDSL.g:5683:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5687:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalKPIFormulaDSL.g:5688:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_62);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // InternalKPIFormulaDSL.g:5695:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5699:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:5700:1: ( () )
            {
            // InternalKPIFormulaDSL.g:5700:1: ( () )
            // InternalKPIFormulaDSL.g:5701:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getTextConstantAction_2_0()); 
            }
            // InternalKPIFormulaDSL.g:5702:2: ()
            // InternalKPIFormulaDSL.g:5702:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getTextConstantAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // InternalKPIFormulaDSL.g:5710:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5714:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalKPIFormulaDSL.g:5715:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // InternalKPIFormulaDSL.g:5721:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5725:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalKPIFormulaDSL.g:5726:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalKPIFormulaDSL.g:5726:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalKPIFormulaDSL.g:5727:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            }
            // InternalKPIFormulaDSL.g:5728:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalKPIFormulaDSL.g:5728:3: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__Atomic__Group_3__0"
    // InternalKPIFormulaDSL.g:5737:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5741:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // InternalKPIFormulaDSL.g:5742:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_63);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0"


    // $ANTLR start "rule__Atomic__Group_3__0__Impl"
    // InternalKPIFormulaDSL.g:5749:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5753:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:5754:1: ( () )
            {
            // InternalKPIFormulaDSL.g:5754:1: ( () )
            // InternalKPIFormulaDSL.g:5755:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getBoolConstantAction_3_0()); 
            }
            // InternalKPIFormulaDSL.g:5756:2: ()
            // InternalKPIFormulaDSL.g:5756:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getBoolConstantAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0__Impl"


    // $ANTLR start "rule__Atomic__Group_3__1"
    // InternalKPIFormulaDSL.g:5764:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5768:1: ( rule__Atomic__Group_3__1__Impl )
            // InternalKPIFormulaDSL.g:5769:2: rule__Atomic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__1"


    // $ANTLR start "rule__Atomic__Group_3__1__Impl"
    // InternalKPIFormulaDSL.g:5775:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__ValueAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5779:1: ( ( ( rule__Atomic__ValueAssignment_3_1 ) ) )
            // InternalKPIFormulaDSL.g:5780:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            {
            // InternalKPIFormulaDSL.g:5780:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            // InternalKPIFormulaDSL.g:5781:2: ( rule__Atomic__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 
            }
            // InternalKPIFormulaDSL.g:5782:2: ( rule__Atomic__ValueAssignment_3_1 )
            // InternalKPIFormulaDSL.g:5782:3: rule__Atomic__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__1__Impl"


    // $ANTLR start "rule__Atomic__Group_4__0"
    // InternalKPIFormulaDSL.g:5791:1: rule__Atomic__Group_4__0 : rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 ;
    public final void rule__Atomic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5795:1: ( rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 )
            // InternalKPIFormulaDSL.g:5796:2: rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1
            {
            pushFollow(FOLLOW_61);
            rule__Atomic__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__0"


    // $ANTLR start "rule__Atomic__Group_4__0__Impl"
    // InternalKPIFormulaDSL.g:5803:1: rule__Atomic__Group_4__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5807:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:5808:1: ( () )
            {
            // InternalKPIFormulaDSL.g:5808:1: ( () )
            // InternalKPIFormulaDSL.g:5809:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getUnitConstantAction_4_0()); 
            }
            // InternalKPIFormulaDSL.g:5810:2: ()
            // InternalKPIFormulaDSL.g:5810:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getUnitConstantAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__0__Impl"


    // $ANTLR start "rule__Atomic__Group_4__1"
    // InternalKPIFormulaDSL.g:5818:1: rule__Atomic__Group_4__1 : rule__Atomic__Group_4__1__Impl rule__Atomic__Group_4__2 ;
    public final void rule__Atomic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5822:1: ( rule__Atomic__Group_4__1__Impl rule__Atomic__Group_4__2 )
            // InternalKPIFormulaDSL.g:5823:2: rule__Atomic__Group_4__1__Impl rule__Atomic__Group_4__2
            {
            pushFollow(FOLLOW_10);
            rule__Atomic__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__1"


    // $ANTLR start "rule__Atomic__Group_4__1__Impl"
    // InternalKPIFormulaDSL.g:5830:1: rule__Atomic__Group_4__1__Impl : ( ( rule__Atomic__ValueAssignment_4_1 ) ) ;
    public final void rule__Atomic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5834:1: ( ( ( rule__Atomic__ValueAssignment_4_1 ) ) )
            // InternalKPIFormulaDSL.g:5835:1: ( ( rule__Atomic__ValueAssignment_4_1 ) )
            {
            // InternalKPIFormulaDSL.g:5835:1: ( ( rule__Atomic__ValueAssignment_4_1 ) )
            // InternalKPIFormulaDSL.g:5836:2: ( rule__Atomic__ValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_4_1()); 
            }
            // InternalKPIFormulaDSL.g:5837:2: ( rule__Atomic__ValueAssignment_4_1 )
            // InternalKPIFormulaDSL.g:5837:3: rule__Atomic__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__1__Impl"


    // $ANTLR start "rule__Atomic__Group_4__2"
    // InternalKPIFormulaDSL.g:5845:1: rule__Atomic__Group_4__2 : rule__Atomic__Group_4__2__Impl ;
    public final void rule__Atomic__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5849:1: ( rule__Atomic__Group_4__2__Impl )
            // InternalKPIFormulaDSL.g:5850:2: rule__Atomic__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__2"


    // $ANTLR start "rule__Atomic__Group_4__2__Impl"
    // InternalKPIFormulaDSL.g:5856:1: rule__Atomic__Group_4__2__Impl : ( ( rule__Atomic__UnitAssignment_4_2 ) ) ;
    public final void rule__Atomic__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5860:1: ( ( ( rule__Atomic__UnitAssignment_4_2 ) ) )
            // InternalKPIFormulaDSL.g:5861:1: ( ( rule__Atomic__UnitAssignment_4_2 ) )
            {
            // InternalKPIFormulaDSL.g:5861:1: ( ( rule__Atomic__UnitAssignment_4_2 ) )
            // InternalKPIFormulaDSL.g:5862:2: ( rule__Atomic__UnitAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getUnitAssignment_4_2()); 
            }
            // InternalKPIFormulaDSL.g:5863:2: ( rule__Atomic__UnitAssignment_4_2 )
            // InternalKPIFormulaDSL.g:5863:3: rule__Atomic__UnitAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__UnitAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getUnitAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__2__Impl"


    // $ANTLR start "rule__Atomic__Group_5__0"
    // InternalKPIFormulaDSL.g:5872:1: rule__Atomic__Group_5__0 : rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1 ;
    public final void rule__Atomic__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5876:1: ( rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1 )
            // InternalKPIFormulaDSL.g:5877:2: rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1
            {
            pushFollow(FOLLOW_64);
            rule__Atomic__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_5__0"


    // $ANTLR start "rule__Atomic__Group_5__0__Impl"
    // InternalKPIFormulaDSL.g:5884:1: rule__Atomic__Group_5__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5888:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:5889:1: ( () )
            {
            // InternalKPIFormulaDSL.g:5889:1: ( () )
            // InternalKPIFormulaDSL.g:5890:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getEnumLiteralRefAction_5_0()); 
            }
            // InternalKPIFormulaDSL.g:5891:2: ()
            // InternalKPIFormulaDSL.g:5891:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getEnumLiteralRefAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_5__0__Impl"


    // $ANTLR start "rule__Atomic__Group_5__1"
    // InternalKPIFormulaDSL.g:5899:1: rule__Atomic__Group_5__1 : rule__Atomic__Group_5__1__Impl ;
    public final void rule__Atomic__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5903:1: ( rule__Atomic__Group_5__1__Impl )
            // InternalKPIFormulaDSL.g:5904:2: rule__Atomic__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_5__1"


    // $ANTLR start "rule__Atomic__Group_5__1__Impl"
    // InternalKPIFormulaDSL.g:5910:1: rule__Atomic__Group_5__1__Impl : ( ( rule__Atomic__LiteralAssignment_5_1 ) ) ;
    public final void rule__Atomic__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5914:1: ( ( ( rule__Atomic__LiteralAssignment_5_1 ) ) )
            // InternalKPIFormulaDSL.g:5915:1: ( ( rule__Atomic__LiteralAssignment_5_1 ) )
            {
            // InternalKPIFormulaDSL.g:5915:1: ( ( rule__Atomic__LiteralAssignment_5_1 ) )
            // InternalKPIFormulaDSL.g:5916:2: ( rule__Atomic__LiteralAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getLiteralAssignment_5_1()); 
            }
            // InternalKPIFormulaDSL.g:5917:2: ( rule__Atomic__LiteralAssignment_5_1 )
            // InternalKPIFormulaDSL.g:5917:3: rule__Atomic__LiteralAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__LiteralAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getLiteralAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_5__1__Impl"


    // $ANTLR start "rule__Atomic__Group_6__0"
    // InternalKPIFormulaDSL.g:5926:1: rule__Atomic__Group_6__0 : rule__Atomic__Group_6__0__Impl rule__Atomic__Group_6__1 ;
    public final void rule__Atomic__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5930:1: ( rule__Atomic__Group_6__0__Impl rule__Atomic__Group_6__1 )
            // InternalKPIFormulaDSL.g:5931:2: rule__Atomic__Group_6__0__Impl rule__Atomic__Group_6__1
            {
            pushFollow(FOLLOW_25);
            rule__Atomic__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_6__0"


    // $ANTLR start "rule__Atomic__Group_6__0__Impl"
    // InternalKPIFormulaDSL.g:5938:1: rule__Atomic__Group_6__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5942:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:5943:1: ( () )
            {
            // InternalKPIFormulaDSL.g:5943:1: ( () )
            // InternalKPIFormulaDSL.g:5944:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getComputableRefAction_6_0()); 
            }
            // InternalKPIFormulaDSL.g:5945:2: ()
            // InternalKPIFormulaDSL.g:5945:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getComputableRefAction_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_6__0__Impl"


    // $ANTLR start "rule__Atomic__Group_6__1"
    // InternalKPIFormulaDSL.g:5953:1: rule__Atomic__Group_6__1 : rule__Atomic__Group_6__1__Impl ;
    public final void rule__Atomic__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5957:1: ( rule__Atomic__Group_6__1__Impl )
            // InternalKPIFormulaDSL.g:5958:2: rule__Atomic__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_6__1"


    // $ANTLR start "rule__Atomic__Group_6__1__Impl"
    // InternalKPIFormulaDSL.g:5964:1: rule__Atomic__Group_6__1__Impl : ( ( rule__Atomic__ComputableAssignment_6_1 ) ) ;
    public final void rule__Atomic__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5968:1: ( ( ( rule__Atomic__ComputableAssignment_6_1 ) ) )
            // InternalKPIFormulaDSL.g:5969:1: ( ( rule__Atomic__ComputableAssignment_6_1 ) )
            {
            // InternalKPIFormulaDSL.g:5969:1: ( ( rule__Atomic__ComputableAssignment_6_1 ) )
            // InternalKPIFormulaDSL.g:5970:2: ( rule__Atomic__ComputableAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getComputableAssignment_6_1()); 
            }
            // InternalKPIFormulaDSL.g:5971:2: ( rule__Atomic__ComputableAssignment_6_1 )
            // InternalKPIFormulaDSL.g:5971:3: rule__Atomic__ComputableAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ComputableAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getComputableAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_6__1__Impl"


    // $ANTLR start "rule__KPIFormulaDSL__DeclarationsAssignment_0"
    // InternalKPIFormulaDSL.g:5980:1: rule__KPIFormulaDSL__DeclarationsAssignment_0 : ( ruleDeclaration ) ;
    public final void rule__KPIFormulaDSL__DeclarationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5984:1: ( ( ruleDeclaration ) )
            // InternalKPIFormulaDSL.g:5985:2: ( ruleDeclaration )
            {
            // InternalKPIFormulaDSL.g:5985:2: ( ruleDeclaration )
            // InternalKPIFormulaDSL.g:5986:3: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKPIFormulaDSLAccess().getDeclarationsDeclarationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKPIFormulaDSLAccess().getDeclarationsDeclarationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KPIFormulaDSL__DeclarationsAssignment_0"


    // $ANTLR start "rule__KPIFormulaDSL__ComputationsAssignment_1"
    // InternalKPIFormulaDSL.g:5995:1: rule__KPIFormulaDSL__ComputationsAssignment_1 : ( ruleComputation ) ;
    public final void rule__KPIFormulaDSL__ComputationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5999:1: ( ( ruleComputation ) )
            // InternalKPIFormulaDSL.g:6000:2: ( ruleComputation )
            {
            // InternalKPIFormulaDSL.g:6000:2: ( ruleComputation )
            // InternalKPIFormulaDSL.g:6001:3: ruleComputation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKPIFormulaDSLAccess().getComputationsComputationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComputation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKPIFormulaDSLAccess().getComputationsComputationParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KPIFormulaDSL__ComputationsAssignment_1"


    // $ANTLR start "rule__Declaration__DeclaredAssignment"
    // InternalKPIFormulaDSL.g:6010:1: rule__Declaration__DeclaredAssignment : ( ruleDeclarable ) ;
    public final void rule__Declaration__DeclaredAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6014:1: ( ( ruleDeclarable ) )
            // InternalKPIFormulaDSL.g:6015:2: ( ruleDeclarable )
            {
            // InternalKPIFormulaDSL.g:6015:2: ( ruleDeclarable )
            // InternalKPIFormulaDSL.g:6016:3: ruleDeclarable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getDeclaredDeclarableParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeclarable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getDeclaredDeclarableParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__DeclaredAssignment"


    // $ANTLR start "rule__Computation__ComputedAssignment_0"
    // InternalKPIFormulaDSL.g:6025:1: rule__Computation__ComputedAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Computation__ComputedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6029:1: ( ( ( RULE_ID ) ) )
            // InternalKPIFormulaDSL.g:6030:2: ( ( RULE_ID ) )
            {
            // InternalKPIFormulaDSL.g:6030:2: ( ( RULE_ID ) )
            // InternalKPIFormulaDSL.g:6031:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComputationAccess().getComputedComputableCrossReference_0_0()); 
            }
            // InternalKPIFormulaDSL.g:6032:3: ( RULE_ID )
            // InternalKPIFormulaDSL.g:6033:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComputationAccess().getComputedComputableIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComputationAccess().getComputedComputableIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComputationAccess().getComputedComputableCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Computation__ComputedAssignment_0"


    // $ANTLR start "rule__Computation__FormulaAssignment_2"
    // InternalKPIFormulaDSL.g:6044:1: rule__Computation__FormulaAssignment_2 : ( ( rule__Computation__FormulaAlternatives_2_0 ) ) ;
    public final void rule__Computation__FormulaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6048:1: ( ( ( rule__Computation__FormulaAlternatives_2_0 ) ) )
            // InternalKPIFormulaDSL.g:6049:2: ( ( rule__Computation__FormulaAlternatives_2_0 ) )
            {
            // InternalKPIFormulaDSL.g:6049:2: ( ( rule__Computation__FormulaAlternatives_2_0 ) )
            // InternalKPIFormulaDSL.g:6050:3: ( rule__Computation__FormulaAlternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComputationAccess().getFormulaAlternatives_2_0()); 
            }
            // InternalKPIFormulaDSL.g:6051:3: ( rule__Computation__FormulaAlternatives_2_0 )
            // InternalKPIFormulaDSL.g:6051:4: rule__Computation__FormulaAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Computation__FormulaAlternatives_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComputationAccess().getFormulaAlternatives_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Computation__FormulaAssignment_2"


    // $ANTLR start "rule__Metric__NameAssignment_0"
    // InternalKPIFormulaDSL.g:6059:1: rule__Metric__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Metric__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6063:1: ( ( RULE_ID ) )
            // InternalKPIFormulaDSL.g:6064:2: ( RULE_ID )
            {
            // InternalKPIFormulaDSL.g:6064:2: ( RULE_ID )
            // InternalKPIFormulaDSL.g:6065:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__NameAssignment_0"


    // $ANTLR start "rule__Metric__TypeAssignment_3"
    // InternalKPIFormulaDSL.g:6074:1: rule__Metric__TypeAssignment_3 : ( ruleValueType ) ;
    public final void rule__Metric__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6078:1: ( ( ruleValueType ) )
            // InternalKPIFormulaDSL.g:6079:2: ( ruleValueType )
            {
            // InternalKPIFormulaDSL.g:6079:2: ( ruleValueType )
            // InternalKPIFormulaDSL.g:6080:3: ruleValueType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricAccess().getTypeValueTypeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValueType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetricAccess().getTypeValueTypeParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__TypeAssignment_3"


    // $ANTLR start "rule__KPI__NameAssignment_1"
    // InternalKPIFormulaDSL.g:6089:1: rule__KPI__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KPI__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6093:1: ( ( RULE_ID ) )
            // InternalKPIFormulaDSL.g:6094:2: ( RULE_ID )
            {
            // InternalKPIFormulaDSL.g:6094:2: ( RULE_ID )
            // InternalKPIFormulaDSL.g:6095:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKPIAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKPIAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KPI__NameAssignment_1"


    // $ANTLR start "rule__KPI__TypeAssignment_4"
    // InternalKPIFormulaDSL.g:6104:1: rule__KPI__TypeAssignment_4 : ( ruleValueType ) ;
    public final void rule__KPI__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6108:1: ( ( ruleValueType ) )
            // InternalKPIFormulaDSL.g:6109:2: ( ruleValueType )
            {
            // InternalKPIFormulaDSL.g:6109:2: ( ruleValueType )
            // InternalKPIFormulaDSL.g:6110:3: ruleValueType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKPIAccess().getTypeValueTypeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValueType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKPIAccess().getTypeValueTypeParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KPI__TypeAssignment_4"


    // $ANTLR start "rule__EnumerationValue__LiteralsAssignment_1"
    // InternalKPIFormulaDSL.g:6119:1: rule__EnumerationValue__LiteralsAssignment_1 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationValue__LiteralsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6123:1: ( ( ruleEnumerationLiteral ) )
            // InternalKPIFormulaDSL.g:6124:2: ( ruleEnumerationLiteral )
            {
            // InternalKPIFormulaDSL.g:6124:2: ( ruleEnumerationLiteral )
            // InternalKPIFormulaDSL.g:6125:3: ruleEnumerationLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationValueAccess().getLiteralsEnumerationLiteralParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEnumerationLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationValueAccess().getLiteralsEnumerationLiteralParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValue__LiteralsAssignment_1"


    // $ANTLR start "rule__EnumerationLiteral__NameAssignment"
    // InternalKPIFormulaDSL.g:6134:1: rule__EnumerationLiteral__NameAssignment : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6138:1: ( ( RULE_ID ) )
            // InternalKPIFormulaDSL.g:6139:2: ( RULE_ID )
            {
            // InternalKPIFormulaDSL.g:6139:2: ( RULE_ID )
            // InternalKPIFormulaDSL.g:6140:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__NameAssignment"


    // $ANTLR start "rule__UnitValue__UnitAssignment"
    // InternalKPIFormulaDSL.g:6149:1: rule__UnitValue__UnitAssignment : ( ruleValueUnit ) ;
    public final void rule__UnitValue__UnitAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6153:1: ( ( ruleValueUnit ) )
            // InternalKPIFormulaDSL.g:6154:2: ( ruleValueUnit )
            {
            // InternalKPIFormulaDSL.g:6154:2: ( ruleValueUnit )
            // InternalKPIFormulaDSL.g:6155:3: ruleValueUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnitValueAccess().getUnitValueUnitEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValueUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnitValueAccess().getUnitValueUnitEnumRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnitValue__UnitAssignment"


    // $ANTLR start "rule__AggregationValue__OperationAssignment_1"
    // InternalKPIFormulaDSL.g:6164:1: rule__AggregationValue__OperationAssignment_1 : ( ruleOperation ) ;
    public final void rule__AggregationValue__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6168:1: ( ( ruleOperation ) )
            // InternalKPIFormulaDSL.g:6169:2: ( ruleOperation )
            {
            // InternalKPIFormulaDSL.g:6169:2: ( ruleOperation )
            // InternalKPIFormulaDSL.g:6170:3: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregationValueAccess().getOperationOperationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregationValueAccess().getOperationOperationParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationValue__OperationAssignment_1"


    // $ANTLR start "rule__AggregationValue__WindowAssignment_3"
    // InternalKPIFormulaDSL.g:6179:1: rule__AggregationValue__WindowAssignment_3 : ( RULE_INT ) ;
    public final void rule__AggregationValue__WindowAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6183:1: ( ( RULE_INT ) )
            // InternalKPIFormulaDSL.g:6184:2: ( RULE_INT )
            {
            // InternalKPIFormulaDSL.g:6184:2: ( RULE_INT )
            // InternalKPIFormulaDSL.g:6185:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregationValueAccess().getWindowINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregationValueAccess().getWindowINTTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationValue__WindowAssignment_3"


    // $ANTLR start "rule__AggregationValue__WindowUnitAssignment_4"
    // InternalKPIFormulaDSL.g:6194:1: rule__AggregationValue__WindowUnitAssignment_4 : ( ruleWindowUnit ) ;
    public final void rule__AggregationValue__WindowUnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6198:1: ( ( ruleWindowUnit ) )
            // InternalKPIFormulaDSL.g:6199:2: ( ruleWindowUnit )
            {
            // InternalKPIFormulaDSL.g:6199:2: ( ruleWindowUnit )
            // InternalKPIFormulaDSL.g:6200:3: ruleWindowUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregationValueAccess().getWindowUnitWindowUnitEnumRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWindowUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAggregationValueAccess().getWindowUnitWindowUnitEnumRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregationValue__WindowUnitAssignment_4"


    // $ANTLR start "rule__DriftValue__OperationAssignment_2"
    // InternalKPIFormulaDSL.g:6209:1: rule__DriftValue__OperationAssignment_2 : ( ruleOperation ) ;
    public final void rule__DriftValue__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6213:1: ( ( ruleOperation ) )
            // InternalKPIFormulaDSL.g:6214:2: ( ruleOperation )
            {
            // InternalKPIFormulaDSL.g:6214:2: ( ruleOperation )
            // InternalKPIFormulaDSL.g:6215:3: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDriftValueAccess().getOperationOperationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDriftValueAccess().getOperationOperationParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DriftValue__OperationAssignment_2"


    // $ANTLR start "rule__DriftValue__WindowAssignment_4"
    // InternalKPIFormulaDSL.g:6224:1: rule__DriftValue__WindowAssignment_4 : ( RULE_INT ) ;
    public final void rule__DriftValue__WindowAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6228:1: ( ( RULE_INT ) )
            // InternalKPIFormulaDSL.g:6229:2: ( RULE_INT )
            {
            // InternalKPIFormulaDSL.g:6229:2: ( RULE_INT )
            // InternalKPIFormulaDSL.g:6230:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDriftValueAccess().getWindowINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDriftValueAccess().getWindowINTTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DriftValue__WindowAssignment_4"


    // $ANTLR start "rule__DriftValue__WindowUnitAssignment_5"
    // InternalKPIFormulaDSL.g:6239:1: rule__DriftValue__WindowUnitAssignment_5 : ( ruleWindowUnit ) ;
    public final void rule__DriftValue__WindowUnitAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6243:1: ( ( ruleWindowUnit ) )
            // InternalKPIFormulaDSL.g:6244:2: ( ruleWindowUnit )
            {
            // InternalKPIFormulaDSL.g:6244:2: ( ruleWindowUnit )
            // InternalKPIFormulaDSL.g:6245:3: ruleWindowUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDriftValueAccess().getWindowUnitWindowUnitEnumRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWindowUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDriftValueAccess().getWindowUnitWindowUnitEnumRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DriftValue__WindowUnitAssignment_5"


    // $ANTLR start "rule__Condition__ConditionsAssignment_1_0"
    // InternalKPIFormulaDSL.g:6254:1: rule__Condition__ConditionsAssignment_1_0 : ( ruleExpression ) ;
    public final void rule__Condition__ConditionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6258:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:6259:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:6259:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:6260:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getConditionsExpressionParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getConditionsExpressionParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ConditionsAssignment_1_0"


    // $ANTLR start "rule__Condition__ResultsAssignment_1_2"
    // InternalKPIFormulaDSL.g:6269:1: rule__Condition__ResultsAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Condition__ResultsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6273:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:6274:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:6274:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:6275:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getResultsExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getResultsExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ResultsAssignment_1_2"


    // $ANTLR start "rule__Condition__ResultsAssignment_4"
    // InternalKPIFormulaDSL.g:6284:1: rule__Condition__ResultsAssignment_4 : ( ruleExpression ) ;
    public final void rule__Condition__ResultsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6288:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:6289:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:6289:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:6290:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getResultsExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getResultsExpressionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ResultsAssignment_4"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalKPIFormulaDSL.g:6299:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6303:1: ( ( ruleAnd ) )
            // InternalKPIFormulaDSL.g:6304:2: ( ruleAnd )
            {
            // InternalKPIFormulaDSL.g:6304:2: ( ruleAnd )
            // InternalKPIFormulaDSL.g:6305:3: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // InternalKPIFormulaDSL.g:6314:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6318:1: ( ( ruleEquality ) )
            // InternalKPIFormulaDSL.g:6319:2: ( ruleEquality )
            {
            // InternalKPIFormulaDSL.g:6319:2: ( ruleEquality )
            // InternalKPIFormulaDSL.g:6320:3: ruleEquality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Equality__RightAssignment_1_1"
    // InternalKPIFormulaDSL.g:6329:1: rule__Equality__RightAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6333:1: ( ( ruleComparison ) )
            // InternalKPIFormulaDSL.g:6334:2: ( ruleComparison )
            {
            // InternalKPIFormulaDSL.g:6334:2: ( ruleComparison )
            // InternalKPIFormulaDSL.g:6335:3: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__RightAssignment_1_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_1"
    // InternalKPIFormulaDSL.g:6344:1: rule__Comparison__RightAssignment_1_1 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6348:1: ( ( rulePlusOrMinus ) )
            // InternalKPIFormulaDSL.g:6349:2: ( rulePlusOrMinus )
            {
            // InternalKPIFormulaDSL.g:6349:2: ( rulePlusOrMinus )
            // InternalKPIFormulaDSL.g:6350:3: rulePlusOrMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightAssignment_1_1"


    // $ANTLR start "rule__PlusOrMinus__RightAssignment_1_1"
    // InternalKPIFormulaDSL.g:6359:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6363:1: ( ( ruleMulOrDiv ) )
            // InternalKPIFormulaDSL.g:6364:2: ( ruleMulOrDiv )
            {
            // InternalKPIFormulaDSL.g:6364:2: ( ruleMulOrDiv )
            // InternalKPIFormulaDSL.g:6365:3: ruleMulOrDiv
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__RightAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__RightAssignment_1_1"
    // InternalKPIFormulaDSL.g:6374:1: rule__MulOrDiv__RightAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6378:1: ( ( rulePrimary ) )
            // InternalKPIFormulaDSL.g:6379:2: ( rulePrimary )
            {
            // InternalKPIFormulaDSL.g:6379:2: ( rulePrimary )
            // InternalKPIFormulaDSL.g:6380:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__RightAssignment_1_1"


    // $ANTLR start "rule__Primary__ExpressionAssignment_1_2"
    // InternalKPIFormulaDSL.g:6389:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6393:1: ( ( rulePrimary ) )
            // InternalKPIFormulaDSL.g:6394:2: ( rulePrimary )
            {
            // InternalKPIFormulaDSL.g:6394:2: ( rulePrimary )
            // InternalKPIFormulaDSL.g:6395:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionAssignment_1_2"


    // $ANTLR start "rule__Primary__ExpressionAssignment_2_2"
    // InternalKPIFormulaDSL.g:6404:1: rule__Primary__ExpressionAssignment_2_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6408:1: ( ( rulePrimary ) )
            // InternalKPIFormulaDSL.g:6409:2: ( rulePrimary )
            {
            // InternalKPIFormulaDSL.g:6409:2: ( rulePrimary )
            // InternalKPIFormulaDSL.g:6410:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionAssignment_2_2"


    // $ANTLR start "rule__Primary__ExpressionsAssignment_3_3"
    // InternalKPIFormulaDSL.g:6419:1: rule__Primary__ExpressionsAssignment_3_3 : ( ruleExpression ) ;
    public final void rule__Primary__ExpressionsAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6423:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:6424:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:6424:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:6425:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_3_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_3_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionsAssignment_3_3"


    // $ANTLR start "rule__Primary__ExpressionsAssignment_3_4_1"
    // InternalKPIFormulaDSL.g:6434:1: rule__Primary__ExpressionsAssignment_3_4_1 : ( ruleExpression ) ;
    public final void rule__Primary__ExpressionsAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6438:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:6439:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:6439:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:6440:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_3_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_3_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionsAssignment_3_4_1"


    // $ANTLR start "rule__Primary__ExpressionsAssignment_4_3"
    // InternalKPIFormulaDSL.g:6449:1: rule__Primary__ExpressionsAssignment_4_3 : ( ruleExpression ) ;
    public final void rule__Primary__ExpressionsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6453:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:6454:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:6454:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:6455:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_4_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_4_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionsAssignment_4_3"


    // $ANTLR start "rule__Primary__WeightsAssignment_4_5"
    // InternalKPIFormulaDSL.g:6464:1: rule__Primary__WeightsAssignment_4_5 : ( ruleExpression ) ;
    public final void rule__Primary__WeightsAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6468:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:6469:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:6469:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:6470:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getWeightsExpressionParserRuleCall_4_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getWeightsExpressionParserRuleCall_4_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__WeightsAssignment_4_5"


    // $ANTLR start "rule__Primary__ExpressionsAssignment_4_6_1"
    // InternalKPIFormulaDSL.g:6479:1: rule__Primary__ExpressionsAssignment_4_6_1 : ( ruleExpression ) ;
    public final void rule__Primary__ExpressionsAssignment_4_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6483:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:6484:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:6484:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:6485:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_4_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_4_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionsAssignment_4_6_1"


    // $ANTLR start "rule__Primary__WeightsAssignment_4_6_3"
    // InternalKPIFormulaDSL.g:6494:1: rule__Primary__WeightsAssignment_4_6_3 : ( ruleExpression ) ;
    public final void rule__Primary__WeightsAssignment_4_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6498:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:6499:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:6499:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:6500:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getWeightsExpressionParserRuleCall_4_6_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getWeightsExpressionParserRuleCall_4_6_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__WeightsAssignment_4_6_3"


    // $ANTLR start "rule__Primary__ExpressionsAssignment_5_3"
    // InternalKPIFormulaDSL.g:6509:1: rule__Primary__ExpressionsAssignment_5_3 : ( ruleExpression ) ;
    public final void rule__Primary__ExpressionsAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6513:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:6514:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:6514:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:6515:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_5_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_5_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionsAssignment_5_3"


    // $ANTLR start "rule__Primary__ExpressionsAssignment_5_4_1"
    // InternalKPIFormulaDSL.g:6524:1: rule__Primary__ExpressionsAssignment_5_4_1 : ( ruleExpression ) ;
    public final void rule__Primary__ExpressionsAssignment_5_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6528:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:6529:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:6529:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:6530:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_5_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_5_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionsAssignment_5_4_1"


    // $ANTLR start "rule__Primary__ExpressionsAssignment_6_3"
    // InternalKPIFormulaDSL.g:6539:1: rule__Primary__ExpressionsAssignment_6_3 : ( ruleExpression ) ;
    public final void rule__Primary__ExpressionsAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6543:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:6544:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:6544:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:6545:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_6_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_6_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionsAssignment_6_3"


    // $ANTLR start "rule__Primary__ExpressionsAssignment_6_4_1"
    // InternalKPIFormulaDSL.g:6554:1: rule__Primary__ExpressionsAssignment_6_4_1 : ( ruleExpression ) ;
    public final void rule__Primary__ExpressionsAssignment_6_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6558:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:6559:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:6559:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:6560:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_6_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_6_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionsAssignment_6_4_1"


    // $ANTLR start "rule__Primary__ExpressionAssignment_7_3"
    // InternalKPIFormulaDSL.g:6569:1: rule__Primary__ExpressionAssignment_7_3 : ( ruleExpression ) ;
    public final void rule__Primary__ExpressionAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6573:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:6574:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:6574:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:6575:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_7_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_7_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionAssignment_7_3"


    // $ANTLR start "rule__Primary__ThresholdAssignment_7_5"
    // InternalKPIFormulaDSL.g:6584:1: rule__Primary__ThresholdAssignment_7_5 : ( ruleExpression ) ;
    public final void rule__Primary__ThresholdAssignment_7_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6588:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:6589:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:6589:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:6590:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getThresholdExpressionParserRuleCall_7_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getThresholdExpressionParserRuleCall_7_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ThresholdAssignment_7_5"


    // $ANTLR start "rule__Atomic__ValueAssignment_0_1"
    // InternalKPIFormulaDSL.g:6599:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6603:1: ( ( RULE_INT ) )
            // InternalKPIFormulaDSL.g:6604:2: ( RULE_INT )
            {
            // InternalKPIFormulaDSL.g:6604:2: ( RULE_INT )
            // InternalKPIFormulaDSL.g:6605:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_0_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_1_1"
    // InternalKPIFormulaDSL.g:6614:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_DOUBLE ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6618:1: ( ( RULE_DOUBLE ) )
            // InternalKPIFormulaDSL.g:6619:2: ( RULE_DOUBLE )
            {
            // InternalKPIFormulaDSL.g:6619:2: ( RULE_DOUBLE )
            // InternalKPIFormulaDSL.g:6620:3: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueDOUBLETerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueDOUBLETerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_2_1"
    // InternalKPIFormulaDSL.g:6629:1: rule__Atomic__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6633:1: ( ( RULE_STRING ) )
            // InternalKPIFormulaDSL.g:6634:2: ( RULE_STRING )
            {
            // InternalKPIFormulaDSL.g:6634:2: ( RULE_STRING )
            // InternalKPIFormulaDSL.g:6635:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_2_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_3_1"
    // InternalKPIFormulaDSL.g:6644:1: rule__Atomic__ValueAssignment_3_1 : ( ( rule__Atomic__ValueAlternatives_3_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6648:1: ( ( ( rule__Atomic__ValueAlternatives_3_1_0 ) ) )
            // InternalKPIFormulaDSL.g:6649:2: ( ( rule__Atomic__ValueAlternatives_3_1_0 ) )
            {
            // InternalKPIFormulaDSL.g:6649:2: ( ( rule__Atomic__ValueAlternatives_3_1_0 ) )
            // InternalKPIFormulaDSL.g:6650:3: ( rule__Atomic__ValueAlternatives_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAlternatives_3_1_0()); 
            }
            // InternalKPIFormulaDSL.g:6651:3: ( rule__Atomic__ValueAlternatives_3_1_0 )
            // InternalKPIFormulaDSL.g:6651:4: rule__Atomic__ValueAlternatives_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAlternatives_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueAlternatives_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_3_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_4_1"
    // InternalKPIFormulaDSL.g:6659:1: rule__Atomic__ValueAssignment_4_1 : ( RULE_DOUBLE ) ;
    public final void rule__Atomic__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6663:1: ( ( RULE_DOUBLE ) )
            // InternalKPIFormulaDSL.g:6664:2: ( RULE_DOUBLE )
            {
            // InternalKPIFormulaDSL.g:6664:2: ( RULE_DOUBLE )
            // InternalKPIFormulaDSL.g:6665:3: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueDOUBLETerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueDOUBLETerminalRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_4_1"


    // $ANTLR start "rule__Atomic__UnitAssignment_4_2"
    // InternalKPIFormulaDSL.g:6674:1: rule__Atomic__UnitAssignment_4_2 : ( ruleValueUnit ) ;
    public final void rule__Atomic__UnitAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6678:1: ( ( ruleValueUnit ) )
            // InternalKPIFormulaDSL.g:6679:2: ( ruleValueUnit )
            {
            // InternalKPIFormulaDSL.g:6679:2: ( ruleValueUnit )
            // InternalKPIFormulaDSL.g:6680:3: ruleValueUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getUnitValueUnitEnumRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValueUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getUnitValueUnitEnumRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__UnitAssignment_4_2"


    // $ANTLR start "rule__Atomic__LiteralAssignment_5_1"
    // InternalKPIFormulaDSL.g:6689:1: rule__Atomic__LiteralAssignment_5_1 : ( ( RULE_FQN ) ) ;
    public final void rule__Atomic__LiteralAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6693:1: ( ( ( RULE_FQN ) ) )
            // InternalKPIFormulaDSL.g:6694:2: ( ( RULE_FQN ) )
            {
            // InternalKPIFormulaDSL.g:6694:2: ( ( RULE_FQN ) )
            // InternalKPIFormulaDSL.g:6695:3: ( RULE_FQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getLiteralEnumerationLiteralCrossReference_5_1_0()); 
            }
            // InternalKPIFormulaDSL.g:6696:3: ( RULE_FQN )
            // InternalKPIFormulaDSL.g:6697:4: RULE_FQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getLiteralEnumerationLiteralFQNTerminalRuleCall_5_1_0_1()); 
            }
            match(input,RULE_FQN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getLiteralEnumerationLiteralFQNTerminalRuleCall_5_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getLiteralEnumerationLiteralCrossReference_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__LiteralAssignment_5_1"


    // $ANTLR start "rule__Atomic__ComputableAssignment_6_1"
    // InternalKPIFormulaDSL.g:6708:1: rule__Atomic__ComputableAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__ComputableAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6712:1: ( ( ( RULE_ID ) ) )
            // InternalKPIFormulaDSL.g:6713:2: ( ( RULE_ID ) )
            {
            // InternalKPIFormulaDSL.g:6713:2: ( ( RULE_ID ) )
            // InternalKPIFormulaDSL.g:6714:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getComputableComputableCrossReference_6_1_0()); 
            }
            // InternalKPIFormulaDSL.g:6715:3: ( RULE_ID )
            // InternalKPIFormulaDSL.g:6716:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getComputableComputableIDTerminalRuleCall_6_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getComputableComputableIDTerminalRuleCall_6_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getComputableComputableCrossReference_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ComputableAssignment_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0xA4000008000061F0L,0x0000000000000075L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000AF87F38000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00001F0000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xA4000000000061F0L,0x0000000000000075L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xA4000000000061F2L,0x0000000000000075L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x01E0000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x01E0000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000100L});

}