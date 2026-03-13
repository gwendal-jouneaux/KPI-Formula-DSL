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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_STRING", "RULE_FQN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'seconds'", "'minutes'", "'hours'", "'days'", "'measurements'", "'milliseconds'", "'liters'", "'cubic meter'", "'Wh'", "'kWh'", "'gCO2eq'", "'kgCO2eq'", "'='", "'of'", "'type'", "'KPI'", "'int'", "'real'", "'text'", "'bool'", "'{'", "'}'", "'aggregate'", "'for'", "'drift'", "'Minimum'", "'Maximum'", "'Average'", "'Median'", "'Standard'", "'deviation'", "'otherwise'", "'->'", "';'", "'or'", "'and'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'|'", "'['", "']'", "','", "'AVERAGE'", "'('", "')'", "'WEIGHTED_SUM'", "'SUM'", "'MIN'", "'MAX'", "'THRESHOLD'", "'map'", "'in'", "'reduce'", "'starting'", "'filter'", "'!'", "'accumulator'"
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
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=6;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
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
    // InternalKPIFormulaDSL.g:63:1: ruleKPIFormulaDSL : ( ( rule__KPIFormulaDSL__Alternatives )* ) ;
    public final void ruleKPIFormulaDSL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:67:2: ( ( ( rule__KPIFormulaDSL__Alternatives )* ) )
            // InternalKPIFormulaDSL.g:68:2: ( ( rule__KPIFormulaDSL__Alternatives )* )
            {
            // InternalKPIFormulaDSL.g:68:2: ( ( rule__KPIFormulaDSL__Alternatives )* )
            // InternalKPIFormulaDSL.g:69:3: ( rule__KPIFormulaDSL__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKPIFormulaDSLAccess().getAlternatives()); 
            }
            // InternalKPIFormulaDSL.g:70:3: ( rule__KPIFormulaDSL__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:70:4: rule__KPIFormulaDSL__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__KPIFormulaDSL__Alternatives();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKPIFormulaDSLAccess().getAlternatives()); 
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


    // $ANTLR start "entryRuleTopLevelExpression"
    // InternalKPIFormulaDSL.g:604:1: entryRuleTopLevelExpression : ruleTopLevelExpression EOF ;
    public final void entryRuleTopLevelExpression() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:605:1: ( ruleTopLevelExpression EOF )
            // InternalKPIFormulaDSL.g:606:1: ruleTopLevelExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTopLevelExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelExpressionRule()); 
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
    // $ANTLR end "entryRuleTopLevelExpression"


    // $ANTLR start "ruleTopLevelExpression"
    // InternalKPIFormulaDSL.g:613:1: ruleTopLevelExpression : ( ( rule__TopLevelExpression__Alternatives ) ) ;
    public final void ruleTopLevelExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:617:2: ( ( ( rule__TopLevelExpression__Alternatives ) ) )
            // InternalKPIFormulaDSL.g:618:2: ( ( rule__TopLevelExpression__Alternatives ) )
            {
            // InternalKPIFormulaDSL.g:618:2: ( ( rule__TopLevelExpression__Alternatives ) )
            // InternalKPIFormulaDSL.g:619:3: ( rule__TopLevelExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTopLevelExpressionAccess().getAlternatives()); 
            }
            // InternalKPIFormulaDSL.g:620:3: ( rule__TopLevelExpression__Alternatives )
            // InternalKPIFormulaDSL.g:620:4: rule__TopLevelExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TopLevelExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTopLevelExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTopLevelExpression"


    // $ANTLR start "entryRuleCondition"
    // InternalKPIFormulaDSL.g:629:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:630:1: ( ruleCondition EOF )
            // InternalKPIFormulaDSL.g:631:1: ruleCondition EOF
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
    // InternalKPIFormulaDSL.g:638:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:642:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:643:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:643:2: ( ( rule__Condition__Group__0 ) )
            // InternalKPIFormulaDSL.g:644:3: ( rule__Condition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:645:3: ( rule__Condition__Group__0 )
            // InternalKPIFormulaDSL.g:645:4: rule__Condition__Group__0
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
    // InternalKPIFormulaDSL.g:654:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:655:1: ( ruleExpression EOF )
            // InternalKPIFormulaDSL.g:656:1: ruleExpression EOF
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
    // InternalKPIFormulaDSL.g:663:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:667:2: ( ( ruleOr ) )
            // InternalKPIFormulaDSL.g:668:2: ( ruleOr )
            {
            // InternalKPIFormulaDSL.g:668:2: ( ruleOr )
            // InternalKPIFormulaDSL.g:669:3: ruleOr
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
    // InternalKPIFormulaDSL.g:679:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:680:1: ( ruleOr EOF )
            // InternalKPIFormulaDSL.g:681:1: ruleOr EOF
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
    // InternalKPIFormulaDSL.g:688:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:692:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:693:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:693:2: ( ( rule__Or__Group__0 ) )
            // InternalKPIFormulaDSL.g:694:3: ( rule__Or__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:695:3: ( rule__Or__Group__0 )
            // InternalKPIFormulaDSL.g:695:4: rule__Or__Group__0
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
    // InternalKPIFormulaDSL.g:704:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:705:1: ( ruleAnd EOF )
            // InternalKPIFormulaDSL.g:706:1: ruleAnd EOF
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
    // InternalKPIFormulaDSL.g:713:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:717:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:718:2: ( ( rule__And__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:718:2: ( ( rule__And__Group__0 ) )
            // InternalKPIFormulaDSL.g:719:3: ( rule__And__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:720:3: ( rule__And__Group__0 )
            // InternalKPIFormulaDSL.g:720:4: rule__And__Group__0
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
    // InternalKPIFormulaDSL.g:729:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:730:1: ( ruleEquality EOF )
            // InternalKPIFormulaDSL.g:731:1: ruleEquality EOF
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
    // InternalKPIFormulaDSL.g:738:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:742:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:743:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:743:2: ( ( rule__Equality__Group__0 ) )
            // InternalKPIFormulaDSL.g:744:3: ( rule__Equality__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:745:3: ( rule__Equality__Group__0 )
            // InternalKPIFormulaDSL.g:745:4: rule__Equality__Group__0
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
    // InternalKPIFormulaDSL.g:754:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:755:1: ( ruleComparison EOF )
            // InternalKPIFormulaDSL.g:756:1: ruleComparison EOF
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
    // InternalKPIFormulaDSL.g:763:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:767:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:768:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:768:2: ( ( rule__Comparison__Group__0 ) )
            // InternalKPIFormulaDSL.g:769:3: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:770:3: ( rule__Comparison__Group__0 )
            // InternalKPIFormulaDSL.g:770:4: rule__Comparison__Group__0
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
    // InternalKPIFormulaDSL.g:779:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:780:1: ( rulePlusOrMinus EOF )
            // InternalKPIFormulaDSL.g:781:1: rulePlusOrMinus EOF
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
    // InternalKPIFormulaDSL.g:788:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:792:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:793:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:793:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalKPIFormulaDSL.g:794:3: ( rule__PlusOrMinus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:795:3: ( rule__PlusOrMinus__Group__0 )
            // InternalKPIFormulaDSL.g:795:4: rule__PlusOrMinus__Group__0
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
    // InternalKPIFormulaDSL.g:804:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:805:1: ( ruleMulOrDiv EOF )
            // InternalKPIFormulaDSL.g:806:1: ruleMulOrDiv EOF
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
    // InternalKPIFormulaDSL.g:813:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:817:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // InternalKPIFormulaDSL.g:818:2: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // InternalKPIFormulaDSL.g:818:2: ( ( rule__MulOrDiv__Group__0 ) )
            // InternalKPIFormulaDSL.g:819:3: ( rule__MulOrDiv__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup()); 
            }
            // InternalKPIFormulaDSL.g:820:3: ( rule__MulOrDiv__Group__0 )
            // InternalKPIFormulaDSL.g:820:4: rule__MulOrDiv__Group__0
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


    // $ANTLR start "entryRuleOperator"
    // InternalKPIFormulaDSL.g:829:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:830:1: ( ruleOperator EOF )
            // InternalKPIFormulaDSL.g:831:1: ruleOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorRule()); 
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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalKPIFormulaDSL.g:838:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:842:2: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalKPIFormulaDSL.g:843:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalKPIFormulaDSL.g:843:2: ( ( rule__Operator__Alternatives ) )
            // InternalKPIFormulaDSL.g:844:3: ( rule__Operator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getAlternatives()); 
            }
            // InternalKPIFormulaDSL.g:845:3: ( rule__Operator__Alternatives )
            // InternalKPIFormulaDSL.g:845:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRulePrimary"
    // InternalKPIFormulaDSL.g:854:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:855:1: ( rulePrimary EOF )
            // InternalKPIFormulaDSL.g:856:1: rulePrimary EOF
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
    // InternalKPIFormulaDSL.g:863:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:867:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalKPIFormulaDSL.g:868:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalKPIFormulaDSL.g:868:2: ( ( rule__Primary__Alternatives ) )
            // InternalKPIFormulaDSL.g:869:3: ( rule__Primary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            }
            // InternalKPIFormulaDSL.g:870:3: ( rule__Primary__Alternatives )
            // InternalKPIFormulaDSL.g:870:4: rule__Primary__Alternatives
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


    // $ANTLR start "entryRuleListIterator"
    // InternalKPIFormulaDSL.g:879:1: entryRuleListIterator : ruleListIterator EOF ;
    public final void entryRuleListIterator() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:880:1: ( ruleListIterator EOF )
            // InternalKPIFormulaDSL.g:881:1: ruleListIterator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListIteratorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleListIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListIteratorRule()); 
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
    // $ANTLR end "entryRuleListIterator"


    // $ANTLR start "ruleListIterator"
    // InternalKPIFormulaDSL.g:888:1: ruleListIterator : ( ( rule__ListIterator__NameAssignment ) ) ;
    public final void ruleListIterator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:892:2: ( ( ( rule__ListIterator__NameAssignment ) ) )
            // InternalKPIFormulaDSL.g:893:2: ( ( rule__ListIterator__NameAssignment ) )
            {
            // InternalKPIFormulaDSL.g:893:2: ( ( rule__ListIterator__NameAssignment ) )
            // InternalKPIFormulaDSL.g:894:3: ( rule__ListIterator__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListIteratorAccess().getNameAssignment()); 
            }
            // InternalKPIFormulaDSL.g:895:3: ( rule__ListIterator__NameAssignment )
            // InternalKPIFormulaDSL.g:895:4: rule__ListIterator__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ListIterator__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListIteratorAccess().getNameAssignment()); 
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
    // $ANTLR end "ruleListIterator"


    // $ANTLR start "entryRuleAtomic"
    // InternalKPIFormulaDSL.g:904:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalKPIFormulaDSL.g:905:1: ( ruleAtomic EOF )
            // InternalKPIFormulaDSL.g:906:1: ruleAtomic EOF
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
    // InternalKPIFormulaDSL.g:913:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:917:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalKPIFormulaDSL.g:918:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalKPIFormulaDSL.g:918:2: ( ( rule__Atomic__Alternatives ) )
            // InternalKPIFormulaDSL.g:919:3: ( rule__Atomic__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getAlternatives()); 
            }
            // InternalKPIFormulaDSL.g:920:3: ( rule__Atomic__Alternatives )
            // InternalKPIFormulaDSL.g:920:4: rule__Atomic__Alternatives
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
    // InternalKPIFormulaDSL.g:929:1: ruleWindowUnit : ( ( rule__WindowUnit__Alternatives ) ) ;
    public final void ruleWindowUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:933:1: ( ( ( rule__WindowUnit__Alternatives ) ) )
            // InternalKPIFormulaDSL.g:934:2: ( ( rule__WindowUnit__Alternatives ) )
            {
            // InternalKPIFormulaDSL.g:934:2: ( ( rule__WindowUnit__Alternatives ) )
            // InternalKPIFormulaDSL.g:935:3: ( rule__WindowUnit__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWindowUnitAccess().getAlternatives()); 
            }
            // InternalKPIFormulaDSL.g:936:3: ( rule__WindowUnit__Alternatives )
            // InternalKPIFormulaDSL.g:936:4: rule__WindowUnit__Alternatives
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
    // InternalKPIFormulaDSL.g:945:1: ruleValueUnit : ( ( rule__ValueUnit__Alternatives ) ) ;
    public final void ruleValueUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:949:1: ( ( ( rule__ValueUnit__Alternatives ) ) )
            // InternalKPIFormulaDSL.g:950:2: ( ( rule__ValueUnit__Alternatives ) )
            {
            // InternalKPIFormulaDSL.g:950:2: ( ( rule__ValueUnit__Alternatives ) )
            // InternalKPIFormulaDSL.g:951:3: ( rule__ValueUnit__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueUnitAccess().getAlternatives()); 
            }
            // InternalKPIFormulaDSL.g:952:3: ( rule__ValueUnit__Alternatives )
            // InternalKPIFormulaDSL.g:952:4: rule__ValueUnit__Alternatives
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


    // $ANTLR start "rule__KPIFormulaDSL__Alternatives"
    // InternalKPIFormulaDSL.g:960:1: rule__KPIFormulaDSL__Alternatives : ( ( ( rule__KPIFormulaDSL__DeclarationsAssignment_0 ) ) | ( ( rule__KPIFormulaDSL__ComputationsAssignment_1 ) ) );
    public final void rule__KPIFormulaDSL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:964:1: ( ( ( rule__KPIFormulaDSL__DeclarationsAssignment_0 ) ) | ( ( rule__KPIFormulaDSL__ComputationsAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==28) ) {
                    alt2=1;
                }
                else if ( (LA2_2==27) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalKPIFormulaDSL.g:965:2: ( ( rule__KPIFormulaDSL__DeclarationsAssignment_0 ) )
                    {
                    // InternalKPIFormulaDSL.g:965:2: ( ( rule__KPIFormulaDSL__DeclarationsAssignment_0 ) )
                    // InternalKPIFormulaDSL.g:966:3: ( rule__KPIFormulaDSL__DeclarationsAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKPIFormulaDSLAccess().getDeclarationsAssignment_0()); 
                    }
                    // InternalKPIFormulaDSL.g:967:3: ( rule__KPIFormulaDSL__DeclarationsAssignment_0 )
                    // InternalKPIFormulaDSL.g:967:4: rule__KPIFormulaDSL__DeclarationsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KPIFormulaDSL__DeclarationsAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKPIFormulaDSLAccess().getDeclarationsAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:971:2: ( ( rule__KPIFormulaDSL__ComputationsAssignment_1 ) )
                    {
                    // InternalKPIFormulaDSL.g:971:2: ( ( rule__KPIFormulaDSL__ComputationsAssignment_1 ) )
                    // InternalKPIFormulaDSL.g:972:3: ( rule__KPIFormulaDSL__ComputationsAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getKPIFormulaDSLAccess().getComputationsAssignment_1()); 
                    }
                    // InternalKPIFormulaDSL.g:973:3: ( rule__KPIFormulaDSL__ComputationsAssignment_1 )
                    // InternalKPIFormulaDSL.g:973:4: rule__KPIFormulaDSL__ComputationsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__KPIFormulaDSL__ComputationsAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getKPIFormulaDSLAccess().getComputationsAssignment_1()); 
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
    // $ANTLR end "rule__KPIFormulaDSL__Alternatives"


    // $ANTLR start "rule__Declarable__Alternatives"
    // InternalKPIFormulaDSL.g:981:1: rule__Declarable__Alternatives : ( ( ruleKPI ) | ( ruleMetric ) );
    public final void rule__Declarable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:985:1: ( ( ruleKPI ) | ( ruleMetric ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==30) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalKPIFormulaDSL.g:986:2: ( ruleKPI )
                    {
                    // InternalKPIFormulaDSL.g:986:2: ( ruleKPI )
                    // InternalKPIFormulaDSL.g:987:3: ruleKPI
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
                    // InternalKPIFormulaDSL.g:992:2: ( ruleMetric )
                    {
                    // InternalKPIFormulaDSL.g:992:2: ( ruleMetric )
                    // InternalKPIFormulaDSL.g:993:3: ruleMetric
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
    // InternalKPIFormulaDSL.g:1002:1: rule__ValueType__Alternatives : ( ( ruleIntegerValue ) | ( ruleRealValue ) | ( ruleTextualValue ) | ( ruleBooleanValue ) | ( ruleEnumerationValue ) | ( ruleAggregationValue ) | ( ruleDriftValue ) | ( ruleUnitValue ) );
    public final void rule__ValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1006:1: ( ( ruleIntegerValue ) | ( ruleRealValue ) | ( ruleTextualValue ) | ( ruleBooleanValue ) | ( ruleEnumerationValue ) | ( ruleAggregationValue ) | ( ruleDriftValue ) | ( ruleUnitValue ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 33:
                {
                alt4=3;
                }
                break;
            case 34:
                {
                alt4=4;
                }
                break;
            case 35:
                {
                alt4=5;
                }
                break;
            case 37:
                {
                alt4=6;
                }
                break;
            case 39:
                {
                alt4=7;
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
                alt4=8;
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
                    // InternalKPIFormulaDSL.g:1007:2: ( ruleIntegerValue )
                    {
                    // InternalKPIFormulaDSL.g:1007:2: ( ruleIntegerValue )
                    // InternalKPIFormulaDSL.g:1008:3: ruleIntegerValue
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
                    // InternalKPIFormulaDSL.g:1013:2: ( ruleRealValue )
                    {
                    // InternalKPIFormulaDSL.g:1013:2: ( ruleRealValue )
                    // InternalKPIFormulaDSL.g:1014:3: ruleRealValue
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
                    // InternalKPIFormulaDSL.g:1019:2: ( ruleTextualValue )
                    {
                    // InternalKPIFormulaDSL.g:1019:2: ( ruleTextualValue )
                    // InternalKPIFormulaDSL.g:1020:3: ruleTextualValue
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
                    // InternalKPIFormulaDSL.g:1025:2: ( ruleBooleanValue )
                    {
                    // InternalKPIFormulaDSL.g:1025:2: ( ruleBooleanValue )
                    // InternalKPIFormulaDSL.g:1026:3: ruleBooleanValue
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
                    // InternalKPIFormulaDSL.g:1031:2: ( ruleEnumerationValue )
                    {
                    // InternalKPIFormulaDSL.g:1031:2: ( ruleEnumerationValue )
                    // InternalKPIFormulaDSL.g:1032:3: ruleEnumerationValue
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
                    // InternalKPIFormulaDSL.g:1037:2: ( ruleAggregationValue )
                    {
                    // InternalKPIFormulaDSL.g:1037:2: ( ruleAggregationValue )
                    // InternalKPIFormulaDSL.g:1038:3: ruleAggregationValue
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
                    // InternalKPIFormulaDSL.g:1043:2: ( ruleDriftValue )
                    {
                    // InternalKPIFormulaDSL.g:1043:2: ( ruleDriftValue )
                    // InternalKPIFormulaDSL.g:1044:3: ruleDriftValue
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
                    // InternalKPIFormulaDSL.g:1049:2: ( ruleUnitValue )
                    {
                    // InternalKPIFormulaDSL.g:1049:2: ( ruleUnitValue )
                    // InternalKPIFormulaDSL.g:1050:3: ruleUnitValue
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
    // InternalKPIFormulaDSL.g:1059:1: rule__Operation__Alternatives : ( ( ruleMinimum ) | ( ruleMaximum ) | ( ruleAverage ) | ( ruleMedian ) | ( ruleStandardDeviation ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1063:1: ( ( ruleMinimum ) | ( ruleMaximum ) | ( ruleAverage ) | ( ruleMedian ) | ( ruleStandardDeviation ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt5=1;
                }
                break;
            case 41:
                {
                alt5=2;
                }
                break;
            case 42:
                {
                alt5=3;
                }
                break;
            case 43:
                {
                alt5=4;
                }
                break;
            case 44:
                {
                alt5=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalKPIFormulaDSL.g:1064:2: ( ruleMinimum )
                    {
                    // InternalKPIFormulaDSL.g:1064:2: ( ruleMinimum )
                    // InternalKPIFormulaDSL.g:1065:3: ruleMinimum
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
                    // InternalKPIFormulaDSL.g:1070:2: ( ruleMaximum )
                    {
                    // InternalKPIFormulaDSL.g:1070:2: ( ruleMaximum )
                    // InternalKPIFormulaDSL.g:1071:3: ruleMaximum
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
                    // InternalKPIFormulaDSL.g:1076:2: ( ruleAverage )
                    {
                    // InternalKPIFormulaDSL.g:1076:2: ( ruleAverage )
                    // InternalKPIFormulaDSL.g:1077:3: ruleAverage
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
                    // InternalKPIFormulaDSL.g:1082:2: ( ruleMedian )
                    {
                    // InternalKPIFormulaDSL.g:1082:2: ( ruleMedian )
                    // InternalKPIFormulaDSL.g:1083:3: ruleMedian
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
                    // InternalKPIFormulaDSL.g:1088:2: ( ruleStandardDeviation )
                    {
                    // InternalKPIFormulaDSL.g:1088:2: ( ruleStandardDeviation )
                    // InternalKPIFormulaDSL.g:1089:3: ruleStandardDeviation
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


    // $ANTLR start "rule__TopLevelExpression__Alternatives"
    // InternalKPIFormulaDSL.g:1098:1: rule__TopLevelExpression__Alternatives : ( ( ( ruleCondition ) ) | ( ruleExpression ) );
    public final void rule__TopLevelExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1102:1: ( ( ( ruleCondition ) ) | ( ruleExpression ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==35) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_FQN)||(LA6_0>=13 && LA6_0<=14)||LA6_0==58||(LA6_0>=61 && LA6_0<=62)||(LA6_0>=65 && LA6_0<=66)||(LA6_0>=68 && LA6_0<=73)||LA6_0==75||(LA6_0>=77 && LA6_0<=79)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalKPIFormulaDSL.g:1103:2: ( ( ruleCondition ) )
                    {
                    // InternalKPIFormulaDSL.g:1103:2: ( ( ruleCondition ) )
                    // InternalKPIFormulaDSL.g:1104:3: ( ruleCondition )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTopLevelExpressionAccess().getConditionParserRuleCall_0()); 
                    }
                    // InternalKPIFormulaDSL.g:1105:3: ( ruleCondition )
                    // InternalKPIFormulaDSL.g:1105:4: ruleCondition
                    {
                    pushFollow(FOLLOW_2);
                    ruleCondition();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTopLevelExpressionAccess().getConditionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:1109:2: ( ruleExpression )
                    {
                    // InternalKPIFormulaDSL.g:1109:2: ( ruleExpression )
                    // InternalKPIFormulaDSL.g:1110:3: ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTopLevelExpressionAccess().getExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTopLevelExpressionAccess().getExpressionParserRuleCall_1()); 
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
    // $ANTLR end "rule__TopLevelExpression__Alternatives"


    // $ANTLR start "rule__Equality__Alternatives_1_0"
    // InternalKPIFormulaDSL.g:1119:1: rule__Equality__Alternatives_1_0 : ( ( ( rule__Equality__Group_1_0_0__0 ) ) | ( ( rule__Equality__Group_1_0_1__0 ) ) );
    public final void rule__Equality__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1123:1: ( ( ( rule__Equality__Group_1_0_0__0 ) ) | ( ( rule__Equality__Group_1_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==51) ) {
                alt7=1;
            }
            else if ( (LA7_0==52) ) {
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
                    // InternalKPIFormulaDSL.g:1124:2: ( ( rule__Equality__Group_1_0_0__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1124:2: ( ( rule__Equality__Group_1_0_0__0 ) )
                    // InternalKPIFormulaDSL.g:1125:3: ( rule__Equality__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getGroup_1_0_0()); 
                    }
                    // InternalKPIFormulaDSL.g:1126:3: ( rule__Equality__Group_1_0_0__0 )
                    // InternalKPIFormulaDSL.g:1126:4: rule__Equality__Group_1_0_0__0
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
                    // InternalKPIFormulaDSL.g:1130:2: ( ( rule__Equality__Group_1_0_1__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1130:2: ( ( rule__Equality__Group_1_0_1__0 ) )
                    // InternalKPIFormulaDSL.g:1131:3: ( rule__Equality__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getGroup_1_0_1()); 
                    }
                    // InternalKPIFormulaDSL.g:1132:3: ( rule__Equality__Group_1_0_1__0 )
                    // InternalKPIFormulaDSL.g:1132:4: rule__Equality__Group_1_0_1__0
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
    // InternalKPIFormulaDSL.g:1140:1: rule__Comparison__Alternatives_1_0 : ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) | ( ( rule__Comparison__Group_1_0_3__0 ) ) );
    public final void rule__Comparison__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1144:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) | ( ( rule__Comparison__Group_1_0_3__0 ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt8=1;
                }
                break;
            case 54:
                {
                alt8=2;
                }
                break;
            case 55:
                {
                alt8=3;
                }
                break;
            case 56:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalKPIFormulaDSL.g:1145:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1145:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    // InternalKPIFormulaDSL.g:1146:3: ( rule__Comparison__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    }
                    // InternalKPIFormulaDSL.g:1147:3: ( rule__Comparison__Group_1_0_0__0 )
                    // InternalKPIFormulaDSL.g:1147:4: rule__Comparison__Group_1_0_0__0
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
                    // InternalKPIFormulaDSL.g:1151:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1151:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    // InternalKPIFormulaDSL.g:1152:3: ( rule__Comparison__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    }
                    // InternalKPIFormulaDSL.g:1153:3: ( rule__Comparison__Group_1_0_1__0 )
                    // InternalKPIFormulaDSL.g:1153:4: rule__Comparison__Group_1_0_1__0
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
                    // InternalKPIFormulaDSL.g:1157:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1157:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    // InternalKPIFormulaDSL.g:1158:3: ( rule__Comparison__Group_1_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 
                    }
                    // InternalKPIFormulaDSL.g:1159:3: ( rule__Comparison__Group_1_0_2__0 )
                    // InternalKPIFormulaDSL.g:1159:4: rule__Comparison__Group_1_0_2__0
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
                    // InternalKPIFormulaDSL.g:1163:2: ( ( rule__Comparison__Group_1_0_3__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1163:2: ( ( rule__Comparison__Group_1_0_3__0 ) )
                    // InternalKPIFormulaDSL.g:1164:3: ( rule__Comparison__Group_1_0_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_1_0_3()); 
                    }
                    // InternalKPIFormulaDSL.g:1165:3: ( rule__Comparison__Group_1_0_3__0 )
                    // InternalKPIFormulaDSL.g:1165:4: rule__Comparison__Group_1_0_3__0
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
    // InternalKPIFormulaDSL.g:1173:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1177:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==57) ) {
                alt9=1;
            }
            else if ( (LA9_0==58) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalKPIFormulaDSL.g:1178:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1178:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalKPIFormulaDSL.g:1179:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    }
                    // InternalKPIFormulaDSL.g:1180:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalKPIFormulaDSL.g:1180:4: rule__PlusOrMinus__Group_1_0_0__0
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
                    // InternalKPIFormulaDSL.g:1184:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1184:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalKPIFormulaDSL.g:1185:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    }
                    // InternalKPIFormulaDSL.g:1186:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalKPIFormulaDSL.g:1186:4: rule__PlusOrMinus__Group_1_0_1__0
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
    // InternalKPIFormulaDSL.g:1194:1: rule__MulOrDiv__Alternatives_1_0 : ( ( ( rule__MulOrDiv__Group_1_0_0__0 ) ) | ( ( rule__MulOrDiv__Group_1_0_1__0 ) ) );
    public final void rule__MulOrDiv__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1198:1: ( ( ( rule__MulOrDiv__Group_1_0_0__0 ) ) | ( ( rule__MulOrDiv__Group_1_0_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==59) ) {
                alt10=1;
            }
            else if ( (LA10_0==60) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalKPIFormulaDSL.g:1199:2: ( ( rule__MulOrDiv__Group_1_0_0__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1199:2: ( ( rule__MulOrDiv__Group_1_0_0__0 ) )
                    // InternalKPIFormulaDSL.g:1200:3: ( rule__MulOrDiv__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getGroup_1_0_0()); 
                    }
                    // InternalKPIFormulaDSL.g:1201:3: ( rule__MulOrDiv__Group_1_0_0__0 )
                    // InternalKPIFormulaDSL.g:1201:4: rule__MulOrDiv__Group_1_0_0__0
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
                    // InternalKPIFormulaDSL.g:1205:2: ( ( rule__MulOrDiv__Group_1_0_1__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1205:2: ( ( rule__MulOrDiv__Group_1_0_1__0 ) )
                    // InternalKPIFormulaDSL.g:1206:3: ( rule__MulOrDiv__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getGroup_1_0_1()); 
                    }
                    // InternalKPIFormulaDSL.g:1207:3: ( rule__MulOrDiv__Group_1_0_1__0 )
                    // InternalKPIFormulaDSL.g:1207:4: rule__MulOrDiv__Group_1_0_1__0
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


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalKPIFormulaDSL.g:1215:1: rule__Operator__Alternatives : ( ( ( rule__Operator__Group_0__0 ) ) | ( ( rule__Operator__Group_1__0 ) ) | ( ( rule__Operator__Group_2__0 ) ) | ( ( rule__Operator__Group_3__0 ) ) | ( ( rule__Operator__Group_4__0 ) ) | ( ( rule__Operator__Group_5__0 ) ) | ( ( rule__Operator__Group_6__0 ) ) | ( ( rule__Operator__Group_7__0 ) ) | ( ( rule__Operator__Group_8__0 ) ) | ( ( rule__Operator__Group_9__0 ) ) | ( ( rule__Operator__Group_10__0 ) ) | ( rulePrimary ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1219:1: ( ( ( rule__Operator__Group_0__0 ) ) | ( ( rule__Operator__Group_1__0 ) ) | ( ( rule__Operator__Group_2__0 ) ) | ( ( rule__Operator__Group_3__0 ) ) | ( ( rule__Operator__Group_4__0 ) ) | ( ( rule__Operator__Group_5__0 ) ) | ( ( rule__Operator__Group_6__0 ) ) | ( ( rule__Operator__Group_7__0 ) ) | ( ( rule__Operator__Group_8__0 ) ) | ( ( rule__Operator__Group_9__0 ) ) | ( ( rule__Operator__Group_10__0 ) ) | ( rulePrimary ) )
            int alt11=12;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt11=1;
                }
                break;
            case 62:
                {
                alt11=2;
                }
                break;
            case 65:
                {
                alt11=3;
                }
                break;
            case 68:
                {
                alt11=4;
                }
                break;
            case 69:
                {
                alt11=5;
                }
                break;
            case 70:
                {
                alt11=6;
                }
                break;
            case 71:
                {
                alt11=7;
                }
                break;
            case 72:
                {
                alt11=8;
                }
                break;
            case 73:
                {
                alt11=9;
                }
                break;
            case 75:
                {
                alt11=10;
                }
                break;
            case 77:
                {
                alt11=11;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_STRING:
            case RULE_FQN:
            case 13:
            case 14:
            case 58:
            case 66:
            case 78:
            case 79:
                {
                alt11=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalKPIFormulaDSL.g:1220:2: ( ( rule__Operator__Group_0__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1220:2: ( ( rule__Operator__Group_0__0 ) )
                    // InternalKPIFormulaDSL.g:1221:3: ( rule__Operator__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getGroup_0()); 
                    }
                    // InternalKPIFormulaDSL.g:1222:3: ( rule__Operator__Group_0__0 )
                    // InternalKPIFormulaDSL.g:1222:4: rule__Operator__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:1226:2: ( ( rule__Operator__Group_1__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1226:2: ( ( rule__Operator__Group_1__0 ) )
                    // InternalKPIFormulaDSL.g:1227:3: ( rule__Operator__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getGroup_1()); 
                    }
                    // InternalKPIFormulaDSL.g:1228:3: ( rule__Operator__Group_1__0 )
                    // InternalKPIFormulaDSL.g:1228:4: rule__Operator__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKPIFormulaDSL.g:1232:2: ( ( rule__Operator__Group_2__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1232:2: ( ( rule__Operator__Group_2__0 ) )
                    // InternalKPIFormulaDSL.g:1233:3: ( rule__Operator__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getGroup_2()); 
                    }
                    // InternalKPIFormulaDSL.g:1234:3: ( rule__Operator__Group_2__0 )
                    // InternalKPIFormulaDSL.g:1234:4: rule__Operator__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKPIFormulaDSL.g:1238:2: ( ( rule__Operator__Group_3__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1238:2: ( ( rule__Operator__Group_3__0 ) )
                    // InternalKPIFormulaDSL.g:1239:3: ( rule__Operator__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getGroup_3()); 
                    }
                    // InternalKPIFormulaDSL.g:1240:3: ( rule__Operator__Group_3__0 )
                    // InternalKPIFormulaDSL.g:1240:4: rule__Operator__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKPIFormulaDSL.g:1244:2: ( ( rule__Operator__Group_4__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1244:2: ( ( rule__Operator__Group_4__0 ) )
                    // InternalKPIFormulaDSL.g:1245:3: ( rule__Operator__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getGroup_4()); 
                    }
                    // InternalKPIFormulaDSL.g:1246:3: ( rule__Operator__Group_4__0 )
                    // InternalKPIFormulaDSL.g:1246:4: rule__Operator__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKPIFormulaDSL.g:1250:2: ( ( rule__Operator__Group_5__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1250:2: ( ( rule__Operator__Group_5__0 ) )
                    // InternalKPIFormulaDSL.g:1251:3: ( rule__Operator__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getGroup_5()); 
                    }
                    // InternalKPIFormulaDSL.g:1252:3: ( rule__Operator__Group_5__0 )
                    // InternalKPIFormulaDSL.g:1252:4: rule__Operator__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKPIFormulaDSL.g:1256:2: ( ( rule__Operator__Group_6__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1256:2: ( ( rule__Operator__Group_6__0 ) )
                    // InternalKPIFormulaDSL.g:1257:3: ( rule__Operator__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getGroup_6()); 
                    }
                    // InternalKPIFormulaDSL.g:1258:3: ( rule__Operator__Group_6__0 )
                    // InternalKPIFormulaDSL.g:1258:4: rule__Operator__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalKPIFormulaDSL.g:1262:2: ( ( rule__Operator__Group_7__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1262:2: ( ( rule__Operator__Group_7__0 ) )
                    // InternalKPIFormulaDSL.g:1263:3: ( rule__Operator__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getGroup_7()); 
                    }
                    // InternalKPIFormulaDSL.g:1264:3: ( rule__Operator__Group_7__0 )
                    // InternalKPIFormulaDSL.g:1264:4: rule__Operator__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getGroup_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalKPIFormulaDSL.g:1268:2: ( ( rule__Operator__Group_8__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1268:2: ( ( rule__Operator__Group_8__0 ) )
                    // InternalKPIFormulaDSL.g:1269:3: ( rule__Operator__Group_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getGroup_8()); 
                    }
                    // InternalKPIFormulaDSL.g:1270:3: ( rule__Operator__Group_8__0 )
                    // InternalKPIFormulaDSL.g:1270:4: rule__Operator__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getGroup_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalKPIFormulaDSL.g:1274:2: ( ( rule__Operator__Group_9__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1274:2: ( ( rule__Operator__Group_9__0 ) )
                    // InternalKPIFormulaDSL.g:1275:3: ( rule__Operator__Group_9__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getGroup_9()); 
                    }
                    // InternalKPIFormulaDSL.g:1276:3: ( rule__Operator__Group_9__0 )
                    // InternalKPIFormulaDSL.g:1276:4: rule__Operator__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getGroup_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalKPIFormulaDSL.g:1280:2: ( ( rule__Operator__Group_10__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1280:2: ( ( rule__Operator__Group_10__0 ) )
                    // InternalKPIFormulaDSL.g:1281:3: ( rule__Operator__Group_10__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getGroup_10()); 
                    }
                    // InternalKPIFormulaDSL.g:1282:3: ( rule__Operator__Group_10__0 )
                    // InternalKPIFormulaDSL.g:1282:4: rule__Operator__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operator__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getGroup_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalKPIFormulaDSL.g:1286:2: ( rulePrimary )
                    {
                    // InternalKPIFormulaDSL.g:1286:2: ( rulePrimary )
                    // InternalKPIFormulaDSL.g:1287:3: rulePrimary
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getPrimaryParserRuleCall_11()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePrimary();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getPrimaryParserRuleCall_11()); 
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
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalKPIFormulaDSL.g:1296:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1300:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleAtomic ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt12=1;
                }
                break;
            case 78:
                {
                alt12=2;
                }
                break;
            case 58:
                {
                alt12=3;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_STRING:
            case RULE_FQN:
            case 13:
            case 14:
            case 79:
                {
                alt12=4;
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
                    // InternalKPIFormulaDSL.g:1301:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1301:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalKPIFormulaDSL.g:1302:3: ( rule__Primary__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    }
                    // InternalKPIFormulaDSL.g:1303:3: ( rule__Primary__Group_0__0 )
                    // InternalKPIFormulaDSL.g:1303:4: rule__Primary__Group_0__0
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
                    // InternalKPIFormulaDSL.g:1307:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1307:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalKPIFormulaDSL.g:1308:3: ( rule__Primary__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    }
                    // InternalKPIFormulaDSL.g:1309:3: ( rule__Primary__Group_1__0 )
                    // InternalKPIFormulaDSL.g:1309:4: rule__Primary__Group_1__0
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
                    // InternalKPIFormulaDSL.g:1313:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1313:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalKPIFormulaDSL.g:1314:3: ( rule__Primary__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    }
                    // InternalKPIFormulaDSL.g:1315:3: ( rule__Primary__Group_2__0 )
                    // InternalKPIFormulaDSL.g:1315:4: rule__Primary__Group_2__0
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
                    // InternalKPIFormulaDSL.g:1319:2: ( ruleAtomic )
                    {
                    // InternalKPIFormulaDSL.g:1319:2: ( ruleAtomic )
                    // InternalKPIFormulaDSL.g:1320:3: ruleAtomic
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAtomic();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_3()); 
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
    // InternalKPIFormulaDSL.g:1329:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) | ( ( rule__Atomic__Group_5__0 ) ) | ( ( rule__Atomic__Group_6__0 ) ) | ( ( rule__Atomic__Group_7__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1333:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) | ( ( rule__Atomic__Group_5__0 ) ) | ( ( rule__Atomic__Group_6__0 ) ) | ( ( rule__Atomic__Group_7__0 ) ) )
            int alt13=8;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalKPIFormulaDSL.g:1334:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1334:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalKPIFormulaDSL.g:1335:3: ( rule__Atomic__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    }
                    // InternalKPIFormulaDSL.g:1336:3: ( rule__Atomic__Group_0__0 )
                    // InternalKPIFormulaDSL.g:1336:4: rule__Atomic__Group_0__0
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
                    // InternalKPIFormulaDSL.g:1340:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1340:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalKPIFormulaDSL.g:1341:3: ( rule__Atomic__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    }
                    // InternalKPIFormulaDSL.g:1342:3: ( rule__Atomic__Group_1__0 )
                    // InternalKPIFormulaDSL.g:1342:4: rule__Atomic__Group_1__0
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
                    // InternalKPIFormulaDSL.g:1346:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1346:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalKPIFormulaDSL.g:1347:3: ( rule__Atomic__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    }
                    // InternalKPIFormulaDSL.g:1348:3: ( rule__Atomic__Group_2__0 )
                    // InternalKPIFormulaDSL.g:1348:4: rule__Atomic__Group_2__0
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
                    // InternalKPIFormulaDSL.g:1352:2: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1352:2: ( ( rule__Atomic__Group_3__0 ) )
                    // InternalKPIFormulaDSL.g:1353:3: ( rule__Atomic__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    }
                    // InternalKPIFormulaDSL.g:1354:3: ( rule__Atomic__Group_3__0 )
                    // InternalKPIFormulaDSL.g:1354:4: rule__Atomic__Group_3__0
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
                    // InternalKPIFormulaDSL.g:1358:2: ( ( rule__Atomic__Group_4__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1358:2: ( ( rule__Atomic__Group_4__0 ) )
                    // InternalKPIFormulaDSL.g:1359:3: ( rule__Atomic__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_4()); 
                    }
                    // InternalKPIFormulaDSL.g:1360:3: ( rule__Atomic__Group_4__0 )
                    // InternalKPIFormulaDSL.g:1360:4: rule__Atomic__Group_4__0
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
                    // InternalKPIFormulaDSL.g:1364:2: ( ( rule__Atomic__Group_5__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1364:2: ( ( rule__Atomic__Group_5__0 ) )
                    // InternalKPIFormulaDSL.g:1365:3: ( rule__Atomic__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_5()); 
                    }
                    // InternalKPIFormulaDSL.g:1366:3: ( rule__Atomic__Group_5__0 )
                    // InternalKPIFormulaDSL.g:1366:4: rule__Atomic__Group_5__0
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
                    // InternalKPIFormulaDSL.g:1370:2: ( ( rule__Atomic__Group_6__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1370:2: ( ( rule__Atomic__Group_6__0 ) )
                    // InternalKPIFormulaDSL.g:1371:3: ( rule__Atomic__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_6()); 
                    }
                    // InternalKPIFormulaDSL.g:1372:3: ( rule__Atomic__Group_6__0 )
                    // InternalKPIFormulaDSL.g:1372:4: rule__Atomic__Group_6__0
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
                case 8 :
                    // InternalKPIFormulaDSL.g:1376:2: ( ( rule__Atomic__Group_7__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1376:2: ( ( rule__Atomic__Group_7__0 ) )
                    // InternalKPIFormulaDSL.g:1377:3: ( rule__Atomic__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_7()); 
                    }
                    // InternalKPIFormulaDSL.g:1378:3: ( rule__Atomic__Group_7__0 )
                    // InternalKPIFormulaDSL.g:1378:4: rule__Atomic__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_7()); 
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


    // $ANTLR start "rule__Atomic__ValueAlternatives_4_1_0"
    // InternalKPIFormulaDSL.g:1386:1: rule__Atomic__ValueAlternatives_4_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1390:1: ( ( 'true' ) | ( 'false' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            else if ( (LA14_0==14) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalKPIFormulaDSL.g:1391:2: ( 'true' )
                    {
                    // InternalKPIFormulaDSL.g:1391:2: ( 'true' )
                    // InternalKPIFormulaDSL.g:1392:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getValueTrueKeyword_4_1_0_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getValueTrueKeyword_4_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:1397:2: ( 'false' )
                    {
                    // InternalKPIFormulaDSL.g:1397:2: ( 'false' )
                    // InternalKPIFormulaDSL.g:1398:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getValueFalseKeyword_4_1_0_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getValueFalseKeyword_4_1_0_1()); 
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
    // $ANTLR end "rule__Atomic__ValueAlternatives_4_1_0"


    // $ANTLR start "rule__WindowUnit__Alternatives"
    // InternalKPIFormulaDSL.g:1407:1: rule__WindowUnit__Alternatives : ( ( ( 'seconds' ) ) | ( ( 'minutes' ) ) | ( ( 'hours' ) ) | ( ( 'days' ) ) | ( ( 'measurements' ) ) );
    public final void rule__WindowUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1411:1: ( ( ( 'seconds' ) ) | ( ( 'minutes' ) ) | ( ( 'hours' ) ) | ( ( 'days' ) ) | ( ( 'measurements' ) ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt15=1;
                }
                break;
            case 16:
                {
                alt15=2;
                }
                break;
            case 17:
                {
                alt15=3;
                }
                break;
            case 18:
                {
                alt15=4;
                }
                break;
            case 19:
                {
                alt15=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalKPIFormulaDSL.g:1412:2: ( ( 'seconds' ) )
                    {
                    // InternalKPIFormulaDSL.g:1412:2: ( ( 'seconds' ) )
                    // InternalKPIFormulaDSL.g:1413:3: ( 'seconds' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWindowUnitAccess().getSECEnumLiteralDeclaration_0()); 
                    }
                    // InternalKPIFormulaDSL.g:1414:3: ( 'seconds' )
                    // InternalKPIFormulaDSL.g:1414:4: 'seconds'
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
                    // InternalKPIFormulaDSL.g:1418:2: ( ( 'minutes' ) )
                    {
                    // InternalKPIFormulaDSL.g:1418:2: ( ( 'minutes' ) )
                    // InternalKPIFormulaDSL.g:1419:3: ( 'minutes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWindowUnitAccess().getMINEnumLiteralDeclaration_1()); 
                    }
                    // InternalKPIFormulaDSL.g:1420:3: ( 'minutes' )
                    // InternalKPIFormulaDSL.g:1420:4: 'minutes'
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
                    // InternalKPIFormulaDSL.g:1424:2: ( ( 'hours' ) )
                    {
                    // InternalKPIFormulaDSL.g:1424:2: ( ( 'hours' ) )
                    // InternalKPIFormulaDSL.g:1425:3: ( 'hours' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWindowUnitAccess().getHOUREnumLiteralDeclaration_2()); 
                    }
                    // InternalKPIFormulaDSL.g:1426:3: ( 'hours' )
                    // InternalKPIFormulaDSL.g:1426:4: 'hours'
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
                    // InternalKPIFormulaDSL.g:1430:2: ( ( 'days' ) )
                    {
                    // InternalKPIFormulaDSL.g:1430:2: ( ( 'days' ) )
                    // InternalKPIFormulaDSL.g:1431:3: ( 'days' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWindowUnitAccess().getDAYEnumLiteralDeclaration_3()); 
                    }
                    // InternalKPIFormulaDSL.g:1432:3: ( 'days' )
                    // InternalKPIFormulaDSL.g:1432:4: 'days'
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
                    // InternalKPIFormulaDSL.g:1436:2: ( ( 'measurements' ) )
                    {
                    // InternalKPIFormulaDSL.g:1436:2: ( ( 'measurements' ) )
                    // InternalKPIFormulaDSL.g:1437:3: ( 'measurements' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWindowUnitAccess().getMEASUREMENTEnumLiteralDeclaration_4()); 
                    }
                    // InternalKPIFormulaDSL.g:1438:3: ( 'measurements' )
                    // InternalKPIFormulaDSL.g:1438:4: 'measurements'
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
    // InternalKPIFormulaDSL.g:1446:1: rule__ValueUnit__Alternatives : ( ( ( 'milliseconds' ) ) | ( ( 'seconds' ) ) | ( ( 'minutes' ) ) | ( ( 'hours' ) ) | ( ( 'liters' ) ) | ( ( 'cubic meter' ) ) | ( ( 'Wh' ) ) | ( ( 'kWh' ) ) | ( ( 'gCO2eq' ) ) | ( ( 'kgCO2eq' ) ) );
    public final void rule__ValueUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1450:1: ( ( ( 'milliseconds' ) ) | ( ( 'seconds' ) ) | ( ( 'minutes' ) ) | ( ( 'hours' ) ) | ( ( 'liters' ) ) | ( ( 'cubic meter' ) ) | ( ( 'Wh' ) ) | ( ( 'kWh' ) ) | ( ( 'gCO2eq' ) ) | ( ( 'kgCO2eq' ) ) )
            int alt16=10;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt16=1;
                }
                break;
            case 15:
                {
                alt16=2;
                }
                break;
            case 16:
                {
                alt16=3;
                }
                break;
            case 17:
                {
                alt16=4;
                }
                break;
            case 21:
                {
                alt16=5;
                }
                break;
            case 22:
                {
                alt16=6;
                }
                break;
            case 23:
                {
                alt16=7;
                }
                break;
            case 24:
                {
                alt16=8;
                }
                break;
            case 25:
                {
                alt16=9;
                }
                break;
            case 26:
                {
                alt16=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalKPIFormulaDSL.g:1451:2: ( ( 'milliseconds' ) )
                    {
                    // InternalKPIFormulaDSL.g:1451:2: ( ( 'milliseconds' ) )
                    // InternalKPIFormulaDSL.g:1452:3: ( 'milliseconds' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getMILLIEnumLiteralDeclaration_0()); 
                    }
                    // InternalKPIFormulaDSL.g:1453:3: ( 'milliseconds' )
                    // InternalKPIFormulaDSL.g:1453:4: 'milliseconds'
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
                    // InternalKPIFormulaDSL.g:1457:2: ( ( 'seconds' ) )
                    {
                    // InternalKPIFormulaDSL.g:1457:2: ( ( 'seconds' ) )
                    // InternalKPIFormulaDSL.g:1458:3: ( 'seconds' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getSECEnumLiteralDeclaration_1()); 
                    }
                    // InternalKPIFormulaDSL.g:1459:3: ( 'seconds' )
                    // InternalKPIFormulaDSL.g:1459:4: 'seconds'
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
                    // InternalKPIFormulaDSL.g:1463:2: ( ( 'minutes' ) )
                    {
                    // InternalKPIFormulaDSL.g:1463:2: ( ( 'minutes' ) )
                    // InternalKPIFormulaDSL.g:1464:3: ( 'minutes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getMINEnumLiteralDeclaration_2()); 
                    }
                    // InternalKPIFormulaDSL.g:1465:3: ( 'minutes' )
                    // InternalKPIFormulaDSL.g:1465:4: 'minutes'
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
                    // InternalKPIFormulaDSL.g:1469:2: ( ( 'hours' ) )
                    {
                    // InternalKPIFormulaDSL.g:1469:2: ( ( 'hours' ) )
                    // InternalKPIFormulaDSL.g:1470:3: ( 'hours' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getHOUREnumLiteralDeclaration_3()); 
                    }
                    // InternalKPIFormulaDSL.g:1471:3: ( 'hours' )
                    // InternalKPIFormulaDSL.g:1471:4: 'hours'
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
                    // InternalKPIFormulaDSL.g:1475:2: ( ( 'liters' ) )
                    {
                    // InternalKPIFormulaDSL.g:1475:2: ( ( 'liters' ) )
                    // InternalKPIFormulaDSL.g:1476:3: ( 'liters' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getLITERSEnumLiteralDeclaration_4()); 
                    }
                    // InternalKPIFormulaDSL.g:1477:3: ( 'liters' )
                    // InternalKPIFormulaDSL.g:1477:4: 'liters'
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
                    // InternalKPIFormulaDSL.g:1481:2: ( ( 'cubic meter' ) )
                    {
                    // InternalKPIFormulaDSL.g:1481:2: ( ( 'cubic meter' ) )
                    // InternalKPIFormulaDSL.g:1482:3: ( 'cubic meter' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getM3EnumLiteralDeclaration_5()); 
                    }
                    // InternalKPIFormulaDSL.g:1483:3: ( 'cubic meter' )
                    // InternalKPIFormulaDSL.g:1483:4: 'cubic meter'
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
                    // InternalKPIFormulaDSL.g:1487:2: ( ( 'Wh' ) )
                    {
                    // InternalKPIFormulaDSL.g:1487:2: ( ( 'Wh' ) )
                    // InternalKPIFormulaDSL.g:1488:3: ( 'Wh' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getWhEnumLiteralDeclaration_6()); 
                    }
                    // InternalKPIFormulaDSL.g:1489:3: ( 'Wh' )
                    // InternalKPIFormulaDSL.g:1489:4: 'Wh'
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
                    // InternalKPIFormulaDSL.g:1493:2: ( ( 'kWh' ) )
                    {
                    // InternalKPIFormulaDSL.g:1493:2: ( ( 'kWh' ) )
                    // InternalKPIFormulaDSL.g:1494:3: ( 'kWh' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getKWhEnumLiteralDeclaration_7()); 
                    }
                    // InternalKPIFormulaDSL.g:1495:3: ( 'kWh' )
                    // InternalKPIFormulaDSL.g:1495:4: 'kWh'
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
                    // InternalKPIFormulaDSL.g:1499:2: ( ( 'gCO2eq' ) )
                    {
                    // InternalKPIFormulaDSL.g:1499:2: ( ( 'gCO2eq' ) )
                    // InternalKPIFormulaDSL.g:1500:3: ( 'gCO2eq' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getGCO2eqEnumLiteralDeclaration_8()); 
                    }
                    // InternalKPIFormulaDSL.g:1501:3: ( 'gCO2eq' )
                    // InternalKPIFormulaDSL.g:1501:4: 'gCO2eq'
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
                    // InternalKPIFormulaDSL.g:1505:2: ( ( 'kgCO2eq' ) )
                    {
                    // InternalKPIFormulaDSL.g:1505:2: ( ( 'kgCO2eq' ) )
                    // InternalKPIFormulaDSL.g:1506:3: ( 'kgCO2eq' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getKgCO2eqEnumLiteralDeclaration_9()); 
                    }
                    // InternalKPIFormulaDSL.g:1507:3: ( 'kgCO2eq' )
                    // InternalKPIFormulaDSL.g:1507:4: 'kgCO2eq'
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


    // $ANTLR start "rule__Computation__Group__0"
    // InternalKPIFormulaDSL.g:1515:1: rule__Computation__Group__0 : rule__Computation__Group__0__Impl rule__Computation__Group__1 ;
    public final void rule__Computation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1519:1: ( rule__Computation__Group__0__Impl rule__Computation__Group__1 )
            // InternalKPIFormulaDSL.g:1520:2: rule__Computation__Group__0__Impl rule__Computation__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalKPIFormulaDSL.g:1527:1: rule__Computation__Group__0__Impl : ( ( rule__Computation__ComputedAssignment_0 ) ) ;
    public final void rule__Computation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1531:1: ( ( ( rule__Computation__ComputedAssignment_0 ) ) )
            // InternalKPIFormulaDSL.g:1532:1: ( ( rule__Computation__ComputedAssignment_0 ) )
            {
            // InternalKPIFormulaDSL.g:1532:1: ( ( rule__Computation__ComputedAssignment_0 ) )
            // InternalKPIFormulaDSL.g:1533:2: ( rule__Computation__ComputedAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComputationAccess().getComputedAssignment_0()); 
            }
            // InternalKPIFormulaDSL.g:1534:2: ( rule__Computation__ComputedAssignment_0 )
            // InternalKPIFormulaDSL.g:1534:3: rule__Computation__ComputedAssignment_0
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
    // InternalKPIFormulaDSL.g:1542:1: rule__Computation__Group__1 : rule__Computation__Group__1__Impl rule__Computation__Group__2 ;
    public final void rule__Computation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1546:1: ( rule__Computation__Group__1__Impl rule__Computation__Group__2 )
            // InternalKPIFormulaDSL.g:1547:2: rule__Computation__Group__1__Impl rule__Computation__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIFormulaDSL.g:1554:1: rule__Computation__Group__1__Impl : ( '=' ) ;
    public final void rule__Computation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1558:1: ( ( '=' ) )
            // InternalKPIFormulaDSL.g:1559:1: ( '=' )
            {
            // InternalKPIFormulaDSL.g:1559:1: ( '=' )
            // InternalKPIFormulaDSL.g:1560:2: '='
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
    // InternalKPIFormulaDSL.g:1569:1: rule__Computation__Group__2 : rule__Computation__Group__2__Impl ;
    public final void rule__Computation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1573:1: ( rule__Computation__Group__2__Impl )
            // InternalKPIFormulaDSL.g:1574:2: rule__Computation__Group__2__Impl
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
    // InternalKPIFormulaDSL.g:1580:1: rule__Computation__Group__2__Impl : ( ( rule__Computation__FormulaAssignment_2 ) ) ;
    public final void rule__Computation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1584:1: ( ( ( rule__Computation__FormulaAssignment_2 ) ) )
            // InternalKPIFormulaDSL.g:1585:1: ( ( rule__Computation__FormulaAssignment_2 ) )
            {
            // InternalKPIFormulaDSL.g:1585:1: ( ( rule__Computation__FormulaAssignment_2 ) )
            // InternalKPIFormulaDSL.g:1586:2: ( rule__Computation__FormulaAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComputationAccess().getFormulaAssignment_2()); 
            }
            // InternalKPIFormulaDSL.g:1587:2: ( rule__Computation__FormulaAssignment_2 )
            // InternalKPIFormulaDSL.g:1587:3: rule__Computation__FormulaAssignment_2
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
    // InternalKPIFormulaDSL.g:1596:1: rule__Metric__Group__0 : rule__Metric__Group__0__Impl rule__Metric__Group__1 ;
    public final void rule__Metric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1600:1: ( rule__Metric__Group__0__Impl rule__Metric__Group__1 )
            // InternalKPIFormulaDSL.g:1601:2: rule__Metric__Group__0__Impl rule__Metric__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalKPIFormulaDSL.g:1608:1: rule__Metric__Group__0__Impl : ( ( rule__Metric__NameAssignment_0 ) ) ;
    public final void rule__Metric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1612:1: ( ( ( rule__Metric__NameAssignment_0 ) ) )
            // InternalKPIFormulaDSL.g:1613:1: ( ( rule__Metric__NameAssignment_0 ) )
            {
            // InternalKPIFormulaDSL.g:1613:1: ( ( rule__Metric__NameAssignment_0 ) )
            // InternalKPIFormulaDSL.g:1614:2: ( rule__Metric__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricAccess().getNameAssignment_0()); 
            }
            // InternalKPIFormulaDSL.g:1615:2: ( rule__Metric__NameAssignment_0 )
            // InternalKPIFormulaDSL.g:1615:3: rule__Metric__NameAssignment_0
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
    // InternalKPIFormulaDSL.g:1623:1: rule__Metric__Group__1 : rule__Metric__Group__1__Impl rule__Metric__Group__2 ;
    public final void rule__Metric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1627:1: ( rule__Metric__Group__1__Impl rule__Metric__Group__2 )
            // InternalKPIFormulaDSL.g:1628:2: rule__Metric__Group__1__Impl rule__Metric__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalKPIFormulaDSL.g:1635:1: rule__Metric__Group__1__Impl : ( 'of' ) ;
    public final void rule__Metric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1639:1: ( ( 'of' ) )
            // InternalKPIFormulaDSL.g:1640:1: ( 'of' )
            {
            // InternalKPIFormulaDSL.g:1640:1: ( 'of' )
            // InternalKPIFormulaDSL.g:1641:2: 'of'
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
    // InternalKPIFormulaDSL.g:1650:1: rule__Metric__Group__2 : rule__Metric__Group__2__Impl rule__Metric__Group__3 ;
    public final void rule__Metric__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1654:1: ( rule__Metric__Group__2__Impl rule__Metric__Group__3 )
            // InternalKPIFormulaDSL.g:1655:2: rule__Metric__Group__2__Impl rule__Metric__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalKPIFormulaDSL.g:1662:1: rule__Metric__Group__2__Impl : ( 'type' ) ;
    public final void rule__Metric__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1666:1: ( ( 'type' ) )
            // InternalKPIFormulaDSL.g:1667:1: ( 'type' )
            {
            // InternalKPIFormulaDSL.g:1667:1: ( 'type' )
            // InternalKPIFormulaDSL.g:1668:2: 'type'
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
    // InternalKPIFormulaDSL.g:1677:1: rule__Metric__Group__3 : rule__Metric__Group__3__Impl ;
    public final void rule__Metric__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1681:1: ( rule__Metric__Group__3__Impl )
            // InternalKPIFormulaDSL.g:1682:2: rule__Metric__Group__3__Impl
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
    // InternalKPIFormulaDSL.g:1688:1: rule__Metric__Group__3__Impl : ( ( rule__Metric__TypeAssignment_3 ) ) ;
    public final void rule__Metric__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1692:1: ( ( ( rule__Metric__TypeAssignment_3 ) ) )
            // InternalKPIFormulaDSL.g:1693:1: ( ( rule__Metric__TypeAssignment_3 ) )
            {
            // InternalKPIFormulaDSL.g:1693:1: ( ( rule__Metric__TypeAssignment_3 ) )
            // InternalKPIFormulaDSL.g:1694:2: ( rule__Metric__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricAccess().getTypeAssignment_3()); 
            }
            // InternalKPIFormulaDSL.g:1695:2: ( rule__Metric__TypeAssignment_3 )
            // InternalKPIFormulaDSL.g:1695:3: rule__Metric__TypeAssignment_3
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
    // InternalKPIFormulaDSL.g:1704:1: rule__KPI__Group__0 : rule__KPI__Group__0__Impl rule__KPI__Group__1 ;
    public final void rule__KPI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1708:1: ( rule__KPI__Group__0__Impl rule__KPI__Group__1 )
            // InternalKPIFormulaDSL.g:1709:2: rule__KPI__Group__0__Impl rule__KPI__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalKPIFormulaDSL.g:1716:1: rule__KPI__Group__0__Impl : ( 'KPI' ) ;
    public final void rule__KPI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1720:1: ( ( 'KPI' ) )
            // InternalKPIFormulaDSL.g:1721:1: ( 'KPI' )
            {
            // InternalKPIFormulaDSL.g:1721:1: ( 'KPI' )
            // InternalKPIFormulaDSL.g:1722:2: 'KPI'
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
    // InternalKPIFormulaDSL.g:1731:1: rule__KPI__Group__1 : rule__KPI__Group__1__Impl rule__KPI__Group__2 ;
    public final void rule__KPI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1735:1: ( rule__KPI__Group__1__Impl rule__KPI__Group__2 )
            // InternalKPIFormulaDSL.g:1736:2: rule__KPI__Group__1__Impl rule__KPI__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalKPIFormulaDSL.g:1743:1: rule__KPI__Group__1__Impl : ( ( rule__KPI__NameAssignment_1 ) ) ;
    public final void rule__KPI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1747:1: ( ( ( rule__KPI__NameAssignment_1 ) ) )
            // InternalKPIFormulaDSL.g:1748:1: ( ( rule__KPI__NameAssignment_1 ) )
            {
            // InternalKPIFormulaDSL.g:1748:1: ( ( rule__KPI__NameAssignment_1 ) )
            // InternalKPIFormulaDSL.g:1749:2: ( rule__KPI__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKPIAccess().getNameAssignment_1()); 
            }
            // InternalKPIFormulaDSL.g:1750:2: ( rule__KPI__NameAssignment_1 )
            // InternalKPIFormulaDSL.g:1750:3: rule__KPI__NameAssignment_1
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
    // InternalKPIFormulaDSL.g:1758:1: rule__KPI__Group__2 : rule__KPI__Group__2__Impl rule__KPI__Group__3 ;
    public final void rule__KPI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1762:1: ( rule__KPI__Group__2__Impl rule__KPI__Group__3 )
            // InternalKPIFormulaDSL.g:1763:2: rule__KPI__Group__2__Impl rule__KPI__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalKPIFormulaDSL.g:1770:1: rule__KPI__Group__2__Impl : ( 'of' ) ;
    public final void rule__KPI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1774:1: ( ( 'of' ) )
            // InternalKPIFormulaDSL.g:1775:1: ( 'of' )
            {
            // InternalKPIFormulaDSL.g:1775:1: ( 'of' )
            // InternalKPIFormulaDSL.g:1776:2: 'of'
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
    // InternalKPIFormulaDSL.g:1785:1: rule__KPI__Group__3 : rule__KPI__Group__3__Impl rule__KPI__Group__4 ;
    public final void rule__KPI__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1789:1: ( rule__KPI__Group__3__Impl rule__KPI__Group__4 )
            // InternalKPIFormulaDSL.g:1790:2: rule__KPI__Group__3__Impl rule__KPI__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalKPIFormulaDSL.g:1797:1: rule__KPI__Group__3__Impl : ( 'type' ) ;
    public final void rule__KPI__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1801:1: ( ( 'type' ) )
            // InternalKPIFormulaDSL.g:1802:1: ( 'type' )
            {
            // InternalKPIFormulaDSL.g:1802:1: ( 'type' )
            // InternalKPIFormulaDSL.g:1803:2: 'type'
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
    // InternalKPIFormulaDSL.g:1812:1: rule__KPI__Group__4 : rule__KPI__Group__4__Impl ;
    public final void rule__KPI__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1816:1: ( rule__KPI__Group__4__Impl )
            // InternalKPIFormulaDSL.g:1817:2: rule__KPI__Group__4__Impl
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
    // InternalKPIFormulaDSL.g:1823:1: rule__KPI__Group__4__Impl : ( ( rule__KPI__TypeAssignment_4 ) ) ;
    public final void rule__KPI__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1827:1: ( ( ( rule__KPI__TypeAssignment_4 ) ) )
            // InternalKPIFormulaDSL.g:1828:1: ( ( rule__KPI__TypeAssignment_4 ) )
            {
            // InternalKPIFormulaDSL.g:1828:1: ( ( rule__KPI__TypeAssignment_4 ) )
            // InternalKPIFormulaDSL.g:1829:2: ( rule__KPI__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKPIAccess().getTypeAssignment_4()); 
            }
            // InternalKPIFormulaDSL.g:1830:2: ( rule__KPI__TypeAssignment_4 )
            // InternalKPIFormulaDSL.g:1830:3: rule__KPI__TypeAssignment_4
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
    // InternalKPIFormulaDSL.g:1839:1: rule__IntegerValue__Group__0 : rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 ;
    public final void rule__IntegerValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1843:1: ( rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 )
            // InternalKPIFormulaDSL.g:1844:2: rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalKPIFormulaDSL.g:1851:1: rule__IntegerValue__Group__0__Impl : ( () ) ;
    public final void rule__IntegerValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1855:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:1856:1: ( () )
            {
            // InternalKPIFormulaDSL.g:1856:1: ( () )
            // InternalKPIFormulaDSL.g:1857:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueAccess().getIntegerValueAction_0()); 
            }
            // InternalKPIFormulaDSL.g:1858:2: ()
            // InternalKPIFormulaDSL.g:1858:3: 
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
    // InternalKPIFormulaDSL.g:1866:1: rule__IntegerValue__Group__1 : rule__IntegerValue__Group__1__Impl ;
    public final void rule__IntegerValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1870:1: ( rule__IntegerValue__Group__1__Impl )
            // InternalKPIFormulaDSL.g:1871:2: rule__IntegerValue__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:1877:1: rule__IntegerValue__Group__1__Impl : ( 'int' ) ;
    public final void rule__IntegerValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1881:1: ( ( 'int' ) )
            // InternalKPIFormulaDSL.g:1882:1: ( 'int' )
            {
            // InternalKPIFormulaDSL.g:1882:1: ( 'int' )
            // InternalKPIFormulaDSL.g:1883:2: 'int'
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
    // InternalKPIFormulaDSL.g:1893:1: rule__RealValue__Group__0 : rule__RealValue__Group__0__Impl rule__RealValue__Group__1 ;
    public final void rule__RealValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1897:1: ( rule__RealValue__Group__0__Impl rule__RealValue__Group__1 )
            // InternalKPIFormulaDSL.g:1898:2: rule__RealValue__Group__0__Impl rule__RealValue__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalKPIFormulaDSL.g:1905:1: rule__RealValue__Group__0__Impl : ( () ) ;
    public final void rule__RealValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1909:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:1910:1: ( () )
            {
            // InternalKPIFormulaDSL.g:1910:1: ( () )
            // InternalKPIFormulaDSL.g:1911:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealValueAccess().getRealValueAction_0()); 
            }
            // InternalKPIFormulaDSL.g:1912:2: ()
            // InternalKPIFormulaDSL.g:1912:3: 
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
    // InternalKPIFormulaDSL.g:1920:1: rule__RealValue__Group__1 : rule__RealValue__Group__1__Impl ;
    public final void rule__RealValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1924:1: ( rule__RealValue__Group__1__Impl )
            // InternalKPIFormulaDSL.g:1925:2: rule__RealValue__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:1931:1: rule__RealValue__Group__1__Impl : ( 'real' ) ;
    public final void rule__RealValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1935:1: ( ( 'real' ) )
            // InternalKPIFormulaDSL.g:1936:1: ( 'real' )
            {
            // InternalKPIFormulaDSL.g:1936:1: ( 'real' )
            // InternalKPIFormulaDSL.g:1937:2: 'real'
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
    // InternalKPIFormulaDSL.g:1947:1: rule__TextualValue__Group__0 : rule__TextualValue__Group__0__Impl rule__TextualValue__Group__1 ;
    public final void rule__TextualValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1951:1: ( rule__TextualValue__Group__0__Impl rule__TextualValue__Group__1 )
            // InternalKPIFormulaDSL.g:1952:2: rule__TextualValue__Group__0__Impl rule__TextualValue__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalKPIFormulaDSL.g:1959:1: rule__TextualValue__Group__0__Impl : ( () ) ;
    public final void rule__TextualValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1963:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:1964:1: ( () )
            {
            // InternalKPIFormulaDSL.g:1964:1: ( () )
            // InternalKPIFormulaDSL.g:1965:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextualValueAccess().getTextualValueAction_0()); 
            }
            // InternalKPIFormulaDSL.g:1966:2: ()
            // InternalKPIFormulaDSL.g:1966:3: 
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
    // InternalKPIFormulaDSL.g:1974:1: rule__TextualValue__Group__1 : rule__TextualValue__Group__1__Impl ;
    public final void rule__TextualValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1978:1: ( rule__TextualValue__Group__1__Impl )
            // InternalKPIFormulaDSL.g:1979:2: rule__TextualValue__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:1985:1: rule__TextualValue__Group__1__Impl : ( 'text' ) ;
    public final void rule__TextualValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1989:1: ( ( 'text' ) )
            // InternalKPIFormulaDSL.g:1990:1: ( 'text' )
            {
            // InternalKPIFormulaDSL.g:1990:1: ( 'text' )
            // InternalKPIFormulaDSL.g:1991:2: 'text'
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
    // InternalKPIFormulaDSL.g:2001:1: rule__BooleanValue__Group__0 : rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 ;
    public final void rule__BooleanValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2005:1: ( rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 )
            // InternalKPIFormulaDSL.g:2006:2: rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalKPIFormulaDSL.g:2013:1: rule__BooleanValue__Group__0__Impl : ( () ) ;
    public final void rule__BooleanValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2017:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:2018:1: ( () )
            {
            // InternalKPIFormulaDSL.g:2018:1: ( () )
            // InternalKPIFormulaDSL.g:2019:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getBooleanValueAction_0()); 
            }
            // InternalKPIFormulaDSL.g:2020:2: ()
            // InternalKPIFormulaDSL.g:2020:3: 
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
    // InternalKPIFormulaDSL.g:2028:1: rule__BooleanValue__Group__1 : rule__BooleanValue__Group__1__Impl ;
    public final void rule__BooleanValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2032:1: ( rule__BooleanValue__Group__1__Impl )
            // InternalKPIFormulaDSL.g:2033:2: rule__BooleanValue__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:2039:1: rule__BooleanValue__Group__1__Impl : ( 'bool' ) ;
    public final void rule__BooleanValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2043:1: ( ( 'bool' ) )
            // InternalKPIFormulaDSL.g:2044:1: ( 'bool' )
            {
            // InternalKPIFormulaDSL.g:2044:1: ( 'bool' )
            // InternalKPIFormulaDSL.g:2045:2: 'bool'
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
    // InternalKPIFormulaDSL.g:2055:1: rule__EnumerationValue__Group__0 : rule__EnumerationValue__Group__0__Impl rule__EnumerationValue__Group__1 ;
    public final void rule__EnumerationValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2059:1: ( rule__EnumerationValue__Group__0__Impl rule__EnumerationValue__Group__1 )
            // InternalKPIFormulaDSL.g:2060:2: rule__EnumerationValue__Group__0__Impl rule__EnumerationValue__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalKPIFormulaDSL.g:2067:1: rule__EnumerationValue__Group__0__Impl : ( '{' ) ;
    public final void rule__EnumerationValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2071:1: ( ( '{' ) )
            // InternalKPIFormulaDSL.g:2072:1: ( '{' )
            {
            // InternalKPIFormulaDSL.g:2072:1: ( '{' )
            // InternalKPIFormulaDSL.g:2073:2: '{'
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
    // InternalKPIFormulaDSL.g:2082:1: rule__EnumerationValue__Group__1 : rule__EnumerationValue__Group__1__Impl rule__EnumerationValue__Group__2 ;
    public final void rule__EnumerationValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2086:1: ( rule__EnumerationValue__Group__1__Impl rule__EnumerationValue__Group__2 )
            // InternalKPIFormulaDSL.g:2087:2: rule__EnumerationValue__Group__1__Impl rule__EnumerationValue__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalKPIFormulaDSL.g:2094:1: rule__EnumerationValue__Group__1__Impl : ( ( ( rule__EnumerationValue__LiteralsAssignment_1 ) ) ( ( rule__EnumerationValue__LiteralsAssignment_1 )* ) ) ;
    public final void rule__EnumerationValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2098:1: ( ( ( ( rule__EnumerationValue__LiteralsAssignment_1 ) ) ( ( rule__EnumerationValue__LiteralsAssignment_1 )* ) ) )
            // InternalKPIFormulaDSL.g:2099:1: ( ( ( rule__EnumerationValue__LiteralsAssignment_1 ) ) ( ( rule__EnumerationValue__LiteralsAssignment_1 )* ) )
            {
            // InternalKPIFormulaDSL.g:2099:1: ( ( ( rule__EnumerationValue__LiteralsAssignment_1 ) ) ( ( rule__EnumerationValue__LiteralsAssignment_1 )* ) )
            // InternalKPIFormulaDSL.g:2100:2: ( ( rule__EnumerationValue__LiteralsAssignment_1 ) ) ( ( rule__EnumerationValue__LiteralsAssignment_1 )* )
            {
            // InternalKPIFormulaDSL.g:2100:2: ( ( rule__EnumerationValue__LiteralsAssignment_1 ) )
            // InternalKPIFormulaDSL.g:2101:3: ( rule__EnumerationValue__LiteralsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationValueAccess().getLiteralsAssignment_1()); 
            }
            // InternalKPIFormulaDSL.g:2102:3: ( rule__EnumerationValue__LiteralsAssignment_1 )
            // InternalKPIFormulaDSL.g:2102:4: rule__EnumerationValue__LiteralsAssignment_1
            {
            pushFollow(FOLLOW_15);
            rule__EnumerationValue__LiteralsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationValueAccess().getLiteralsAssignment_1()); 
            }

            }

            // InternalKPIFormulaDSL.g:2105:2: ( ( rule__EnumerationValue__LiteralsAssignment_1 )* )
            // InternalKPIFormulaDSL.g:2106:3: ( rule__EnumerationValue__LiteralsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationValueAccess().getLiteralsAssignment_1()); 
            }
            // InternalKPIFormulaDSL.g:2107:3: ( rule__EnumerationValue__LiteralsAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:2107:4: rule__EnumerationValue__LiteralsAssignment_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__EnumerationValue__LiteralsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalKPIFormulaDSL.g:2116:1: rule__EnumerationValue__Group__2 : rule__EnumerationValue__Group__2__Impl ;
    public final void rule__EnumerationValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2120:1: ( rule__EnumerationValue__Group__2__Impl )
            // InternalKPIFormulaDSL.g:2121:2: rule__EnumerationValue__Group__2__Impl
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
    // InternalKPIFormulaDSL.g:2127:1: rule__EnumerationValue__Group__2__Impl : ( '}' ) ;
    public final void rule__EnumerationValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2131:1: ( ( '}' ) )
            // InternalKPIFormulaDSL.g:2132:1: ( '}' )
            {
            // InternalKPIFormulaDSL.g:2132:1: ( '}' )
            // InternalKPIFormulaDSL.g:2133:2: '}'
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
    // InternalKPIFormulaDSL.g:2143:1: rule__AggregationValue__Group__0 : rule__AggregationValue__Group__0__Impl rule__AggregationValue__Group__1 ;
    public final void rule__AggregationValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2147:1: ( rule__AggregationValue__Group__0__Impl rule__AggregationValue__Group__1 )
            // InternalKPIFormulaDSL.g:2148:2: rule__AggregationValue__Group__0__Impl rule__AggregationValue__Group__1
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
    // InternalKPIFormulaDSL.g:2155:1: rule__AggregationValue__Group__0__Impl : ( 'aggregate' ) ;
    public final void rule__AggregationValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2159:1: ( ( 'aggregate' ) )
            // InternalKPIFormulaDSL.g:2160:1: ( 'aggregate' )
            {
            // InternalKPIFormulaDSL.g:2160:1: ( 'aggregate' )
            // InternalKPIFormulaDSL.g:2161:2: 'aggregate'
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
    // InternalKPIFormulaDSL.g:2170:1: rule__AggregationValue__Group__1 : rule__AggregationValue__Group__1__Impl rule__AggregationValue__Group__2 ;
    public final void rule__AggregationValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2174:1: ( rule__AggregationValue__Group__1__Impl rule__AggregationValue__Group__2 )
            // InternalKPIFormulaDSL.g:2175:2: rule__AggregationValue__Group__1__Impl rule__AggregationValue__Group__2
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
    // InternalKPIFormulaDSL.g:2182:1: rule__AggregationValue__Group__1__Impl : ( ( rule__AggregationValue__OperationAssignment_1 ) ) ;
    public final void rule__AggregationValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2186:1: ( ( ( rule__AggregationValue__OperationAssignment_1 ) ) )
            // InternalKPIFormulaDSL.g:2187:1: ( ( rule__AggregationValue__OperationAssignment_1 ) )
            {
            // InternalKPIFormulaDSL.g:2187:1: ( ( rule__AggregationValue__OperationAssignment_1 ) )
            // InternalKPIFormulaDSL.g:2188:2: ( rule__AggregationValue__OperationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregationValueAccess().getOperationAssignment_1()); 
            }
            // InternalKPIFormulaDSL.g:2189:2: ( rule__AggregationValue__OperationAssignment_1 )
            // InternalKPIFormulaDSL.g:2189:3: rule__AggregationValue__OperationAssignment_1
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
    // InternalKPIFormulaDSL.g:2197:1: rule__AggregationValue__Group__2 : rule__AggregationValue__Group__2__Impl rule__AggregationValue__Group__3 ;
    public final void rule__AggregationValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2201:1: ( rule__AggregationValue__Group__2__Impl rule__AggregationValue__Group__3 )
            // InternalKPIFormulaDSL.g:2202:2: rule__AggregationValue__Group__2__Impl rule__AggregationValue__Group__3
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
    // InternalKPIFormulaDSL.g:2209:1: rule__AggregationValue__Group__2__Impl : ( 'for' ) ;
    public final void rule__AggregationValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2213:1: ( ( 'for' ) )
            // InternalKPIFormulaDSL.g:2214:1: ( 'for' )
            {
            // InternalKPIFormulaDSL.g:2214:1: ( 'for' )
            // InternalKPIFormulaDSL.g:2215:2: 'for'
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
    // InternalKPIFormulaDSL.g:2224:1: rule__AggregationValue__Group__3 : rule__AggregationValue__Group__3__Impl rule__AggregationValue__Group__4 ;
    public final void rule__AggregationValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2228:1: ( rule__AggregationValue__Group__3__Impl rule__AggregationValue__Group__4 )
            // InternalKPIFormulaDSL.g:2229:2: rule__AggregationValue__Group__3__Impl rule__AggregationValue__Group__4
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
    // InternalKPIFormulaDSL.g:2236:1: rule__AggregationValue__Group__3__Impl : ( ( rule__AggregationValue__WindowAssignment_3 ) ) ;
    public final void rule__AggregationValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2240:1: ( ( ( rule__AggregationValue__WindowAssignment_3 ) ) )
            // InternalKPIFormulaDSL.g:2241:1: ( ( rule__AggregationValue__WindowAssignment_3 ) )
            {
            // InternalKPIFormulaDSL.g:2241:1: ( ( rule__AggregationValue__WindowAssignment_3 ) )
            // InternalKPIFormulaDSL.g:2242:2: ( rule__AggregationValue__WindowAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregationValueAccess().getWindowAssignment_3()); 
            }
            // InternalKPIFormulaDSL.g:2243:2: ( rule__AggregationValue__WindowAssignment_3 )
            // InternalKPIFormulaDSL.g:2243:3: rule__AggregationValue__WindowAssignment_3
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
    // InternalKPIFormulaDSL.g:2251:1: rule__AggregationValue__Group__4 : rule__AggregationValue__Group__4__Impl ;
    public final void rule__AggregationValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2255:1: ( rule__AggregationValue__Group__4__Impl )
            // InternalKPIFormulaDSL.g:2256:2: rule__AggregationValue__Group__4__Impl
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
    // InternalKPIFormulaDSL.g:2262:1: rule__AggregationValue__Group__4__Impl : ( ( rule__AggregationValue__WindowUnitAssignment_4 ) ) ;
    public final void rule__AggregationValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2266:1: ( ( ( rule__AggregationValue__WindowUnitAssignment_4 ) ) )
            // InternalKPIFormulaDSL.g:2267:1: ( ( rule__AggregationValue__WindowUnitAssignment_4 ) )
            {
            // InternalKPIFormulaDSL.g:2267:1: ( ( rule__AggregationValue__WindowUnitAssignment_4 ) )
            // InternalKPIFormulaDSL.g:2268:2: ( rule__AggregationValue__WindowUnitAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregationValueAccess().getWindowUnitAssignment_4()); 
            }
            // InternalKPIFormulaDSL.g:2269:2: ( rule__AggregationValue__WindowUnitAssignment_4 )
            // InternalKPIFormulaDSL.g:2269:3: rule__AggregationValue__WindowUnitAssignment_4
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
    // InternalKPIFormulaDSL.g:2278:1: rule__DriftValue__Group__0 : rule__DriftValue__Group__0__Impl rule__DriftValue__Group__1 ;
    public final void rule__DriftValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2282:1: ( rule__DriftValue__Group__0__Impl rule__DriftValue__Group__1 )
            // InternalKPIFormulaDSL.g:2283:2: rule__DriftValue__Group__0__Impl rule__DriftValue__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalKPIFormulaDSL.g:2290:1: rule__DriftValue__Group__0__Impl : ( 'drift' ) ;
    public final void rule__DriftValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2294:1: ( ( 'drift' ) )
            // InternalKPIFormulaDSL.g:2295:1: ( 'drift' )
            {
            // InternalKPIFormulaDSL.g:2295:1: ( 'drift' )
            // InternalKPIFormulaDSL.g:2296:2: 'drift'
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
    // InternalKPIFormulaDSL.g:2305:1: rule__DriftValue__Group__1 : rule__DriftValue__Group__1__Impl rule__DriftValue__Group__2 ;
    public final void rule__DriftValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2309:1: ( rule__DriftValue__Group__1__Impl rule__DriftValue__Group__2 )
            // InternalKPIFormulaDSL.g:2310:2: rule__DriftValue__Group__1__Impl rule__DriftValue__Group__2
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
    // InternalKPIFormulaDSL.g:2317:1: rule__DriftValue__Group__1__Impl : ( 'of' ) ;
    public final void rule__DriftValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2321:1: ( ( 'of' ) )
            // InternalKPIFormulaDSL.g:2322:1: ( 'of' )
            {
            // InternalKPIFormulaDSL.g:2322:1: ( 'of' )
            // InternalKPIFormulaDSL.g:2323:2: 'of'
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
    // InternalKPIFormulaDSL.g:2332:1: rule__DriftValue__Group__2 : rule__DriftValue__Group__2__Impl rule__DriftValue__Group__3 ;
    public final void rule__DriftValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2336:1: ( rule__DriftValue__Group__2__Impl rule__DriftValue__Group__3 )
            // InternalKPIFormulaDSL.g:2337:2: rule__DriftValue__Group__2__Impl rule__DriftValue__Group__3
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
    // InternalKPIFormulaDSL.g:2344:1: rule__DriftValue__Group__2__Impl : ( ( rule__DriftValue__OperationAssignment_2 ) ) ;
    public final void rule__DriftValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2348:1: ( ( ( rule__DriftValue__OperationAssignment_2 ) ) )
            // InternalKPIFormulaDSL.g:2349:1: ( ( rule__DriftValue__OperationAssignment_2 ) )
            {
            // InternalKPIFormulaDSL.g:2349:1: ( ( rule__DriftValue__OperationAssignment_2 ) )
            // InternalKPIFormulaDSL.g:2350:2: ( rule__DriftValue__OperationAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDriftValueAccess().getOperationAssignment_2()); 
            }
            // InternalKPIFormulaDSL.g:2351:2: ( rule__DriftValue__OperationAssignment_2 )
            // InternalKPIFormulaDSL.g:2351:3: rule__DriftValue__OperationAssignment_2
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
    // InternalKPIFormulaDSL.g:2359:1: rule__DriftValue__Group__3 : rule__DriftValue__Group__3__Impl rule__DriftValue__Group__4 ;
    public final void rule__DriftValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2363:1: ( rule__DriftValue__Group__3__Impl rule__DriftValue__Group__4 )
            // InternalKPIFormulaDSL.g:2364:2: rule__DriftValue__Group__3__Impl rule__DriftValue__Group__4
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
    // InternalKPIFormulaDSL.g:2371:1: rule__DriftValue__Group__3__Impl : ( 'for' ) ;
    public final void rule__DriftValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2375:1: ( ( 'for' ) )
            // InternalKPIFormulaDSL.g:2376:1: ( 'for' )
            {
            // InternalKPIFormulaDSL.g:2376:1: ( 'for' )
            // InternalKPIFormulaDSL.g:2377:2: 'for'
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
    // InternalKPIFormulaDSL.g:2386:1: rule__DriftValue__Group__4 : rule__DriftValue__Group__4__Impl rule__DriftValue__Group__5 ;
    public final void rule__DriftValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2390:1: ( rule__DriftValue__Group__4__Impl rule__DriftValue__Group__5 )
            // InternalKPIFormulaDSL.g:2391:2: rule__DriftValue__Group__4__Impl rule__DriftValue__Group__5
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
    // InternalKPIFormulaDSL.g:2398:1: rule__DriftValue__Group__4__Impl : ( ( rule__DriftValue__WindowAssignment_4 ) ) ;
    public final void rule__DriftValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2402:1: ( ( ( rule__DriftValue__WindowAssignment_4 ) ) )
            // InternalKPIFormulaDSL.g:2403:1: ( ( rule__DriftValue__WindowAssignment_4 ) )
            {
            // InternalKPIFormulaDSL.g:2403:1: ( ( rule__DriftValue__WindowAssignment_4 ) )
            // InternalKPIFormulaDSL.g:2404:2: ( rule__DriftValue__WindowAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDriftValueAccess().getWindowAssignment_4()); 
            }
            // InternalKPIFormulaDSL.g:2405:2: ( rule__DriftValue__WindowAssignment_4 )
            // InternalKPIFormulaDSL.g:2405:3: rule__DriftValue__WindowAssignment_4
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
    // InternalKPIFormulaDSL.g:2413:1: rule__DriftValue__Group__5 : rule__DriftValue__Group__5__Impl ;
    public final void rule__DriftValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2417:1: ( rule__DriftValue__Group__5__Impl )
            // InternalKPIFormulaDSL.g:2418:2: rule__DriftValue__Group__5__Impl
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
    // InternalKPIFormulaDSL.g:2424:1: rule__DriftValue__Group__5__Impl : ( ( rule__DriftValue__WindowUnitAssignment_5 ) ) ;
    public final void rule__DriftValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2428:1: ( ( ( rule__DriftValue__WindowUnitAssignment_5 ) ) )
            // InternalKPIFormulaDSL.g:2429:1: ( ( rule__DriftValue__WindowUnitAssignment_5 ) )
            {
            // InternalKPIFormulaDSL.g:2429:1: ( ( rule__DriftValue__WindowUnitAssignment_5 ) )
            // InternalKPIFormulaDSL.g:2430:2: ( rule__DriftValue__WindowUnitAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDriftValueAccess().getWindowUnitAssignment_5()); 
            }
            // InternalKPIFormulaDSL.g:2431:2: ( rule__DriftValue__WindowUnitAssignment_5 )
            // InternalKPIFormulaDSL.g:2431:3: rule__DriftValue__WindowUnitAssignment_5
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
    // InternalKPIFormulaDSL.g:2440:1: rule__Minimum__Group__0 : rule__Minimum__Group__0__Impl rule__Minimum__Group__1 ;
    public final void rule__Minimum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2444:1: ( rule__Minimum__Group__0__Impl rule__Minimum__Group__1 )
            // InternalKPIFormulaDSL.g:2445:2: rule__Minimum__Group__0__Impl rule__Minimum__Group__1
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
    // InternalKPIFormulaDSL.g:2452:1: rule__Minimum__Group__0__Impl : ( () ) ;
    public final void rule__Minimum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2456:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:2457:1: ( () )
            {
            // InternalKPIFormulaDSL.g:2457:1: ( () )
            // InternalKPIFormulaDSL.g:2458:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinimumAccess().getMinimumAction_0()); 
            }
            // InternalKPIFormulaDSL.g:2459:2: ()
            // InternalKPIFormulaDSL.g:2459:3: 
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
    // InternalKPIFormulaDSL.g:2467:1: rule__Minimum__Group__1 : rule__Minimum__Group__1__Impl ;
    public final void rule__Minimum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2471:1: ( rule__Minimum__Group__1__Impl )
            // InternalKPIFormulaDSL.g:2472:2: rule__Minimum__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:2478:1: rule__Minimum__Group__1__Impl : ( 'Minimum' ) ;
    public final void rule__Minimum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2482:1: ( ( 'Minimum' ) )
            // InternalKPIFormulaDSL.g:2483:1: ( 'Minimum' )
            {
            // InternalKPIFormulaDSL.g:2483:1: ( 'Minimum' )
            // InternalKPIFormulaDSL.g:2484:2: 'Minimum'
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
    // InternalKPIFormulaDSL.g:2494:1: rule__Maximum__Group__0 : rule__Maximum__Group__0__Impl rule__Maximum__Group__1 ;
    public final void rule__Maximum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2498:1: ( rule__Maximum__Group__0__Impl rule__Maximum__Group__1 )
            // InternalKPIFormulaDSL.g:2499:2: rule__Maximum__Group__0__Impl rule__Maximum__Group__1
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
    // InternalKPIFormulaDSL.g:2506:1: rule__Maximum__Group__0__Impl : ( () ) ;
    public final void rule__Maximum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2510:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:2511:1: ( () )
            {
            // InternalKPIFormulaDSL.g:2511:1: ( () )
            // InternalKPIFormulaDSL.g:2512:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaximumAccess().getMaximumAction_0()); 
            }
            // InternalKPIFormulaDSL.g:2513:2: ()
            // InternalKPIFormulaDSL.g:2513:3: 
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
    // InternalKPIFormulaDSL.g:2521:1: rule__Maximum__Group__1 : rule__Maximum__Group__1__Impl ;
    public final void rule__Maximum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2525:1: ( rule__Maximum__Group__1__Impl )
            // InternalKPIFormulaDSL.g:2526:2: rule__Maximum__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:2532:1: rule__Maximum__Group__1__Impl : ( 'Maximum' ) ;
    public final void rule__Maximum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2536:1: ( ( 'Maximum' ) )
            // InternalKPIFormulaDSL.g:2537:1: ( 'Maximum' )
            {
            // InternalKPIFormulaDSL.g:2537:1: ( 'Maximum' )
            // InternalKPIFormulaDSL.g:2538:2: 'Maximum'
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
    // InternalKPIFormulaDSL.g:2548:1: rule__Average__Group__0 : rule__Average__Group__0__Impl rule__Average__Group__1 ;
    public final void rule__Average__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2552:1: ( rule__Average__Group__0__Impl rule__Average__Group__1 )
            // InternalKPIFormulaDSL.g:2553:2: rule__Average__Group__0__Impl rule__Average__Group__1
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
    // InternalKPIFormulaDSL.g:2560:1: rule__Average__Group__0__Impl : ( () ) ;
    public final void rule__Average__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2564:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:2565:1: ( () )
            {
            // InternalKPIFormulaDSL.g:2565:1: ( () )
            // InternalKPIFormulaDSL.g:2566:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAverageAccess().getAverageAction_0()); 
            }
            // InternalKPIFormulaDSL.g:2567:2: ()
            // InternalKPIFormulaDSL.g:2567:3: 
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
    // InternalKPIFormulaDSL.g:2575:1: rule__Average__Group__1 : rule__Average__Group__1__Impl ;
    public final void rule__Average__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2579:1: ( rule__Average__Group__1__Impl )
            // InternalKPIFormulaDSL.g:2580:2: rule__Average__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:2586:1: rule__Average__Group__1__Impl : ( 'Average' ) ;
    public final void rule__Average__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2590:1: ( ( 'Average' ) )
            // InternalKPIFormulaDSL.g:2591:1: ( 'Average' )
            {
            // InternalKPIFormulaDSL.g:2591:1: ( 'Average' )
            // InternalKPIFormulaDSL.g:2592:2: 'Average'
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
    // InternalKPIFormulaDSL.g:2602:1: rule__Median__Group__0 : rule__Median__Group__0__Impl rule__Median__Group__1 ;
    public final void rule__Median__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2606:1: ( rule__Median__Group__0__Impl rule__Median__Group__1 )
            // InternalKPIFormulaDSL.g:2607:2: rule__Median__Group__0__Impl rule__Median__Group__1
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
    // InternalKPIFormulaDSL.g:2614:1: rule__Median__Group__0__Impl : ( () ) ;
    public final void rule__Median__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2618:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:2619:1: ( () )
            {
            // InternalKPIFormulaDSL.g:2619:1: ( () )
            // InternalKPIFormulaDSL.g:2620:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMedianAccess().getMedianAction_0()); 
            }
            // InternalKPIFormulaDSL.g:2621:2: ()
            // InternalKPIFormulaDSL.g:2621:3: 
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
    // InternalKPIFormulaDSL.g:2629:1: rule__Median__Group__1 : rule__Median__Group__1__Impl ;
    public final void rule__Median__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2633:1: ( rule__Median__Group__1__Impl )
            // InternalKPIFormulaDSL.g:2634:2: rule__Median__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:2640:1: rule__Median__Group__1__Impl : ( 'Median' ) ;
    public final void rule__Median__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2644:1: ( ( 'Median' ) )
            // InternalKPIFormulaDSL.g:2645:1: ( 'Median' )
            {
            // InternalKPIFormulaDSL.g:2645:1: ( 'Median' )
            // InternalKPIFormulaDSL.g:2646:2: 'Median'
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
    // InternalKPIFormulaDSL.g:2656:1: rule__StandardDeviation__Group__0 : rule__StandardDeviation__Group__0__Impl rule__StandardDeviation__Group__1 ;
    public final void rule__StandardDeviation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2660:1: ( rule__StandardDeviation__Group__0__Impl rule__StandardDeviation__Group__1 )
            // InternalKPIFormulaDSL.g:2661:2: rule__StandardDeviation__Group__0__Impl rule__StandardDeviation__Group__1
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
    // InternalKPIFormulaDSL.g:2668:1: rule__StandardDeviation__Group__0__Impl : ( () ) ;
    public final void rule__StandardDeviation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2672:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:2673:1: ( () )
            {
            // InternalKPIFormulaDSL.g:2673:1: ( () )
            // InternalKPIFormulaDSL.g:2674:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStandardDeviationAccess().getStandardDeviationAction_0()); 
            }
            // InternalKPIFormulaDSL.g:2675:2: ()
            // InternalKPIFormulaDSL.g:2675:3: 
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
    // InternalKPIFormulaDSL.g:2683:1: rule__StandardDeviation__Group__1 : rule__StandardDeviation__Group__1__Impl rule__StandardDeviation__Group__2 ;
    public final void rule__StandardDeviation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2687:1: ( rule__StandardDeviation__Group__1__Impl rule__StandardDeviation__Group__2 )
            // InternalKPIFormulaDSL.g:2688:2: rule__StandardDeviation__Group__1__Impl rule__StandardDeviation__Group__2
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
    // InternalKPIFormulaDSL.g:2695:1: rule__StandardDeviation__Group__1__Impl : ( 'Standard' ) ;
    public final void rule__StandardDeviation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2699:1: ( ( 'Standard' ) )
            // InternalKPIFormulaDSL.g:2700:1: ( 'Standard' )
            {
            // InternalKPIFormulaDSL.g:2700:1: ( 'Standard' )
            // InternalKPIFormulaDSL.g:2701:2: 'Standard'
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
    // InternalKPIFormulaDSL.g:2710:1: rule__StandardDeviation__Group__2 : rule__StandardDeviation__Group__2__Impl ;
    public final void rule__StandardDeviation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2714:1: ( rule__StandardDeviation__Group__2__Impl )
            // InternalKPIFormulaDSL.g:2715:2: rule__StandardDeviation__Group__2__Impl
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
    // InternalKPIFormulaDSL.g:2721:1: rule__StandardDeviation__Group__2__Impl : ( 'deviation' ) ;
    public final void rule__StandardDeviation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2725:1: ( ( 'deviation' ) )
            // InternalKPIFormulaDSL.g:2726:1: ( 'deviation' )
            {
            // InternalKPIFormulaDSL.g:2726:1: ( 'deviation' )
            // InternalKPIFormulaDSL.g:2727:2: 'deviation'
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
    // InternalKPIFormulaDSL.g:2737:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2741:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalKPIFormulaDSL.g:2742:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalKPIFormulaDSL.g:2749:1: rule__Condition__Group__0__Impl : ( () ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2753:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:2754:1: ( () )
            {
            // InternalKPIFormulaDSL.g:2754:1: ( () )
            // InternalKPIFormulaDSL.g:2755:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getConditionalOpAction_0()); 
            }
            // InternalKPIFormulaDSL.g:2756:2: ()
            // InternalKPIFormulaDSL.g:2756:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getConditionalOpAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalKPIFormulaDSL.g:2764:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2768:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalKPIFormulaDSL.g:2769:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIFormulaDSL.g:2776:1: rule__Condition__Group__1__Impl : ( '{' ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2780:1: ( ( '{' ) )
            // InternalKPIFormulaDSL.g:2781:1: ( '{' )
            {
            // InternalKPIFormulaDSL.g:2781:1: ( '{' )
            // InternalKPIFormulaDSL.g:2782:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_1()); 
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
    // InternalKPIFormulaDSL.g:2791:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2795:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalKPIFormulaDSL.g:2796:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalKPIFormulaDSL.g:2803:1: rule__Condition__Group__2__Impl : ( ( ( rule__Condition__Group_2__0 ) ) ( ( rule__Condition__Group_2__0 )* ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2807:1: ( ( ( ( rule__Condition__Group_2__0 ) ) ( ( rule__Condition__Group_2__0 )* ) ) )
            // InternalKPIFormulaDSL.g:2808:1: ( ( ( rule__Condition__Group_2__0 ) ) ( ( rule__Condition__Group_2__0 )* ) )
            {
            // InternalKPIFormulaDSL.g:2808:1: ( ( ( rule__Condition__Group_2__0 ) ) ( ( rule__Condition__Group_2__0 )* ) )
            // InternalKPIFormulaDSL.g:2809:2: ( ( rule__Condition__Group_2__0 ) ) ( ( rule__Condition__Group_2__0 )* )
            {
            // InternalKPIFormulaDSL.g:2809:2: ( ( rule__Condition__Group_2__0 ) )
            // InternalKPIFormulaDSL.g:2810:3: ( rule__Condition__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup_2()); 
            }
            // InternalKPIFormulaDSL.g:2811:3: ( rule__Condition__Group_2__0 )
            // InternalKPIFormulaDSL.g:2811:4: rule__Condition__Group_2__0
            {
            pushFollow(FOLLOW_27);
            rule__Condition__Group_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getGroup_2()); 
            }

            }

            // InternalKPIFormulaDSL.g:2814:2: ( ( rule__Condition__Group_2__0 )* )
            // InternalKPIFormulaDSL.g:2815:3: ( rule__Condition__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup_2()); 
            }
            // InternalKPIFormulaDSL.g:2816:3: ( rule__Condition__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_FQN)||(LA18_0>=13 && LA18_0<=14)||LA18_0==58||(LA18_0>=61 && LA18_0<=62)||(LA18_0>=65 && LA18_0<=66)||(LA18_0>=68 && LA18_0<=73)||LA18_0==75||(LA18_0>=77 && LA18_0<=79)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:2816:4: rule__Condition__Group_2__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Condition__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__3"
    // InternalKPIFormulaDSL.g:2825:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl rule__Condition__Group__4 ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2829:1: ( rule__Condition__Group__3__Impl rule__Condition__Group__4 )
            // InternalKPIFormulaDSL.g:2830:2: rule__Condition__Group__3__Impl rule__Condition__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalKPIFormulaDSL.g:2837:1: rule__Condition__Group__3__Impl : ( ( 'otherwise' ) ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2841:1: ( ( ( 'otherwise' ) ) )
            // InternalKPIFormulaDSL.g:2842:1: ( ( 'otherwise' ) )
            {
            // InternalKPIFormulaDSL.g:2842:1: ( ( 'otherwise' ) )
            // InternalKPIFormulaDSL.g:2843:2: ( 'otherwise' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getOtherwiseKeyword_3()); 
            }
            // InternalKPIFormulaDSL.g:2844:2: ( 'otherwise' )
            // InternalKPIFormulaDSL.g:2844:3: 'otherwise'
            {
            match(input,46,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getOtherwiseKeyword_3()); 
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
    // InternalKPIFormulaDSL.g:2852:1: rule__Condition__Group__4 : rule__Condition__Group__4__Impl rule__Condition__Group__5 ;
    public final void rule__Condition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2856:1: ( rule__Condition__Group__4__Impl rule__Condition__Group__5 )
            // InternalKPIFormulaDSL.g:2857:2: rule__Condition__Group__4__Impl rule__Condition__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIFormulaDSL.g:2864:1: rule__Condition__Group__4__Impl : ( '->' ) ;
    public final void rule__Condition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2868:1: ( ( '->' ) )
            // InternalKPIFormulaDSL.g:2869:1: ( '->' )
            {
            // InternalKPIFormulaDSL.g:2869:1: ( '->' )
            // InternalKPIFormulaDSL.g:2870:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
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
    // InternalKPIFormulaDSL.g:2879:1: rule__Condition__Group__5 : rule__Condition__Group__5__Impl rule__Condition__Group__6 ;
    public final void rule__Condition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2883:1: ( rule__Condition__Group__5__Impl rule__Condition__Group__6 )
            // InternalKPIFormulaDSL.g:2884:2: rule__Condition__Group__5__Impl rule__Condition__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Condition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__6();

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
    // InternalKPIFormulaDSL.g:2891:1: rule__Condition__Group__5__Impl : ( ( rule__Condition__ResultsAssignment_5 ) ) ;
    public final void rule__Condition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2895:1: ( ( ( rule__Condition__ResultsAssignment_5 ) ) )
            // InternalKPIFormulaDSL.g:2896:1: ( ( rule__Condition__ResultsAssignment_5 ) )
            {
            // InternalKPIFormulaDSL.g:2896:1: ( ( rule__Condition__ResultsAssignment_5 ) )
            // InternalKPIFormulaDSL.g:2897:2: ( rule__Condition__ResultsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getResultsAssignment_5()); 
            }
            // InternalKPIFormulaDSL.g:2898:2: ( rule__Condition__ResultsAssignment_5 )
            // InternalKPIFormulaDSL.g:2898:3: rule__Condition__ResultsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ResultsAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getResultsAssignment_5()); 
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


    // $ANTLR start "rule__Condition__Group__6"
    // InternalKPIFormulaDSL.g:2906:1: rule__Condition__Group__6 : rule__Condition__Group__6__Impl ;
    public final void rule__Condition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2910:1: ( rule__Condition__Group__6__Impl )
            // InternalKPIFormulaDSL.g:2911:2: rule__Condition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__6__Impl();

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
    // $ANTLR end "rule__Condition__Group__6"


    // $ANTLR start "rule__Condition__Group__6__Impl"
    // InternalKPIFormulaDSL.g:2917:1: rule__Condition__Group__6__Impl : ( '}' ) ;
    public final void rule__Condition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2921:1: ( ( '}' ) )
            // InternalKPIFormulaDSL.g:2922:1: ( '}' )
            {
            // InternalKPIFormulaDSL.g:2922:1: ( '}' )
            // InternalKPIFormulaDSL.g:2923:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__Condition__Group__6__Impl"


    // $ANTLR start "rule__Condition__Group_2__0"
    // InternalKPIFormulaDSL.g:2933:1: rule__Condition__Group_2__0 : rule__Condition__Group_2__0__Impl rule__Condition__Group_2__1 ;
    public final void rule__Condition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2937:1: ( rule__Condition__Group_2__0__Impl rule__Condition__Group_2__1 )
            // InternalKPIFormulaDSL.g:2938:2: rule__Condition__Group_2__0__Impl rule__Condition__Group_2__1
            {
            pushFollow(FOLLOW_28);
            rule__Condition__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group_2__1();

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
    // $ANTLR end "rule__Condition__Group_2__0"


    // $ANTLR start "rule__Condition__Group_2__0__Impl"
    // InternalKPIFormulaDSL.g:2945:1: rule__Condition__Group_2__0__Impl : ( ( rule__Condition__ConditionsAssignment_2_0 ) ) ;
    public final void rule__Condition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2949:1: ( ( ( rule__Condition__ConditionsAssignment_2_0 ) ) )
            // InternalKPIFormulaDSL.g:2950:1: ( ( rule__Condition__ConditionsAssignment_2_0 ) )
            {
            // InternalKPIFormulaDSL.g:2950:1: ( ( rule__Condition__ConditionsAssignment_2_0 ) )
            // InternalKPIFormulaDSL.g:2951:2: ( rule__Condition__ConditionsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getConditionsAssignment_2_0()); 
            }
            // InternalKPIFormulaDSL.g:2952:2: ( rule__Condition__ConditionsAssignment_2_0 )
            // InternalKPIFormulaDSL.g:2952:3: rule__Condition__ConditionsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ConditionsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getConditionsAssignment_2_0()); 
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
    // $ANTLR end "rule__Condition__Group_2__0__Impl"


    // $ANTLR start "rule__Condition__Group_2__1"
    // InternalKPIFormulaDSL.g:2960:1: rule__Condition__Group_2__1 : rule__Condition__Group_2__1__Impl rule__Condition__Group_2__2 ;
    public final void rule__Condition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2964:1: ( rule__Condition__Group_2__1__Impl rule__Condition__Group_2__2 )
            // InternalKPIFormulaDSL.g:2965:2: rule__Condition__Group_2__1__Impl rule__Condition__Group_2__2
            {
            pushFollow(FOLLOW_5);
            rule__Condition__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group_2__2();

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
    // $ANTLR end "rule__Condition__Group_2__1"


    // $ANTLR start "rule__Condition__Group_2__1__Impl"
    // InternalKPIFormulaDSL.g:2972:1: rule__Condition__Group_2__1__Impl : ( '->' ) ;
    public final void rule__Condition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2976:1: ( ( '->' ) )
            // InternalKPIFormulaDSL.g:2977:1: ( '->' )
            {
            // InternalKPIFormulaDSL.g:2977:1: ( '->' )
            // InternalKPIFormulaDSL.g:2978:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getHyphenMinusGreaterThanSignKeyword_2_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getHyphenMinusGreaterThanSignKeyword_2_1()); 
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
    // $ANTLR end "rule__Condition__Group_2__1__Impl"


    // $ANTLR start "rule__Condition__Group_2__2"
    // InternalKPIFormulaDSL.g:2987:1: rule__Condition__Group_2__2 : rule__Condition__Group_2__2__Impl rule__Condition__Group_2__3 ;
    public final void rule__Condition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2991:1: ( rule__Condition__Group_2__2__Impl rule__Condition__Group_2__3 )
            // InternalKPIFormulaDSL.g:2992:2: rule__Condition__Group_2__2__Impl rule__Condition__Group_2__3
            {
            pushFollow(FOLLOW_29);
            rule__Condition__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group_2__3();

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
    // $ANTLR end "rule__Condition__Group_2__2"


    // $ANTLR start "rule__Condition__Group_2__2__Impl"
    // InternalKPIFormulaDSL.g:2999:1: rule__Condition__Group_2__2__Impl : ( ( rule__Condition__ResultsAssignment_2_2 ) ) ;
    public final void rule__Condition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3003:1: ( ( ( rule__Condition__ResultsAssignment_2_2 ) ) )
            // InternalKPIFormulaDSL.g:3004:1: ( ( rule__Condition__ResultsAssignment_2_2 ) )
            {
            // InternalKPIFormulaDSL.g:3004:1: ( ( rule__Condition__ResultsAssignment_2_2 ) )
            // InternalKPIFormulaDSL.g:3005:2: ( rule__Condition__ResultsAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getResultsAssignment_2_2()); 
            }
            // InternalKPIFormulaDSL.g:3006:2: ( rule__Condition__ResultsAssignment_2_2 )
            // InternalKPIFormulaDSL.g:3006:3: rule__Condition__ResultsAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ResultsAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getResultsAssignment_2_2()); 
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
    // $ANTLR end "rule__Condition__Group_2__2__Impl"


    // $ANTLR start "rule__Condition__Group_2__3"
    // InternalKPIFormulaDSL.g:3014:1: rule__Condition__Group_2__3 : rule__Condition__Group_2__3__Impl ;
    public final void rule__Condition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3018:1: ( rule__Condition__Group_2__3__Impl )
            // InternalKPIFormulaDSL.g:3019:2: rule__Condition__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_2__3__Impl();

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
    // $ANTLR end "rule__Condition__Group_2__3"


    // $ANTLR start "rule__Condition__Group_2__3__Impl"
    // InternalKPIFormulaDSL.g:3025:1: rule__Condition__Group_2__3__Impl : ( ';' ) ;
    public final void rule__Condition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3029:1: ( ( ';' ) )
            // InternalKPIFormulaDSL.g:3030:1: ( ';' )
            {
            // InternalKPIFormulaDSL.g:3030:1: ( ';' )
            // InternalKPIFormulaDSL.g:3031:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getSemicolonKeyword_2_3()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getSemicolonKeyword_2_3()); 
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
    // $ANTLR end "rule__Condition__Group_2__3__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalKPIFormulaDSL.g:3041:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3045:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalKPIFormulaDSL.g:3046:2: rule__Or__Group__0__Impl rule__Or__Group__1
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
    // InternalKPIFormulaDSL.g:3053:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3057:1: ( ( ruleAnd ) )
            // InternalKPIFormulaDSL.g:3058:1: ( ruleAnd )
            {
            // InternalKPIFormulaDSL.g:3058:1: ( ruleAnd )
            // InternalKPIFormulaDSL.g:3059:2: ruleAnd
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
    // InternalKPIFormulaDSL.g:3068:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3072:1: ( rule__Or__Group__1__Impl )
            // InternalKPIFormulaDSL.g:3073:2: rule__Or__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:3079:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3083:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalKPIFormulaDSL.g:3084:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalKPIFormulaDSL.g:3084:1: ( ( rule__Or__Group_1__0 )* )
            // InternalKPIFormulaDSL.g:3085:2: ( rule__Or__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1()); 
            }
            // InternalKPIFormulaDSL.g:3086:2: ( rule__Or__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==49) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:3086:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Or__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalKPIFormulaDSL.g:3095:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3099:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalKPIFormulaDSL.g:3100:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
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
    // InternalKPIFormulaDSL.g:3107:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3111:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3112:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3112:1: ( () )
            // InternalKPIFormulaDSL.g:3113:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            }
            // InternalKPIFormulaDSL.g:3114:2: ()
            // InternalKPIFormulaDSL.g:3114:3: 
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
    // InternalKPIFormulaDSL.g:3122:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3126:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalKPIFormulaDSL.g:3127:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIFormulaDSL.g:3134:1: rule__Or__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3138:1: ( ( 'or' ) )
            // InternalKPIFormulaDSL.g:3139:1: ( 'or' )
            {
            // InternalKPIFormulaDSL.g:3139:1: ( 'or' )
            // InternalKPIFormulaDSL.g:3140:2: 'or'
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
    // InternalKPIFormulaDSL.g:3149:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3153:1: ( rule__Or__Group_1__2__Impl )
            // InternalKPIFormulaDSL.g:3154:2: rule__Or__Group_1__2__Impl
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
    // InternalKPIFormulaDSL.g:3160:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3164:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalKPIFormulaDSL.g:3165:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalKPIFormulaDSL.g:3165:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalKPIFormulaDSL.g:3166:2: ( rule__Or__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            }
            // InternalKPIFormulaDSL.g:3167:2: ( rule__Or__RightAssignment_1_2 )
            // InternalKPIFormulaDSL.g:3167:3: rule__Or__RightAssignment_1_2
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
    // InternalKPIFormulaDSL.g:3176:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3180:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalKPIFormulaDSL.g:3181:2: rule__And__Group__0__Impl rule__And__Group__1
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
    // InternalKPIFormulaDSL.g:3188:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3192:1: ( ( ruleEquality ) )
            // InternalKPIFormulaDSL.g:3193:1: ( ruleEquality )
            {
            // InternalKPIFormulaDSL.g:3193:1: ( ruleEquality )
            // InternalKPIFormulaDSL.g:3194:2: ruleEquality
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
    // InternalKPIFormulaDSL.g:3203:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3207:1: ( rule__And__Group__1__Impl )
            // InternalKPIFormulaDSL.g:3208:2: rule__And__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:3214:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3218:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalKPIFormulaDSL.g:3219:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalKPIFormulaDSL.g:3219:1: ( ( rule__And__Group_1__0 )* )
            // InternalKPIFormulaDSL.g:3220:2: ( rule__And__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1()); 
            }
            // InternalKPIFormulaDSL.g:3221:2: ( rule__And__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==50) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:3221:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__And__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalKPIFormulaDSL.g:3230:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3234:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalKPIFormulaDSL.g:3235:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
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
    // InternalKPIFormulaDSL.g:3242:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3246:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3247:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3247:1: ( () )
            // InternalKPIFormulaDSL.g:3248:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            }
            // InternalKPIFormulaDSL.g:3249:2: ()
            // InternalKPIFormulaDSL.g:3249:3: 
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
    // InternalKPIFormulaDSL.g:3257:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3261:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalKPIFormulaDSL.g:3262:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIFormulaDSL.g:3269:1: rule__And__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3273:1: ( ( 'and' ) )
            // InternalKPIFormulaDSL.g:3274:1: ( 'and' )
            {
            // InternalKPIFormulaDSL.g:3274:1: ( 'and' )
            // InternalKPIFormulaDSL.g:3275:2: 'and'
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
    // InternalKPIFormulaDSL.g:3284:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3288:1: ( rule__And__Group_1__2__Impl )
            // InternalKPIFormulaDSL.g:3289:2: rule__And__Group_1__2__Impl
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
    // InternalKPIFormulaDSL.g:3295:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3299:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalKPIFormulaDSL.g:3300:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalKPIFormulaDSL.g:3300:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalKPIFormulaDSL.g:3301:2: ( rule__And__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            }
            // InternalKPIFormulaDSL.g:3302:2: ( rule__And__RightAssignment_1_2 )
            // InternalKPIFormulaDSL.g:3302:3: rule__And__RightAssignment_1_2
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
    // InternalKPIFormulaDSL.g:3311:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3315:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalKPIFormulaDSL.g:3316:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
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
    // InternalKPIFormulaDSL.g:3323:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3327:1: ( ( ruleComparison ) )
            // InternalKPIFormulaDSL.g:3328:1: ( ruleComparison )
            {
            // InternalKPIFormulaDSL.g:3328:1: ( ruleComparison )
            // InternalKPIFormulaDSL.g:3329:2: ruleComparison
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
    // InternalKPIFormulaDSL.g:3338:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3342:1: ( rule__Equality__Group__1__Impl )
            // InternalKPIFormulaDSL.g:3343:2: rule__Equality__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:3349:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3353:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalKPIFormulaDSL.g:3354:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalKPIFormulaDSL.g:3354:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalKPIFormulaDSL.g:3355:2: ( rule__Equality__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup_1()); 
            }
            // InternalKPIFormulaDSL.g:3356:2: ( rule__Equality__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=51 && LA21_0<=52)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:3356:3: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalKPIFormulaDSL.g:3365:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3369:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalKPIFormulaDSL.g:3370:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIFormulaDSL.g:3377:1: rule__Equality__Group_1__0__Impl : ( ( rule__Equality__Alternatives_1_0 ) ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3381:1: ( ( ( rule__Equality__Alternatives_1_0 ) ) )
            // InternalKPIFormulaDSL.g:3382:1: ( ( rule__Equality__Alternatives_1_0 ) )
            {
            // InternalKPIFormulaDSL.g:3382:1: ( ( rule__Equality__Alternatives_1_0 ) )
            // InternalKPIFormulaDSL.g:3383:2: ( rule__Equality__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getAlternatives_1_0()); 
            }
            // InternalKPIFormulaDSL.g:3384:2: ( rule__Equality__Alternatives_1_0 )
            // InternalKPIFormulaDSL.g:3384:3: rule__Equality__Alternatives_1_0
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
    // InternalKPIFormulaDSL.g:3392:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3396:1: ( rule__Equality__Group_1__1__Impl )
            // InternalKPIFormulaDSL.g:3397:2: rule__Equality__Group_1__1__Impl
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
    // InternalKPIFormulaDSL.g:3403:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__RightAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3407:1: ( ( ( rule__Equality__RightAssignment_1_1 ) ) )
            // InternalKPIFormulaDSL.g:3408:1: ( ( rule__Equality__RightAssignment_1_1 ) )
            {
            // InternalKPIFormulaDSL.g:3408:1: ( ( rule__Equality__RightAssignment_1_1 ) )
            // InternalKPIFormulaDSL.g:3409:2: ( rule__Equality__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getRightAssignment_1_1()); 
            }
            // InternalKPIFormulaDSL.g:3410:2: ( rule__Equality__RightAssignment_1_1 )
            // InternalKPIFormulaDSL.g:3410:3: rule__Equality__RightAssignment_1_1
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
    // InternalKPIFormulaDSL.g:3419:1: rule__Equality__Group_1_0_0__0 : rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1 ;
    public final void rule__Equality__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3423:1: ( rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1 )
            // InternalKPIFormulaDSL.g:3424:2: rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1
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
    // InternalKPIFormulaDSL.g:3431:1: rule__Equality__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3435:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3436:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3436:1: ( () )
            // InternalKPIFormulaDSL.g:3437:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0_0_0()); 
            }
            // InternalKPIFormulaDSL.g:3438:2: ()
            // InternalKPIFormulaDSL.g:3438:3: 
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
    // InternalKPIFormulaDSL.g:3446:1: rule__Equality__Group_1_0_0__1 : rule__Equality__Group_1_0_0__1__Impl ;
    public final void rule__Equality__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3450:1: ( rule__Equality__Group_1_0_0__1__Impl )
            // InternalKPIFormulaDSL.g:3451:2: rule__Equality__Group_1_0_0__1__Impl
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
    // InternalKPIFormulaDSL.g:3457:1: rule__Equality__Group_1_0_0__1__Impl : ( '==' ) ;
    public final void rule__Equality__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3461:1: ( ( '==' ) )
            // InternalKPIFormulaDSL.g:3462:1: ( '==' )
            {
            // InternalKPIFormulaDSL.g:3462:1: ( '==' )
            // InternalKPIFormulaDSL.g:3463:2: '=='
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
    // InternalKPIFormulaDSL.g:3473:1: rule__Equality__Group_1_0_1__0 : rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1 ;
    public final void rule__Equality__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3477:1: ( rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1 )
            // InternalKPIFormulaDSL.g:3478:2: rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1
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
    // InternalKPIFormulaDSL.g:3485:1: rule__Equality__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3489:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3490:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3490:1: ( () )
            // InternalKPIFormulaDSL.g:3491:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getInequalityLeftAction_1_0_1_0()); 
            }
            // InternalKPIFormulaDSL.g:3492:2: ()
            // InternalKPIFormulaDSL.g:3492:3: 
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
    // InternalKPIFormulaDSL.g:3500:1: rule__Equality__Group_1_0_1__1 : rule__Equality__Group_1_0_1__1__Impl ;
    public final void rule__Equality__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3504:1: ( rule__Equality__Group_1_0_1__1__Impl )
            // InternalKPIFormulaDSL.g:3505:2: rule__Equality__Group_1_0_1__1__Impl
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
    // InternalKPIFormulaDSL.g:3511:1: rule__Equality__Group_1_0_1__1__Impl : ( '!=' ) ;
    public final void rule__Equality__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3515:1: ( ( '!=' ) )
            // InternalKPIFormulaDSL.g:3516:1: ( '!=' )
            {
            // InternalKPIFormulaDSL.g:3516:1: ( '!=' )
            // InternalKPIFormulaDSL.g:3517:2: '!='
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
    // InternalKPIFormulaDSL.g:3527:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3531:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalKPIFormulaDSL.g:3532:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
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
    // InternalKPIFormulaDSL.g:3539:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3543:1: ( ( rulePlusOrMinus ) )
            // InternalKPIFormulaDSL.g:3544:1: ( rulePlusOrMinus )
            {
            // InternalKPIFormulaDSL.g:3544:1: ( rulePlusOrMinus )
            // InternalKPIFormulaDSL.g:3545:2: rulePlusOrMinus
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
    // InternalKPIFormulaDSL.g:3554:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3558:1: ( rule__Comparison__Group__1__Impl )
            // InternalKPIFormulaDSL.g:3559:2: rule__Comparison__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:3565:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3569:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalKPIFormulaDSL.g:3570:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalKPIFormulaDSL.g:3570:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalKPIFormulaDSL.g:3571:2: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // InternalKPIFormulaDSL.g:3572:2: ( rule__Comparison__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=53 && LA22_0<=56)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:3572:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalKPIFormulaDSL.g:3581:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3585:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalKPIFormulaDSL.g:3586:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIFormulaDSL.g:3593:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Alternatives_1_0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3597:1: ( ( ( rule__Comparison__Alternatives_1_0 ) ) )
            // InternalKPIFormulaDSL.g:3598:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            {
            // InternalKPIFormulaDSL.g:3598:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            // InternalKPIFormulaDSL.g:3599:2: ( rule__Comparison__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            }
            // InternalKPIFormulaDSL.g:3600:2: ( rule__Comparison__Alternatives_1_0 )
            // InternalKPIFormulaDSL.g:3600:3: rule__Comparison__Alternatives_1_0
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
    // InternalKPIFormulaDSL.g:3608:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3612:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalKPIFormulaDSL.g:3613:2: rule__Comparison__Group_1__1__Impl
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
    // InternalKPIFormulaDSL.g:3619:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3623:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // InternalKPIFormulaDSL.g:3624:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // InternalKPIFormulaDSL.g:3624:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // InternalKPIFormulaDSL.g:3625:2: ( rule__Comparison__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            }
            // InternalKPIFormulaDSL.g:3626:2: ( rule__Comparison__RightAssignment_1_1 )
            // InternalKPIFormulaDSL.g:3626:3: rule__Comparison__RightAssignment_1_1
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
    // InternalKPIFormulaDSL.g:3635:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3639:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalKPIFormulaDSL.g:3640:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
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
    // InternalKPIFormulaDSL.g:3647:1: rule__Comparison__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3651:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3652:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3652:1: ( () )
            // InternalKPIFormulaDSL.g:3653:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGreaterEqLeftAction_1_0_0_0()); 
            }
            // InternalKPIFormulaDSL.g:3654:2: ()
            // InternalKPIFormulaDSL.g:3654:3: 
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
    // InternalKPIFormulaDSL.g:3662:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3666:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalKPIFormulaDSL.g:3667:2: rule__Comparison__Group_1_0_0__1__Impl
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
    // InternalKPIFormulaDSL.g:3673:1: rule__Comparison__Group_1_0_0__1__Impl : ( '>=' ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3677:1: ( ( '>=' ) )
            // InternalKPIFormulaDSL.g:3678:1: ( '>=' )
            {
            // InternalKPIFormulaDSL.g:3678:1: ( '>=' )
            // InternalKPIFormulaDSL.g:3679:2: '>='
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
    // InternalKPIFormulaDSL.g:3689:1: rule__Comparison__Group_1_0_1__0 : rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 ;
    public final void rule__Comparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3693:1: ( rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 )
            // InternalKPIFormulaDSL.g:3694:2: rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1
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
    // InternalKPIFormulaDSL.g:3701:1: rule__Comparison__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3705:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3706:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3706:1: ( () )
            // InternalKPIFormulaDSL.g:3707:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessEqLeftAction_1_0_1_0()); 
            }
            // InternalKPIFormulaDSL.g:3708:2: ()
            // InternalKPIFormulaDSL.g:3708:3: 
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
    // InternalKPIFormulaDSL.g:3716:1: rule__Comparison__Group_1_0_1__1 : rule__Comparison__Group_1_0_1__1__Impl ;
    public final void rule__Comparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3720:1: ( rule__Comparison__Group_1_0_1__1__Impl )
            // InternalKPIFormulaDSL.g:3721:2: rule__Comparison__Group_1_0_1__1__Impl
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
    // InternalKPIFormulaDSL.g:3727:1: rule__Comparison__Group_1_0_1__1__Impl : ( '<=' ) ;
    public final void rule__Comparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3731:1: ( ( '<=' ) )
            // InternalKPIFormulaDSL.g:3732:1: ( '<=' )
            {
            // InternalKPIFormulaDSL.g:3732:1: ( '<=' )
            // InternalKPIFormulaDSL.g:3733:2: '<='
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
    // InternalKPIFormulaDSL.g:3743:1: rule__Comparison__Group_1_0_2__0 : rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 ;
    public final void rule__Comparison__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3747:1: ( rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 )
            // InternalKPIFormulaDSL.g:3748:2: rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1
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
    // InternalKPIFormulaDSL.g:3755:1: rule__Comparison__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3759:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3760:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3760:1: ( () )
            // InternalKPIFormulaDSL.g:3761:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGreaterLeftAction_1_0_2_0()); 
            }
            // InternalKPIFormulaDSL.g:3762:2: ()
            // InternalKPIFormulaDSL.g:3762:3: 
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
    // InternalKPIFormulaDSL.g:3770:1: rule__Comparison__Group_1_0_2__1 : rule__Comparison__Group_1_0_2__1__Impl ;
    public final void rule__Comparison__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3774:1: ( rule__Comparison__Group_1_0_2__1__Impl )
            // InternalKPIFormulaDSL.g:3775:2: rule__Comparison__Group_1_0_2__1__Impl
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
    // InternalKPIFormulaDSL.g:3781:1: rule__Comparison__Group_1_0_2__1__Impl : ( '>' ) ;
    public final void rule__Comparison__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3785:1: ( ( '>' ) )
            // InternalKPIFormulaDSL.g:3786:1: ( '>' )
            {
            // InternalKPIFormulaDSL.g:3786:1: ( '>' )
            // InternalKPIFormulaDSL.g:3787:2: '>'
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
    // InternalKPIFormulaDSL.g:3797:1: rule__Comparison__Group_1_0_3__0 : rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1 ;
    public final void rule__Comparison__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3801:1: ( rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1 )
            // InternalKPIFormulaDSL.g:3802:2: rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1
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
    // InternalKPIFormulaDSL.g:3809:1: rule__Comparison__Group_1_0_3__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3813:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3814:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3814:1: ( () )
            // InternalKPIFormulaDSL.g:3815:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessLeftAction_1_0_3_0()); 
            }
            // InternalKPIFormulaDSL.g:3816:2: ()
            // InternalKPIFormulaDSL.g:3816:3: 
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
    // InternalKPIFormulaDSL.g:3824:1: rule__Comparison__Group_1_0_3__1 : rule__Comparison__Group_1_0_3__1__Impl ;
    public final void rule__Comparison__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3828:1: ( rule__Comparison__Group_1_0_3__1__Impl )
            // InternalKPIFormulaDSL.g:3829:2: rule__Comparison__Group_1_0_3__1__Impl
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
    // InternalKPIFormulaDSL.g:3835:1: rule__Comparison__Group_1_0_3__1__Impl : ( '<' ) ;
    public final void rule__Comparison__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3839:1: ( ( '<' ) )
            // InternalKPIFormulaDSL.g:3840:1: ( '<' )
            {
            // InternalKPIFormulaDSL.g:3840:1: ( '<' )
            // InternalKPIFormulaDSL.g:3841:2: '<'
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
    // InternalKPIFormulaDSL.g:3851:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3855:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalKPIFormulaDSL.g:3856:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
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
    // InternalKPIFormulaDSL.g:3863:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3867:1: ( ( ruleMulOrDiv ) )
            // InternalKPIFormulaDSL.g:3868:1: ( ruleMulOrDiv )
            {
            // InternalKPIFormulaDSL.g:3868:1: ( ruleMulOrDiv )
            // InternalKPIFormulaDSL.g:3869:2: ruleMulOrDiv
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
    // InternalKPIFormulaDSL.g:3878:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3882:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalKPIFormulaDSL.g:3883:2: rule__PlusOrMinus__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:3889:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3893:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalKPIFormulaDSL.g:3894:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalKPIFormulaDSL.g:3894:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalKPIFormulaDSL.g:3895:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            }
            // InternalKPIFormulaDSL.g:3896:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=57 && LA23_0<=58)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:3896:3: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalKPIFormulaDSL.g:3905:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3909:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalKPIFormulaDSL.g:3910:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIFormulaDSL.g:3917:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3921:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalKPIFormulaDSL.g:3922:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalKPIFormulaDSL.g:3922:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalKPIFormulaDSL.g:3923:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            }
            // InternalKPIFormulaDSL.g:3924:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalKPIFormulaDSL.g:3924:3: rule__PlusOrMinus__Alternatives_1_0
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
    // InternalKPIFormulaDSL.g:3932:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3936:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalKPIFormulaDSL.g:3937:2: rule__PlusOrMinus__Group_1__1__Impl
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
    // InternalKPIFormulaDSL.g:3943:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3947:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalKPIFormulaDSL.g:3948:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalKPIFormulaDSL.g:3948:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalKPIFormulaDSL.g:3949:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            }
            // InternalKPIFormulaDSL.g:3950:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalKPIFormulaDSL.g:3950:3: rule__PlusOrMinus__RightAssignment_1_1
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
    // InternalKPIFormulaDSL.g:3959:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3963:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalKPIFormulaDSL.g:3964:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
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
    // InternalKPIFormulaDSL.g:3971:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3975:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3976:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3976:1: ( () )
            // InternalKPIFormulaDSL.g:3977:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            }
            // InternalKPIFormulaDSL.g:3978:2: ()
            // InternalKPIFormulaDSL.g:3978:3: 
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
    // InternalKPIFormulaDSL.g:3986:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3990:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalKPIFormulaDSL.g:3991:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
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
    // InternalKPIFormulaDSL.g:3997:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4001:1: ( ( '+' ) )
            // InternalKPIFormulaDSL.g:4002:1: ( '+' )
            {
            // InternalKPIFormulaDSL.g:4002:1: ( '+' )
            // InternalKPIFormulaDSL.g:4003:2: '+'
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
    // InternalKPIFormulaDSL.g:4013:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4017:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalKPIFormulaDSL.g:4018:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
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
    // InternalKPIFormulaDSL.g:4025:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4029:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4030:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4030:1: ( () )
            // InternalKPIFormulaDSL.g:4031:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            }
            // InternalKPIFormulaDSL.g:4032:2: ()
            // InternalKPIFormulaDSL.g:4032:3: 
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
    // InternalKPIFormulaDSL.g:4040:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4044:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalKPIFormulaDSL.g:4045:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
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
    // InternalKPIFormulaDSL.g:4051:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4055:1: ( ( '-' ) )
            // InternalKPIFormulaDSL.g:4056:1: ( '-' )
            {
            // InternalKPIFormulaDSL.g:4056:1: ( '-' )
            // InternalKPIFormulaDSL.g:4057:2: '-'
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
    // InternalKPIFormulaDSL.g:4067:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4071:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalKPIFormulaDSL.g:4072:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
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
    // InternalKPIFormulaDSL.g:4079:1: rule__MulOrDiv__Group__0__Impl : ( ruleOperator ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4083:1: ( ( ruleOperator ) )
            // InternalKPIFormulaDSL.g:4084:1: ( ruleOperator )
            {
            // InternalKPIFormulaDSL.g:4084:1: ( ruleOperator )
            // InternalKPIFormulaDSL.g:4085:2: ruleOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getOperatorParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getOperatorParserRuleCall_0()); 
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
    // InternalKPIFormulaDSL.g:4094:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4098:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalKPIFormulaDSL.g:4099:2: rule__MulOrDiv__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:4105:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4109:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalKPIFormulaDSL.g:4110:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalKPIFormulaDSL.g:4110:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalKPIFormulaDSL.g:4111:2: ( rule__MulOrDiv__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            }
            // InternalKPIFormulaDSL.g:4112:2: ( rule__MulOrDiv__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=59 && LA24_0<=60)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:4112:3: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalKPIFormulaDSL.g:4121:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4125:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalKPIFormulaDSL.g:4126:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIFormulaDSL.g:4133:1: rule__MulOrDiv__Group_1__0__Impl : ( ( rule__MulOrDiv__Alternatives_1_0 ) ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4137:1: ( ( ( rule__MulOrDiv__Alternatives_1_0 ) ) )
            // InternalKPIFormulaDSL.g:4138:1: ( ( rule__MulOrDiv__Alternatives_1_0 ) )
            {
            // InternalKPIFormulaDSL.g:4138:1: ( ( rule__MulOrDiv__Alternatives_1_0 ) )
            // InternalKPIFormulaDSL.g:4139:2: ( rule__MulOrDiv__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getAlternatives_1_0()); 
            }
            // InternalKPIFormulaDSL.g:4140:2: ( rule__MulOrDiv__Alternatives_1_0 )
            // InternalKPIFormulaDSL.g:4140:3: rule__MulOrDiv__Alternatives_1_0
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
    // InternalKPIFormulaDSL.g:4148:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4152:1: ( rule__MulOrDiv__Group_1__1__Impl )
            // InternalKPIFormulaDSL.g:4153:2: rule__MulOrDiv__Group_1__1__Impl
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
    // InternalKPIFormulaDSL.g:4159:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4163:1: ( ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) )
            // InternalKPIFormulaDSL.g:4164:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            {
            // InternalKPIFormulaDSL.g:4164:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            // InternalKPIFormulaDSL.g:4165:2: ( rule__MulOrDiv__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); 
            }
            // InternalKPIFormulaDSL.g:4166:2: ( rule__MulOrDiv__RightAssignment_1_1 )
            // InternalKPIFormulaDSL.g:4166:3: rule__MulOrDiv__RightAssignment_1_1
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
    // InternalKPIFormulaDSL.g:4175:1: rule__MulOrDiv__Group_1_0_0__0 : rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1 ;
    public final void rule__MulOrDiv__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4179:1: ( rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1 )
            // InternalKPIFormulaDSL.g:4180:2: rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1
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
    // InternalKPIFormulaDSL.g:4187:1: rule__MulOrDiv__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4191:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4192:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4192:1: ( () )
            // InternalKPIFormulaDSL.g:4193:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getMultiplyLeftAction_1_0_0_0()); 
            }
            // InternalKPIFormulaDSL.g:4194:2: ()
            // InternalKPIFormulaDSL.g:4194:3: 
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
    // InternalKPIFormulaDSL.g:4202:1: rule__MulOrDiv__Group_1_0_0__1 : rule__MulOrDiv__Group_1_0_0__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4206:1: ( rule__MulOrDiv__Group_1_0_0__1__Impl )
            // InternalKPIFormulaDSL.g:4207:2: rule__MulOrDiv__Group_1_0_0__1__Impl
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
    // InternalKPIFormulaDSL.g:4213:1: rule__MulOrDiv__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MulOrDiv__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4217:1: ( ( '*' ) )
            // InternalKPIFormulaDSL.g:4218:1: ( '*' )
            {
            // InternalKPIFormulaDSL.g:4218:1: ( '*' )
            // InternalKPIFormulaDSL.g:4219:2: '*'
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
    // InternalKPIFormulaDSL.g:4229:1: rule__MulOrDiv__Group_1_0_1__0 : rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1 ;
    public final void rule__MulOrDiv__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4233:1: ( rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1 )
            // InternalKPIFormulaDSL.g:4234:2: rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1
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
    // InternalKPIFormulaDSL.g:4241:1: rule__MulOrDiv__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4245:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4246:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4246:1: ( () )
            // InternalKPIFormulaDSL.g:4247:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getDivideLeftAction_1_0_1_0()); 
            }
            // InternalKPIFormulaDSL.g:4248:2: ()
            // InternalKPIFormulaDSL.g:4248:3: 
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
    // InternalKPIFormulaDSL.g:4256:1: rule__MulOrDiv__Group_1_0_1__1 : rule__MulOrDiv__Group_1_0_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4260:1: ( rule__MulOrDiv__Group_1_0_1__1__Impl )
            // InternalKPIFormulaDSL.g:4261:2: rule__MulOrDiv__Group_1_0_1__1__Impl
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
    // InternalKPIFormulaDSL.g:4267:1: rule__MulOrDiv__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MulOrDiv__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4271:1: ( ( '/' ) )
            // InternalKPIFormulaDSL.g:4272:1: ( '/' )
            {
            // InternalKPIFormulaDSL.g:4272:1: ( '/' )
            // InternalKPIFormulaDSL.g:4273:2: '/'
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


    // $ANTLR start "rule__Operator__Group_0__0"
    // InternalKPIFormulaDSL.g:4283:1: rule__Operator__Group_0__0 : rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1 ;
    public final void rule__Operator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4287:1: ( rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1 )
            // InternalKPIFormulaDSL.g:4288:2: rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1
            {
            pushFollow(FOLLOW_48);
            rule__Operator__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_0__1();

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
    // $ANTLR end "rule__Operator__Group_0__0"


    // $ANTLR start "rule__Operator__Group_0__0__Impl"
    // InternalKPIFormulaDSL.g:4295:1: rule__Operator__Group_0__0__Impl : ( () ) ;
    public final void rule__Operator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4299:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4300:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4300:1: ( () )
            // InternalKPIFormulaDSL.g:4301:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListSizeAction_0_0()); 
            }
            // InternalKPIFormulaDSL.g:4302:2: ()
            // InternalKPIFormulaDSL.g:4302:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListSizeAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_0__0__Impl"


    // $ANTLR start "rule__Operator__Group_0__1"
    // InternalKPIFormulaDSL.g:4310:1: rule__Operator__Group_0__1 : rule__Operator__Group_0__1__Impl rule__Operator__Group_0__2 ;
    public final void rule__Operator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4314:1: ( rule__Operator__Group_0__1__Impl rule__Operator__Group_0__2 )
            // InternalKPIFormulaDSL.g:4315:2: rule__Operator__Group_0__1__Impl rule__Operator__Group_0__2
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_0__2();

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
    // $ANTLR end "rule__Operator__Group_0__1"


    // $ANTLR start "rule__Operator__Group_0__1__Impl"
    // InternalKPIFormulaDSL.g:4322:1: rule__Operator__Group_0__1__Impl : ( '|' ) ;
    public final void rule__Operator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4326:1: ( ( '|' ) )
            // InternalKPIFormulaDSL.g:4327:1: ( '|' )
            {
            // InternalKPIFormulaDSL.g:4327:1: ( '|' )
            // InternalKPIFormulaDSL.g:4328:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getVerticalLineKeyword_0_1()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getVerticalLineKeyword_0_1()); 
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
    // $ANTLR end "rule__Operator__Group_0__1__Impl"


    // $ANTLR start "rule__Operator__Group_0__2"
    // InternalKPIFormulaDSL.g:4337:1: rule__Operator__Group_0__2 : rule__Operator__Group_0__2__Impl rule__Operator__Group_0__3 ;
    public final void rule__Operator__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4341:1: ( rule__Operator__Group_0__2__Impl rule__Operator__Group_0__3 )
            // InternalKPIFormulaDSL.g:4342:2: rule__Operator__Group_0__2__Impl rule__Operator__Group_0__3
            {
            pushFollow(FOLLOW_48);
            rule__Operator__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_0__3();

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
    // $ANTLR end "rule__Operator__Group_0__2"


    // $ANTLR start "rule__Operator__Group_0__2__Impl"
    // InternalKPIFormulaDSL.g:4349:1: rule__Operator__Group_0__2__Impl : ( ( rule__Operator__ExpressionAssignment_0_2 ) ) ;
    public final void rule__Operator__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4353:1: ( ( ( rule__Operator__ExpressionAssignment_0_2 ) ) )
            // InternalKPIFormulaDSL.g:4354:1: ( ( rule__Operator__ExpressionAssignment_0_2 ) )
            {
            // InternalKPIFormulaDSL.g:4354:1: ( ( rule__Operator__ExpressionAssignment_0_2 ) )
            // InternalKPIFormulaDSL.g:4355:2: ( rule__Operator__ExpressionAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getExpressionAssignment_0_2()); 
            }
            // InternalKPIFormulaDSL.g:4356:2: ( rule__Operator__ExpressionAssignment_0_2 )
            // InternalKPIFormulaDSL.g:4356:3: rule__Operator__ExpressionAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ExpressionAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getExpressionAssignment_0_2()); 
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
    // $ANTLR end "rule__Operator__Group_0__2__Impl"


    // $ANTLR start "rule__Operator__Group_0__3"
    // InternalKPIFormulaDSL.g:4364:1: rule__Operator__Group_0__3 : rule__Operator__Group_0__3__Impl ;
    public final void rule__Operator__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4368:1: ( rule__Operator__Group_0__3__Impl )
            // InternalKPIFormulaDSL.g:4369:2: rule__Operator__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_0__3__Impl();

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
    // $ANTLR end "rule__Operator__Group_0__3"


    // $ANTLR start "rule__Operator__Group_0__3__Impl"
    // InternalKPIFormulaDSL.g:4375:1: rule__Operator__Group_0__3__Impl : ( '|' ) ;
    public final void rule__Operator__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4379:1: ( ( '|' ) )
            // InternalKPIFormulaDSL.g:4380:1: ( '|' )
            {
            // InternalKPIFormulaDSL.g:4380:1: ( '|' )
            // InternalKPIFormulaDSL.g:4381:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getVerticalLineKeyword_0_3()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getVerticalLineKeyword_0_3()); 
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
    // $ANTLR end "rule__Operator__Group_0__3__Impl"


    // $ANTLR start "rule__Operator__Group_1__0"
    // InternalKPIFormulaDSL.g:4391:1: rule__Operator__Group_1__0 : rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1 ;
    public final void rule__Operator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4395:1: ( rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1 )
            // InternalKPIFormulaDSL.g:4396:2: rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1
            {
            pushFollow(FOLLOW_49);
            rule__Operator__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_1__1();

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
    // $ANTLR end "rule__Operator__Group_1__0"


    // $ANTLR start "rule__Operator__Group_1__0__Impl"
    // InternalKPIFormulaDSL.g:4403:1: rule__Operator__Group_1__0__Impl : ( () ) ;
    public final void rule__Operator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4407:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4408:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4408:1: ( () )
            // InternalKPIFormulaDSL.g:4409:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListLiteralAction_1_0()); 
            }
            // InternalKPIFormulaDSL.g:4410:2: ()
            // InternalKPIFormulaDSL.g:4410:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListLiteralAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_1__0__Impl"


    // $ANTLR start "rule__Operator__Group_1__1"
    // InternalKPIFormulaDSL.g:4418:1: rule__Operator__Group_1__1 : rule__Operator__Group_1__1__Impl rule__Operator__Group_1__2 ;
    public final void rule__Operator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4422:1: ( rule__Operator__Group_1__1__Impl rule__Operator__Group_1__2 )
            // InternalKPIFormulaDSL.g:4423:2: rule__Operator__Group_1__1__Impl rule__Operator__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_1__2();

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
    // $ANTLR end "rule__Operator__Group_1__1"


    // $ANTLR start "rule__Operator__Group_1__1__Impl"
    // InternalKPIFormulaDSL.g:4430:1: rule__Operator__Group_1__1__Impl : ( '[' ) ;
    public final void rule__Operator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4434:1: ( ( '[' ) )
            // InternalKPIFormulaDSL.g:4435:1: ( '[' )
            {
            // InternalKPIFormulaDSL.g:4435:1: ( '[' )
            // InternalKPIFormulaDSL.g:4436:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getLeftSquareBracketKeyword_1_1()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getLeftSquareBracketKeyword_1_1()); 
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
    // $ANTLR end "rule__Operator__Group_1__1__Impl"


    // $ANTLR start "rule__Operator__Group_1__2"
    // InternalKPIFormulaDSL.g:4445:1: rule__Operator__Group_1__2 : rule__Operator__Group_1__2__Impl rule__Operator__Group_1__3 ;
    public final void rule__Operator__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4449:1: ( rule__Operator__Group_1__2__Impl rule__Operator__Group_1__3 )
            // InternalKPIFormulaDSL.g:4450:2: rule__Operator__Group_1__2__Impl rule__Operator__Group_1__3
            {
            pushFollow(FOLLOW_50);
            rule__Operator__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_1__3();

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
    // $ANTLR end "rule__Operator__Group_1__2"


    // $ANTLR start "rule__Operator__Group_1__2__Impl"
    // InternalKPIFormulaDSL.g:4457:1: rule__Operator__Group_1__2__Impl : ( ( rule__Operator__ElementsAssignment_1_2 ) ) ;
    public final void rule__Operator__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4461:1: ( ( ( rule__Operator__ElementsAssignment_1_2 ) ) )
            // InternalKPIFormulaDSL.g:4462:1: ( ( rule__Operator__ElementsAssignment_1_2 ) )
            {
            // InternalKPIFormulaDSL.g:4462:1: ( ( rule__Operator__ElementsAssignment_1_2 ) )
            // InternalKPIFormulaDSL.g:4463:2: ( rule__Operator__ElementsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getElementsAssignment_1_2()); 
            }
            // InternalKPIFormulaDSL.g:4464:2: ( rule__Operator__ElementsAssignment_1_2 )
            // InternalKPIFormulaDSL.g:4464:3: rule__Operator__ElementsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ElementsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getElementsAssignment_1_2()); 
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
    // $ANTLR end "rule__Operator__Group_1__2__Impl"


    // $ANTLR start "rule__Operator__Group_1__3"
    // InternalKPIFormulaDSL.g:4472:1: rule__Operator__Group_1__3 : rule__Operator__Group_1__3__Impl rule__Operator__Group_1__4 ;
    public final void rule__Operator__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4476:1: ( rule__Operator__Group_1__3__Impl rule__Operator__Group_1__4 )
            // InternalKPIFormulaDSL.g:4477:2: rule__Operator__Group_1__3__Impl rule__Operator__Group_1__4
            {
            pushFollow(FOLLOW_50);
            rule__Operator__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_1__4();

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
    // $ANTLR end "rule__Operator__Group_1__3"


    // $ANTLR start "rule__Operator__Group_1__3__Impl"
    // InternalKPIFormulaDSL.g:4484:1: rule__Operator__Group_1__3__Impl : ( ( rule__Operator__Group_1_3__0 )* ) ;
    public final void rule__Operator__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4488:1: ( ( ( rule__Operator__Group_1_3__0 )* ) )
            // InternalKPIFormulaDSL.g:4489:1: ( ( rule__Operator__Group_1_3__0 )* )
            {
            // InternalKPIFormulaDSL.g:4489:1: ( ( rule__Operator__Group_1_3__0 )* )
            // InternalKPIFormulaDSL.g:4490:2: ( rule__Operator__Group_1_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getGroup_1_3()); 
            }
            // InternalKPIFormulaDSL.g:4491:2: ( rule__Operator__Group_1_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==64) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:4491:3: rule__Operator__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__Operator__Group_1_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getGroup_1_3()); 
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
    // $ANTLR end "rule__Operator__Group_1__3__Impl"


    // $ANTLR start "rule__Operator__Group_1__4"
    // InternalKPIFormulaDSL.g:4499:1: rule__Operator__Group_1__4 : rule__Operator__Group_1__4__Impl ;
    public final void rule__Operator__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4503:1: ( rule__Operator__Group_1__4__Impl )
            // InternalKPIFormulaDSL.g:4504:2: rule__Operator__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_1__4__Impl();

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
    // $ANTLR end "rule__Operator__Group_1__4"


    // $ANTLR start "rule__Operator__Group_1__4__Impl"
    // InternalKPIFormulaDSL.g:4510:1: rule__Operator__Group_1__4__Impl : ( ']' ) ;
    public final void rule__Operator__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4514:1: ( ( ']' ) )
            // InternalKPIFormulaDSL.g:4515:1: ( ']' )
            {
            // InternalKPIFormulaDSL.g:4515:1: ( ']' )
            // InternalKPIFormulaDSL.g:4516:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getRightSquareBracketKeyword_1_4()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getRightSquareBracketKeyword_1_4()); 
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
    // $ANTLR end "rule__Operator__Group_1__4__Impl"


    // $ANTLR start "rule__Operator__Group_1_3__0"
    // InternalKPIFormulaDSL.g:4526:1: rule__Operator__Group_1_3__0 : rule__Operator__Group_1_3__0__Impl rule__Operator__Group_1_3__1 ;
    public final void rule__Operator__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4530:1: ( rule__Operator__Group_1_3__0__Impl rule__Operator__Group_1_3__1 )
            // InternalKPIFormulaDSL.g:4531:2: rule__Operator__Group_1_3__0__Impl rule__Operator__Group_1_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_1_3__1();

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
    // $ANTLR end "rule__Operator__Group_1_3__0"


    // $ANTLR start "rule__Operator__Group_1_3__0__Impl"
    // InternalKPIFormulaDSL.g:4538:1: rule__Operator__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__Operator__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4542:1: ( ( ',' ) )
            // InternalKPIFormulaDSL.g:4543:1: ( ',' )
            {
            // InternalKPIFormulaDSL.g:4543:1: ( ',' )
            // InternalKPIFormulaDSL.g:4544:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getCommaKeyword_1_3_0()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getCommaKeyword_1_3_0()); 
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
    // $ANTLR end "rule__Operator__Group_1_3__0__Impl"


    // $ANTLR start "rule__Operator__Group_1_3__1"
    // InternalKPIFormulaDSL.g:4553:1: rule__Operator__Group_1_3__1 : rule__Operator__Group_1_3__1__Impl ;
    public final void rule__Operator__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4557:1: ( rule__Operator__Group_1_3__1__Impl )
            // InternalKPIFormulaDSL.g:4558:2: rule__Operator__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_1_3__1__Impl();

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
    // $ANTLR end "rule__Operator__Group_1_3__1"


    // $ANTLR start "rule__Operator__Group_1_3__1__Impl"
    // InternalKPIFormulaDSL.g:4564:1: rule__Operator__Group_1_3__1__Impl : ( ( rule__Operator__ElementsAssignment_1_3_1 ) ) ;
    public final void rule__Operator__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4568:1: ( ( ( rule__Operator__ElementsAssignment_1_3_1 ) ) )
            // InternalKPIFormulaDSL.g:4569:1: ( ( rule__Operator__ElementsAssignment_1_3_1 ) )
            {
            // InternalKPIFormulaDSL.g:4569:1: ( ( rule__Operator__ElementsAssignment_1_3_1 ) )
            // InternalKPIFormulaDSL.g:4570:2: ( rule__Operator__ElementsAssignment_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getElementsAssignment_1_3_1()); 
            }
            // InternalKPIFormulaDSL.g:4571:2: ( rule__Operator__ElementsAssignment_1_3_1 )
            // InternalKPIFormulaDSL.g:4571:3: rule__Operator__ElementsAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ElementsAssignment_1_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getElementsAssignment_1_3_1()); 
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
    // $ANTLR end "rule__Operator__Group_1_3__1__Impl"


    // $ANTLR start "rule__Operator__Group_2__0"
    // InternalKPIFormulaDSL.g:4580:1: rule__Operator__Group_2__0 : rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 ;
    public final void rule__Operator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4584:1: ( rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 )
            // InternalKPIFormulaDSL.g:4585:2: rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1
            {
            pushFollow(FOLLOW_52);
            rule__Operator__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_2__1();

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
    // $ANTLR end "rule__Operator__Group_2__0"


    // $ANTLR start "rule__Operator__Group_2__0__Impl"
    // InternalKPIFormulaDSL.g:4592:1: rule__Operator__Group_2__0__Impl : ( () ) ;
    public final void rule__Operator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4596:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4597:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4597:1: ( () )
            // InternalKPIFormulaDSL.g:4598:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getAvgOpAction_2_0()); 
            }
            // InternalKPIFormulaDSL.g:4599:2: ()
            // InternalKPIFormulaDSL.g:4599:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getAvgOpAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_2__0__Impl"


    // $ANTLR start "rule__Operator__Group_2__1"
    // InternalKPIFormulaDSL.g:4607:1: rule__Operator__Group_2__1 : rule__Operator__Group_2__1__Impl rule__Operator__Group_2__2 ;
    public final void rule__Operator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4611:1: ( rule__Operator__Group_2__1__Impl rule__Operator__Group_2__2 )
            // InternalKPIFormulaDSL.g:4612:2: rule__Operator__Group_2__1__Impl rule__Operator__Group_2__2
            {
            pushFollow(FOLLOW_53);
            rule__Operator__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_2__2();

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
    // $ANTLR end "rule__Operator__Group_2__1"


    // $ANTLR start "rule__Operator__Group_2__1__Impl"
    // InternalKPIFormulaDSL.g:4619:1: rule__Operator__Group_2__1__Impl : ( 'AVERAGE' ) ;
    public final void rule__Operator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4623:1: ( ( 'AVERAGE' ) )
            // InternalKPIFormulaDSL.g:4624:1: ( 'AVERAGE' )
            {
            // InternalKPIFormulaDSL.g:4624:1: ( 'AVERAGE' )
            // InternalKPIFormulaDSL.g:4625:2: 'AVERAGE'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getAVERAGEKeyword_2_1()); 
            }
            match(input,65,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getAVERAGEKeyword_2_1()); 
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
    // $ANTLR end "rule__Operator__Group_2__1__Impl"


    // $ANTLR start "rule__Operator__Group_2__2"
    // InternalKPIFormulaDSL.g:4634:1: rule__Operator__Group_2__2 : rule__Operator__Group_2__2__Impl rule__Operator__Group_2__3 ;
    public final void rule__Operator__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4638:1: ( rule__Operator__Group_2__2__Impl rule__Operator__Group_2__3 )
            // InternalKPIFormulaDSL.g:4639:2: rule__Operator__Group_2__2__Impl rule__Operator__Group_2__3
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_2__3();

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
    // $ANTLR end "rule__Operator__Group_2__2"


    // $ANTLR start "rule__Operator__Group_2__2__Impl"
    // InternalKPIFormulaDSL.g:4646:1: rule__Operator__Group_2__2__Impl : ( '(' ) ;
    public final void rule__Operator__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4650:1: ( ( '(' ) )
            // InternalKPIFormulaDSL.g:4651:1: ( '(' )
            {
            // InternalKPIFormulaDSL.g:4651:1: ( '(' )
            // InternalKPIFormulaDSL.g:4652:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_2_2()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_2_2()); 
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
    // $ANTLR end "rule__Operator__Group_2__2__Impl"


    // $ANTLR start "rule__Operator__Group_2__3"
    // InternalKPIFormulaDSL.g:4661:1: rule__Operator__Group_2__3 : rule__Operator__Group_2__3__Impl rule__Operator__Group_2__4 ;
    public final void rule__Operator__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4665:1: ( rule__Operator__Group_2__3__Impl rule__Operator__Group_2__4 )
            // InternalKPIFormulaDSL.g:4666:2: rule__Operator__Group_2__3__Impl rule__Operator__Group_2__4
            {
            pushFollow(FOLLOW_54);
            rule__Operator__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_2__4();

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
    // $ANTLR end "rule__Operator__Group_2__3"


    // $ANTLR start "rule__Operator__Group_2__3__Impl"
    // InternalKPIFormulaDSL.g:4673:1: rule__Operator__Group_2__3__Impl : ( ( rule__Operator__ListAssignment_2_3 ) ) ;
    public final void rule__Operator__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4677:1: ( ( ( rule__Operator__ListAssignment_2_3 ) ) )
            // InternalKPIFormulaDSL.g:4678:1: ( ( rule__Operator__ListAssignment_2_3 ) )
            {
            // InternalKPIFormulaDSL.g:4678:1: ( ( rule__Operator__ListAssignment_2_3 ) )
            // InternalKPIFormulaDSL.g:4679:2: ( rule__Operator__ListAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListAssignment_2_3()); 
            }
            // InternalKPIFormulaDSL.g:4680:2: ( rule__Operator__ListAssignment_2_3 )
            // InternalKPIFormulaDSL.g:4680:3: rule__Operator__ListAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ListAssignment_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListAssignment_2_3()); 
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
    // $ANTLR end "rule__Operator__Group_2__3__Impl"


    // $ANTLR start "rule__Operator__Group_2__4"
    // InternalKPIFormulaDSL.g:4688:1: rule__Operator__Group_2__4 : rule__Operator__Group_2__4__Impl ;
    public final void rule__Operator__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4692:1: ( rule__Operator__Group_2__4__Impl )
            // InternalKPIFormulaDSL.g:4693:2: rule__Operator__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_2__4__Impl();

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
    // $ANTLR end "rule__Operator__Group_2__4"


    // $ANTLR start "rule__Operator__Group_2__4__Impl"
    // InternalKPIFormulaDSL.g:4699:1: rule__Operator__Group_2__4__Impl : ( ')' ) ;
    public final void rule__Operator__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4703:1: ( ( ')' ) )
            // InternalKPIFormulaDSL.g:4704:1: ( ')' )
            {
            // InternalKPIFormulaDSL.g:4704:1: ( ')' )
            // InternalKPIFormulaDSL.g:4705:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_2_4()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_2_4()); 
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
    // $ANTLR end "rule__Operator__Group_2__4__Impl"


    // $ANTLR start "rule__Operator__Group_3__0"
    // InternalKPIFormulaDSL.g:4715:1: rule__Operator__Group_3__0 : rule__Operator__Group_3__0__Impl rule__Operator__Group_3__1 ;
    public final void rule__Operator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4719:1: ( rule__Operator__Group_3__0__Impl rule__Operator__Group_3__1 )
            // InternalKPIFormulaDSL.g:4720:2: rule__Operator__Group_3__0__Impl rule__Operator__Group_3__1
            {
            pushFollow(FOLLOW_55);
            rule__Operator__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_3__1();

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
    // $ANTLR end "rule__Operator__Group_3__0"


    // $ANTLR start "rule__Operator__Group_3__0__Impl"
    // InternalKPIFormulaDSL.g:4727:1: rule__Operator__Group_3__0__Impl : ( () ) ;
    public final void rule__Operator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4731:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4732:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4732:1: ( () )
            // InternalKPIFormulaDSL.g:4733:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getWeightedSumOpAction_3_0()); 
            }
            // InternalKPIFormulaDSL.g:4734:2: ()
            // InternalKPIFormulaDSL.g:4734:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getWeightedSumOpAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_3__0__Impl"


    // $ANTLR start "rule__Operator__Group_3__1"
    // InternalKPIFormulaDSL.g:4742:1: rule__Operator__Group_3__1 : rule__Operator__Group_3__1__Impl rule__Operator__Group_3__2 ;
    public final void rule__Operator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4746:1: ( rule__Operator__Group_3__1__Impl rule__Operator__Group_3__2 )
            // InternalKPIFormulaDSL.g:4747:2: rule__Operator__Group_3__1__Impl rule__Operator__Group_3__2
            {
            pushFollow(FOLLOW_53);
            rule__Operator__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_3__2();

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
    // $ANTLR end "rule__Operator__Group_3__1"


    // $ANTLR start "rule__Operator__Group_3__1__Impl"
    // InternalKPIFormulaDSL.g:4754:1: rule__Operator__Group_3__1__Impl : ( 'WEIGHTED_SUM' ) ;
    public final void rule__Operator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4758:1: ( ( 'WEIGHTED_SUM' ) )
            // InternalKPIFormulaDSL.g:4759:1: ( 'WEIGHTED_SUM' )
            {
            // InternalKPIFormulaDSL.g:4759:1: ( 'WEIGHTED_SUM' )
            // InternalKPIFormulaDSL.g:4760:2: 'WEIGHTED_SUM'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getWEIGHTED_SUMKeyword_3_1()); 
            }
            match(input,68,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getWEIGHTED_SUMKeyword_3_1()); 
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
    // $ANTLR end "rule__Operator__Group_3__1__Impl"


    // $ANTLR start "rule__Operator__Group_3__2"
    // InternalKPIFormulaDSL.g:4769:1: rule__Operator__Group_3__2 : rule__Operator__Group_3__2__Impl rule__Operator__Group_3__3 ;
    public final void rule__Operator__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4773:1: ( rule__Operator__Group_3__2__Impl rule__Operator__Group_3__3 )
            // InternalKPIFormulaDSL.g:4774:2: rule__Operator__Group_3__2__Impl rule__Operator__Group_3__3
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_3__3();

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
    // $ANTLR end "rule__Operator__Group_3__2"


    // $ANTLR start "rule__Operator__Group_3__2__Impl"
    // InternalKPIFormulaDSL.g:4781:1: rule__Operator__Group_3__2__Impl : ( '(' ) ;
    public final void rule__Operator__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4785:1: ( ( '(' ) )
            // InternalKPIFormulaDSL.g:4786:1: ( '(' )
            {
            // InternalKPIFormulaDSL.g:4786:1: ( '(' )
            // InternalKPIFormulaDSL.g:4787:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_3_2()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_3_2()); 
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
    // $ANTLR end "rule__Operator__Group_3__2__Impl"


    // $ANTLR start "rule__Operator__Group_3__3"
    // InternalKPIFormulaDSL.g:4796:1: rule__Operator__Group_3__3 : rule__Operator__Group_3__3__Impl rule__Operator__Group_3__4 ;
    public final void rule__Operator__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4800:1: ( rule__Operator__Group_3__3__Impl rule__Operator__Group_3__4 )
            // InternalKPIFormulaDSL.g:4801:2: rule__Operator__Group_3__3__Impl rule__Operator__Group_3__4
            {
            pushFollow(FOLLOW_56);
            rule__Operator__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_3__4();

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
    // $ANTLR end "rule__Operator__Group_3__3"


    // $ANTLR start "rule__Operator__Group_3__3__Impl"
    // InternalKPIFormulaDSL.g:4808:1: rule__Operator__Group_3__3__Impl : ( ( rule__Operator__ListAssignment_3_3 ) ) ;
    public final void rule__Operator__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4812:1: ( ( ( rule__Operator__ListAssignment_3_3 ) ) )
            // InternalKPIFormulaDSL.g:4813:1: ( ( rule__Operator__ListAssignment_3_3 ) )
            {
            // InternalKPIFormulaDSL.g:4813:1: ( ( rule__Operator__ListAssignment_3_3 ) )
            // InternalKPIFormulaDSL.g:4814:2: ( rule__Operator__ListAssignment_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListAssignment_3_3()); 
            }
            // InternalKPIFormulaDSL.g:4815:2: ( rule__Operator__ListAssignment_3_3 )
            // InternalKPIFormulaDSL.g:4815:3: rule__Operator__ListAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ListAssignment_3_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListAssignment_3_3()); 
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
    // $ANTLR end "rule__Operator__Group_3__3__Impl"


    // $ANTLR start "rule__Operator__Group_3__4"
    // InternalKPIFormulaDSL.g:4823:1: rule__Operator__Group_3__4 : rule__Operator__Group_3__4__Impl rule__Operator__Group_3__5 ;
    public final void rule__Operator__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4827:1: ( rule__Operator__Group_3__4__Impl rule__Operator__Group_3__5 )
            // InternalKPIFormulaDSL.g:4828:2: rule__Operator__Group_3__4__Impl rule__Operator__Group_3__5
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_3__5();

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
    // $ANTLR end "rule__Operator__Group_3__4"


    // $ANTLR start "rule__Operator__Group_3__4__Impl"
    // InternalKPIFormulaDSL.g:4835:1: rule__Operator__Group_3__4__Impl : ( ',' ) ;
    public final void rule__Operator__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4839:1: ( ( ',' ) )
            // InternalKPIFormulaDSL.g:4840:1: ( ',' )
            {
            // InternalKPIFormulaDSL.g:4840:1: ( ',' )
            // InternalKPIFormulaDSL.g:4841:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getCommaKeyword_3_4()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getCommaKeyword_3_4()); 
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
    // $ANTLR end "rule__Operator__Group_3__4__Impl"


    // $ANTLR start "rule__Operator__Group_3__5"
    // InternalKPIFormulaDSL.g:4850:1: rule__Operator__Group_3__5 : rule__Operator__Group_3__5__Impl rule__Operator__Group_3__6 ;
    public final void rule__Operator__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4854:1: ( rule__Operator__Group_3__5__Impl rule__Operator__Group_3__6 )
            // InternalKPIFormulaDSL.g:4855:2: rule__Operator__Group_3__5__Impl rule__Operator__Group_3__6
            {
            pushFollow(FOLLOW_54);
            rule__Operator__Group_3__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_3__6();

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
    // $ANTLR end "rule__Operator__Group_3__5"


    // $ANTLR start "rule__Operator__Group_3__5__Impl"
    // InternalKPIFormulaDSL.g:4862:1: rule__Operator__Group_3__5__Impl : ( ( rule__Operator__WeightsAssignment_3_5 ) ) ;
    public final void rule__Operator__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4866:1: ( ( ( rule__Operator__WeightsAssignment_3_5 ) ) )
            // InternalKPIFormulaDSL.g:4867:1: ( ( rule__Operator__WeightsAssignment_3_5 ) )
            {
            // InternalKPIFormulaDSL.g:4867:1: ( ( rule__Operator__WeightsAssignment_3_5 ) )
            // InternalKPIFormulaDSL.g:4868:2: ( rule__Operator__WeightsAssignment_3_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getWeightsAssignment_3_5()); 
            }
            // InternalKPIFormulaDSL.g:4869:2: ( rule__Operator__WeightsAssignment_3_5 )
            // InternalKPIFormulaDSL.g:4869:3: rule__Operator__WeightsAssignment_3_5
            {
            pushFollow(FOLLOW_2);
            rule__Operator__WeightsAssignment_3_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getWeightsAssignment_3_5()); 
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
    // $ANTLR end "rule__Operator__Group_3__5__Impl"


    // $ANTLR start "rule__Operator__Group_3__6"
    // InternalKPIFormulaDSL.g:4877:1: rule__Operator__Group_3__6 : rule__Operator__Group_3__6__Impl ;
    public final void rule__Operator__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4881:1: ( rule__Operator__Group_3__6__Impl )
            // InternalKPIFormulaDSL.g:4882:2: rule__Operator__Group_3__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_3__6__Impl();

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
    // $ANTLR end "rule__Operator__Group_3__6"


    // $ANTLR start "rule__Operator__Group_3__6__Impl"
    // InternalKPIFormulaDSL.g:4888:1: rule__Operator__Group_3__6__Impl : ( ')' ) ;
    public final void rule__Operator__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4892:1: ( ( ')' ) )
            // InternalKPIFormulaDSL.g:4893:1: ( ')' )
            {
            // InternalKPIFormulaDSL.g:4893:1: ( ')' )
            // InternalKPIFormulaDSL.g:4894:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_3_6()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_3_6()); 
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
    // $ANTLR end "rule__Operator__Group_3__6__Impl"


    // $ANTLR start "rule__Operator__Group_4__0"
    // InternalKPIFormulaDSL.g:4904:1: rule__Operator__Group_4__0 : rule__Operator__Group_4__0__Impl rule__Operator__Group_4__1 ;
    public final void rule__Operator__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4908:1: ( rule__Operator__Group_4__0__Impl rule__Operator__Group_4__1 )
            // InternalKPIFormulaDSL.g:4909:2: rule__Operator__Group_4__0__Impl rule__Operator__Group_4__1
            {
            pushFollow(FOLLOW_57);
            rule__Operator__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_4__1();

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
    // $ANTLR end "rule__Operator__Group_4__0"


    // $ANTLR start "rule__Operator__Group_4__0__Impl"
    // InternalKPIFormulaDSL.g:4916:1: rule__Operator__Group_4__0__Impl : ( () ) ;
    public final void rule__Operator__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4920:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4921:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4921:1: ( () )
            // InternalKPIFormulaDSL.g:4922:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getSumOpAction_4_0()); 
            }
            // InternalKPIFormulaDSL.g:4923:2: ()
            // InternalKPIFormulaDSL.g:4923:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getSumOpAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_4__0__Impl"


    // $ANTLR start "rule__Operator__Group_4__1"
    // InternalKPIFormulaDSL.g:4931:1: rule__Operator__Group_4__1 : rule__Operator__Group_4__1__Impl rule__Operator__Group_4__2 ;
    public final void rule__Operator__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4935:1: ( rule__Operator__Group_4__1__Impl rule__Operator__Group_4__2 )
            // InternalKPIFormulaDSL.g:4936:2: rule__Operator__Group_4__1__Impl rule__Operator__Group_4__2
            {
            pushFollow(FOLLOW_53);
            rule__Operator__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_4__2();

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
    // $ANTLR end "rule__Operator__Group_4__1"


    // $ANTLR start "rule__Operator__Group_4__1__Impl"
    // InternalKPIFormulaDSL.g:4943:1: rule__Operator__Group_4__1__Impl : ( 'SUM' ) ;
    public final void rule__Operator__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4947:1: ( ( 'SUM' ) )
            // InternalKPIFormulaDSL.g:4948:1: ( 'SUM' )
            {
            // InternalKPIFormulaDSL.g:4948:1: ( 'SUM' )
            // InternalKPIFormulaDSL.g:4949:2: 'SUM'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getSUMKeyword_4_1()); 
            }
            match(input,69,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getSUMKeyword_4_1()); 
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
    // $ANTLR end "rule__Operator__Group_4__1__Impl"


    // $ANTLR start "rule__Operator__Group_4__2"
    // InternalKPIFormulaDSL.g:4958:1: rule__Operator__Group_4__2 : rule__Operator__Group_4__2__Impl rule__Operator__Group_4__3 ;
    public final void rule__Operator__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4962:1: ( rule__Operator__Group_4__2__Impl rule__Operator__Group_4__3 )
            // InternalKPIFormulaDSL.g:4963:2: rule__Operator__Group_4__2__Impl rule__Operator__Group_4__3
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_4__3();

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
    // $ANTLR end "rule__Operator__Group_4__2"


    // $ANTLR start "rule__Operator__Group_4__2__Impl"
    // InternalKPIFormulaDSL.g:4970:1: rule__Operator__Group_4__2__Impl : ( '(' ) ;
    public final void rule__Operator__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4974:1: ( ( '(' ) )
            // InternalKPIFormulaDSL.g:4975:1: ( '(' )
            {
            // InternalKPIFormulaDSL.g:4975:1: ( '(' )
            // InternalKPIFormulaDSL.g:4976:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_4_2()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_4_2()); 
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
    // $ANTLR end "rule__Operator__Group_4__2__Impl"


    // $ANTLR start "rule__Operator__Group_4__3"
    // InternalKPIFormulaDSL.g:4985:1: rule__Operator__Group_4__3 : rule__Operator__Group_4__3__Impl rule__Operator__Group_4__4 ;
    public final void rule__Operator__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4989:1: ( rule__Operator__Group_4__3__Impl rule__Operator__Group_4__4 )
            // InternalKPIFormulaDSL.g:4990:2: rule__Operator__Group_4__3__Impl rule__Operator__Group_4__4
            {
            pushFollow(FOLLOW_54);
            rule__Operator__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_4__4();

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
    // $ANTLR end "rule__Operator__Group_4__3"


    // $ANTLR start "rule__Operator__Group_4__3__Impl"
    // InternalKPIFormulaDSL.g:4997:1: rule__Operator__Group_4__3__Impl : ( ( rule__Operator__ListAssignment_4_3 ) ) ;
    public final void rule__Operator__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5001:1: ( ( ( rule__Operator__ListAssignment_4_3 ) ) )
            // InternalKPIFormulaDSL.g:5002:1: ( ( rule__Operator__ListAssignment_4_3 ) )
            {
            // InternalKPIFormulaDSL.g:5002:1: ( ( rule__Operator__ListAssignment_4_3 ) )
            // InternalKPIFormulaDSL.g:5003:2: ( rule__Operator__ListAssignment_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListAssignment_4_3()); 
            }
            // InternalKPIFormulaDSL.g:5004:2: ( rule__Operator__ListAssignment_4_3 )
            // InternalKPIFormulaDSL.g:5004:3: rule__Operator__ListAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ListAssignment_4_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListAssignment_4_3()); 
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
    // $ANTLR end "rule__Operator__Group_4__3__Impl"


    // $ANTLR start "rule__Operator__Group_4__4"
    // InternalKPIFormulaDSL.g:5012:1: rule__Operator__Group_4__4 : rule__Operator__Group_4__4__Impl ;
    public final void rule__Operator__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5016:1: ( rule__Operator__Group_4__4__Impl )
            // InternalKPIFormulaDSL.g:5017:2: rule__Operator__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_4__4__Impl();

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
    // $ANTLR end "rule__Operator__Group_4__4"


    // $ANTLR start "rule__Operator__Group_4__4__Impl"
    // InternalKPIFormulaDSL.g:5023:1: rule__Operator__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Operator__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5027:1: ( ( ')' ) )
            // InternalKPIFormulaDSL.g:5028:1: ( ')' )
            {
            // InternalKPIFormulaDSL.g:5028:1: ( ')' )
            // InternalKPIFormulaDSL.g:5029:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_4_4()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_4_4()); 
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
    // $ANTLR end "rule__Operator__Group_4__4__Impl"


    // $ANTLR start "rule__Operator__Group_5__0"
    // InternalKPIFormulaDSL.g:5039:1: rule__Operator__Group_5__0 : rule__Operator__Group_5__0__Impl rule__Operator__Group_5__1 ;
    public final void rule__Operator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5043:1: ( rule__Operator__Group_5__0__Impl rule__Operator__Group_5__1 )
            // InternalKPIFormulaDSL.g:5044:2: rule__Operator__Group_5__0__Impl rule__Operator__Group_5__1
            {
            pushFollow(FOLLOW_58);
            rule__Operator__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_5__1();

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
    // $ANTLR end "rule__Operator__Group_5__0"


    // $ANTLR start "rule__Operator__Group_5__0__Impl"
    // InternalKPIFormulaDSL.g:5051:1: rule__Operator__Group_5__0__Impl : ( () ) ;
    public final void rule__Operator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5055:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:5056:1: ( () )
            {
            // InternalKPIFormulaDSL.g:5056:1: ( () )
            // InternalKPIFormulaDSL.g:5057:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getMinOpAction_5_0()); 
            }
            // InternalKPIFormulaDSL.g:5058:2: ()
            // InternalKPIFormulaDSL.g:5058:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getMinOpAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_5__0__Impl"


    // $ANTLR start "rule__Operator__Group_5__1"
    // InternalKPIFormulaDSL.g:5066:1: rule__Operator__Group_5__1 : rule__Operator__Group_5__1__Impl rule__Operator__Group_5__2 ;
    public final void rule__Operator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5070:1: ( rule__Operator__Group_5__1__Impl rule__Operator__Group_5__2 )
            // InternalKPIFormulaDSL.g:5071:2: rule__Operator__Group_5__1__Impl rule__Operator__Group_5__2
            {
            pushFollow(FOLLOW_53);
            rule__Operator__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_5__2();

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
    // $ANTLR end "rule__Operator__Group_5__1"


    // $ANTLR start "rule__Operator__Group_5__1__Impl"
    // InternalKPIFormulaDSL.g:5078:1: rule__Operator__Group_5__1__Impl : ( 'MIN' ) ;
    public final void rule__Operator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5082:1: ( ( 'MIN' ) )
            // InternalKPIFormulaDSL.g:5083:1: ( 'MIN' )
            {
            // InternalKPIFormulaDSL.g:5083:1: ( 'MIN' )
            // InternalKPIFormulaDSL.g:5084:2: 'MIN'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getMINKeyword_5_1()); 
            }
            match(input,70,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getMINKeyword_5_1()); 
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
    // $ANTLR end "rule__Operator__Group_5__1__Impl"


    // $ANTLR start "rule__Operator__Group_5__2"
    // InternalKPIFormulaDSL.g:5093:1: rule__Operator__Group_5__2 : rule__Operator__Group_5__2__Impl rule__Operator__Group_5__3 ;
    public final void rule__Operator__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5097:1: ( rule__Operator__Group_5__2__Impl rule__Operator__Group_5__3 )
            // InternalKPIFormulaDSL.g:5098:2: rule__Operator__Group_5__2__Impl rule__Operator__Group_5__3
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_5__3();

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
    // $ANTLR end "rule__Operator__Group_5__2"


    // $ANTLR start "rule__Operator__Group_5__2__Impl"
    // InternalKPIFormulaDSL.g:5105:1: rule__Operator__Group_5__2__Impl : ( '(' ) ;
    public final void rule__Operator__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5109:1: ( ( '(' ) )
            // InternalKPIFormulaDSL.g:5110:1: ( '(' )
            {
            // InternalKPIFormulaDSL.g:5110:1: ( '(' )
            // InternalKPIFormulaDSL.g:5111:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_5_2()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_5_2()); 
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
    // $ANTLR end "rule__Operator__Group_5__2__Impl"


    // $ANTLR start "rule__Operator__Group_5__3"
    // InternalKPIFormulaDSL.g:5120:1: rule__Operator__Group_5__3 : rule__Operator__Group_5__3__Impl rule__Operator__Group_5__4 ;
    public final void rule__Operator__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5124:1: ( rule__Operator__Group_5__3__Impl rule__Operator__Group_5__4 )
            // InternalKPIFormulaDSL.g:5125:2: rule__Operator__Group_5__3__Impl rule__Operator__Group_5__4
            {
            pushFollow(FOLLOW_54);
            rule__Operator__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_5__4();

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
    // $ANTLR end "rule__Operator__Group_5__3"


    // $ANTLR start "rule__Operator__Group_5__3__Impl"
    // InternalKPIFormulaDSL.g:5132:1: rule__Operator__Group_5__3__Impl : ( ( rule__Operator__ListAssignment_5_3 ) ) ;
    public final void rule__Operator__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5136:1: ( ( ( rule__Operator__ListAssignment_5_3 ) ) )
            // InternalKPIFormulaDSL.g:5137:1: ( ( rule__Operator__ListAssignment_5_3 ) )
            {
            // InternalKPIFormulaDSL.g:5137:1: ( ( rule__Operator__ListAssignment_5_3 ) )
            // InternalKPIFormulaDSL.g:5138:2: ( rule__Operator__ListAssignment_5_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListAssignment_5_3()); 
            }
            // InternalKPIFormulaDSL.g:5139:2: ( rule__Operator__ListAssignment_5_3 )
            // InternalKPIFormulaDSL.g:5139:3: rule__Operator__ListAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ListAssignment_5_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListAssignment_5_3()); 
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
    // $ANTLR end "rule__Operator__Group_5__3__Impl"


    // $ANTLR start "rule__Operator__Group_5__4"
    // InternalKPIFormulaDSL.g:5147:1: rule__Operator__Group_5__4 : rule__Operator__Group_5__4__Impl ;
    public final void rule__Operator__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5151:1: ( rule__Operator__Group_5__4__Impl )
            // InternalKPIFormulaDSL.g:5152:2: rule__Operator__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_5__4__Impl();

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
    // $ANTLR end "rule__Operator__Group_5__4"


    // $ANTLR start "rule__Operator__Group_5__4__Impl"
    // InternalKPIFormulaDSL.g:5158:1: rule__Operator__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Operator__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5162:1: ( ( ')' ) )
            // InternalKPIFormulaDSL.g:5163:1: ( ')' )
            {
            // InternalKPIFormulaDSL.g:5163:1: ( ')' )
            // InternalKPIFormulaDSL.g:5164:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_5_4()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_5_4()); 
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
    // $ANTLR end "rule__Operator__Group_5__4__Impl"


    // $ANTLR start "rule__Operator__Group_6__0"
    // InternalKPIFormulaDSL.g:5174:1: rule__Operator__Group_6__0 : rule__Operator__Group_6__0__Impl rule__Operator__Group_6__1 ;
    public final void rule__Operator__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5178:1: ( rule__Operator__Group_6__0__Impl rule__Operator__Group_6__1 )
            // InternalKPIFormulaDSL.g:5179:2: rule__Operator__Group_6__0__Impl rule__Operator__Group_6__1
            {
            pushFollow(FOLLOW_59);
            rule__Operator__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_6__1();

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
    // $ANTLR end "rule__Operator__Group_6__0"


    // $ANTLR start "rule__Operator__Group_6__0__Impl"
    // InternalKPIFormulaDSL.g:5186:1: rule__Operator__Group_6__0__Impl : ( () ) ;
    public final void rule__Operator__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5190:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:5191:1: ( () )
            {
            // InternalKPIFormulaDSL.g:5191:1: ( () )
            // InternalKPIFormulaDSL.g:5192:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getMaxOpAction_6_0()); 
            }
            // InternalKPIFormulaDSL.g:5193:2: ()
            // InternalKPIFormulaDSL.g:5193:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getMaxOpAction_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_6__0__Impl"


    // $ANTLR start "rule__Operator__Group_6__1"
    // InternalKPIFormulaDSL.g:5201:1: rule__Operator__Group_6__1 : rule__Operator__Group_6__1__Impl rule__Operator__Group_6__2 ;
    public final void rule__Operator__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5205:1: ( rule__Operator__Group_6__1__Impl rule__Operator__Group_6__2 )
            // InternalKPIFormulaDSL.g:5206:2: rule__Operator__Group_6__1__Impl rule__Operator__Group_6__2
            {
            pushFollow(FOLLOW_53);
            rule__Operator__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_6__2();

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
    // $ANTLR end "rule__Operator__Group_6__1"


    // $ANTLR start "rule__Operator__Group_6__1__Impl"
    // InternalKPIFormulaDSL.g:5213:1: rule__Operator__Group_6__1__Impl : ( 'MAX' ) ;
    public final void rule__Operator__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5217:1: ( ( 'MAX' ) )
            // InternalKPIFormulaDSL.g:5218:1: ( 'MAX' )
            {
            // InternalKPIFormulaDSL.g:5218:1: ( 'MAX' )
            // InternalKPIFormulaDSL.g:5219:2: 'MAX'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getMAXKeyword_6_1()); 
            }
            match(input,71,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getMAXKeyword_6_1()); 
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
    // $ANTLR end "rule__Operator__Group_6__1__Impl"


    // $ANTLR start "rule__Operator__Group_6__2"
    // InternalKPIFormulaDSL.g:5228:1: rule__Operator__Group_6__2 : rule__Operator__Group_6__2__Impl rule__Operator__Group_6__3 ;
    public final void rule__Operator__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5232:1: ( rule__Operator__Group_6__2__Impl rule__Operator__Group_6__3 )
            // InternalKPIFormulaDSL.g:5233:2: rule__Operator__Group_6__2__Impl rule__Operator__Group_6__3
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_6__3();

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
    // $ANTLR end "rule__Operator__Group_6__2"


    // $ANTLR start "rule__Operator__Group_6__2__Impl"
    // InternalKPIFormulaDSL.g:5240:1: rule__Operator__Group_6__2__Impl : ( '(' ) ;
    public final void rule__Operator__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5244:1: ( ( '(' ) )
            // InternalKPIFormulaDSL.g:5245:1: ( '(' )
            {
            // InternalKPIFormulaDSL.g:5245:1: ( '(' )
            // InternalKPIFormulaDSL.g:5246:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_6_2()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_6_2()); 
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
    // $ANTLR end "rule__Operator__Group_6__2__Impl"


    // $ANTLR start "rule__Operator__Group_6__3"
    // InternalKPIFormulaDSL.g:5255:1: rule__Operator__Group_6__3 : rule__Operator__Group_6__3__Impl rule__Operator__Group_6__4 ;
    public final void rule__Operator__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5259:1: ( rule__Operator__Group_6__3__Impl rule__Operator__Group_6__4 )
            // InternalKPIFormulaDSL.g:5260:2: rule__Operator__Group_6__3__Impl rule__Operator__Group_6__4
            {
            pushFollow(FOLLOW_54);
            rule__Operator__Group_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_6__4();

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
    // $ANTLR end "rule__Operator__Group_6__3"


    // $ANTLR start "rule__Operator__Group_6__3__Impl"
    // InternalKPIFormulaDSL.g:5267:1: rule__Operator__Group_6__3__Impl : ( ( rule__Operator__ListAssignment_6_3 ) ) ;
    public final void rule__Operator__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5271:1: ( ( ( rule__Operator__ListAssignment_6_3 ) ) )
            // InternalKPIFormulaDSL.g:5272:1: ( ( rule__Operator__ListAssignment_6_3 ) )
            {
            // InternalKPIFormulaDSL.g:5272:1: ( ( rule__Operator__ListAssignment_6_3 ) )
            // InternalKPIFormulaDSL.g:5273:2: ( rule__Operator__ListAssignment_6_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListAssignment_6_3()); 
            }
            // InternalKPIFormulaDSL.g:5274:2: ( rule__Operator__ListAssignment_6_3 )
            // InternalKPIFormulaDSL.g:5274:3: rule__Operator__ListAssignment_6_3
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ListAssignment_6_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListAssignment_6_3()); 
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
    // $ANTLR end "rule__Operator__Group_6__3__Impl"


    // $ANTLR start "rule__Operator__Group_6__4"
    // InternalKPIFormulaDSL.g:5282:1: rule__Operator__Group_6__4 : rule__Operator__Group_6__4__Impl ;
    public final void rule__Operator__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5286:1: ( rule__Operator__Group_6__4__Impl )
            // InternalKPIFormulaDSL.g:5287:2: rule__Operator__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_6__4__Impl();

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
    // $ANTLR end "rule__Operator__Group_6__4"


    // $ANTLR start "rule__Operator__Group_6__4__Impl"
    // InternalKPIFormulaDSL.g:5293:1: rule__Operator__Group_6__4__Impl : ( ')' ) ;
    public final void rule__Operator__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5297:1: ( ( ')' ) )
            // InternalKPIFormulaDSL.g:5298:1: ( ')' )
            {
            // InternalKPIFormulaDSL.g:5298:1: ( ')' )
            // InternalKPIFormulaDSL.g:5299:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_6_4()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_6_4()); 
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
    // $ANTLR end "rule__Operator__Group_6__4__Impl"


    // $ANTLR start "rule__Operator__Group_7__0"
    // InternalKPIFormulaDSL.g:5309:1: rule__Operator__Group_7__0 : rule__Operator__Group_7__0__Impl rule__Operator__Group_7__1 ;
    public final void rule__Operator__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5313:1: ( rule__Operator__Group_7__0__Impl rule__Operator__Group_7__1 )
            // InternalKPIFormulaDSL.g:5314:2: rule__Operator__Group_7__0__Impl rule__Operator__Group_7__1
            {
            pushFollow(FOLLOW_60);
            rule__Operator__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_7__1();

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
    // $ANTLR end "rule__Operator__Group_7__0"


    // $ANTLR start "rule__Operator__Group_7__0__Impl"
    // InternalKPIFormulaDSL.g:5321:1: rule__Operator__Group_7__0__Impl : ( () ) ;
    public final void rule__Operator__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5325:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:5326:1: ( () )
            {
            // InternalKPIFormulaDSL.g:5326:1: ( () )
            // InternalKPIFormulaDSL.g:5327:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getThresholdOpAction_7_0()); 
            }
            // InternalKPIFormulaDSL.g:5328:2: ()
            // InternalKPIFormulaDSL.g:5328:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getThresholdOpAction_7_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_7__0__Impl"


    // $ANTLR start "rule__Operator__Group_7__1"
    // InternalKPIFormulaDSL.g:5336:1: rule__Operator__Group_7__1 : rule__Operator__Group_7__1__Impl rule__Operator__Group_7__2 ;
    public final void rule__Operator__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5340:1: ( rule__Operator__Group_7__1__Impl rule__Operator__Group_7__2 )
            // InternalKPIFormulaDSL.g:5341:2: rule__Operator__Group_7__1__Impl rule__Operator__Group_7__2
            {
            pushFollow(FOLLOW_53);
            rule__Operator__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_7__2();

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
    // $ANTLR end "rule__Operator__Group_7__1"


    // $ANTLR start "rule__Operator__Group_7__1__Impl"
    // InternalKPIFormulaDSL.g:5348:1: rule__Operator__Group_7__1__Impl : ( 'THRESHOLD' ) ;
    public final void rule__Operator__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5352:1: ( ( 'THRESHOLD' ) )
            // InternalKPIFormulaDSL.g:5353:1: ( 'THRESHOLD' )
            {
            // InternalKPIFormulaDSL.g:5353:1: ( 'THRESHOLD' )
            // InternalKPIFormulaDSL.g:5354:2: 'THRESHOLD'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getTHRESHOLDKeyword_7_1()); 
            }
            match(input,72,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getTHRESHOLDKeyword_7_1()); 
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
    // $ANTLR end "rule__Operator__Group_7__1__Impl"


    // $ANTLR start "rule__Operator__Group_7__2"
    // InternalKPIFormulaDSL.g:5363:1: rule__Operator__Group_7__2 : rule__Operator__Group_7__2__Impl rule__Operator__Group_7__3 ;
    public final void rule__Operator__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5367:1: ( rule__Operator__Group_7__2__Impl rule__Operator__Group_7__3 )
            // InternalKPIFormulaDSL.g:5368:2: rule__Operator__Group_7__2__Impl rule__Operator__Group_7__3
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_7__3();

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
    // $ANTLR end "rule__Operator__Group_7__2"


    // $ANTLR start "rule__Operator__Group_7__2__Impl"
    // InternalKPIFormulaDSL.g:5375:1: rule__Operator__Group_7__2__Impl : ( '(' ) ;
    public final void rule__Operator__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5379:1: ( ( '(' ) )
            // InternalKPIFormulaDSL.g:5380:1: ( '(' )
            {
            // InternalKPIFormulaDSL.g:5380:1: ( '(' )
            // InternalKPIFormulaDSL.g:5381:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_7_2()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_7_2()); 
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
    // $ANTLR end "rule__Operator__Group_7__2__Impl"


    // $ANTLR start "rule__Operator__Group_7__3"
    // InternalKPIFormulaDSL.g:5390:1: rule__Operator__Group_7__3 : rule__Operator__Group_7__3__Impl rule__Operator__Group_7__4 ;
    public final void rule__Operator__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5394:1: ( rule__Operator__Group_7__3__Impl rule__Operator__Group_7__4 )
            // InternalKPIFormulaDSL.g:5395:2: rule__Operator__Group_7__3__Impl rule__Operator__Group_7__4
            {
            pushFollow(FOLLOW_56);
            rule__Operator__Group_7__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_7__4();

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
    // $ANTLR end "rule__Operator__Group_7__3"


    // $ANTLR start "rule__Operator__Group_7__3__Impl"
    // InternalKPIFormulaDSL.g:5402:1: rule__Operator__Group_7__3__Impl : ( ( rule__Operator__ExpressionAssignment_7_3 ) ) ;
    public final void rule__Operator__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5406:1: ( ( ( rule__Operator__ExpressionAssignment_7_3 ) ) )
            // InternalKPIFormulaDSL.g:5407:1: ( ( rule__Operator__ExpressionAssignment_7_3 ) )
            {
            // InternalKPIFormulaDSL.g:5407:1: ( ( rule__Operator__ExpressionAssignment_7_3 ) )
            // InternalKPIFormulaDSL.g:5408:2: ( rule__Operator__ExpressionAssignment_7_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getExpressionAssignment_7_3()); 
            }
            // InternalKPIFormulaDSL.g:5409:2: ( rule__Operator__ExpressionAssignment_7_3 )
            // InternalKPIFormulaDSL.g:5409:3: rule__Operator__ExpressionAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ExpressionAssignment_7_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getExpressionAssignment_7_3()); 
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
    // $ANTLR end "rule__Operator__Group_7__3__Impl"


    // $ANTLR start "rule__Operator__Group_7__4"
    // InternalKPIFormulaDSL.g:5417:1: rule__Operator__Group_7__4 : rule__Operator__Group_7__4__Impl rule__Operator__Group_7__5 ;
    public final void rule__Operator__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5421:1: ( rule__Operator__Group_7__4__Impl rule__Operator__Group_7__5 )
            // InternalKPIFormulaDSL.g:5422:2: rule__Operator__Group_7__4__Impl rule__Operator__Group_7__5
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_7__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_7__5();

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
    // $ANTLR end "rule__Operator__Group_7__4"


    // $ANTLR start "rule__Operator__Group_7__4__Impl"
    // InternalKPIFormulaDSL.g:5429:1: rule__Operator__Group_7__4__Impl : ( ',' ) ;
    public final void rule__Operator__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5433:1: ( ( ',' ) )
            // InternalKPIFormulaDSL.g:5434:1: ( ',' )
            {
            // InternalKPIFormulaDSL.g:5434:1: ( ',' )
            // InternalKPIFormulaDSL.g:5435:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getCommaKeyword_7_4()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getCommaKeyword_7_4()); 
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
    // $ANTLR end "rule__Operator__Group_7__4__Impl"


    // $ANTLR start "rule__Operator__Group_7__5"
    // InternalKPIFormulaDSL.g:5444:1: rule__Operator__Group_7__5 : rule__Operator__Group_7__5__Impl rule__Operator__Group_7__6 ;
    public final void rule__Operator__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5448:1: ( rule__Operator__Group_7__5__Impl rule__Operator__Group_7__6 )
            // InternalKPIFormulaDSL.g:5449:2: rule__Operator__Group_7__5__Impl rule__Operator__Group_7__6
            {
            pushFollow(FOLLOW_54);
            rule__Operator__Group_7__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_7__6();

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
    // $ANTLR end "rule__Operator__Group_7__5"


    // $ANTLR start "rule__Operator__Group_7__5__Impl"
    // InternalKPIFormulaDSL.g:5456:1: rule__Operator__Group_7__5__Impl : ( ( rule__Operator__ThresholdAssignment_7_5 ) ) ;
    public final void rule__Operator__Group_7__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5460:1: ( ( ( rule__Operator__ThresholdAssignment_7_5 ) ) )
            // InternalKPIFormulaDSL.g:5461:1: ( ( rule__Operator__ThresholdAssignment_7_5 ) )
            {
            // InternalKPIFormulaDSL.g:5461:1: ( ( rule__Operator__ThresholdAssignment_7_5 ) )
            // InternalKPIFormulaDSL.g:5462:2: ( rule__Operator__ThresholdAssignment_7_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getThresholdAssignment_7_5()); 
            }
            // InternalKPIFormulaDSL.g:5463:2: ( rule__Operator__ThresholdAssignment_7_5 )
            // InternalKPIFormulaDSL.g:5463:3: rule__Operator__ThresholdAssignment_7_5
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ThresholdAssignment_7_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getThresholdAssignment_7_5()); 
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
    // $ANTLR end "rule__Operator__Group_7__5__Impl"


    // $ANTLR start "rule__Operator__Group_7__6"
    // InternalKPIFormulaDSL.g:5471:1: rule__Operator__Group_7__6 : rule__Operator__Group_7__6__Impl ;
    public final void rule__Operator__Group_7__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5475:1: ( rule__Operator__Group_7__6__Impl )
            // InternalKPIFormulaDSL.g:5476:2: rule__Operator__Group_7__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_7__6__Impl();

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
    // $ANTLR end "rule__Operator__Group_7__6"


    // $ANTLR start "rule__Operator__Group_7__6__Impl"
    // InternalKPIFormulaDSL.g:5482:1: rule__Operator__Group_7__6__Impl : ( ')' ) ;
    public final void rule__Operator__Group_7__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5486:1: ( ( ')' ) )
            // InternalKPIFormulaDSL.g:5487:1: ( ')' )
            {
            // InternalKPIFormulaDSL.g:5487:1: ( ')' )
            // InternalKPIFormulaDSL.g:5488:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_7_6()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_7_6()); 
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
    // $ANTLR end "rule__Operator__Group_7__6__Impl"


    // $ANTLR start "rule__Operator__Group_8__0"
    // InternalKPIFormulaDSL.g:5498:1: rule__Operator__Group_8__0 : rule__Operator__Group_8__0__Impl rule__Operator__Group_8__1 ;
    public final void rule__Operator__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5502:1: ( rule__Operator__Group_8__0__Impl rule__Operator__Group_8__1 )
            // InternalKPIFormulaDSL.g:5503:2: rule__Operator__Group_8__0__Impl rule__Operator__Group_8__1
            {
            pushFollow(FOLLOW_61);
            rule__Operator__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_8__1();

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
    // $ANTLR end "rule__Operator__Group_8__0"


    // $ANTLR start "rule__Operator__Group_8__0__Impl"
    // InternalKPIFormulaDSL.g:5510:1: rule__Operator__Group_8__0__Impl : ( () ) ;
    public final void rule__Operator__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5514:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:5515:1: ( () )
            {
            // InternalKPIFormulaDSL.g:5515:1: ( () )
            // InternalKPIFormulaDSL.g:5516:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListIterationAction_8_0()); 
            }
            // InternalKPIFormulaDSL.g:5517:2: ()
            // InternalKPIFormulaDSL.g:5517:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListIterationAction_8_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_8__0__Impl"


    // $ANTLR start "rule__Operator__Group_8__1"
    // InternalKPIFormulaDSL.g:5525:1: rule__Operator__Group_8__1 : rule__Operator__Group_8__1__Impl rule__Operator__Group_8__2 ;
    public final void rule__Operator__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5529:1: ( rule__Operator__Group_8__1__Impl rule__Operator__Group_8__2 )
            // InternalKPIFormulaDSL.g:5530:2: rule__Operator__Group_8__1__Impl rule__Operator__Group_8__2
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_8__2();

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
    // $ANTLR end "rule__Operator__Group_8__1"


    // $ANTLR start "rule__Operator__Group_8__1__Impl"
    // InternalKPIFormulaDSL.g:5537:1: rule__Operator__Group_8__1__Impl : ( 'map' ) ;
    public final void rule__Operator__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5541:1: ( ( 'map' ) )
            // InternalKPIFormulaDSL.g:5542:1: ( 'map' )
            {
            // InternalKPIFormulaDSL.g:5542:1: ( 'map' )
            // InternalKPIFormulaDSL.g:5543:2: 'map'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getMapKeyword_8_1()); 
            }
            match(input,73,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getMapKeyword_8_1()); 
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
    // $ANTLR end "rule__Operator__Group_8__1__Impl"


    // $ANTLR start "rule__Operator__Group_8__2"
    // InternalKPIFormulaDSL.g:5552:1: rule__Operator__Group_8__2 : rule__Operator__Group_8__2__Impl rule__Operator__Group_8__3 ;
    public final void rule__Operator__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5556:1: ( rule__Operator__Group_8__2__Impl rule__Operator__Group_8__3 )
            // InternalKPIFormulaDSL.g:5557:2: rule__Operator__Group_8__2__Impl rule__Operator__Group_8__3
            {
            pushFollow(FOLLOW_17);
            rule__Operator__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_8__3();

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
    // $ANTLR end "rule__Operator__Group_8__2"


    // $ANTLR start "rule__Operator__Group_8__2__Impl"
    // InternalKPIFormulaDSL.g:5564:1: rule__Operator__Group_8__2__Impl : ( ( rule__Operator__ExpressionAssignment_8_2 ) ) ;
    public final void rule__Operator__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5568:1: ( ( ( rule__Operator__ExpressionAssignment_8_2 ) ) )
            // InternalKPIFormulaDSL.g:5569:1: ( ( rule__Operator__ExpressionAssignment_8_2 ) )
            {
            // InternalKPIFormulaDSL.g:5569:1: ( ( rule__Operator__ExpressionAssignment_8_2 ) )
            // InternalKPIFormulaDSL.g:5570:2: ( rule__Operator__ExpressionAssignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getExpressionAssignment_8_2()); 
            }
            // InternalKPIFormulaDSL.g:5571:2: ( rule__Operator__ExpressionAssignment_8_2 )
            // InternalKPIFormulaDSL.g:5571:3: rule__Operator__ExpressionAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ExpressionAssignment_8_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getExpressionAssignment_8_2()); 
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
    // $ANTLR end "rule__Operator__Group_8__2__Impl"


    // $ANTLR start "rule__Operator__Group_8__3"
    // InternalKPIFormulaDSL.g:5579:1: rule__Operator__Group_8__3 : rule__Operator__Group_8__3__Impl rule__Operator__Group_8__4 ;
    public final void rule__Operator__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5583:1: ( rule__Operator__Group_8__3__Impl rule__Operator__Group_8__4 )
            // InternalKPIFormulaDSL.g:5584:2: rule__Operator__Group_8__3__Impl rule__Operator__Group_8__4
            {
            pushFollow(FOLLOW_9);
            rule__Operator__Group_8__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_8__4();

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
    // $ANTLR end "rule__Operator__Group_8__3"


    // $ANTLR start "rule__Operator__Group_8__3__Impl"
    // InternalKPIFormulaDSL.g:5591:1: rule__Operator__Group_8__3__Impl : ( 'for' ) ;
    public final void rule__Operator__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5595:1: ( ( 'for' ) )
            // InternalKPIFormulaDSL.g:5596:1: ( 'for' )
            {
            // InternalKPIFormulaDSL.g:5596:1: ( 'for' )
            // InternalKPIFormulaDSL.g:5597:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getForKeyword_8_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getForKeyword_8_3()); 
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
    // $ANTLR end "rule__Operator__Group_8__3__Impl"


    // $ANTLR start "rule__Operator__Group_8__4"
    // InternalKPIFormulaDSL.g:5606:1: rule__Operator__Group_8__4 : rule__Operator__Group_8__4__Impl rule__Operator__Group_8__5 ;
    public final void rule__Operator__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5610:1: ( rule__Operator__Group_8__4__Impl rule__Operator__Group_8__5 )
            // InternalKPIFormulaDSL.g:5611:2: rule__Operator__Group_8__4__Impl rule__Operator__Group_8__5
            {
            pushFollow(FOLLOW_62);
            rule__Operator__Group_8__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_8__5();

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
    // $ANTLR end "rule__Operator__Group_8__4"


    // $ANTLR start "rule__Operator__Group_8__4__Impl"
    // InternalKPIFormulaDSL.g:5618:1: rule__Operator__Group_8__4__Impl : ( ( rule__Operator__IteratorsAssignment_8_4 ) ) ;
    public final void rule__Operator__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5622:1: ( ( ( rule__Operator__IteratorsAssignment_8_4 ) ) )
            // InternalKPIFormulaDSL.g:5623:1: ( ( rule__Operator__IteratorsAssignment_8_4 ) )
            {
            // InternalKPIFormulaDSL.g:5623:1: ( ( rule__Operator__IteratorsAssignment_8_4 ) )
            // InternalKPIFormulaDSL.g:5624:2: ( rule__Operator__IteratorsAssignment_8_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsAssignment_8_4()); 
            }
            // InternalKPIFormulaDSL.g:5625:2: ( rule__Operator__IteratorsAssignment_8_4 )
            // InternalKPIFormulaDSL.g:5625:3: rule__Operator__IteratorsAssignment_8_4
            {
            pushFollow(FOLLOW_2);
            rule__Operator__IteratorsAssignment_8_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsAssignment_8_4()); 
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
    // $ANTLR end "rule__Operator__Group_8__4__Impl"


    // $ANTLR start "rule__Operator__Group_8__5"
    // InternalKPIFormulaDSL.g:5633:1: rule__Operator__Group_8__5 : rule__Operator__Group_8__5__Impl rule__Operator__Group_8__6 ;
    public final void rule__Operator__Group_8__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5637:1: ( rule__Operator__Group_8__5__Impl rule__Operator__Group_8__6 )
            // InternalKPIFormulaDSL.g:5638:2: rule__Operator__Group_8__5__Impl rule__Operator__Group_8__6
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_8__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_8__6();

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
    // $ANTLR end "rule__Operator__Group_8__5"


    // $ANTLR start "rule__Operator__Group_8__5__Impl"
    // InternalKPIFormulaDSL.g:5645:1: rule__Operator__Group_8__5__Impl : ( 'in' ) ;
    public final void rule__Operator__Group_8__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5649:1: ( ( 'in' ) )
            // InternalKPIFormulaDSL.g:5650:1: ( 'in' )
            {
            // InternalKPIFormulaDSL.g:5650:1: ( 'in' )
            // InternalKPIFormulaDSL.g:5651:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getInKeyword_8_5()); 
            }
            match(input,74,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getInKeyword_8_5()); 
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
    // $ANTLR end "rule__Operator__Group_8__5__Impl"


    // $ANTLR start "rule__Operator__Group_8__6"
    // InternalKPIFormulaDSL.g:5660:1: rule__Operator__Group_8__6 : rule__Operator__Group_8__6__Impl rule__Operator__Group_8__7 ;
    public final void rule__Operator__Group_8__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5664:1: ( rule__Operator__Group_8__6__Impl rule__Operator__Group_8__7 )
            // InternalKPIFormulaDSL.g:5665:2: rule__Operator__Group_8__6__Impl rule__Operator__Group_8__7
            {
            pushFollow(FOLLOW_56);
            rule__Operator__Group_8__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_8__7();

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
    // $ANTLR end "rule__Operator__Group_8__6"


    // $ANTLR start "rule__Operator__Group_8__6__Impl"
    // InternalKPIFormulaDSL.g:5672:1: rule__Operator__Group_8__6__Impl : ( ( rule__Operator__ListsAssignment_8_6 ) ) ;
    public final void rule__Operator__Group_8__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5676:1: ( ( ( rule__Operator__ListsAssignment_8_6 ) ) )
            // InternalKPIFormulaDSL.g:5677:1: ( ( rule__Operator__ListsAssignment_8_6 ) )
            {
            // InternalKPIFormulaDSL.g:5677:1: ( ( rule__Operator__ListsAssignment_8_6 ) )
            // InternalKPIFormulaDSL.g:5678:2: ( rule__Operator__ListsAssignment_8_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsAssignment_8_6()); 
            }
            // InternalKPIFormulaDSL.g:5679:2: ( rule__Operator__ListsAssignment_8_6 )
            // InternalKPIFormulaDSL.g:5679:3: rule__Operator__ListsAssignment_8_6
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ListsAssignment_8_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsAssignment_8_6()); 
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
    // $ANTLR end "rule__Operator__Group_8__6__Impl"


    // $ANTLR start "rule__Operator__Group_8__7"
    // InternalKPIFormulaDSL.g:5687:1: rule__Operator__Group_8__7 : rule__Operator__Group_8__7__Impl ;
    public final void rule__Operator__Group_8__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5691:1: ( rule__Operator__Group_8__7__Impl )
            // InternalKPIFormulaDSL.g:5692:2: rule__Operator__Group_8__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_8__7__Impl();

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
    // $ANTLR end "rule__Operator__Group_8__7"


    // $ANTLR start "rule__Operator__Group_8__7__Impl"
    // InternalKPIFormulaDSL.g:5698:1: rule__Operator__Group_8__7__Impl : ( ( rule__Operator__Group_8_7__0 )* ) ;
    public final void rule__Operator__Group_8__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5702:1: ( ( ( rule__Operator__Group_8_7__0 )* ) )
            // InternalKPIFormulaDSL.g:5703:1: ( ( rule__Operator__Group_8_7__0 )* )
            {
            // InternalKPIFormulaDSL.g:5703:1: ( ( rule__Operator__Group_8_7__0 )* )
            // InternalKPIFormulaDSL.g:5704:2: ( rule__Operator__Group_8_7__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getGroup_8_7()); 
            }
            // InternalKPIFormulaDSL.g:5705:2: ( rule__Operator__Group_8_7__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==64) ) {
                    int LA26_2 = input.LA(2);

                    if ( (LA26_2==RULE_ID) ) {
                        int LA26_3 = input.LA(3);

                        if ( (LA26_3==74) ) {
                            alt26=1;
                        }


                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:5705:3: rule__Operator__Group_8_7__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__Operator__Group_8_7__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getGroup_8_7()); 
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
    // $ANTLR end "rule__Operator__Group_8__7__Impl"


    // $ANTLR start "rule__Operator__Group_8_7__0"
    // InternalKPIFormulaDSL.g:5714:1: rule__Operator__Group_8_7__0 : rule__Operator__Group_8_7__0__Impl rule__Operator__Group_8_7__1 ;
    public final void rule__Operator__Group_8_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5718:1: ( rule__Operator__Group_8_7__0__Impl rule__Operator__Group_8_7__1 )
            // InternalKPIFormulaDSL.g:5719:2: rule__Operator__Group_8_7__0__Impl rule__Operator__Group_8_7__1
            {
            pushFollow(FOLLOW_9);
            rule__Operator__Group_8_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_8_7__1();

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
    // $ANTLR end "rule__Operator__Group_8_7__0"


    // $ANTLR start "rule__Operator__Group_8_7__0__Impl"
    // InternalKPIFormulaDSL.g:5726:1: rule__Operator__Group_8_7__0__Impl : ( ',' ) ;
    public final void rule__Operator__Group_8_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5730:1: ( ( ',' ) )
            // InternalKPIFormulaDSL.g:5731:1: ( ',' )
            {
            // InternalKPIFormulaDSL.g:5731:1: ( ',' )
            // InternalKPIFormulaDSL.g:5732:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getCommaKeyword_8_7_0()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getCommaKeyword_8_7_0()); 
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
    // $ANTLR end "rule__Operator__Group_8_7__0__Impl"


    // $ANTLR start "rule__Operator__Group_8_7__1"
    // InternalKPIFormulaDSL.g:5741:1: rule__Operator__Group_8_7__1 : rule__Operator__Group_8_7__1__Impl rule__Operator__Group_8_7__2 ;
    public final void rule__Operator__Group_8_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5745:1: ( rule__Operator__Group_8_7__1__Impl rule__Operator__Group_8_7__2 )
            // InternalKPIFormulaDSL.g:5746:2: rule__Operator__Group_8_7__1__Impl rule__Operator__Group_8_7__2
            {
            pushFollow(FOLLOW_62);
            rule__Operator__Group_8_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_8_7__2();

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
    // $ANTLR end "rule__Operator__Group_8_7__1"


    // $ANTLR start "rule__Operator__Group_8_7__1__Impl"
    // InternalKPIFormulaDSL.g:5753:1: rule__Operator__Group_8_7__1__Impl : ( ( rule__Operator__IteratorsAssignment_8_7_1 ) ) ;
    public final void rule__Operator__Group_8_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5757:1: ( ( ( rule__Operator__IteratorsAssignment_8_7_1 ) ) )
            // InternalKPIFormulaDSL.g:5758:1: ( ( rule__Operator__IteratorsAssignment_8_7_1 ) )
            {
            // InternalKPIFormulaDSL.g:5758:1: ( ( rule__Operator__IteratorsAssignment_8_7_1 ) )
            // InternalKPIFormulaDSL.g:5759:2: ( rule__Operator__IteratorsAssignment_8_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsAssignment_8_7_1()); 
            }
            // InternalKPIFormulaDSL.g:5760:2: ( rule__Operator__IteratorsAssignment_8_7_1 )
            // InternalKPIFormulaDSL.g:5760:3: rule__Operator__IteratorsAssignment_8_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__IteratorsAssignment_8_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsAssignment_8_7_1()); 
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
    // $ANTLR end "rule__Operator__Group_8_7__1__Impl"


    // $ANTLR start "rule__Operator__Group_8_7__2"
    // InternalKPIFormulaDSL.g:5768:1: rule__Operator__Group_8_7__2 : rule__Operator__Group_8_7__2__Impl rule__Operator__Group_8_7__3 ;
    public final void rule__Operator__Group_8_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5772:1: ( rule__Operator__Group_8_7__2__Impl rule__Operator__Group_8_7__3 )
            // InternalKPIFormulaDSL.g:5773:2: rule__Operator__Group_8_7__2__Impl rule__Operator__Group_8_7__3
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_8_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_8_7__3();

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
    // $ANTLR end "rule__Operator__Group_8_7__2"


    // $ANTLR start "rule__Operator__Group_8_7__2__Impl"
    // InternalKPIFormulaDSL.g:5780:1: rule__Operator__Group_8_7__2__Impl : ( 'in' ) ;
    public final void rule__Operator__Group_8_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5784:1: ( ( 'in' ) )
            // InternalKPIFormulaDSL.g:5785:1: ( 'in' )
            {
            // InternalKPIFormulaDSL.g:5785:1: ( 'in' )
            // InternalKPIFormulaDSL.g:5786:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getInKeyword_8_7_2()); 
            }
            match(input,74,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getInKeyword_8_7_2()); 
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
    // $ANTLR end "rule__Operator__Group_8_7__2__Impl"


    // $ANTLR start "rule__Operator__Group_8_7__3"
    // InternalKPIFormulaDSL.g:5795:1: rule__Operator__Group_8_7__3 : rule__Operator__Group_8_7__3__Impl ;
    public final void rule__Operator__Group_8_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5799:1: ( rule__Operator__Group_8_7__3__Impl )
            // InternalKPIFormulaDSL.g:5800:2: rule__Operator__Group_8_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_8_7__3__Impl();

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
    // $ANTLR end "rule__Operator__Group_8_7__3"


    // $ANTLR start "rule__Operator__Group_8_7__3__Impl"
    // InternalKPIFormulaDSL.g:5806:1: rule__Operator__Group_8_7__3__Impl : ( ( rule__Operator__ListsAssignment_8_7_3 ) ) ;
    public final void rule__Operator__Group_8_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5810:1: ( ( ( rule__Operator__ListsAssignment_8_7_3 ) ) )
            // InternalKPIFormulaDSL.g:5811:1: ( ( rule__Operator__ListsAssignment_8_7_3 ) )
            {
            // InternalKPIFormulaDSL.g:5811:1: ( ( rule__Operator__ListsAssignment_8_7_3 ) )
            // InternalKPIFormulaDSL.g:5812:2: ( rule__Operator__ListsAssignment_8_7_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsAssignment_8_7_3()); 
            }
            // InternalKPIFormulaDSL.g:5813:2: ( rule__Operator__ListsAssignment_8_7_3 )
            // InternalKPIFormulaDSL.g:5813:3: rule__Operator__ListsAssignment_8_7_3
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ListsAssignment_8_7_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsAssignment_8_7_3()); 
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
    // $ANTLR end "rule__Operator__Group_8_7__3__Impl"


    // $ANTLR start "rule__Operator__Group_9__0"
    // InternalKPIFormulaDSL.g:5822:1: rule__Operator__Group_9__0 : rule__Operator__Group_9__0__Impl rule__Operator__Group_9__1 ;
    public final void rule__Operator__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5826:1: ( rule__Operator__Group_9__0__Impl rule__Operator__Group_9__1 )
            // InternalKPIFormulaDSL.g:5827:2: rule__Operator__Group_9__0__Impl rule__Operator__Group_9__1
            {
            pushFollow(FOLLOW_63);
            rule__Operator__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_9__1();

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
    // $ANTLR end "rule__Operator__Group_9__0"


    // $ANTLR start "rule__Operator__Group_9__0__Impl"
    // InternalKPIFormulaDSL.g:5834:1: rule__Operator__Group_9__0__Impl : ( () ) ;
    public final void rule__Operator__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5838:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:5839:1: ( () )
            {
            // InternalKPIFormulaDSL.g:5839:1: ( () )
            // InternalKPIFormulaDSL.g:5840:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListReduceAction_9_0()); 
            }
            // InternalKPIFormulaDSL.g:5841:2: ()
            // InternalKPIFormulaDSL.g:5841:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListReduceAction_9_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_9__0__Impl"


    // $ANTLR start "rule__Operator__Group_9__1"
    // InternalKPIFormulaDSL.g:5849:1: rule__Operator__Group_9__1 : rule__Operator__Group_9__1__Impl rule__Operator__Group_9__2 ;
    public final void rule__Operator__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5853:1: ( rule__Operator__Group_9__1__Impl rule__Operator__Group_9__2 )
            // InternalKPIFormulaDSL.g:5854:2: rule__Operator__Group_9__1__Impl rule__Operator__Group_9__2
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_9__2();

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
    // $ANTLR end "rule__Operator__Group_9__1"


    // $ANTLR start "rule__Operator__Group_9__1__Impl"
    // InternalKPIFormulaDSL.g:5861:1: rule__Operator__Group_9__1__Impl : ( 'reduce' ) ;
    public final void rule__Operator__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5865:1: ( ( 'reduce' ) )
            // InternalKPIFormulaDSL.g:5866:1: ( 'reduce' )
            {
            // InternalKPIFormulaDSL.g:5866:1: ( 'reduce' )
            // InternalKPIFormulaDSL.g:5867:2: 'reduce'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getReduceKeyword_9_1()); 
            }
            match(input,75,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getReduceKeyword_9_1()); 
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
    // $ANTLR end "rule__Operator__Group_9__1__Impl"


    // $ANTLR start "rule__Operator__Group_9__2"
    // InternalKPIFormulaDSL.g:5876:1: rule__Operator__Group_9__2 : rule__Operator__Group_9__2__Impl rule__Operator__Group_9__3 ;
    public final void rule__Operator__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5880:1: ( rule__Operator__Group_9__2__Impl rule__Operator__Group_9__3 )
            // InternalKPIFormulaDSL.g:5881:2: rule__Operator__Group_9__2__Impl rule__Operator__Group_9__3
            {
            pushFollow(FOLLOW_64);
            rule__Operator__Group_9__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_9__3();

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
    // $ANTLR end "rule__Operator__Group_9__2"


    // $ANTLR start "rule__Operator__Group_9__2__Impl"
    // InternalKPIFormulaDSL.g:5888:1: rule__Operator__Group_9__2__Impl : ( ( rule__Operator__ExpressionAssignment_9_2 ) ) ;
    public final void rule__Operator__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5892:1: ( ( ( rule__Operator__ExpressionAssignment_9_2 ) ) )
            // InternalKPIFormulaDSL.g:5893:1: ( ( rule__Operator__ExpressionAssignment_9_2 ) )
            {
            // InternalKPIFormulaDSL.g:5893:1: ( ( rule__Operator__ExpressionAssignment_9_2 ) )
            // InternalKPIFormulaDSL.g:5894:2: ( rule__Operator__ExpressionAssignment_9_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getExpressionAssignment_9_2()); 
            }
            // InternalKPIFormulaDSL.g:5895:2: ( rule__Operator__ExpressionAssignment_9_2 )
            // InternalKPIFormulaDSL.g:5895:3: rule__Operator__ExpressionAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ExpressionAssignment_9_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getExpressionAssignment_9_2()); 
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
    // $ANTLR end "rule__Operator__Group_9__2__Impl"


    // $ANTLR start "rule__Operator__Group_9__3"
    // InternalKPIFormulaDSL.g:5903:1: rule__Operator__Group_9__3 : rule__Operator__Group_9__3__Impl rule__Operator__Group_9__4 ;
    public final void rule__Operator__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5907:1: ( rule__Operator__Group_9__3__Impl rule__Operator__Group_9__4 )
            // InternalKPIFormulaDSL.g:5908:2: rule__Operator__Group_9__3__Impl rule__Operator__Group_9__4
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_9__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_9__4();

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
    // $ANTLR end "rule__Operator__Group_9__3"


    // $ANTLR start "rule__Operator__Group_9__3__Impl"
    // InternalKPIFormulaDSL.g:5915:1: rule__Operator__Group_9__3__Impl : ( 'starting' ) ;
    public final void rule__Operator__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5919:1: ( ( 'starting' ) )
            // InternalKPIFormulaDSL.g:5920:1: ( 'starting' )
            {
            // InternalKPIFormulaDSL.g:5920:1: ( 'starting' )
            // InternalKPIFormulaDSL.g:5921:2: 'starting'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getStartingKeyword_9_3()); 
            }
            match(input,76,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getStartingKeyword_9_3()); 
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
    // $ANTLR end "rule__Operator__Group_9__3__Impl"


    // $ANTLR start "rule__Operator__Group_9__4"
    // InternalKPIFormulaDSL.g:5930:1: rule__Operator__Group_9__4 : rule__Operator__Group_9__4__Impl rule__Operator__Group_9__5 ;
    public final void rule__Operator__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5934:1: ( rule__Operator__Group_9__4__Impl rule__Operator__Group_9__5 )
            // InternalKPIFormulaDSL.g:5935:2: rule__Operator__Group_9__4__Impl rule__Operator__Group_9__5
            {
            pushFollow(FOLLOW_17);
            rule__Operator__Group_9__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_9__5();

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
    // $ANTLR end "rule__Operator__Group_9__4"


    // $ANTLR start "rule__Operator__Group_9__4__Impl"
    // InternalKPIFormulaDSL.g:5942:1: rule__Operator__Group_9__4__Impl : ( ( rule__Operator__AccumulatorAssignment_9_4 ) ) ;
    public final void rule__Operator__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5946:1: ( ( ( rule__Operator__AccumulatorAssignment_9_4 ) ) )
            // InternalKPIFormulaDSL.g:5947:1: ( ( rule__Operator__AccumulatorAssignment_9_4 ) )
            {
            // InternalKPIFormulaDSL.g:5947:1: ( ( rule__Operator__AccumulatorAssignment_9_4 ) )
            // InternalKPIFormulaDSL.g:5948:2: ( rule__Operator__AccumulatorAssignment_9_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getAccumulatorAssignment_9_4()); 
            }
            // InternalKPIFormulaDSL.g:5949:2: ( rule__Operator__AccumulatorAssignment_9_4 )
            // InternalKPIFormulaDSL.g:5949:3: rule__Operator__AccumulatorAssignment_9_4
            {
            pushFollow(FOLLOW_2);
            rule__Operator__AccumulatorAssignment_9_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getAccumulatorAssignment_9_4()); 
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
    // $ANTLR end "rule__Operator__Group_9__4__Impl"


    // $ANTLR start "rule__Operator__Group_9__5"
    // InternalKPIFormulaDSL.g:5957:1: rule__Operator__Group_9__5 : rule__Operator__Group_9__5__Impl rule__Operator__Group_9__6 ;
    public final void rule__Operator__Group_9__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5961:1: ( rule__Operator__Group_9__5__Impl rule__Operator__Group_9__6 )
            // InternalKPIFormulaDSL.g:5962:2: rule__Operator__Group_9__5__Impl rule__Operator__Group_9__6
            {
            pushFollow(FOLLOW_9);
            rule__Operator__Group_9__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_9__6();

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
    // $ANTLR end "rule__Operator__Group_9__5"


    // $ANTLR start "rule__Operator__Group_9__5__Impl"
    // InternalKPIFormulaDSL.g:5969:1: rule__Operator__Group_9__5__Impl : ( 'for' ) ;
    public final void rule__Operator__Group_9__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5973:1: ( ( 'for' ) )
            // InternalKPIFormulaDSL.g:5974:1: ( 'for' )
            {
            // InternalKPIFormulaDSL.g:5974:1: ( 'for' )
            // InternalKPIFormulaDSL.g:5975:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getForKeyword_9_5()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getForKeyword_9_5()); 
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
    // $ANTLR end "rule__Operator__Group_9__5__Impl"


    // $ANTLR start "rule__Operator__Group_9__6"
    // InternalKPIFormulaDSL.g:5984:1: rule__Operator__Group_9__6 : rule__Operator__Group_9__6__Impl rule__Operator__Group_9__7 ;
    public final void rule__Operator__Group_9__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5988:1: ( rule__Operator__Group_9__6__Impl rule__Operator__Group_9__7 )
            // InternalKPIFormulaDSL.g:5989:2: rule__Operator__Group_9__6__Impl rule__Operator__Group_9__7
            {
            pushFollow(FOLLOW_62);
            rule__Operator__Group_9__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_9__7();

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
    // $ANTLR end "rule__Operator__Group_9__6"


    // $ANTLR start "rule__Operator__Group_9__6__Impl"
    // InternalKPIFormulaDSL.g:5996:1: rule__Operator__Group_9__6__Impl : ( ( rule__Operator__IteratorsAssignment_9_6 ) ) ;
    public final void rule__Operator__Group_9__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6000:1: ( ( ( rule__Operator__IteratorsAssignment_9_6 ) ) )
            // InternalKPIFormulaDSL.g:6001:1: ( ( rule__Operator__IteratorsAssignment_9_6 ) )
            {
            // InternalKPIFormulaDSL.g:6001:1: ( ( rule__Operator__IteratorsAssignment_9_6 ) )
            // InternalKPIFormulaDSL.g:6002:2: ( rule__Operator__IteratorsAssignment_9_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsAssignment_9_6()); 
            }
            // InternalKPIFormulaDSL.g:6003:2: ( rule__Operator__IteratorsAssignment_9_6 )
            // InternalKPIFormulaDSL.g:6003:3: rule__Operator__IteratorsAssignment_9_6
            {
            pushFollow(FOLLOW_2);
            rule__Operator__IteratorsAssignment_9_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsAssignment_9_6()); 
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
    // $ANTLR end "rule__Operator__Group_9__6__Impl"


    // $ANTLR start "rule__Operator__Group_9__7"
    // InternalKPIFormulaDSL.g:6011:1: rule__Operator__Group_9__7 : rule__Operator__Group_9__7__Impl rule__Operator__Group_9__8 ;
    public final void rule__Operator__Group_9__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6015:1: ( rule__Operator__Group_9__7__Impl rule__Operator__Group_9__8 )
            // InternalKPIFormulaDSL.g:6016:2: rule__Operator__Group_9__7__Impl rule__Operator__Group_9__8
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_9__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_9__8();

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
    // $ANTLR end "rule__Operator__Group_9__7"


    // $ANTLR start "rule__Operator__Group_9__7__Impl"
    // InternalKPIFormulaDSL.g:6023:1: rule__Operator__Group_9__7__Impl : ( 'in' ) ;
    public final void rule__Operator__Group_9__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6027:1: ( ( 'in' ) )
            // InternalKPIFormulaDSL.g:6028:1: ( 'in' )
            {
            // InternalKPIFormulaDSL.g:6028:1: ( 'in' )
            // InternalKPIFormulaDSL.g:6029:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getInKeyword_9_7()); 
            }
            match(input,74,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getInKeyword_9_7()); 
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
    // $ANTLR end "rule__Operator__Group_9__7__Impl"


    // $ANTLR start "rule__Operator__Group_9__8"
    // InternalKPIFormulaDSL.g:6038:1: rule__Operator__Group_9__8 : rule__Operator__Group_9__8__Impl rule__Operator__Group_9__9 ;
    public final void rule__Operator__Group_9__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6042:1: ( rule__Operator__Group_9__8__Impl rule__Operator__Group_9__9 )
            // InternalKPIFormulaDSL.g:6043:2: rule__Operator__Group_9__8__Impl rule__Operator__Group_9__9
            {
            pushFollow(FOLLOW_56);
            rule__Operator__Group_9__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_9__9();

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
    // $ANTLR end "rule__Operator__Group_9__8"


    // $ANTLR start "rule__Operator__Group_9__8__Impl"
    // InternalKPIFormulaDSL.g:6050:1: rule__Operator__Group_9__8__Impl : ( ( rule__Operator__ListsAssignment_9_8 ) ) ;
    public final void rule__Operator__Group_9__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6054:1: ( ( ( rule__Operator__ListsAssignment_9_8 ) ) )
            // InternalKPIFormulaDSL.g:6055:1: ( ( rule__Operator__ListsAssignment_9_8 ) )
            {
            // InternalKPIFormulaDSL.g:6055:1: ( ( rule__Operator__ListsAssignment_9_8 ) )
            // InternalKPIFormulaDSL.g:6056:2: ( rule__Operator__ListsAssignment_9_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsAssignment_9_8()); 
            }
            // InternalKPIFormulaDSL.g:6057:2: ( rule__Operator__ListsAssignment_9_8 )
            // InternalKPIFormulaDSL.g:6057:3: rule__Operator__ListsAssignment_9_8
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ListsAssignment_9_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsAssignment_9_8()); 
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
    // $ANTLR end "rule__Operator__Group_9__8__Impl"


    // $ANTLR start "rule__Operator__Group_9__9"
    // InternalKPIFormulaDSL.g:6065:1: rule__Operator__Group_9__9 : rule__Operator__Group_9__9__Impl ;
    public final void rule__Operator__Group_9__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6069:1: ( rule__Operator__Group_9__9__Impl )
            // InternalKPIFormulaDSL.g:6070:2: rule__Operator__Group_9__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_9__9__Impl();

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
    // $ANTLR end "rule__Operator__Group_9__9"


    // $ANTLR start "rule__Operator__Group_9__9__Impl"
    // InternalKPIFormulaDSL.g:6076:1: rule__Operator__Group_9__9__Impl : ( ( rule__Operator__Group_9_9__0 )* ) ;
    public final void rule__Operator__Group_9__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6080:1: ( ( ( rule__Operator__Group_9_9__0 )* ) )
            // InternalKPIFormulaDSL.g:6081:1: ( ( rule__Operator__Group_9_9__0 )* )
            {
            // InternalKPIFormulaDSL.g:6081:1: ( ( rule__Operator__Group_9_9__0 )* )
            // InternalKPIFormulaDSL.g:6082:2: ( rule__Operator__Group_9_9__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getGroup_9_9()); 
            }
            // InternalKPIFormulaDSL.g:6083:2: ( rule__Operator__Group_9_9__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==64) ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==RULE_ID) ) {
                        int LA27_3 = input.LA(3);

                        if ( (LA27_3==74) ) {
                            alt27=1;
                        }


                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:6083:3: rule__Operator__Group_9_9__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__Operator__Group_9_9__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getGroup_9_9()); 
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
    // $ANTLR end "rule__Operator__Group_9__9__Impl"


    // $ANTLR start "rule__Operator__Group_9_9__0"
    // InternalKPIFormulaDSL.g:6092:1: rule__Operator__Group_9_9__0 : rule__Operator__Group_9_9__0__Impl rule__Operator__Group_9_9__1 ;
    public final void rule__Operator__Group_9_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6096:1: ( rule__Operator__Group_9_9__0__Impl rule__Operator__Group_9_9__1 )
            // InternalKPIFormulaDSL.g:6097:2: rule__Operator__Group_9_9__0__Impl rule__Operator__Group_9_9__1
            {
            pushFollow(FOLLOW_9);
            rule__Operator__Group_9_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_9_9__1();

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
    // $ANTLR end "rule__Operator__Group_9_9__0"


    // $ANTLR start "rule__Operator__Group_9_9__0__Impl"
    // InternalKPIFormulaDSL.g:6104:1: rule__Operator__Group_9_9__0__Impl : ( ',' ) ;
    public final void rule__Operator__Group_9_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6108:1: ( ( ',' ) )
            // InternalKPIFormulaDSL.g:6109:1: ( ',' )
            {
            // InternalKPIFormulaDSL.g:6109:1: ( ',' )
            // InternalKPIFormulaDSL.g:6110:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getCommaKeyword_9_9_0()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getCommaKeyword_9_9_0()); 
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
    // $ANTLR end "rule__Operator__Group_9_9__0__Impl"


    // $ANTLR start "rule__Operator__Group_9_9__1"
    // InternalKPIFormulaDSL.g:6119:1: rule__Operator__Group_9_9__1 : rule__Operator__Group_9_9__1__Impl rule__Operator__Group_9_9__2 ;
    public final void rule__Operator__Group_9_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6123:1: ( rule__Operator__Group_9_9__1__Impl rule__Operator__Group_9_9__2 )
            // InternalKPIFormulaDSL.g:6124:2: rule__Operator__Group_9_9__1__Impl rule__Operator__Group_9_9__2
            {
            pushFollow(FOLLOW_62);
            rule__Operator__Group_9_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_9_9__2();

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
    // $ANTLR end "rule__Operator__Group_9_9__1"


    // $ANTLR start "rule__Operator__Group_9_9__1__Impl"
    // InternalKPIFormulaDSL.g:6131:1: rule__Operator__Group_9_9__1__Impl : ( ( rule__Operator__IteratorsAssignment_9_9_1 ) ) ;
    public final void rule__Operator__Group_9_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6135:1: ( ( ( rule__Operator__IteratorsAssignment_9_9_1 ) ) )
            // InternalKPIFormulaDSL.g:6136:1: ( ( rule__Operator__IteratorsAssignment_9_9_1 ) )
            {
            // InternalKPIFormulaDSL.g:6136:1: ( ( rule__Operator__IteratorsAssignment_9_9_1 ) )
            // InternalKPIFormulaDSL.g:6137:2: ( rule__Operator__IteratorsAssignment_9_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsAssignment_9_9_1()); 
            }
            // InternalKPIFormulaDSL.g:6138:2: ( rule__Operator__IteratorsAssignment_9_9_1 )
            // InternalKPIFormulaDSL.g:6138:3: rule__Operator__IteratorsAssignment_9_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__IteratorsAssignment_9_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsAssignment_9_9_1()); 
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
    // $ANTLR end "rule__Operator__Group_9_9__1__Impl"


    // $ANTLR start "rule__Operator__Group_9_9__2"
    // InternalKPIFormulaDSL.g:6146:1: rule__Operator__Group_9_9__2 : rule__Operator__Group_9_9__2__Impl rule__Operator__Group_9_9__3 ;
    public final void rule__Operator__Group_9_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6150:1: ( rule__Operator__Group_9_9__2__Impl rule__Operator__Group_9_9__3 )
            // InternalKPIFormulaDSL.g:6151:2: rule__Operator__Group_9_9__2__Impl rule__Operator__Group_9_9__3
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_9_9__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_9_9__3();

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
    // $ANTLR end "rule__Operator__Group_9_9__2"


    // $ANTLR start "rule__Operator__Group_9_9__2__Impl"
    // InternalKPIFormulaDSL.g:6158:1: rule__Operator__Group_9_9__2__Impl : ( 'in' ) ;
    public final void rule__Operator__Group_9_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6162:1: ( ( 'in' ) )
            // InternalKPIFormulaDSL.g:6163:1: ( 'in' )
            {
            // InternalKPIFormulaDSL.g:6163:1: ( 'in' )
            // InternalKPIFormulaDSL.g:6164:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getInKeyword_9_9_2()); 
            }
            match(input,74,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getInKeyword_9_9_2()); 
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
    // $ANTLR end "rule__Operator__Group_9_9__2__Impl"


    // $ANTLR start "rule__Operator__Group_9_9__3"
    // InternalKPIFormulaDSL.g:6173:1: rule__Operator__Group_9_9__3 : rule__Operator__Group_9_9__3__Impl ;
    public final void rule__Operator__Group_9_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6177:1: ( rule__Operator__Group_9_9__3__Impl )
            // InternalKPIFormulaDSL.g:6178:2: rule__Operator__Group_9_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_9_9__3__Impl();

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
    // $ANTLR end "rule__Operator__Group_9_9__3"


    // $ANTLR start "rule__Operator__Group_9_9__3__Impl"
    // InternalKPIFormulaDSL.g:6184:1: rule__Operator__Group_9_9__3__Impl : ( ( rule__Operator__ListsAssignment_9_9_3 ) ) ;
    public final void rule__Operator__Group_9_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6188:1: ( ( ( rule__Operator__ListsAssignment_9_9_3 ) ) )
            // InternalKPIFormulaDSL.g:6189:1: ( ( rule__Operator__ListsAssignment_9_9_3 ) )
            {
            // InternalKPIFormulaDSL.g:6189:1: ( ( rule__Operator__ListsAssignment_9_9_3 ) )
            // InternalKPIFormulaDSL.g:6190:2: ( rule__Operator__ListsAssignment_9_9_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsAssignment_9_9_3()); 
            }
            // InternalKPIFormulaDSL.g:6191:2: ( rule__Operator__ListsAssignment_9_9_3 )
            // InternalKPIFormulaDSL.g:6191:3: rule__Operator__ListsAssignment_9_9_3
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ListsAssignment_9_9_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsAssignment_9_9_3()); 
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
    // $ANTLR end "rule__Operator__Group_9_9__3__Impl"


    // $ANTLR start "rule__Operator__Group_10__0"
    // InternalKPIFormulaDSL.g:6200:1: rule__Operator__Group_10__0 : rule__Operator__Group_10__0__Impl rule__Operator__Group_10__1 ;
    public final void rule__Operator__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6204:1: ( rule__Operator__Group_10__0__Impl rule__Operator__Group_10__1 )
            // InternalKPIFormulaDSL.g:6205:2: rule__Operator__Group_10__0__Impl rule__Operator__Group_10__1
            {
            pushFollow(FOLLOW_65);
            rule__Operator__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_10__1();

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
    // $ANTLR end "rule__Operator__Group_10__0"


    // $ANTLR start "rule__Operator__Group_10__0__Impl"
    // InternalKPIFormulaDSL.g:6212:1: rule__Operator__Group_10__0__Impl : ( () ) ;
    public final void rule__Operator__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6216:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:6217:1: ( () )
            {
            // InternalKPIFormulaDSL.g:6217:1: ( () )
            // InternalKPIFormulaDSL.g:6218:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListFilterAction_10_0()); 
            }
            // InternalKPIFormulaDSL.g:6219:2: ()
            // InternalKPIFormulaDSL.g:6219:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListFilterAction_10_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_10__0__Impl"


    // $ANTLR start "rule__Operator__Group_10__1"
    // InternalKPIFormulaDSL.g:6227:1: rule__Operator__Group_10__1 : rule__Operator__Group_10__1__Impl rule__Operator__Group_10__2 ;
    public final void rule__Operator__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6231:1: ( rule__Operator__Group_10__1__Impl rule__Operator__Group_10__2 )
            // InternalKPIFormulaDSL.g:6232:2: rule__Operator__Group_10__1__Impl rule__Operator__Group_10__2
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_10__2();

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
    // $ANTLR end "rule__Operator__Group_10__1"


    // $ANTLR start "rule__Operator__Group_10__1__Impl"
    // InternalKPIFormulaDSL.g:6239:1: rule__Operator__Group_10__1__Impl : ( 'filter' ) ;
    public final void rule__Operator__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6243:1: ( ( 'filter' ) )
            // InternalKPIFormulaDSL.g:6244:1: ( 'filter' )
            {
            // InternalKPIFormulaDSL.g:6244:1: ( 'filter' )
            // InternalKPIFormulaDSL.g:6245:2: 'filter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getFilterKeyword_10_1()); 
            }
            match(input,77,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getFilterKeyword_10_1()); 
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
    // $ANTLR end "rule__Operator__Group_10__1__Impl"


    // $ANTLR start "rule__Operator__Group_10__2"
    // InternalKPIFormulaDSL.g:6254:1: rule__Operator__Group_10__2 : rule__Operator__Group_10__2__Impl rule__Operator__Group_10__3 ;
    public final void rule__Operator__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6258:1: ( rule__Operator__Group_10__2__Impl rule__Operator__Group_10__3 )
            // InternalKPIFormulaDSL.g:6259:2: rule__Operator__Group_10__2__Impl rule__Operator__Group_10__3
            {
            pushFollow(FOLLOW_17);
            rule__Operator__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_10__3();

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
    // $ANTLR end "rule__Operator__Group_10__2"


    // $ANTLR start "rule__Operator__Group_10__2__Impl"
    // InternalKPIFormulaDSL.g:6266:1: rule__Operator__Group_10__2__Impl : ( ( rule__Operator__ExpressionAssignment_10_2 ) ) ;
    public final void rule__Operator__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6270:1: ( ( ( rule__Operator__ExpressionAssignment_10_2 ) ) )
            // InternalKPIFormulaDSL.g:6271:1: ( ( rule__Operator__ExpressionAssignment_10_2 ) )
            {
            // InternalKPIFormulaDSL.g:6271:1: ( ( rule__Operator__ExpressionAssignment_10_2 ) )
            // InternalKPIFormulaDSL.g:6272:2: ( rule__Operator__ExpressionAssignment_10_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getExpressionAssignment_10_2()); 
            }
            // InternalKPIFormulaDSL.g:6273:2: ( rule__Operator__ExpressionAssignment_10_2 )
            // InternalKPIFormulaDSL.g:6273:3: rule__Operator__ExpressionAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ExpressionAssignment_10_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getExpressionAssignment_10_2()); 
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
    // $ANTLR end "rule__Operator__Group_10__2__Impl"


    // $ANTLR start "rule__Operator__Group_10__3"
    // InternalKPIFormulaDSL.g:6281:1: rule__Operator__Group_10__3 : rule__Operator__Group_10__3__Impl rule__Operator__Group_10__4 ;
    public final void rule__Operator__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6285:1: ( rule__Operator__Group_10__3__Impl rule__Operator__Group_10__4 )
            // InternalKPIFormulaDSL.g:6286:2: rule__Operator__Group_10__3__Impl rule__Operator__Group_10__4
            {
            pushFollow(FOLLOW_9);
            rule__Operator__Group_10__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_10__4();

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
    // $ANTLR end "rule__Operator__Group_10__3"


    // $ANTLR start "rule__Operator__Group_10__3__Impl"
    // InternalKPIFormulaDSL.g:6293:1: rule__Operator__Group_10__3__Impl : ( 'for' ) ;
    public final void rule__Operator__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6297:1: ( ( 'for' ) )
            // InternalKPIFormulaDSL.g:6298:1: ( 'for' )
            {
            // InternalKPIFormulaDSL.g:6298:1: ( 'for' )
            // InternalKPIFormulaDSL.g:6299:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getForKeyword_10_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getForKeyword_10_3()); 
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
    // $ANTLR end "rule__Operator__Group_10__3__Impl"


    // $ANTLR start "rule__Operator__Group_10__4"
    // InternalKPIFormulaDSL.g:6308:1: rule__Operator__Group_10__4 : rule__Operator__Group_10__4__Impl rule__Operator__Group_10__5 ;
    public final void rule__Operator__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6312:1: ( rule__Operator__Group_10__4__Impl rule__Operator__Group_10__5 )
            // InternalKPIFormulaDSL.g:6313:2: rule__Operator__Group_10__4__Impl rule__Operator__Group_10__5
            {
            pushFollow(FOLLOW_62);
            rule__Operator__Group_10__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_10__5();

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
    // $ANTLR end "rule__Operator__Group_10__4"


    // $ANTLR start "rule__Operator__Group_10__4__Impl"
    // InternalKPIFormulaDSL.g:6320:1: rule__Operator__Group_10__4__Impl : ( ( rule__Operator__IteratorsAssignment_10_4 ) ) ;
    public final void rule__Operator__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6324:1: ( ( ( rule__Operator__IteratorsAssignment_10_4 ) ) )
            // InternalKPIFormulaDSL.g:6325:1: ( ( rule__Operator__IteratorsAssignment_10_4 ) )
            {
            // InternalKPIFormulaDSL.g:6325:1: ( ( rule__Operator__IteratorsAssignment_10_4 ) )
            // InternalKPIFormulaDSL.g:6326:2: ( rule__Operator__IteratorsAssignment_10_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsAssignment_10_4()); 
            }
            // InternalKPIFormulaDSL.g:6327:2: ( rule__Operator__IteratorsAssignment_10_4 )
            // InternalKPIFormulaDSL.g:6327:3: rule__Operator__IteratorsAssignment_10_4
            {
            pushFollow(FOLLOW_2);
            rule__Operator__IteratorsAssignment_10_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsAssignment_10_4()); 
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
    // $ANTLR end "rule__Operator__Group_10__4__Impl"


    // $ANTLR start "rule__Operator__Group_10__5"
    // InternalKPIFormulaDSL.g:6335:1: rule__Operator__Group_10__5 : rule__Operator__Group_10__5__Impl rule__Operator__Group_10__6 ;
    public final void rule__Operator__Group_10__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6339:1: ( rule__Operator__Group_10__5__Impl rule__Operator__Group_10__6 )
            // InternalKPIFormulaDSL.g:6340:2: rule__Operator__Group_10__5__Impl rule__Operator__Group_10__6
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_10__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_10__6();

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
    // $ANTLR end "rule__Operator__Group_10__5"


    // $ANTLR start "rule__Operator__Group_10__5__Impl"
    // InternalKPIFormulaDSL.g:6347:1: rule__Operator__Group_10__5__Impl : ( 'in' ) ;
    public final void rule__Operator__Group_10__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6351:1: ( ( 'in' ) )
            // InternalKPIFormulaDSL.g:6352:1: ( 'in' )
            {
            // InternalKPIFormulaDSL.g:6352:1: ( 'in' )
            // InternalKPIFormulaDSL.g:6353:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getInKeyword_10_5()); 
            }
            match(input,74,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getInKeyword_10_5()); 
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
    // $ANTLR end "rule__Operator__Group_10__5__Impl"


    // $ANTLR start "rule__Operator__Group_10__6"
    // InternalKPIFormulaDSL.g:6362:1: rule__Operator__Group_10__6 : rule__Operator__Group_10__6__Impl rule__Operator__Group_10__7 ;
    public final void rule__Operator__Group_10__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6366:1: ( rule__Operator__Group_10__6__Impl rule__Operator__Group_10__7 )
            // InternalKPIFormulaDSL.g:6367:2: rule__Operator__Group_10__6__Impl rule__Operator__Group_10__7
            {
            pushFollow(FOLLOW_56);
            rule__Operator__Group_10__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_10__7();

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
    // $ANTLR end "rule__Operator__Group_10__6"


    // $ANTLR start "rule__Operator__Group_10__6__Impl"
    // InternalKPIFormulaDSL.g:6374:1: rule__Operator__Group_10__6__Impl : ( ( rule__Operator__ListsAssignment_10_6 ) ) ;
    public final void rule__Operator__Group_10__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6378:1: ( ( ( rule__Operator__ListsAssignment_10_6 ) ) )
            // InternalKPIFormulaDSL.g:6379:1: ( ( rule__Operator__ListsAssignment_10_6 ) )
            {
            // InternalKPIFormulaDSL.g:6379:1: ( ( rule__Operator__ListsAssignment_10_6 ) )
            // InternalKPIFormulaDSL.g:6380:2: ( rule__Operator__ListsAssignment_10_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsAssignment_10_6()); 
            }
            // InternalKPIFormulaDSL.g:6381:2: ( rule__Operator__ListsAssignment_10_6 )
            // InternalKPIFormulaDSL.g:6381:3: rule__Operator__ListsAssignment_10_6
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ListsAssignment_10_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsAssignment_10_6()); 
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
    // $ANTLR end "rule__Operator__Group_10__6__Impl"


    // $ANTLR start "rule__Operator__Group_10__7"
    // InternalKPIFormulaDSL.g:6389:1: rule__Operator__Group_10__7 : rule__Operator__Group_10__7__Impl ;
    public final void rule__Operator__Group_10__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6393:1: ( rule__Operator__Group_10__7__Impl )
            // InternalKPIFormulaDSL.g:6394:2: rule__Operator__Group_10__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_10__7__Impl();

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
    // $ANTLR end "rule__Operator__Group_10__7"


    // $ANTLR start "rule__Operator__Group_10__7__Impl"
    // InternalKPIFormulaDSL.g:6400:1: rule__Operator__Group_10__7__Impl : ( ( rule__Operator__Group_10_7__0 )* ) ;
    public final void rule__Operator__Group_10__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6404:1: ( ( ( rule__Operator__Group_10_7__0 )* ) )
            // InternalKPIFormulaDSL.g:6405:1: ( ( rule__Operator__Group_10_7__0 )* )
            {
            // InternalKPIFormulaDSL.g:6405:1: ( ( rule__Operator__Group_10_7__0 )* )
            // InternalKPIFormulaDSL.g:6406:2: ( rule__Operator__Group_10_7__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getGroup_10_7()); 
            }
            // InternalKPIFormulaDSL.g:6407:2: ( rule__Operator__Group_10_7__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==64) ) {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2==RULE_ID) ) {
                        int LA28_3 = input.LA(3);

                        if ( (LA28_3==74) ) {
                            alt28=1;
                        }


                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:6407:3: rule__Operator__Group_10_7__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__Operator__Group_10_7__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getGroup_10_7()); 
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
    // $ANTLR end "rule__Operator__Group_10__7__Impl"


    // $ANTLR start "rule__Operator__Group_10_7__0"
    // InternalKPIFormulaDSL.g:6416:1: rule__Operator__Group_10_7__0 : rule__Operator__Group_10_7__0__Impl rule__Operator__Group_10_7__1 ;
    public final void rule__Operator__Group_10_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6420:1: ( rule__Operator__Group_10_7__0__Impl rule__Operator__Group_10_7__1 )
            // InternalKPIFormulaDSL.g:6421:2: rule__Operator__Group_10_7__0__Impl rule__Operator__Group_10_7__1
            {
            pushFollow(FOLLOW_9);
            rule__Operator__Group_10_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_10_7__1();

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
    // $ANTLR end "rule__Operator__Group_10_7__0"


    // $ANTLR start "rule__Operator__Group_10_7__0__Impl"
    // InternalKPIFormulaDSL.g:6428:1: rule__Operator__Group_10_7__0__Impl : ( ',' ) ;
    public final void rule__Operator__Group_10_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6432:1: ( ( ',' ) )
            // InternalKPIFormulaDSL.g:6433:1: ( ',' )
            {
            // InternalKPIFormulaDSL.g:6433:1: ( ',' )
            // InternalKPIFormulaDSL.g:6434:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getCommaKeyword_10_7_0()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getCommaKeyword_10_7_0()); 
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
    // $ANTLR end "rule__Operator__Group_10_7__0__Impl"


    // $ANTLR start "rule__Operator__Group_10_7__1"
    // InternalKPIFormulaDSL.g:6443:1: rule__Operator__Group_10_7__1 : rule__Operator__Group_10_7__1__Impl rule__Operator__Group_10_7__2 ;
    public final void rule__Operator__Group_10_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6447:1: ( rule__Operator__Group_10_7__1__Impl rule__Operator__Group_10_7__2 )
            // InternalKPIFormulaDSL.g:6448:2: rule__Operator__Group_10_7__1__Impl rule__Operator__Group_10_7__2
            {
            pushFollow(FOLLOW_62);
            rule__Operator__Group_10_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_10_7__2();

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
    // $ANTLR end "rule__Operator__Group_10_7__1"


    // $ANTLR start "rule__Operator__Group_10_7__1__Impl"
    // InternalKPIFormulaDSL.g:6455:1: rule__Operator__Group_10_7__1__Impl : ( ( rule__Operator__IteratorsAssignment_10_7_1 ) ) ;
    public final void rule__Operator__Group_10_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6459:1: ( ( ( rule__Operator__IteratorsAssignment_10_7_1 ) ) )
            // InternalKPIFormulaDSL.g:6460:1: ( ( rule__Operator__IteratorsAssignment_10_7_1 ) )
            {
            // InternalKPIFormulaDSL.g:6460:1: ( ( rule__Operator__IteratorsAssignment_10_7_1 ) )
            // InternalKPIFormulaDSL.g:6461:2: ( rule__Operator__IteratorsAssignment_10_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsAssignment_10_7_1()); 
            }
            // InternalKPIFormulaDSL.g:6462:2: ( rule__Operator__IteratorsAssignment_10_7_1 )
            // InternalKPIFormulaDSL.g:6462:3: rule__Operator__IteratorsAssignment_10_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__IteratorsAssignment_10_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsAssignment_10_7_1()); 
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
    // $ANTLR end "rule__Operator__Group_10_7__1__Impl"


    // $ANTLR start "rule__Operator__Group_10_7__2"
    // InternalKPIFormulaDSL.g:6470:1: rule__Operator__Group_10_7__2 : rule__Operator__Group_10_7__2__Impl rule__Operator__Group_10_7__3 ;
    public final void rule__Operator__Group_10_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6474:1: ( rule__Operator__Group_10_7__2__Impl rule__Operator__Group_10_7__3 )
            // InternalKPIFormulaDSL.g:6475:2: rule__Operator__Group_10_7__2__Impl rule__Operator__Group_10_7__3
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_10_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_10_7__3();

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
    // $ANTLR end "rule__Operator__Group_10_7__2"


    // $ANTLR start "rule__Operator__Group_10_7__2__Impl"
    // InternalKPIFormulaDSL.g:6482:1: rule__Operator__Group_10_7__2__Impl : ( 'in' ) ;
    public final void rule__Operator__Group_10_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6486:1: ( ( 'in' ) )
            // InternalKPIFormulaDSL.g:6487:1: ( 'in' )
            {
            // InternalKPIFormulaDSL.g:6487:1: ( 'in' )
            // InternalKPIFormulaDSL.g:6488:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getInKeyword_10_7_2()); 
            }
            match(input,74,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getInKeyword_10_7_2()); 
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
    // $ANTLR end "rule__Operator__Group_10_7__2__Impl"


    // $ANTLR start "rule__Operator__Group_10_7__3"
    // InternalKPIFormulaDSL.g:6497:1: rule__Operator__Group_10_7__3 : rule__Operator__Group_10_7__3__Impl ;
    public final void rule__Operator__Group_10_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6501:1: ( rule__Operator__Group_10_7__3__Impl )
            // InternalKPIFormulaDSL.g:6502:2: rule__Operator__Group_10_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_10_7__3__Impl();

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
    // $ANTLR end "rule__Operator__Group_10_7__3"


    // $ANTLR start "rule__Operator__Group_10_7__3__Impl"
    // InternalKPIFormulaDSL.g:6508:1: rule__Operator__Group_10_7__3__Impl : ( ( rule__Operator__ListsAssignment_10_7_3 ) ) ;
    public final void rule__Operator__Group_10_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6512:1: ( ( ( rule__Operator__ListsAssignment_10_7_3 ) ) )
            // InternalKPIFormulaDSL.g:6513:1: ( ( rule__Operator__ListsAssignment_10_7_3 ) )
            {
            // InternalKPIFormulaDSL.g:6513:1: ( ( rule__Operator__ListsAssignment_10_7_3 ) )
            // InternalKPIFormulaDSL.g:6514:2: ( rule__Operator__ListsAssignment_10_7_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsAssignment_10_7_3()); 
            }
            // InternalKPIFormulaDSL.g:6515:2: ( rule__Operator__ListsAssignment_10_7_3 )
            // InternalKPIFormulaDSL.g:6515:3: rule__Operator__ListsAssignment_10_7_3
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ListsAssignment_10_7_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsAssignment_10_7_3()); 
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
    // $ANTLR end "rule__Operator__Group_10_7__3__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalKPIFormulaDSL.g:6524:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6528:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalKPIFormulaDSL.g:6529:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIFormulaDSL.g:6536:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6540:1: ( ( '(' ) )
            // InternalKPIFormulaDSL.g:6541:1: ( '(' )
            {
            // InternalKPIFormulaDSL.g:6541:1: ( '(' )
            // InternalKPIFormulaDSL.g:6542:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
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
    // InternalKPIFormulaDSL.g:6551:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6555:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalKPIFormulaDSL.g:6556:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_54);
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
    // InternalKPIFormulaDSL.g:6563:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6567:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:6568:1: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:6568:1: ( ruleExpression )
            // InternalKPIFormulaDSL.g:6569:2: ruleExpression
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
    // InternalKPIFormulaDSL.g:6578:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6582:1: ( rule__Primary__Group_0__2__Impl )
            // InternalKPIFormulaDSL.g:6583:2: rule__Primary__Group_0__2__Impl
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
    // InternalKPIFormulaDSL.g:6589:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6593:1: ( ( ')' ) )
            // InternalKPIFormulaDSL.g:6594:1: ( ')' )
            {
            // InternalKPIFormulaDSL.g:6594:1: ( ')' )
            // InternalKPIFormulaDSL.g:6595:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
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
    // InternalKPIFormulaDSL.g:6605:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6609:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalKPIFormulaDSL.g:6610:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_66);
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
    // InternalKPIFormulaDSL.g:6617:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6621:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:6622:1: ( () )
            {
            // InternalKPIFormulaDSL.g:6622:1: ( () )
            // InternalKPIFormulaDSL.g:6623:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            }
            // InternalKPIFormulaDSL.g:6624:2: ()
            // InternalKPIFormulaDSL.g:6624:3: 
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
    // InternalKPIFormulaDSL.g:6632:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6636:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalKPIFormulaDSL.g:6637:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIFormulaDSL.g:6644:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6648:1: ( ( '!' ) )
            // InternalKPIFormulaDSL.g:6649:1: ( '!' )
            {
            // InternalKPIFormulaDSL.g:6649:1: ( '!' )
            // InternalKPIFormulaDSL.g:6650:2: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            }
            match(input,78,FOLLOW_2); if (state.failed) return ;
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
    // InternalKPIFormulaDSL.g:6659:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6663:1: ( rule__Primary__Group_1__2__Impl )
            // InternalKPIFormulaDSL.g:6664:2: rule__Primary__Group_1__2__Impl
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
    // InternalKPIFormulaDSL.g:6670:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6674:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // InternalKPIFormulaDSL.g:6675:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // InternalKPIFormulaDSL.g:6675:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // InternalKPIFormulaDSL.g:6676:2: ( rule__Primary__ExpressionAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            }
            // InternalKPIFormulaDSL.g:6677:2: ( rule__Primary__ExpressionAssignment_1_2 )
            // InternalKPIFormulaDSL.g:6677:3: rule__Primary__ExpressionAssignment_1_2
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
    // InternalKPIFormulaDSL.g:6686:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6690:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalKPIFormulaDSL.g:6691:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_67);
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
    // InternalKPIFormulaDSL.g:6698:1: rule__Primary__Group_2__0__Impl : ( () ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6702:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:6703:1: ( () )
            {
            // InternalKPIFormulaDSL.g:6703:1: ( () )
            // InternalKPIFormulaDSL.g:6704:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getUnaryMinusAction_2_0()); 
            }
            // InternalKPIFormulaDSL.g:6705:2: ()
            // InternalKPIFormulaDSL.g:6705:3: 
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
    // InternalKPIFormulaDSL.g:6713:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6717:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalKPIFormulaDSL.g:6718:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIFormulaDSL.g:6725:1: rule__Primary__Group_2__1__Impl : ( '-' ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6729:1: ( ( '-' ) )
            // InternalKPIFormulaDSL.g:6730:1: ( '-' )
            {
            // InternalKPIFormulaDSL.g:6730:1: ( '-' )
            // InternalKPIFormulaDSL.g:6731:2: '-'
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
    // InternalKPIFormulaDSL.g:6740:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6744:1: ( rule__Primary__Group_2__2__Impl )
            // InternalKPIFormulaDSL.g:6745:2: rule__Primary__Group_2__2__Impl
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
    // InternalKPIFormulaDSL.g:6751:1: rule__Primary__Group_2__2__Impl : ( ( rule__Primary__ExpressionAssignment_2_2 ) ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6755:1: ( ( ( rule__Primary__ExpressionAssignment_2_2 ) ) )
            // InternalKPIFormulaDSL.g:6756:1: ( ( rule__Primary__ExpressionAssignment_2_2 ) )
            {
            // InternalKPIFormulaDSL.g:6756:1: ( ( rule__Primary__ExpressionAssignment_2_2 ) )
            // InternalKPIFormulaDSL.g:6757:2: ( rule__Primary__ExpressionAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionAssignment_2_2()); 
            }
            // InternalKPIFormulaDSL.g:6758:2: ( rule__Primary__ExpressionAssignment_2_2 )
            // InternalKPIFormulaDSL.g:6758:3: rule__Primary__ExpressionAssignment_2_2
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


    // $ANTLR start "rule__Atomic__Group_0__0"
    // InternalKPIFormulaDSL.g:6767:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6771:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalKPIFormulaDSL.g:6772:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_68);
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
    // InternalKPIFormulaDSL.g:6779:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6783:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:6784:1: ( () )
            {
            // InternalKPIFormulaDSL.g:6784:1: ( () )
            // InternalKPIFormulaDSL.g:6785:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getAccumulatorAction_0_0()); 
            }
            // InternalKPIFormulaDSL.g:6786:2: ()
            // InternalKPIFormulaDSL.g:6786:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getAccumulatorAction_0_0()); 
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
    // InternalKPIFormulaDSL.g:6794:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6798:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalKPIFormulaDSL.g:6799:2: rule__Atomic__Group_0__1__Impl
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
    // InternalKPIFormulaDSL.g:6805:1: rule__Atomic__Group_0__1__Impl : ( 'accumulator' ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6809:1: ( ( 'accumulator' ) )
            // InternalKPIFormulaDSL.g:6810:1: ( 'accumulator' )
            {
            // InternalKPIFormulaDSL.g:6810:1: ( 'accumulator' )
            // InternalKPIFormulaDSL.g:6811:2: 'accumulator'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getAccumulatorKeyword_0_1()); 
            }
            match(input,79,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getAccumulatorKeyword_0_1()); 
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
    // InternalKPIFormulaDSL.g:6821:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6825:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalKPIFormulaDSL.g:6826:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalKPIFormulaDSL.g:6833:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6837:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:6838:1: ( () )
            {
            // InternalKPIFormulaDSL.g:6838:1: ( () )
            // InternalKPIFormulaDSL.g:6839:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getIntConstantAction_1_0()); 
            }
            // InternalKPIFormulaDSL.g:6840:2: ()
            // InternalKPIFormulaDSL.g:6840:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getIntConstantAction_1_0()); 
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
    // InternalKPIFormulaDSL.g:6848:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6852:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalKPIFormulaDSL.g:6853:2: rule__Atomic__Group_1__1__Impl
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
    // InternalKPIFormulaDSL.g:6859:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6863:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // InternalKPIFormulaDSL.g:6864:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // InternalKPIFormulaDSL.g:6864:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // InternalKPIFormulaDSL.g:6865:2: ( rule__Atomic__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            }
            // InternalKPIFormulaDSL.g:6866:2: ( rule__Atomic__ValueAssignment_1_1 )
            // InternalKPIFormulaDSL.g:6866:3: rule__Atomic__ValueAssignment_1_1
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
    // InternalKPIFormulaDSL.g:6875:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6879:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalKPIFormulaDSL.g:6880:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_69);
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
    // InternalKPIFormulaDSL.g:6887:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6891:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:6892:1: ( () )
            {
            // InternalKPIFormulaDSL.g:6892:1: ( () )
            // InternalKPIFormulaDSL.g:6893:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getRealConstantAction_2_0()); 
            }
            // InternalKPIFormulaDSL.g:6894:2: ()
            // InternalKPIFormulaDSL.g:6894:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getRealConstantAction_2_0()); 
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
    // InternalKPIFormulaDSL.g:6902:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6906:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalKPIFormulaDSL.g:6907:2: rule__Atomic__Group_2__1__Impl
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
    // InternalKPIFormulaDSL.g:6913:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6917:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalKPIFormulaDSL.g:6918:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalKPIFormulaDSL.g:6918:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalKPIFormulaDSL.g:6919:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            }
            // InternalKPIFormulaDSL.g:6920:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalKPIFormulaDSL.g:6920:3: rule__Atomic__ValueAssignment_2_1
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
    // InternalKPIFormulaDSL.g:6929:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6933:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // InternalKPIFormulaDSL.g:6934:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_70);
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
    // InternalKPIFormulaDSL.g:6941:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6945:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:6946:1: ( () )
            {
            // InternalKPIFormulaDSL.g:6946:1: ( () )
            // InternalKPIFormulaDSL.g:6947:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getTextConstantAction_3_0()); 
            }
            // InternalKPIFormulaDSL.g:6948:2: ()
            // InternalKPIFormulaDSL.g:6948:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getTextConstantAction_3_0()); 
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
    // InternalKPIFormulaDSL.g:6956:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6960:1: ( rule__Atomic__Group_3__1__Impl )
            // InternalKPIFormulaDSL.g:6961:2: rule__Atomic__Group_3__1__Impl
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
    // InternalKPIFormulaDSL.g:6967:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__ValueAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6971:1: ( ( ( rule__Atomic__ValueAssignment_3_1 ) ) )
            // InternalKPIFormulaDSL.g:6972:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            {
            // InternalKPIFormulaDSL.g:6972:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            // InternalKPIFormulaDSL.g:6973:2: ( rule__Atomic__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 
            }
            // InternalKPIFormulaDSL.g:6974:2: ( rule__Atomic__ValueAssignment_3_1 )
            // InternalKPIFormulaDSL.g:6974:3: rule__Atomic__ValueAssignment_3_1
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
    // InternalKPIFormulaDSL.g:6983:1: rule__Atomic__Group_4__0 : rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 ;
    public final void rule__Atomic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6987:1: ( rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 )
            // InternalKPIFormulaDSL.g:6988:2: rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1
            {
            pushFollow(FOLLOW_71);
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
    // InternalKPIFormulaDSL.g:6995:1: rule__Atomic__Group_4__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6999:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:7000:1: ( () )
            {
            // InternalKPIFormulaDSL.g:7000:1: ( () )
            // InternalKPIFormulaDSL.g:7001:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getBoolConstantAction_4_0()); 
            }
            // InternalKPIFormulaDSL.g:7002:2: ()
            // InternalKPIFormulaDSL.g:7002:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getBoolConstantAction_4_0()); 
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
    // InternalKPIFormulaDSL.g:7010:1: rule__Atomic__Group_4__1 : rule__Atomic__Group_4__1__Impl ;
    public final void rule__Atomic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7014:1: ( rule__Atomic__Group_4__1__Impl )
            // InternalKPIFormulaDSL.g:7015:2: rule__Atomic__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_4__1__Impl();

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
    // InternalKPIFormulaDSL.g:7021:1: rule__Atomic__Group_4__1__Impl : ( ( rule__Atomic__ValueAssignment_4_1 ) ) ;
    public final void rule__Atomic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7025:1: ( ( ( rule__Atomic__ValueAssignment_4_1 ) ) )
            // InternalKPIFormulaDSL.g:7026:1: ( ( rule__Atomic__ValueAssignment_4_1 ) )
            {
            // InternalKPIFormulaDSL.g:7026:1: ( ( rule__Atomic__ValueAssignment_4_1 ) )
            // InternalKPIFormulaDSL.g:7027:2: ( rule__Atomic__ValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_4_1()); 
            }
            // InternalKPIFormulaDSL.g:7028:2: ( rule__Atomic__ValueAssignment_4_1 )
            // InternalKPIFormulaDSL.g:7028:3: rule__Atomic__ValueAssignment_4_1
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


    // $ANTLR start "rule__Atomic__Group_5__0"
    // InternalKPIFormulaDSL.g:7037:1: rule__Atomic__Group_5__0 : rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1 ;
    public final void rule__Atomic__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7041:1: ( rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1 )
            // InternalKPIFormulaDSL.g:7042:2: rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1
            {
            pushFollow(FOLLOW_69);
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
    // InternalKPIFormulaDSL.g:7049:1: rule__Atomic__Group_5__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7053:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:7054:1: ( () )
            {
            // InternalKPIFormulaDSL.g:7054:1: ( () )
            // InternalKPIFormulaDSL.g:7055:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getUnitConstantAction_5_0()); 
            }
            // InternalKPIFormulaDSL.g:7056:2: ()
            // InternalKPIFormulaDSL.g:7056:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getUnitConstantAction_5_0()); 
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
    // InternalKPIFormulaDSL.g:7064:1: rule__Atomic__Group_5__1 : rule__Atomic__Group_5__1__Impl rule__Atomic__Group_5__2 ;
    public final void rule__Atomic__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7068:1: ( rule__Atomic__Group_5__1__Impl rule__Atomic__Group_5__2 )
            // InternalKPIFormulaDSL.g:7069:2: rule__Atomic__Group_5__1__Impl rule__Atomic__Group_5__2
            {
            pushFollow(FOLLOW_8);
            rule__Atomic__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_5__2();

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
    // InternalKPIFormulaDSL.g:7076:1: rule__Atomic__Group_5__1__Impl : ( ( rule__Atomic__ValueAssignment_5_1 ) ) ;
    public final void rule__Atomic__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7080:1: ( ( ( rule__Atomic__ValueAssignment_5_1 ) ) )
            // InternalKPIFormulaDSL.g:7081:1: ( ( rule__Atomic__ValueAssignment_5_1 ) )
            {
            // InternalKPIFormulaDSL.g:7081:1: ( ( rule__Atomic__ValueAssignment_5_1 ) )
            // InternalKPIFormulaDSL.g:7082:2: ( rule__Atomic__ValueAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_5_1()); 
            }
            // InternalKPIFormulaDSL.g:7083:2: ( rule__Atomic__ValueAssignment_5_1 )
            // InternalKPIFormulaDSL.g:7083:3: rule__Atomic__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueAssignment_5_1()); 
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


    // $ANTLR start "rule__Atomic__Group_5__2"
    // InternalKPIFormulaDSL.g:7091:1: rule__Atomic__Group_5__2 : rule__Atomic__Group_5__2__Impl ;
    public final void rule__Atomic__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7095:1: ( rule__Atomic__Group_5__2__Impl )
            // InternalKPIFormulaDSL.g:7096:2: rule__Atomic__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_5__2__Impl();

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
    // $ANTLR end "rule__Atomic__Group_5__2"


    // $ANTLR start "rule__Atomic__Group_5__2__Impl"
    // InternalKPIFormulaDSL.g:7102:1: rule__Atomic__Group_5__2__Impl : ( ( rule__Atomic__UnitAssignment_5_2 ) ) ;
    public final void rule__Atomic__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7106:1: ( ( ( rule__Atomic__UnitAssignment_5_2 ) ) )
            // InternalKPIFormulaDSL.g:7107:1: ( ( rule__Atomic__UnitAssignment_5_2 ) )
            {
            // InternalKPIFormulaDSL.g:7107:1: ( ( rule__Atomic__UnitAssignment_5_2 ) )
            // InternalKPIFormulaDSL.g:7108:2: ( rule__Atomic__UnitAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getUnitAssignment_5_2()); 
            }
            // InternalKPIFormulaDSL.g:7109:2: ( rule__Atomic__UnitAssignment_5_2 )
            // InternalKPIFormulaDSL.g:7109:3: rule__Atomic__UnitAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__UnitAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getUnitAssignment_5_2()); 
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
    // $ANTLR end "rule__Atomic__Group_5__2__Impl"


    // $ANTLR start "rule__Atomic__Group_6__0"
    // InternalKPIFormulaDSL.g:7118:1: rule__Atomic__Group_6__0 : rule__Atomic__Group_6__0__Impl rule__Atomic__Group_6__1 ;
    public final void rule__Atomic__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7122:1: ( rule__Atomic__Group_6__0__Impl rule__Atomic__Group_6__1 )
            // InternalKPIFormulaDSL.g:7123:2: rule__Atomic__Group_6__0__Impl rule__Atomic__Group_6__1
            {
            pushFollow(FOLLOW_72);
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
    // InternalKPIFormulaDSL.g:7130:1: rule__Atomic__Group_6__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7134:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:7135:1: ( () )
            {
            // InternalKPIFormulaDSL.g:7135:1: ( () )
            // InternalKPIFormulaDSL.g:7136:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getEnumLiteralRefAction_6_0()); 
            }
            // InternalKPIFormulaDSL.g:7137:2: ()
            // InternalKPIFormulaDSL.g:7137:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getEnumLiteralRefAction_6_0()); 
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
    // InternalKPIFormulaDSL.g:7145:1: rule__Atomic__Group_6__1 : rule__Atomic__Group_6__1__Impl ;
    public final void rule__Atomic__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7149:1: ( rule__Atomic__Group_6__1__Impl )
            // InternalKPIFormulaDSL.g:7150:2: rule__Atomic__Group_6__1__Impl
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
    // InternalKPIFormulaDSL.g:7156:1: rule__Atomic__Group_6__1__Impl : ( ( rule__Atomic__LiteralAssignment_6_1 ) ) ;
    public final void rule__Atomic__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7160:1: ( ( ( rule__Atomic__LiteralAssignment_6_1 ) ) )
            // InternalKPIFormulaDSL.g:7161:1: ( ( rule__Atomic__LiteralAssignment_6_1 ) )
            {
            // InternalKPIFormulaDSL.g:7161:1: ( ( rule__Atomic__LiteralAssignment_6_1 ) )
            // InternalKPIFormulaDSL.g:7162:2: ( rule__Atomic__LiteralAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getLiteralAssignment_6_1()); 
            }
            // InternalKPIFormulaDSL.g:7163:2: ( rule__Atomic__LiteralAssignment_6_1 )
            // InternalKPIFormulaDSL.g:7163:3: rule__Atomic__LiteralAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__LiteralAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getLiteralAssignment_6_1()); 
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


    // $ANTLR start "rule__Atomic__Group_7__0"
    // InternalKPIFormulaDSL.g:7172:1: rule__Atomic__Group_7__0 : rule__Atomic__Group_7__0__Impl rule__Atomic__Group_7__1 ;
    public final void rule__Atomic__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7176:1: ( rule__Atomic__Group_7__0__Impl rule__Atomic__Group_7__1 )
            // InternalKPIFormulaDSL.g:7177:2: rule__Atomic__Group_7__0__Impl rule__Atomic__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__Atomic__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_7__1();

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
    // $ANTLR end "rule__Atomic__Group_7__0"


    // $ANTLR start "rule__Atomic__Group_7__0__Impl"
    // InternalKPIFormulaDSL.g:7184:1: rule__Atomic__Group_7__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7188:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:7189:1: ( () )
            {
            // InternalKPIFormulaDSL.g:7189:1: ( () )
            // InternalKPIFormulaDSL.g:7190:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getComputableRefAction_7_0()); 
            }
            // InternalKPIFormulaDSL.g:7191:2: ()
            // InternalKPIFormulaDSL.g:7191:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getComputableRefAction_7_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_7__0__Impl"


    // $ANTLR start "rule__Atomic__Group_7__1"
    // InternalKPIFormulaDSL.g:7199:1: rule__Atomic__Group_7__1 : rule__Atomic__Group_7__1__Impl ;
    public final void rule__Atomic__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7203:1: ( rule__Atomic__Group_7__1__Impl )
            // InternalKPIFormulaDSL.g:7204:2: rule__Atomic__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_7__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_7__1"


    // $ANTLR start "rule__Atomic__Group_7__1__Impl"
    // InternalKPIFormulaDSL.g:7210:1: rule__Atomic__Group_7__1__Impl : ( ( rule__Atomic__ComputableAssignment_7_1 ) ) ;
    public final void rule__Atomic__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7214:1: ( ( ( rule__Atomic__ComputableAssignment_7_1 ) ) )
            // InternalKPIFormulaDSL.g:7215:1: ( ( rule__Atomic__ComputableAssignment_7_1 ) )
            {
            // InternalKPIFormulaDSL.g:7215:1: ( ( rule__Atomic__ComputableAssignment_7_1 ) )
            // InternalKPIFormulaDSL.g:7216:2: ( rule__Atomic__ComputableAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getComputableAssignment_7_1()); 
            }
            // InternalKPIFormulaDSL.g:7217:2: ( rule__Atomic__ComputableAssignment_7_1 )
            // InternalKPIFormulaDSL.g:7217:3: rule__Atomic__ComputableAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ComputableAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getComputableAssignment_7_1()); 
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
    // $ANTLR end "rule__Atomic__Group_7__1__Impl"


    // $ANTLR start "rule__KPIFormulaDSL__DeclarationsAssignment_0"
    // InternalKPIFormulaDSL.g:7226:1: rule__KPIFormulaDSL__DeclarationsAssignment_0 : ( ruleDeclaration ) ;
    public final void rule__KPIFormulaDSL__DeclarationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7230:1: ( ( ruleDeclaration ) )
            // InternalKPIFormulaDSL.g:7231:2: ( ruleDeclaration )
            {
            // InternalKPIFormulaDSL.g:7231:2: ( ruleDeclaration )
            // InternalKPIFormulaDSL.g:7232:3: ruleDeclaration
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
    // InternalKPIFormulaDSL.g:7241:1: rule__KPIFormulaDSL__ComputationsAssignment_1 : ( ruleComputation ) ;
    public final void rule__KPIFormulaDSL__ComputationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7245:1: ( ( ruleComputation ) )
            // InternalKPIFormulaDSL.g:7246:2: ( ruleComputation )
            {
            // InternalKPIFormulaDSL.g:7246:2: ( ruleComputation )
            // InternalKPIFormulaDSL.g:7247:3: ruleComputation
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
    // InternalKPIFormulaDSL.g:7256:1: rule__Declaration__DeclaredAssignment : ( ruleDeclarable ) ;
    public final void rule__Declaration__DeclaredAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7260:1: ( ( ruleDeclarable ) )
            // InternalKPIFormulaDSL.g:7261:2: ( ruleDeclarable )
            {
            // InternalKPIFormulaDSL.g:7261:2: ( ruleDeclarable )
            // InternalKPIFormulaDSL.g:7262:3: ruleDeclarable
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
    // InternalKPIFormulaDSL.g:7271:1: rule__Computation__ComputedAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Computation__ComputedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7275:1: ( ( ( RULE_ID ) ) )
            // InternalKPIFormulaDSL.g:7276:2: ( ( RULE_ID ) )
            {
            // InternalKPIFormulaDSL.g:7276:2: ( ( RULE_ID ) )
            // InternalKPIFormulaDSL.g:7277:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComputationAccess().getComputedComputableCrossReference_0_0()); 
            }
            // InternalKPIFormulaDSL.g:7278:3: ( RULE_ID )
            // InternalKPIFormulaDSL.g:7279:4: RULE_ID
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
    // InternalKPIFormulaDSL.g:7290:1: rule__Computation__FormulaAssignment_2 : ( ruleTopLevelExpression ) ;
    public final void rule__Computation__FormulaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7294:1: ( ( ruleTopLevelExpression ) )
            // InternalKPIFormulaDSL.g:7295:2: ( ruleTopLevelExpression )
            {
            // InternalKPIFormulaDSL.g:7295:2: ( ruleTopLevelExpression )
            // InternalKPIFormulaDSL.g:7296:3: ruleTopLevelExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComputationAccess().getFormulaTopLevelExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTopLevelExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComputationAccess().getFormulaTopLevelExpressionParserRuleCall_2_0()); 
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
    // InternalKPIFormulaDSL.g:7305:1: rule__Metric__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Metric__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7309:1: ( ( RULE_ID ) )
            // InternalKPIFormulaDSL.g:7310:2: ( RULE_ID )
            {
            // InternalKPIFormulaDSL.g:7310:2: ( RULE_ID )
            // InternalKPIFormulaDSL.g:7311:3: RULE_ID
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
    // InternalKPIFormulaDSL.g:7320:1: rule__Metric__TypeAssignment_3 : ( ruleValueType ) ;
    public final void rule__Metric__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7324:1: ( ( ruleValueType ) )
            // InternalKPIFormulaDSL.g:7325:2: ( ruleValueType )
            {
            // InternalKPIFormulaDSL.g:7325:2: ( ruleValueType )
            // InternalKPIFormulaDSL.g:7326:3: ruleValueType
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
    // InternalKPIFormulaDSL.g:7335:1: rule__KPI__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KPI__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7339:1: ( ( RULE_ID ) )
            // InternalKPIFormulaDSL.g:7340:2: ( RULE_ID )
            {
            // InternalKPIFormulaDSL.g:7340:2: ( RULE_ID )
            // InternalKPIFormulaDSL.g:7341:3: RULE_ID
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
    // InternalKPIFormulaDSL.g:7350:1: rule__KPI__TypeAssignment_4 : ( ruleValueType ) ;
    public final void rule__KPI__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7354:1: ( ( ruleValueType ) )
            // InternalKPIFormulaDSL.g:7355:2: ( ruleValueType )
            {
            // InternalKPIFormulaDSL.g:7355:2: ( ruleValueType )
            // InternalKPIFormulaDSL.g:7356:3: ruleValueType
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
    // InternalKPIFormulaDSL.g:7365:1: rule__EnumerationValue__LiteralsAssignment_1 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationValue__LiteralsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7369:1: ( ( ruleEnumerationLiteral ) )
            // InternalKPIFormulaDSL.g:7370:2: ( ruleEnumerationLiteral )
            {
            // InternalKPIFormulaDSL.g:7370:2: ( ruleEnumerationLiteral )
            // InternalKPIFormulaDSL.g:7371:3: ruleEnumerationLiteral
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
    // InternalKPIFormulaDSL.g:7380:1: rule__EnumerationLiteral__NameAssignment : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7384:1: ( ( RULE_ID ) )
            // InternalKPIFormulaDSL.g:7385:2: ( RULE_ID )
            {
            // InternalKPIFormulaDSL.g:7385:2: ( RULE_ID )
            // InternalKPIFormulaDSL.g:7386:3: RULE_ID
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
    // InternalKPIFormulaDSL.g:7395:1: rule__UnitValue__UnitAssignment : ( ruleValueUnit ) ;
    public final void rule__UnitValue__UnitAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7399:1: ( ( ruleValueUnit ) )
            // InternalKPIFormulaDSL.g:7400:2: ( ruleValueUnit )
            {
            // InternalKPIFormulaDSL.g:7400:2: ( ruleValueUnit )
            // InternalKPIFormulaDSL.g:7401:3: ruleValueUnit
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
    // InternalKPIFormulaDSL.g:7410:1: rule__AggregationValue__OperationAssignment_1 : ( ruleOperation ) ;
    public final void rule__AggregationValue__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7414:1: ( ( ruleOperation ) )
            // InternalKPIFormulaDSL.g:7415:2: ( ruleOperation )
            {
            // InternalKPIFormulaDSL.g:7415:2: ( ruleOperation )
            // InternalKPIFormulaDSL.g:7416:3: ruleOperation
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
    // InternalKPIFormulaDSL.g:7425:1: rule__AggregationValue__WindowAssignment_3 : ( RULE_INT ) ;
    public final void rule__AggregationValue__WindowAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7429:1: ( ( RULE_INT ) )
            // InternalKPIFormulaDSL.g:7430:2: ( RULE_INT )
            {
            // InternalKPIFormulaDSL.g:7430:2: ( RULE_INT )
            // InternalKPIFormulaDSL.g:7431:3: RULE_INT
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
    // InternalKPIFormulaDSL.g:7440:1: rule__AggregationValue__WindowUnitAssignment_4 : ( ruleWindowUnit ) ;
    public final void rule__AggregationValue__WindowUnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7444:1: ( ( ruleWindowUnit ) )
            // InternalKPIFormulaDSL.g:7445:2: ( ruleWindowUnit )
            {
            // InternalKPIFormulaDSL.g:7445:2: ( ruleWindowUnit )
            // InternalKPIFormulaDSL.g:7446:3: ruleWindowUnit
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
    // InternalKPIFormulaDSL.g:7455:1: rule__DriftValue__OperationAssignment_2 : ( ruleOperation ) ;
    public final void rule__DriftValue__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7459:1: ( ( ruleOperation ) )
            // InternalKPIFormulaDSL.g:7460:2: ( ruleOperation )
            {
            // InternalKPIFormulaDSL.g:7460:2: ( ruleOperation )
            // InternalKPIFormulaDSL.g:7461:3: ruleOperation
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
    // InternalKPIFormulaDSL.g:7470:1: rule__DriftValue__WindowAssignment_4 : ( RULE_INT ) ;
    public final void rule__DriftValue__WindowAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7474:1: ( ( RULE_INT ) )
            // InternalKPIFormulaDSL.g:7475:2: ( RULE_INT )
            {
            // InternalKPIFormulaDSL.g:7475:2: ( RULE_INT )
            // InternalKPIFormulaDSL.g:7476:3: RULE_INT
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
    // InternalKPIFormulaDSL.g:7485:1: rule__DriftValue__WindowUnitAssignment_5 : ( ruleWindowUnit ) ;
    public final void rule__DriftValue__WindowUnitAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7489:1: ( ( ruleWindowUnit ) )
            // InternalKPIFormulaDSL.g:7490:2: ( ruleWindowUnit )
            {
            // InternalKPIFormulaDSL.g:7490:2: ( ruleWindowUnit )
            // InternalKPIFormulaDSL.g:7491:3: ruleWindowUnit
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


    // $ANTLR start "rule__Condition__ConditionsAssignment_2_0"
    // InternalKPIFormulaDSL.g:7500:1: rule__Condition__ConditionsAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__Condition__ConditionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7504:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7505:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7505:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7506:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getConditionsExpressionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getConditionsExpressionParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__Condition__ConditionsAssignment_2_0"


    // $ANTLR start "rule__Condition__ResultsAssignment_2_2"
    // InternalKPIFormulaDSL.g:7515:1: rule__Condition__ResultsAssignment_2_2 : ( ruleExpression ) ;
    public final void rule__Condition__ResultsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7519:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7520:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7520:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7521:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getResultsExpressionParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getResultsExpressionParserRuleCall_2_2_0()); 
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
    // $ANTLR end "rule__Condition__ResultsAssignment_2_2"


    // $ANTLR start "rule__Condition__ResultsAssignment_5"
    // InternalKPIFormulaDSL.g:7530:1: rule__Condition__ResultsAssignment_5 : ( ruleExpression ) ;
    public final void rule__Condition__ResultsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7534:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7535:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7535:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7536:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getResultsExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getResultsExpressionParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Condition__ResultsAssignment_5"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalKPIFormulaDSL.g:7545:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7549:1: ( ( ruleAnd ) )
            // InternalKPIFormulaDSL.g:7550:2: ( ruleAnd )
            {
            // InternalKPIFormulaDSL.g:7550:2: ( ruleAnd )
            // InternalKPIFormulaDSL.g:7551:3: ruleAnd
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
    // InternalKPIFormulaDSL.g:7560:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7564:1: ( ( ruleEquality ) )
            // InternalKPIFormulaDSL.g:7565:2: ( ruleEquality )
            {
            // InternalKPIFormulaDSL.g:7565:2: ( ruleEquality )
            // InternalKPIFormulaDSL.g:7566:3: ruleEquality
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
    // InternalKPIFormulaDSL.g:7575:1: rule__Equality__RightAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7579:1: ( ( ruleComparison ) )
            // InternalKPIFormulaDSL.g:7580:2: ( ruleComparison )
            {
            // InternalKPIFormulaDSL.g:7580:2: ( ruleComparison )
            // InternalKPIFormulaDSL.g:7581:3: ruleComparison
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
    // InternalKPIFormulaDSL.g:7590:1: rule__Comparison__RightAssignment_1_1 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7594:1: ( ( rulePlusOrMinus ) )
            // InternalKPIFormulaDSL.g:7595:2: ( rulePlusOrMinus )
            {
            // InternalKPIFormulaDSL.g:7595:2: ( rulePlusOrMinus )
            // InternalKPIFormulaDSL.g:7596:3: rulePlusOrMinus
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
    // InternalKPIFormulaDSL.g:7605:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7609:1: ( ( ruleMulOrDiv ) )
            // InternalKPIFormulaDSL.g:7610:2: ( ruleMulOrDiv )
            {
            // InternalKPIFormulaDSL.g:7610:2: ( ruleMulOrDiv )
            // InternalKPIFormulaDSL.g:7611:3: ruleMulOrDiv
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
    // InternalKPIFormulaDSL.g:7620:1: rule__MulOrDiv__RightAssignment_1_1 : ( ruleOperator ) ;
    public final void rule__MulOrDiv__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7624:1: ( ( ruleOperator ) )
            // InternalKPIFormulaDSL.g:7625:2: ( ruleOperator )
            {
            // InternalKPIFormulaDSL.g:7625:2: ( ruleOperator )
            // InternalKPIFormulaDSL.g:7626:3: ruleOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getRightOperatorParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getRightOperatorParserRuleCall_1_1_0()); 
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


    // $ANTLR start "rule__Operator__ExpressionAssignment_0_2"
    // InternalKPIFormulaDSL.g:7635:1: rule__Operator__ExpressionAssignment_0_2 : ( ruleExpression ) ;
    public final void rule__Operator__ExpressionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7639:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7640:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7640:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7641:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getExpressionExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getExpressionExpressionParserRuleCall_0_2_0()); 
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
    // $ANTLR end "rule__Operator__ExpressionAssignment_0_2"


    // $ANTLR start "rule__Operator__ElementsAssignment_1_2"
    // InternalKPIFormulaDSL.g:7650:1: rule__Operator__ElementsAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Operator__ElementsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7654:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7655:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7655:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7656:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getElementsExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getElementsExpressionParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Operator__ElementsAssignment_1_2"


    // $ANTLR start "rule__Operator__ElementsAssignment_1_3_1"
    // InternalKPIFormulaDSL.g:7665:1: rule__Operator__ElementsAssignment_1_3_1 : ( ruleExpression ) ;
    public final void rule__Operator__ElementsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7669:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7670:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7670:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7671:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getElementsExpressionParserRuleCall_1_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getElementsExpressionParserRuleCall_1_3_1_0()); 
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
    // $ANTLR end "rule__Operator__ElementsAssignment_1_3_1"


    // $ANTLR start "rule__Operator__ListAssignment_2_3"
    // InternalKPIFormulaDSL.g:7680:1: rule__Operator__ListAssignment_2_3 : ( ruleExpression ) ;
    public final void rule__Operator__ListAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7684:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7685:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7685:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7686:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListExpressionParserRuleCall_2_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListExpressionParserRuleCall_2_3_0()); 
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
    // $ANTLR end "rule__Operator__ListAssignment_2_3"


    // $ANTLR start "rule__Operator__ListAssignment_3_3"
    // InternalKPIFormulaDSL.g:7695:1: rule__Operator__ListAssignment_3_3 : ( ruleExpression ) ;
    public final void rule__Operator__ListAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7699:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7700:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7700:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7701:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListExpressionParserRuleCall_3_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListExpressionParserRuleCall_3_3_0()); 
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
    // $ANTLR end "rule__Operator__ListAssignment_3_3"


    // $ANTLR start "rule__Operator__WeightsAssignment_3_5"
    // InternalKPIFormulaDSL.g:7710:1: rule__Operator__WeightsAssignment_3_5 : ( ruleExpression ) ;
    public final void rule__Operator__WeightsAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7714:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7715:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7715:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7716:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getWeightsExpressionParserRuleCall_3_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getWeightsExpressionParserRuleCall_3_5_0()); 
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
    // $ANTLR end "rule__Operator__WeightsAssignment_3_5"


    // $ANTLR start "rule__Operator__ListAssignment_4_3"
    // InternalKPIFormulaDSL.g:7725:1: rule__Operator__ListAssignment_4_3 : ( ruleExpression ) ;
    public final void rule__Operator__ListAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7729:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7730:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7730:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7731:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListExpressionParserRuleCall_4_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListExpressionParserRuleCall_4_3_0()); 
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
    // $ANTLR end "rule__Operator__ListAssignment_4_3"


    // $ANTLR start "rule__Operator__ListAssignment_5_3"
    // InternalKPIFormulaDSL.g:7740:1: rule__Operator__ListAssignment_5_3 : ( ruleExpression ) ;
    public final void rule__Operator__ListAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7744:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7745:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7745:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7746:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListExpressionParserRuleCall_5_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListExpressionParserRuleCall_5_3_0()); 
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
    // $ANTLR end "rule__Operator__ListAssignment_5_3"


    // $ANTLR start "rule__Operator__ListAssignment_6_3"
    // InternalKPIFormulaDSL.g:7755:1: rule__Operator__ListAssignment_6_3 : ( ruleExpression ) ;
    public final void rule__Operator__ListAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7759:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7760:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7760:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7761:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListExpressionParserRuleCall_6_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListExpressionParserRuleCall_6_3_0()); 
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
    // $ANTLR end "rule__Operator__ListAssignment_6_3"


    // $ANTLR start "rule__Operator__ExpressionAssignment_7_3"
    // InternalKPIFormulaDSL.g:7770:1: rule__Operator__ExpressionAssignment_7_3 : ( ruleExpression ) ;
    public final void rule__Operator__ExpressionAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7774:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7775:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7775:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7776:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getExpressionExpressionParserRuleCall_7_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getExpressionExpressionParserRuleCall_7_3_0()); 
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
    // $ANTLR end "rule__Operator__ExpressionAssignment_7_3"


    // $ANTLR start "rule__Operator__ThresholdAssignment_7_5"
    // InternalKPIFormulaDSL.g:7785:1: rule__Operator__ThresholdAssignment_7_5 : ( ruleExpression ) ;
    public final void rule__Operator__ThresholdAssignment_7_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7789:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7790:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7790:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7791:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getThresholdExpressionParserRuleCall_7_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getThresholdExpressionParserRuleCall_7_5_0()); 
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
    // $ANTLR end "rule__Operator__ThresholdAssignment_7_5"


    // $ANTLR start "rule__Operator__ExpressionAssignment_8_2"
    // InternalKPIFormulaDSL.g:7800:1: rule__Operator__ExpressionAssignment_8_2 : ( ruleTopLevelExpression ) ;
    public final void rule__Operator__ExpressionAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7804:1: ( ( ruleTopLevelExpression ) )
            // InternalKPIFormulaDSL.g:7805:2: ( ruleTopLevelExpression )
            {
            // InternalKPIFormulaDSL.g:7805:2: ( ruleTopLevelExpression )
            // InternalKPIFormulaDSL.g:7806:3: ruleTopLevelExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getExpressionTopLevelExpressionParserRuleCall_8_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTopLevelExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getExpressionTopLevelExpressionParserRuleCall_8_2_0()); 
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
    // $ANTLR end "rule__Operator__ExpressionAssignment_8_2"


    // $ANTLR start "rule__Operator__IteratorsAssignment_8_4"
    // InternalKPIFormulaDSL.g:7815:1: rule__Operator__IteratorsAssignment_8_4 : ( ruleListIterator ) ;
    public final void rule__Operator__IteratorsAssignment_8_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7819:1: ( ( ruleListIterator ) )
            // InternalKPIFormulaDSL.g:7820:2: ( ruleListIterator )
            {
            // InternalKPIFormulaDSL.g:7820:2: ( ruleListIterator )
            // InternalKPIFormulaDSL.g:7821:3: ruleListIterator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_8_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_8_4_0()); 
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
    // $ANTLR end "rule__Operator__IteratorsAssignment_8_4"


    // $ANTLR start "rule__Operator__ListsAssignment_8_6"
    // InternalKPIFormulaDSL.g:7830:1: rule__Operator__ListsAssignment_8_6 : ( rulePrimary ) ;
    public final void rule__Operator__ListsAssignment_8_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7834:1: ( ( rulePrimary ) )
            // InternalKPIFormulaDSL.g:7835:2: ( rulePrimary )
            {
            // InternalKPIFormulaDSL.g:7835:2: ( rulePrimary )
            // InternalKPIFormulaDSL.g:7836:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_8_6_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_8_6_0()); 
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
    // $ANTLR end "rule__Operator__ListsAssignment_8_6"


    // $ANTLR start "rule__Operator__IteratorsAssignment_8_7_1"
    // InternalKPIFormulaDSL.g:7845:1: rule__Operator__IteratorsAssignment_8_7_1 : ( ruleListIterator ) ;
    public final void rule__Operator__IteratorsAssignment_8_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7849:1: ( ( ruleListIterator ) )
            // InternalKPIFormulaDSL.g:7850:2: ( ruleListIterator )
            {
            // InternalKPIFormulaDSL.g:7850:2: ( ruleListIterator )
            // InternalKPIFormulaDSL.g:7851:3: ruleListIterator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_8_7_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_8_7_1_0()); 
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
    // $ANTLR end "rule__Operator__IteratorsAssignment_8_7_1"


    // $ANTLR start "rule__Operator__ListsAssignment_8_7_3"
    // InternalKPIFormulaDSL.g:7860:1: rule__Operator__ListsAssignment_8_7_3 : ( rulePrimary ) ;
    public final void rule__Operator__ListsAssignment_8_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7864:1: ( ( rulePrimary ) )
            // InternalKPIFormulaDSL.g:7865:2: ( rulePrimary )
            {
            // InternalKPIFormulaDSL.g:7865:2: ( rulePrimary )
            // InternalKPIFormulaDSL.g:7866:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_8_7_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_8_7_3_0()); 
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
    // $ANTLR end "rule__Operator__ListsAssignment_8_7_3"


    // $ANTLR start "rule__Operator__ExpressionAssignment_9_2"
    // InternalKPIFormulaDSL.g:7875:1: rule__Operator__ExpressionAssignment_9_2 : ( ruleTopLevelExpression ) ;
    public final void rule__Operator__ExpressionAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7879:1: ( ( ruleTopLevelExpression ) )
            // InternalKPIFormulaDSL.g:7880:2: ( ruleTopLevelExpression )
            {
            // InternalKPIFormulaDSL.g:7880:2: ( ruleTopLevelExpression )
            // InternalKPIFormulaDSL.g:7881:3: ruleTopLevelExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getExpressionTopLevelExpressionParserRuleCall_9_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTopLevelExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getExpressionTopLevelExpressionParserRuleCall_9_2_0()); 
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
    // $ANTLR end "rule__Operator__ExpressionAssignment_9_2"


    // $ANTLR start "rule__Operator__AccumulatorAssignment_9_4"
    // InternalKPIFormulaDSL.g:7890:1: rule__Operator__AccumulatorAssignment_9_4 : ( rulePrimary ) ;
    public final void rule__Operator__AccumulatorAssignment_9_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7894:1: ( ( rulePrimary ) )
            // InternalKPIFormulaDSL.g:7895:2: ( rulePrimary )
            {
            // InternalKPIFormulaDSL.g:7895:2: ( rulePrimary )
            // InternalKPIFormulaDSL.g:7896:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getAccumulatorPrimaryParserRuleCall_9_4_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getAccumulatorPrimaryParserRuleCall_9_4_0()); 
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
    // $ANTLR end "rule__Operator__AccumulatorAssignment_9_4"


    // $ANTLR start "rule__Operator__IteratorsAssignment_9_6"
    // InternalKPIFormulaDSL.g:7905:1: rule__Operator__IteratorsAssignment_9_6 : ( ruleListIterator ) ;
    public final void rule__Operator__IteratorsAssignment_9_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7909:1: ( ( ruleListIterator ) )
            // InternalKPIFormulaDSL.g:7910:2: ( ruleListIterator )
            {
            // InternalKPIFormulaDSL.g:7910:2: ( ruleListIterator )
            // InternalKPIFormulaDSL.g:7911:3: ruleListIterator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_9_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_9_6_0()); 
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
    // $ANTLR end "rule__Operator__IteratorsAssignment_9_6"


    // $ANTLR start "rule__Operator__ListsAssignment_9_8"
    // InternalKPIFormulaDSL.g:7920:1: rule__Operator__ListsAssignment_9_8 : ( rulePrimary ) ;
    public final void rule__Operator__ListsAssignment_9_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7924:1: ( ( rulePrimary ) )
            // InternalKPIFormulaDSL.g:7925:2: ( rulePrimary )
            {
            // InternalKPIFormulaDSL.g:7925:2: ( rulePrimary )
            // InternalKPIFormulaDSL.g:7926:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_9_8_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_9_8_0()); 
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
    // $ANTLR end "rule__Operator__ListsAssignment_9_8"


    // $ANTLR start "rule__Operator__IteratorsAssignment_9_9_1"
    // InternalKPIFormulaDSL.g:7935:1: rule__Operator__IteratorsAssignment_9_9_1 : ( ruleListIterator ) ;
    public final void rule__Operator__IteratorsAssignment_9_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7939:1: ( ( ruleListIterator ) )
            // InternalKPIFormulaDSL.g:7940:2: ( ruleListIterator )
            {
            // InternalKPIFormulaDSL.g:7940:2: ( ruleListIterator )
            // InternalKPIFormulaDSL.g:7941:3: ruleListIterator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_9_9_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_9_9_1_0()); 
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
    // $ANTLR end "rule__Operator__IteratorsAssignment_9_9_1"


    // $ANTLR start "rule__Operator__ListsAssignment_9_9_3"
    // InternalKPIFormulaDSL.g:7950:1: rule__Operator__ListsAssignment_9_9_3 : ( rulePrimary ) ;
    public final void rule__Operator__ListsAssignment_9_9_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7954:1: ( ( rulePrimary ) )
            // InternalKPIFormulaDSL.g:7955:2: ( rulePrimary )
            {
            // InternalKPIFormulaDSL.g:7955:2: ( rulePrimary )
            // InternalKPIFormulaDSL.g:7956:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_9_9_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_9_9_3_0()); 
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
    // $ANTLR end "rule__Operator__ListsAssignment_9_9_3"


    // $ANTLR start "rule__Operator__ExpressionAssignment_10_2"
    // InternalKPIFormulaDSL.g:7965:1: rule__Operator__ExpressionAssignment_10_2 : ( ruleTopLevelExpression ) ;
    public final void rule__Operator__ExpressionAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7969:1: ( ( ruleTopLevelExpression ) )
            // InternalKPIFormulaDSL.g:7970:2: ( ruleTopLevelExpression )
            {
            // InternalKPIFormulaDSL.g:7970:2: ( ruleTopLevelExpression )
            // InternalKPIFormulaDSL.g:7971:3: ruleTopLevelExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getExpressionTopLevelExpressionParserRuleCall_10_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTopLevelExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getExpressionTopLevelExpressionParserRuleCall_10_2_0()); 
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
    // $ANTLR end "rule__Operator__ExpressionAssignment_10_2"


    // $ANTLR start "rule__Operator__IteratorsAssignment_10_4"
    // InternalKPIFormulaDSL.g:7980:1: rule__Operator__IteratorsAssignment_10_4 : ( ruleListIterator ) ;
    public final void rule__Operator__IteratorsAssignment_10_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7984:1: ( ( ruleListIterator ) )
            // InternalKPIFormulaDSL.g:7985:2: ( ruleListIterator )
            {
            // InternalKPIFormulaDSL.g:7985:2: ( ruleListIterator )
            // InternalKPIFormulaDSL.g:7986:3: ruleListIterator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_10_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_10_4_0()); 
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
    // $ANTLR end "rule__Operator__IteratorsAssignment_10_4"


    // $ANTLR start "rule__Operator__ListsAssignment_10_6"
    // InternalKPIFormulaDSL.g:7995:1: rule__Operator__ListsAssignment_10_6 : ( rulePrimary ) ;
    public final void rule__Operator__ListsAssignment_10_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7999:1: ( ( rulePrimary ) )
            // InternalKPIFormulaDSL.g:8000:2: ( rulePrimary )
            {
            // InternalKPIFormulaDSL.g:8000:2: ( rulePrimary )
            // InternalKPIFormulaDSL.g:8001:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_10_6_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_10_6_0()); 
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
    // $ANTLR end "rule__Operator__ListsAssignment_10_6"


    // $ANTLR start "rule__Operator__IteratorsAssignment_10_7_1"
    // InternalKPIFormulaDSL.g:8010:1: rule__Operator__IteratorsAssignment_10_7_1 : ( ruleListIterator ) ;
    public final void rule__Operator__IteratorsAssignment_10_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:8014:1: ( ( ruleListIterator ) )
            // InternalKPIFormulaDSL.g:8015:2: ( ruleListIterator )
            {
            // InternalKPIFormulaDSL.g:8015:2: ( ruleListIterator )
            // InternalKPIFormulaDSL.g:8016:3: ruleListIterator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_10_7_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_10_7_1_0()); 
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
    // $ANTLR end "rule__Operator__IteratorsAssignment_10_7_1"


    // $ANTLR start "rule__Operator__ListsAssignment_10_7_3"
    // InternalKPIFormulaDSL.g:8025:1: rule__Operator__ListsAssignment_10_7_3 : ( rulePrimary ) ;
    public final void rule__Operator__ListsAssignment_10_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:8029:1: ( ( rulePrimary ) )
            // InternalKPIFormulaDSL.g:8030:2: ( rulePrimary )
            {
            // InternalKPIFormulaDSL.g:8030:2: ( rulePrimary )
            // InternalKPIFormulaDSL.g:8031:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_10_7_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_10_7_3_0()); 
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
    // $ANTLR end "rule__Operator__ListsAssignment_10_7_3"


    // $ANTLR start "rule__Primary__ExpressionAssignment_1_2"
    // InternalKPIFormulaDSL.g:8040:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:8044:1: ( ( rulePrimary ) )
            // InternalKPIFormulaDSL.g:8045:2: ( rulePrimary )
            {
            // InternalKPIFormulaDSL.g:8045:2: ( rulePrimary )
            // InternalKPIFormulaDSL.g:8046:3: rulePrimary
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
    // InternalKPIFormulaDSL.g:8055:1: rule__Primary__ExpressionAssignment_2_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:8059:1: ( ( rulePrimary ) )
            // InternalKPIFormulaDSL.g:8060:2: ( rulePrimary )
            {
            // InternalKPIFormulaDSL.g:8060:2: ( rulePrimary )
            // InternalKPIFormulaDSL.g:8061:3: rulePrimary
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


    // $ANTLR start "rule__ListIterator__NameAssignment"
    // InternalKPIFormulaDSL.g:8070:1: rule__ListIterator__NameAssignment : ( RULE_ID ) ;
    public final void rule__ListIterator__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:8074:1: ( ( RULE_ID ) )
            // InternalKPIFormulaDSL.g:8075:2: ( RULE_ID )
            {
            // InternalKPIFormulaDSL.g:8075:2: ( RULE_ID )
            // InternalKPIFormulaDSL.g:8076:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListIteratorAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListIteratorAccess().getNameIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__ListIterator__NameAssignment"


    // $ANTLR start "rule__Atomic__ValueAssignment_1_1"
    // InternalKPIFormulaDSL.g:8085:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:8089:1: ( ( RULE_INT ) )
            // InternalKPIFormulaDSL.g:8090:2: ( RULE_INT )
            {
            // InternalKPIFormulaDSL.g:8090:2: ( RULE_INT )
            // InternalKPIFormulaDSL.g:8091:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
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
    // InternalKPIFormulaDSL.g:8100:1: rule__Atomic__ValueAssignment_2_1 : ( RULE_DOUBLE ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:8104:1: ( ( RULE_DOUBLE ) )
            // InternalKPIFormulaDSL.g:8105:2: ( RULE_DOUBLE )
            {
            // InternalKPIFormulaDSL.g:8105:2: ( RULE_DOUBLE )
            // InternalKPIFormulaDSL.g:8106:3: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueDOUBLETerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueDOUBLETerminalRuleCall_2_1_0()); 
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
    // InternalKPIFormulaDSL.g:8115:1: rule__Atomic__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:8119:1: ( ( RULE_STRING ) )
            // InternalKPIFormulaDSL.g:8120:2: ( RULE_STRING )
            {
            // InternalKPIFormulaDSL.g:8120:2: ( RULE_STRING )
            // InternalKPIFormulaDSL.g:8121:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
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
    // InternalKPIFormulaDSL.g:8130:1: rule__Atomic__ValueAssignment_4_1 : ( ( rule__Atomic__ValueAlternatives_4_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:8134:1: ( ( ( rule__Atomic__ValueAlternatives_4_1_0 ) ) )
            // InternalKPIFormulaDSL.g:8135:2: ( ( rule__Atomic__ValueAlternatives_4_1_0 ) )
            {
            // InternalKPIFormulaDSL.g:8135:2: ( ( rule__Atomic__ValueAlternatives_4_1_0 ) )
            // InternalKPIFormulaDSL.g:8136:3: ( rule__Atomic__ValueAlternatives_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAlternatives_4_1_0()); 
            }
            // InternalKPIFormulaDSL.g:8137:3: ( rule__Atomic__ValueAlternatives_4_1_0 )
            // InternalKPIFormulaDSL.g:8137:4: rule__Atomic__ValueAlternatives_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAlternatives_4_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueAlternatives_4_1_0()); 
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


    // $ANTLR start "rule__Atomic__ValueAssignment_5_1"
    // InternalKPIFormulaDSL.g:8145:1: rule__Atomic__ValueAssignment_5_1 : ( RULE_DOUBLE ) ;
    public final void rule__Atomic__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:8149:1: ( ( RULE_DOUBLE ) )
            // InternalKPIFormulaDSL.g:8150:2: ( RULE_DOUBLE )
            {
            // InternalKPIFormulaDSL.g:8150:2: ( RULE_DOUBLE )
            // InternalKPIFormulaDSL.g:8151:3: RULE_DOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueDOUBLETerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueDOUBLETerminalRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__Atomic__ValueAssignment_5_1"


    // $ANTLR start "rule__Atomic__UnitAssignment_5_2"
    // InternalKPIFormulaDSL.g:8160:1: rule__Atomic__UnitAssignment_5_2 : ( ruleValueUnit ) ;
    public final void rule__Atomic__UnitAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:8164:1: ( ( ruleValueUnit ) )
            // InternalKPIFormulaDSL.g:8165:2: ( ruleValueUnit )
            {
            // InternalKPIFormulaDSL.g:8165:2: ( ruleValueUnit )
            // InternalKPIFormulaDSL.g:8166:3: ruleValueUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getUnitValueUnitEnumRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValueUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getUnitValueUnitEnumRuleCall_5_2_0()); 
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
    // $ANTLR end "rule__Atomic__UnitAssignment_5_2"


    // $ANTLR start "rule__Atomic__LiteralAssignment_6_1"
    // InternalKPIFormulaDSL.g:8175:1: rule__Atomic__LiteralAssignment_6_1 : ( ( RULE_FQN ) ) ;
    public final void rule__Atomic__LiteralAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:8179:1: ( ( ( RULE_FQN ) ) )
            // InternalKPIFormulaDSL.g:8180:2: ( ( RULE_FQN ) )
            {
            // InternalKPIFormulaDSL.g:8180:2: ( ( RULE_FQN ) )
            // InternalKPIFormulaDSL.g:8181:3: ( RULE_FQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getLiteralEnumerationLiteralCrossReference_6_1_0()); 
            }
            // InternalKPIFormulaDSL.g:8182:3: ( RULE_FQN )
            // InternalKPIFormulaDSL.g:8183:4: RULE_FQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getLiteralEnumerationLiteralFQNTerminalRuleCall_6_1_0_1()); 
            }
            match(input,RULE_FQN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getLiteralEnumerationLiteralFQNTerminalRuleCall_6_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getLiteralEnumerationLiteralCrossReference_6_1_0()); 
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
    // $ANTLR end "rule__Atomic__LiteralAssignment_6_1"


    // $ANTLR start "rule__Atomic__ComputableAssignment_7_1"
    // InternalKPIFormulaDSL.g:8194:1: rule__Atomic__ComputableAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__ComputableAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:8198:1: ( ( ( RULE_ID ) ) )
            // InternalKPIFormulaDSL.g:8199:2: ( ( RULE_ID ) )
            {
            // InternalKPIFormulaDSL.g:8199:2: ( ( RULE_ID ) )
            // InternalKPIFormulaDSL.g:8200:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getComputableComputableCrossReference_7_1_0()); 
            }
            // InternalKPIFormulaDSL.g:8201:3: ( RULE_ID )
            // InternalKPIFormulaDSL.g:8202:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getComputableComputableIDTerminalRuleCall_7_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getComputableComputableIDTerminalRuleCall_7_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getComputableComputableCrossReference_7_1_0()); 
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
    // $ANTLR end "rule__Atomic__ComputableAssignment_7_1"

    // Delegated rules


    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\3\uffff\1\11\6\uffff";
    static final String dfa_3s = "\1\4\2\uffff\1\4\6\uffff";
    static final String dfa_4s = "\1\117\2\uffff\1\114\6\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\7\1\10\1\6\1\3";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\7\1\2\1\3\1\4\1\6\4\uffff\2\5\100\uffff\1\1",
            "",
            "",
            "\1\11\12\uffff\3\10\2\uffff\7\10\3\uffff\1\11\5\uffff\1\11\1\uffff\1\11\10\uffff\17\11\1\uffff\2\11\2\uffff\1\11\10\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1329:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) | ( ( rule__Atomic__Group_5__0 ) ) | ( ( rule__Atomic__Group_6__0 ) ) | ( ( rule__Atomic__Group_7__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x64000008000061F0L,0x000000000000EBF6L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000AF87F38000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00001F0000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x64000008000061F2L,0x000000000000EBF6L});
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
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000100L});

}