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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_STRING", "RULE_FQN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'seconds'", "'minutes'", "'hours'", "'days'", "'measurements'", "'milliseconds'", "'liters'", "'cubic meter'", "'Wh'", "'kWh'", "'gCO2eq'", "'kgCO2eq'", "'='", "'of'", "'type'", "'KPI'", "'int'", "'real'", "'text'", "'bool'", "'{'", "'}'", "'aggregate'", "'for'", "'drift'", "'Minimum'", "'Maximum'", "'Average'", "'Median'", "'Standard'", "'deviation'", "'otherwise'", "'->'", "';'", "'or'", "'and'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'|'", "'['", "']'", "','", "'AVERAGE'", "'('", "')'", "'WEIGHTED_SUM'", "'MIN'", "'MAX'", "'THRESHOLD'", "'do'", "'in'", "'reduce'", "'starting'", "'filter'", "'!'", "'accumulator'"
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
            else if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_FQN)||(LA6_0>=13 && LA6_0<=14)||LA6_0==58||(LA6_0>=61 && LA6_0<=62)||(LA6_0>=65 && LA6_0<=66)||(LA6_0>=68 && LA6_0<=72)||LA6_0==74||(LA6_0>=76 && LA6_0<=78)) ) {
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
    // InternalKPIFormulaDSL.g:1215:1: rule__Operator__Alternatives : ( ( ( rule__Operator__Group_0__0 ) ) | ( ( rule__Operator__Group_1__0 ) ) | ( ( rule__Operator__Group_2__0 ) ) | ( ( rule__Operator__Group_3__0 ) ) | ( ( rule__Operator__Group_4__0 ) ) | ( ( rule__Operator__Group_5__0 ) ) | ( ( rule__Operator__Group_6__0 ) ) | ( ( rule__Operator__Group_7__0 ) ) | ( ( rule__Operator__Group_8__0 ) ) | ( ( rule__Operator__Group_9__0 ) ) | ( rulePrimary ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1219:1: ( ( ( rule__Operator__Group_0__0 ) ) | ( ( rule__Operator__Group_1__0 ) ) | ( ( rule__Operator__Group_2__0 ) ) | ( ( rule__Operator__Group_3__0 ) ) | ( ( rule__Operator__Group_4__0 ) ) | ( ( rule__Operator__Group_5__0 ) ) | ( ( rule__Operator__Group_6__0 ) ) | ( ( rule__Operator__Group_7__0 ) ) | ( ( rule__Operator__Group_8__0 ) ) | ( ( rule__Operator__Group_9__0 ) ) | ( rulePrimary ) )
            int alt11=11;
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
            case 74:
                {
                alt11=9;
                }
                break;
            case 76:
                {
                alt11=10;
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
            case 77:
            case 78:
                {
                alt11=11;
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
                    // InternalKPIFormulaDSL.g:1280:2: ( rulePrimary )
                    {
                    // InternalKPIFormulaDSL.g:1280:2: ( rulePrimary )
                    // InternalKPIFormulaDSL.g:1281:3: rulePrimary
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getPrimaryParserRuleCall_10()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePrimary();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getPrimaryParserRuleCall_10()); 
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
    // InternalKPIFormulaDSL.g:1290:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1294:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleAtomic ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt12=1;
                }
                break;
            case 77:
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
            case 78:
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
                    // InternalKPIFormulaDSL.g:1295:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1295:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalKPIFormulaDSL.g:1296:3: ( rule__Primary__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    }
                    // InternalKPIFormulaDSL.g:1297:3: ( rule__Primary__Group_0__0 )
                    // InternalKPIFormulaDSL.g:1297:4: rule__Primary__Group_0__0
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
                    // InternalKPIFormulaDSL.g:1301:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1301:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalKPIFormulaDSL.g:1302:3: ( rule__Primary__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    }
                    // InternalKPIFormulaDSL.g:1303:3: ( rule__Primary__Group_1__0 )
                    // InternalKPIFormulaDSL.g:1303:4: rule__Primary__Group_1__0
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
                    // InternalKPIFormulaDSL.g:1307:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1307:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalKPIFormulaDSL.g:1308:3: ( rule__Primary__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    }
                    // InternalKPIFormulaDSL.g:1309:3: ( rule__Primary__Group_2__0 )
                    // InternalKPIFormulaDSL.g:1309:4: rule__Primary__Group_2__0
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
                    // InternalKPIFormulaDSL.g:1313:2: ( ruleAtomic )
                    {
                    // InternalKPIFormulaDSL.g:1313:2: ( ruleAtomic )
                    // InternalKPIFormulaDSL.g:1314:3: ruleAtomic
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
    // InternalKPIFormulaDSL.g:1323:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) | ( ( rule__Atomic__Group_5__0 ) ) | ( ( rule__Atomic__Group_6__0 ) ) | ( ( rule__Atomic__Group_7__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1327:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) | ( ( rule__Atomic__Group_5__0 ) ) | ( ( rule__Atomic__Group_6__0 ) ) | ( ( rule__Atomic__Group_7__0 ) ) )
            int alt13=8;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalKPIFormulaDSL.g:1328:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1328:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalKPIFormulaDSL.g:1329:3: ( rule__Atomic__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    }
                    // InternalKPIFormulaDSL.g:1330:3: ( rule__Atomic__Group_0__0 )
                    // InternalKPIFormulaDSL.g:1330:4: rule__Atomic__Group_0__0
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
                    // InternalKPIFormulaDSL.g:1334:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1334:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalKPIFormulaDSL.g:1335:3: ( rule__Atomic__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    }
                    // InternalKPIFormulaDSL.g:1336:3: ( rule__Atomic__Group_1__0 )
                    // InternalKPIFormulaDSL.g:1336:4: rule__Atomic__Group_1__0
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
                    // InternalKPIFormulaDSL.g:1340:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1340:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalKPIFormulaDSL.g:1341:3: ( rule__Atomic__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    }
                    // InternalKPIFormulaDSL.g:1342:3: ( rule__Atomic__Group_2__0 )
                    // InternalKPIFormulaDSL.g:1342:4: rule__Atomic__Group_2__0
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
                    // InternalKPIFormulaDSL.g:1346:2: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1346:2: ( ( rule__Atomic__Group_3__0 ) )
                    // InternalKPIFormulaDSL.g:1347:3: ( rule__Atomic__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    }
                    // InternalKPIFormulaDSL.g:1348:3: ( rule__Atomic__Group_3__0 )
                    // InternalKPIFormulaDSL.g:1348:4: rule__Atomic__Group_3__0
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
                    // InternalKPIFormulaDSL.g:1352:2: ( ( rule__Atomic__Group_4__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1352:2: ( ( rule__Atomic__Group_4__0 ) )
                    // InternalKPIFormulaDSL.g:1353:3: ( rule__Atomic__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_4()); 
                    }
                    // InternalKPIFormulaDSL.g:1354:3: ( rule__Atomic__Group_4__0 )
                    // InternalKPIFormulaDSL.g:1354:4: rule__Atomic__Group_4__0
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
                    // InternalKPIFormulaDSL.g:1358:2: ( ( rule__Atomic__Group_5__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1358:2: ( ( rule__Atomic__Group_5__0 ) )
                    // InternalKPIFormulaDSL.g:1359:3: ( rule__Atomic__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_5()); 
                    }
                    // InternalKPIFormulaDSL.g:1360:3: ( rule__Atomic__Group_5__0 )
                    // InternalKPIFormulaDSL.g:1360:4: rule__Atomic__Group_5__0
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
                    // InternalKPIFormulaDSL.g:1364:2: ( ( rule__Atomic__Group_6__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1364:2: ( ( rule__Atomic__Group_6__0 ) )
                    // InternalKPIFormulaDSL.g:1365:3: ( rule__Atomic__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_6()); 
                    }
                    // InternalKPIFormulaDSL.g:1366:3: ( rule__Atomic__Group_6__0 )
                    // InternalKPIFormulaDSL.g:1366:4: rule__Atomic__Group_6__0
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
                    // InternalKPIFormulaDSL.g:1370:2: ( ( rule__Atomic__Group_7__0 ) )
                    {
                    // InternalKPIFormulaDSL.g:1370:2: ( ( rule__Atomic__Group_7__0 ) )
                    // InternalKPIFormulaDSL.g:1371:3: ( rule__Atomic__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_7()); 
                    }
                    // InternalKPIFormulaDSL.g:1372:3: ( rule__Atomic__Group_7__0 )
                    // InternalKPIFormulaDSL.g:1372:4: rule__Atomic__Group_7__0
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
    // InternalKPIFormulaDSL.g:1380:1: rule__Atomic__ValueAlternatives_4_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1384:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalKPIFormulaDSL.g:1385:2: ( 'true' )
                    {
                    // InternalKPIFormulaDSL.g:1385:2: ( 'true' )
                    // InternalKPIFormulaDSL.g:1386:3: 'true'
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
                    // InternalKPIFormulaDSL.g:1391:2: ( 'false' )
                    {
                    // InternalKPIFormulaDSL.g:1391:2: ( 'false' )
                    // InternalKPIFormulaDSL.g:1392:3: 'false'
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
    // InternalKPIFormulaDSL.g:1401:1: rule__WindowUnit__Alternatives : ( ( ( 'seconds' ) ) | ( ( 'minutes' ) ) | ( ( 'hours' ) ) | ( ( 'days' ) ) | ( ( 'measurements' ) ) );
    public final void rule__WindowUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1405:1: ( ( ( 'seconds' ) ) | ( ( 'minutes' ) ) | ( ( 'hours' ) ) | ( ( 'days' ) ) | ( ( 'measurements' ) ) )
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
                    // InternalKPIFormulaDSL.g:1406:2: ( ( 'seconds' ) )
                    {
                    // InternalKPIFormulaDSL.g:1406:2: ( ( 'seconds' ) )
                    // InternalKPIFormulaDSL.g:1407:3: ( 'seconds' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWindowUnitAccess().getSECEnumLiteralDeclaration_0()); 
                    }
                    // InternalKPIFormulaDSL.g:1408:3: ( 'seconds' )
                    // InternalKPIFormulaDSL.g:1408:4: 'seconds'
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
                    // InternalKPIFormulaDSL.g:1412:2: ( ( 'minutes' ) )
                    {
                    // InternalKPIFormulaDSL.g:1412:2: ( ( 'minutes' ) )
                    // InternalKPIFormulaDSL.g:1413:3: ( 'minutes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWindowUnitAccess().getMINEnumLiteralDeclaration_1()); 
                    }
                    // InternalKPIFormulaDSL.g:1414:3: ( 'minutes' )
                    // InternalKPIFormulaDSL.g:1414:4: 'minutes'
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
                    // InternalKPIFormulaDSL.g:1418:2: ( ( 'hours' ) )
                    {
                    // InternalKPIFormulaDSL.g:1418:2: ( ( 'hours' ) )
                    // InternalKPIFormulaDSL.g:1419:3: ( 'hours' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWindowUnitAccess().getHOUREnumLiteralDeclaration_2()); 
                    }
                    // InternalKPIFormulaDSL.g:1420:3: ( 'hours' )
                    // InternalKPIFormulaDSL.g:1420:4: 'hours'
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
                    // InternalKPIFormulaDSL.g:1424:2: ( ( 'days' ) )
                    {
                    // InternalKPIFormulaDSL.g:1424:2: ( ( 'days' ) )
                    // InternalKPIFormulaDSL.g:1425:3: ( 'days' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWindowUnitAccess().getDAYEnumLiteralDeclaration_3()); 
                    }
                    // InternalKPIFormulaDSL.g:1426:3: ( 'days' )
                    // InternalKPIFormulaDSL.g:1426:4: 'days'
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
                    // InternalKPIFormulaDSL.g:1430:2: ( ( 'measurements' ) )
                    {
                    // InternalKPIFormulaDSL.g:1430:2: ( ( 'measurements' ) )
                    // InternalKPIFormulaDSL.g:1431:3: ( 'measurements' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWindowUnitAccess().getMEASUREMENTEnumLiteralDeclaration_4()); 
                    }
                    // InternalKPIFormulaDSL.g:1432:3: ( 'measurements' )
                    // InternalKPIFormulaDSL.g:1432:4: 'measurements'
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
    // InternalKPIFormulaDSL.g:1440:1: rule__ValueUnit__Alternatives : ( ( ( 'milliseconds' ) ) | ( ( 'seconds' ) ) | ( ( 'minutes' ) ) | ( ( 'hours' ) ) | ( ( 'liters' ) ) | ( ( 'cubic meter' ) ) | ( ( 'Wh' ) ) | ( ( 'kWh' ) ) | ( ( 'gCO2eq' ) ) | ( ( 'kgCO2eq' ) ) );
    public final void rule__ValueUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1444:1: ( ( ( 'milliseconds' ) ) | ( ( 'seconds' ) ) | ( ( 'minutes' ) ) | ( ( 'hours' ) ) | ( ( 'liters' ) ) | ( ( 'cubic meter' ) ) | ( ( 'Wh' ) ) | ( ( 'kWh' ) ) | ( ( 'gCO2eq' ) ) | ( ( 'kgCO2eq' ) ) )
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
                    // InternalKPIFormulaDSL.g:1445:2: ( ( 'milliseconds' ) )
                    {
                    // InternalKPIFormulaDSL.g:1445:2: ( ( 'milliseconds' ) )
                    // InternalKPIFormulaDSL.g:1446:3: ( 'milliseconds' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getMILLIEnumLiteralDeclaration_0()); 
                    }
                    // InternalKPIFormulaDSL.g:1447:3: ( 'milliseconds' )
                    // InternalKPIFormulaDSL.g:1447:4: 'milliseconds'
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
                    // InternalKPIFormulaDSL.g:1451:2: ( ( 'seconds' ) )
                    {
                    // InternalKPIFormulaDSL.g:1451:2: ( ( 'seconds' ) )
                    // InternalKPIFormulaDSL.g:1452:3: ( 'seconds' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getSECEnumLiteralDeclaration_1()); 
                    }
                    // InternalKPIFormulaDSL.g:1453:3: ( 'seconds' )
                    // InternalKPIFormulaDSL.g:1453:4: 'seconds'
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
                    // InternalKPIFormulaDSL.g:1457:2: ( ( 'minutes' ) )
                    {
                    // InternalKPIFormulaDSL.g:1457:2: ( ( 'minutes' ) )
                    // InternalKPIFormulaDSL.g:1458:3: ( 'minutes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getMINEnumLiteralDeclaration_2()); 
                    }
                    // InternalKPIFormulaDSL.g:1459:3: ( 'minutes' )
                    // InternalKPIFormulaDSL.g:1459:4: 'minutes'
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
                    // InternalKPIFormulaDSL.g:1463:2: ( ( 'hours' ) )
                    {
                    // InternalKPIFormulaDSL.g:1463:2: ( ( 'hours' ) )
                    // InternalKPIFormulaDSL.g:1464:3: ( 'hours' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getHOUREnumLiteralDeclaration_3()); 
                    }
                    // InternalKPIFormulaDSL.g:1465:3: ( 'hours' )
                    // InternalKPIFormulaDSL.g:1465:4: 'hours'
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
                    // InternalKPIFormulaDSL.g:1469:2: ( ( 'liters' ) )
                    {
                    // InternalKPIFormulaDSL.g:1469:2: ( ( 'liters' ) )
                    // InternalKPIFormulaDSL.g:1470:3: ( 'liters' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getLITERSEnumLiteralDeclaration_4()); 
                    }
                    // InternalKPIFormulaDSL.g:1471:3: ( 'liters' )
                    // InternalKPIFormulaDSL.g:1471:4: 'liters'
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
                    // InternalKPIFormulaDSL.g:1475:2: ( ( 'cubic meter' ) )
                    {
                    // InternalKPIFormulaDSL.g:1475:2: ( ( 'cubic meter' ) )
                    // InternalKPIFormulaDSL.g:1476:3: ( 'cubic meter' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getM3EnumLiteralDeclaration_5()); 
                    }
                    // InternalKPIFormulaDSL.g:1477:3: ( 'cubic meter' )
                    // InternalKPIFormulaDSL.g:1477:4: 'cubic meter'
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
                    // InternalKPIFormulaDSL.g:1481:2: ( ( 'Wh' ) )
                    {
                    // InternalKPIFormulaDSL.g:1481:2: ( ( 'Wh' ) )
                    // InternalKPIFormulaDSL.g:1482:3: ( 'Wh' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getWhEnumLiteralDeclaration_6()); 
                    }
                    // InternalKPIFormulaDSL.g:1483:3: ( 'Wh' )
                    // InternalKPIFormulaDSL.g:1483:4: 'Wh'
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
                    // InternalKPIFormulaDSL.g:1487:2: ( ( 'kWh' ) )
                    {
                    // InternalKPIFormulaDSL.g:1487:2: ( ( 'kWh' ) )
                    // InternalKPIFormulaDSL.g:1488:3: ( 'kWh' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getKWhEnumLiteralDeclaration_7()); 
                    }
                    // InternalKPIFormulaDSL.g:1489:3: ( 'kWh' )
                    // InternalKPIFormulaDSL.g:1489:4: 'kWh'
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
                    // InternalKPIFormulaDSL.g:1493:2: ( ( 'gCO2eq' ) )
                    {
                    // InternalKPIFormulaDSL.g:1493:2: ( ( 'gCO2eq' ) )
                    // InternalKPIFormulaDSL.g:1494:3: ( 'gCO2eq' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getGCO2eqEnumLiteralDeclaration_8()); 
                    }
                    // InternalKPIFormulaDSL.g:1495:3: ( 'gCO2eq' )
                    // InternalKPIFormulaDSL.g:1495:4: 'gCO2eq'
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
                    // InternalKPIFormulaDSL.g:1499:2: ( ( 'kgCO2eq' ) )
                    {
                    // InternalKPIFormulaDSL.g:1499:2: ( ( 'kgCO2eq' ) )
                    // InternalKPIFormulaDSL.g:1500:3: ( 'kgCO2eq' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueUnitAccess().getKgCO2eqEnumLiteralDeclaration_9()); 
                    }
                    // InternalKPIFormulaDSL.g:1501:3: ( 'kgCO2eq' )
                    // InternalKPIFormulaDSL.g:1501:4: 'kgCO2eq'
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
    // InternalKPIFormulaDSL.g:1509:1: rule__Computation__Group__0 : rule__Computation__Group__0__Impl rule__Computation__Group__1 ;
    public final void rule__Computation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1513:1: ( rule__Computation__Group__0__Impl rule__Computation__Group__1 )
            // InternalKPIFormulaDSL.g:1514:2: rule__Computation__Group__0__Impl rule__Computation__Group__1
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
    // InternalKPIFormulaDSL.g:1521:1: rule__Computation__Group__0__Impl : ( ( rule__Computation__ComputedAssignment_0 ) ) ;
    public final void rule__Computation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1525:1: ( ( ( rule__Computation__ComputedAssignment_0 ) ) )
            // InternalKPIFormulaDSL.g:1526:1: ( ( rule__Computation__ComputedAssignment_0 ) )
            {
            // InternalKPIFormulaDSL.g:1526:1: ( ( rule__Computation__ComputedAssignment_0 ) )
            // InternalKPIFormulaDSL.g:1527:2: ( rule__Computation__ComputedAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComputationAccess().getComputedAssignment_0()); 
            }
            // InternalKPIFormulaDSL.g:1528:2: ( rule__Computation__ComputedAssignment_0 )
            // InternalKPIFormulaDSL.g:1528:3: rule__Computation__ComputedAssignment_0
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
    // InternalKPIFormulaDSL.g:1536:1: rule__Computation__Group__1 : rule__Computation__Group__1__Impl rule__Computation__Group__2 ;
    public final void rule__Computation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1540:1: ( rule__Computation__Group__1__Impl rule__Computation__Group__2 )
            // InternalKPIFormulaDSL.g:1541:2: rule__Computation__Group__1__Impl rule__Computation__Group__2
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
    // InternalKPIFormulaDSL.g:1548:1: rule__Computation__Group__1__Impl : ( '=' ) ;
    public final void rule__Computation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1552:1: ( ( '=' ) )
            // InternalKPIFormulaDSL.g:1553:1: ( '=' )
            {
            // InternalKPIFormulaDSL.g:1553:1: ( '=' )
            // InternalKPIFormulaDSL.g:1554:2: '='
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
    // InternalKPIFormulaDSL.g:1563:1: rule__Computation__Group__2 : rule__Computation__Group__2__Impl ;
    public final void rule__Computation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1567:1: ( rule__Computation__Group__2__Impl )
            // InternalKPIFormulaDSL.g:1568:2: rule__Computation__Group__2__Impl
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
    // InternalKPIFormulaDSL.g:1574:1: rule__Computation__Group__2__Impl : ( ( rule__Computation__FormulaAssignment_2 ) ) ;
    public final void rule__Computation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1578:1: ( ( ( rule__Computation__FormulaAssignment_2 ) ) )
            // InternalKPIFormulaDSL.g:1579:1: ( ( rule__Computation__FormulaAssignment_2 ) )
            {
            // InternalKPIFormulaDSL.g:1579:1: ( ( rule__Computation__FormulaAssignment_2 ) )
            // InternalKPIFormulaDSL.g:1580:2: ( rule__Computation__FormulaAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComputationAccess().getFormulaAssignment_2()); 
            }
            // InternalKPIFormulaDSL.g:1581:2: ( rule__Computation__FormulaAssignment_2 )
            // InternalKPIFormulaDSL.g:1581:3: rule__Computation__FormulaAssignment_2
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
    // InternalKPIFormulaDSL.g:1590:1: rule__Metric__Group__0 : rule__Metric__Group__0__Impl rule__Metric__Group__1 ;
    public final void rule__Metric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1594:1: ( rule__Metric__Group__0__Impl rule__Metric__Group__1 )
            // InternalKPIFormulaDSL.g:1595:2: rule__Metric__Group__0__Impl rule__Metric__Group__1
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
    // InternalKPIFormulaDSL.g:1602:1: rule__Metric__Group__0__Impl : ( ( rule__Metric__NameAssignment_0 ) ) ;
    public final void rule__Metric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1606:1: ( ( ( rule__Metric__NameAssignment_0 ) ) )
            // InternalKPIFormulaDSL.g:1607:1: ( ( rule__Metric__NameAssignment_0 ) )
            {
            // InternalKPIFormulaDSL.g:1607:1: ( ( rule__Metric__NameAssignment_0 ) )
            // InternalKPIFormulaDSL.g:1608:2: ( rule__Metric__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricAccess().getNameAssignment_0()); 
            }
            // InternalKPIFormulaDSL.g:1609:2: ( rule__Metric__NameAssignment_0 )
            // InternalKPIFormulaDSL.g:1609:3: rule__Metric__NameAssignment_0
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
    // InternalKPIFormulaDSL.g:1617:1: rule__Metric__Group__1 : rule__Metric__Group__1__Impl rule__Metric__Group__2 ;
    public final void rule__Metric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1621:1: ( rule__Metric__Group__1__Impl rule__Metric__Group__2 )
            // InternalKPIFormulaDSL.g:1622:2: rule__Metric__Group__1__Impl rule__Metric__Group__2
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
    // InternalKPIFormulaDSL.g:1629:1: rule__Metric__Group__1__Impl : ( 'of' ) ;
    public final void rule__Metric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1633:1: ( ( 'of' ) )
            // InternalKPIFormulaDSL.g:1634:1: ( 'of' )
            {
            // InternalKPIFormulaDSL.g:1634:1: ( 'of' )
            // InternalKPIFormulaDSL.g:1635:2: 'of'
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
    // InternalKPIFormulaDSL.g:1644:1: rule__Metric__Group__2 : rule__Metric__Group__2__Impl rule__Metric__Group__3 ;
    public final void rule__Metric__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1648:1: ( rule__Metric__Group__2__Impl rule__Metric__Group__3 )
            // InternalKPIFormulaDSL.g:1649:2: rule__Metric__Group__2__Impl rule__Metric__Group__3
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
    // InternalKPIFormulaDSL.g:1656:1: rule__Metric__Group__2__Impl : ( 'type' ) ;
    public final void rule__Metric__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1660:1: ( ( 'type' ) )
            // InternalKPIFormulaDSL.g:1661:1: ( 'type' )
            {
            // InternalKPIFormulaDSL.g:1661:1: ( 'type' )
            // InternalKPIFormulaDSL.g:1662:2: 'type'
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
    // InternalKPIFormulaDSL.g:1671:1: rule__Metric__Group__3 : rule__Metric__Group__3__Impl ;
    public final void rule__Metric__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1675:1: ( rule__Metric__Group__3__Impl )
            // InternalKPIFormulaDSL.g:1676:2: rule__Metric__Group__3__Impl
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
    // InternalKPIFormulaDSL.g:1682:1: rule__Metric__Group__3__Impl : ( ( rule__Metric__TypeAssignment_3 ) ) ;
    public final void rule__Metric__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1686:1: ( ( ( rule__Metric__TypeAssignment_3 ) ) )
            // InternalKPIFormulaDSL.g:1687:1: ( ( rule__Metric__TypeAssignment_3 ) )
            {
            // InternalKPIFormulaDSL.g:1687:1: ( ( rule__Metric__TypeAssignment_3 ) )
            // InternalKPIFormulaDSL.g:1688:2: ( rule__Metric__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetricAccess().getTypeAssignment_3()); 
            }
            // InternalKPIFormulaDSL.g:1689:2: ( rule__Metric__TypeAssignment_3 )
            // InternalKPIFormulaDSL.g:1689:3: rule__Metric__TypeAssignment_3
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
    // InternalKPIFormulaDSL.g:1698:1: rule__KPI__Group__0 : rule__KPI__Group__0__Impl rule__KPI__Group__1 ;
    public final void rule__KPI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1702:1: ( rule__KPI__Group__0__Impl rule__KPI__Group__1 )
            // InternalKPIFormulaDSL.g:1703:2: rule__KPI__Group__0__Impl rule__KPI__Group__1
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
    // InternalKPIFormulaDSL.g:1710:1: rule__KPI__Group__0__Impl : ( 'KPI' ) ;
    public final void rule__KPI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1714:1: ( ( 'KPI' ) )
            // InternalKPIFormulaDSL.g:1715:1: ( 'KPI' )
            {
            // InternalKPIFormulaDSL.g:1715:1: ( 'KPI' )
            // InternalKPIFormulaDSL.g:1716:2: 'KPI'
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
    // InternalKPIFormulaDSL.g:1725:1: rule__KPI__Group__1 : rule__KPI__Group__1__Impl rule__KPI__Group__2 ;
    public final void rule__KPI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1729:1: ( rule__KPI__Group__1__Impl rule__KPI__Group__2 )
            // InternalKPIFormulaDSL.g:1730:2: rule__KPI__Group__1__Impl rule__KPI__Group__2
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
    // InternalKPIFormulaDSL.g:1737:1: rule__KPI__Group__1__Impl : ( ( rule__KPI__NameAssignment_1 ) ) ;
    public final void rule__KPI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1741:1: ( ( ( rule__KPI__NameAssignment_1 ) ) )
            // InternalKPIFormulaDSL.g:1742:1: ( ( rule__KPI__NameAssignment_1 ) )
            {
            // InternalKPIFormulaDSL.g:1742:1: ( ( rule__KPI__NameAssignment_1 ) )
            // InternalKPIFormulaDSL.g:1743:2: ( rule__KPI__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKPIAccess().getNameAssignment_1()); 
            }
            // InternalKPIFormulaDSL.g:1744:2: ( rule__KPI__NameAssignment_1 )
            // InternalKPIFormulaDSL.g:1744:3: rule__KPI__NameAssignment_1
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
    // InternalKPIFormulaDSL.g:1752:1: rule__KPI__Group__2 : rule__KPI__Group__2__Impl rule__KPI__Group__3 ;
    public final void rule__KPI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1756:1: ( rule__KPI__Group__2__Impl rule__KPI__Group__3 )
            // InternalKPIFormulaDSL.g:1757:2: rule__KPI__Group__2__Impl rule__KPI__Group__3
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
    // InternalKPIFormulaDSL.g:1764:1: rule__KPI__Group__2__Impl : ( 'of' ) ;
    public final void rule__KPI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1768:1: ( ( 'of' ) )
            // InternalKPIFormulaDSL.g:1769:1: ( 'of' )
            {
            // InternalKPIFormulaDSL.g:1769:1: ( 'of' )
            // InternalKPIFormulaDSL.g:1770:2: 'of'
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
    // InternalKPIFormulaDSL.g:1779:1: rule__KPI__Group__3 : rule__KPI__Group__3__Impl rule__KPI__Group__4 ;
    public final void rule__KPI__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1783:1: ( rule__KPI__Group__3__Impl rule__KPI__Group__4 )
            // InternalKPIFormulaDSL.g:1784:2: rule__KPI__Group__3__Impl rule__KPI__Group__4
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
    // InternalKPIFormulaDSL.g:1791:1: rule__KPI__Group__3__Impl : ( 'type' ) ;
    public final void rule__KPI__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1795:1: ( ( 'type' ) )
            // InternalKPIFormulaDSL.g:1796:1: ( 'type' )
            {
            // InternalKPIFormulaDSL.g:1796:1: ( 'type' )
            // InternalKPIFormulaDSL.g:1797:2: 'type'
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
    // InternalKPIFormulaDSL.g:1806:1: rule__KPI__Group__4 : rule__KPI__Group__4__Impl ;
    public final void rule__KPI__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1810:1: ( rule__KPI__Group__4__Impl )
            // InternalKPIFormulaDSL.g:1811:2: rule__KPI__Group__4__Impl
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
    // InternalKPIFormulaDSL.g:1817:1: rule__KPI__Group__4__Impl : ( ( rule__KPI__TypeAssignment_4 ) ) ;
    public final void rule__KPI__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1821:1: ( ( ( rule__KPI__TypeAssignment_4 ) ) )
            // InternalKPIFormulaDSL.g:1822:1: ( ( rule__KPI__TypeAssignment_4 ) )
            {
            // InternalKPIFormulaDSL.g:1822:1: ( ( rule__KPI__TypeAssignment_4 ) )
            // InternalKPIFormulaDSL.g:1823:2: ( rule__KPI__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKPIAccess().getTypeAssignment_4()); 
            }
            // InternalKPIFormulaDSL.g:1824:2: ( rule__KPI__TypeAssignment_4 )
            // InternalKPIFormulaDSL.g:1824:3: rule__KPI__TypeAssignment_4
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
    // InternalKPIFormulaDSL.g:1833:1: rule__IntegerValue__Group__0 : rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 ;
    public final void rule__IntegerValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1837:1: ( rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1 )
            // InternalKPIFormulaDSL.g:1838:2: rule__IntegerValue__Group__0__Impl rule__IntegerValue__Group__1
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
    // InternalKPIFormulaDSL.g:1845:1: rule__IntegerValue__Group__0__Impl : ( () ) ;
    public final void rule__IntegerValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1849:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:1850:1: ( () )
            {
            // InternalKPIFormulaDSL.g:1850:1: ( () )
            // InternalKPIFormulaDSL.g:1851:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueAccess().getIntegerValueAction_0()); 
            }
            // InternalKPIFormulaDSL.g:1852:2: ()
            // InternalKPIFormulaDSL.g:1852:3: 
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
    // InternalKPIFormulaDSL.g:1860:1: rule__IntegerValue__Group__1 : rule__IntegerValue__Group__1__Impl ;
    public final void rule__IntegerValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1864:1: ( rule__IntegerValue__Group__1__Impl )
            // InternalKPIFormulaDSL.g:1865:2: rule__IntegerValue__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:1871:1: rule__IntegerValue__Group__1__Impl : ( 'int' ) ;
    public final void rule__IntegerValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1875:1: ( ( 'int' ) )
            // InternalKPIFormulaDSL.g:1876:1: ( 'int' )
            {
            // InternalKPIFormulaDSL.g:1876:1: ( 'int' )
            // InternalKPIFormulaDSL.g:1877:2: 'int'
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
    // InternalKPIFormulaDSL.g:1887:1: rule__RealValue__Group__0 : rule__RealValue__Group__0__Impl rule__RealValue__Group__1 ;
    public final void rule__RealValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1891:1: ( rule__RealValue__Group__0__Impl rule__RealValue__Group__1 )
            // InternalKPIFormulaDSL.g:1892:2: rule__RealValue__Group__0__Impl rule__RealValue__Group__1
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
    // InternalKPIFormulaDSL.g:1899:1: rule__RealValue__Group__0__Impl : ( () ) ;
    public final void rule__RealValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1903:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:1904:1: ( () )
            {
            // InternalKPIFormulaDSL.g:1904:1: ( () )
            // InternalKPIFormulaDSL.g:1905:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealValueAccess().getRealValueAction_0()); 
            }
            // InternalKPIFormulaDSL.g:1906:2: ()
            // InternalKPIFormulaDSL.g:1906:3: 
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
    // InternalKPIFormulaDSL.g:1914:1: rule__RealValue__Group__1 : rule__RealValue__Group__1__Impl ;
    public final void rule__RealValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1918:1: ( rule__RealValue__Group__1__Impl )
            // InternalKPIFormulaDSL.g:1919:2: rule__RealValue__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:1925:1: rule__RealValue__Group__1__Impl : ( 'real' ) ;
    public final void rule__RealValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1929:1: ( ( 'real' ) )
            // InternalKPIFormulaDSL.g:1930:1: ( 'real' )
            {
            // InternalKPIFormulaDSL.g:1930:1: ( 'real' )
            // InternalKPIFormulaDSL.g:1931:2: 'real'
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
    // InternalKPIFormulaDSL.g:1941:1: rule__TextualValue__Group__0 : rule__TextualValue__Group__0__Impl rule__TextualValue__Group__1 ;
    public final void rule__TextualValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1945:1: ( rule__TextualValue__Group__0__Impl rule__TextualValue__Group__1 )
            // InternalKPIFormulaDSL.g:1946:2: rule__TextualValue__Group__0__Impl rule__TextualValue__Group__1
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
    // InternalKPIFormulaDSL.g:1953:1: rule__TextualValue__Group__0__Impl : ( () ) ;
    public final void rule__TextualValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1957:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:1958:1: ( () )
            {
            // InternalKPIFormulaDSL.g:1958:1: ( () )
            // InternalKPIFormulaDSL.g:1959:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextualValueAccess().getTextualValueAction_0()); 
            }
            // InternalKPIFormulaDSL.g:1960:2: ()
            // InternalKPIFormulaDSL.g:1960:3: 
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
    // InternalKPIFormulaDSL.g:1968:1: rule__TextualValue__Group__1 : rule__TextualValue__Group__1__Impl ;
    public final void rule__TextualValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1972:1: ( rule__TextualValue__Group__1__Impl )
            // InternalKPIFormulaDSL.g:1973:2: rule__TextualValue__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:1979:1: rule__TextualValue__Group__1__Impl : ( 'text' ) ;
    public final void rule__TextualValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1983:1: ( ( 'text' ) )
            // InternalKPIFormulaDSL.g:1984:1: ( 'text' )
            {
            // InternalKPIFormulaDSL.g:1984:1: ( 'text' )
            // InternalKPIFormulaDSL.g:1985:2: 'text'
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
    // InternalKPIFormulaDSL.g:1995:1: rule__BooleanValue__Group__0 : rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 ;
    public final void rule__BooleanValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:1999:1: ( rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1 )
            // InternalKPIFormulaDSL.g:2000:2: rule__BooleanValue__Group__0__Impl rule__BooleanValue__Group__1
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
    // InternalKPIFormulaDSL.g:2007:1: rule__BooleanValue__Group__0__Impl : ( () ) ;
    public final void rule__BooleanValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2011:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:2012:1: ( () )
            {
            // InternalKPIFormulaDSL.g:2012:1: ( () )
            // InternalKPIFormulaDSL.g:2013:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getBooleanValueAction_0()); 
            }
            // InternalKPIFormulaDSL.g:2014:2: ()
            // InternalKPIFormulaDSL.g:2014:3: 
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
    // InternalKPIFormulaDSL.g:2022:1: rule__BooleanValue__Group__1 : rule__BooleanValue__Group__1__Impl ;
    public final void rule__BooleanValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2026:1: ( rule__BooleanValue__Group__1__Impl )
            // InternalKPIFormulaDSL.g:2027:2: rule__BooleanValue__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:2033:1: rule__BooleanValue__Group__1__Impl : ( 'bool' ) ;
    public final void rule__BooleanValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2037:1: ( ( 'bool' ) )
            // InternalKPIFormulaDSL.g:2038:1: ( 'bool' )
            {
            // InternalKPIFormulaDSL.g:2038:1: ( 'bool' )
            // InternalKPIFormulaDSL.g:2039:2: 'bool'
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
    // InternalKPIFormulaDSL.g:2049:1: rule__EnumerationValue__Group__0 : rule__EnumerationValue__Group__0__Impl rule__EnumerationValue__Group__1 ;
    public final void rule__EnumerationValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2053:1: ( rule__EnumerationValue__Group__0__Impl rule__EnumerationValue__Group__1 )
            // InternalKPIFormulaDSL.g:2054:2: rule__EnumerationValue__Group__0__Impl rule__EnumerationValue__Group__1
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
    // InternalKPIFormulaDSL.g:2061:1: rule__EnumerationValue__Group__0__Impl : ( '{' ) ;
    public final void rule__EnumerationValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2065:1: ( ( '{' ) )
            // InternalKPIFormulaDSL.g:2066:1: ( '{' )
            {
            // InternalKPIFormulaDSL.g:2066:1: ( '{' )
            // InternalKPIFormulaDSL.g:2067:2: '{'
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
    // InternalKPIFormulaDSL.g:2076:1: rule__EnumerationValue__Group__1 : rule__EnumerationValue__Group__1__Impl rule__EnumerationValue__Group__2 ;
    public final void rule__EnumerationValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2080:1: ( rule__EnumerationValue__Group__1__Impl rule__EnumerationValue__Group__2 )
            // InternalKPIFormulaDSL.g:2081:2: rule__EnumerationValue__Group__1__Impl rule__EnumerationValue__Group__2
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
    // InternalKPIFormulaDSL.g:2088:1: rule__EnumerationValue__Group__1__Impl : ( ( ( rule__EnumerationValue__LiteralsAssignment_1 ) ) ( ( rule__EnumerationValue__LiteralsAssignment_1 )* ) ) ;
    public final void rule__EnumerationValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2092:1: ( ( ( ( rule__EnumerationValue__LiteralsAssignment_1 ) ) ( ( rule__EnumerationValue__LiteralsAssignment_1 )* ) ) )
            // InternalKPIFormulaDSL.g:2093:1: ( ( ( rule__EnumerationValue__LiteralsAssignment_1 ) ) ( ( rule__EnumerationValue__LiteralsAssignment_1 )* ) )
            {
            // InternalKPIFormulaDSL.g:2093:1: ( ( ( rule__EnumerationValue__LiteralsAssignment_1 ) ) ( ( rule__EnumerationValue__LiteralsAssignment_1 )* ) )
            // InternalKPIFormulaDSL.g:2094:2: ( ( rule__EnumerationValue__LiteralsAssignment_1 ) ) ( ( rule__EnumerationValue__LiteralsAssignment_1 )* )
            {
            // InternalKPIFormulaDSL.g:2094:2: ( ( rule__EnumerationValue__LiteralsAssignment_1 ) )
            // InternalKPIFormulaDSL.g:2095:3: ( rule__EnumerationValue__LiteralsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationValueAccess().getLiteralsAssignment_1()); 
            }
            // InternalKPIFormulaDSL.g:2096:3: ( rule__EnumerationValue__LiteralsAssignment_1 )
            // InternalKPIFormulaDSL.g:2096:4: rule__EnumerationValue__LiteralsAssignment_1
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

            // InternalKPIFormulaDSL.g:2099:2: ( ( rule__EnumerationValue__LiteralsAssignment_1 )* )
            // InternalKPIFormulaDSL.g:2100:3: ( rule__EnumerationValue__LiteralsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationValueAccess().getLiteralsAssignment_1()); 
            }
            // InternalKPIFormulaDSL.g:2101:3: ( rule__EnumerationValue__LiteralsAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:2101:4: rule__EnumerationValue__LiteralsAssignment_1
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
    // InternalKPIFormulaDSL.g:2110:1: rule__EnumerationValue__Group__2 : rule__EnumerationValue__Group__2__Impl ;
    public final void rule__EnumerationValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2114:1: ( rule__EnumerationValue__Group__2__Impl )
            // InternalKPIFormulaDSL.g:2115:2: rule__EnumerationValue__Group__2__Impl
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
    // InternalKPIFormulaDSL.g:2121:1: rule__EnumerationValue__Group__2__Impl : ( '}' ) ;
    public final void rule__EnumerationValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2125:1: ( ( '}' ) )
            // InternalKPIFormulaDSL.g:2126:1: ( '}' )
            {
            // InternalKPIFormulaDSL.g:2126:1: ( '}' )
            // InternalKPIFormulaDSL.g:2127:2: '}'
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
    // InternalKPIFormulaDSL.g:2137:1: rule__AggregationValue__Group__0 : rule__AggregationValue__Group__0__Impl rule__AggregationValue__Group__1 ;
    public final void rule__AggregationValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2141:1: ( rule__AggregationValue__Group__0__Impl rule__AggregationValue__Group__1 )
            // InternalKPIFormulaDSL.g:2142:2: rule__AggregationValue__Group__0__Impl rule__AggregationValue__Group__1
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
    // InternalKPIFormulaDSL.g:2149:1: rule__AggregationValue__Group__0__Impl : ( 'aggregate' ) ;
    public final void rule__AggregationValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2153:1: ( ( 'aggregate' ) )
            // InternalKPIFormulaDSL.g:2154:1: ( 'aggregate' )
            {
            // InternalKPIFormulaDSL.g:2154:1: ( 'aggregate' )
            // InternalKPIFormulaDSL.g:2155:2: 'aggregate'
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
    // InternalKPIFormulaDSL.g:2164:1: rule__AggregationValue__Group__1 : rule__AggregationValue__Group__1__Impl rule__AggregationValue__Group__2 ;
    public final void rule__AggregationValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2168:1: ( rule__AggregationValue__Group__1__Impl rule__AggregationValue__Group__2 )
            // InternalKPIFormulaDSL.g:2169:2: rule__AggregationValue__Group__1__Impl rule__AggregationValue__Group__2
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
    // InternalKPIFormulaDSL.g:2176:1: rule__AggregationValue__Group__1__Impl : ( ( rule__AggregationValue__OperationAssignment_1 ) ) ;
    public final void rule__AggregationValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2180:1: ( ( ( rule__AggregationValue__OperationAssignment_1 ) ) )
            // InternalKPIFormulaDSL.g:2181:1: ( ( rule__AggregationValue__OperationAssignment_1 ) )
            {
            // InternalKPIFormulaDSL.g:2181:1: ( ( rule__AggregationValue__OperationAssignment_1 ) )
            // InternalKPIFormulaDSL.g:2182:2: ( rule__AggregationValue__OperationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregationValueAccess().getOperationAssignment_1()); 
            }
            // InternalKPIFormulaDSL.g:2183:2: ( rule__AggregationValue__OperationAssignment_1 )
            // InternalKPIFormulaDSL.g:2183:3: rule__AggregationValue__OperationAssignment_1
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
    // InternalKPIFormulaDSL.g:2191:1: rule__AggregationValue__Group__2 : rule__AggregationValue__Group__2__Impl rule__AggregationValue__Group__3 ;
    public final void rule__AggregationValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2195:1: ( rule__AggregationValue__Group__2__Impl rule__AggregationValue__Group__3 )
            // InternalKPIFormulaDSL.g:2196:2: rule__AggregationValue__Group__2__Impl rule__AggregationValue__Group__3
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
    // InternalKPIFormulaDSL.g:2203:1: rule__AggregationValue__Group__2__Impl : ( 'for' ) ;
    public final void rule__AggregationValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2207:1: ( ( 'for' ) )
            // InternalKPIFormulaDSL.g:2208:1: ( 'for' )
            {
            // InternalKPIFormulaDSL.g:2208:1: ( 'for' )
            // InternalKPIFormulaDSL.g:2209:2: 'for'
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
    // InternalKPIFormulaDSL.g:2218:1: rule__AggregationValue__Group__3 : rule__AggregationValue__Group__3__Impl rule__AggregationValue__Group__4 ;
    public final void rule__AggregationValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2222:1: ( rule__AggregationValue__Group__3__Impl rule__AggregationValue__Group__4 )
            // InternalKPIFormulaDSL.g:2223:2: rule__AggregationValue__Group__3__Impl rule__AggregationValue__Group__4
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
    // InternalKPIFormulaDSL.g:2230:1: rule__AggregationValue__Group__3__Impl : ( ( rule__AggregationValue__WindowAssignment_3 ) ) ;
    public final void rule__AggregationValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2234:1: ( ( ( rule__AggregationValue__WindowAssignment_3 ) ) )
            // InternalKPIFormulaDSL.g:2235:1: ( ( rule__AggregationValue__WindowAssignment_3 ) )
            {
            // InternalKPIFormulaDSL.g:2235:1: ( ( rule__AggregationValue__WindowAssignment_3 ) )
            // InternalKPIFormulaDSL.g:2236:2: ( rule__AggregationValue__WindowAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregationValueAccess().getWindowAssignment_3()); 
            }
            // InternalKPIFormulaDSL.g:2237:2: ( rule__AggregationValue__WindowAssignment_3 )
            // InternalKPIFormulaDSL.g:2237:3: rule__AggregationValue__WindowAssignment_3
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
    // InternalKPIFormulaDSL.g:2245:1: rule__AggregationValue__Group__4 : rule__AggregationValue__Group__4__Impl ;
    public final void rule__AggregationValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2249:1: ( rule__AggregationValue__Group__4__Impl )
            // InternalKPIFormulaDSL.g:2250:2: rule__AggregationValue__Group__4__Impl
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
    // InternalKPIFormulaDSL.g:2256:1: rule__AggregationValue__Group__4__Impl : ( ( rule__AggregationValue__WindowUnitAssignment_4 ) ) ;
    public final void rule__AggregationValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2260:1: ( ( ( rule__AggregationValue__WindowUnitAssignment_4 ) ) )
            // InternalKPIFormulaDSL.g:2261:1: ( ( rule__AggregationValue__WindowUnitAssignment_4 ) )
            {
            // InternalKPIFormulaDSL.g:2261:1: ( ( rule__AggregationValue__WindowUnitAssignment_4 ) )
            // InternalKPIFormulaDSL.g:2262:2: ( rule__AggregationValue__WindowUnitAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAggregationValueAccess().getWindowUnitAssignment_4()); 
            }
            // InternalKPIFormulaDSL.g:2263:2: ( rule__AggregationValue__WindowUnitAssignment_4 )
            // InternalKPIFormulaDSL.g:2263:3: rule__AggregationValue__WindowUnitAssignment_4
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
    // InternalKPIFormulaDSL.g:2272:1: rule__DriftValue__Group__0 : rule__DriftValue__Group__0__Impl rule__DriftValue__Group__1 ;
    public final void rule__DriftValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2276:1: ( rule__DriftValue__Group__0__Impl rule__DriftValue__Group__1 )
            // InternalKPIFormulaDSL.g:2277:2: rule__DriftValue__Group__0__Impl rule__DriftValue__Group__1
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
    // InternalKPIFormulaDSL.g:2284:1: rule__DriftValue__Group__0__Impl : ( 'drift' ) ;
    public final void rule__DriftValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2288:1: ( ( 'drift' ) )
            // InternalKPIFormulaDSL.g:2289:1: ( 'drift' )
            {
            // InternalKPIFormulaDSL.g:2289:1: ( 'drift' )
            // InternalKPIFormulaDSL.g:2290:2: 'drift'
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
    // InternalKPIFormulaDSL.g:2299:1: rule__DriftValue__Group__1 : rule__DriftValue__Group__1__Impl rule__DriftValue__Group__2 ;
    public final void rule__DriftValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2303:1: ( rule__DriftValue__Group__1__Impl rule__DriftValue__Group__2 )
            // InternalKPIFormulaDSL.g:2304:2: rule__DriftValue__Group__1__Impl rule__DriftValue__Group__2
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
    // InternalKPIFormulaDSL.g:2311:1: rule__DriftValue__Group__1__Impl : ( 'of' ) ;
    public final void rule__DriftValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2315:1: ( ( 'of' ) )
            // InternalKPIFormulaDSL.g:2316:1: ( 'of' )
            {
            // InternalKPIFormulaDSL.g:2316:1: ( 'of' )
            // InternalKPIFormulaDSL.g:2317:2: 'of'
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
    // InternalKPIFormulaDSL.g:2326:1: rule__DriftValue__Group__2 : rule__DriftValue__Group__2__Impl rule__DriftValue__Group__3 ;
    public final void rule__DriftValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2330:1: ( rule__DriftValue__Group__2__Impl rule__DriftValue__Group__3 )
            // InternalKPIFormulaDSL.g:2331:2: rule__DriftValue__Group__2__Impl rule__DriftValue__Group__3
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
    // InternalKPIFormulaDSL.g:2338:1: rule__DriftValue__Group__2__Impl : ( ( rule__DriftValue__OperationAssignment_2 ) ) ;
    public final void rule__DriftValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2342:1: ( ( ( rule__DriftValue__OperationAssignment_2 ) ) )
            // InternalKPIFormulaDSL.g:2343:1: ( ( rule__DriftValue__OperationAssignment_2 ) )
            {
            // InternalKPIFormulaDSL.g:2343:1: ( ( rule__DriftValue__OperationAssignment_2 ) )
            // InternalKPIFormulaDSL.g:2344:2: ( rule__DriftValue__OperationAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDriftValueAccess().getOperationAssignment_2()); 
            }
            // InternalKPIFormulaDSL.g:2345:2: ( rule__DriftValue__OperationAssignment_2 )
            // InternalKPIFormulaDSL.g:2345:3: rule__DriftValue__OperationAssignment_2
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
    // InternalKPIFormulaDSL.g:2353:1: rule__DriftValue__Group__3 : rule__DriftValue__Group__3__Impl rule__DriftValue__Group__4 ;
    public final void rule__DriftValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2357:1: ( rule__DriftValue__Group__3__Impl rule__DriftValue__Group__4 )
            // InternalKPIFormulaDSL.g:2358:2: rule__DriftValue__Group__3__Impl rule__DriftValue__Group__4
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
    // InternalKPIFormulaDSL.g:2365:1: rule__DriftValue__Group__3__Impl : ( 'for' ) ;
    public final void rule__DriftValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2369:1: ( ( 'for' ) )
            // InternalKPIFormulaDSL.g:2370:1: ( 'for' )
            {
            // InternalKPIFormulaDSL.g:2370:1: ( 'for' )
            // InternalKPIFormulaDSL.g:2371:2: 'for'
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
    // InternalKPIFormulaDSL.g:2380:1: rule__DriftValue__Group__4 : rule__DriftValue__Group__4__Impl rule__DriftValue__Group__5 ;
    public final void rule__DriftValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2384:1: ( rule__DriftValue__Group__4__Impl rule__DriftValue__Group__5 )
            // InternalKPIFormulaDSL.g:2385:2: rule__DriftValue__Group__4__Impl rule__DriftValue__Group__5
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
    // InternalKPIFormulaDSL.g:2392:1: rule__DriftValue__Group__4__Impl : ( ( rule__DriftValue__WindowAssignment_4 ) ) ;
    public final void rule__DriftValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2396:1: ( ( ( rule__DriftValue__WindowAssignment_4 ) ) )
            // InternalKPIFormulaDSL.g:2397:1: ( ( rule__DriftValue__WindowAssignment_4 ) )
            {
            // InternalKPIFormulaDSL.g:2397:1: ( ( rule__DriftValue__WindowAssignment_4 ) )
            // InternalKPIFormulaDSL.g:2398:2: ( rule__DriftValue__WindowAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDriftValueAccess().getWindowAssignment_4()); 
            }
            // InternalKPIFormulaDSL.g:2399:2: ( rule__DriftValue__WindowAssignment_4 )
            // InternalKPIFormulaDSL.g:2399:3: rule__DriftValue__WindowAssignment_4
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
    // InternalKPIFormulaDSL.g:2407:1: rule__DriftValue__Group__5 : rule__DriftValue__Group__5__Impl ;
    public final void rule__DriftValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2411:1: ( rule__DriftValue__Group__5__Impl )
            // InternalKPIFormulaDSL.g:2412:2: rule__DriftValue__Group__5__Impl
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
    // InternalKPIFormulaDSL.g:2418:1: rule__DriftValue__Group__5__Impl : ( ( rule__DriftValue__WindowUnitAssignment_5 ) ) ;
    public final void rule__DriftValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2422:1: ( ( ( rule__DriftValue__WindowUnitAssignment_5 ) ) )
            // InternalKPIFormulaDSL.g:2423:1: ( ( rule__DriftValue__WindowUnitAssignment_5 ) )
            {
            // InternalKPIFormulaDSL.g:2423:1: ( ( rule__DriftValue__WindowUnitAssignment_5 ) )
            // InternalKPIFormulaDSL.g:2424:2: ( rule__DriftValue__WindowUnitAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDriftValueAccess().getWindowUnitAssignment_5()); 
            }
            // InternalKPIFormulaDSL.g:2425:2: ( rule__DriftValue__WindowUnitAssignment_5 )
            // InternalKPIFormulaDSL.g:2425:3: rule__DriftValue__WindowUnitAssignment_5
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
    // InternalKPIFormulaDSL.g:2434:1: rule__Minimum__Group__0 : rule__Minimum__Group__0__Impl rule__Minimum__Group__1 ;
    public final void rule__Minimum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2438:1: ( rule__Minimum__Group__0__Impl rule__Minimum__Group__1 )
            // InternalKPIFormulaDSL.g:2439:2: rule__Minimum__Group__0__Impl rule__Minimum__Group__1
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
    // InternalKPIFormulaDSL.g:2446:1: rule__Minimum__Group__0__Impl : ( () ) ;
    public final void rule__Minimum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2450:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:2451:1: ( () )
            {
            // InternalKPIFormulaDSL.g:2451:1: ( () )
            // InternalKPIFormulaDSL.g:2452:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinimumAccess().getMinimumAction_0()); 
            }
            // InternalKPIFormulaDSL.g:2453:2: ()
            // InternalKPIFormulaDSL.g:2453:3: 
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
    // InternalKPIFormulaDSL.g:2461:1: rule__Minimum__Group__1 : rule__Minimum__Group__1__Impl ;
    public final void rule__Minimum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2465:1: ( rule__Minimum__Group__1__Impl )
            // InternalKPIFormulaDSL.g:2466:2: rule__Minimum__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:2472:1: rule__Minimum__Group__1__Impl : ( 'Minimum' ) ;
    public final void rule__Minimum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2476:1: ( ( 'Minimum' ) )
            // InternalKPIFormulaDSL.g:2477:1: ( 'Minimum' )
            {
            // InternalKPIFormulaDSL.g:2477:1: ( 'Minimum' )
            // InternalKPIFormulaDSL.g:2478:2: 'Minimum'
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
    // InternalKPIFormulaDSL.g:2488:1: rule__Maximum__Group__0 : rule__Maximum__Group__0__Impl rule__Maximum__Group__1 ;
    public final void rule__Maximum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2492:1: ( rule__Maximum__Group__0__Impl rule__Maximum__Group__1 )
            // InternalKPIFormulaDSL.g:2493:2: rule__Maximum__Group__0__Impl rule__Maximum__Group__1
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
    // InternalKPIFormulaDSL.g:2500:1: rule__Maximum__Group__0__Impl : ( () ) ;
    public final void rule__Maximum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2504:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:2505:1: ( () )
            {
            // InternalKPIFormulaDSL.g:2505:1: ( () )
            // InternalKPIFormulaDSL.g:2506:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaximumAccess().getMaximumAction_0()); 
            }
            // InternalKPIFormulaDSL.g:2507:2: ()
            // InternalKPIFormulaDSL.g:2507:3: 
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
    // InternalKPIFormulaDSL.g:2515:1: rule__Maximum__Group__1 : rule__Maximum__Group__1__Impl ;
    public final void rule__Maximum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2519:1: ( rule__Maximum__Group__1__Impl )
            // InternalKPIFormulaDSL.g:2520:2: rule__Maximum__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:2526:1: rule__Maximum__Group__1__Impl : ( 'Maximum' ) ;
    public final void rule__Maximum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2530:1: ( ( 'Maximum' ) )
            // InternalKPIFormulaDSL.g:2531:1: ( 'Maximum' )
            {
            // InternalKPIFormulaDSL.g:2531:1: ( 'Maximum' )
            // InternalKPIFormulaDSL.g:2532:2: 'Maximum'
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
    // InternalKPIFormulaDSL.g:2542:1: rule__Average__Group__0 : rule__Average__Group__0__Impl rule__Average__Group__1 ;
    public final void rule__Average__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2546:1: ( rule__Average__Group__0__Impl rule__Average__Group__1 )
            // InternalKPIFormulaDSL.g:2547:2: rule__Average__Group__0__Impl rule__Average__Group__1
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
    // InternalKPIFormulaDSL.g:2554:1: rule__Average__Group__0__Impl : ( () ) ;
    public final void rule__Average__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2558:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:2559:1: ( () )
            {
            // InternalKPIFormulaDSL.g:2559:1: ( () )
            // InternalKPIFormulaDSL.g:2560:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAverageAccess().getAverageAction_0()); 
            }
            // InternalKPIFormulaDSL.g:2561:2: ()
            // InternalKPIFormulaDSL.g:2561:3: 
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
    // InternalKPIFormulaDSL.g:2569:1: rule__Average__Group__1 : rule__Average__Group__1__Impl ;
    public final void rule__Average__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2573:1: ( rule__Average__Group__1__Impl )
            // InternalKPIFormulaDSL.g:2574:2: rule__Average__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:2580:1: rule__Average__Group__1__Impl : ( 'Average' ) ;
    public final void rule__Average__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2584:1: ( ( 'Average' ) )
            // InternalKPIFormulaDSL.g:2585:1: ( 'Average' )
            {
            // InternalKPIFormulaDSL.g:2585:1: ( 'Average' )
            // InternalKPIFormulaDSL.g:2586:2: 'Average'
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
    // InternalKPIFormulaDSL.g:2596:1: rule__Median__Group__0 : rule__Median__Group__0__Impl rule__Median__Group__1 ;
    public final void rule__Median__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2600:1: ( rule__Median__Group__0__Impl rule__Median__Group__1 )
            // InternalKPIFormulaDSL.g:2601:2: rule__Median__Group__0__Impl rule__Median__Group__1
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
    // InternalKPIFormulaDSL.g:2608:1: rule__Median__Group__0__Impl : ( () ) ;
    public final void rule__Median__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2612:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:2613:1: ( () )
            {
            // InternalKPIFormulaDSL.g:2613:1: ( () )
            // InternalKPIFormulaDSL.g:2614:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMedianAccess().getMedianAction_0()); 
            }
            // InternalKPIFormulaDSL.g:2615:2: ()
            // InternalKPIFormulaDSL.g:2615:3: 
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
    // InternalKPIFormulaDSL.g:2623:1: rule__Median__Group__1 : rule__Median__Group__1__Impl ;
    public final void rule__Median__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2627:1: ( rule__Median__Group__1__Impl )
            // InternalKPIFormulaDSL.g:2628:2: rule__Median__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:2634:1: rule__Median__Group__1__Impl : ( 'Median' ) ;
    public final void rule__Median__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2638:1: ( ( 'Median' ) )
            // InternalKPIFormulaDSL.g:2639:1: ( 'Median' )
            {
            // InternalKPIFormulaDSL.g:2639:1: ( 'Median' )
            // InternalKPIFormulaDSL.g:2640:2: 'Median'
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
    // InternalKPIFormulaDSL.g:2650:1: rule__StandardDeviation__Group__0 : rule__StandardDeviation__Group__0__Impl rule__StandardDeviation__Group__1 ;
    public final void rule__StandardDeviation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2654:1: ( rule__StandardDeviation__Group__0__Impl rule__StandardDeviation__Group__1 )
            // InternalKPIFormulaDSL.g:2655:2: rule__StandardDeviation__Group__0__Impl rule__StandardDeviation__Group__1
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
    // InternalKPIFormulaDSL.g:2662:1: rule__StandardDeviation__Group__0__Impl : ( () ) ;
    public final void rule__StandardDeviation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2666:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:2667:1: ( () )
            {
            // InternalKPIFormulaDSL.g:2667:1: ( () )
            // InternalKPIFormulaDSL.g:2668:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStandardDeviationAccess().getStandardDeviationAction_0()); 
            }
            // InternalKPIFormulaDSL.g:2669:2: ()
            // InternalKPIFormulaDSL.g:2669:3: 
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
    // InternalKPIFormulaDSL.g:2677:1: rule__StandardDeviation__Group__1 : rule__StandardDeviation__Group__1__Impl rule__StandardDeviation__Group__2 ;
    public final void rule__StandardDeviation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2681:1: ( rule__StandardDeviation__Group__1__Impl rule__StandardDeviation__Group__2 )
            // InternalKPIFormulaDSL.g:2682:2: rule__StandardDeviation__Group__1__Impl rule__StandardDeviation__Group__2
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
    // InternalKPIFormulaDSL.g:2689:1: rule__StandardDeviation__Group__1__Impl : ( 'Standard' ) ;
    public final void rule__StandardDeviation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2693:1: ( ( 'Standard' ) )
            // InternalKPIFormulaDSL.g:2694:1: ( 'Standard' )
            {
            // InternalKPIFormulaDSL.g:2694:1: ( 'Standard' )
            // InternalKPIFormulaDSL.g:2695:2: 'Standard'
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
    // InternalKPIFormulaDSL.g:2704:1: rule__StandardDeviation__Group__2 : rule__StandardDeviation__Group__2__Impl ;
    public final void rule__StandardDeviation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2708:1: ( rule__StandardDeviation__Group__2__Impl )
            // InternalKPIFormulaDSL.g:2709:2: rule__StandardDeviation__Group__2__Impl
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
    // InternalKPIFormulaDSL.g:2715:1: rule__StandardDeviation__Group__2__Impl : ( 'deviation' ) ;
    public final void rule__StandardDeviation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2719:1: ( ( 'deviation' ) )
            // InternalKPIFormulaDSL.g:2720:1: ( 'deviation' )
            {
            // InternalKPIFormulaDSL.g:2720:1: ( 'deviation' )
            // InternalKPIFormulaDSL.g:2721:2: 'deviation'
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
    // InternalKPIFormulaDSL.g:2731:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2735:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalKPIFormulaDSL.g:2736:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalKPIFormulaDSL.g:2743:1: rule__Condition__Group__0__Impl : ( () ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2747:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:2748:1: ( () )
            {
            // InternalKPIFormulaDSL.g:2748:1: ( () )
            // InternalKPIFormulaDSL.g:2749:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getConditionalOpAction_0()); 
            }
            // InternalKPIFormulaDSL.g:2750:2: ()
            // InternalKPIFormulaDSL.g:2750:3: 
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
    // InternalKPIFormulaDSL.g:2758:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2762:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalKPIFormulaDSL.g:2763:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
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
    // InternalKPIFormulaDSL.g:2770:1: rule__Condition__Group__1__Impl : ( '{' ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2774:1: ( ( '{' ) )
            // InternalKPIFormulaDSL.g:2775:1: ( '{' )
            {
            // InternalKPIFormulaDSL.g:2775:1: ( '{' )
            // InternalKPIFormulaDSL.g:2776:2: '{'
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
    // InternalKPIFormulaDSL.g:2785:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2789:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalKPIFormulaDSL.g:2790:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
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
    // InternalKPIFormulaDSL.g:2797:1: rule__Condition__Group__2__Impl : ( ( ( rule__Condition__Group_2__0 ) ) ( ( rule__Condition__Group_2__0 )* ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2801:1: ( ( ( ( rule__Condition__Group_2__0 ) ) ( ( rule__Condition__Group_2__0 )* ) ) )
            // InternalKPIFormulaDSL.g:2802:1: ( ( ( rule__Condition__Group_2__0 ) ) ( ( rule__Condition__Group_2__0 )* ) )
            {
            // InternalKPIFormulaDSL.g:2802:1: ( ( ( rule__Condition__Group_2__0 ) ) ( ( rule__Condition__Group_2__0 )* ) )
            // InternalKPIFormulaDSL.g:2803:2: ( ( rule__Condition__Group_2__0 ) ) ( ( rule__Condition__Group_2__0 )* )
            {
            // InternalKPIFormulaDSL.g:2803:2: ( ( rule__Condition__Group_2__0 ) )
            // InternalKPIFormulaDSL.g:2804:3: ( rule__Condition__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup_2()); 
            }
            // InternalKPIFormulaDSL.g:2805:3: ( rule__Condition__Group_2__0 )
            // InternalKPIFormulaDSL.g:2805:4: rule__Condition__Group_2__0
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

            // InternalKPIFormulaDSL.g:2808:2: ( ( rule__Condition__Group_2__0 )* )
            // InternalKPIFormulaDSL.g:2809:3: ( rule__Condition__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup_2()); 
            }
            // InternalKPIFormulaDSL.g:2810:3: ( rule__Condition__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_FQN)||(LA18_0>=13 && LA18_0<=14)||LA18_0==58||(LA18_0>=61 && LA18_0<=62)||(LA18_0>=65 && LA18_0<=66)||(LA18_0>=68 && LA18_0<=72)||LA18_0==74||(LA18_0>=76 && LA18_0<=78)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:2810:4: rule__Condition__Group_2__0
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
    // InternalKPIFormulaDSL.g:2819:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl rule__Condition__Group__4 ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2823:1: ( rule__Condition__Group__3__Impl rule__Condition__Group__4 )
            // InternalKPIFormulaDSL.g:2824:2: rule__Condition__Group__3__Impl rule__Condition__Group__4
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
    // InternalKPIFormulaDSL.g:2831:1: rule__Condition__Group__3__Impl : ( ( 'otherwise' ) ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2835:1: ( ( ( 'otherwise' ) ) )
            // InternalKPIFormulaDSL.g:2836:1: ( ( 'otherwise' ) )
            {
            // InternalKPIFormulaDSL.g:2836:1: ( ( 'otherwise' ) )
            // InternalKPIFormulaDSL.g:2837:2: ( 'otherwise' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getOtherwiseKeyword_3()); 
            }
            // InternalKPIFormulaDSL.g:2838:2: ( 'otherwise' )
            // InternalKPIFormulaDSL.g:2838:3: 'otherwise'
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
    // InternalKPIFormulaDSL.g:2846:1: rule__Condition__Group__4 : rule__Condition__Group__4__Impl rule__Condition__Group__5 ;
    public final void rule__Condition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2850:1: ( rule__Condition__Group__4__Impl rule__Condition__Group__5 )
            // InternalKPIFormulaDSL.g:2851:2: rule__Condition__Group__4__Impl rule__Condition__Group__5
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
    // InternalKPIFormulaDSL.g:2858:1: rule__Condition__Group__4__Impl : ( '->' ) ;
    public final void rule__Condition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2862:1: ( ( '->' ) )
            // InternalKPIFormulaDSL.g:2863:1: ( '->' )
            {
            // InternalKPIFormulaDSL.g:2863:1: ( '->' )
            // InternalKPIFormulaDSL.g:2864:2: '->'
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
    // InternalKPIFormulaDSL.g:2873:1: rule__Condition__Group__5 : rule__Condition__Group__5__Impl rule__Condition__Group__6 ;
    public final void rule__Condition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2877:1: ( rule__Condition__Group__5__Impl rule__Condition__Group__6 )
            // InternalKPIFormulaDSL.g:2878:2: rule__Condition__Group__5__Impl rule__Condition__Group__6
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
    // InternalKPIFormulaDSL.g:2885:1: rule__Condition__Group__5__Impl : ( ( rule__Condition__ResultsAssignment_5 ) ) ;
    public final void rule__Condition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2889:1: ( ( ( rule__Condition__ResultsAssignment_5 ) ) )
            // InternalKPIFormulaDSL.g:2890:1: ( ( rule__Condition__ResultsAssignment_5 ) )
            {
            // InternalKPIFormulaDSL.g:2890:1: ( ( rule__Condition__ResultsAssignment_5 ) )
            // InternalKPIFormulaDSL.g:2891:2: ( rule__Condition__ResultsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getResultsAssignment_5()); 
            }
            // InternalKPIFormulaDSL.g:2892:2: ( rule__Condition__ResultsAssignment_5 )
            // InternalKPIFormulaDSL.g:2892:3: rule__Condition__ResultsAssignment_5
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
    // InternalKPIFormulaDSL.g:2900:1: rule__Condition__Group__6 : rule__Condition__Group__6__Impl ;
    public final void rule__Condition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2904:1: ( rule__Condition__Group__6__Impl )
            // InternalKPIFormulaDSL.g:2905:2: rule__Condition__Group__6__Impl
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
    // InternalKPIFormulaDSL.g:2911:1: rule__Condition__Group__6__Impl : ( '}' ) ;
    public final void rule__Condition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2915:1: ( ( '}' ) )
            // InternalKPIFormulaDSL.g:2916:1: ( '}' )
            {
            // InternalKPIFormulaDSL.g:2916:1: ( '}' )
            // InternalKPIFormulaDSL.g:2917:2: '}'
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
    // InternalKPIFormulaDSL.g:2927:1: rule__Condition__Group_2__0 : rule__Condition__Group_2__0__Impl rule__Condition__Group_2__1 ;
    public final void rule__Condition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2931:1: ( rule__Condition__Group_2__0__Impl rule__Condition__Group_2__1 )
            // InternalKPIFormulaDSL.g:2932:2: rule__Condition__Group_2__0__Impl rule__Condition__Group_2__1
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
    // InternalKPIFormulaDSL.g:2939:1: rule__Condition__Group_2__0__Impl : ( ( rule__Condition__ConditionsAssignment_2_0 ) ) ;
    public final void rule__Condition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2943:1: ( ( ( rule__Condition__ConditionsAssignment_2_0 ) ) )
            // InternalKPIFormulaDSL.g:2944:1: ( ( rule__Condition__ConditionsAssignment_2_0 ) )
            {
            // InternalKPIFormulaDSL.g:2944:1: ( ( rule__Condition__ConditionsAssignment_2_0 ) )
            // InternalKPIFormulaDSL.g:2945:2: ( rule__Condition__ConditionsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getConditionsAssignment_2_0()); 
            }
            // InternalKPIFormulaDSL.g:2946:2: ( rule__Condition__ConditionsAssignment_2_0 )
            // InternalKPIFormulaDSL.g:2946:3: rule__Condition__ConditionsAssignment_2_0
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
    // InternalKPIFormulaDSL.g:2954:1: rule__Condition__Group_2__1 : rule__Condition__Group_2__1__Impl rule__Condition__Group_2__2 ;
    public final void rule__Condition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2958:1: ( rule__Condition__Group_2__1__Impl rule__Condition__Group_2__2 )
            // InternalKPIFormulaDSL.g:2959:2: rule__Condition__Group_2__1__Impl rule__Condition__Group_2__2
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
    // InternalKPIFormulaDSL.g:2966:1: rule__Condition__Group_2__1__Impl : ( '->' ) ;
    public final void rule__Condition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2970:1: ( ( '->' ) )
            // InternalKPIFormulaDSL.g:2971:1: ( '->' )
            {
            // InternalKPIFormulaDSL.g:2971:1: ( '->' )
            // InternalKPIFormulaDSL.g:2972:2: '->'
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
    // InternalKPIFormulaDSL.g:2981:1: rule__Condition__Group_2__2 : rule__Condition__Group_2__2__Impl rule__Condition__Group_2__3 ;
    public final void rule__Condition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2985:1: ( rule__Condition__Group_2__2__Impl rule__Condition__Group_2__3 )
            // InternalKPIFormulaDSL.g:2986:2: rule__Condition__Group_2__2__Impl rule__Condition__Group_2__3
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
    // InternalKPIFormulaDSL.g:2993:1: rule__Condition__Group_2__2__Impl : ( ( rule__Condition__ResultsAssignment_2_2 ) ) ;
    public final void rule__Condition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:2997:1: ( ( ( rule__Condition__ResultsAssignment_2_2 ) ) )
            // InternalKPIFormulaDSL.g:2998:1: ( ( rule__Condition__ResultsAssignment_2_2 ) )
            {
            // InternalKPIFormulaDSL.g:2998:1: ( ( rule__Condition__ResultsAssignment_2_2 ) )
            // InternalKPIFormulaDSL.g:2999:2: ( rule__Condition__ResultsAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getResultsAssignment_2_2()); 
            }
            // InternalKPIFormulaDSL.g:3000:2: ( rule__Condition__ResultsAssignment_2_2 )
            // InternalKPIFormulaDSL.g:3000:3: rule__Condition__ResultsAssignment_2_2
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
    // InternalKPIFormulaDSL.g:3008:1: rule__Condition__Group_2__3 : rule__Condition__Group_2__3__Impl ;
    public final void rule__Condition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3012:1: ( rule__Condition__Group_2__3__Impl )
            // InternalKPIFormulaDSL.g:3013:2: rule__Condition__Group_2__3__Impl
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
    // InternalKPIFormulaDSL.g:3019:1: rule__Condition__Group_2__3__Impl : ( ';' ) ;
    public final void rule__Condition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3023:1: ( ( ';' ) )
            // InternalKPIFormulaDSL.g:3024:1: ( ';' )
            {
            // InternalKPIFormulaDSL.g:3024:1: ( ';' )
            // InternalKPIFormulaDSL.g:3025:2: ';'
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
    // InternalKPIFormulaDSL.g:3035:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3039:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalKPIFormulaDSL.g:3040:2: rule__Or__Group__0__Impl rule__Or__Group__1
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
    // InternalKPIFormulaDSL.g:3047:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3051:1: ( ( ruleAnd ) )
            // InternalKPIFormulaDSL.g:3052:1: ( ruleAnd )
            {
            // InternalKPIFormulaDSL.g:3052:1: ( ruleAnd )
            // InternalKPIFormulaDSL.g:3053:2: ruleAnd
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
    // InternalKPIFormulaDSL.g:3062:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3066:1: ( rule__Or__Group__1__Impl )
            // InternalKPIFormulaDSL.g:3067:2: rule__Or__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:3073:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3077:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalKPIFormulaDSL.g:3078:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalKPIFormulaDSL.g:3078:1: ( ( rule__Or__Group_1__0 )* )
            // InternalKPIFormulaDSL.g:3079:2: ( rule__Or__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1()); 
            }
            // InternalKPIFormulaDSL.g:3080:2: ( rule__Or__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==49) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:3080:3: rule__Or__Group_1__0
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
    // InternalKPIFormulaDSL.g:3089:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3093:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalKPIFormulaDSL.g:3094:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
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
    // InternalKPIFormulaDSL.g:3101:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3105:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3106:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3106:1: ( () )
            // InternalKPIFormulaDSL.g:3107:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            }
            // InternalKPIFormulaDSL.g:3108:2: ()
            // InternalKPIFormulaDSL.g:3108:3: 
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
    // InternalKPIFormulaDSL.g:3116:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3120:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalKPIFormulaDSL.g:3121:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
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
    // InternalKPIFormulaDSL.g:3128:1: rule__Or__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3132:1: ( ( 'or' ) )
            // InternalKPIFormulaDSL.g:3133:1: ( 'or' )
            {
            // InternalKPIFormulaDSL.g:3133:1: ( 'or' )
            // InternalKPIFormulaDSL.g:3134:2: 'or'
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
    // InternalKPIFormulaDSL.g:3143:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3147:1: ( rule__Or__Group_1__2__Impl )
            // InternalKPIFormulaDSL.g:3148:2: rule__Or__Group_1__2__Impl
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
    // InternalKPIFormulaDSL.g:3154:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3158:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalKPIFormulaDSL.g:3159:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalKPIFormulaDSL.g:3159:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalKPIFormulaDSL.g:3160:2: ( rule__Or__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            }
            // InternalKPIFormulaDSL.g:3161:2: ( rule__Or__RightAssignment_1_2 )
            // InternalKPIFormulaDSL.g:3161:3: rule__Or__RightAssignment_1_2
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
    // InternalKPIFormulaDSL.g:3170:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3174:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalKPIFormulaDSL.g:3175:2: rule__And__Group__0__Impl rule__And__Group__1
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
    // InternalKPIFormulaDSL.g:3182:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3186:1: ( ( ruleEquality ) )
            // InternalKPIFormulaDSL.g:3187:1: ( ruleEquality )
            {
            // InternalKPIFormulaDSL.g:3187:1: ( ruleEquality )
            // InternalKPIFormulaDSL.g:3188:2: ruleEquality
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
    // InternalKPIFormulaDSL.g:3197:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3201:1: ( rule__And__Group__1__Impl )
            // InternalKPIFormulaDSL.g:3202:2: rule__And__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:3208:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3212:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalKPIFormulaDSL.g:3213:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalKPIFormulaDSL.g:3213:1: ( ( rule__And__Group_1__0 )* )
            // InternalKPIFormulaDSL.g:3214:2: ( rule__And__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1()); 
            }
            // InternalKPIFormulaDSL.g:3215:2: ( rule__And__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==50) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:3215:3: rule__And__Group_1__0
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
    // InternalKPIFormulaDSL.g:3224:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3228:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalKPIFormulaDSL.g:3229:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
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
    // InternalKPIFormulaDSL.g:3236:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3240:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3241:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3241:1: ( () )
            // InternalKPIFormulaDSL.g:3242:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            }
            // InternalKPIFormulaDSL.g:3243:2: ()
            // InternalKPIFormulaDSL.g:3243:3: 
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
    // InternalKPIFormulaDSL.g:3251:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3255:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalKPIFormulaDSL.g:3256:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
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
    // InternalKPIFormulaDSL.g:3263:1: rule__And__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3267:1: ( ( 'and' ) )
            // InternalKPIFormulaDSL.g:3268:1: ( 'and' )
            {
            // InternalKPIFormulaDSL.g:3268:1: ( 'and' )
            // InternalKPIFormulaDSL.g:3269:2: 'and'
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
    // InternalKPIFormulaDSL.g:3278:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3282:1: ( rule__And__Group_1__2__Impl )
            // InternalKPIFormulaDSL.g:3283:2: rule__And__Group_1__2__Impl
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
    // InternalKPIFormulaDSL.g:3289:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3293:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalKPIFormulaDSL.g:3294:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalKPIFormulaDSL.g:3294:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalKPIFormulaDSL.g:3295:2: ( rule__And__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            }
            // InternalKPIFormulaDSL.g:3296:2: ( rule__And__RightAssignment_1_2 )
            // InternalKPIFormulaDSL.g:3296:3: rule__And__RightAssignment_1_2
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
    // InternalKPIFormulaDSL.g:3305:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3309:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalKPIFormulaDSL.g:3310:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
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
    // InternalKPIFormulaDSL.g:3317:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3321:1: ( ( ruleComparison ) )
            // InternalKPIFormulaDSL.g:3322:1: ( ruleComparison )
            {
            // InternalKPIFormulaDSL.g:3322:1: ( ruleComparison )
            // InternalKPIFormulaDSL.g:3323:2: ruleComparison
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
    // InternalKPIFormulaDSL.g:3332:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3336:1: ( rule__Equality__Group__1__Impl )
            // InternalKPIFormulaDSL.g:3337:2: rule__Equality__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:3343:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3347:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalKPIFormulaDSL.g:3348:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalKPIFormulaDSL.g:3348:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalKPIFormulaDSL.g:3349:2: ( rule__Equality__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup_1()); 
            }
            // InternalKPIFormulaDSL.g:3350:2: ( rule__Equality__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=51 && LA21_0<=52)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:3350:3: rule__Equality__Group_1__0
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
    // InternalKPIFormulaDSL.g:3359:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3363:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalKPIFormulaDSL.g:3364:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
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
    // InternalKPIFormulaDSL.g:3371:1: rule__Equality__Group_1__0__Impl : ( ( rule__Equality__Alternatives_1_0 ) ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3375:1: ( ( ( rule__Equality__Alternatives_1_0 ) ) )
            // InternalKPIFormulaDSL.g:3376:1: ( ( rule__Equality__Alternatives_1_0 ) )
            {
            // InternalKPIFormulaDSL.g:3376:1: ( ( rule__Equality__Alternatives_1_0 ) )
            // InternalKPIFormulaDSL.g:3377:2: ( rule__Equality__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getAlternatives_1_0()); 
            }
            // InternalKPIFormulaDSL.g:3378:2: ( rule__Equality__Alternatives_1_0 )
            // InternalKPIFormulaDSL.g:3378:3: rule__Equality__Alternatives_1_0
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
    // InternalKPIFormulaDSL.g:3386:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3390:1: ( rule__Equality__Group_1__1__Impl )
            // InternalKPIFormulaDSL.g:3391:2: rule__Equality__Group_1__1__Impl
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
    // InternalKPIFormulaDSL.g:3397:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__RightAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3401:1: ( ( ( rule__Equality__RightAssignment_1_1 ) ) )
            // InternalKPIFormulaDSL.g:3402:1: ( ( rule__Equality__RightAssignment_1_1 ) )
            {
            // InternalKPIFormulaDSL.g:3402:1: ( ( rule__Equality__RightAssignment_1_1 ) )
            // InternalKPIFormulaDSL.g:3403:2: ( rule__Equality__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getRightAssignment_1_1()); 
            }
            // InternalKPIFormulaDSL.g:3404:2: ( rule__Equality__RightAssignment_1_1 )
            // InternalKPIFormulaDSL.g:3404:3: rule__Equality__RightAssignment_1_1
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
    // InternalKPIFormulaDSL.g:3413:1: rule__Equality__Group_1_0_0__0 : rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1 ;
    public final void rule__Equality__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3417:1: ( rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1 )
            // InternalKPIFormulaDSL.g:3418:2: rule__Equality__Group_1_0_0__0__Impl rule__Equality__Group_1_0_0__1
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
    // InternalKPIFormulaDSL.g:3425:1: rule__Equality__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3429:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3430:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3430:1: ( () )
            // InternalKPIFormulaDSL.g:3431:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0_0_0()); 
            }
            // InternalKPIFormulaDSL.g:3432:2: ()
            // InternalKPIFormulaDSL.g:3432:3: 
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
    // InternalKPIFormulaDSL.g:3440:1: rule__Equality__Group_1_0_0__1 : rule__Equality__Group_1_0_0__1__Impl ;
    public final void rule__Equality__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3444:1: ( rule__Equality__Group_1_0_0__1__Impl )
            // InternalKPIFormulaDSL.g:3445:2: rule__Equality__Group_1_0_0__1__Impl
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
    // InternalKPIFormulaDSL.g:3451:1: rule__Equality__Group_1_0_0__1__Impl : ( '==' ) ;
    public final void rule__Equality__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3455:1: ( ( '==' ) )
            // InternalKPIFormulaDSL.g:3456:1: ( '==' )
            {
            // InternalKPIFormulaDSL.g:3456:1: ( '==' )
            // InternalKPIFormulaDSL.g:3457:2: '=='
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
    // InternalKPIFormulaDSL.g:3467:1: rule__Equality__Group_1_0_1__0 : rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1 ;
    public final void rule__Equality__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3471:1: ( rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1 )
            // InternalKPIFormulaDSL.g:3472:2: rule__Equality__Group_1_0_1__0__Impl rule__Equality__Group_1_0_1__1
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
    // InternalKPIFormulaDSL.g:3479:1: rule__Equality__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3483:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3484:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3484:1: ( () )
            // InternalKPIFormulaDSL.g:3485:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getInequalityLeftAction_1_0_1_0()); 
            }
            // InternalKPIFormulaDSL.g:3486:2: ()
            // InternalKPIFormulaDSL.g:3486:3: 
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
    // InternalKPIFormulaDSL.g:3494:1: rule__Equality__Group_1_0_1__1 : rule__Equality__Group_1_0_1__1__Impl ;
    public final void rule__Equality__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3498:1: ( rule__Equality__Group_1_0_1__1__Impl )
            // InternalKPIFormulaDSL.g:3499:2: rule__Equality__Group_1_0_1__1__Impl
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
    // InternalKPIFormulaDSL.g:3505:1: rule__Equality__Group_1_0_1__1__Impl : ( '!=' ) ;
    public final void rule__Equality__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3509:1: ( ( '!=' ) )
            // InternalKPIFormulaDSL.g:3510:1: ( '!=' )
            {
            // InternalKPIFormulaDSL.g:3510:1: ( '!=' )
            // InternalKPIFormulaDSL.g:3511:2: '!='
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
    // InternalKPIFormulaDSL.g:3521:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3525:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalKPIFormulaDSL.g:3526:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
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
    // InternalKPIFormulaDSL.g:3533:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3537:1: ( ( rulePlusOrMinus ) )
            // InternalKPIFormulaDSL.g:3538:1: ( rulePlusOrMinus )
            {
            // InternalKPIFormulaDSL.g:3538:1: ( rulePlusOrMinus )
            // InternalKPIFormulaDSL.g:3539:2: rulePlusOrMinus
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
    // InternalKPIFormulaDSL.g:3548:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3552:1: ( rule__Comparison__Group__1__Impl )
            // InternalKPIFormulaDSL.g:3553:2: rule__Comparison__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:3559:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3563:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalKPIFormulaDSL.g:3564:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalKPIFormulaDSL.g:3564:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalKPIFormulaDSL.g:3565:2: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // InternalKPIFormulaDSL.g:3566:2: ( rule__Comparison__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=53 && LA22_0<=56)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:3566:3: rule__Comparison__Group_1__0
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
    // InternalKPIFormulaDSL.g:3575:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3579:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalKPIFormulaDSL.g:3580:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
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
    // InternalKPIFormulaDSL.g:3587:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Alternatives_1_0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3591:1: ( ( ( rule__Comparison__Alternatives_1_0 ) ) )
            // InternalKPIFormulaDSL.g:3592:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            {
            // InternalKPIFormulaDSL.g:3592:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            // InternalKPIFormulaDSL.g:3593:2: ( rule__Comparison__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            }
            // InternalKPIFormulaDSL.g:3594:2: ( rule__Comparison__Alternatives_1_0 )
            // InternalKPIFormulaDSL.g:3594:3: rule__Comparison__Alternatives_1_0
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
    // InternalKPIFormulaDSL.g:3602:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3606:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalKPIFormulaDSL.g:3607:2: rule__Comparison__Group_1__1__Impl
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
    // InternalKPIFormulaDSL.g:3613:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3617:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // InternalKPIFormulaDSL.g:3618:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // InternalKPIFormulaDSL.g:3618:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // InternalKPIFormulaDSL.g:3619:2: ( rule__Comparison__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            }
            // InternalKPIFormulaDSL.g:3620:2: ( rule__Comparison__RightAssignment_1_1 )
            // InternalKPIFormulaDSL.g:3620:3: rule__Comparison__RightAssignment_1_1
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
    // InternalKPIFormulaDSL.g:3629:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3633:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalKPIFormulaDSL.g:3634:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
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
    // InternalKPIFormulaDSL.g:3641:1: rule__Comparison__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3645:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3646:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3646:1: ( () )
            // InternalKPIFormulaDSL.g:3647:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGreaterEqLeftAction_1_0_0_0()); 
            }
            // InternalKPIFormulaDSL.g:3648:2: ()
            // InternalKPIFormulaDSL.g:3648:3: 
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
    // InternalKPIFormulaDSL.g:3656:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3660:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalKPIFormulaDSL.g:3661:2: rule__Comparison__Group_1_0_0__1__Impl
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
    // InternalKPIFormulaDSL.g:3667:1: rule__Comparison__Group_1_0_0__1__Impl : ( '>=' ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3671:1: ( ( '>=' ) )
            // InternalKPIFormulaDSL.g:3672:1: ( '>=' )
            {
            // InternalKPIFormulaDSL.g:3672:1: ( '>=' )
            // InternalKPIFormulaDSL.g:3673:2: '>='
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
    // InternalKPIFormulaDSL.g:3683:1: rule__Comparison__Group_1_0_1__0 : rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 ;
    public final void rule__Comparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3687:1: ( rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 )
            // InternalKPIFormulaDSL.g:3688:2: rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1
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
    // InternalKPIFormulaDSL.g:3695:1: rule__Comparison__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3699:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3700:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3700:1: ( () )
            // InternalKPIFormulaDSL.g:3701:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessEqLeftAction_1_0_1_0()); 
            }
            // InternalKPIFormulaDSL.g:3702:2: ()
            // InternalKPIFormulaDSL.g:3702:3: 
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
    // InternalKPIFormulaDSL.g:3710:1: rule__Comparison__Group_1_0_1__1 : rule__Comparison__Group_1_0_1__1__Impl ;
    public final void rule__Comparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3714:1: ( rule__Comparison__Group_1_0_1__1__Impl )
            // InternalKPIFormulaDSL.g:3715:2: rule__Comparison__Group_1_0_1__1__Impl
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
    // InternalKPIFormulaDSL.g:3721:1: rule__Comparison__Group_1_0_1__1__Impl : ( '<=' ) ;
    public final void rule__Comparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3725:1: ( ( '<=' ) )
            // InternalKPIFormulaDSL.g:3726:1: ( '<=' )
            {
            // InternalKPIFormulaDSL.g:3726:1: ( '<=' )
            // InternalKPIFormulaDSL.g:3727:2: '<='
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
    // InternalKPIFormulaDSL.g:3737:1: rule__Comparison__Group_1_0_2__0 : rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 ;
    public final void rule__Comparison__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3741:1: ( rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 )
            // InternalKPIFormulaDSL.g:3742:2: rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1
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
    // InternalKPIFormulaDSL.g:3749:1: rule__Comparison__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3753:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3754:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3754:1: ( () )
            // InternalKPIFormulaDSL.g:3755:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGreaterLeftAction_1_0_2_0()); 
            }
            // InternalKPIFormulaDSL.g:3756:2: ()
            // InternalKPIFormulaDSL.g:3756:3: 
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
    // InternalKPIFormulaDSL.g:3764:1: rule__Comparison__Group_1_0_2__1 : rule__Comparison__Group_1_0_2__1__Impl ;
    public final void rule__Comparison__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3768:1: ( rule__Comparison__Group_1_0_2__1__Impl )
            // InternalKPIFormulaDSL.g:3769:2: rule__Comparison__Group_1_0_2__1__Impl
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
    // InternalKPIFormulaDSL.g:3775:1: rule__Comparison__Group_1_0_2__1__Impl : ( '>' ) ;
    public final void rule__Comparison__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3779:1: ( ( '>' ) )
            // InternalKPIFormulaDSL.g:3780:1: ( '>' )
            {
            // InternalKPIFormulaDSL.g:3780:1: ( '>' )
            // InternalKPIFormulaDSL.g:3781:2: '>'
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
    // InternalKPIFormulaDSL.g:3791:1: rule__Comparison__Group_1_0_3__0 : rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1 ;
    public final void rule__Comparison__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3795:1: ( rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1 )
            // InternalKPIFormulaDSL.g:3796:2: rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1
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
    // InternalKPIFormulaDSL.g:3803:1: rule__Comparison__Group_1_0_3__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3807:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3808:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3808:1: ( () )
            // InternalKPIFormulaDSL.g:3809:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getLessLeftAction_1_0_3_0()); 
            }
            // InternalKPIFormulaDSL.g:3810:2: ()
            // InternalKPIFormulaDSL.g:3810:3: 
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
    // InternalKPIFormulaDSL.g:3818:1: rule__Comparison__Group_1_0_3__1 : rule__Comparison__Group_1_0_3__1__Impl ;
    public final void rule__Comparison__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3822:1: ( rule__Comparison__Group_1_0_3__1__Impl )
            // InternalKPIFormulaDSL.g:3823:2: rule__Comparison__Group_1_0_3__1__Impl
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
    // InternalKPIFormulaDSL.g:3829:1: rule__Comparison__Group_1_0_3__1__Impl : ( '<' ) ;
    public final void rule__Comparison__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3833:1: ( ( '<' ) )
            // InternalKPIFormulaDSL.g:3834:1: ( '<' )
            {
            // InternalKPIFormulaDSL.g:3834:1: ( '<' )
            // InternalKPIFormulaDSL.g:3835:2: '<'
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
    // InternalKPIFormulaDSL.g:3845:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3849:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalKPIFormulaDSL.g:3850:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
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
    // InternalKPIFormulaDSL.g:3857:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3861:1: ( ( ruleMulOrDiv ) )
            // InternalKPIFormulaDSL.g:3862:1: ( ruleMulOrDiv )
            {
            // InternalKPIFormulaDSL.g:3862:1: ( ruleMulOrDiv )
            // InternalKPIFormulaDSL.g:3863:2: ruleMulOrDiv
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
    // InternalKPIFormulaDSL.g:3872:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3876:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalKPIFormulaDSL.g:3877:2: rule__PlusOrMinus__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:3883:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3887:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalKPIFormulaDSL.g:3888:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalKPIFormulaDSL.g:3888:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalKPIFormulaDSL.g:3889:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            }
            // InternalKPIFormulaDSL.g:3890:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=57 && LA23_0<=58)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:3890:3: rule__PlusOrMinus__Group_1__0
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
    // InternalKPIFormulaDSL.g:3899:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3903:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalKPIFormulaDSL.g:3904:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
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
    // InternalKPIFormulaDSL.g:3911:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3915:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalKPIFormulaDSL.g:3916:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalKPIFormulaDSL.g:3916:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalKPIFormulaDSL.g:3917:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            }
            // InternalKPIFormulaDSL.g:3918:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalKPIFormulaDSL.g:3918:3: rule__PlusOrMinus__Alternatives_1_0
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
    // InternalKPIFormulaDSL.g:3926:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3930:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalKPIFormulaDSL.g:3931:2: rule__PlusOrMinus__Group_1__1__Impl
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
    // InternalKPIFormulaDSL.g:3937:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3941:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalKPIFormulaDSL.g:3942:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalKPIFormulaDSL.g:3942:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalKPIFormulaDSL.g:3943:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            }
            // InternalKPIFormulaDSL.g:3944:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalKPIFormulaDSL.g:3944:3: rule__PlusOrMinus__RightAssignment_1_1
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
    // InternalKPIFormulaDSL.g:3953:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3957:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalKPIFormulaDSL.g:3958:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
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
    // InternalKPIFormulaDSL.g:3965:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3969:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:3970:1: ( () )
            {
            // InternalKPIFormulaDSL.g:3970:1: ( () )
            // InternalKPIFormulaDSL.g:3971:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            }
            // InternalKPIFormulaDSL.g:3972:2: ()
            // InternalKPIFormulaDSL.g:3972:3: 
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
    // InternalKPIFormulaDSL.g:3980:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3984:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalKPIFormulaDSL.g:3985:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
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
    // InternalKPIFormulaDSL.g:3991:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:3995:1: ( ( '+' ) )
            // InternalKPIFormulaDSL.g:3996:1: ( '+' )
            {
            // InternalKPIFormulaDSL.g:3996:1: ( '+' )
            // InternalKPIFormulaDSL.g:3997:2: '+'
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
    // InternalKPIFormulaDSL.g:4007:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4011:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalKPIFormulaDSL.g:4012:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
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
    // InternalKPIFormulaDSL.g:4019:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4023:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4024:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4024:1: ( () )
            // InternalKPIFormulaDSL.g:4025:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            }
            // InternalKPIFormulaDSL.g:4026:2: ()
            // InternalKPIFormulaDSL.g:4026:3: 
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
    // InternalKPIFormulaDSL.g:4034:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4038:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalKPIFormulaDSL.g:4039:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
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
    // InternalKPIFormulaDSL.g:4045:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4049:1: ( ( '-' ) )
            // InternalKPIFormulaDSL.g:4050:1: ( '-' )
            {
            // InternalKPIFormulaDSL.g:4050:1: ( '-' )
            // InternalKPIFormulaDSL.g:4051:2: '-'
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
    // InternalKPIFormulaDSL.g:4061:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4065:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalKPIFormulaDSL.g:4066:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
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
    // InternalKPIFormulaDSL.g:4073:1: rule__MulOrDiv__Group__0__Impl : ( ruleOperator ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4077:1: ( ( ruleOperator ) )
            // InternalKPIFormulaDSL.g:4078:1: ( ruleOperator )
            {
            // InternalKPIFormulaDSL.g:4078:1: ( ruleOperator )
            // InternalKPIFormulaDSL.g:4079:2: ruleOperator
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
    // InternalKPIFormulaDSL.g:4088:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4092:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalKPIFormulaDSL.g:4093:2: rule__MulOrDiv__Group__1__Impl
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
    // InternalKPIFormulaDSL.g:4099:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4103:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalKPIFormulaDSL.g:4104:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalKPIFormulaDSL.g:4104:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalKPIFormulaDSL.g:4105:2: ( rule__MulOrDiv__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            }
            // InternalKPIFormulaDSL.g:4106:2: ( rule__MulOrDiv__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=59 && LA24_0<=60)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:4106:3: rule__MulOrDiv__Group_1__0
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
    // InternalKPIFormulaDSL.g:4115:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4119:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalKPIFormulaDSL.g:4120:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
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
    // InternalKPIFormulaDSL.g:4127:1: rule__MulOrDiv__Group_1__0__Impl : ( ( rule__MulOrDiv__Alternatives_1_0 ) ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4131:1: ( ( ( rule__MulOrDiv__Alternatives_1_0 ) ) )
            // InternalKPIFormulaDSL.g:4132:1: ( ( rule__MulOrDiv__Alternatives_1_0 ) )
            {
            // InternalKPIFormulaDSL.g:4132:1: ( ( rule__MulOrDiv__Alternatives_1_0 ) )
            // InternalKPIFormulaDSL.g:4133:2: ( rule__MulOrDiv__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getAlternatives_1_0()); 
            }
            // InternalKPIFormulaDSL.g:4134:2: ( rule__MulOrDiv__Alternatives_1_0 )
            // InternalKPIFormulaDSL.g:4134:3: rule__MulOrDiv__Alternatives_1_0
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
    // InternalKPIFormulaDSL.g:4142:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4146:1: ( rule__MulOrDiv__Group_1__1__Impl )
            // InternalKPIFormulaDSL.g:4147:2: rule__MulOrDiv__Group_1__1__Impl
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
    // InternalKPIFormulaDSL.g:4153:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4157:1: ( ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) )
            // InternalKPIFormulaDSL.g:4158:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            {
            // InternalKPIFormulaDSL.g:4158:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            // InternalKPIFormulaDSL.g:4159:2: ( rule__MulOrDiv__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); 
            }
            // InternalKPIFormulaDSL.g:4160:2: ( rule__MulOrDiv__RightAssignment_1_1 )
            // InternalKPIFormulaDSL.g:4160:3: rule__MulOrDiv__RightAssignment_1_1
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
    // InternalKPIFormulaDSL.g:4169:1: rule__MulOrDiv__Group_1_0_0__0 : rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1 ;
    public final void rule__MulOrDiv__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4173:1: ( rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1 )
            // InternalKPIFormulaDSL.g:4174:2: rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1
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
    // InternalKPIFormulaDSL.g:4181:1: rule__MulOrDiv__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4185:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4186:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4186:1: ( () )
            // InternalKPIFormulaDSL.g:4187:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getMultiplyLeftAction_1_0_0_0()); 
            }
            // InternalKPIFormulaDSL.g:4188:2: ()
            // InternalKPIFormulaDSL.g:4188:3: 
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
    // InternalKPIFormulaDSL.g:4196:1: rule__MulOrDiv__Group_1_0_0__1 : rule__MulOrDiv__Group_1_0_0__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4200:1: ( rule__MulOrDiv__Group_1_0_0__1__Impl )
            // InternalKPIFormulaDSL.g:4201:2: rule__MulOrDiv__Group_1_0_0__1__Impl
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
    // InternalKPIFormulaDSL.g:4207:1: rule__MulOrDiv__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MulOrDiv__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4211:1: ( ( '*' ) )
            // InternalKPIFormulaDSL.g:4212:1: ( '*' )
            {
            // InternalKPIFormulaDSL.g:4212:1: ( '*' )
            // InternalKPIFormulaDSL.g:4213:2: '*'
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
    // InternalKPIFormulaDSL.g:4223:1: rule__MulOrDiv__Group_1_0_1__0 : rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1 ;
    public final void rule__MulOrDiv__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4227:1: ( rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1 )
            // InternalKPIFormulaDSL.g:4228:2: rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1
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
    // InternalKPIFormulaDSL.g:4235:1: rule__MulOrDiv__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4239:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4240:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4240:1: ( () )
            // InternalKPIFormulaDSL.g:4241:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getDivideLeftAction_1_0_1_0()); 
            }
            // InternalKPIFormulaDSL.g:4242:2: ()
            // InternalKPIFormulaDSL.g:4242:3: 
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
    // InternalKPIFormulaDSL.g:4250:1: rule__MulOrDiv__Group_1_0_1__1 : rule__MulOrDiv__Group_1_0_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4254:1: ( rule__MulOrDiv__Group_1_0_1__1__Impl )
            // InternalKPIFormulaDSL.g:4255:2: rule__MulOrDiv__Group_1_0_1__1__Impl
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
    // InternalKPIFormulaDSL.g:4261:1: rule__MulOrDiv__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MulOrDiv__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4265:1: ( ( '/' ) )
            // InternalKPIFormulaDSL.g:4266:1: ( '/' )
            {
            // InternalKPIFormulaDSL.g:4266:1: ( '/' )
            // InternalKPIFormulaDSL.g:4267:2: '/'
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
    // InternalKPIFormulaDSL.g:4277:1: rule__Operator__Group_0__0 : rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1 ;
    public final void rule__Operator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4281:1: ( rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1 )
            // InternalKPIFormulaDSL.g:4282:2: rule__Operator__Group_0__0__Impl rule__Operator__Group_0__1
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
    // InternalKPIFormulaDSL.g:4289:1: rule__Operator__Group_0__0__Impl : ( () ) ;
    public final void rule__Operator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4293:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4294:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4294:1: ( () )
            // InternalKPIFormulaDSL.g:4295:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListSizeAction_0_0()); 
            }
            // InternalKPIFormulaDSL.g:4296:2: ()
            // InternalKPIFormulaDSL.g:4296:3: 
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
    // InternalKPIFormulaDSL.g:4304:1: rule__Operator__Group_0__1 : rule__Operator__Group_0__1__Impl rule__Operator__Group_0__2 ;
    public final void rule__Operator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4308:1: ( rule__Operator__Group_0__1__Impl rule__Operator__Group_0__2 )
            // InternalKPIFormulaDSL.g:4309:2: rule__Operator__Group_0__1__Impl rule__Operator__Group_0__2
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
    // InternalKPIFormulaDSL.g:4316:1: rule__Operator__Group_0__1__Impl : ( '|' ) ;
    public final void rule__Operator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4320:1: ( ( '|' ) )
            // InternalKPIFormulaDSL.g:4321:1: ( '|' )
            {
            // InternalKPIFormulaDSL.g:4321:1: ( '|' )
            // InternalKPIFormulaDSL.g:4322:2: '|'
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
    // InternalKPIFormulaDSL.g:4331:1: rule__Operator__Group_0__2 : rule__Operator__Group_0__2__Impl rule__Operator__Group_0__3 ;
    public final void rule__Operator__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4335:1: ( rule__Operator__Group_0__2__Impl rule__Operator__Group_0__3 )
            // InternalKPIFormulaDSL.g:4336:2: rule__Operator__Group_0__2__Impl rule__Operator__Group_0__3
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
    // InternalKPIFormulaDSL.g:4343:1: rule__Operator__Group_0__2__Impl : ( ( rule__Operator__ExpressionAssignment_0_2 ) ) ;
    public final void rule__Operator__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4347:1: ( ( ( rule__Operator__ExpressionAssignment_0_2 ) ) )
            // InternalKPIFormulaDSL.g:4348:1: ( ( rule__Operator__ExpressionAssignment_0_2 ) )
            {
            // InternalKPIFormulaDSL.g:4348:1: ( ( rule__Operator__ExpressionAssignment_0_2 ) )
            // InternalKPIFormulaDSL.g:4349:2: ( rule__Operator__ExpressionAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getExpressionAssignment_0_2()); 
            }
            // InternalKPIFormulaDSL.g:4350:2: ( rule__Operator__ExpressionAssignment_0_2 )
            // InternalKPIFormulaDSL.g:4350:3: rule__Operator__ExpressionAssignment_0_2
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
    // InternalKPIFormulaDSL.g:4358:1: rule__Operator__Group_0__3 : rule__Operator__Group_0__3__Impl ;
    public final void rule__Operator__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4362:1: ( rule__Operator__Group_0__3__Impl )
            // InternalKPIFormulaDSL.g:4363:2: rule__Operator__Group_0__3__Impl
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
    // InternalKPIFormulaDSL.g:4369:1: rule__Operator__Group_0__3__Impl : ( '|' ) ;
    public final void rule__Operator__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4373:1: ( ( '|' ) )
            // InternalKPIFormulaDSL.g:4374:1: ( '|' )
            {
            // InternalKPIFormulaDSL.g:4374:1: ( '|' )
            // InternalKPIFormulaDSL.g:4375:2: '|'
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
    // InternalKPIFormulaDSL.g:4385:1: rule__Operator__Group_1__0 : rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1 ;
    public final void rule__Operator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4389:1: ( rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1 )
            // InternalKPIFormulaDSL.g:4390:2: rule__Operator__Group_1__0__Impl rule__Operator__Group_1__1
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
    // InternalKPIFormulaDSL.g:4397:1: rule__Operator__Group_1__0__Impl : ( () ) ;
    public final void rule__Operator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4401:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4402:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4402:1: ( () )
            // InternalKPIFormulaDSL.g:4403:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListLiteralAction_1_0()); 
            }
            // InternalKPIFormulaDSL.g:4404:2: ()
            // InternalKPIFormulaDSL.g:4404:3: 
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
    // InternalKPIFormulaDSL.g:4412:1: rule__Operator__Group_1__1 : rule__Operator__Group_1__1__Impl rule__Operator__Group_1__2 ;
    public final void rule__Operator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4416:1: ( rule__Operator__Group_1__1__Impl rule__Operator__Group_1__2 )
            // InternalKPIFormulaDSL.g:4417:2: rule__Operator__Group_1__1__Impl rule__Operator__Group_1__2
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
    // InternalKPIFormulaDSL.g:4424:1: rule__Operator__Group_1__1__Impl : ( '[' ) ;
    public final void rule__Operator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4428:1: ( ( '[' ) )
            // InternalKPIFormulaDSL.g:4429:1: ( '[' )
            {
            // InternalKPIFormulaDSL.g:4429:1: ( '[' )
            // InternalKPIFormulaDSL.g:4430:2: '['
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
    // InternalKPIFormulaDSL.g:4439:1: rule__Operator__Group_1__2 : rule__Operator__Group_1__2__Impl rule__Operator__Group_1__3 ;
    public final void rule__Operator__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4443:1: ( rule__Operator__Group_1__2__Impl rule__Operator__Group_1__3 )
            // InternalKPIFormulaDSL.g:4444:2: rule__Operator__Group_1__2__Impl rule__Operator__Group_1__3
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
    // InternalKPIFormulaDSL.g:4451:1: rule__Operator__Group_1__2__Impl : ( ( rule__Operator__ElementsAssignment_1_2 ) ) ;
    public final void rule__Operator__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4455:1: ( ( ( rule__Operator__ElementsAssignment_1_2 ) ) )
            // InternalKPIFormulaDSL.g:4456:1: ( ( rule__Operator__ElementsAssignment_1_2 ) )
            {
            // InternalKPIFormulaDSL.g:4456:1: ( ( rule__Operator__ElementsAssignment_1_2 ) )
            // InternalKPIFormulaDSL.g:4457:2: ( rule__Operator__ElementsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getElementsAssignment_1_2()); 
            }
            // InternalKPIFormulaDSL.g:4458:2: ( rule__Operator__ElementsAssignment_1_2 )
            // InternalKPIFormulaDSL.g:4458:3: rule__Operator__ElementsAssignment_1_2
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
    // InternalKPIFormulaDSL.g:4466:1: rule__Operator__Group_1__3 : rule__Operator__Group_1__3__Impl rule__Operator__Group_1__4 ;
    public final void rule__Operator__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4470:1: ( rule__Operator__Group_1__3__Impl rule__Operator__Group_1__4 )
            // InternalKPIFormulaDSL.g:4471:2: rule__Operator__Group_1__3__Impl rule__Operator__Group_1__4
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
    // InternalKPIFormulaDSL.g:4478:1: rule__Operator__Group_1__3__Impl : ( ( rule__Operator__Group_1_3__0 )* ) ;
    public final void rule__Operator__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4482:1: ( ( ( rule__Operator__Group_1_3__0 )* ) )
            // InternalKPIFormulaDSL.g:4483:1: ( ( rule__Operator__Group_1_3__0 )* )
            {
            // InternalKPIFormulaDSL.g:4483:1: ( ( rule__Operator__Group_1_3__0 )* )
            // InternalKPIFormulaDSL.g:4484:2: ( rule__Operator__Group_1_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getGroup_1_3()); 
            }
            // InternalKPIFormulaDSL.g:4485:2: ( rule__Operator__Group_1_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==64) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:4485:3: rule__Operator__Group_1_3__0
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
    // InternalKPIFormulaDSL.g:4493:1: rule__Operator__Group_1__4 : rule__Operator__Group_1__4__Impl ;
    public final void rule__Operator__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4497:1: ( rule__Operator__Group_1__4__Impl )
            // InternalKPIFormulaDSL.g:4498:2: rule__Operator__Group_1__4__Impl
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
    // InternalKPIFormulaDSL.g:4504:1: rule__Operator__Group_1__4__Impl : ( ']' ) ;
    public final void rule__Operator__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4508:1: ( ( ']' ) )
            // InternalKPIFormulaDSL.g:4509:1: ( ']' )
            {
            // InternalKPIFormulaDSL.g:4509:1: ( ']' )
            // InternalKPIFormulaDSL.g:4510:2: ']'
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
    // InternalKPIFormulaDSL.g:4520:1: rule__Operator__Group_1_3__0 : rule__Operator__Group_1_3__0__Impl rule__Operator__Group_1_3__1 ;
    public final void rule__Operator__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4524:1: ( rule__Operator__Group_1_3__0__Impl rule__Operator__Group_1_3__1 )
            // InternalKPIFormulaDSL.g:4525:2: rule__Operator__Group_1_3__0__Impl rule__Operator__Group_1_3__1
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
    // InternalKPIFormulaDSL.g:4532:1: rule__Operator__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__Operator__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4536:1: ( ( ',' ) )
            // InternalKPIFormulaDSL.g:4537:1: ( ',' )
            {
            // InternalKPIFormulaDSL.g:4537:1: ( ',' )
            // InternalKPIFormulaDSL.g:4538:2: ','
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
    // InternalKPIFormulaDSL.g:4547:1: rule__Operator__Group_1_3__1 : rule__Operator__Group_1_3__1__Impl ;
    public final void rule__Operator__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4551:1: ( rule__Operator__Group_1_3__1__Impl )
            // InternalKPIFormulaDSL.g:4552:2: rule__Operator__Group_1_3__1__Impl
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
    // InternalKPIFormulaDSL.g:4558:1: rule__Operator__Group_1_3__1__Impl : ( ( rule__Operator__ElementsAssignment_1_3_1 ) ) ;
    public final void rule__Operator__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4562:1: ( ( ( rule__Operator__ElementsAssignment_1_3_1 ) ) )
            // InternalKPIFormulaDSL.g:4563:1: ( ( rule__Operator__ElementsAssignment_1_3_1 ) )
            {
            // InternalKPIFormulaDSL.g:4563:1: ( ( rule__Operator__ElementsAssignment_1_3_1 ) )
            // InternalKPIFormulaDSL.g:4564:2: ( rule__Operator__ElementsAssignment_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getElementsAssignment_1_3_1()); 
            }
            // InternalKPIFormulaDSL.g:4565:2: ( rule__Operator__ElementsAssignment_1_3_1 )
            // InternalKPIFormulaDSL.g:4565:3: rule__Operator__ElementsAssignment_1_3_1
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
    // InternalKPIFormulaDSL.g:4574:1: rule__Operator__Group_2__0 : rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 ;
    public final void rule__Operator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4578:1: ( rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1 )
            // InternalKPIFormulaDSL.g:4579:2: rule__Operator__Group_2__0__Impl rule__Operator__Group_2__1
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
    // InternalKPIFormulaDSL.g:4586:1: rule__Operator__Group_2__0__Impl : ( () ) ;
    public final void rule__Operator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4590:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4591:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4591:1: ( () )
            // InternalKPIFormulaDSL.g:4592:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getAvgOpAction_2_0()); 
            }
            // InternalKPIFormulaDSL.g:4593:2: ()
            // InternalKPIFormulaDSL.g:4593:3: 
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
    // InternalKPIFormulaDSL.g:4601:1: rule__Operator__Group_2__1 : rule__Operator__Group_2__1__Impl rule__Operator__Group_2__2 ;
    public final void rule__Operator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4605:1: ( rule__Operator__Group_2__1__Impl rule__Operator__Group_2__2 )
            // InternalKPIFormulaDSL.g:4606:2: rule__Operator__Group_2__1__Impl rule__Operator__Group_2__2
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
    // InternalKPIFormulaDSL.g:4613:1: rule__Operator__Group_2__1__Impl : ( 'AVERAGE' ) ;
    public final void rule__Operator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4617:1: ( ( 'AVERAGE' ) )
            // InternalKPIFormulaDSL.g:4618:1: ( 'AVERAGE' )
            {
            // InternalKPIFormulaDSL.g:4618:1: ( 'AVERAGE' )
            // InternalKPIFormulaDSL.g:4619:2: 'AVERAGE'
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
    // InternalKPIFormulaDSL.g:4628:1: rule__Operator__Group_2__2 : rule__Operator__Group_2__2__Impl rule__Operator__Group_2__3 ;
    public final void rule__Operator__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4632:1: ( rule__Operator__Group_2__2__Impl rule__Operator__Group_2__3 )
            // InternalKPIFormulaDSL.g:4633:2: rule__Operator__Group_2__2__Impl rule__Operator__Group_2__3
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
    // InternalKPIFormulaDSL.g:4640:1: rule__Operator__Group_2__2__Impl : ( '(' ) ;
    public final void rule__Operator__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4644:1: ( ( '(' ) )
            // InternalKPIFormulaDSL.g:4645:1: ( '(' )
            {
            // InternalKPIFormulaDSL.g:4645:1: ( '(' )
            // InternalKPIFormulaDSL.g:4646:2: '('
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
    // InternalKPIFormulaDSL.g:4655:1: rule__Operator__Group_2__3 : rule__Operator__Group_2__3__Impl rule__Operator__Group_2__4 ;
    public final void rule__Operator__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4659:1: ( rule__Operator__Group_2__3__Impl rule__Operator__Group_2__4 )
            // InternalKPIFormulaDSL.g:4660:2: rule__Operator__Group_2__3__Impl rule__Operator__Group_2__4
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
    // InternalKPIFormulaDSL.g:4667:1: rule__Operator__Group_2__3__Impl : ( ( rule__Operator__ListAssignment_2_3 ) ) ;
    public final void rule__Operator__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4671:1: ( ( ( rule__Operator__ListAssignment_2_3 ) ) )
            // InternalKPIFormulaDSL.g:4672:1: ( ( rule__Operator__ListAssignment_2_3 ) )
            {
            // InternalKPIFormulaDSL.g:4672:1: ( ( rule__Operator__ListAssignment_2_3 ) )
            // InternalKPIFormulaDSL.g:4673:2: ( rule__Operator__ListAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListAssignment_2_3()); 
            }
            // InternalKPIFormulaDSL.g:4674:2: ( rule__Operator__ListAssignment_2_3 )
            // InternalKPIFormulaDSL.g:4674:3: rule__Operator__ListAssignment_2_3
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
    // InternalKPIFormulaDSL.g:4682:1: rule__Operator__Group_2__4 : rule__Operator__Group_2__4__Impl ;
    public final void rule__Operator__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4686:1: ( rule__Operator__Group_2__4__Impl )
            // InternalKPIFormulaDSL.g:4687:2: rule__Operator__Group_2__4__Impl
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
    // InternalKPIFormulaDSL.g:4693:1: rule__Operator__Group_2__4__Impl : ( ')' ) ;
    public final void rule__Operator__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4697:1: ( ( ')' ) )
            // InternalKPIFormulaDSL.g:4698:1: ( ')' )
            {
            // InternalKPIFormulaDSL.g:4698:1: ( ')' )
            // InternalKPIFormulaDSL.g:4699:2: ')'
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
    // InternalKPIFormulaDSL.g:4709:1: rule__Operator__Group_3__0 : rule__Operator__Group_3__0__Impl rule__Operator__Group_3__1 ;
    public final void rule__Operator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4713:1: ( rule__Operator__Group_3__0__Impl rule__Operator__Group_3__1 )
            // InternalKPIFormulaDSL.g:4714:2: rule__Operator__Group_3__0__Impl rule__Operator__Group_3__1
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
    // InternalKPIFormulaDSL.g:4721:1: rule__Operator__Group_3__0__Impl : ( () ) ;
    public final void rule__Operator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4725:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4726:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4726:1: ( () )
            // InternalKPIFormulaDSL.g:4727:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getWeightedSumOpAction_3_0()); 
            }
            // InternalKPIFormulaDSL.g:4728:2: ()
            // InternalKPIFormulaDSL.g:4728:3: 
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
    // InternalKPIFormulaDSL.g:4736:1: rule__Operator__Group_3__1 : rule__Operator__Group_3__1__Impl rule__Operator__Group_3__2 ;
    public final void rule__Operator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4740:1: ( rule__Operator__Group_3__1__Impl rule__Operator__Group_3__2 )
            // InternalKPIFormulaDSL.g:4741:2: rule__Operator__Group_3__1__Impl rule__Operator__Group_3__2
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
    // InternalKPIFormulaDSL.g:4748:1: rule__Operator__Group_3__1__Impl : ( 'WEIGHTED_SUM' ) ;
    public final void rule__Operator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4752:1: ( ( 'WEIGHTED_SUM' ) )
            // InternalKPIFormulaDSL.g:4753:1: ( 'WEIGHTED_SUM' )
            {
            // InternalKPIFormulaDSL.g:4753:1: ( 'WEIGHTED_SUM' )
            // InternalKPIFormulaDSL.g:4754:2: 'WEIGHTED_SUM'
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
    // InternalKPIFormulaDSL.g:4763:1: rule__Operator__Group_3__2 : rule__Operator__Group_3__2__Impl rule__Operator__Group_3__3 ;
    public final void rule__Operator__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4767:1: ( rule__Operator__Group_3__2__Impl rule__Operator__Group_3__3 )
            // InternalKPIFormulaDSL.g:4768:2: rule__Operator__Group_3__2__Impl rule__Operator__Group_3__3
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
    // InternalKPIFormulaDSL.g:4775:1: rule__Operator__Group_3__2__Impl : ( '(' ) ;
    public final void rule__Operator__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4779:1: ( ( '(' ) )
            // InternalKPIFormulaDSL.g:4780:1: ( '(' )
            {
            // InternalKPIFormulaDSL.g:4780:1: ( '(' )
            // InternalKPIFormulaDSL.g:4781:2: '('
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
    // InternalKPIFormulaDSL.g:4790:1: rule__Operator__Group_3__3 : rule__Operator__Group_3__3__Impl rule__Operator__Group_3__4 ;
    public final void rule__Operator__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4794:1: ( rule__Operator__Group_3__3__Impl rule__Operator__Group_3__4 )
            // InternalKPIFormulaDSL.g:4795:2: rule__Operator__Group_3__3__Impl rule__Operator__Group_3__4
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
    // InternalKPIFormulaDSL.g:4802:1: rule__Operator__Group_3__3__Impl : ( ( rule__Operator__ListAssignment_3_3 ) ) ;
    public final void rule__Operator__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4806:1: ( ( ( rule__Operator__ListAssignment_3_3 ) ) )
            // InternalKPIFormulaDSL.g:4807:1: ( ( rule__Operator__ListAssignment_3_3 ) )
            {
            // InternalKPIFormulaDSL.g:4807:1: ( ( rule__Operator__ListAssignment_3_3 ) )
            // InternalKPIFormulaDSL.g:4808:2: ( rule__Operator__ListAssignment_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListAssignment_3_3()); 
            }
            // InternalKPIFormulaDSL.g:4809:2: ( rule__Operator__ListAssignment_3_3 )
            // InternalKPIFormulaDSL.g:4809:3: rule__Operator__ListAssignment_3_3
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
    // InternalKPIFormulaDSL.g:4817:1: rule__Operator__Group_3__4 : rule__Operator__Group_3__4__Impl rule__Operator__Group_3__5 ;
    public final void rule__Operator__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4821:1: ( rule__Operator__Group_3__4__Impl rule__Operator__Group_3__5 )
            // InternalKPIFormulaDSL.g:4822:2: rule__Operator__Group_3__4__Impl rule__Operator__Group_3__5
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
    // InternalKPIFormulaDSL.g:4829:1: rule__Operator__Group_3__4__Impl : ( ',' ) ;
    public final void rule__Operator__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4833:1: ( ( ',' ) )
            // InternalKPIFormulaDSL.g:4834:1: ( ',' )
            {
            // InternalKPIFormulaDSL.g:4834:1: ( ',' )
            // InternalKPIFormulaDSL.g:4835:2: ','
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
    // InternalKPIFormulaDSL.g:4844:1: rule__Operator__Group_3__5 : rule__Operator__Group_3__5__Impl rule__Operator__Group_3__6 ;
    public final void rule__Operator__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4848:1: ( rule__Operator__Group_3__5__Impl rule__Operator__Group_3__6 )
            // InternalKPIFormulaDSL.g:4849:2: rule__Operator__Group_3__5__Impl rule__Operator__Group_3__6
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
    // InternalKPIFormulaDSL.g:4856:1: rule__Operator__Group_3__5__Impl : ( ( rule__Operator__WeightsAssignment_3_5 ) ) ;
    public final void rule__Operator__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4860:1: ( ( ( rule__Operator__WeightsAssignment_3_5 ) ) )
            // InternalKPIFormulaDSL.g:4861:1: ( ( rule__Operator__WeightsAssignment_3_5 ) )
            {
            // InternalKPIFormulaDSL.g:4861:1: ( ( rule__Operator__WeightsAssignment_3_5 ) )
            // InternalKPIFormulaDSL.g:4862:2: ( rule__Operator__WeightsAssignment_3_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getWeightsAssignment_3_5()); 
            }
            // InternalKPIFormulaDSL.g:4863:2: ( rule__Operator__WeightsAssignment_3_5 )
            // InternalKPIFormulaDSL.g:4863:3: rule__Operator__WeightsAssignment_3_5
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
    // InternalKPIFormulaDSL.g:4871:1: rule__Operator__Group_3__6 : rule__Operator__Group_3__6__Impl ;
    public final void rule__Operator__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4875:1: ( rule__Operator__Group_3__6__Impl )
            // InternalKPIFormulaDSL.g:4876:2: rule__Operator__Group_3__6__Impl
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
    // InternalKPIFormulaDSL.g:4882:1: rule__Operator__Group_3__6__Impl : ( ')' ) ;
    public final void rule__Operator__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4886:1: ( ( ')' ) )
            // InternalKPIFormulaDSL.g:4887:1: ( ')' )
            {
            // InternalKPIFormulaDSL.g:4887:1: ( ')' )
            // InternalKPIFormulaDSL.g:4888:2: ')'
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
    // InternalKPIFormulaDSL.g:4898:1: rule__Operator__Group_4__0 : rule__Operator__Group_4__0__Impl rule__Operator__Group_4__1 ;
    public final void rule__Operator__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4902:1: ( rule__Operator__Group_4__0__Impl rule__Operator__Group_4__1 )
            // InternalKPIFormulaDSL.g:4903:2: rule__Operator__Group_4__0__Impl rule__Operator__Group_4__1
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
    // InternalKPIFormulaDSL.g:4910:1: rule__Operator__Group_4__0__Impl : ( () ) ;
    public final void rule__Operator__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4914:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:4915:1: ( () )
            {
            // InternalKPIFormulaDSL.g:4915:1: ( () )
            // InternalKPIFormulaDSL.g:4916:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getMinOpAction_4_0()); 
            }
            // InternalKPIFormulaDSL.g:4917:2: ()
            // InternalKPIFormulaDSL.g:4917:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getMinOpAction_4_0()); 
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
    // InternalKPIFormulaDSL.g:4925:1: rule__Operator__Group_4__1 : rule__Operator__Group_4__1__Impl rule__Operator__Group_4__2 ;
    public final void rule__Operator__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4929:1: ( rule__Operator__Group_4__1__Impl rule__Operator__Group_4__2 )
            // InternalKPIFormulaDSL.g:4930:2: rule__Operator__Group_4__1__Impl rule__Operator__Group_4__2
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
    // InternalKPIFormulaDSL.g:4937:1: rule__Operator__Group_4__1__Impl : ( 'MIN' ) ;
    public final void rule__Operator__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4941:1: ( ( 'MIN' ) )
            // InternalKPIFormulaDSL.g:4942:1: ( 'MIN' )
            {
            // InternalKPIFormulaDSL.g:4942:1: ( 'MIN' )
            // InternalKPIFormulaDSL.g:4943:2: 'MIN'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getMINKeyword_4_1()); 
            }
            match(input,69,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getMINKeyword_4_1()); 
            }

            }


            }

        }
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
    // InternalKPIFormulaDSL.g:4952:1: rule__Operator__Group_4__2 : rule__Operator__Group_4__2__Impl rule__Operator__Group_4__3 ;
    public final void rule__Operator__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4956:1: ( rule__Operator__Group_4__2__Impl rule__Operator__Group_4__3 )
            // InternalKPIFormulaDSL.g:4957:2: rule__Operator__Group_4__2__Impl rule__Operator__Group_4__3
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
    // InternalKPIFormulaDSL.g:4964:1: rule__Operator__Group_4__2__Impl : ( '(' ) ;
    public final void rule__Operator__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4968:1: ( ( '(' ) )
            // InternalKPIFormulaDSL.g:4969:1: ( '(' )
            {
            // InternalKPIFormulaDSL.g:4969:1: ( '(' )
            // InternalKPIFormulaDSL.g:4970:2: '('
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
    // InternalKPIFormulaDSL.g:4979:1: rule__Operator__Group_4__3 : rule__Operator__Group_4__3__Impl rule__Operator__Group_4__4 ;
    public final void rule__Operator__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4983:1: ( rule__Operator__Group_4__3__Impl rule__Operator__Group_4__4 )
            // InternalKPIFormulaDSL.g:4984:2: rule__Operator__Group_4__3__Impl rule__Operator__Group_4__4
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
    // InternalKPIFormulaDSL.g:4991:1: rule__Operator__Group_4__3__Impl : ( ( rule__Operator__ListAssignment_4_3 ) ) ;
    public final void rule__Operator__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:4995:1: ( ( ( rule__Operator__ListAssignment_4_3 ) ) )
            // InternalKPIFormulaDSL.g:4996:1: ( ( rule__Operator__ListAssignment_4_3 ) )
            {
            // InternalKPIFormulaDSL.g:4996:1: ( ( rule__Operator__ListAssignment_4_3 ) )
            // InternalKPIFormulaDSL.g:4997:2: ( rule__Operator__ListAssignment_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListAssignment_4_3()); 
            }
            // InternalKPIFormulaDSL.g:4998:2: ( rule__Operator__ListAssignment_4_3 )
            // InternalKPIFormulaDSL.g:4998:3: rule__Operator__ListAssignment_4_3
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
    // InternalKPIFormulaDSL.g:5006:1: rule__Operator__Group_4__4 : rule__Operator__Group_4__4__Impl ;
    public final void rule__Operator__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5010:1: ( rule__Operator__Group_4__4__Impl )
            // InternalKPIFormulaDSL.g:5011:2: rule__Operator__Group_4__4__Impl
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
    // InternalKPIFormulaDSL.g:5017:1: rule__Operator__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Operator__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5021:1: ( ( ')' ) )
            // InternalKPIFormulaDSL.g:5022:1: ( ')' )
            {
            // InternalKPIFormulaDSL.g:5022:1: ( ')' )
            // InternalKPIFormulaDSL.g:5023:2: ')'
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
    // InternalKPIFormulaDSL.g:5033:1: rule__Operator__Group_5__0 : rule__Operator__Group_5__0__Impl rule__Operator__Group_5__1 ;
    public final void rule__Operator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5037:1: ( rule__Operator__Group_5__0__Impl rule__Operator__Group_5__1 )
            // InternalKPIFormulaDSL.g:5038:2: rule__Operator__Group_5__0__Impl rule__Operator__Group_5__1
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
    // InternalKPIFormulaDSL.g:5045:1: rule__Operator__Group_5__0__Impl : ( () ) ;
    public final void rule__Operator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5049:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:5050:1: ( () )
            {
            // InternalKPIFormulaDSL.g:5050:1: ( () )
            // InternalKPIFormulaDSL.g:5051:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getMaxOpAction_5_0()); 
            }
            // InternalKPIFormulaDSL.g:5052:2: ()
            // InternalKPIFormulaDSL.g:5052:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getMaxOpAction_5_0()); 
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
    // InternalKPIFormulaDSL.g:5060:1: rule__Operator__Group_5__1 : rule__Operator__Group_5__1__Impl rule__Operator__Group_5__2 ;
    public final void rule__Operator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5064:1: ( rule__Operator__Group_5__1__Impl rule__Operator__Group_5__2 )
            // InternalKPIFormulaDSL.g:5065:2: rule__Operator__Group_5__1__Impl rule__Operator__Group_5__2
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
    // InternalKPIFormulaDSL.g:5072:1: rule__Operator__Group_5__1__Impl : ( 'MAX' ) ;
    public final void rule__Operator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5076:1: ( ( 'MAX' ) )
            // InternalKPIFormulaDSL.g:5077:1: ( 'MAX' )
            {
            // InternalKPIFormulaDSL.g:5077:1: ( 'MAX' )
            // InternalKPIFormulaDSL.g:5078:2: 'MAX'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getMAXKeyword_5_1()); 
            }
            match(input,70,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getMAXKeyword_5_1()); 
            }

            }


            }

        }
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
    // InternalKPIFormulaDSL.g:5087:1: rule__Operator__Group_5__2 : rule__Operator__Group_5__2__Impl rule__Operator__Group_5__3 ;
    public final void rule__Operator__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5091:1: ( rule__Operator__Group_5__2__Impl rule__Operator__Group_5__3 )
            // InternalKPIFormulaDSL.g:5092:2: rule__Operator__Group_5__2__Impl rule__Operator__Group_5__3
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
    // InternalKPIFormulaDSL.g:5099:1: rule__Operator__Group_5__2__Impl : ( '(' ) ;
    public final void rule__Operator__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5103:1: ( ( '(' ) )
            // InternalKPIFormulaDSL.g:5104:1: ( '(' )
            {
            // InternalKPIFormulaDSL.g:5104:1: ( '(' )
            // InternalKPIFormulaDSL.g:5105:2: '('
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
    // InternalKPIFormulaDSL.g:5114:1: rule__Operator__Group_5__3 : rule__Operator__Group_5__3__Impl rule__Operator__Group_5__4 ;
    public final void rule__Operator__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5118:1: ( rule__Operator__Group_5__3__Impl rule__Operator__Group_5__4 )
            // InternalKPIFormulaDSL.g:5119:2: rule__Operator__Group_5__3__Impl rule__Operator__Group_5__4
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
    // InternalKPIFormulaDSL.g:5126:1: rule__Operator__Group_5__3__Impl : ( ( rule__Operator__ListAssignment_5_3 ) ) ;
    public final void rule__Operator__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5130:1: ( ( ( rule__Operator__ListAssignment_5_3 ) ) )
            // InternalKPIFormulaDSL.g:5131:1: ( ( rule__Operator__ListAssignment_5_3 ) )
            {
            // InternalKPIFormulaDSL.g:5131:1: ( ( rule__Operator__ListAssignment_5_3 ) )
            // InternalKPIFormulaDSL.g:5132:2: ( rule__Operator__ListAssignment_5_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListAssignment_5_3()); 
            }
            // InternalKPIFormulaDSL.g:5133:2: ( rule__Operator__ListAssignment_5_3 )
            // InternalKPIFormulaDSL.g:5133:3: rule__Operator__ListAssignment_5_3
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
    // InternalKPIFormulaDSL.g:5141:1: rule__Operator__Group_5__4 : rule__Operator__Group_5__4__Impl ;
    public final void rule__Operator__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5145:1: ( rule__Operator__Group_5__4__Impl )
            // InternalKPIFormulaDSL.g:5146:2: rule__Operator__Group_5__4__Impl
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
    // InternalKPIFormulaDSL.g:5152:1: rule__Operator__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Operator__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5156:1: ( ( ')' ) )
            // InternalKPIFormulaDSL.g:5157:1: ( ')' )
            {
            // InternalKPIFormulaDSL.g:5157:1: ( ')' )
            // InternalKPIFormulaDSL.g:5158:2: ')'
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
    // InternalKPIFormulaDSL.g:5168:1: rule__Operator__Group_6__0 : rule__Operator__Group_6__0__Impl rule__Operator__Group_6__1 ;
    public final void rule__Operator__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5172:1: ( rule__Operator__Group_6__0__Impl rule__Operator__Group_6__1 )
            // InternalKPIFormulaDSL.g:5173:2: rule__Operator__Group_6__0__Impl rule__Operator__Group_6__1
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
    // InternalKPIFormulaDSL.g:5180:1: rule__Operator__Group_6__0__Impl : ( () ) ;
    public final void rule__Operator__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5184:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:5185:1: ( () )
            {
            // InternalKPIFormulaDSL.g:5185:1: ( () )
            // InternalKPIFormulaDSL.g:5186:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getThresholdOpAction_6_0()); 
            }
            // InternalKPIFormulaDSL.g:5187:2: ()
            // InternalKPIFormulaDSL.g:5187:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getThresholdOpAction_6_0()); 
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
    // InternalKPIFormulaDSL.g:5195:1: rule__Operator__Group_6__1 : rule__Operator__Group_6__1__Impl rule__Operator__Group_6__2 ;
    public final void rule__Operator__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5199:1: ( rule__Operator__Group_6__1__Impl rule__Operator__Group_6__2 )
            // InternalKPIFormulaDSL.g:5200:2: rule__Operator__Group_6__1__Impl rule__Operator__Group_6__2
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
    // InternalKPIFormulaDSL.g:5207:1: rule__Operator__Group_6__1__Impl : ( 'THRESHOLD' ) ;
    public final void rule__Operator__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5211:1: ( ( 'THRESHOLD' ) )
            // InternalKPIFormulaDSL.g:5212:1: ( 'THRESHOLD' )
            {
            // InternalKPIFormulaDSL.g:5212:1: ( 'THRESHOLD' )
            // InternalKPIFormulaDSL.g:5213:2: 'THRESHOLD'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getTHRESHOLDKeyword_6_1()); 
            }
            match(input,71,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getTHRESHOLDKeyword_6_1()); 
            }

            }


            }

        }
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
    // InternalKPIFormulaDSL.g:5222:1: rule__Operator__Group_6__2 : rule__Operator__Group_6__2__Impl rule__Operator__Group_6__3 ;
    public final void rule__Operator__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5226:1: ( rule__Operator__Group_6__2__Impl rule__Operator__Group_6__3 )
            // InternalKPIFormulaDSL.g:5227:2: rule__Operator__Group_6__2__Impl rule__Operator__Group_6__3
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
    // InternalKPIFormulaDSL.g:5234:1: rule__Operator__Group_6__2__Impl : ( '(' ) ;
    public final void rule__Operator__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5238:1: ( ( '(' ) )
            // InternalKPIFormulaDSL.g:5239:1: ( '(' )
            {
            // InternalKPIFormulaDSL.g:5239:1: ( '(' )
            // InternalKPIFormulaDSL.g:5240:2: '('
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
    // InternalKPIFormulaDSL.g:5249:1: rule__Operator__Group_6__3 : rule__Operator__Group_6__3__Impl rule__Operator__Group_6__4 ;
    public final void rule__Operator__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5253:1: ( rule__Operator__Group_6__3__Impl rule__Operator__Group_6__4 )
            // InternalKPIFormulaDSL.g:5254:2: rule__Operator__Group_6__3__Impl rule__Operator__Group_6__4
            {
            pushFollow(FOLLOW_56);
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
    // InternalKPIFormulaDSL.g:5261:1: rule__Operator__Group_6__3__Impl : ( ( rule__Operator__ExpressionAssignment_6_3 ) ) ;
    public final void rule__Operator__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5265:1: ( ( ( rule__Operator__ExpressionAssignment_6_3 ) ) )
            // InternalKPIFormulaDSL.g:5266:1: ( ( rule__Operator__ExpressionAssignment_6_3 ) )
            {
            // InternalKPIFormulaDSL.g:5266:1: ( ( rule__Operator__ExpressionAssignment_6_3 ) )
            // InternalKPIFormulaDSL.g:5267:2: ( rule__Operator__ExpressionAssignment_6_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getExpressionAssignment_6_3()); 
            }
            // InternalKPIFormulaDSL.g:5268:2: ( rule__Operator__ExpressionAssignment_6_3 )
            // InternalKPIFormulaDSL.g:5268:3: rule__Operator__ExpressionAssignment_6_3
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ExpressionAssignment_6_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getExpressionAssignment_6_3()); 
            }

            }


            }

        }
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
    // InternalKPIFormulaDSL.g:5276:1: rule__Operator__Group_6__4 : rule__Operator__Group_6__4__Impl rule__Operator__Group_6__5 ;
    public final void rule__Operator__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5280:1: ( rule__Operator__Group_6__4__Impl rule__Operator__Group_6__5 )
            // InternalKPIFormulaDSL.g:5281:2: rule__Operator__Group_6__4__Impl rule__Operator__Group_6__5
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_6__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_6__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKPIFormulaDSL.g:5288:1: rule__Operator__Group_6__4__Impl : ( ',' ) ;
    public final void rule__Operator__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5292:1: ( ( ',' ) )
            // InternalKPIFormulaDSL.g:5293:1: ( ',' )
            {
            // InternalKPIFormulaDSL.g:5293:1: ( ',' )
            // InternalKPIFormulaDSL.g:5294:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getCommaKeyword_6_4()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getCommaKeyword_6_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Operator__Group_6__5"
    // InternalKPIFormulaDSL.g:5303:1: rule__Operator__Group_6__5 : rule__Operator__Group_6__5__Impl rule__Operator__Group_6__6 ;
    public final void rule__Operator__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5307:1: ( rule__Operator__Group_6__5__Impl rule__Operator__Group_6__6 )
            // InternalKPIFormulaDSL.g:5308:2: rule__Operator__Group_6__5__Impl rule__Operator__Group_6__6
            {
            pushFollow(FOLLOW_54);
            rule__Operator__Group_6__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_6__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_6__5"


    // $ANTLR start "rule__Operator__Group_6__5__Impl"
    // InternalKPIFormulaDSL.g:5315:1: rule__Operator__Group_6__5__Impl : ( ( rule__Operator__ThresholdAssignment_6_5 ) ) ;
    public final void rule__Operator__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5319:1: ( ( ( rule__Operator__ThresholdAssignment_6_5 ) ) )
            // InternalKPIFormulaDSL.g:5320:1: ( ( rule__Operator__ThresholdAssignment_6_5 ) )
            {
            // InternalKPIFormulaDSL.g:5320:1: ( ( rule__Operator__ThresholdAssignment_6_5 ) )
            // InternalKPIFormulaDSL.g:5321:2: ( rule__Operator__ThresholdAssignment_6_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getThresholdAssignment_6_5()); 
            }
            // InternalKPIFormulaDSL.g:5322:2: ( rule__Operator__ThresholdAssignment_6_5 )
            // InternalKPIFormulaDSL.g:5322:3: rule__Operator__ThresholdAssignment_6_5
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ThresholdAssignment_6_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getThresholdAssignment_6_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_6__5__Impl"


    // $ANTLR start "rule__Operator__Group_6__6"
    // InternalKPIFormulaDSL.g:5330:1: rule__Operator__Group_6__6 : rule__Operator__Group_6__6__Impl ;
    public final void rule__Operator__Group_6__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5334:1: ( rule__Operator__Group_6__6__Impl )
            // InternalKPIFormulaDSL.g:5335:2: rule__Operator__Group_6__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_6__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_6__6"


    // $ANTLR start "rule__Operator__Group_6__6__Impl"
    // InternalKPIFormulaDSL.g:5341:1: rule__Operator__Group_6__6__Impl : ( ')' ) ;
    public final void rule__Operator__Group_6__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5345:1: ( ( ')' ) )
            // InternalKPIFormulaDSL.g:5346:1: ( ')' )
            {
            // InternalKPIFormulaDSL.g:5346:1: ( ')' )
            // InternalKPIFormulaDSL.g:5347:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_6_6()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getRightParenthesisKeyword_6_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_6__6__Impl"


    // $ANTLR start "rule__Operator__Group_7__0"
    // InternalKPIFormulaDSL.g:5357:1: rule__Operator__Group_7__0 : rule__Operator__Group_7__0__Impl rule__Operator__Group_7__1 ;
    public final void rule__Operator__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5361:1: ( rule__Operator__Group_7__0__Impl rule__Operator__Group_7__1 )
            // InternalKPIFormulaDSL.g:5362:2: rule__Operator__Group_7__0__Impl rule__Operator__Group_7__1
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
    // InternalKPIFormulaDSL.g:5369:1: rule__Operator__Group_7__0__Impl : ( () ) ;
    public final void rule__Operator__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5373:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:5374:1: ( () )
            {
            // InternalKPIFormulaDSL.g:5374:1: ( () )
            // InternalKPIFormulaDSL.g:5375:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListIterationAction_7_0()); 
            }
            // InternalKPIFormulaDSL.g:5376:2: ()
            // InternalKPIFormulaDSL.g:5376:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListIterationAction_7_0()); 
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
    // InternalKPIFormulaDSL.g:5384:1: rule__Operator__Group_7__1 : rule__Operator__Group_7__1__Impl rule__Operator__Group_7__2 ;
    public final void rule__Operator__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5388:1: ( rule__Operator__Group_7__1__Impl rule__Operator__Group_7__2 )
            // InternalKPIFormulaDSL.g:5389:2: rule__Operator__Group_7__1__Impl rule__Operator__Group_7__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIFormulaDSL.g:5396:1: rule__Operator__Group_7__1__Impl : ( 'do' ) ;
    public final void rule__Operator__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5400:1: ( ( 'do' ) )
            // InternalKPIFormulaDSL.g:5401:1: ( 'do' )
            {
            // InternalKPIFormulaDSL.g:5401:1: ( 'do' )
            // InternalKPIFormulaDSL.g:5402:2: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getDoKeyword_7_1()); 
            }
            match(input,72,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getDoKeyword_7_1()); 
            }

            }


            }

        }
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
    // InternalKPIFormulaDSL.g:5411:1: rule__Operator__Group_7__2 : rule__Operator__Group_7__2__Impl rule__Operator__Group_7__3 ;
    public final void rule__Operator__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5415:1: ( rule__Operator__Group_7__2__Impl rule__Operator__Group_7__3 )
            // InternalKPIFormulaDSL.g:5416:2: rule__Operator__Group_7__2__Impl rule__Operator__Group_7__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalKPIFormulaDSL.g:5423:1: rule__Operator__Group_7__2__Impl : ( ( rule__Operator__ExpressionAssignment_7_2 ) ) ;
    public final void rule__Operator__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5427:1: ( ( ( rule__Operator__ExpressionAssignment_7_2 ) ) )
            // InternalKPIFormulaDSL.g:5428:1: ( ( rule__Operator__ExpressionAssignment_7_2 ) )
            {
            // InternalKPIFormulaDSL.g:5428:1: ( ( rule__Operator__ExpressionAssignment_7_2 ) )
            // InternalKPIFormulaDSL.g:5429:2: ( rule__Operator__ExpressionAssignment_7_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getExpressionAssignment_7_2()); 
            }
            // InternalKPIFormulaDSL.g:5430:2: ( rule__Operator__ExpressionAssignment_7_2 )
            // InternalKPIFormulaDSL.g:5430:3: rule__Operator__ExpressionAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ExpressionAssignment_7_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getExpressionAssignment_7_2()); 
            }

            }


            }

        }
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
    // InternalKPIFormulaDSL.g:5438:1: rule__Operator__Group_7__3 : rule__Operator__Group_7__3__Impl rule__Operator__Group_7__4 ;
    public final void rule__Operator__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5442:1: ( rule__Operator__Group_7__3__Impl rule__Operator__Group_7__4 )
            // InternalKPIFormulaDSL.g:5443:2: rule__Operator__Group_7__3__Impl rule__Operator__Group_7__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalKPIFormulaDSL.g:5450:1: rule__Operator__Group_7__3__Impl : ( 'for' ) ;
    public final void rule__Operator__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5454:1: ( ( 'for' ) )
            // InternalKPIFormulaDSL.g:5455:1: ( 'for' )
            {
            // InternalKPIFormulaDSL.g:5455:1: ( 'for' )
            // InternalKPIFormulaDSL.g:5456:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getForKeyword_7_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getForKeyword_7_3()); 
            }

            }


            }

        }
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
    // InternalKPIFormulaDSL.g:5465:1: rule__Operator__Group_7__4 : rule__Operator__Group_7__4__Impl rule__Operator__Group_7__5 ;
    public final void rule__Operator__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5469:1: ( rule__Operator__Group_7__4__Impl rule__Operator__Group_7__5 )
            // InternalKPIFormulaDSL.g:5470:2: rule__Operator__Group_7__4__Impl rule__Operator__Group_7__5
            {
            pushFollow(FOLLOW_61);
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
    // InternalKPIFormulaDSL.g:5477:1: rule__Operator__Group_7__4__Impl : ( ( rule__Operator__IteratorsAssignment_7_4 ) ) ;
    public final void rule__Operator__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5481:1: ( ( ( rule__Operator__IteratorsAssignment_7_4 ) ) )
            // InternalKPIFormulaDSL.g:5482:1: ( ( rule__Operator__IteratorsAssignment_7_4 ) )
            {
            // InternalKPIFormulaDSL.g:5482:1: ( ( rule__Operator__IteratorsAssignment_7_4 ) )
            // InternalKPIFormulaDSL.g:5483:2: ( rule__Operator__IteratorsAssignment_7_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsAssignment_7_4()); 
            }
            // InternalKPIFormulaDSL.g:5484:2: ( rule__Operator__IteratorsAssignment_7_4 )
            // InternalKPIFormulaDSL.g:5484:3: rule__Operator__IteratorsAssignment_7_4
            {
            pushFollow(FOLLOW_2);
            rule__Operator__IteratorsAssignment_7_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsAssignment_7_4()); 
            }

            }


            }

        }
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
    // InternalKPIFormulaDSL.g:5492:1: rule__Operator__Group_7__5 : rule__Operator__Group_7__5__Impl rule__Operator__Group_7__6 ;
    public final void rule__Operator__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5496:1: ( rule__Operator__Group_7__5__Impl rule__Operator__Group_7__6 )
            // InternalKPIFormulaDSL.g:5497:2: rule__Operator__Group_7__5__Impl rule__Operator__Group_7__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIFormulaDSL.g:5504:1: rule__Operator__Group_7__5__Impl : ( 'in' ) ;
    public final void rule__Operator__Group_7__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5508:1: ( ( 'in' ) )
            // InternalKPIFormulaDSL.g:5509:1: ( 'in' )
            {
            // InternalKPIFormulaDSL.g:5509:1: ( 'in' )
            // InternalKPIFormulaDSL.g:5510:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getInKeyword_7_5()); 
            }
            match(input,73,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getInKeyword_7_5()); 
            }

            }


            }

        }
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
    // InternalKPIFormulaDSL.g:5519:1: rule__Operator__Group_7__6 : rule__Operator__Group_7__6__Impl rule__Operator__Group_7__7 ;
    public final void rule__Operator__Group_7__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5523:1: ( rule__Operator__Group_7__6__Impl rule__Operator__Group_7__7 )
            // InternalKPIFormulaDSL.g:5524:2: rule__Operator__Group_7__6__Impl rule__Operator__Group_7__7
            {
            pushFollow(FOLLOW_56);
            rule__Operator__Group_7__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_7__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKPIFormulaDSL.g:5531:1: rule__Operator__Group_7__6__Impl : ( ( rule__Operator__ListsAssignment_7_6 ) ) ;
    public final void rule__Operator__Group_7__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5535:1: ( ( ( rule__Operator__ListsAssignment_7_6 ) ) )
            // InternalKPIFormulaDSL.g:5536:1: ( ( rule__Operator__ListsAssignment_7_6 ) )
            {
            // InternalKPIFormulaDSL.g:5536:1: ( ( rule__Operator__ListsAssignment_7_6 ) )
            // InternalKPIFormulaDSL.g:5537:2: ( rule__Operator__ListsAssignment_7_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsAssignment_7_6()); 
            }
            // InternalKPIFormulaDSL.g:5538:2: ( rule__Operator__ListsAssignment_7_6 )
            // InternalKPIFormulaDSL.g:5538:3: rule__Operator__ListsAssignment_7_6
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ListsAssignment_7_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsAssignment_7_6()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Operator__Group_7__7"
    // InternalKPIFormulaDSL.g:5546:1: rule__Operator__Group_7__7 : rule__Operator__Group_7__7__Impl ;
    public final void rule__Operator__Group_7__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5550:1: ( rule__Operator__Group_7__7__Impl )
            // InternalKPIFormulaDSL.g:5551:2: rule__Operator__Group_7__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_7__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_7__7"


    // $ANTLR start "rule__Operator__Group_7__7__Impl"
    // InternalKPIFormulaDSL.g:5557:1: rule__Operator__Group_7__7__Impl : ( ( rule__Operator__Group_7_7__0 )* ) ;
    public final void rule__Operator__Group_7__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5561:1: ( ( ( rule__Operator__Group_7_7__0 )* ) )
            // InternalKPIFormulaDSL.g:5562:1: ( ( rule__Operator__Group_7_7__0 )* )
            {
            // InternalKPIFormulaDSL.g:5562:1: ( ( rule__Operator__Group_7_7__0 )* )
            // InternalKPIFormulaDSL.g:5563:2: ( rule__Operator__Group_7_7__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getGroup_7_7()); 
            }
            // InternalKPIFormulaDSL.g:5564:2: ( rule__Operator__Group_7_7__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==64) ) {
                    int LA26_2 = input.LA(2);

                    if ( (LA26_2==RULE_ID) ) {
                        int LA26_3 = input.LA(3);

                        if ( (LA26_3==73) ) {
                            alt26=1;
                        }


                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:5564:3: rule__Operator__Group_7_7__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__Operator__Group_7_7__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getGroup_7_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_7__7__Impl"


    // $ANTLR start "rule__Operator__Group_7_7__0"
    // InternalKPIFormulaDSL.g:5573:1: rule__Operator__Group_7_7__0 : rule__Operator__Group_7_7__0__Impl rule__Operator__Group_7_7__1 ;
    public final void rule__Operator__Group_7_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5577:1: ( rule__Operator__Group_7_7__0__Impl rule__Operator__Group_7_7__1 )
            // InternalKPIFormulaDSL.g:5578:2: rule__Operator__Group_7_7__0__Impl rule__Operator__Group_7_7__1
            {
            pushFollow(FOLLOW_9);
            rule__Operator__Group_7_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_7_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_7_7__0"


    // $ANTLR start "rule__Operator__Group_7_7__0__Impl"
    // InternalKPIFormulaDSL.g:5585:1: rule__Operator__Group_7_7__0__Impl : ( ',' ) ;
    public final void rule__Operator__Group_7_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5589:1: ( ( ',' ) )
            // InternalKPIFormulaDSL.g:5590:1: ( ',' )
            {
            // InternalKPIFormulaDSL.g:5590:1: ( ',' )
            // InternalKPIFormulaDSL.g:5591:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getCommaKeyword_7_7_0()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getCommaKeyword_7_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_7_7__0__Impl"


    // $ANTLR start "rule__Operator__Group_7_7__1"
    // InternalKPIFormulaDSL.g:5600:1: rule__Operator__Group_7_7__1 : rule__Operator__Group_7_7__1__Impl rule__Operator__Group_7_7__2 ;
    public final void rule__Operator__Group_7_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5604:1: ( rule__Operator__Group_7_7__1__Impl rule__Operator__Group_7_7__2 )
            // InternalKPIFormulaDSL.g:5605:2: rule__Operator__Group_7_7__1__Impl rule__Operator__Group_7_7__2
            {
            pushFollow(FOLLOW_61);
            rule__Operator__Group_7_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_7_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_7_7__1"


    // $ANTLR start "rule__Operator__Group_7_7__1__Impl"
    // InternalKPIFormulaDSL.g:5612:1: rule__Operator__Group_7_7__1__Impl : ( ( rule__Operator__IteratorsAssignment_7_7_1 ) ) ;
    public final void rule__Operator__Group_7_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5616:1: ( ( ( rule__Operator__IteratorsAssignment_7_7_1 ) ) )
            // InternalKPIFormulaDSL.g:5617:1: ( ( rule__Operator__IteratorsAssignment_7_7_1 ) )
            {
            // InternalKPIFormulaDSL.g:5617:1: ( ( rule__Operator__IteratorsAssignment_7_7_1 ) )
            // InternalKPIFormulaDSL.g:5618:2: ( rule__Operator__IteratorsAssignment_7_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsAssignment_7_7_1()); 
            }
            // InternalKPIFormulaDSL.g:5619:2: ( rule__Operator__IteratorsAssignment_7_7_1 )
            // InternalKPIFormulaDSL.g:5619:3: rule__Operator__IteratorsAssignment_7_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__IteratorsAssignment_7_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsAssignment_7_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_7_7__1__Impl"


    // $ANTLR start "rule__Operator__Group_7_7__2"
    // InternalKPIFormulaDSL.g:5627:1: rule__Operator__Group_7_7__2 : rule__Operator__Group_7_7__2__Impl rule__Operator__Group_7_7__3 ;
    public final void rule__Operator__Group_7_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5631:1: ( rule__Operator__Group_7_7__2__Impl rule__Operator__Group_7_7__3 )
            // InternalKPIFormulaDSL.g:5632:2: rule__Operator__Group_7_7__2__Impl rule__Operator__Group_7_7__3
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_7_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_7_7__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_7_7__2"


    // $ANTLR start "rule__Operator__Group_7_7__2__Impl"
    // InternalKPIFormulaDSL.g:5639:1: rule__Operator__Group_7_7__2__Impl : ( 'in' ) ;
    public final void rule__Operator__Group_7_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5643:1: ( ( 'in' ) )
            // InternalKPIFormulaDSL.g:5644:1: ( 'in' )
            {
            // InternalKPIFormulaDSL.g:5644:1: ( 'in' )
            // InternalKPIFormulaDSL.g:5645:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getInKeyword_7_7_2()); 
            }
            match(input,73,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getInKeyword_7_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_7_7__2__Impl"


    // $ANTLR start "rule__Operator__Group_7_7__3"
    // InternalKPIFormulaDSL.g:5654:1: rule__Operator__Group_7_7__3 : rule__Operator__Group_7_7__3__Impl ;
    public final void rule__Operator__Group_7_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5658:1: ( rule__Operator__Group_7_7__3__Impl )
            // InternalKPIFormulaDSL.g:5659:2: rule__Operator__Group_7_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_7_7__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_7_7__3"


    // $ANTLR start "rule__Operator__Group_7_7__3__Impl"
    // InternalKPIFormulaDSL.g:5665:1: rule__Operator__Group_7_7__3__Impl : ( ( rule__Operator__ListsAssignment_7_7_3 ) ) ;
    public final void rule__Operator__Group_7_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5669:1: ( ( ( rule__Operator__ListsAssignment_7_7_3 ) ) )
            // InternalKPIFormulaDSL.g:5670:1: ( ( rule__Operator__ListsAssignment_7_7_3 ) )
            {
            // InternalKPIFormulaDSL.g:5670:1: ( ( rule__Operator__ListsAssignment_7_7_3 ) )
            // InternalKPIFormulaDSL.g:5671:2: ( rule__Operator__ListsAssignment_7_7_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsAssignment_7_7_3()); 
            }
            // InternalKPIFormulaDSL.g:5672:2: ( rule__Operator__ListsAssignment_7_7_3 )
            // InternalKPIFormulaDSL.g:5672:3: rule__Operator__ListsAssignment_7_7_3
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ListsAssignment_7_7_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsAssignment_7_7_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_7_7__3__Impl"


    // $ANTLR start "rule__Operator__Group_8__0"
    // InternalKPIFormulaDSL.g:5681:1: rule__Operator__Group_8__0 : rule__Operator__Group_8__0__Impl rule__Operator__Group_8__1 ;
    public final void rule__Operator__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5685:1: ( rule__Operator__Group_8__0__Impl rule__Operator__Group_8__1 )
            // InternalKPIFormulaDSL.g:5686:2: rule__Operator__Group_8__0__Impl rule__Operator__Group_8__1
            {
            pushFollow(FOLLOW_62);
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
    // InternalKPIFormulaDSL.g:5693:1: rule__Operator__Group_8__0__Impl : ( () ) ;
    public final void rule__Operator__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5697:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:5698:1: ( () )
            {
            // InternalKPIFormulaDSL.g:5698:1: ( () )
            // InternalKPIFormulaDSL.g:5699:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListReduceAction_8_0()); 
            }
            // InternalKPIFormulaDSL.g:5700:2: ()
            // InternalKPIFormulaDSL.g:5700:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListReduceAction_8_0()); 
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
    // InternalKPIFormulaDSL.g:5708:1: rule__Operator__Group_8__1 : rule__Operator__Group_8__1__Impl rule__Operator__Group_8__2 ;
    public final void rule__Operator__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5712:1: ( rule__Operator__Group_8__1__Impl rule__Operator__Group_8__2 )
            // InternalKPIFormulaDSL.g:5713:2: rule__Operator__Group_8__1__Impl rule__Operator__Group_8__2
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
    // InternalKPIFormulaDSL.g:5720:1: rule__Operator__Group_8__1__Impl : ( 'reduce' ) ;
    public final void rule__Operator__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5724:1: ( ( 'reduce' ) )
            // InternalKPIFormulaDSL.g:5725:1: ( 'reduce' )
            {
            // InternalKPIFormulaDSL.g:5725:1: ( 'reduce' )
            // InternalKPIFormulaDSL.g:5726:2: 'reduce'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getReduceKeyword_8_1()); 
            }
            match(input,74,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getReduceKeyword_8_1()); 
            }

            }


            }

        }
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
    // InternalKPIFormulaDSL.g:5735:1: rule__Operator__Group_8__2 : rule__Operator__Group_8__2__Impl rule__Operator__Group_8__3 ;
    public final void rule__Operator__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5739:1: ( rule__Operator__Group_8__2__Impl rule__Operator__Group_8__3 )
            // InternalKPIFormulaDSL.g:5740:2: rule__Operator__Group_8__2__Impl rule__Operator__Group_8__3
            {
            pushFollow(FOLLOW_63);
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
    // InternalKPIFormulaDSL.g:5747:1: rule__Operator__Group_8__2__Impl : ( ( rule__Operator__ExpressionAssignment_8_2 ) ) ;
    public final void rule__Operator__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5751:1: ( ( ( rule__Operator__ExpressionAssignment_8_2 ) ) )
            // InternalKPIFormulaDSL.g:5752:1: ( ( rule__Operator__ExpressionAssignment_8_2 ) )
            {
            // InternalKPIFormulaDSL.g:5752:1: ( ( rule__Operator__ExpressionAssignment_8_2 ) )
            // InternalKPIFormulaDSL.g:5753:2: ( rule__Operator__ExpressionAssignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getExpressionAssignment_8_2()); 
            }
            // InternalKPIFormulaDSL.g:5754:2: ( rule__Operator__ExpressionAssignment_8_2 )
            // InternalKPIFormulaDSL.g:5754:3: rule__Operator__ExpressionAssignment_8_2
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
    // InternalKPIFormulaDSL.g:5762:1: rule__Operator__Group_8__3 : rule__Operator__Group_8__3__Impl rule__Operator__Group_8__4 ;
    public final void rule__Operator__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5766:1: ( rule__Operator__Group_8__3__Impl rule__Operator__Group_8__4 )
            // InternalKPIFormulaDSL.g:5767:2: rule__Operator__Group_8__3__Impl rule__Operator__Group_8__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIFormulaDSL.g:5774:1: rule__Operator__Group_8__3__Impl : ( 'starting' ) ;
    public final void rule__Operator__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5778:1: ( ( 'starting' ) )
            // InternalKPIFormulaDSL.g:5779:1: ( 'starting' )
            {
            // InternalKPIFormulaDSL.g:5779:1: ( 'starting' )
            // InternalKPIFormulaDSL.g:5780:2: 'starting'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getStartingKeyword_8_3()); 
            }
            match(input,75,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getStartingKeyword_8_3()); 
            }

            }


            }

        }
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
    // InternalKPIFormulaDSL.g:5789:1: rule__Operator__Group_8__4 : rule__Operator__Group_8__4__Impl rule__Operator__Group_8__5 ;
    public final void rule__Operator__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5793:1: ( rule__Operator__Group_8__4__Impl rule__Operator__Group_8__5 )
            // InternalKPIFormulaDSL.g:5794:2: rule__Operator__Group_8__4__Impl rule__Operator__Group_8__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalKPIFormulaDSL.g:5801:1: rule__Operator__Group_8__4__Impl : ( ( rule__Operator__AccumulatorAssignment_8_4 ) ) ;
    public final void rule__Operator__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5805:1: ( ( ( rule__Operator__AccumulatorAssignment_8_4 ) ) )
            // InternalKPIFormulaDSL.g:5806:1: ( ( rule__Operator__AccumulatorAssignment_8_4 ) )
            {
            // InternalKPIFormulaDSL.g:5806:1: ( ( rule__Operator__AccumulatorAssignment_8_4 ) )
            // InternalKPIFormulaDSL.g:5807:2: ( rule__Operator__AccumulatorAssignment_8_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getAccumulatorAssignment_8_4()); 
            }
            // InternalKPIFormulaDSL.g:5808:2: ( rule__Operator__AccumulatorAssignment_8_4 )
            // InternalKPIFormulaDSL.g:5808:3: rule__Operator__AccumulatorAssignment_8_4
            {
            pushFollow(FOLLOW_2);
            rule__Operator__AccumulatorAssignment_8_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getAccumulatorAssignment_8_4()); 
            }

            }


            }

        }
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
    // InternalKPIFormulaDSL.g:5816:1: rule__Operator__Group_8__5 : rule__Operator__Group_8__5__Impl rule__Operator__Group_8__6 ;
    public final void rule__Operator__Group_8__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5820:1: ( rule__Operator__Group_8__5__Impl rule__Operator__Group_8__6 )
            // InternalKPIFormulaDSL.g:5821:2: rule__Operator__Group_8__5__Impl rule__Operator__Group_8__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalKPIFormulaDSL.g:5828:1: rule__Operator__Group_8__5__Impl : ( 'for' ) ;
    public final void rule__Operator__Group_8__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5832:1: ( ( 'for' ) )
            // InternalKPIFormulaDSL.g:5833:1: ( 'for' )
            {
            // InternalKPIFormulaDSL.g:5833:1: ( 'for' )
            // InternalKPIFormulaDSL.g:5834:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getForKeyword_8_5()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getForKeyword_8_5()); 
            }

            }


            }

        }
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
    // InternalKPIFormulaDSL.g:5843:1: rule__Operator__Group_8__6 : rule__Operator__Group_8__6__Impl rule__Operator__Group_8__7 ;
    public final void rule__Operator__Group_8__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5847:1: ( rule__Operator__Group_8__6__Impl rule__Operator__Group_8__7 )
            // InternalKPIFormulaDSL.g:5848:2: rule__Operator__Group_8__6__Impl rule__Operator__Group_8__7
            {
            pushFollow(FOLLOW_61);
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
    // InternalKPIFormulaDSL.g:5855:1: rule__Operator__Group_8__6__Impl : ( ( rule__Operator__IteratorsAssignment_8_6 ) ) ;
    public final void rule__Operator__Group_8__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5859:1: ( ( ( rule__Operator__IteratorsAssignment_8_6 ) ) )
            // InternalKPIFormulaDSL.g:5860:1: ( ( rule__Operator__IteratorsAssignment_8_6 ) )
            {
            // InternalKPIFormulaDSL.g:5860:1: ( ( rule__Operator__IteratorsAssignment_8_6 ) )
            // InternalKPIFormulaDSL.g:5861:2: ( rule__Operator__IteratorsAssignment_8_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsAssignment_8_6()); 
            }
            // InternalKPIFormulaDSL.g:5862:2: ( rule__Operator__IteratorsAssignment_8_6 )
            // InternalKPIFormulaDSL.g:5862:3: rule__Operator__IteratorsAssignment_8_6
            {
            pushFollow(FOLLOW_2);
            rule__Operator__IteratorsAssignment_8_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsAssignment_8_6()); 
            }

            }


            }

        }
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
    // InternalKPIFormulaDSL.g:5870:1: rule__Operator__Group_8__7 : rule__Operator__Group_8__7__Impl rule__Operator__Group_8__8 ;
    public final void rule__Operator__Group_8__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5874:1: ( rule__Operator__Group_8__7__Impl rule__Operator__Group_8__8 )
            // InternalKPIFormulaDSL.g:5875:2: rule__Operator__Group_8__7__Impl rule__Operator__Group_8__8
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_8__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_8__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKPIFormulaDSL.g:5882:1: rule__Operator__Group_8__7__Impl : ( 'in' ) ;
    public final void rule__Operator__Group_8__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5886:1: ( ( 'in' ) )
            // InternalKPIFormulaDSL.g:5887:1: ( 'in' )
            {
            // InternalKPIFormulaDSL.g:5887:1: ( 'in' )
            // InternalKPIFormulaDSL.g:5888:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getInKeyword_8_7()); 
            }
            match(input,73,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getInKeyword_8_7()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Operator__Group_8__8"
    // InternalKPIFormulaDSL.g:5897:1: rule__Operator__Group_8__8 : rule__Operator__Group_8__8__Impl rule__Operator__Group_8__9 ;
    public final void rule__Operator__Group_8__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5901:1: ( rule__Operator__Group_8__8__Impl rule__Operator__Group_8__9 )
            // InternalKPIFormulaDSL.g:5902:2: rule__Operator__Group_8__8__Impl rule__Operator__Group_8__9
            {
            pushFollow(FOLLOW_56);
            rule__Operator__Group_8__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_8__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_8__8"


    // $ANTLR start "rule__Operator__Group_8__8__Impl"
    // InternalKPIFormulaDSL.g:5909:1: rule__Operator__Group_8__8__Impl : ( ( rule__Operator__ListsAssignment_8_8 ) ) ;
    public final void rule__Operator__Group_8__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5913:1: ( ( ( rule__Operator__ListsAssignment_8_8 ) ) )
            // InternalKPIFormulaDSL.g:5914:1: ( ( rule__Operator__ListsAssignment_8_8 ) )
            {
            // InternalKPIFormulaDSL.g:5914:1: ( ( rule__Operator__ListsAssignment_8_8 ) )
            // InternalKPIFormulaDSL.g:5915:2: ( rule__Operator__ListsAssignment_8_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsAssignment_8_8()); 
            }
            // InternalKPIFormulaDSL.g:5916:2: ( rule__Operator__ListsAssignment_8_8 )
            // InternalKPIFormulaDSL.g:5916:3: rule__Operator__ListsAssignment_8_8
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ListsAssignment_8_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsAssignment_8_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_8__8__Impl"


    // $ANTLR start "rule__Operator__Group_8__9"
    // InternalKPIFormulaDSL.g:5924:1: rule__Operator__Group_8__9 : rule__Operator__Group_8__9__Impl ;
    public final void rule__Operator__Group_8__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5928:1: ( rule__Operator__Group_8__9__Impl )
            // InternalKPIFormulaDSL.g:5929:2: rule__Operator__Group_8__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_8__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_8__9"


    // $ANTLR start "rule__Operator__Group_8__9__Impl"
    // InternalKPIFormulaDSL.g:5935:1: rule__Operator__Group_8__9__Impl : ( ( rule__Operator__Group_8_9__0 )* ) ;
    public final void rule__Operator__Group_8__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5939:1: ( ( ( rule__Operator__Group_8_9__0 )* ) )
            // InternalKPIFormulaDSL.g:5940:1: ( ( rule__Operator__Group_8_9__0 )* )
            {
            // InternalKPIFormulaDSL.g:5940:1: ( ( rule__Operator__Group_8_9__0 )* )
            // InternalKPIFormulaDSL.g:5941:2: ( rule__Operator__Group_8_9__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getGroup_8_9()); 
            }
            // InternalKPIFormulaDSL.g:5942:2: ( rule__Operator__Group_8_9__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==64) ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==RULE_ID) ) {
                        int LA27_3 = input.LA(3);

                        if ( (LA27_3==73) ) {
                            alt27=1;
                        }


                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:5942:3: rule__Operator__Group_8_9__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__Operator__Group_8_9__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getGroup_8_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_8__9__Impl"


    // $ANTLR start "rule__Operator__Group_8_9__0"
    // InternalKPIFormulaDSL.g:5951:1: rule__Operator__Group_8_9__0 : rule__Operator__Group_8_9__0__Impl rule__Operator__Group_8_9__1 ;
    public final void rule__Operator__Group_8_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5955:1: ( rule__Operator__Group_8_9__0__Impl rule__Operator__Group_8_9__1 )
            // InternalKPIFormulaDSL.g:5956:2: rule__Operator__Group_8_9__0__Impl rule__Operator__Group_8_9__1
            {
            pushFollow(FOLLOW_9);
            rule__Operator__Group_8_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_8_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_8_9__0"


    // $ANTLR start "rule__Operator__Group_8_9__0__Impl"
    // InternalKPIFormulaDSL.g:5963:1: rule__Operator__Group_8_9__0__Impl : ( ',' ) ;
    public final void rule__Operator__Group_8_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5967:1: ( ( ',' ) )
            // InternalKPIFormulaDSL.g:5968:1: ( ',' )
            {
            // InternalKPIFormulaDSL.g:5968:1: ( ',' )
            // InternalKPIFormulaDSL.g:5969:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getCommaKeyword_8_9_0()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getCommaKeyword_8_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_8_9__0__Impl"


    // $ANTLR start "rule__Operator__Group_8_9__1"
    // InternalKPIFormulaDSL.g:5978:1: rule__Operator__Group_8_9__1 : rule__Operator__Group_8_9__1__Impl rule__Operator__Group_8_9__2 ;
    public final void rule__Operator__Group_8_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5982:1: ( rule__Operator__Group_8_9__1__Impl rule__Operator__Group_8_9__2 )
            // InternalKPIFormulaDSL.g:5983:2: rule__Operator__Group_8_9__1__Impl rule__Operator__Group_8_9__2
            {
            pushFollow(FOLLOW_61);
            rule__Operator__Group_8_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_8_9__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_8_9__1"


    // $ANTLR start "rule__Operator__Group_8_9__1__Impl"
    // InternalKPIFormulaDSL.g:5990:1: rule__Operator__Group_8_9__1__Impl : ( ( rule__Operator__IteratorsAssignment_8_9_1 ) ) ;
    public final void rule__Operator__Group_8_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:5994:1: ( ( ( rule__Operator__IteratorsAssignment_8_9_1 ) ) )
            // InternalKPIFormulaDSL.g:5995:1: ( ( rule__Operator__IteratorsAssignment_8_9_1 ) )
            {
            // InternalKPIFormulaDSL.g:5995:1: ( ( rule__Operator__IteratorsAssignment_8_9_1 ) )
            // InternalKPIFormulaDSL.g:5996:2: ( rule__Operator__IteratorsAssignment_8_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsAssignment_8_9_1()); 
            }
            // InternalKPIFormulaDSL.g:5997:2: ( rule__Operator__IteratorsAssignment_8_9_1 )
            // InternalKPIFormulaDSL.g:5997:3: rule__Operator__IteratorsAssignment_8_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__IteratorsAssignment_8_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsAssignment_8_9_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_8_9__1__Impl"


    // $ANTLR start "rule__Operator__Group_8_9__2"
    // InternalKPIFormulaDSL.g:6005:1: rule__Operator__Group_8_9__2 : rule__Operator__Group_8_9__2__Impl rule__Operator__Group_8_9__3 ;
    public final void rule__Operator__Group_8_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6009:1: ( rule__Operator__Group_8_9__2__Impl rule__Operator__Group_8_9__3 )
            // InternalKPIFormulaDSL.g:6010:2: rule__Operator__Group_8_9__2__Impl rule__Operator__Group_8_9__3
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_8_9__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_8_9__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_8_9__2"


    // $ANTLR start "rule__Operator__Group_8_9__2__Impl"
    // InternalKPIFormulaDSL.g:6017:1: rule__Operator__Group_8_9__2__Impl : ( 'in' ) ;
    public final void rule__Operator__Group_8_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6021:1: ( ( 'in' ) )
            // InternalKPIFormulaDSL.g:6022:1: ( 'in' )
            {
            // InternalKPIFormulaDSL.g:6022:1: ( 'in' )
            // InternalKPIFormulaDSL.g:6023:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getInKeyword_8_9_2()); 
            }
            match(input,73,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getInKeyword_8_9_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_8_9__2__Impl"


    // $ANTLR start "rule__Operator__Group_8_9__3"
    // InternalKPIFormulaDSL.g:6032:1: rule__Operator__Group_8_9__3 : rule__Operator__Group_8_9__3__Impl ;
    public final void rule__Operator__Group_8_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6036:1: ( rule__Operator__Group_8_9__3__Impl )
            // InternalKPIFormulaDSL.g:6037:2: rule__Operator__Group_8_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_8_9__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_8_9__3"


    // $ANTLR start "rule__Operator__Group_8_9__3__Impl"
    // InternalKPIFormulaDSL.g:6043:1: rule__Operator__Group_8_9__3__Impl : ( ( rule__Operator__ListsAssignment_8_9_3 ) ) ;
    public final void rule__Operator__Group_8_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6047:1: ( ( ( rule__Operator__ListsAssignment_8_9_3 ) ) )
            // InternalKPIFormulaDSL.g:6048:1: ( ( rule__Operator__ListsAssignment_8_9_3 ) )
            {
            // InternalKPIFormulaDSL.g:6048:1: ( ( rule__Operator__ListsAssignment_8_9_3 ) )
            // InternalKPIFormulaDSL.g:6049:2: ( rule__Operator__ListsAssignment_8_9_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsAssignment_8_9_3()); 
            }
            // InternalKPIFormulaDSL.g:6050:2: ( rule__Operator__ListsAssignment_8_9_3 )
            // InternalKPIFormulaDSL.g:6050:3: rule__Operator__ListsAssignment_8_9_3
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ListsAssignment_8_9_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsAssignment_8_9_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_8_9__3__Impl"


    // $ANTLR start "rule__Operator__Group_9__0"
    // InternalKPIFormulaDSL.g:6059:1: rule__Operator__Group_9__0 : rule__Operator__Group_9__0__Impl rule__Operator__Group_9__1 ;
    public final void rule__Operator__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6063:1: ( rule__Operator__Group_9__0__Impl rule__Operator__Group_9__1 )
            // InternalKPIFormulaDSL.g:6064:2: rule__Operator__Group_9__0__Impl rule__Operator__Group_9__1
            {
            pushFollow(FOLLOW_64);
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
    // InternalKPIFormulaDSL.g:6071:1: rule__Operator__Group_9__0__Impl : ( () ) ;
    public final void rule__Operator__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6075:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:6076:1: ( () )
            {
            // InternalKPIFormulaDSL.g:6076:1: ( () )
            // InternalKPIFormulaDSL.g:6077:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListFilterAction_9_0()); 
            }
            // InternalKPIFormulaDSL.g:6078:2: ()
            // InternalKPIFormulaDSL.g:6078:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListFilterAction_9_0()); 
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
    // InternalKPIFormulaDSL.g:6086:1: rule__Operator__Group_9__1 : rule__Operator__Group_9__1__Impl rule__Operator__Group_9__2 ;
    public final void rule__Operator__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6090:1: ( rule__Operator__Group_9__1__Impl rule__Operator__Group_9__2 )
            // InternalKPIFormulaDSL.g:6091:2: rule__Operator__Group_9__1__Impl rule__Operator__Group_9__2
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
    // InternalKPIFormulaDSL.g:6098:1: rule__Operator__Group_9__1__Impl : ( 'filter' ) ;
    public final void rule__Operator__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6102:1: ( ( 'filter' ) )
            // InternalKPIFormulaDSL.g:6103:1: ( 'filter' )
            {
            // InternalKPIFormulaDSL.g:6103:1: ( 'filter' )
            // InternalKPIFormulaDSL.g:6104:2: 'filter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getFilterKeyword_9_1()); 
            }
            match(input,76,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getFilterKeyword_9_1()); 
            }

            }


            }

        }
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
    // InternalKPIFormulaDSL.g:6113:1: rule__Operator__Group_9__2 : rule__Operator__Group_9__2__Impl rule__Operator__Group_9__3 ;
    public final void rule__Operator__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6117:1: ( rule__Operator__Group_9__2__Impl rule__Operator__Group_9__3 )
            // InternalKPIFormulaDSL.g:6118:2: rule__Operator__Group_9__2__Impl rule__Operator__Group_9__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalKPIFormulaDSL.g:6125:1: rule__Operator__Group_9__2__Impl : ( ( rule__Operator__ExpressionAssignment_9_2 ) ) ;
    public final void rule__Operator__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6129:1: ( ( ( rule__Operator__ExpressionAssignment_9_2 ) ) )
            // InternalKPIFormulaDSL.g:6130:1: ( ( rule__Operator__ExpressionAssignment_9_2 ) )
            {
            // InternalKPIFormulaDSL.g:6130:1: ( ( rule__Operator__ExpressionAssignment_9_2 ) )
            // InternalKPIFormulaDSL.g:6131:2: ( rule__Operator__ExpressionAssignment_9_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getExpressionAssignment_9_2()); 
            }
            // InternalKPIFormulaDSL.g:6132:2: ( rule__Operator__ExpressionAssignment_9_2 )
            // InternalKPIFormulaDSL.g:6132:3: rule__Operator__ExpressionAssignment_9_2
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
    // InternalKPIFormulaDSL.g:6140:1: rule__Operator__Group_9__3 : rule__Operator__Group_9__3__Impl rule__Operator__Group_9__4 ;
    public final void rule__Operator__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6144:1: ( rule__Operator__Group_9__3__Impl rule__Operator__Group_9__4 )
            // InternalKPIFormulaDSL.g:6145:2: rule__Operator__Group_9__3__Impl rule__Operator__Group_9__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalKPIFormulaDSL.g:6152:1: rule__Operator__Group_9__3__Impl : ( 'for' ) ;
    public final void rule__Operator__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6156:1: ( ( 'for' ) )
            // InternalKPIFormulaDSL.g:6157:1: ( 'for' )
            {
            // InternalKPIFormulaDSL.g:6157:1: ( 'for' )
            // InternalKPIFormulaDSL.g:6158:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getForKeyword_9_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getForKeyword_9_3()); 
            }

            }


            }

        }
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
    // InternalKPIFormulaDSL.g:6167:1: rule__Operator__Group_9__4 : rule__Operator__Group_9__4__Impl rule__Operator__Group_9__5 ;
    public final void rule__Operator__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6171:1: ( rule__Operator__Group_9__4__Impl rule__Operator__Group_9__5 )
            // InternalKPIFormulaDSL.g:6172:2: rule__Operator__Group_9__4__Impl rule__Operator__Group_9__5
            {
            pushFollow(FOLLOW_61);
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
    // InternalKPIFormulaDSL.g:6179:1: rule__Operator__Group_9__4__Impl : ( ( rule__Operator__IteratorsAssignment_9_4 ) ) ;
    public final void rule__Operator__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6183:1: ( ( ( rule__Operator__IteratorsAssignment_9_4 ) ) )
            // InternalKPIFormulaDSL.g:6184:1: ( ( rule__Operator__IteratorsAssignment_9_4 ) )
            {
            // InternalKPIFormulaDSL.g:6184:1: ( ( rule__Operator__IteratorsAssignment_9_4 ) )
            // InternalKPIFormulaDSL.g:6185:2: ( rule__Operator__IteratorsAssignment_9_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsAssignment_9_4()); 
            }
            // InternalKPIFormulaDSL.g:6186:2: ( rule__Operator__IteratorsAssignment_9_4 )
            // InternalKPIFormulaDSL.g:6186:3: rule__Operator__IteratorsAssignment_9_4
            {
            pushFollow(FOLLOW_2);
            rule__Operator__IteratorsAssignment_9_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsAssignment_9_4()); 
            }

            }


            }

        }
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
    // InternalKPIFormulaDSL.g:6194:1: rule__Operator__Group_9__5 : rule__Operator__Group_9__5__Impl rule__Operator__Group_9__6 ;
    public final void rule__Operator__Group_9__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6198:1: ( rule__Operator__Group_9__5__Impl rule__Operator__Group_9__6 )
            // InternalKPIFormulaDSL.g:6199:2: rule__Operator__Group_9__5__Impl rule__Operator__Group_9__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalKPIFormulaDSL.g:6206:1: rule__Operator__Group_9__5__Impl : ( 'in' ) ;
    public final void rule__Operator__Group_9__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6210:1: ( ( 'in' ) )
            // InternalKPIFormulaDSL.g:6211:1: ( 'in' )
            {
            // InternalKPIFormulaDSL.g:6211:1: ( 'in' )
            // InternalKPIFormulaDSL.g:6212:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getInKeyword_9_5()); 
            }
            match(input,73,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getInKeyword_9_5()); 
            }

            }


            }

        }
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
    // InternalKPIFormulaDSL.g:6221:1: rule__Operator__Group_9__6 : rule__Operator__Group_9__6__Impl rule__Operator__Group_9__7 ;
    public final void rule__Operator__Group_9__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6225:1: ( rule__Operator__Group_9__6__Impl rule__Operator__Group_9__7 )
            // InternalKPIFormulaDSL.g:6226:2: rule__Operator__Group_9__6__Impl rule__Operator__Group_9__7
            {
            pushFollow(FOLLOW_56);
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
    // InternalKPIFormulaDSL.g:6233:1: rule__Operator__Group_9__6__Impl : ( ( rule__Operator__ListsAssignment_9_6 ) ) ;
    public final void rule__Operator__Group_9__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6237:1: ( ( ( rule__Operator__ListsAssignment_9_6 ) ) )
            // InternalKPIFormulaDSL.g:6238:1: ( ( rule__Operator__ListsAssignment_9_6 ) )
            {
            // InternalKPIFormulaDSL.g:6238:1: ( ( rule__Operator__ListsAssignment_9_6 ) )
            // InternalKPIFormulaDSL.g:6239:2: ( rule__Operator__ListsAssignment_9_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsAssignment_9_6()); 
            }
            // InternalKPIFormulaDSL.g:6240:2: ( rule__Operator__ListsAssignment_9_6 )
            // InternalKPIFormulaDSL.g:6240:3: rule__Operator__ListsAssignment_9_6
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ListsAssignment_9_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsAssignment_9_6()); 
            }

            }


            }

        }
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
    // InternalKPIFormulaDSL.g:6248:1: rule__Operator__Group_9__7 : rule__Operator__Group_9__7__Impl ;
    public final void rule__Operator__Group_9__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6252:1: ( rule__Operator__Group_9__7__Impl )
            // InternalKPIFormulaDSL.g:6253:2: rule__Operator__Group_9__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_9__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalKPIFormulaDSL.g:6259:1: rule__Operator__Group_9__7__Impl : ( ( rule__Operator__Group_9_7__0 )* ) ;
    public final void rule__Operator__Group_9__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6263:1: ( ( ( rule__Operator__Group_9_7__0 )* ) )
            // InternalKPIFormulaDSL.g:6264:1: ( ( rule__Operator__Group_9_7__0 )* )
            {
            // InternalKPIFormulaDSL.g:6264:1: ( ( rule__Operator__Group_9_7__0 )* )
            // InternalKPIFormulaDSL.g:6265:2: ( rule__Operator__Group_9_7__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getGroup_9_7()); 
            }
            // InternalKPIFormulaDSL.g:6266:2: ( rule__Operator__Group_9_7__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==64) ) {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2==RULE_ID) ) {
                        int LA28_3 = input.LA(3);

                        if ( (LA28_3==73) ) {
                            alt28=1;
                        }


                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:6266:3: rule__Operator__Group_9_7__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__Operator__Group_9_7__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getGroup_9_7()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Operator__Group_9_7__0"
    // InternalKPIFormulaDSL.g:6275:1: rule__Operator__Group_9_7__0 : rule__Operator__Group_9_7__0__Impl rule__Operator__Group_9_7__1 ;
    public final void rule__Operator__Group_9_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6279:1: ( rule__Operator__Group_9_7__0__Impl rule__Operator__Group_9_7__1 )
            // InternalKPIFormulaDSL.g:6280:2: rule__Operator__Group_9_7__0__Impl rule__Operator__Group_9_7__1
            {
            pushFollow(FOLLOW_9);
            rule__Operator__Group_9_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_9_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_9_7__0"


    // $ANTLR start "rule__Operator__Group_9_7__0__Impl"
    // InternalKPIFormulaDSL.g:6287:1: rule__Operator__Group_9_7__0__Impl : ( ',' ) ;
    public final void rule__Operator__Group_9_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6291:1: ( ( ',' ) )
            // InternalKPIFormulaDSL.g:6292:1: ( ',' )
            {
            // InternalKPIFormulaDSL.g:6292:1: ( ',' )
            // InternalKPIFormulaDSL.g:6293:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getCommaKeyword_9_7_0()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getCommaKeyword_9_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_9_7__0__Impl"


    // $ANTLR start "rule__Operator__Group_9_7__1"
    // InternalKPIFormulaDSL.g:6302:1: rule__Operator__Group_9_7__1 : rule__Operator__Group_9_7__1__Impl rule__Operator__Group_9_7__2 ;
    public final void rule__Operator__Group_9_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6306:1: ( rule__Operator__Group_9_7__1__Impl rule__Operator__Group_9_7__2 )
            // InternalKPIFormulaDSL.g:6307:2: rule__Operator__Group_9_7__1__Impl rule__Operator__Group_9_7__2
            {
            pushFollow(FOLLOW_61);
            rule__Operator__Group_9_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_9_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_9_7__1"


    // $ANTLR start "rule__Operator__Group_9_7__1__Impl"
    // InternalKPIFormulaDSL.g:6314:1: rule__Operator__Group_9_7__1__Impl : ( ( rule__Operator__IteratorsAssignment_9_7_1 ) ) ;
    public final void rule__Operator__Group_9_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6318:1: ( ( ( rule__Operator__IteratorsAssignment_9_7_1 ) ) )
            // InternalKPIFormulaDSL.g:6319:1: ( ( rule__Operator__IteratorsAssignment_9_7_1 ) )
            {
            // InternalKPIFormulaDSL.g:6319:1: ( ( rule__Operator__IteratorsAssignment_9_7_1 ) )
            // InternalKPIFormulaDSL.g:6320:2: ( rule__Operator__IteratorsAssignment_9_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsAssignment_9_7_1()); 
            }
            // InternalKPIFormulaDSL.g:6321:2: ( rule__Operator__IteratorsAssignment_9_7_1 )
            // InternalKPIFormulaDSL.g:6321:3: rule__Operator__IteratorsAssignment_9_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Operator__IteratorsAssignment_9_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsAssignment_9_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_9_7__1__Impl"


    // $ANTLR start "rule__Operator__Group_9_7__2"
    // InternalKPIFormulaDSL.g:6329:1: rule__Operator__Group_9_7__2 : rule__Operator__Group_9_7__2__Impl rule__Operator__Group_9_7__3 ;
    public final void rule__Operator__Group_9_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6333:1: ( rule__Operator__Group_9_7__2__Impl rule__Operator__Group_9_7__3 )
            // InternalKPIFormulaDSL.g:6334:2: rule__Operator__Group_9_7__2__Impl rule__Operator__Group_9_7__3
            {
            pushFollow(FOLLOW_5);
            rule__Operator__Group_9_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operator__Group_9_7__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_9_7__2"


    // $ANTLR start "rule__Operator__Group_9_7__2__Impl"
    // InternalKPIFormulaDSL.g:6341:1: rule__Operator__Group_9_7__2__Impl : ( 'in' ) ;
    public final void rule__Operator__Group_9_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6345:1: ( ( 'in' ) )
            // InternalKPIFormulaDSL.g:6346:1: ( 'in' )
            {
            // InternalKPIFormulaDSL.g:6346:1: ( 'in' )
            // InternalKPIFormulaDSL.g:6347:2: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getInKeyword_9_7_2()); 
            }
            match(input,73,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getInKeyword_9_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_9_7__2__Impl"


    // $ANTLR start "rule__Operator__Group_9_7__3"
    // InternalKPIFormulaDSL.g:6356:1: rule__Operator__Group_9_7__3 : rule__Operator__Group_9_7__3__Impl ;
    public final void rule__Operator__Group_9_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6360:1: ( rule__Operator__Group_9_7__3__Impl )
            // InternalKPIFormulaDSL.g:6361:2: rule__Operator__Group_9_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Group_9_7__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_9_7__3"


    // $ANTLR start "rule__Operator__Group_9_7__3__Impl"
    // InternalKPIFormulaDSL.g:6367:1: rule__Operator__Group_9_7__3__Impl : ( ( rule__Operator__ListsAssignment_9_7_3 ) ) ;
    public final void rule__Operator__Group_9_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6371:1: ( ( ( rule__Operator__ListsAssignment_9_7_3 ) ) )
            // InternalKPIFormulaDSL.g:6372:1: ( ( rule__Operator__ListsAssignment_9_7_3 ) )
            {
            // InternalKPIFormulaDSL.g:6372:1: ( ( rule__Operator__ListsAssignment_9_7_3 ) )
            // InternalKPIFormulaDSL.g:6373:2: ( rule__Operator__ListsAssignment_9_7_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsAssignment_9_7_3()); 
            }
            // InternalKPIFormulaDSL.g:6374:2: ( rule__Operator__ListsAssignment_9_7_3 )
            // InternalKPIFormulaDSL.g:6374:3: rule__Operator__ListsAssignment_9_7_3
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ListsAssignment_9_7_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsAssignment_9_7_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Group_9_7__3__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalKPIFormulaDSL.g:6383:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6387:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalKPIFormulaDSL.g:6388:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
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
    // InternalKPIFormulaDSL.g:6395:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6399:1: ( ( '(' ) )
            // InternalKPIFormulaDSL.g:6400:1: ( '(' )
            {
            // InternalKPIFormulaDSL.g:6400:1: ( '(' )
            // InternalKPIFormulaDSL.g:6401:2: '('
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
    // InternalKPIFormulaDSL.g:6410:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6414:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalKPIFormulaDSL.g:6415:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
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
    // InternalKPIFormulaDSL.g:6422:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6426:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:6427:1: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:6427:1: ( ruleExpression )
            // InternalKPIFormulaDSL.g:6428:2: ruleExpression
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
    // InternalKPIFormulaDSL.g:6437:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6441:1: ( rule__Primary__Group_0__2__Impl )
            // InternalKPIFormulaDSL.g:6442:2: rule__Primary__Group_0__2__Impl
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
    // InternalKPIFormulaDSL.g:6448:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6452:1: ( ( ')' ) )
            // InternalKPIFormulaDSL.g:6453:1: ( ')' )
            {
            // InternalKPIFormulaDSL.g:6453:1: ( ')' )
            // InternalKPIFormulaDSL.g:6454:2: ')'
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
    // InternalKPIFormulaDSL.g:6464:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6468:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalKPIFormulaDSL.g:6469:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_65);
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
    // InternalKPIFormulaDSL.g:6476:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6480:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:6481:1: ( () )
            {
            // InternalKPIFormulaDSL.g:6481:1: ( () )
            // InternalKPIFormulaDSL.g:6482:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            }
            // InternalKPIFormulaDSL.g:6483:2: ()
            // InternalKPIFormulaDSL.g:6483:3: 
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
    // InternalKPIFormulaDSL.g:6491:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6495:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalKPIFormulaDSL.g:6496:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
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
    // InternalKPIFormulaDSL.g:6503:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6507:1: ( ( '!' ) )
            // InternalKPIFormulaDSL.g:6508:1: ( '!' )
            {
            // InternalKPIFormulaDSL.g:6508:1: ( '!' )
            // InternalKPIFormulaDSL.g:6509:2: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            }
            match(input,77,FOLLOW_2); if (state.failed) return ;
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
    // InternalKPIFormulaDSL.g:6518:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6522:1: ( rule__Primary__Group_1__2__Impl )
            // InternalKPIFormulaDSL.g:6523:2: rule__Primary__Group_1__2__Impl
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
    // InternalKPIFormulaDSL.g:6529:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6533:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // InternalKPIFormulaDSL.g:6534:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // InternalKPIFormulaDSL.g:6534:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // InternalKPIFormulaDSL.g:6535:2: ( rule__Primary__ExpressionAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            }
            // InternalKPIFormulaDSL.g:6536:2: ( rule__Primary__ExpressionAssignment_1_2 )
            // InternalKPIFormulaDSL.g:6536:3: rule__Primary__ExpressionAssignment_1_2
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
    // InternalKPIFormulaDSL.g:6545:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6549:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalKPIFormulaDSL.g:6550:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_66);
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
    // InternalKPIFormulaDSL.g:6557:1: rule__Primary__Group_2__0__Impl : ( () ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6561:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:6562:1: ( () )
            {
            // InternalKPIFormulaDSL.g:6562:1: ( () )
            // InternalKPIFormulaDSL.g:6563:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getUnaryMinusAction_2_0()); 
            }
            // InternalKPIFormulaDSL.g:6564:2: ()
            // InternalKPIFormulaDSL.g:6564:3: 
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
    // InternalKPIFormulaDSL.g:6572:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6576:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalKPIFormulaDSL.g:6577:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
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
    // InternalKPIFormulaDSL.g:6584:1: rule__Primary__Group_2__1__Impl : ( '-' ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6588:1: ( ( '-' ) )
            // InternalKPIFormulaDSL.g:6589:1: ( '-' )
            {
            // InternalKPIFormulaDSL.g:6589:1: ( '-' )
            // InternalKPIFormulaDSL.g:6590:2: '-'
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
    // InternalKPIFormulaDSL.g:6599:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6603:1: ( rule__Primary__Group_2__2__Impl )
            // InternalKPIFormulaDSL.g:6604:2: rule__Primary__Group_2__2__Impl
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
    // InternalKPIFormulaDSL.g:6610:1: rule__Primary__Group_2__2__Impl : ( ( rule__Primary__ExpressionAssignment_2_2 ) ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6614:1: ( ( ( rule__Primary__ExpressionAssignment_2_2 ) ) )
            // InternalKPIFormulaDSL.g:6615:1: ( ( rule__Primary__ExpressionAssignment_2_2 ) )
            {
            // InternalKPIFormulaDSL.g:6615:1: ( ( rule__Primary__ExpressionAssignment_2_2 ) )
            // InternalKPIFormulaDSL.g:6616:2: ( rule__Primary__ExpressionAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionAssignment_2_2()); 
            }
            // InternalKPIFormulaDSL.g:6617:2: ( rule__Primary__ExpressionAssignment_2_2 )
            // InternalKPIFormulaDSL.g:6617:3: rule__Primary__ExpressionAssignment_2_2
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
    // InternalKPIFormulaDSL.g:6626:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6630:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalKPIFormulaDSL.g:6631:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_67);
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
    // InternalKPIFormulaDSL.g:6638:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6642:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:6643:1: ( () )
            {
            // InternalKPIFormulaDSL.g:6643:1: ( () )
            // InternalKPIFormulaDSL.g:6644:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getAccumulatorAction_0_0()); 
            }
            // InternalKPIFormulaDSL.g:6645:2: ()
            // InternalKPIFormulaDSL.g:6645:3: 
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
    // InternalKPIFormulaDSL.g:6653:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6657:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalKPIFormulaDSL.g:6658:2: rule__Atomic__Group_0__1__Impl
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
    // InternalKPIFormulaDSL.g:6664:1: rule__Atomic__Group_0__1__Impl : ( 'accumulator' ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6668:1: ( ( 'accumulator' ) )
            // InternalKPIFormulaDSL.g:6669:1: ( 'accumulator' )
            {
            // InternalKPIFormulaDSL.g:6669:1: ( 'accumulator' )
            // InternalKPIFormulaDSL.g:6670:2: 'accumulator'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getAccumulatorKeyword_0_1()); 
            }
            match(input,78,FOLLOW_2); if (state.failed) return ;
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
    // InternalKPIFormulaDSL.g:6680:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6684:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalKPIFormulaDSL.g:6685:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
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
    // InternalKPIFormulaDSL.g:6692:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6696:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:6697:1: ( () )
            {
            // InternalKPIFormulaDSL.g:6697:1: ( () )
            // InternalKPIFormulaDSL.g:6698:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getIntConstantAction_1_0()); 
            }
            // InternalKPIFormulaDSL.g:6699:2: ()
            // InternalKPIFormulaDSL.g:6699:3: 
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
    // InternalKPIFormulaDSL.g:6707:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6711:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalKPIFormulaDSL.g:6712:2: rule__Atomic__Group_1__1__Impl
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
    // InternalKPIFormulaDSL.g:6718:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6722:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // InternalKPIFormulaDSL.g:6723:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // InternalKPIFormulaDSL.g:6723:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // InternalKPIFormulaDSL.g:6724:2: ( rule__Atomic__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            }
            // InternalKPIFormulaDSL.g:6725:2: ( rule__Atomic__ValueAssignment_1_1 )
            // InternalKPIFormulaDSL.g:6725:3: rule__Atomic__ValueAssignment_1_1
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
    // InternalKPIFormulaDSL.g:6734:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6738:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalKPIFormulaDSL.g:6739:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_68);
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
    // InternalKPIFormulaDSL.g:6746:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6750:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:6751:1: ( () )
            {
            // InternalKPIFormulaDSL.g:6751:1: ( () )
            // InternalKPIFormulaDSL.g:6752:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getRealConstantAction_2_0()); 
            }
            // InternalKPIFormulaDSL.g:6753:2: ()
            // InternalKPIFormulaDSL.g:6753:3: 
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
    // InternalKPIFormulaDSL.g:6761:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6765:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalKPIFormulaDSL.g:6766:2: rule__Atomic__Group_2__1__Impl
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
    // InternalKPIFormulaDSL.g:6772:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6776:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalKPIFormulaDSL.g:6777:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalKPIFormulaDSL.g:6777:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalKPIFormulaDSL.g:6778:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            }
            // InternalKPIFormulaDSL.g:6779:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalKPIFormulaDSL.g:6779:3: rule__Atomic__ValueAssignment_2_1
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
    // InternalKPIFormulaDSL.g:6788:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6792:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // InternalKPIFormulaDSL.g:6793:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_69);
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
    // InternalKPIFormulaDSL.g:6800:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6804:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:6805:1: ( () )
            {
            // InternalKPIFormulaDSL.g:6805:1: ( () )
            // InternalKPIFormulaDSL.g:6806:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getTextConstantAction_3_0()); 
            }
            // InternalKPIFormulaDSL.g:6807:2: ()
            // InternalKPIFormulaDSL.g:6807:3: 
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
    // InternalKPIFormulaDSL.g:6815:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6819:1: ( rule__Atomic__Group_3__1__Impl )
            // InternalKPIFormulaDSL.g:6820:2: rule__Atomic__Group_3__1__Impl
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
    // InternalKPIFormulaDSL.g:6826:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__ValueAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6830:1: ( ( ( rule__Atomic__ValueAssignment_3_1 ) ) )
            // InternalKPIFormulaDSL.g:6831:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            {
            // InternalKPIFormulaDSL.g:6831:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            // InternalKPIFormulaDSL.g:6832:2: ( rule__Atomic__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 
            }
            // InternalKPIFormulaDSL.g:6833:2: ( rule__Atomic__ValueAssignment_3_1 )
            // InternalKPIFormulaDSL.g:6833:3: rule__Atomic__ValueAssignment_3_1
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
    // InternalKPIFormulaDSL.g:6842:1: rule__Atomic__Group_4__0 : rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 ;
    public final void rule__Atomic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6846:1: ( rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 )
            // InternalKPIFormulaDSL.g:6847:2: rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1
            {
            pushFollow(FOLLOW_70);
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
    // InternalKPIFormulaDSL.g:6854:1: rule__Atomic__Group_4__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6858:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:6859:1: ( () )
            {
            // InternalKPIFormulaDSL.g:6859:1: ( () )
            // InternalKPIFormulaDSL.g:6860:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getBoolConstantAction_4_0()); 
            }
            // InternalKPIFormulaDSL.g:6861:2: ()
            // InternalKPIFormulaDSL.g:6861:3: 
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
    // InternalKPIFormulaDSL.g:6869:1: rule__Atomic__Group_4__1 : rule__Atomic__Group_4__1__Impl ;
    public final void rule__Atomic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6873:1: ( rule__Atomic__Group_4__1__Impl )
            // InternalKPIFormulaDSL.g:6874:2: rule__Atomic__Group_4__1__Impl
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
    // InternalKPIFormulaDSL.g:6880:1: rule__Atomic__Group_4__1__Impl : ( ( rule__Atomic__ValueAssignment_4_1 ) ) ;
    public final void rule__Atomic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6884:1: ( ( ( rule__Atomic__ValueAssignment_4_1 ) ) )
            // InternalKPIFormulaDSL.g:6885:1: ( ( rule__Atomic__ValueAssignment_4_1 ) )
            {
            // InternalKPIFormulaDSL.g:6885:1: ( ( rule__Atomic__ValueAssignment_4_1 ) )
            // InternalKPIFormulaDSL.g:6886:2: ( rule__Atomic__ValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_4_1()); 
            }
            // InternalKPIFormulaDSL.g:6887:2: ( rule__Atomic__ValueAssignment_4_1 )
            // InternalKPIFormulaDSL.g:6887:3: rule__Atomic__ValueAssignment_4_1
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
    // InternalKPIFormulaDSL.g:6896:1: rule__Atomic__Group_5__0 : rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1 ;
    public final void rule__Atomic__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6900:1: ( rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1 )
            // InternalKPIFormulaDSL.g:6901:2: rule__Atomic__Group_5__0__Impl rule__Atomic__Group_5__1
            {
            pushFollow(FOLLOW_68);
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
    // InternalKPIFormulaDSL.g:6908:1: rule__Atomic__Group_5__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6912:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:6913:1: ( () )
            {
            // InternalKPIFormulaDSL.g:6913:1: ( () )
            // InternalKPIFormulaDSL.g:6914:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getUnitConstantAction_5_0()); 
            }
            // InternalKPIFormulaDSL.g:6915:2: ()
            // InternalKPIFormulaDSL.g:6915:3: 
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
    // InternalKPIFormulaDSL.g:6923:1: rule__Atomic__Group_5__1 : rule__Atomic__Group_5__1__Impl rule__Atomic__Group_5__2 ;
    public final void rule__Atomic__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6927:1: ( rule__Atomic__Group_5__1__Impl rule__Atomic__Group_5__2 )
            // InternalKPIFormulaDSL.g:6928:2: rule__Atomic__Group_5__1__Impl rule__Atomic__Group_5__2
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
    // InternalKPIFormulaDSL.g:6935:1: rule__Atomic__Group_5__1__Impl : ( ( rule__Atomic__ValueAssignment_5_1 ) ) ;
    public final void rule__Atomic__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6939:1: ( ( ( rule__Atomic__ValueAssignment_5_1 ) ) )
            // InternalKPIFormulaDSL.g:6940:1: ( ( rule__Atomic__ValueAssignment_5_1 ) )
            {
            // InternalKPIFormulaDSL.g:6940:1: ( ( rule__Atomic__ValueAssignment_5_1 ) )
            // InternalKPIFormulaDSL.g:6941:2: ( rule__Atomic__ValueAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_5_1()); 
            }
            // InternalKPIFormulaDSL.g:6942:2: ( rule__Atomic__ValueAssignment_5_1 )
            // InternalKPIFormulaDSL.g:6942:3: rule__Atomic__ValueAssignment_5_1
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
    // InternalKPIFormulaDSL.g:6950:1: rule__Atomic__Group_5__2 : rule__Atomic__Group_5__2__Impl ;
    public final void rule__Atomic__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6954:1: ( rule__Atomic__Group_5__2__Impl )
            // InternalKPIFormulaDSL.g:6955:2: rule__Atomic__Group_5__2__Impl
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
    // InternalKPIFormulaDSL.g:6961:1: rule__Atomic__Group_5__2__Impl : ( ( rule__Atomic__UnitAssignment_5_2 ) ) ;
    public final void rule__Atomic__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6965:1: ( ( ( rule__Atomic__UnitAssignment_5_2 ) ) )
            // InternalKPIFormulaDSL.g:6966:1: ( ( rule__Atomic__UnitAssignment_5_2 ) )
            {
            // InternalKPIFormulaDSL.g:6966:1: ( ( rule__Atomic__UnitAssignment_5_2 ) )
            // InternalKPIFormulaDSL.g:6967:2: ( rule__Atomic__UnitAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getUnitAssignment_5_2()); 
            }
            // InternalKPIFormulaDSL.g:6968:2: ( rule__Atomic__UnitAssignment_5_2 )
            // InternalKPIFormulaDSL.g:6968:3: rule__Atomic__UnitAssignment_5_2
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
    // InternalKPIFormulaDSL.g:6977:1: rule__Atomic__Group_6__0 : rule__Atomic__Group_6__0__Impl rule__Atomic__Group_6__1 ;
    public final void rule__Atomic__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6981:1: ( rule__Atomic__Group_6__0__Impl rule__Atomic__Group_6__1 )
            // InternalKPIFormulaDSL.g:6982:2: rule__Atomic__Group_6__0__Impl rule__Atomic__Group_6__1
            {
            pushFollow(FOLLOW_71);
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
    // InternalKPIFormulaDSL.g:6989:1: rule__Atomic__Group_6__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:6993:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:6994:1: ( () )
            {
            // InternalKPIFormulaDSL.g:6994:1: ( () )
            // InternalKPIFormulaDSL.g:6995:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getEnumLiteralRefAction_6_0()); 
            }
            // InternalKPIFormulaDSL.g:6996:2: ()
            // InternalKPIFormulaDSL.g:6996:3: 
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
    // InternalKPIFormulaDSL.g:7004:1: rule__Atomic__Group_6__1 : rule__Atomic__Group_6__1__Impl ;
    public final void rule__Atomic__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7008:1: ( rule__Atomic__Group_6__1__Impl )
            // InternalKPIFormulaDSL.g:7009:2: rule__Atomic__Group_6__1__Impl
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
    // InternalKPIFormulaDSL.g:7015:1: rule__Atomic__Group_6__1__Impl : ( ( rule__Atomic__LiteralAssignment_6_1 ) ) ;
    public final void rule__Atomic__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7019:1: ( ( ( rule__Atomic__LiteralAssignment_6_1 ) ) )
            // InternalKPIFormulaDSL.g:7020:1: ( ( rule__Atomic__LiteralAssignment_6_1 ) )
            {
            // InternalKPIFormulaDSL.g:7020:1: ( ( rule__Atomic__LiteralAssignment_6_1 ) )
            // InternalKPIFormulaDSL.g:7021:2: ( rule__Atomic__LiteralAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getLiteralAssignment_6_1()); 
            }
            // InternalKPIFormulaDSL.g:7022:2: ( rule__Atomic__LiteralAssignment_6_1 )
            // InternalKPIFormulaDSL.g:7022:3: rule__Atomic__LiteralAssignment_6_1
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
    // InternalKPIFormulaDSL.g:7031:1: rule__Atomic__Group_7__0 : rule__Atomic__Group_7__0__Impl rule__Atomic__Group_7__1 ;
    public final void rule__Atomic__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7035:1: ( rule__Atomic__Group_7__0__Impl rule__Atomic__Group_7__1 )
            // InternalKPIFormulaDSL.g:7036:2: rule__Atomic__Group_7__0__Impl rule__Atomic__Group_7__1
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
    // InternalKPIFormulaDSL.g:7043:1: rule__Atomic__Group_7__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7047:1: ( ( () ) )
            // InternalKPIFormulaDSL.g:7048:1: ( () )
            {
            // InternalKPIFormulaDSL.g:7048:1: ( () )
            // InternalKPIFormulaDSL.g:7049:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getComputableRefAction_7_0()); 
            }
            // InternalKPIFormulaDSL.g:7050:2: ()
            // InternalKPIFormulaDSL.g:7050:3: 
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
    // InternalKPIFormulaDSL.g:7058:1: rule__Atomic__Group_7__1 : rule__Atomic__Group_7__1__Impl ;
    public final void rule__Atomic__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7062:1: ( rule__Atomic__Group_7__1__Impl )
            // InternalKPIFormulaDSL.g:7063:2: rule__Atomic__Group_7__1__Impl
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
    // InternalKPIFormulaDSL.g:7069:1: rule__Atomic__Group_7__1__Impl : ( ( rule__Atomic__ComputableAssignment_7_1 ) ) ;
    public final void rule__Atomic__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7073:1: ( ( ( rule__Atomic__ComputableAssignment_7_1 ) ) )
            // InternalKPIFormulaDSL.g:7074:1: ( ( rule__Atomic__ComputableAssignment_7_1 ) )
            {
            // InternalKPIFormulaDSL.g:7074:1: ( ( rule__Atomic__ComputableAssignment_7_1 ) )
            // InternalKPIFormulaDSL.g:7075:2: ( rule__Atomic__ComputableAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getComputableAssignment_7_1()); 
            }
            // InternalKPIFormulaDSL.g:7076:2: ( rule__Atomic__ComputableAssignment_7_1 )
            // InternalKPIFormulaDSL.g:7076:3: rule__Atomic__ComputableAssignment_7_1
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
    // InternalKPIFormulaDSL.g:7085:1: rule__KPIFormulaDSL__DeclarationsAssignment_0 : ( ruleDeclaration ) ;
    public final void rule__KPIFormulaDSL__DeclarationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7089:1: ( ( ruleDeclaration ) )
            // InternalKPIFormulaDSL.g:7090:2: ( ruleDeclaration )
            {
            // InternalKPIFormulaDSL.g:7090:2: ( ruleDeclaration )
            // InternalKPIFormulaDSL.g:7091:3: ruleDeclaration
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
    // InternalKPIFormulaDSL.g:7100:1: rule__KPIFormulaDSL__ComputationsAssignment_1 : ( ruleComputation ) ;
    public final void rule__KPIFormulaDSL__ComputationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7104:1: ( ( ruleComputation ) )
            // InternalKPIFormulaDSL.g:7105:2: ( ruleComputation )
            {
            // InternalKPIFormulaDSL.g:7105:2: ( ruleComputation )
            // InternalKPIFormulaDSL.g:7106:3: ruleComputation
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
    // InternalKPIFormulaDSL.g:7115:1: rule__Declaration__DeclaredAssignment : ( ruleDeclarable ) ;
    public final void rule__Declaration__DeclaredAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7119:1: ( ( ruleDeclarable ) )
            // InternalKPIFormulaDSL.g:7120:2: ( ruleDeclarable )
            {
            // InternalKPIFormulaDSL.g:7120:2: ( ruleDeclarable )
            // InternalKPIFormulaDSL.g:7121:3: ruleDeclarable
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
    // InternalKPIFormulaDSL.g:7130:1: rule__Computation__ComputedAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Computation__ComputedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7134:1: ( ( ( RULE_ID ) ) )
            // InternalKPIFormulaDSL.g:7135:2: ( ( RULE_ID ) )
            {
            // InternalKPIFormulaDSL.g:7135:2: ( ( RULE_ID ) )
            // InternalKPIFormulaDSL.g:7136:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComputationAccess().getComputedComputableCrossReference_0_0()); 
            }
            // InternalKPIFormulaDSL.g:7137:3: ( RULE_ID )
            // InternalKPIFormulaDSL.g:7138:4: RULE_ID
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
    // InternalKPIFormulaDSL.g:7149:1: rule__Computation__FormulaAssignment_2 : ( ruleTopLevelExpression ) ;
    public final void rule__Computation__FormulaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7153:1: ( ( ruleTopLevelExpression ) )
            // InternalKPIFormulaDSL.g:7154:2: ( ruleTopLevelExpression )
            {
            // InternalKPIFormulaDSL.g:7154:2: ( ruleTopLevelExpression )
            // InternalKPIFormulaDSL.g:7155:3: ruleTopLevelExpression
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
    // InternalKPIFormulaDSL.g:7164:1: rule__Metric__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Metric__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7168:1: ( ( RULE_ID ) )
            // InternalKPIFormulaDSL.g:7169:2: ( RULE_ID )
            {
            // InternalKPIFormulaDSL.g:7169:2: ( RULE_ID )
            // InternalKPIFormulaDSL.g:7170:3: RULE_ID
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
    // InternalKPIFormulaDSL.g:7179:1: rule__Metric__TypeAssignment_3 : ( ruleValueType ) ;
    public final void rule__Metric__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7183:1: ( ( ruleValueType ) )
            // InternalKPIFormulaDSL.g:7184:2: ( ruleValueType )
            {
            // InternalKPIFormulaDSL.g:7184:2: ( ruleValueType )
            // InternalKPIFormulaDSL.g:7185:3: ruleValueType
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
    // InternalKPIFormulaDSL.g:7194:1: rule__KPI__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__KPI__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7198:1: ( ( RULE_ID ) )
            // InternalKPIFormulaDSL.g:7199:2: ( RULE_ID )
            {
            // InternalKPIFormulaDSL.g:7199:2: ( RULE_ID )
            // InternalKPIFormulaDSL.g:7200:3: RULE_ID
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
    // InternalKPIFormulaDSL.g:7209:1: rule__KPI__TypeAssignment_4 : ( ruleValueType ) ;
    public final void rule__KPI__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7213:1: ( ( ruleValueType ) )
            // InternalKPIFormulaDSL.g:7214:2: ( ruleValueType )
            {
            // InternalKPIFormulaDSL.g:7214:2: ( ruleValueType )
            // InternalKPIFormulaDSL.g:7215:3: ruleValueType
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
    // InternalKPIFormulaDSL.g:7224:1: rule__EnumerationValue__LiteralsAssignment_1 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationValue__LiteralsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7228:1: ( ( ruleEnumerationLiteral ) )
            // InternalKPIFormulaDSL.g:7229:2: ( ruleEnumerationLiteral )
            {
            // InternalKPIFormulaDSL.g:7229:2: ( ruleEnumerationLiteral )
            // InternalKPIFormulaDSL.g:7230:3: ruleEnumerationLiteral
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
    // InternalKPIFormulaDSL.g:7239:1: rule__EnumerationLiteral__NameAssignment : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7243:1: ( ( RULE_ID ) )
            // InternalKPIFormulaDSL.g:7244:2: ( RULE_ID )
            {
            // InternalKPIFormulaDSL.g:7244:2: ( RULE_ID )
            // InternalKPIFormulaDSL.g:7245:3: RULE_ID
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
    // InternalKPIFormulaDSL.g:7254:1: rule__UnitValue__UnitAssignment : ( ruleValueUnit ) ;
    public final void rule__UnitValue__UnitAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7258:1: ( ( ruleValueUnit ) )
            // InternalKPIFormulaDSL.g:7259:2: ( ruleValueUnit )
            {
            // InternalKPIFormulaDSL.g:7259:2: ( ruleValueUnit )
            // InternalKPIFormulaDSL.g:7260:3: ruleValueUnit
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
    // InternalKPIFormulaDSL.g:7269:1: rule__AggregationValue__OperationAssignment_1 : ( ruleOperation ) ;
    public final void rule__AggregationValue__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7273:1: ( ( ruleOperation ) )
            // InternalKPIFormulaDSL.g:7274:2: ( ruleOperation )
            {
            // InternalKPIFormulaDSL.g:7274:2: ( ruleOperation )
            // InternalKPIFormulaDSL.g:7275:3: ruleOperation
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
    // InternalKPIFormulaDSL.g:7284:1: rule__AggregationValue__WindowAssignment_3 : ( RULE_INT ) ;
    public final void rule__AggregationValue__WindowAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7288:1: ( ( RULE_INT ) )
            // InternalKPIFormulaDSL.g:7289:2: ( RULE_INT )
            {
            // InternalKPIFormulaDSL.g:7289:2: ( RULE_INT )
            // InternalKPIFormulaDSL.g:7290:3: RULE_INT
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
    // InternalKPIFormulaDSL.g:7299:1: rule__AggregationValue__WindowUnitAssignment_4 : ( ruleWindowUnit ) ;
    public final void rule__AggregationValue__WindowUnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7303:1: ( ( ruleWindowUnit ) )
            // InternalKPIFormulaDSL.g:7304:2: ( ruleWindowUnit )
            {
            // InternalKPIFormulaDSL.g:7304:2: ( ruleWindowUnit )
            // InternalKPIFormulaDSL.g:7305:3: ruleWindowUnit
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
    // InternalKPIFormulaDSL.g:7314:1: rule__DriftValue__OperationAssignment_2 : ( ruleOperation ) ;
    public final void rule__DriftValue__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7318:1: ( ( ruleOperation ) )
            // InternalKPIFormulaDSL.g:7319:2: ( ruleOperation )
            {
            // InternalKPIFormulaDSL.g:7319:2: ( ruleOperation )
            // InternalKPIFormulaDSL.g:7320:3: ruleOperation
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
    // InternalKPIFormulaDSL.g:7329:1: rule__DriftValue__WindowAssignment_4 : ( RULE_INT ) ;
    public final void rule__DriftValue__WindowAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7333:1: ( ( RULE_INT ) )
            // InternalKPIFormulaDSL.g:7334:2: ( RULE_INT )
            {
            // InternalKPIFormulaDSL.g:7334:2: ( RULE_INT )
            // InternalKPIFormulaDSL.g:7335:3: RULE_INT
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
    // InternalKPIFormulaDSL.g:7344:1: rule__DriftValue__WindowUnitAssignment_5 : ( ruleWindowUnit ) ;
    public final void rule__DriftValue__WindowUnitAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7348:1: ( ( ruleWindowUnit ) )
            // InternalKPIFormulaDSL.g:7349:2: ( ruleWindowUnit )
            {
            // InternalKPIFormulaDSL.g:7349:2: ( ruleWindowUnit )
            // InternalKPIFormulaDSL.g:7350:3: ruleWindowUnit
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
    // InternalKPIFormulaDSL.g:7359:1: rule__Condition__ConditionsAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__Condition__ConditionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7363:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7364:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7364:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7365:3: ruleExpression
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
    // InternalKPIFormulaDSL.g:7374:1: rule__Condition__ResultsAssignment_2_2 : ( ruleExpression ) ;
    public final void rule__Condition__ResultsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7378:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7379:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7379:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7380:3: ruleExpression
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
    // InternalKPIFormulaDSL.g:7389:1: rule__Condition__ResultsAssignment_5 : ( ruleExpression ) ;
    public final void rule__Condition__ResultsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7393:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7394:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7394:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7395:3: ruleExpression
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
    // InternalKPIFormulaDSL.g:7404:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7408:1: ( ( ruleAnd ) )
            // InternalKPIFormulaDSL.g:7409:2: ( ruleAnd )
            {
            // InternalKPIFormulaDSL.g:7409:2: ( ruleAnd )
            // InternalKPIFormulaDSL.g:7410:3: ruleAnd
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
    // InternalKPIFormulaDSL.g:7419:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7423:1: ( ( ruleEquality ) )
            // InternalKPIFormulaDSL.g:7424:2: ( ruleEquality )
            {
            // InternalKPIFormulaDSL.g:7424:2: ( ruleEquality )
            // InternalKPIFormulaDSL.g:7425:3: ruleEquality
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
    // InternalKPIFormulaDSL.g:7434:1: rule__Equality__RightAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7438:1: ( ( ruleComparison ) )
            // InternalKPIFormulaDSL.g:7439:2: ( ruleComparison )
            {
            // InternalKPIFormulaDSL.g:7439:2: ( ruleComparison )
            // InternalKPIFormulaDSL.g:7440:3: ruleComparison
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
    // InternalKPIFormulaDSL.g:7449:1: rule__Comparison__RightAssignment_1_1 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7453:1: ( ( rulePlusOrMinus ) )
            // InternalKPIFormulaDSL.g:7454:2: ( rulePlusOrMinus )
            {
            // InternalKPIFormulaDSL.g:7454:2: ( rulePlusOrMinus )
            // InternalKPIFormulaDSL.g:7455:3: rulePlusOrMinus
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
    // InternalKPIFormulaDSL.g:7464:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7468:1: ( ( ruleMulOrDiv ) )
            // InternalKPIFormulaDSL.g:7469:2: ( ruleMulOrDiv )
            {
            // InternalKPIFormulaDSL.g:7469:2: ( ruleMulOrDiv )
            // InternalKPIFormulaDSL.g:7470:3: ruleMulOrDiv
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
    // InternalKPIFormulaDSL.g:7479:1: rule__MulOrDiv__RightAssignment_1_1 : ( ruleOperator ) ;
    public final void rule__MulOrDiv__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7483:1: ( ( ruleOperator ) )
            // InternalKPIFormulaDSL.g:7484:2: ( ruleOperator )
            {
            // InternalKPIFormulaDSL.g:7484:2: ( ruleOperator )
            // InternalKPIFormulaDSL.g:7485:3: ruleOperator
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
    // InternalKPIFormulaDSL.g:7494:1: rule__Operator__ExpressionAssignment_0_2 : ( ruleExpression ) ;
    public final void rule__Operator__ExpressionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7498:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7499:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7499:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7500:3: ruleExpression
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
    // InternalKPIFormulaDSL.g:7509:1: rule__Operator__ElementsAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Operator__ElementsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7513:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7514:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7514:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7515:3: ruleExpression
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
    // InternalKPIFormulaDSL.g:7524:1: rule__Operator__ElementsAssignment_1_3_1 : ( ruleExpression ) ;
    public final void rule__Operator__ElementsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7528:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7529:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7529:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7530:3: ruleExpression
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
    // InternalKPIFormulaDSL.g:7539:1: rule__Operator__ListAssignment_2_3 : ( ruleExpression ) ;
    public final void rule__Operator__ListAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7543:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7544:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7544:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7545:3: ruleExpression
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
    // InternalKPIFormulaDSL.g:7554:1: rule__Operator__ListAssignment_3_3 : ( ruleExpression ) ;
    public final void rule__Operator__ListAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7558:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7559:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7559:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7560:3: ruleExpression
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
    // InternalKPIFormulaDSL.g:7569:1: rule__Operator__WeightsAssignment_3_5 : ( ruleExpression ) ;
    public final void rule__Operator__WeightsAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7573:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7574:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7574:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7575:3: ruleExpression
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
    // InternalKPIFormulaDSL.g:7584:1: rule__Operator__ListAssignment_4_3 : ( ruleExpression ) ;
    public final void rule__Operator__ListAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7588:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7589:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7589:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7590:3: ruleExpression
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
    // InternalKPIFormulaDSL.g:7599:1: rule__Operator__ListAssignment_5_3 : ( ruleExpression ) ;
    public final void rule__Operator__ListAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7603:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7604:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7604:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7605:3: ruleExpression
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


    // $ANTLR start "rule__Operator__ExpressionAssignment_6_3"
    // InternalKPIFormulaDSL.g:7614:1: rule__Operator__ExpressionAssignment_6_3 : ( ruleExpression ) ;
    public final void rule__Operator__ExpressionAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7618:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7619:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7619:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7620:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getExpressionExpressionParserRuleCall_6_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getExpressionExpressionParserRuleCall_6_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__ExpressionAssignment_6_3"


    // $ANTLR start "rule__Operator__ThresholdAssignment_6_5"
    // InternalKPIFormulaDSL.g:7629:1: rule__Operator__ThresholdAssignment_6_5 : ( ruleExpression ) ;
    public final void rule__Operator__ThresholdAssignment_6_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7633:1: ( ( ruleExpression ) )
            // InternalKPIFormulaDSL.g:7634:2: ( ruleExpression )
            {
            // InternalKPIFormulaDSL.g:7634:2: ( ruleExpression )
            // InternalKPIFormulaDSL.g:7635:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getThresholdExpressionParserRuleCall_6_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getThresholdExpressionParserRuleCall_6_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__ThresholdAssignment_6_5"


    // $ANTLR start "rule__Operator__ExpressionAssignment_7_2"
    // InternalKPIFormulaDSL.g:7644:1: rule__Operator__ExpressionAssignment_7_2 : ( ruleTopLevelExpression ) ;
    public final void rule__Operator__ExpressionAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7648:1: ( ( ruleTopLevelExpression ) )
            // InternalKPIFormulaDSL.g:7649:2: ( ruleTopLevelExpression )
            {
            // InternalKPIFormulaDSL.g:7649:2: ( ruleTopLevelExpression )
            // InternalKPIFormulaDSL.g:7650:3: ruleTopLevelExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getExpressionTopLevelExpressionParserRuleCall_7_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTopLevelExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getExpressionTopLevelExpressionParserRuleCall_7_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__ExpressionAssignment_7_2"


    // $ANTLR start "rule__Operator__IteratorsAssignment_7_4"
    // InternalKPIFormulaDSL.g:7659:1: rule__Operator__IteratorsAssignment_7_4 : ( ruleListIterator ) ;
    public final void rule__Operator__IteratorsAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7663:1: ( ( ruleListIterator ) )
            // InternalKPIFormulaDSL.g:7664:2: ( ruleListIterator )
            {
            // InternalKPIFormulaDSL.g:7664:2: ( ruleListIterator )
            // InternalKPIFormulaDSL.g:7665:3: ruleListIterator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_7_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_7_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__IteratorsAssignment_7_4"


    // $ANTLR start "rule__Operator__ListsAssignment_7_6"
    // InternalKPIFormulaDSL.g:7674:1: rule__Operator__ListsAssignment_7_6 : ( rulePrimary ) ;
    public final void rule__Operator__ListsAssignment_7_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7678:1: ( ( rulePrimary ) )
            // InternalKPIFormulaDSL.g:7679:2: ( rulePrimary )
            {
            // InternalKPIFormulaDSL.g:7679:2: ( rulePrimary )
            // InternalKPIFormulaDSL.g:7680:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_7_6_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_7_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__ListsAssignment_7_6"


    // $ANTLR start "rule__Operator__IteratorsAssignment_7_7_1"
    // InternalKPIFormulaDSL.g:7689:1: rule__Operator__IteratorsAssignment_7_7_1 : ( ruleListIterator ) ;
    public final void rule__Operator__IteratorsAssignment_7_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7693:1: ( ( ruleListIterator ) )
            // InternalKPIFormulaDSL.g:7694:2: ( ruleListIterator )
            {
            // InternalKPIFormulaDSL.g:7694:2: ( ruleListIterator )
            // InternalKPIFormulaDSL.g:7695:3: ruleListIterator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_7_7_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_7_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__IteratorsAssignment_7_7_1"


    // $ANTLR start "rule__Operator__ListsAssignment_7_7_3"
    // InternalKPIFormulaDSL.g:7704:1: rule__Operator__ListsAssignment_7_7_3 : ( rulePrimary ) ;
    public final void rule__Operator__ListsAssignment_7_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7708:1: ( ( rulePrimary ) )
            // InternalKPIFormulaDSL.g:7709:2: ( rulePrimary )
            {
            // InternalKPIFormulaDSL.g:7709:2: ( rulePrimary )
            // InternalKPIFormulaDSL.g:7710:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_7_7_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_7_7_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__ListsAssignment_7_7_3"


    // $ANTLR start "rule__Operator__ExpressionAssignment_8_2"
    // InternalKPIFormulaDSL.g:7719:1: rule__Operator__ExpressionAssignment_8_2 : ( ruleTopLevelExpression ) ;
    public final void rule__Operator__ExpressionAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7723:1: ( ( ruleTopLevelExpression ) )
            // InternalKPIFormulaDSL.g:7724:2: ( ruleTopLevelExpression )
            {
            // InternalKPIFormulaDSL.g:7724:2: ( ruleTopLevelExpression )
            // InternalKPIFormulaDSL.g:7725:3: ruleTopLevelExpression
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


    // $ANTLR start "rule__Operator__AccumulatorAssignment_8_4"
    // InternalKPIFormulaDSL.g:7734:1: rule__Operator__AccumulatorAssignment_8_4 : ( rulePrimary ) ;
    public final void rule__Operator__AccumulatorAssignment_8_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7738:1: ( ( rulePrimary ) )
            // InternalKPIFormulaDSL.g:7739:2: ( rulePrimary )
            {
            // InternalKPIFormulaDSL.g:7739:2: ( rulePrimary )
            // InternalKPIFormulaDSL.g:7740:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getAccumulatorPrimaryParserRuleCall_8_4_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getAccumulatorPrimaryParserRuleCall_8_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__AccumulatorAssignment_8_4"


    // $ANTLR start "rule__Operator__IteratorsAssignment_8_6"
    // InternalKPIFormulaDSL.g:7749:1: rule__Operator__IteratorsAssignment_8_6 : ( ruleListIterator ) ;
    public final void rule__Operator__IteratorsAssignment_8_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7753:1: ( ( ruleListIterator ) )
            // InternalKPIFormulaDSL.g:7754:2: ( ruleListIterator )
            {
            // InternalKPIFormulaDSL.g:7754:2: ( ruleListIterator )
            // InternalKPIFormulaDSL.g:7755:3: ruleListIterator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_8_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_8_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__IteratorsAssignment_8_6"


    // $ANTLR start "rule__Operator__ListsAssignment_8_8"
    // InternalKPIFormulaDSL.g:7764:1: rule__Operator__ListsAssignment_8_8 : ( rulePrimary ) ;
    public final void rule__Operator__ListsAssignment_8_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7768:1: ( ( rulePrimary ) )
            // InternalKPIFormulaDSL.g:7769:2: ( rulePrimary )
            {
            // InternalKPIFormulaDSL.g:7769:2: ( rulePrimary )
            // InternalKPIFormulaDSL.g:7770:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_8_8_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_8_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__ListsAssignment_8_8"


    // $ANTLR start "rule__Operator__IteratorsAssignment_8_9_1"
    // InternalKPIFormulaDSL.g:7779:1: rule__Operator__IteratorsAssignment_8_9_1 : ( ruleListIterator ) ;
    public final void rule__Operator__IteratorsAssignment_8_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7783:1: ( ( ruleListIterator ) )
            // InternalKPIFormulaDSL.g:7784:2: ( ruleListIterator )
            {
            // InternalKPIFormulaDSL.g:7784:2: ( ruleListIterator )
            // InternalKPIFormulaDSL.g:7785:3: ruleListIterator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_8_9_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_8_9_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__IteratorsAssignment_8_9_1"


    // $ANTLR start "rule__Operator__ListsAssignment_8_9_3"
    // InternalKPIFormulaDSL.g:7794:1: rule__Operator__ListsAssignment_8_9_3 : ( rulePrimary ) ;
    public final void rule__Operator__ListsAssignment_8_9_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7798:1: ( ( rulePrimary ) )
            // InternalKPIFormulaDSL.g:7799:2: ( rulePrimary )
            {
            // InternalKPIFormulaDSL.g:7799:2: ( rulePrimary )
            // InternalKPIFormulaDSL.g:7800:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_8_9_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_8_9_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__ListsAssignment_8_9_3"


    // $ANTLR start "rule__Operator__ExpressionAssignment_9_2"
    // InternalKPIFormulaDSL.g:7809:1: rule__Operator__ExpressionAssignment_9_2 : ( ruleTopLevelExpression ) ;
    public final void rule__Operator__ExpressionAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7813:1: ( ( ruleTopLevelExpression ) )
            // InternalKPIFormulaDSL.g:7814:2: ( ruleTopLevelExpression )
            {
            // InternalKPIFormulaDSL.g:7814:2: ( ruleTopLevelExpression )
            // InternalKPIFormulaDSL.g:7815:3: ruleTopLevelExpression
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


    // $ANTLR start "rule__Operator__IteratorsAssignment_9_4"
    // InternalKPIFormulaDSL.g:7824:1: rule__Operator__IteratorsAssignment_9_4 : ( ruleListIterator ) ;
    public final void rule__Operator__IteratorsAssignment_9_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7828:1: ( ( ruleListIterator ) )
            // InternalKPIFormulaDSL.g:7829:2: ( ruleListIterator )
            {
            // InternalKPIFormulaDSL.g:7829:2: ( ruleListIterator )
            // InternalKPIFormulaDSL.g:7830:3: ruleListIterator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_9_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_9_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__IteratorsAssignment_9_4"


    // $ANTLR start "rule__Operator__ListsAssignment_9_6"
    // InternalKPIFormulaDSL.g:7839:1: rule__Operator__ListsAssignment_9_6 : ( rulePrimary ) ;
    public final void rule__Operator__ListsAssignment_9_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7843:1: ( ( rulePrimary ) )
            // InternalKPIFormulaDSL.g:7844:2: ( rulePrimary )
            {
            // InternalKPIFormulaDSL.g:7844:2: ( rulePrimary )
            // InternalKPIFormulaDSL.g:7845:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_9_6_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_9_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__ListsAssignment_9_6"


    // $ANTLR start "rule__Operator__IteratorsAssignment_9_7_1"
    // InternalKPIFormulaDSL.g:7854:1: rule__Operator__IteratorsAssignment_9_7_1 : ( ruleListIterator ) ;
    public final void rule__Operator__IteratorsAssignment_9_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7858:1: ( ( ruleListIterator ) )
            // InternalKPIFormulaDSL.g:7859:2: ( ruleListIterator )
            {
            // InternalKPIFormulaDSL.g:7859:2: ( ruleListIterator )
            // InternalKPIFormulaDSL.g:7860:3: ruleListIterator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_9_7_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleListIterator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_9_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__IteratorsAssignment_9_7_1"


    // $ANTLR start "rule__Operator__ListsAssignment_9_7_3"
    // InternalKPIFormulaDSL.g:7869:1: rule__Operator__ListsAssignment_9_7_3 : ( rulePrimary ) ;
    public final void rule__Operator__ListsAssignment_9_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7873:1: ( ( rulePrimary ) )
            // InternalKPIFormulaDSL.g:7874:2: ( rulePrimary )
            {
            // InternalKPIFormulaDSL.g:7874:2: ( rulePrimary )
            // InternalKPIFormulaDSL.g:7875:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_9_7_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_9_7_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__ListsAssignment_9_7_3"


    // $ANTLR start "rule__Primary__ExpressionAssignment_1_2"
    // InternalKPIFormulaDSL.g:7884:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7888:1: ( ( rulePrimary ) )
            // InternalKPIFormulaDSL.g:7889:2: ( rulePrimary )
            {
            // InternalKPIFormulaDSL.g:7889:2: ( rulePrimary )
            // InternalKPIFormulaDSL.g:7890:3: rulePrimary
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
    // InternalKPIFormulaDSL.g:7899:1: rule__Primary__ExpressionAssignment_2_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7903:1: ( ( rulePrimary ) )
            // InternalKPIFormulaDSL.g:7904:2: ( rulePrimary )
            {
            // InternalKPIFormulaDSL.g:7904:2: ( rulePrimary )
            // InternalKPIFormulaDSL.g:7905:3: rulePrimary
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
    // InternalKPIFormulaDSL.g:7914:1: rule__ListIterator__NameAssignment : ( RULE_ID ) ;
    public final void rule__ListIterator__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7918:1: ( ( RULE_ID ) )
            // InternalKPIFormulaDSL.g:7919:2: ( RULE_ID )
            {
            // InternalKPIFormulaDSL.g:7919:2: ( RULE_ID )
            // InternalKPIFormulaDSL.g:7920:3: RULE_ID
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
    // InternalKPIFormulaDSL.g:7929:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7933:1: ( ( RULE_INT ) )
            // InternalKPIFormulaDSL.g:7934:2: ( RULE_INT )
            {
            // InternalKPIFormulaDSL.g:7934:2: ( RULE_INT )
            // InternalKPIFormulaDSL.g:7935:3: RULE_INT
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
    // InternalKPIFormulaDSL.g:7944:1: rule__Atomic__ValueAssignment_2_1 : ( RULE_DOUBLE ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7948:1: ( ( RULE_DOUBLE ) )
            // InternalKPIFormulaDSL.g:7949:2: ( RULE_DOUBLE )
            {
            // InternalKPIFormulaDSL.g:7949:2: ( RULE_DOUBLE )
            // InternalKPIFormulaDSL.g:7950:3: RULE_DOUBLE
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
    // InternalKPIFormulaDSL.g:7959:1: rule__Atomic__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7963:1: ( ( RULE_STRING ) )
            // InternalKPIFormulaDSL.g:7964:2: ( RULE_STRING )
            {
            // InternalKPIFormulaDSL.g:7964:2: ( RULE_STRING )
            // InternalKPIFormulaDSL.g:7965:3: RULE_STRING
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
    // InternalKPIFormulaDSL.g:7974:1: rule__Atomic__ValueAssignment_4_1 : ( ( rule__Atomic__ValueAlternatives_4_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7978:1: ( ( ( rule__Atomic__ValueAlternatives_4_1_0 ) ) )
            // InternalKPIFormulaDSL.g:7979:2: ( ( rule__Atomic__ValueAlternatives_4_1_0 ) )
            {
            // InternalKPIFormulaDSL.g:7979:2: ( ( rule__Atomic__ValueAlternatives_4_1_0 ) )
            // InternalKPIFormulaDSL.g:7980:3: ( rule__Atomic__ValueAlternatives_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAlternatives_4_1_0()); 
            }
            // InternalKPIFormulaDSL.g:7981:3: ( rule__Atomic__ValueAlternatives_4_1_0 )
            // InternalKPIFormulaDSL.g:7981:4: rule__Atomic__ValueAlternatives_4_1_0
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
    // InternalKPIFormulaDSL.g:7989:1: rule__Atomic__ValueAssignment_5_1 : ( RULE_DOUBLE ) ;
    public final void rule__Atomic__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:7993:1: ( ( RULE_DOUBLE ) )
            // InternalKPIFormulaDSL.g:7994:2: ( RULE_DOUBLE )
            {
            // InternalKPIFormulaDSL.g:7994:2: ( RULE_DOUBLE )
            // InternalKPIFormulaDSL.g:7995:3: RULE_DOUBLE
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
    // InternalKPIFormulaDSL.g:8004:1: rule__Atomic__UnitAssignment_5_2 : ( ruleValueUnit ) ;
    public final void rule__Atomic__UnitAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:8008:1: ( ( ruleValueUnit ) )
            // InternalKPIFormulaDSL.g:8009:2: ( ruleValueUnit )
            {
            // InternalKPIFormulaDSL.g:8009:2: ( ruleValueUnit )
            // InternalKPIFormulaDSL.g:8010:3: ruleValueUnit
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
    // InternalKPIFormulaDSL.g:8019:1: rule__Atomic__LiteralAssignment_6_1 : ( ( RULE_FQN ) ) ;
    public final void rule__Atomic__LiteralAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:8023:1: ( ( ( RULE_FQN ) ) )
            // InternalKPIFormulaDSL.g:8024:2: ( ( RULE_FQN ) )
            {
            // InternalKPIFormulaDSL.g:8024:2: ( ( RULE_FQN ) )
            // InternalKPIFormulaDSL.g:8025:3: ( RULE_FQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getLiteralEnumerationLiteralCrossReference_6_1_0()); 
            }
            // InternalKPIFormulaDSL.g:8026:3: ( RULE_FQN )
            // InternalKPIFormulaDSL.g:8027:4: RULE_FQN
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
    // InternalKPIFormulaDSL.g:8038:1: rule__Atomic__ComputableAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__ComputableAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKPIFormulaDSL.g:8042:1: ( ( ( RULE_ID ) ) )
            // InternalKPIFormulaDSL.g:8043:2: ( ( RULE_ID ) )
            {
            // InternalKPIFormulaDSL.g:8043:2: ( ( RULE_ID ) )
            // InternalKPIFormulaDSL.g:8044:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getComputableComputableCrossReference_7_1_0()); 
            }
            // InternalKPIFormulaDSL.g:8045:3: ( RULE_ID )
            // InternalKPIFormulaDSL.g:8046:4: RULE_ID
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
    static final String dfa_2s = "\3\uffff\1\10\6\uffff";
    static final String dfa_3s = "\1\4\2\uffff\1\4\6\uffff";
    static final String dfa_4s = "\1\116\2\uffff\1\113\6\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\7\1\10\1\3\1\6";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\7\1\2\1\3\1\4\1\6\4\uffff\2\5\77\uffff\1\1",
            "",
            "",
            "\1\10\12\uffff\3\11\2\uffff\7\11\3\uffff\1\10\5\uffff\1\10\1\uffff\1\10\10\uffff\17\10\1\uffff\2\10\2\uffff\1\10\7\uffff\1\10",
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
            return "1323:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) | ( ( rule__Atomic__Group_5__0 ) ) | ( ( rule__Atomic__Group_6__0 ) ) | ( ( rule__Atomic__Group_7__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x64000008000061F0L,0x00000000000075F6L});
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
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x64000008000061F2L,0x00000000000075F6L});
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
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000100L});

}