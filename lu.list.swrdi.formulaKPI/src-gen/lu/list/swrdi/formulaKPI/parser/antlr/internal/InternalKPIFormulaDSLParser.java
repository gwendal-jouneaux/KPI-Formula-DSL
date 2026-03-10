package lu.list.swrdi.formulaKPI.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import lu.list.swrdi.formulaKPI.services.KPIFormulaDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKPIFormulaDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_STRING", "RULE_FQN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'of'", "'type'", "'KPI'", "'int'", "'real'", "'text'", "'bool'", "'{'", "'}'", "'aggregate'", "'for'", "'drift'", "'Minimum'", "'Maximum'", "'Average'", "'Median'", "'Standard'", "'deviation'", "'->'", "';'", "'otherwise'", "'or'", "'and'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'|'", "'['", "','", "']'", "'AVERAGE'", "'('", "')'", "'WEIGHTED_SUM'", "'MIN'", "'MAX'", "'THRESHOLD'", "'do'", "'in'", "'reduce'", "'starting'", "'filter'", "'!'", "'accumulator'", "'true'", "'false'", "'seconds'", "'minutes'", "'hours'", "'days'", "'measurements'", "'milliseconds'", "'liters'", "'cubic meter'", "'Wh'", "'kWh'", "'gCO2eq'", "'kgCO2eq'"
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

        public InternalKPIFormulaDSLParser(TokenStream input, KPIFormulaDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "KPIFormulaDSL";
       	}

       	@Override
       	protected KPIFormulaDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleKPIFormulaDSL"
    // InternalKPIFormulaDSL.g:65:1: entryRuleKPIFormulaDSL returns [EObject current=null] : iv_ruleKPIFormulaDSL= ruleKPIFormulaDSL EOF ;
    public final EObject entryRuleKPIFormulaDSL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPIFormulaDSL = null;


        try {
            // InternalKPIFormulaDSL.g:65:54: (iv_ruleKPIFormulaDSL= ruleKPIFormulaDSL EOF )
            // InternalKPIFormulaDSL.g:66:2: iv_ruleKPIFormulaDSL= ruleKPIFormulaDSL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKPIFormulaDSLRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKPIFormulaDSL=ruleKPIFormulaDSL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKPIFormulaDSL; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKPIFormulaDSL"


    // $ANTLR start "ruleKPIFormulaDSL"
    // InternalKPIFormulaDSL.g:72:1: ruleKPIFormulaDSL returns [EObject current=null] : ( ( (lv_declarations_0_0= ruleDeclaration ) ) | ( (lv_computations_1_0= ruleComputation ) ) )* ;
    public final EObject ruleKPIFormulaDSL() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_0_0 = null;

        EObject lv_computations_1_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:78:2: ( ( ( (lv_declarations_0_0= ruleDeclaration ) ) | ( (lv_computations_1_0= ruleComputation ) ) )* )
            // InternalKPIFormulaDSL.g:79:2: ( ( (lv_declarations_0_0= ruleDeclaration ) ) | ( (lv_computations_1_0= ruleComputation ) ) )*
            {
            // InternalKPIFormulaDSL.g:79:2: ( ( (lv_declarations_0_0= ruleDeclaration ) ) | ( (lv_computations_1_0= ruleComputation ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }
                else if ( (LA1_0==RULE_ID) ) {
                    int LA1_3 = input.LA(2);

                    if ( (LA1_3==14) ) {
                        alt1=1;
                    }
                    else if ( (LA1_3==13) ) {
                        alt1=2;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:80:3: ( (lv_declarations_0_0= ruleDeclaration ) )
            	    {
            	    // InternalKPIFormulaDSL.g:80:3: ( (lv_declarations_0_0= ruleDeclaration ) )
            	    // InternalKPIFormulaDSL.g:81:4: (lv_declarations_0_0= ruleDeclaration )
            	    {
            	    // InternalKPIFormulaDSL.g:81:4: (lv_declarations_0_0= ruleDeclaration )
            	    // InternalKPIFormulaDSL.g:82:5: lv_declarations_0_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getKPIFormulaDSLAccess().getDeclarationsDeclarationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_declarations_0_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getKPIFormulaDSLRule());
            	      					}
            	      					add(
            	      						current,
            	      						"declarations",
            	      						lv_declarations_0_0,
            	      						"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Declaration");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalKPIFormulaDSL.g:100:3: ( (lv_computations_1_0= ruleComputation ) )
            	    {
            	    // InternalKPIFormulaDSL.g:100:3: ( (lv_computations_1_0= ruleComputation ) )
            	    // InternalKPIFormulaDSL.g:101:4: (lv_computations_1_0= ruleComputation )
            	    {
            	    // InternalKPIFormulaDSL.g:101:4: (lv_computations_1_0= ruleComputation )
            	    // InternalKPIFormulaDSL.g:102:5: lv_computations_1_0= ruleComputation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getKPIFormulaDSLAccess().getComputationsComputationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_computations_1_0=ruleComputation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getKPIFormulaDSLRule());
            	      					}
            	      					add(
            	      						current,
            	      						"computations",
            	      						lv_computations_1_0,
            	      						"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Computation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKPIFormulaDSL"


    // $ANTLR start "entryRuleDeclaration"
    // InternalKPIFormulaDSL.g:123:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalKPIFormulaDSL.g:123:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalKPIFormulaDSL.g:124:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalKPIFormulaDSL.g:130:1: ruleDeclaration returns [EObject current=null] : ( (lv_declared_0_0= ruleDeclarable ) ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_declared_0_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:136:2: ( ( (lv_declared_0_0= ruleDeclarable ) ) )
            // InternalKPIFormulaDSL.g:137:2: ( (lv_declared_0_0= ruleDeclarable ) )
            {
            // InternalKPIFormulaDSL.g:137:2: ( (lv_declared_0_0= ruleDeclarable ) )
            // InternalKPIFormulaDSL.g:138:3: (lv_declared_0_0= ruleDeclarable )
            {
            // InternalKPIFormulaDSL.g:138:3: (lv_declared_0_0= ruleDeclarable )
            // InternalKPIFormulaDSL.g:139:4: lv_declared_0_0= ruleDeclarable
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getDeclarationAccess().getDeclaredDeclarableParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_declared_0_0=ruleDeclarable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getDeclarationRule());
              				}
              				set(
              					current,
              					"declared",
              					lv_declared_0_0,
              					"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Declarable");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleComputation"
    // InternalKPIFormulaDSL.g:159:1: entryRuleComputation returns [EObject current=null] : iv_ruleComputation= ruleComputation EOF ;
    public final EObject entryRuleComputation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputation = null;


        try {
            // InternalKPIFormulaDSL.g:159:52: (iv_ruleComputation= ruleComputation EOF )
            // InternalKPIFormulaDSL.g:160:2: iv_ruleComputation= ruleComputation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComputationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComputation=ruleComputation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComputation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComputation"


    // $ANTLR start "ruleComputation"
    // InternalKPIFormulaDSL.g:166:1: ruleComputation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_formula_2_0= ruleTopLevelExpression ) ) ) ;
    public final EObject ruleComputation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_formula_2_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:172:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_formula_2_0= ruleTopLevelExpression ) ) ) )
            // InternalKPIFormulaDSL.g:173:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_formula_2_0= ruleTopLevelExpression ) ) )
            {
            // InternalKPIFormulaDSL.g:173:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_formula_2_0= ruleTopLevelExpression ) ) )
            // InternalKPIFormulaDSL.g:174:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_formula_2_0= ruleTopLevelExpression ) )
            {
            // InternalKPIFormulaDSL.g:174:3: ( (otherlv_0= RULE_ID ) )
            // InternalKPIFormulaDSL.g:175:4: (otherlv_0= RULE_ID )
            {
            // InternalKPIFormulaDSL.g:175:4: (otherlv_0= RULE_ID )
            // InternalKPIFormulaDSL.g:176:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComputationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getComputationAccess().getComputedComputableCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComputationAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalKPIFormulaDSL.g:191:3: ( (lv_formula_2_0= ruleTopLevelExpression ) )
            // InternalKPIFormulaDSL.g:192:4: (lv_formula_2_0= ruleTopLevelExpression )
            {
            // InternalKPIFormulaDSL.g:192:4: (lv_formula_2_0= ruleTopLevelExpression )
            // InternalKPIFormulaDSL.g:193:5: lv_formula_2_0= ruleTopLevelExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComputationAccess().getFormulaTopLevelExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_formula_2_0=ruleTopLevelExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComputationRule());
              					}
              					set(
              						current,
              						"formula",
              						lv_formula_2_0,
              						"lu.list.swrdi.formulaKPI.KPIFormulaDSL.TopLevelExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComputation"


    // $ANTLR start "entryRuleDeclarable"
    // InternalKPIFormulaDSL.g:214:1: entryRuleDeclarable returns [EObject current=null] : iv_ruleDeclarable= ruleDeclarable EOF ;
    public final EObject entryRuleDeclarable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarable = null;


        try {
            // InternalKPIFormulaDSL.g:214:51: (iv_ruleDeclarable= ruleDeclarable EOF )
            // InternalKPIFormulaDSL.g:215:2: iv_ruleDeclarable= ruleDeclarable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclarable=ruleDeclarable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarable"


    // $ANTLR start "ruleDeclarable"
    // InternalKPIFormulaDSL.g:221:1: ruleDeclarable returns [EObject current=null] : (this_KPI_0= ruleKPI | this_Metric_1= ruleMetric ) ;
    public final EObject ruleDeclarable() throws RecognitionException {
        EObject current = null;

        EObject this_KPI_0 = null;

        EObject this_Metric_1 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:227:2: ( (this_KPI_0= ruleKPI | this_Metric_1= ruleMetric ) )
            // InternalKPIFormulaDSL.g:228:2: (this_KPI_0= ruleKPI | this_Metric_1= ruleMetric )
            {
            // InternalKPIFormulaDSL.g:228:2: (this_KPI_0= ruleKPI | this_Metric_1= ruleMetric )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalKPIFormulaDSL.g:229:3: this_KPI_0= ruleKPI
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclarableAccess().getKPIParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_KPI_0=ruleKPI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_KPI_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:238:3: this_Metric_1= ruleMetric
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclarableAccess().getMetricParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Metric_1=ruleMetric();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Metric_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarable"


    // $ANTLR start "entryRuleMetric"
    // InternalKPIFormulaDSL.g:250:1: entryRuleMetric returns [EObject current=null] : iv_ruleMetric= ruleMetric EOF ;
    public final EObject entryRuleMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetric = null;


        try {
            // InternalKPIFormulaDSL.g:250:47: (iv_ruleMetric= ruleMetric EOF )
            // InternalKPIFormulaDSL.g:251:2: iv_ruleMetric= ruleMetric EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetricRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMetric=ruleMetric();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetric; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetric"


    // $ANTLR start "ruleMetric"
    // InternalKPIFormulaDSL.g:257:1: ruleMetric returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleValueType ) ) ) ;
    public final EObject ruleMetric() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:263:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleValueType ) ) ) )
            // InternalKPIFormulaDSL.g:264:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleValueType ) ) )
            {
            // InternalKPIFormulaDSL.g:264:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleValueType ) ) )
            // InternalKPIFormulaDSL.g:265:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleValueType ) )
            {
            // InternalKPIFormulaDSL.g:265:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalKPIFormulaDSL.g:266:4: (lv_name_0_0= RULE_ID )
            {
            // InternalKPIFormulaDSL.g:266:4: (lv_name_0_0= RULE_ID )
            // InternalKPIFormulaDSL.g:267:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getMetricAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMetricRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMetricAccess().getOfKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMetricAccess().getTypeKeyword_2());
              		
            }
            // InternalKPIFormulaDSL.g:291:3: ( (lv_type_3_0= ruleValueType ) )
            // InternalKPIFormulaDSL.g:292:4: (lv_type_3_0= ruleValueType )
            {
            // InternalKPIFormulaDSL.g:292:4: (lv_type_3_0= ruleValueType )
            // InternalKPIFormulaDSL.g:293:5: lv_type_3_0= ruleValueType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMetricAccess().getTypeValueTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleValueType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMetricRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_3_0,
              						"lu.list.swrdi.formulaKPI.KPIFormulaDSL.ValueType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetric"


    // $ANTLR start "entryRuleKPI"
    // InternalKPIFormulaDSL.g:314:1: entryRuleKPI returns [EObject current=null] : iv_ruleKPI= ruleKPI EOF ;
    public final EObject entryRuleKPI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPI = null;


        try {
            // InternalKPIFormulaDSL.g:314:44: (iv_ruleKPI= ruleKPI EOF )
            // InternalKPIFormulaDSL.g:315:2: iv_ruleKPI= ruleKPI EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKPIRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKPI=ruleKPI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKPI; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKPI"


    // $ANTLR start "ruleKPI"
    // InternalKPIFormulaDSL.g:321:1: ruleKPI returns [EObject current=null] : (otherlv_0= 'KPI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (lv_type_4_0= ruleValueType ) ) ) ;
    public final EObject ruleKPI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:327:2: ( (otherlv_0= 'KPI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (lv_type_4_0= ruleValueType ) ) ) )
            // InternalKPIFormulaDSL.g:328:2: (otherlv_0= 'KPI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (lv_type_4_0= ruleValueType ) ) )
            {
            // InternalKPIFormulaDSL.g:328:2: (otherlv_0= 'KPI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (lv_type_4_0= ruleValueType ) ) )
            // InternalKPIFormulaDSL.g:329:3: otherlv_0= 'KPI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (lv_type_4_0= ruleValueType ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getKPIAccess().getKPIKeyword_0());
              		
            }
            // InternalKPIFormulaDSL.g:333:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalKPIFormulaDSL.g:334:4: (lv_name_1_0= RULE_ID )
            {
            // InternalKPIFormulaDSL.g:334:4: (lv_name_1_0= RULE_ID )
            // InternalKPIFormulaDSL.g:335:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getKPIAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getKPIRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getKPIAccess().getOfKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getKPIAccess().getTypeKeyword_3());
              		
            }
            // InternalKPIFormulaDSL.g:359:3: ( (lv_type_4_0= ruleValueType ) )
            // InternalKPIFormulaDSL.g:360:4: (lv_type_4_0= ruleValueType )
            {
            // InternalKPIFormulaDSL.g:360:4: (lv_type_4_0= ruleValueType )
            // InternalKPIFormulaDSL.g:361:5: lv_type_4_0= ruleValueType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getKPIAccess().getTypeValueTypeParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_4_0=ruleValueType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getKPIRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_4_0,
              						"lu.list.swrdi.formulaKPI.KPIFormulaDSL.ValueType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKPI"


    // $ANTLR start "entryRuleValueType"
    // InternalKPIFormulaDSL.g:382:1: entryRuleValueType returns [EObject current=null] : iv_ruleValueType= ruleValueType EOF ;
    public final EObject entryRuleValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType = null;


        try {
            // InternalKPIFormulaDSL.g:382:50: (iv_ruleValueType= ruleValueType EOF )
            // InternalKPIFormulaDSL.g:383:2: iv_ruleValueType= ruleValueType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValueType=ruleValueType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueType"


    // $ANTLR start "ruleValueType"
    // InternalKPIFormulaDSL.g:389:1: ruleValueType returns [EObject current=null] : (this_IntegerValue_0= ruleIntegerValue | this_RealValue_1= ruleRealValue | this_TextualValue_2= ruleTextualValue | this_BooleanValue_3= ruleBooleanValue | this_EnumerationValue_4= ruleEnumerationValue | this_AggregationValue_5= ruleAggregationValue | this_DriftValue_6= ruleDriftValue | this_UnitValue_7= ruleUnitValue ) ;
    public final EObject ruleValueType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerValue_0 = null;

        EObject this_RealValue_1 = null;

        EObject this_TextualValue_2 = null;

        EObject this_BooleanValue_3 = null;

        EObject this_EnumerationValue_4 = null;

        EObject this_AggregationValue_5 = null;

        EObject this_DriftValue_6 = null;

        EObject this_UnitValue_7 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:395:2: ( (this_IntegerValue_0= ruleIntegerValue | this_RealValue_1= ruleRealValue | this_TextualValue_2= ruleTextualValue | this_BooleanValue_3= ruleBooleanValue | this_EnumerationValue_4= ruleEnumerationValue | this_AggregationValue_5= ruleAggregationValue | this_DriftValue_6= ruleDriftValue | this_UnitValue_7= ruleUnitValue ) )
            // InternalKPIFormulaDSL.g:396:2: (this_IntegerValue_0= ruleIntegerValue | this_RealValue_1= ruleRealValue | this_TextualValue_2= ruleTextualValue | this_BooleanValue_3= ruleBooleanValue | this_EnumerationValue_4= ruleEnumerationValue | this_AggregationValue_5= ruleAggregationValue | this_DriftValue_6= ruleDriftValue | this_UnitValue_7= ruleUnitValue )
            {
            // InternalKPIFormulaDSL.g:396:2: (this_IntegerValue_0= ruleIntegerValue | this_RealValue_1= ruleRealValue | this_TextualValue_2= ruleTextualValue | this_BooleanValue_3= ruleBooleanValue | this_EnumerationValue_4= ruleEnumerationValue | this_AggregationValue_5= ruleAggregationValue | this_DriftValue_6= ruleDriftValue | this_UnitValue_7= ruleUnitValue )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
                }
                break;
            case 21:
                {
                alt3=5;
                }
                break;
            case 23:
                {
                alt3=6;
                }
                break;
            case 25:
                {
                alt3=7;
                }
                break;
            case 67:
            case 68:
            case 69:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
                {
                alt3=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalKPIFormulaDSL.g:397:3: this_IntegerValue_0= ruleIntegerValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueTypeAccess().getIntegerValueParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntegerValue_0=ruleIntegerValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerValue_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:406:3: this_RealValue_1= ruleRealValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueTypeAccess().getRealValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RealValue_1=ruleRealValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RealValue_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKPIFormulaDSL.g:415:3: this_TextualValue_2= ruleTextualValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueTypeAccess().getTextualValueParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TextualValue_2=ruleTextualValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TextualValue_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKPIFormulaDSL.g:424:3: this_BooleanValue_3= ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueTypeAccess().getBooleanValueParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_3=ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanValue_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalKPIFormulaDSL.g:433:3: this_EnumerationValue_4= ruleEnumerationValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueTypeAccess().getEnumerationValueParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumerationValue_4=ruleEnumerationValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnumerationValue_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalKPIFormulaDSL.g:442:3: this_AggregationValue_5= ruleAggregationValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueTypeAccess().getAggregationValueParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AggregationValue_5=ruleAggregationValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AggregationValue_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalKPIFormulaDSL.g:451:3: this_DriftValue_6= ruleDriftValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueTypeAccess().getDriftValueParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DriftValue_6=ruleDriftValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DriftValue_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalKPIFormulaDSL.g:460:3: this_UnitValue_7= ruleUnitValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueTypeAccess().getUnitValueParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnitValue_7=ruleUnitValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnitValue_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueType"


    // $ANTLR start "entryRuleIntegerValue"
    // InternalKPIFormulaDSL.g:472:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // InternalKPIFormulaDSL.g:472:53: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // InternalKPIFormulaDSL.g:473:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // InternalKPIFormulaDSL.g:479:1: ruleIntegerValue returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:485:2: ( ( () otherlv_1= 'int' ) )
            // InternalKPIFormulaDSL.g:486:2: ( () otherlv_1= 'int' )
            {
            // InternalKPIFormulaDSL.g:486:2: ( () otherlv_1= 'int' )
            // InternalKPIFormulaDSL.g:487:3: () otherlv_1= 'int'
            {
            // InternalKPIFormulaDSL.g:487:3: ()
            // InternalKPIFormulaDSL.g:488:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIntegerValueAccess().getIntegerValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIntegerValueAccess().getIntKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleRealValue"
    // InternalKPIFormulaDSL.g:502:1: entryRuleRealValue returns [EObject current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final EObject entryRuleRealValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealValue = null;


        try {
            // InternalKPIFormulaDSL.g:502:50: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalKPIFormulaDSL.g:503:2: iv_ruleRealValue= ruleRealValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRealValue=ruleRealValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealValue"


    // $ANTLR start "ruleRealValue"
    // InternalKPIFormulaDSL.g:509:1: ruleRealValue returns [EObject current=null] : ( () otherlv_1= 'real' ) ;
    public final EObject ruleRealValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:515:2: ( ( () otherlv_1= 'real' ) )
            // InternalKPIFormulaDSL.g:516:2: ( () otherlv_1= 'real' )
            {
            // InternalKPIFormulaDSL.g:516:2: ( () otherlv_1= 'real' )
            // InternalKPIFormulaDSL.g:517:3: () otherlv_1= 'real'
            {
            // InternalKPIFormulaDSL.g:517:3: ()
            // InternalKPIFormulaDSL.g:518:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRealValueAccess().getRealValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRealValueAccess().getRealKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealValue"


    // $ANTLR start "entryRuleTextualValue"
    // InternalKPIFormulaDSL.g:532:1: entryRuleTextualValue returns [EObject current=null] : iv_ruleTextualValue= ruleTextualValue EOF ;
    public final EObject entryRuleTextualValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextualValue = null;


        try {
            // InternalKPIFormulaDSL.g:532:53: (iv_ruleTextualValue= ruleTextualValue EOF )
            // InternalKPIFormulaDSL.g:533:2: iv_ruleTextualValue= ruleTextualValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextualValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTextualValue=ruleTextualValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextualValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextualValue"


    // $ANTLR start "ruleTextualValue"
    // InternalKPIFormulaDSL.g:539:1: ruleTextualValue returns [EObject current=null] : ( () otherlv_1= 'text' ) ;
    public final EObject ruleTextualValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:545:2: ( ( () otherlv_1= 'text' ) )
            // InternalKPIFormulaDSL.g:546:2: ( () otherlv_1= 'text' )
            {
            // InternalKPIFormulaDSL.g:546:2: ( () otherlv_1= 'text' )
            // InternalKPIFormulaDSL.g:547:3: () otherlv_1= 'text'
            {
            // InternalKPIFormulaDSL.g:547:3: ()
            // InternalKPIFormulaDSL.g:548:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTextualValueAccess().getTextualValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTextualValueAccess().getTextKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextualValue"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalKPIFormulaDSL.g:562:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalKPIFormulaDSL.g:562:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalKPIFormulaDSL.g:563:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalKPIFormulaDSL.g:569:1: ruleBooleanValue returns [EObject current=null] : ( () otherlv_1= 'bool' ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:575:2: ( ( () otherlv_1= 'bool' ) )
            // InternalKPIFormulaDSL.g:576:2: ( () otherlv_1= 'bool' )
            {
            // InternalKPIFormulaDSL.g:576:2: ( () otherlv_1= 'bool' )
            // InternalKPIFormulaDSL.g:577:3: () otherlv_1= 'bool'
            {
            // InternalKPIFormulaDSL.g:577:3: ()
            // InternalKPIFormulaDSL.g:578:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBooleanValueAccess().getBooleanValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBooleanValueAccess().getBoolKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleEnumerationValue"
    // InternalKPIFormulaDSL.g:592:1: entryRuleEnumerationValue returns [EObject current=null] : iv_ruleEnumerationValue= ruleEnumerationValue EOF ;
    public final EObject entryRuleEnumerationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationValue = null;


        try {
            // InternalKPIFormulaDSL.g:592:57: (iv_ruleEnumerationValue= ruleEnumerationValue EOF )
            // InternalKPIFormulaDSL.g:593:2: iv_ruleEnumerationValue= ruleEnumerationValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationValue=ruleEnumerationValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationValue"


    // $ANTLR start "ruleEnumerationValue"
    // InternalKPIFormulaDSL.g:599:1: ruleEnumerationValue returns [EObject current=null] : (otherlv_0= '{' ( (lv_literals_1_0= ruleEnumerationLiteral ) )+ otherlv_2= '}' ) ;
    public final EObject ruleEnumerationValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_literals_1_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:605:2: ( (otherlv_0= '{' ( (lv_literals_1_0= ruleEnumerationLiteral ) )+ otherlv_2= '}' ) )
            // InternalKPIFormulaDSL.g:606:2: (otherlv_0= '{' ( (lv_literals_1_0= ruleEnumerationLiteral ) )+ otherlv_2= '}' )
            {
            // InternalKPIFormulaDSL.g:606:2: (otherlv_0= '{' ( (lv_literals_1_0= ruleEnumerationLiteral ) )+ otherlv_2= '}' )
            // InternalKPIFormulaDSL.g:607:3: otherlv_0= '{' ( (lv_literals_1_0= ruleEnumerationLiteral ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumerationValueAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalKPIFormulaDSL.g:611:3: ( (lv_literals_1_0= ruleEnumerationLiteral ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:612:4: (lv_literals_1_0= ruleEnumerationLiteral )
            	    {
            	    // InternalKPIFormulaDSL.g:612:4: (lv_literals_1_0= ruleEnumerationLiteral )
            	    // InternalKPIFormulaDSL.g:613:5: lv_literals_1_0= ruleEnumerationLiteral
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnumerationValueAccess().getLiteralsEnumerationLiteralParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_literals_1_0=ruleEnumerationLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEnumerationValueRule());
            	      					}
            	      					add(
            	      						current,
            	      						"literals",
            	      						lv_literals_1_0,
            	      						"lu.list.swrdi.formulaKPI.KPIFormulaDSL.EnumerationLiteral");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_2=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEnumerationValueAccess().getRightCurlyBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationValue"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalKPIFormulaDSL.g:638:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalKPIFormulaDSL.g:638:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalKPIFormulaDSL.g:639:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // InternalKPIFormulaDSL.g:645:1: ruleEnumerationLiteral returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:651:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalKPIFormulaDSL.g:652:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalKPIFormulaDSL.g:652:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalKPIFormulaDSL.g:653:3: (lv_name_0_0= RULE_ID )
            {
            // InternalKPIFormulaDSL.g:653:3: (lv_name_0_0= RULE_ID )
            // InternalKPIFormulaDSL.g:654:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getEnumerationLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleUnitValue"
    // InternalKPIFormulaDSL.g:673:1: entryRuleUnitValue returns [EObject current=null] : iv_ruleUnitValue= ruleUnitValue EOF ;
    public final EObject entryRuleUnitValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitValue = null;


        try {
            // InternalKPIFormulaDSL.g:673:50: (iv_ruleUnitValue= ruleUnitValue EOF )
            // InternalKPIFormulaDSL.g:674:2: iv_ruleUnitValue= ruleUnitValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnitValue=ruleUnitValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnitValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnitValue"


    // $ANTLR start "ruleUnitValue"
    // InternalKPIFormulaDSL.g:680:1: ruleUnitValue returns [EObject current=null] : ( (lv_unit_0_0= ruleValueUnit ) ) ;
    public final EObject ruleUnitValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_unit_0_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:686:2: ( ( (lv_unit_0_0= ruleValueUnit ) ) )
            // InternalKPIFormulaDSL.g:687:2: ( (lv_unit_0_0= ruleValueUnit ) )
            {
            // InternalKPIFormulaDSL.g:687:2: ( (lv_unit_0_0= ruleValueUnit ) )
            // InternalKPIFormulaDSL.g:688:3: (lv_unit_0_0= ruleValueUnit )
            {
            // InternalKPIFormulaDSL.g:688:3: (lv_unit_0_0= ruleValueUnit )
            // InternalKPIFormulaDSL.g:689:4: lv_unit_0_0= ruleValueUnit
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getUnitValueAccess().getUnitValueUnitEnumRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_unit_0_0=ruleValueUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getUnitValueRule());
              				}
              				set(
              					current,
              					"unit",
              					lv_unit_0_0,
              					"lu.list.swrdi.formulaKPI.KPIFormulaDSL.ValueUnit");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnitValue"


    // $ANTLR start "entryRuleAggregationValue"
    // InternalKPIFormulaDSL.g:709:1: entryRuleAggregationValue returns [EObject current=null] : iv_ruleAggregationValue= ruleAggregationValue EOF ;
    public final EObject entryRuleAggregationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregationValue = null;


        try {
            // InternalKPIFormulaDSL.g:709:57: (iv_ruleAggregationValue= ruleAggregationValue EOF )
            // InternalKPIFormulaDSL.g:710:2: iv_ruleAggregationValue= ruleAggregationValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAggregationValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAggregationValue=ruleAggregationValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAggregationValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAggregationValue"


    // $ANTLR start "ruleAggregationValue"
    // InternalKPIFormulaDSL.g:716:1: ruleAggregationValue returns [EObject current=null] : (otherlv_0= 'aggregate' ( (lv_operation_1_0= ruleOperation ) ) otherlv_2= 'for' ( (lv_window_3_0= RULE_INT ) ) ( (lv_windowUnit_4_0= ruleWindowUnit ) ) ) ;
    public final EObject ruleAggregationValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_window_3_0=null;
        EObject lv_operation_1_0 = null;

        Enumerator lv_windowUnit_4_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:722:2: ( (otherlv_0= 'aggregate' ( (lv_operation_1_0= ruleOperation ) ) otherlv_2= 'for' ( (lv_window_3_0= RULE_INT ) ) ( (lv_windowUnit_4_0= ruleWindowUnit ) ) ) )
            // InternalKPIFormulaDSL.g:723:2: (otherlv_0= 'aggregate' ( (lv_operation_1_0= ruleOperation ) ) otherlv_2= 'for' ( (lv_window_3_0= RULE_INT ) ) ( (lv_windowUnit_4_0= ruleWindowUnit ) ) )
            {
            // InternalKPIFormulaDSL.g:723:2: (otherlv_0= 'aggregate' ( (lv_operation_1_0= ruleOperation ) ) otherlv_2= 'for' ( (lv_window_3_0= RULE_INT ) ) ( (lv_windowUnit_4_0= ruleWindowUnit ) ) )
            // InternalKPIFormulaDSL.g:724:3: otherlv_0= 'aggregate' ( (lv_operation_1_0= ruleOperation ) ) otherlv_2= 'for' ( (lv_window_3_0= RULE_INT ) ) ( (lv_windowUnit_4_0= ruleWindowUnit ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAggregationValueAccess().getAggregateKeyword_0());
              		
            }
            // InternalKPIFormulaDSL.g:728:3: ( (lv_operation_1_0= ruleOperation ) )
            // InternalKPIFormulaDSL.g:729:4: (lv_operation_1_0= ruleOperation )
            {
            // InternalKPIFormulaDSL.g:729:4: (lv_operation_1_0= ruleOperation )
            // InternalKPIFormulaDSL.g:730:5: lv_operation_1_0= ruleOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAggregationValueAccess().getOperationOperationParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_operation_1_0=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAggregationValueRule());
              					}
              					set(
              						current,
              						"operation",
              						lv_operation_1_0,
              						"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Operation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAggregationValueAccess().getForKeyword_2());
              		
            }
            // InternalKPIFormulaDSL.g:751:3: ( (lv_window_3_0= RULE_INT ) )
            // InternalKPIFormulaDSL.g:752:4: (lv_window_3_0= RULE_INT )
            {
            // InternalKPIFormulaDSL.g:752:4: (lv_window_3_0= RULE_INT )
            // InternalKPIFormulaDSL.g:753:5: lv_window_3_0= RULE_INT
            {
            lv_window_3_0=(Token)match(input,RULE_INT,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_window_3_0, grammarAccess.getAggregationValueAccess().getWindowINTTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAggregationValueRule());
              					}
              					setWithLastConsumed(
              						current,
              						"window",
              						lv_window_3_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            // InternalKPIFormulaDSL.g:769:3: ( (lv_windowUnit_4_0= ruleWindowUnit ) )
            // InternalKPIFormulaDSL.g:770:4: (lv_windowUnit_4_0= ruleWindowUnit )
            {
            // InternalKPIFormulaDSL.g:770:4: (lv_windowUnit_4_0= ruleWindowUnit )
            // InternalKPIFormulaDSL.g:771:5: lv_windowUnit_4_0= ruleWindowUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAggregationValueAccess().getWindowUnitWindowUnitEnumRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_windowUnit_4_0=ruleWindowUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAggregationValueRule());
              					}
              					set(
              						current,
              						"windowUnit",
              						lv_windowUnit_4_0,
              						"lu.list.swrdi.formulaKPI.KPIFormulaDSL.WindowUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAggregationValue"


    // $ANTLR start "entryRuleDriftValue"
    // InternalKPIFormulaDSL.g:792:1: entryRuleDriftValue returns [EObject current=null] : iv_ruleDriftValue= ruleDriftValue EOF ;
    public final EObject entryRuleDriftValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDriftValue = null;


        try {
            // InternalKPIFormulaDSL.g:792:51: (iv_ruleDriftValue= ruleDriftValue EOF )
            // InternalKPIFormulaDSL.g:793:2: iv_ruleDriftValue= ruleDriftValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDriftValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDriftValue=ruleDriftValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDriftValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDriftValue"


    // $ANTLR start "ruleDriftValue"
    // InternalKPIFormulaDSL.g:799:1: ruleDriftValue returns [EObject current=null] : (otherlv_0= 'drift' otherlv_1= 'of' ( (lv_operation_2_0= ruleOperation ) ) otherlv_3= 'for' ( (lv_window_4_0= RULE_INT ) ) ( (lv_windowUnit_5_0= ruleWindowUnit ) ) ) ;
    public final EObject ruleDriftValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_window_4_0=null;
        EObject lv_operation_2_0 = null;

        Enumerator lv_windowUnit_5_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:805:2: ( (otherlv_0= 'drift' otherlv_1= 'of' ( (lv_operation_2_0= ruleOperation ) ) otherlv_3= 'for' ( (lv_window_4_0= RULE_INT ) ) ( (lv_windowUnit_5_0= ruleWindowUnit ) ) ) )
            // InternalKPIFormulaDSL.g:806:2: (otherlv_0= 'drift' otherlv_1= 'of' ( (lv_operation_2_0= ruleOperation ) ) otherlv_3= 'for' ( (lv_window_4_0= RULE_INT ) ) ( (lv_windowUnit_5_0= ruleWindowUnit ) ) )
            {
            // InternalKPIFormulaDSL.g:806:2: (otherlv_0= 'drift' otherlv_1= 'of' ( (lv_operation_2_0= ruleOperation ) ) otherlv_3= 'for' ( (lv_window_4_0= RULE_INT ) ) ( (lv_windowUnit_5_0= ruleWindowUnit ) ) )
            // InternalKPIFormulaDSL.g:807:3: otherlv_0= 'drift' otherlv_1= 'of' ( (lv_operation_2_0= ruleOperation ) ) otherlv_3= 'for' ( (lv_window_4_0= RULE_INT ) ) ( (lv_windowUnit_5_0= ruleWindowUnit ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDriftValueAccess().getDriftKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDriftValueAccess().getOfKeyword_1());
              		
            }
            // InternalKPIFormulaDSL.g:815:3: ( (lv_operation_2_0= ruleOperation ) )
            // InternalKPIFormulaDSL.g:816:4: (lv_operation_2_0= ruleOperation )
            {
            // InternalKPIFormulaDSL.g:816:4: (lv_operation_2_0= ruleOperation )
            // InternalKPIFormulaDSL.g:817:5: lv_operation_2_0= ruleOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDriftValueAccess().getOperationOperationParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_operation_2_0=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDriftValueRule());
              					}
              					set(
              						current,
              						"operation",
              						lv_operation_2_0,
              						"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Operation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDriftValueAccess().getForKeyword_3());
              		
            }
            // InternalKPIFormulaDSL.g:838:3: ( (lv_window_4_0= RULE_INT ) )
            // InternalKPIFormulaDSL.g:839:4: (lv_window_4_0= RULE_INT )
            {
            // InternalKPIFormulaDSL.g:839:4: (lv_window_4_0= RULE_INT )
            // InternalKPIFormulaDSL.g:840:5: lv_window_4_0= RULE_INT
            {
            lv_window_4_0=(Token)match(input,RULE_INT,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_window_4_0, grammarAccess.getDriftValueAccess().getWindowINTTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDriftValueRule());
              					}
              					setWithLastConsumed(
              						current,
              						"window",
              						lv_window_4_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            // InternalKPIFormulaDSL.g:856:3: ( (lv_windowUnit_5_0= ruleWindowUnit ) )
            // InternalKPIFormulaDSL.g:857:4: (lv_windowUnit_5_0= ruleWindowUnit )
            {
            // InternalKPIFormulaDSL.g:857:4: (lv_windowUnit_5_0= ruleWindowUnit )
            // InternalKPIFormulaDSL.g:858:5: lv_windowUnit_5_0= ruleWindowUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDriftValueAccess().getWindowUnitWindowUnitEnumRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_windowUnit_5_0=ruleWindowUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDriftValueRule());
              					}
              					set(
              						current,
              						"windowUnit",
              						lv_windowUnit_5_0,
              						"lu.list.swrdi.formulaKPI.KPIFormulaDSL.WindowUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDriftValue"


    // $ANTLR start "entryRuleOperation"
    // InternalKPIFormulaDSL.g:879:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalKPIFormulaDSL.g:879:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalKPIFormulaDSL.g:880:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalKPIFormulaDSL.g:886:1: ruleOperation returns [EObject current=null] : (this_Minimum_0= ruleMinimum | this_Maximum_1= ruleMaximum | this_Average_2= ruleAverage | this_Median_3= ruleMedian | this_StandardDeviation_4= ruleStandardDeviation ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Minimum_0 = null;

        EObject this_Maximum_1 = null;

        EObject this_Average_2 = null;

        EObject this_Median_3 = null;

        EObject this_StandardDeviation_4 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:892:2: ( (this_Minimum_0= ruleMinimum | this_Maximum_1= ruleMaximum | this_Average_2= ruleAverage | this_Median_3= ruleMedian | this_StandardDeviation_4= ruleStandardDeviation ) )
            // InternalKPIFormulaDSL.g:893:2: (this_Minimum_0= ruleMinimum | this_Maximum_1= ruleMaximum | this_Average_2= ruleAverage | this_Median_3= ruleMedian | this_StandardDeviation_4= ruleStandardDeviation )
            {
            // InternalKPIFormulaDSL.g:893:2: (this_Minimum_0= ruleMinimum | this_Maximum_1= ruleMaximum | this_Average_2= ruleAverage | this_Median_3= ruleMedian | this_StandardDeviation_4= ruleStandardDeviation )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case 28:
                {
                alt5=3;
                }
                break;
            case 29:
                {
                alt5=4;
                }
                break;
            case 30:
                {
                alt5=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalKPIFormulaDSL.g:894:3: this_Minimum_0= ruleMinimum
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperationAccess().getMinimumParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Minimum_0=ruleMinimum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Minimum_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:903:3: this_Maximum_1= ruleMaximum
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperationAccess().getMaximumParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Maximum_1=ruleMaximum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Maximum_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKPIFormulaDSL.g:912:3: this_Average_2= ruleAverage
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperationAccess().getAverageParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Average_2=ruleAverage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Average_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKPIFormulaDSL.g:921:3: this_Median_3= ruleMedian
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperationAccess().getMedianParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Median_3=ruleMedian();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Median_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalKPIFormulaDSL.g:930:3: this_StandardDeviation_4= ruleStandardDeviation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperationAccess().getStandardDeviationParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StandardDeviation_4=ruleStandardDeviation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StandardDeviation_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleMinimum"
    // InternalKPIFormulaDSL.g:942:1: entryRuleMinimum returns [EObject current=null] : iv_ruleMinimum= ruleMinimum EOF ;
    public final EObject entryRuleMinimum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimum = null;


        try {
            // InternalKPIFormulaDSL.g:942:48: (iv_ruleMinimum= ruleMinimum EOF )
            // InternalKPIFormulaDSL.g:943:2: iv_ruleMinimum= ruleMinimum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinimumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMinimum=ruleMinimum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinimum; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinimum"


    // $ANTLR start "ruleMinimum"
    // InternalKPIFormulaDSL.g:949:1: ruleMinimum returns [EObject current=null] : ( () otherlv_1= 'Minimum' ) ;
    public final EObject ruleMinimum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:955:2: ( ( () otherlv_1= 'Minimum' ) )
            // InternalKPIFormulaDSL.g:956:2: ( () otherlv_1= 'Minimum' )
            {
            // InternalKPIFormulaDSL.g:956:2: ( () otherlv_1= 'Minimum' )
            // InternalKPIFormulaDSL.g:957:3: () otherlv_1= 'Minimum'
            {
            // InternalKPIFormulaDSL.g:957:3: ()
            // InternalKPIFormulaDSL.g:958:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMinimumAccess().getMinimumAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMinimumAccess().getMinimumKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinimum"


    // $ANTLR start "entryRuleMaximum"
    // InternalKPIFormulaDSL.g:972:1: entryRuleMaximum returns [EObject current=null] : iv_ruleMaximum= ruleMaximum EOF ;
    public final EObject entryRuleMaximum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximum = null;


        try {
            // InternalKPIFormulaDSL.g:972:48: (iv_ruleMaximum= ruleMaximum EOF )
            // InternalKPIFormulaDSL.g:973:2: iv_ruleMaximum= ruleMaximum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaximumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMaximum=ruleMaximum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaximum; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaximum"


    // $ANTLR start "ruleMaximum"
    // InternalKPIFormulaDSL.g:979:1: ruleMaximum returns [EObject current=null] : ( () otherlv_1= 'Maximum' ) ;
    public final EObject ruleMaximum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:985:2: ( ( () otherlv_1= 'Maximum' ) )
            // InternalKPIFormulaDSL.g:986:2: ( () otherlv_1= 'Maximum' )
            {
            // InternalKPIFormulaDSL.g:986:2: ( () otherlv_1= 'Maximum' )
            // InternalKPIFormulaDSL.g:987:3: () otherlv_1= 'Maximum'
            {
            // InternalKPIFormulaDSL.g:987:3: ()
            // InternalKPIFormulaDSL.g:988:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMaximumAccess().getMaximumAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMaximumAccess().getMaximumKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaximum"


    // $ANTLR start "entryRuleAverage"
    // InternalKPIFormulaDSL.g:1002:1: entryRuleAverage returns [EObject current=null] : iv_ruleAverage= ruleAverage EOF ;
    public final EObject entryRuleAverage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAverage = null;


        try {
            // InternalKPIFormulaDSL.g:1002:48: (iv_ruleAverage= ruleAverage EOF )
            // InternalKPIFormulaDSL.g:1003:2: iv_ruleAverage= ruleAverage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAverageRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAverage=ruleAverage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAverage; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAverage"


    // $ANTLR start "ruleAverage"
    // InternalKPIFormulaDSL.g:1009:1: ruleAverage returns [EObject current=null] : ( () otherlv_1= 'Average' ) ;
    public final EObject ruleAverage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1015:2: ( ( () otherlv_1= 'Average' ) )
            // InternalKPIFormulaDSL.g:1016:2: ( () otherlv_1= 'Average' )
            {
            // InternalKPIFormulaDSL.g:1016:2: ( () otherlv_1= 'Average' )
            // InternalKPIFormulaDSL.g:1017:3: () otherlv_1= 'Average'
            {
            // InternalKPIFormulaDSL.g:1017:3: ()
            // InternalKPIFormulaDSL.g:1018:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAverageAccess().getAverageAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAverageAccess().getAverageKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAverage"


    // $ANTLR start "entryRuleMedian"
    // InternalKPIFormulaDSL.g:1032:1: entryRuleMedian returns [EObject current=null] : iv_ruleMedian= ruleMedian EOF ;
    public final EObject entryRuleMedian() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMedian = null;


        try {
            // InternalKPIFormulaDSL.g:1032:47: (iv_ruleMedian= ruleMedian EOF )
            // InternalKPIFormulaDSL.g:1033:2: iv_ruleMedian= ruleMedian EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMedianRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMedian=ruleMedian();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMedian; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMedian"


    // $ANTLR start "ruleMedian"
    // InternalKPIFormulaDSL.g:1039:1: ruleMedian returns [EObject current=null] : ( () otherlv_1= 'Median' ) ;
    public final EObject ruleMedian() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1045:2: ( ( () otherlv_1= 'Median' ) )
            // InternalKPIFormulaDSL.g:1046:2: ( () otherlv_1= 'Median' )
            {
            // InternalKPIFormulaDSL.g:1046:2: ( () otherlv_1= 'Median' )
            // InternalKPIFormulaDSL.g:1047:3: () otherlv_1= 'Median'
            {
            // InternalKPIFormulaDSL.g:1047:3: ()
            // InternalKPIFormulaDSL.g:1048:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMedianAccess().getMedianAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMedianAccess().getMedianKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMedian"


    // $ANTLR start "entryRuleStandardDeviation"
    // InternalKPIFormulaDSL.g:1062:1: entryRuleStandardDeviation returns [EObject current=null] : iv_ruleStandardDeviation= ruleStandardDeviation EOF ;
    public final EObject entryRuleStandardDeviation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardDeviation = null;


        try {
            // InternalKPIFormulaDSL.g:1062:58: (iv_ruleStandardDeviation= ruleStandardDeviation EOF )
            // InternalKPIFormulaDSL.g:1063:2: iv_ruleStandardDeviation= ruleStandardDeviation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStandardDeviationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStandardDeviation=ruleStandardDeviation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStandardDeviation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStandardDeviation"


    // $ANTLR start "ruleStandardDeviation"
    // InternalKPIFormulaDSL.g:1069:1: ruleStandardDeviation returns [EObject current=null] : ( () otherlv_1= 'Standard' otherlv_2= 'deviation' ) ;
    public final EObject ruleStandardDeviation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1075:2: ( ( () otherlv_1= 'Standard' otherlv_2= 'deviation' ) )
            // InternalKPIFormulaDSL.g:1076:2: ( () otherlv_1= 'Standard' otherlv_2= 'deviation' )
            {
            // InternalKPIFormulaDSL.g:1076:2: ( () otherlv_1= 'Standard' otherlv_2= 'deviation' )
            // InternalKPIFormulaDSL.g:1077:3: () otherlv_1= 'Standard' otherlv_2= 'deviation'
            {
            // InternalKPIFormulaDSL.g:1077:3: ()
            // InternalKPIFormulaDSL.g:1078:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStandardDeviationAccess().getStandardDeviationAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStandardDeviationAccess().getStandardKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getStandardDeviationAccess().getDeviationKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStandardDeviation"


    // $ANTLR start "entryRuleTopLevelExpression"
    // InternalKPIFormulaDSL.g:1096:1: entryRuleTopLevelExpression returns [EObject current=null] : iv_ruleTopLevelExpression= ruleTopLevelExpression EOF ;
    public final EObject entryRuleTopLevelExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelExpression = null;


        try {
            // InternalKPIFormulaDSL.g:1096:59: (iv_ruleTopLevelExpression= ruleTopLevelExpression EOF )
            // InternalKPIFormulaDSL.g:1097:2: iv_ruleTopLevelExpression= ruleTopLevelExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTopLevelExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTopLevelExpression=ruleTopLevelExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTopLevelExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTopLevelExpression"


    // $ANTLR start "ruleTopLevelExpression"
    // InternalKPIFormulaDSL.g:1103:1: ruleTopLevelExpression returns [EObject current=null] : ( ( ( ruleCondition )=>this_Condition_0= ruleCondition ) | this_Expression_1= ruleExpression ) ;
    public final EObject ruleTopLevelExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Condition_0 = null;

        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1109:2: ( ( ( ( ruleCondition )=>this_Condition_0= ruleCondition ) | this_Expression_1= ruleExpression ) )
            // InternalKPIFormulaDSL.g:1110:2: ( ( ( ruleCondition )=>this_Condition_0= ruleCondition ) | this_Expression_1= ruleExpression )
            {
            // InternalKPIFormulaDSL.g:1110:2: ( ( ( ruleCondition )=>this_Condition_0= ruleCondition ) | this_Expression_1= ruleExpression )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) && (synpred1_InternalKPIFormulaDSL())) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_FQN)||LA6_0==44||(LA6_0>=47 && LA6_0<=48)||(LA6_0>=51 && LA6_0<=52)||(LA6_0>=54 && LA6_0<=58)||LA6_0==60||(LA6_0>=62 && LA6_0<=66)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalKPIFormulaDSL.g:1111:3: ( ( ruleCondition )=>this_Condition_0= ruleCondition )
                    {
                    // InternalKPIFormulaDSL.g:1111:3: ( ( ruleCondition )=>this_Condition_0= ruleCondition )
                    // InternalKPIFormulaDSL.g:1112:4: ( ruleCondition )=>this_Condition_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTopLevelExpressionAccess().getConditionParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Condition_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Condition_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:1123:3: this_Expression_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTopLevelExpressionAccess().getExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Expression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTopLevelExpression"


    // $ANTLR start "entryRuleCondition"
    // InternalKPIFormulaDSL.g:1135:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalKPIFormulaDSL.g:1135:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalKPIFormulaDSL.g:1136:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalKPIFormulaDSL.g:1142:1: ruleCondition returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_conditions_2_0= ruleExpression ) ) otherlv_3= '->' ( (lv_results_4_0= ruleExpression ) ) otherlv_5= ';' )+ ( ( 'otherwise' )=>otherlv_6= 'otherwise' ) otherlv_7= '->' ( (lv_results_8_0= ruleExpression ) ) otherlv_9= '}' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_conditions_2_0 = null;

        EObject lv_results_4_0 = null;

        EObject lv_results_8_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1148:2: ( ( () otherlv_1= '{' ( ( (lv_conditions_2_0= ruleExpression ) ) otherlv_3= '->' ( (lv_results_4_0= ruleExpression ) ) otherlv_5= ';' )+ ( ( 'otherwise' )=>otherlv_6= 'otherwise' ) otherlv_7= '->' ( (lv_results_8_0= ruleExpression ) ) otherlv_9= '}' ) )
            // InternalKPIFormulaDSL.g:1149:2: ( () otherlv_1= '{' ( ( (lv_conditions_2_0= ruleExpression ) ) otherlv_3= '->' ( (lv_results_4_0= ruleExpression ) ) otherlv_5= ';' )+ ( ( 'otherwise' )=>otherlv_6= 'otherwise' ) otherlv_7= '->' ( (lv_results_8_0= ruleExpression ) ) otherlv_9= '}' )
            {
            // InternalKPIFormulaDSL.g:1149:2: ( () otherlv_1= '{' ( ( (lv_conditions_2_0= ruleExpression ) ) otherlv_3= '->' ( (lv_results_4_0= ruleExpression ) ) otherlv_5= ';' )+ ( ( 'otherwise' )=>otherlv_6= 'otherwise' ) otherlv_7= '->' ( (lv_results_8_0= ruleExpression ) ) otherlv_9= '}' )
            // InternalKPIFormulaDSL.g:1150:3: () otherlv_1= '{' ( ( (lv_conditions_2_0= ruleExpression ) ) otherlv_3= '->' ( (lv_results_4_0= ruleExpression ) ) otherlv_5= ';' )+ ( ( 'otherwise' )=>otherlv_6= 'otherwise' ) otherlv_7= '->' ( (lv_results_8_0= ruleExpression ) ) otherlv_9= '}'
            {
            // InternalKPIFormulaDSL.g:1150:3: ()
            // InternalKPIFormulaDSL.g:1151:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConditionAccess().getConditionalOpAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalKPIFormulaDSL.g:1161:3: ( ( (lv_conditions_2_0= ruleExpression ) ) otherlv_3= '->' ( (lv_results_4_0= ruleExpression ) ) otherlv_5= ';' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_FQN)||LA7_0==44||(LA7_0>=47 && LA7_0<=48)||(LA7_0>=51 && LA7_0<=52)||(LA7_0>=54 && LA7_0<=58)||LA7_0==60||(LA7_0>=62 && LA7_0<=66)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:1162:4: ( (lv_conditions_2_0= ruleExpression ) ) otherlv_3= '->' ( (lv_results_4_0= ruleExpression ) ) otherlv_5= ';'
            	    {
            	    // InternalKPIFormulaDSL.g:1162:4: ( (lv_conditions_2_0= ruleExpression ) )
            	    // InternalKPIFormulaDSL.g:1163:5: (lv_conditions_2_0= ruleExpression )
            	    {
            	    // InternalKPIFormulaDSL.g:1163:5: (lv_conditions_2_0= ruleExpression )
            	    // InternalKPIFormulaDSL.g:1164:6: lv_conditions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConditionAccess().getConditionsExpressionParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_conditions_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConditionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"conditions",
            	      							lv_conditions_2_0,
            	      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,32,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getHyphenMinusGreaterThanSignKeyword_2_1());
            	      			
            	    }
            	    // InternalKPIFormulaDSL.g:1185:4: ( (lv_results_4_0= ruleExpression ) )
            	    // InternalKPIFormulaDSL.g:1186:5: (lv_results_4_0= ruleExpression )
            	    {
            	    // InternalKPIFormulaDSL.g:1186:5: (lv_results_4_0= ruleExpression )
            	    // InternalKPIFormulaDSL.g:1187:6: lv_results_4_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConditionAccess().getResultsExpressionParserRuleCall_2_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_results_4_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConditionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"results",
            	      							lv_results_4_0,
            	      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,33,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getSemicolonKeyword_2_3());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // InternalKPIFormulaDSL.g:1209:3: ( ( 'otherwise' )=>otherlv_6= 'otherwise' )
            // InternalKPIFormulaDSL.g:1210:4: ( 'otherwise' )=>otherlv_6= 'otherwise'
            {
            otherlv_6=(Token)match(input,34,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getOtherwiseKeyword_3());
              			
            }

            }

            otherlv_7=(Token)match(input,32,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getHyphenMinusGreaterThanSignKeyword_4());
              		
            }
            // InternalKPIFormulaDSL.g:1220:3: ( (lv_results_8_0= ruleExpression ) )
            // InternalKPIFormulaDSL.g:1221:4: (lv_results_8_0= ruleExpression )
            {
            // InternalKPIFormulaDSL.g:1221:4: (lv_results_8_0= ruleExpression )
            // InternalKPIFormulaDSL.g:1222:5: lv_results_8_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionAccess().getResultsExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_results_8_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionRule());
              					}
              					add(
              						current,
              						"results",
              						lv_results_8_0,
              						"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleExpression"
    // InternalKPIFormulaDSL.g:1247:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalKPIFormulaDSL.g:1247:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalKPIFormulaDSL.g:1248:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalKPIFormulaDSL.g:1254:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1260:2: (this_Or_0= ruleOr )
            // InternalKPIFormulaDSL.g:1261:2: this_Or_0= ruleOr
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Or_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalKPIFormulaDSL.g:1272:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalKPIFormulaDSL.g:1272:43: (iv_ruleOr= ruleOr EOF )
            // InternalKPIFormulaDSL.g:1273:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalKPIFormulaDSL.g:1279:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1285:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalKPIFormulaDSL.g:1286:2: (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalKPIFormulaDSL.g:1286:2: (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalKPIFormulaDSL.g:1287:3: this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_20);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKPIFormulaDSL.g:1295:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==35) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:1296:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalKPIFormulaDSL.g:1296:4: ()
            	    // InternalKPIFormulaDSL.g:1297:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,35,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1());
            	      			
            	    }
            	    // InternalKPIFormulaDSL.g:1307:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalKPIFormulaDSL.g:1308:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalKPIFormulaDSL.g:1308:5: (lv_right_3_0= ruleAnd )
            	    // InternalKPIFormulaDSL.g:1309:6: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.And");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalKPIFormulaDSL.g:1331:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalKPIFormulaDSL.g:1331:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalKPIFormulaDSL.g:1332:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalKPIFormulaDSL.g:1338:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1344:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalKPIFormulaDSL.g:1345:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalKPIFormulaDSL.g:1345:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalKPIFormulaDSL.g:1346:3: this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_21);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKPIFormulaDSL.g:1354:3: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==36) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:1355:4: () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalKPIFormulaDSL.g:1355:4: ()
            	    // InternalKPIFormulaDSL.g:1356:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1());
            	      			
            	    }
            	    // InternalKPIFormulaDSL.g:1366:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalKPIFormulaDSL.g:1367:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalKPIFormulaDSL.g:1367:5: (lv_right_3_0= ruleEquality )
            	    // InternalKPIFormulaDSL.g:1368:6: lv_right_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Equality");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalKPIFormulaDSL.g:1390:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalKPIFormulaDSL.g:1390:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalKPIFormulaDSL.g:1391:2: iv_ruleEquality= ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquality; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalKPIFormulaDSL.g:1397:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1403:2: ( (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )* ) )
            // InternalKPIFormulaDSL.g:1404:2: (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )* )
            {
            // InternalKPIFormulaDSL.g:1404:2: (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )* )
            // InternalKPIFormulaDSL.g:1405:3: this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_22);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKPIFormulaDSL.g:1413:3: ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=37 && LA11_0<=38)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:1414:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) )
            	    {
            	    // InternalKPIFormulaDSL.g:1414:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==37) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==38) ) {
            	        alt10=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalKPIFormulaDSL.g:1415:5: ( () otherlv_2= '==' )
            	            {
            	            // InternalKPIFormulaDSL.g:1415:5: ( () otherlv_2= '==' )
            	            // InternalKPIFormulaDSL.g:1416:6: () otherlv_2= '=='
            	            {
            	            // InternalKPIFormulaDSL.g:1416:6: ()
            	            // InternalKPIFormulaDSL.g:1417:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,37,FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalKPIFormulaDSL.g:1429:5: ( () otherlv_4= '!=' )
            	            {
            	            // InternalKPIFormulaDSL.g:1429:5: ( () otherlv_4= '!=' )
            	            // InternalKPIFormulaDSL.g:1430:6: () otherlv_4= '!='
            	            {
            	            // InternalKPIFormulaDSL.g:1430:6: ()
            	            // InternalKPIFormulaDSL.g:1431:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getEqualityAccess().getInequalityLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,38,FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalKPIFormulaDSL.g:1443:4: ( (lv_right_5_0= ruleComparison ) )
            	    // InternalKPIFormulaDSL.g:1444:5: (lv_right_5_0= ruleComparison )
            	    {
            	    // InternalKPIFormulaDSL.g:1444:5: (lv_right_5_0= ruleComparison )
            	    // InternalKPIFormulaDSL.g:1445:6: lv_right_5_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_right_5_0=ruleComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Comparison");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalKPIFormulaDSL.g:1467:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalKPIFormulaDSL.g:1467:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalKPIFormulaDSL.g:1468:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalKPIFormulaDSL.g:1474:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_9_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1480:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= rulePlusOrMinus ) ) )* ) )
            // InternalKPIFormulaDSL.g:1481:2: (this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= rulePlusOrMinus ) ) )* )
            {
            // InternalKPIFormulaDSL.g:1481:2: (this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= rulePlusOrMinus ) ) )* )
            // InternalKPIFormulaDSL.g:1482:3: this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_23);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PlusOrMinus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKPIFormulaDSL.g:1490:3: ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= rulePlusOrMinus ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=39 && LA13_0<=42)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:1491:4: ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= rulePlusOrMinus ) )
            	    {
            	    // InternalKPIFormulaDSL.g:1491:4: ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) )
            	    int alt12=4;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	        {
            	        alt12=1;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt12=2;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt12=3;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt12=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt12) {
            	        case 1 :
            	            // InternalKPIFormulaDSL.g:1492:5: ( () otherlv_2= '>=' )
            	            {
            	            // InternalKPIFormulaDSL.g:1492:5: ( () otherlv_2= '>=' )
            	            // InternalKPIFormulaDSL.g:1493:6: () otherlv_2= '>='
            	            {
            	            // InternalKPIFormulaDSL.g:1493:6: ()
            	            // InternalKPIFormulaDSL.g:1494:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getComparisonAccess().getGreaterEqLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalKPIFormulaDSL.g:1506:5: ( () otherlv_4= '<=' )
            	            {
            	            // InternalKPIFormulaDSL.g:1506:5: ( () otherlv_4= '<=' )
            	            // InternalKPIFormulaDSL.g:1507:6: () otherlv_4= '<='
            	            {
            	            // InternalKPIFormulaDSL.g:1507:6: ()
            	            // InternalKPIFormulaDSL.g:1508:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getComparisonAccess().getLessEqLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalKPIFormulaDSL.g:1520:5: ( () otherlv_6= '>' )
            	            {
            	            // InternalKPIFormulaDSL.g:1520:5: ( () otherlv_6= '>' )
            	            // InternalKPIFormulaDSL.g:1521:6: () otherlv_6= '>'
            	            {
            	            // InternalKPIFormulaDSL.g:1521:6: ()
            	            // InternalKPIFormulaDSL.g:1522:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getComparisonAccess().getGreaterLeftAction_1_0_2_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_6=(Token)match(input,41,FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_6, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_2_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalKPIFormulaDSL.g:1534:5: ( () otherlv_8= '<' )
            	            {
            	            // InternalKPIFormulaDSL.g:1534:5: ( () otherlv_8= '<' )
            	            // InternalKPIFormulaDSL.g:1535:6: () otherlv_8= '<'
            	            {
            	            // InternalKPIFormulaDSL.g:1535:6: ()
            	            // InternalKPIFormulaDSL.g:1536:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getComparisonAccess().getLessLeftAction_1_0_3_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_8=(Token)match(input,42,FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_8, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_3_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalKPIFormulaDSL.g:1548:4: ( (lv_right_9_0= rulePlusOrMinus ) )
            	    // InternalKPIFormulaDSL.g:1549:5: (lv_right_9_0= rulePlusOrMinus )
            	    {
            	    // InternalKPIFormulaDSL.g:1549:5: (lv_right_9_0= rulePlusOrMinus )
            	    // InternalKPIFormulaDSL.g:1550:6: lv_right_9_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_right_9_0=rulePlusOrMinus();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_9_0,
            	      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.PlusOrMinus");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalKPIFormulaDSL.g:1572:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalKPIFormulaDSL.g:1572:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalKPIFormulaDSL.g:1573:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusOrMinus; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalKPIFormulaDSL.g:1579:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1585:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalKPIFormulaDSL.g:1586:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalKPIFormulaDSL.g:1586:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalKPIFormulaDSL.g:1587:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulOrDiv_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKPIFormulaDSL.g:1595:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=43 && LA15_0<=44)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:1596:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalKPIFormulaDSL.g:1596:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==43) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==44) ) {
            	        alt14=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalKPIFormulaDSL.g:1597:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalKPIFormulaDSL.g:1597:5: ( () otherlv_2= '+' )
            	            // InternalKPIFormulaDSL.g:1598:6: () otherlv_2= '+'
            	            {
            	            // InternalKPIFormulaDSL.g:1598:6: ()
            	            // InternalKPIFormulaDSL.g:1599:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,43,FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalKPIFormulaDSL.g:1611:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalKPIFormulaDSL.g:1611:5: ( () otherlv_4= '-' )
            	            // InternalKPIFormulaDSL.g:1612:6: () otherlv_4= '-'
            	            {
            	            // InternalKPIFormulaDSL.g:1612:6: ()
            	            // InternalKPIFormulaDSL.g:1613:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,44,FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalKPIFormulaDSL.g:1625:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalKPIFormulaDSL.g:1626:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalKPIFormulaDSL.g:1626:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalKPIFormulaDSL.g:1627:6: lv_right_5_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.MulOrDiv");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalKPIFormulaDSL.g:1649:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalKPIFormulaDSL.g:1649:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalKPIFormulaDSL.g:1650:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulOrDivRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulOrDiv; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalKPIFormulaDSL.g:1656:1: ruleMulOrDiv returns [EObject current=null] : (this_Operator_0= ruleOperator ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleOperator ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Operator_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1662:2: ( (this_Operator_0= ruleOperator ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleOperator ) ) )* ) )
            // InternalKPIFormulaDSL.g:1663:2: (this_Operator_0= ruleOperator ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleOperator ) ) )* )
            {
            // InternalKPIFormulaDSL.g:1663:2: (this_Operator_0= ruleOperator ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleOperator ) ) )* )
            // InternalKPIFormulaDSL.g:1664:3: this_Operator_0= ruleOperator ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleOperator ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulOrDivAccess().getOperatorParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_25);
            this_Operator_0=ruleOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Operator_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKPIFormulaDSL.g:1672:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleOperator ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=45 && LA17_0<=46)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:1673:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleOperator ) )
            	    {
            	    // InternalKPIFormulaDSL.g:1673:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==45) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==46) ) {
            	        alt16=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalKPIFormulaDSL.g:1674:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalKPIFormulaDSL.g:1674:5: ( () otherlv_2= '*' )
            	            // InternalKPIFormulaDSL.g:1675:6: () otherlv_2= '*'
            	            {
            	            // InternalKPIFormulaDSL.g:1675:6: ()
            	            // InternalKPIFormulaDSL.g:1676:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getMulOrDivAccess().getMultiplyLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,45,FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalKPIFormulaDSL.g:1688:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalKPIFormulaDSL.g:1688:5: ( () otherlv_4= '/' )
            	            // InternalKPIFormulaDSL.g:1689:6: () otherlv_4= '/'
            	            {
            	            // InternalKPIFormulaDSL.g:1689:6: ()
            	            // InternalKPIFormulaDSL.g:1690:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getMulOrDivAccess().getDivideLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,46,FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalKPIFormulaDSL.g:1702:4: ( (lv_right_5_0= ruleOperator ) )
            	    // InternalKPIFormulaDSL.g:1703:5: (lv_right_5_0= ruleOperator )
            	    {
            	    // InternalKPIFormulaDSL.g:1703:5: (lv_right_5_0= ruleOperator )
            	    // InternalKPIFormulaDSL.g:1704:6: lv_right_5_0= ruleOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightOperatorParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_right_5_0=ruleOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Operator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRuleOperator"
    // InternalKPIFormulaDSL.g:1726:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalKPIFormulaDSL.g:1726:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalKPIFormulaDSL.g:1727:2: iv_ruleOperator= ruleOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalKPIFormulaDSL.g:1733:1: ruleOperator returns [EObject current=null] : ( ( () otherlv_1= '|' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= '|' ) | ( () otherlv_5= '[' ( (lv_elements_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleExpression ) ) )* otherlv_9= ']' ) | ( () otherlv_11= 'AVERAGE' otherlv_12= '(' ( (lv_list_13_0= ruleExpression ) ) otherlv_14= ')' ) | ( () otherlv_16= 'WEIGHTED_SUM' otherlv_17= '(' ( (lv_list_18_0= ruleExpression ) ) otherlv_19= ',' ( (lv_weights_20_0= ruleExpression ) ) otherlv_21= ')' ) | ( () otherlv_23= 'MIN' otherlv_24= '(' ( (lv_list_25_0= ruleExpression ) ) otherlv_26= ')' ) | ( () otherlv_28= 'MAX' otherlv_29= '(' ( (lv_list_30_0= ruleExpression ) ) otherlv_31= ')' ) | ( () otherlv_33= 'THRESHOLD' otherlv_34= '(' ( (lv_expression_35_0= ruleExpression ) ) otherlv_36= ',' ( (lv_threshold_37_0= ruleExpression ) ) otherlv_38= ')' ) | ( () otherlv_40= 'do' ( (lv_expression_41_0= ruleTopLevelExpression ) ) otherlv_42= 'for' ( (lv_iterators_43_0= ruleListIterator ) ) otherlv_44= 'in' ( (lv_lists_45_0= rulePrimary ) ) (otherlv_46= ',' ( (lv_iterators_47_0= ruleListIterator ) ) otherlv_48= 'in' ( (lv_lists_49_0= rulePrimary ) ) )* ) | ( () otherlv_51= 'reduce' ( (lv_expression_52_0= ruleTopLevelExpression ) ) otherlv_53= 'starting' ( (lv_accumulator_54_0= rulePrimary ) ) otherlv_55= 'for' ( (lv_iterators_56_0= ruleListIterator ) ) otherlv_57= 'in' ( (lv_lists_58_0= rulePrimary ) ) (otherlv_59= ',' ( (lv_iterators_60_0= ruleListIterator ) ) otherlv_61= 'in' ( (lv_lists_62_0= rulePrimary ) ) )* ) | ( () otherlv_64= 'filter' ( (lv_expression_65_0= ruleTopLevelExpression ) ) otherlv_66= 'for' ( (lv_iterators_67_0= ruleListIterator ) ) otherlv_68= 'in' ( (lv_lists_69_0= rulePrimary ) ) (otherlv_70= ',' ( (lv_iterators_71_0= ruleListIterator ) ) otherlv_72= 'in' ( (lv_lists_73_0= rulePrimary ) ) )* ) | this_Primary_74= rulePrimary ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_57=null;
        Token otherlv_59=null;
        Token otherlv_61=null;
        Token otherlv_64=null;
        Token otherlv_66=null;
        Token otherlv_68=null;
        Token otherlv_70=null;
        Token otherlv_72=null;
        EObject lv_expression_2_0 = null;

        EObject lv_elements_6_0 = null;

        EObject lv_elements_8_0 = null;

        EObject lv_list_13_0 = null;

        EObject lv_list_18_0 = null;

        EObject lv_weights_20_0 = null;

        EObject lv_list_25_0 = null;

        EObject lv_list_30_0 = null;

        EObject lv_expression_35_0 = null;

        EObject lv_threshold_37_0 = null;

        EObject lv_expression_41_0 = null;

        EObject lv_iterators_43_0 = null;

        EObject lv_lists_45_0 = null;

        EObject lv_iterators_47_0 = null;

        EObject lv_lists_49_0 = null;

        EObject lv_expression_52_0 = null;

        EObject lv_accumulator_54_0 = null;

        EObject lv_iterators_56_0 = null;

        EObject lv_lists_58_0 = null;

        EObject lv_iterators_60_0 = null;

        EObject lv_lists_62_0 = null;

        EObject lv_expression_65_0 = null;

        EObject lv_iterators_67_0 = null;

        EObject lv_lists_69_0 = null;

        EObject lv_iterators_71_0 = null;

        EObject lv_lists_73_0 = null;

        EObject this_Primary_74 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1739:2: ( ( ( () otherlv_1= '|' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= '|' ) | ( () otherlv_5= '[' ( (lv_elements_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleExpression ) ) )* otherlv_9= ']' ) | ( () otherlv_11= 'AVERAGE' otherlv_12= '(' ( (lv_list_13_0= ruleExpression ) ) otherlv_14= ')' ) | ( () otherlv_16= 'WEIGHTED_SUM' otherlv_17= '(' ( (lv_list_18_0= ruleExpression ) ) otherlv_19= ',' ( (lv_weights_20_0= ruleExpression ) ) otherlv_21= ')' ) | ( () otherlv_23= 'MIN' otherlv_24= '(' ( (lv_list_25_0= ruleExpression ) ) otherlv_26= ')' ) | ( () otherlv_28= 'MAX' otherlv_29= '(' ( (lv_list_30_0= ruleExpression ) ) otherlv_31= ')' ) | ( () otherlv_33= 'THRESHOLD' otherlv_34= '(' ( (lv_expression_35_0= ruleExpression ) ) otherlv_36= ',' ( (lv_threshold_37_0= ruleExpression ) ) otherlv_38= ')' ) | ( () otherlv_40= 'do' ( (lv_expression_41_0= ruleTopLevelExpression ) ) otherlv_42= 'for' ( (lv_iterators_43_0= ruleListIterator ) ) otherlv_44= 'in' ( (lv_lists_45_0= rulePrimary ) ) (otherlv_46= ',' ( (lv_iterators_47_0= ruleListIterator ) ) otherlv_48= 'in' ( (lv_lists_49_0= rulePrimary ) ) )* ) | ( () otherlv_51= 'reduce' ( (lv_expression_52_0= ruleTopLevelExpression ) ) otherlv_53= 'starting' ( (lv_accumulator_54_0= rulePrimary ) ) otherlv_55= 'for' ( (lv_iterators_56_0= ruleListIterator ) ) otherlv_57= 'in' ( (lv_lists_58_0= rulePrimary ) ) (otherlv_59= ',' ( (lv_iterators_60_0= ruleListIterator ) ) otherlv_61= 'in' ( (lv_lists_62_0= rulePrimary ) ) )* ) | ( () otherlv_64= 'filter' ( (lv_expression_65_0= ruleTopLevelExpression ) ) otherlv_66= 'for' ( (lv_iterators_67_0= ruleListIterator ) ) otherlv_68= 'in' ( (lv_lists_69_0= rulePrimary ) ) (otherlv_70= ',' ( (lv_iterators_71_0= ruleListIterator ) ) otherlv_72= 'in' ( (lv_lists_73_0= rulePrimary ) ) )* ) | this_Primary_74= rulePrimary ) )
            // InternalKPIFormulaDSL.g:1740:2: ( ( () otherlv_1= '|' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= '|' ) | ( () otherlv_5= '[' ( (lv_elements_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleExpression ) ) )* otherlv_9= ']' ) | ( () otherlv_11= 'AVERAGE' otherlv_12= '(' ( (lv_list_13_0= ruleExpression ) ) otherlv_14= ')' ) | ( () otherlv_16= 'WEIGHTED_SUM' otherlv_17= '(' ( (lv_list_18_0= ruleExpression ) ) otherlv_19= ',' ( (lv_weights_20_0= ruleExpression ) ) otherlv_21= ')' ) | ( () otherlv_23= 'MIN' otherlv_24= '(' ( (lv_list_25_0= ruleExpression ) ) otherlv_26= ')' ) | ( () otherlv_28= 'MAX' otherlv_29= '(' ( (lv_list_30_0= ruleExpression ) ) otherlv_31= ')' ) | ( () otherlv_33= 'THRESHOLD' otherlv_34= '(' ( (lv_expression_35_0= ruleExpression ) ) otherlv_36= ',' ( (lv_threshold_37_0= ruleExpression ) ) otherlv_38= ')' ) | ( () otherlv_40= 'do' ( (lv_expression_41_0= ruleTopLevelExpression ) ) otherlv_42= 'for' ( (lv_iterators_43_0= ruleListIterator ) ) otherlv_44= 'in' ( (lv_lists_45_0= rulePrimary ) ) (otherlv_46= ',' ( (lv_iterators_47_0= ruleListIterator ) ) otherlv_48= 'in' ( (lv_lists_49_0= rulePrimary ) ) )* ) | ( () otherlv_51= 'reduce' ( (lv_expression_52_0= ruleTopLevelExpression ) ) otherlv_53= 'starting' ( (lv_accumulator_54_0= rulePrimary ) ) otherlv_55= 'for' ( (lv_iterators_56_0= ruleListIterator ) ) otherlv_57= 'in' ( (lv_lists_58_0= rulePrimary ) ) (otherlv_59= ',' ( (lv_iterators_60_0= ruleListIterator ) ) otherlv_61= 'in' ( (lv_lists_62_0= rulePrimary ) ) )* ) | ( () otherlv_64= 'filter' ( (lv_expression_65_0= ruleTopLevelExpression ) ) otherlv_66= 'for' ( (lv_iterators_67_0= ruleListIterator ) ) otherlv_68= 'in' ( (lv_lists_69_0= rulePrimary ) ) (otherlv_70= ',' ( (lv_iterators_71_0= ruleListIterator ) ) otherlv_72= 'in' ( (lv_lists_73_0= rulePrimary ) ) )* ) | this_Primary_74= rulePrimary )
            {
            // InternalKPIFormulaDSL.g:1740:2: ( ( () otherlv_1= '|' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= '|' ) | ( () otherlv_5= '[' ( (lv_elements_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleExpression ) ) )* otherlv_9= ']' ) | ( () otherlv_11= 'AVERAGE' otherlv_12= '(' ( (lv_list_13_0= ruleExpression ) ) otherlv_14= ')' ) | ( () otherlv_16= 'WEIGHTED_SUM' otherlv_17= '(' ( (lv_list_18_0= ruleExpression ) ) otherlv_19= ',' ( (lv_weights_20_0= ruleExpression ) ) otherlv_21= ')' ) | ( () otherlv_23= 'MIN' otherlv_24= '(' ( (lv_list_25_0= ruleExpression ) ) otherlv_26= ')' ) | ( () otherlv_28= 'MAX' otherlv_29= '(' ( (lv_list_30_0= ruleExpression ) ) otherlv_31= ')' ) | ( () otherlv_33= 'THRESHOLD' otherlv_34= '(' ( (lv_expression_35_0= ruleExpression ) ) otherlv_36= ',' ( (lv_threshold_37_0= ruleExpression ) ) otherlv_38= ')' ) | ( () otherlv_40= 'do' ( (lv_expression_41_0= ruleTopLevelExpression ) ) otherlv_42= 'for' ( (lv_iterators_43_0= ruleListIterator ) ) otherlv_44= 'in' ( (lv_lists_45_0= rulePrimary ) ) (otherlv_46= ',' ( (lv_iterators_47_0= ruleListIterator ) ) otherlv_48= 'in' ( (lv_lists_49_0= rulePrimary ) ) )* ) | ( () otherlv_51= 'reduce' ( (lv_expression_52_0= ruleTopLevelExpression ) ) otherlv_53= 'starting' ( (lv_accumulator_54_0= rulePrimary ) ) otherlv_55= 'for' ( (lv_iterators_56_0= ruleListIterator ) ) otherlv_57= 'in' ( (lv_lists_58_0= rulePrimary ) ) (otherlv_59= ',' ( (lv_iterators_60_0= ruleListIterator ) ) otherlv_61= 'in' ( (lv_lists_62_0= rulePrimary ) ) )* ) | ( () otherlv_64= 'filter' ( (lv_expression_65_0= ruleTopLevelExpression ) ) otherlv_66= 'for' ( (lv_iterators_67_0= ruleListIterator ) ) otherlv_68= 'in' ( (lv_lists_69_0= rulePrimary ) ) (otherlv_70= ',' ( (lv_iterators_71_0= ruleListIterator ) ) otherlv_72= 'in' ( (lv_lists_73_0= rulePrimary ) ) )* ) | this_Primary_74= rulePrimary )
            int alt22=11;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt22=1;
                }
                break;
            case 48:
                {
                alt22=2;
                }
                break;
            case 51:
                {
                alt22=3;
                }
                break;
            case 54:
                {
                alt22=4;
                }
                break;
            case 55:
                {
                alt22=5;
                }
                break;
            case 56:
                {
                alt22=6;
                }
                break;
            case 57:
                {
                alt22=7;
                }
                break;
            case 58:
                {
                alt22=8;
                }
                break;
            case 60:
                {
                alt22=9;
                }
                break;
            case 62:
                {
                alt22=10;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_STRING:
            case RULE_FQN:
            case 44:
            case 52:
            case 63:
            case 64:
            case 65:
            case 66:
                {
                alt22=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalKPIFormulaDSL.g:1741:3: ( () otherlv_1= '|' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= '|' )
                    {
                    // InternalKPIFormulaDSL.g:1741:3: ( () otherlv_1= '|' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= '|' )
                    // InternalKPIFormulaDSL.g:1742:4: () otherlv_1= '|' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= '|'
                    {
                    // InternalKPIFormulaDSL.g:1742:4: ()
                    // InternalKPIFormulaDSL.g:1743:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getOperatorAccess().getListSizeAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,47,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getOperatorAccess().getVerticalLineKeyword_0_1());
                      			
                    }
                    // InternalKPIFormulaDSL.g:1753:4: ( (lv_expression_2_0= ruleExpression ) )
                    // InternalKPIFormulaDSL.g:1754:5: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalKPIFormulaDSL.g:1754:5: (lv_expression_2_0= ruleExpression )
                    // InternalKPIFormulaDSL.g:1755:6: lv_expression_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperatorAccess().getExpressionExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
                    lv_expression_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperatorRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_2_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getOperatorAccess().getVerticalLineKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:1778:3: ( () otherlv_5= '[' ( (lv_elements_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleExpression ) ) )* otherlv_9= ']' )
                    {
                    // InternalKPIFormulaDSL.g:1778:3: ( () otherlv_5= '[' ( (lv_elements_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleExpression ) ) )* otherlv_9= ']' )
                    // InternalKPIFormulaDSL.g:1779:4: () otherlv_5= '[' ( (lv_elements_6_0= ruleExpression ) ) (otherlv_7= ',' ( (lv_elements_8_0= ruleExpression ) ) )* otherlv_9= ']'
                    {
                    // InternalKPIFormulaDSL.g:1779:4: ()
                    // InternalKPIFormulaDSL.g:1780:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getOperatorAccess().getListLiteralAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,48,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getOperatorAccess().getLeftSquareBracketKeyword_1_1());
                      			
                    }
                    // InternalKPIFormulaDSL.g:1790:4: ( (lv_elements_6_0= ruleExpression ) )
                    // InternalKPIFormulaDSL.g:1791:5: (lv_elements_6_0= ruleExpression )
                    {
                    // InternalKPIFormulaDSL.g:1791:5: (lv_elements_6_0= ruleExpression )
                    // InternalKPIFormulaDSL.g:1792:6: lv_elements_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperatorAccess().getElementsExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
                    lv_elements_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperatorRule());
                      						}
                      						add(
                      							current,
                      							"elements",
                      							lv_elements_6_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKPIFormulaDSL.g:1809:4: (otherlv_7= ',' ( (lv_elements_8_0= ruleExpression ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==49) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalKPIFormulaDSL.g:1810:5: otherlv_7= ',' ( (lv_elements_8_0= ruleExpression ) )
                    	    {
                    	    otherlv_7=(Token)match(input,49,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getOperatorAccess().getCommaKeyword_1_3_0());
                    	      				
                    	    }
                    	    // InternalKPIFormulaDSL.g:1814:5: ( (lv_elements_8_0= ruleExpression ) )
                    	    // InternalKPIFormulaDSL.g:1815:6: (lv_elements_8_0= ruleExpression )
                    	    {
                    	    // InternalKPIFormulaDSL.g:1815:6: (lv_elements_8_0= ruleExpression )
                    	    // InternalKPIFormulaDSL.g:1816:7: lv_elements_8_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOperatorAccess().getElementsExpressionParserRuleCall_1_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_27);
                    	    lv_elements_8_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOperatorRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_8_0,
                    	      								"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getOperatorAccess().getRightSquareBracketKeyword_1_4());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKPIFormulaDSL.g:1840:3: ( () otherlv_11= 'AVERAGE' otherlv_12= '(' ( (lv_list_13_0= ruleExpression ) ) otherlv_14= ')' )
                    {
                    // InternalKPIFormulaDSL.g:1840:3: ( () otherlv_11= 'AVERAGE' otherlv_12= '(' ( (lv_list_13_0= ruleExpression ) ) otherlv_14= ')' )
                    // InternalKPIFormulaDSL.g:1841:4: () otherlv_11= 'AVERAGE' otherlv_12= '(' ( (lv_list_13_0= ruleExpression ) ) otherlv_14= ')'
                    {
                    // InternalKPIFormulaDSL.g:1841:4: ()
                    // InternalKPIFormulaDSL.g:1842:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getOperatorAccess().getAvgOpAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_11=(Token)match(input,51,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getOperatorAccess().getAVERAGEKeyword_2_1());
                      			
                    }
                    otherlv_12=(Token)match(input,52,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_2_2());
                      			
                    }
                    // InternalKPIFormulaDSL.g:1856:4: ( (lv_list_13_0= ruleExpression ) )
                    // InternalKPIFormulaDSL.g:1857:5: (lv_list_13_0= ruleExpression )
                    {
                    // InternalKPIFormulaDSL.g:1857:5: (lv_list_13_0= ruleExpression )
                    // InternalKPIFormulaDSL.g:1858:6: lv_list_13_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperatorAccess().getListExpressionParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_list_13_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperatorRule());
                      						}
                      						set(
                      							current,
                      							"list",
                      							lv_list_13_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getOperatorAccess().getRightParenthesisKeyword_2_4());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKPIFormulaDSL.g:1881:3: ( () otherlv_16= 'WEIGHTED_SUM' otherlv_17= '(' ( (lv_list_18_0= ruleExpression ) ) otherlv_19= ',' ( (lv_weights_20_0= ruleExpression ) ) otherlv_21= ')' )
                    {
                    // InternalKPIFormulaDSL.g:1881:3: ( () otherlv_16= 'WEIGHTED_SUM' otherlv_17= '(' ( (lv_list_18_0= ruleExpression ) ) otherlv_19= ',' ( (lv_weights_20_0= ruleExpression ) ) otherlv_21= ')' )
                    // InternalKPIFormulaDSL.g:1882:4: () otherlv_16= 'WEIGHTED_SUM' otherlv_17= '(' ( (lv_list_18_0= ruleExpression ) ) otherlv_19= ',' ( (lv_weights_20_0= ruleExpression ) ) otherlv_21= ')'
                    {
                    // InternalKPIFormulaDSL.g:1882:4: ()
                    // InternalKPIFormulaDSL.g:1883:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getOperatorAccess().getWeightedSumOpAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_16=(Token)match(input,54,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getOperatorAccess().getWEIGHTED_SUMKeyword_3_1());
                      			
                    }
                    otherlv_17=(Token)match(input,52,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_3_2());
                      			
                    }
                    // InternalKPIFormulaDSL.g:1897:4: ( (lv_list_18_0= ruleExpression ) )
                    // InternalKPIFormulaDSL.g:1898:5: (lv_list_18_0= ruleExpression )
                    {
                    // InternalKPIFormulaDSL.g:1898:5: (lv_list_18_0= ruleExpression )
                    // InternalKPIFormulaDSL.g:1899:6: lv_list_18_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperatorAccess().getListExpressionParserRuleCall_3_3_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    lv_list_18_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperatorRule());
                      						}
                      						set(
                      							current,
                      							"list",
                      							lv_list_18_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_19=(Token)match(input,49,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getOperatorAccess().getCommaKeyword_3_4());
                      			
                    }
                    // InternalKPIFormulaDSL.g:1920:4: ( (lv_weights_20_0= ruleExpression ) )
                    // InternalKPIFormulaDSL.g:1921:5: (lv_weights_20_0= ruleExpression )
                    {
                    // InternalKPIFormulaDSL.g:1921:5: (lv_weights_20_0= ruleExpression )
                    // InternalKPIFormulaDSL.g:1922:6: lv_weights_20_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperatorAccess().getWeightsExpressionParserRuleCall_3_5_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_weights_20_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperatorRule());
                      						}
                      						set(
                      							current,
                      							"weights",
                      							lv_weights_20_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getOperatorAccess().getRightParenthesisKeyword_3_6());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKPIFormulaDSL.g:1945:3: ( () otherlv_23= 'MIN' otherlv_24= '(' ( (lv_list_25_0= ruleExpression ) ) otherlv_26= ')' )
                    {
                    // InternalKPIFormulaDSL.g:1945:3: ( () otherlv_23= 'MIN' otherlv_24= '(' ( (lv_list_25_0= ruleExpression ) ) otherlv_26= ')' )
                    // InternalKPIFormulaDSL.g:1946:4: () otherlv_23= 'MIN' otherlv_24= '(' ( (lv_list_25_0= ruleExpression ) ) otherlv_26= ')'
                    {
                    // InternalKPIFormulaDSL.g:1946:4: ()
                    // InternalKPIFormulaDSL.g:1947:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getOperatorAccess().getMinOpAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_23=(Token)match(input,55,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getOperatorAccess().getMINKeyword_4_1());
                      			
                    }
                    otherlv_24=(Token)match(input,52,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_24, grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_4_2());
                      			
                    }
                    // InternalKPIFormulaDSL.g:1961:4: ( (lv_list_25_0= ruleExpression ) )
                    // InternalKPIFormulaDSL.g:1962:5: (lv_list_25_0= ruleExpression )
                    {
                    // InternalKPIFormulaDSL.g:1962:5: (lv_list_25_0= ruleExpression )
                    // InternalKPIFormulaDSL.g:1963:6: lv_list_25_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperatorAccess().getListExpressionParserRuleCall_4_3_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_list_25_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperatorRule());
                      						}
                      						set(
                      							current,
                      							"list",
                      							lv_list_25_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_26=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getOperatorAccess().getRightParenthesisKeyword_4_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKPIFormulaDSL.g:1986:3: ( () otherlv_28= 'MAX' otherlv_29= '(' ( (lv_list_30_0= ruleExpression ) ) otherlv_31= ')' )
                    {
                    // InternalKPIFormulaDSL.g:1986:3: ( () otherlv_28= 'MAX' otherlv_29= '(' ( (lv_list_30_0= ruleExpression ) ) otherlv_31= ')' )
                    // InternalKPIFormulaDSL.g:1987:4: () otherlv_28= 'MAX' otherlv_29= '(' ( (lv_list_30_0= ruleExpression ) ) otherlv_31= ')'
                    {
                    // InternalKPIFormulaDSL.g:1987:4: ()
                    // InternalKPIFormulaDSL.g:1988:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getOperatorAccess().getMaxOpAction_5_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_28=(Token)match(input,56,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_28, grammarAccess.getOperatorAccess().getMAXKeyword_5_1());
                      			
                    }
                    otherlv_29=(Token)match(input,52,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_29, grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_5_2());
                      			
                    }
                    // InternalKPIFormulaDSL.g:2002:4: ( (lv_list_30_0= ruleExpression ) )
                    // InternalKPIFormulaDSL.g:2003:5: (lv_list_30_0= ruleExpression )
                    {
                    // InternalKPIFormulaDSL.g:2003:5: (lv_list_30_0= ruleExpression )
                    // InternalKPIFormulaDSL.g:2004:6: lv_list_30_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperatorAccess().getListExpressionParserRuleCall_5_3_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_list_30_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperatorRule());
                      						}
                      						set(
                      							current,
                      							"list",
                      							lv_list_30_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_31=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getOperatorAccess().getRightParenthesisKeyword_5_4());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKPIFormulaDSL.g:2027:3: ( () otherlv_33= 'THRESHOLD' otherlv_34= '(' ( (lv_expression_35_0= ruleExpression ) ) otherlv_36= ',' ( (lv_threshold_37_0= ruleExpression ) ) otherlv_38= ')' )
                    {
                    // InternalKPIFormulaDSL.g:2027:3: ( () otherlv_33= 'THRESHOLD' otherlv_34= '(' ( (lv_expression_35_0= ruleExpression ) ) otherlv_36= ',' ( (lv_threshold_37_0= ruleExpression ) ) otherlv_38= ')' )
                    // InternalKPIFormulaDSL.g:2028:4: () otherlv_33= 'THRESHOLD' otherlv_34= '(' ( (lv_expression_35_0= ruleExpression ) ) otherlv_36= ',' ( (lv_threshold_37_0= ruleExpression ) ) otherlv_38= ')'
                    {
                    // InternalKPIFormulaDSL.g:2028:4: ()
                    // InternalKPIFormulaDSL.g:2029:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getOperatorAccess().getThresholdOpAction_6_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_33=(Token)match(input,57,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_33, grammarAccess.getOperatorAccess().getTHRESHOLDKeyword_6_1());
                      			
                    }
                    otherlv_34=(Token)match(input,52,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_34, grammarAccess.getOperatorAccess().getLeftParenthesisKeyword_6_2());
                      			
                    }
                    // InternalKPIFormulaDSL.g:2043:4: ( (lv_expression_35_0= ruleExpression ) )
                    // InternalKPIFormulaDSL.g:2044:5: (lv_expression_35_0= ruleExpression )
                    {
                    // InternalKPIFormulaDSL.g:2044:5: (lv_expression_35_0= ruleExpression )
                    // InternalKPIFormulaDSL.g:2045:6: lv_expression_35_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperatorAccess().getExpressionExpressionParserRuleCall_6_3_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    lv_expression_35_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperatorRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_35_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_36=(Token)match(input,49,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_36, grammarAccess.getOperatorAccess().getCommaKeyword_6_4());
                      			
                    }
                    // InternalKPIFormulaDSL.g:2066:4: ( (lv_threshold_37_0= ruleExpression ) )
                    // InternalKPIFormulaDSL.g:2067:5: (lv_threshold_37_0= ruleExpression )
                    {
                    // InternalKPIFormulaDSL.g:2067:5: (lv_threshold_37_0= ruleExpression )
                    // InternalKPIFormulaDSL.g:2068:6: lv_threshold_37_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperatorAccess().getThresholdExpressionParserRuleCall_6_5_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_threshold_37_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperatorRule());
                      						}
                      						set(
                      							current,
                      							"threshold",
                      							lv_threshold_37_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_38=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_38, grammarAccess.getOperatorAccess().getRightParenthesisKeyword_6_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalKPIFormulaDSL.g:2091:3: ( () otherlv_40= 'do' ( (lv_expression_41_0= ruleTopLevelExpression ) ) otherlv_42= 'for' ( (lv_iterators_43_0= ruleListIterator ) ) otherlv_44= 'in' ( (lv_lists_45_0= rulePrimary ) ) (otherlv_46= ',' ( (lv_iterators_47_0= ruleListIterator ) ) otherlv_48= 'in' ( (lv_lists_49_0= rulePrimary ) ) )* )
                    {
                    // InternalKPIFormulaDSL.g:2091:3: ( () otherlv_40= 'do' ( (lv_expression_41_0= ruleTopLevelExpression ) ) otherlv_42= 'for' ( (lv_iterators_43_0= ruleListIterator ) ) otherlv_44= 'in' ( (lv_lists_45_0= rulePrimary ) ) (otherlv_46= ',' ( (lv_iterators_47_0= ruleListIterator ) ) otherlv_48= 'in' ( (lv_lists_49_0= rulePrimary ) ) )* )
                    // InternalKPIFormulaDSL.g:2092:4: () otherlv_40= 'do' ( (lv_expression_41_0= ruleTopLevelExpression ) ) otherlv_42= 'for' ( (lv_iterators_43_0= ruleListIterator ) ) otherlv_44= 'in' ( (lv_lists_45_0= rulePrimary ) ) (otherlv_46= ',' ( (lv_iterators_47_0= ruleListIterator ) ) otherlv_48= 'in' ( (lv_lists_49_0= rulePrimary ) ) )*
                    {
                    // InternalKPIFormulaDSL.g:2092:4: ()
                    // InternalKPIFormulaDSL.g:2093:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getOperatorAccess().getListIterationAction_7_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_40=(Token)match(input,58,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_40, grammarAccess.getOperatorAccess().getDoKeyword_7_1());
                      			
                    }
                    // InternalKPIFormulaDSL.g:2103:4: ( (lv_expression_41_0= ruleTopLevelExpression ) )
                    // InternalKPIFormulaDSL.g:2104:5: (lv_expression_41_0= ruleTopLevelExpression )
                    {
                    // InternalKPIFormulaDSL.g:2104:5: (lv_expression_41_0= ruleTopLevelExpression )
                    // InternalKPIFormulaDSL.g:2105:6: lv_expression_41_0= ruleTopLevelExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperatorAccess().getExpressionTopLevelExpressionParserRuleCall_7_2_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_expression_41_0=ruleTopLevelExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperatorRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_41_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.TopLevelExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_42=(Token)match(input,24,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_42, grammarAccess.getOperatorAccess().getForKeyword_7_3());
                      			
                    }
                    // InternalKPIFormulaDSL.g:2126:4: ( (lv_iterators_43_0= ruleListIterator ) )
                    // InternalKPIFormulaDSL.g:2127:5: (lv_iterators_43_0= ruleListIterator )
                    {
                    // InternalKPIFormulaDSL.g:2127:5: (lv_iterators_43_0= ruleListIterator )
                    // InternalKPIFormulaDSL.g:2128:6: lv_iterators_43_0= ruleListIterator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_7_4_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
                    lv_iterators_43_0=ruleListIterator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperatorRule());
                      						}
                      						add(
                      							current,
                      							"iterators",
                      							lv_iterators_43_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.ListIterator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_44=(Token)match(input,59,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_44, grammarAccess.getOperatorAccess().getInKeyword_7_5());
                      			
                    }
                    // InternalKPIFormulaDSL.g:2149:4: ( (lv_lists_45_0= rulePrimary ) )
                    // InternalKPIFormulaDSL.g:2150:5: (lv_lists_45_0= rulePrimary )
                    {
                    // InternalKPIFormulaDSL.g:2150:5: (lv_lists_45_0= rulePrimary )
                    // InternalKPIFormulaDSL.g:2151:6: lv_lists_45_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_7_6_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
                    lv_lists_45_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperatorRule());
                      						}
                      						add(
                      							current,
                      							"lists",
                      							lv_lists_45_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKPIFormulaDSL.g:2168:4: (otherlv_46= ',' ( (lv_iterators_47_0= ruleListIterator ) ) otherlv_48= 'in' ( (lv_lists_49_0= rulePrimary ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==49) ) {
                            int LA19_2 = input.LA(2);

                            if ( (LA19_2==RULE_ID) ) {
                                int LA19_3 = input.LA(3);

                                if ( (LA19_3==59) ) {
                                    alt19=1;
                                }


                            }


                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalKPIFormulaDSL.g:2169:5: otherlv_46= ',' ( (lv_iterators_47_0= ruleListIterator ) ) otherlv_48= 'in' ( (lv_lists_49_0= rulePrimary ) )
                    	    {
                    	    otherlv_46=(Token)match(input,49,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_46, grammarAccess.getOperatorAccess().getCommaKeyword_7_7_0());
                    	      				
                    	    }
                    	    // InternalKPIFormulaDSL.g:2173:5: ( (lv_iterators_47_0= ruleListIterator ) )
                    	    // InternalKPIFormulaDSL.g:2174:6: (lv_iterators_47_0= ruleListIterator )
                    	    {
                    	    // InternalKPIFormulaDSL.g:2174:6: (lv_iterators_47_0= ruleListIterator )
                    	    // InternalKPIFormulaDSL.g:2175:7: lv_iterators_47_0= ruleListIterator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_7_7_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_31);
                    	    lv_iterators_47_0=ruleListIterator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOperatorRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"iterators",
                    	      								lv_iterators_47_0,
                    	      								"lu.list.swrdi.formulaKPI.KPIFormulaDSL.ListIterator");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    otherlv_48=(Token)match(input,59,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_48, grammarAccess.getOperatorAccess().getInKeyword_7_7_2());
                    	      				
                    	    }
                    	    // InternalKPIFormulaDSL.g:2196:5: ( (lv_lists_49_0= rulePrimary ) )
                    	    // InternalKPIFormulaDSL.g:2197:6: (lv_lists_49_0= rulePrimary )
                    	    {
                    	    // InternalKPIFormulaDSL.g:2197:6: (lv_lists_49_0= rulePrimary )
                    	    // InternalKPIFormulaDSL.g:2198:7: lv_lists_49_0= rulePrimary
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_7_7_3_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_32);
                    	    lv_lists_49_0=rulePrimary();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOperatorRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"lists",
                    	      								lv_lists_49_0,
                    	      								"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Primary");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 9 :
                    // InternalKPIFormulaDSL.g:2218:3: ( () otherlv_51= 'reduce' ( (lv_expression_52_0= ruleTopLevelExpression ) ) otherlv_53= 'starting' ( (lv_accumulator_54_0= rulePrimary ) ) otherlv_55= 'for' ( (lv_iterators_56_0= ruleListIterator ) ) otherlv_57= 'in' ( (lv_lists_58_0= rulePrimary ) ) (otherlv_59= ',' ( (lv_iterators_60_0= ruleListIterator ) ) otherlv_61= 'in' ( (lv_lists_62_0= rulePrimary ) ) )* )
                    {
                    // InternalKPIFormulaDSL.g:2218:3: ( () otherlv_51= 'reduce' ( (lv_expression_52_0= ruleTopLevelExpression ) ) otherlv_53= 'starting' ( (lv_accumulator_54_0= rulePrimary ) ) otherlv_55= 'for' ( (lv_iterators_56_0= ruleListIterator ) ) otherlv_57= 'in' ( (lv_lists_58_0= rulePrimary ) ) (otherlv_59= ',' ( (lv_iterators_60_0= ruleListIterator ) ) otherlv_61= 'in' ( (lv_lists_62_0= rulePrimary ) ) )* )
                    // InternalKPIFormulaDSL.g:2219:4: () otherlv_51= 'reduce' ( (lv_expression_52_0= ruleTopLevelExpression ) ) otherlv_53= 'starting' ( (lv_accumulator_54_0= rulePrimary ) ) otherlv_55= 'for' ( (lv_iterators_56_0= ruleListIterator ) ) otherlv_57= 'in' ( (lv_lists_58_0= rulePrimary ) ) (otherlv_59= ',' ( (lv_iterators_60_0= ruleListIterator ) ) otherlv_61= 'in' ( (lv_lists_62_0= rulePrimary ) ) )*
                    {
                    // InternalKPIFormulaDSL.g:2219:4: ()
                    // InternalKPIFormulaDSL.g:2220:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getOperatorAccess().getListReduceAction_8_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_51=(Token)match(input,60,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_51, grammarAccess.getOperatorAccess().getReduceKeyword_8_1());
                      			
                    }
                    // InternalKPIFormulaDSL.g:2230:4: ( (lv_expression_52_0= ruleTopLevelExpression ) )
                    // InternalKPIFormulaDSL.g:2231:5: (lv_expression_52_0= ruleTopLevelExpression )
                    {
                    // InternalKPIFormulaDSL.g:2231:5: (lv_expression_52_0= ruleTopLevelExpression )
                    // InternalKPIFormulaDSL.g:2232:6: lv_expression_52_0= ruleTopLevelExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperatorAccess().getExpressionTopLevelExpressionParserRuleCall_8_2_0());
                      					
                    }
                    pushFollow(FOLLOW_33);
                    lv_expression_52_0=ruleTopLevelExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperatorRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_52_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.TopLevelExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_53=(Token)match(input,61,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_53, grammarAccess.getOperatorAccess().getStartingKeyword_8_3());
                      			
                    }
                    // InternalKPIFormulaDSL.g:2253:4: ( (lv_accumulator_54_0= rulePrimary ) )
                    // InternalKPIFormulaDSL.g:2254:5: (lv_accumulator_54_0= rulePrimary )
                    {
                    // InternalKPIFormulaDSL.g:2254:5: (lv_accumulator_54_0= rulePrimary )
                    // InternalKPIFormulaDSL.g:2255:6: lv_accumulator_54_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperatorAccess().getAccumulatorPrimaryParserRuleCall_8_4_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_accumulator_54_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperatorRule());
                      						}
                      						set(
                      							current,
                      							"accumulator",
                      							lv_accumulator_54_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_55=(Token)match(input,24,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_55, grammarAccess.getOperatorAccess().getForKeyword_8_5());
                      			
                    }
                    // InternalKPIFormulaDSL.g:2276:4: ( (lv_iterators_56_0= ruleListIterator ) )
                    // InternalKPIFormulaDSL.g:2277:5: (lv_iterators_56_0= ruleListIterator )
                    {
                    // InternalKPIFormulaDSL.g:2277:5: (lv_iterators_56_0= ruleListIterator )
                    // InternalKPIFormulaDSL.g:2278:6: lv_iterators_56_0= ruleListIterator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_8_6_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
                    lv_iterators_56_0=ruleListIterator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperatorRule());
                      						}
                      						add(
                      							current,
                      							"iterators",
                      							lv_iterators_56_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.ListIterator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_57=(Token)match(input,59,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_57, grammarAccess.getOperatorAccess().getInKeyword_8_7());
                      			
                    }
                    // InternalKPIFormulaDSL.g:2299:4: ( (lv_lists_58_0= rulePrimary ) )
                    // InternalKPIFormulaDSL.g:2300:5: (lv_lists_58_0= rulePrimary )
                    {
                    // InternalKPIFormulaDSL.g:2300:5: (lv_lists_58_0= rulePrimary )
                    // InternalKPIFormulaDSL.g:2301:6: lv_lists_58_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_8_8_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
                    lv_lists_58_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperatorRule());
                      						}
                      						add(
                      							current,
                      							"lists",
                      							lv_lists_58_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKPIFormulaDSL.g:2318:4: (otherlv_59= ',' ( (lv_iterators_60_0= ruleListIterator ) ) otherlv_61= 'in' ( (lv_lists_62_0= rulePrimary ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==49) ) {
                            int LA20_2 = input.LA(2);

                            if ( (LA20_2==RULE_ID) ) {
                                int LA20_3 = input.LA(3);

                                if ( (LA20_3==59) ) {
                                    alt20=1;
                                }


                            }


                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalKPIFormulaDSL.g:2319:5: otherlv_59= ',' ( (lv_iterators_60_0= ruleListIterator ) ) otherlv_61= 'in' ( (lv_lists_62_0= rulePrimary ) )
                    	    {
                    	    otherlv_59=(Token)match(input,49,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_59, grammarAccess.getOperatorAccess().getCommaKeyword_8_9_0());
                    	      				
                    	    }
                    	    // InternalKPIFormulaDSL.g:2323:5: ( (lv_iterators_60_0= ruleListIterator ) )
                    	    // InternalKPIFormulaDSL.g:2324:6: (lv_iterators_60_0= ruleListIterator )
                    	    {
                    	    // InternalKPIFormulaDSL.g:2324:6: (lv_iterators_60_0= ruleListIterator )
                    	    // InternalKPIFormulaDSL.g:2325:7: lv_iterators_60_0= ruleListIterator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_8_9_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_31);
                    	    lv_iterators_60_0=ruleListIterator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOperatorRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"iterators",
                    	      								lv_iterators_60_0,
                    	      								"lu.list.swrdi.formulaKPI.KPIFormulaDSL.ListIterator");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    otherlv_61=(Token)match(input,59,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_61, grammarAccess.getOperatorAccess().getInKeyword_8_9_2());
                    	      				
                    	    }
                    	    // InternalKPIFormulaDSL.g:2346:5: ( (lv_lists_62_0= rulePrimary ) )
                    	    // InternalKPIFormulaDSL.g:2347:6: (lv_lists_62_0= rulePrimary )
                    	    {
                    	    // InternalKPIFormulaDSL.g:2347:6: (lv_lists_62_0= rulePrimary )
                    	    // InternalKPIFormulaDSL.g:2348:7: lv_lists_62_0= rulePrimary
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_8_9_3_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_32);
                    	    lv_lists_62_0=rulePrimary();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOperatorRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"lists",
                    	      								lv_lists_62_0,
                    	      								"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Primary");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 10 :
                    // InternalKPIFormulaDSL.g:2368:3: ( () otherlv_64= 'filter' ( (lv_expression_65_0= ruleTopLevelExpression ) ) otherlv_66= 'for' ( (lv_iterators_67_0= ruleListIterator ) ) otherlv_68= 'in' ( (lv_lists_69_0= rulePrimary ) ) (otherlv_70= ',' ( (lv_iterators_71_0= ruleListIterator ) ) otherlv_72= 'in' ( (lv_lists_73_0= rulePrimary ) ) )* )
                    {
                    // InternalKPIFormulaDSL.g:2368:3: ( () otherlv_64= 'filter' ( (lv_expression_65_0= ruleTopLevelExpression ) ) otherlv_66= 'for' ( (lv_iterators_67_0= ruleListIterator ) ) otherlv_68= 'in' ( (lv_lists_69_0= rulePrimary ) ) (otherlv_70= ',' ( (lv_iterators_71_0= ruleListIterator ) ) otherlv_72= 'in' ( (lv_lists_73_0= rulePrimary ) ) )* )
                    // InternalKPIFormulaDSL.g:2369:4: () otherlv_64= 'filter' ( (lv_expression_65_0= ruleTopLevelExpression ) ) otherlv_66= 'for' ( (lv_iterators_67_0= ruleListIterator ) ) otherlv_68= 'in' ( (lv_lists_69_0= rulePrimary ) ) (otherlv_70= ',' ( (lv_iterators_71_0= ruleListIterator ) ) otherlv_72= 'in' ( (lv_lists_73_0= rulePrimary ) ) )*
                    {
                    // InternalKPIFormulaDSL.g:2369:4: ()
                    // InternalKPIFormulaDSL.g:2370:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getOperatorAccess().getListFilterAction_9_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_64=(Token)match(input,62,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_64, grammarAccess.getOperatorAccess().getFilterKeyword_9_1());
                      			
                    }
                    // InternalKPIFormulaDSL.g:2380:4: ( (lv_expression_65_0= ruleTopLevelExpression ) )
                    // InternalKPIFormulaDSL.g:2381:5: (lv_expression_65_0= ruleTopLevelExpression )
                    {
                    // InternalKPIFormulaDSL.g:2381:5: (lv_expression_65_0= ruleTopLevelExpression )
                    // InternalKPIFormulaDSL.g:2382:6: lv_expression_65_0= ruleTopLevelExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperatorAccess().getExpressionTopLevelExpressionParserRuleCall_9_2_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_expression_65_0=ruleTopLevelExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperatorRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_65_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.TopLevelExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_66=(Token)match(input,24,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_66, grammarAccess.getOperatorAccess().getForKeyword_9_3());
                      			
                    }
                    // InternalKPIFormulaDSL.g:2403:4: ( (lv_iterators_67_0= ruleListIterator ) )
                    // InternalKPIFormulaDSL.g:2404:5: (lv_iterators_67_0= ruleListIterator )
                    {
                    // InternalKPIFormulaDSL.g:2404:5: (lv_iterators_67_0= ruleListIterator )
                    // InternalKPIFormulaDSL.g:2405:6: lv_iterators_67_0= ruleListIterator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_9_4_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
                    lv_iterators_67_0=ruleListIterator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperatorRule());
                      						}
                      						add(
                      							current,
                      							"iterators",
                      							lv_iterators_67_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.ListIterator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_68=(Token)match(input,59,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_68, grammarAccess.getOperatorAccess().getInKeyword_9_5());
                      			
                    }
                    // InternalKPIFormulaDSL.g:2426:4: ( (lv_lists_69_0= rulePrimary ) )
                    // InternalKPIFormulaDSL.g:2427:5: (lv_lists_69_0= rulePrimary )
                    {
                    // InternalKPIFormulaDSL.g:2427:5: (lv_lists_69_0= rulePrimary )
                    // InternalKPIFormulaDSL.g:2428:6: lv_lists_69_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_9_6_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
                    lv_lists_69_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperatorRule());
                      						}
                      						add(
                      							current,
                      							"lists",
                      							lv_lists_69_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKPIFormulaDSL.g:2445:4: (otherlv_70= ',' ( (lv_iterators_71_0= ruleListIterator ) ) otherlv_72= 'in' ( (lv_lists_73_0= rulePrimary ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==49) ) {
                            int LA21_2 = input.LA(2);

                            if ( (LA21_2==RULE_ID) ) {
                                int LA21_3 = input.LA(3);

                                if ( (LA21_3==59) ) {
                                    alt21=1;
                                }


                            }


                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalKPIFormulaDSL.g:2446:5: otherlv_70= ',' ( (lv_iterators_71_0= ruleListIterator ) ) otherlv_72= 'in' ( (lv_lists_73_0= rulePrimary ) )
                    	    {
                    	    otherlv_70=(Token)match(input,49,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_70, grammarAccess.getOperatorAccess().getCommaKeyword_9_7_0());
                    	      				
                    	    }
                    	    // InternalKPIFormulaDSL.g:2450:5: ( (lv_iterators_71_0= ruleListIterator ) )
                    	    // InternalKPIFormulaDSL.g:2451:6: (lv_iterators_71_0= ruleListIterator )
                    	    {
                    	    // InternalKPIFormulaDSL.g:2451:6: (lv_iterators_71_0= ruleListIterator )
                    	    // InternalKPIFormulaDSL.g:2452:7: lv_iterators_71_0= ruleListIterator
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOperatorAccess().getIteratorsListIteratorParserRuleCall_9_7_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_31);
                    	    lv_iterators_71_0=ruleListIterator();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOperatorRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"iterators",
                    	      								lv_iterators_71_0,
                    	      								"lu.list.swrdi.formulaKPI.KPIFormulaDSL.ListIterator");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    otherlv_72=(Token)match(input,59,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_72, grammarAccess.getOperatorAccess().getInKeyword_9_7_2());
                    	      				
                    	    }
                    	    // InternalKPIFormulaDSL.g:2473:5: ( (lv_lists_73_0= rulePrimary ) )
                    	    // InternalKPIFormulaDSL.g:2474:6: (lv_lists_73_0= rulePrimary )
                    	    {
                    	    // InternalKPIFormulaDSL.g:2474:6: (lv_lists_73_0= rulePrimary )
                    	    // InternalKPIFormulaDSL.g:2475:7: lv_lists_73_0= rulePrimary
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOperatorAccess().getListsPrimaryParserRuleCall_9_7_3_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_32);
                    	    lv_lists_73_0=rulePrimary();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOperatorRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"lists",
                    	      								lv_lists_73_0,
                    	      								"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Primary");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 11 :
                    // InternalKPIFormulaDSL.g:2495:3: this_Primary_74= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperatorAccess().getPrimaryParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Primary_74=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Primary_74;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRulePrimary"
    // InternalKPIFormulaDSL.g:2507:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalKPIFormulaDSL.g:2507:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalKPIFormulaDSL.g:2508:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalKPIFormulaDSL.g:2514:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | this_Atomic_9= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_expression_8_0 = null;

        EObject this_Atomic_9 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:2520:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | this_Atomic_9= ruleAtomic ) )
            // InternalKPIFormulaDSL.g:2521:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | this_Atomic_9= ruleAtomic )
            {
            // InternalKPIFormulaDSL.g:2521:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | this_Atomic_9= ruleAtomic )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt23=1;
                }
                break;
            case 63:
                {
                alt23=2;
                }
                break;
            case 44:
                {
                alt23=3;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_STRING:
            case RULE_FQN:
            case 64:
            case 65:
            case 66:
                {
                alt23=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalKPIFormulaDSL.g:2522:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalKPIFormulaDSL.g:2522:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalKPIFormulaDSL.g:2523:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,52,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_29);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:2541:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalKPIFormulaDSL.g:2541:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalKPIFormulaDSL.g:2542:4: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalKPIFormulaDSL.g:2542:4: ()
                    // InternalKPIFormulaDSL.g:2543:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,63,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                      			
                    }
                    // InternalKPIFormulaDSL.g:2553:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalKPIFormulaDSL.g:2554:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalKPIFormulaDSL.g:2554:5: (lv_expression_5_0= rulePrimary )
                    // InternalKPIFormulaDSL.g:2555:6: lv_expression_5_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_5_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKPIFormulaDSL.g:2574:3: ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) )
                    {
                    // InternalKPIFormulaDSL.g:2574:3: ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) )
                    // InternalKPIFormulaDSL.g:2575:4: () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) )
                    {
                    // InternalKPIFormulaDSL.g:2575:4: ()
                    // InternalKPIFormulaDSL.g:2576:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getUnaryMinusAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,44,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1());
                      			
                    }
                    // InternalKPIFormulaDSL.g:2586:4: ( (lv_expression_8_0= rulePrimary ) )
                    // InternalKPIFormulaDSL.g:2587:5: (lv_expression_8_0= rulePrimary )
                    {
                    // InternalKPIFormulaDSL.g:2587:5: (lv_expression_8_0= rulePrimary )
                    // InternalKPIFormulaDSL.g:2588:6: lv_expression_8_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_8_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_8_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalKPIFormulaDSL.g:2607:3: this_Atomic_9= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Atomic_9=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Atomic_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleListIterator"
    // InternalKPIFormulaDSL.g:2619:1: entryRuleListIterator returns [EObject current=null] : iv_ruleListIterator= ruleListIterator EOF ;
    public final EObject entryRuleListIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListIterator = null;


        try {
            // InternalKPIFormulaDSL.g:2619:53: (iv_ruleListIterator= ruleListIterator EOF )
            // InternalKPIFormulaDSL.g:2620:2: iv_ruleListIterator= ruleListIterator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListIteratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleListIterator=ruleListIterator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListIterator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListIterator"


    // $ANTLR start "ruleListIterator"
    // InternalKPIFormulaDSL.g:2626:1: ruleListIterator returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleListIterator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:2632:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalKPIFormulaDSL.g:2633:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalKPIFormulaDSL.g:2633:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalKPIFormulaDSL.g:2634:3: (lv_name_0_0= RULE_ID )
            {
            // InternalKPIFormulaDSL.g:2634:3: (lv_name_0_0= RULE_ID )
            // InternalKPIFormulaDSL.g:2635:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getListIteratorAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getListIteratorRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListIterator"


    // $ANTLR start "entryRuleAtomic"
    // InternalKPIFormulaDSL.g:2654:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalKPIFormulaDSL.g:2654:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalKPIFormulaDSL.g:2655:2: iv_ruleAtomic= ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomic; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalKPIFormulaDSL.g:2661:1: ruleAtomic returns [EObject current=null] : ( ( () otherlv_1= 'accumulator' ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) ) | ( () ( (lv_value_11_0= RULE_DOUBLE ) ) ( (lv_unit_12_0= ruleValueUnit ) ) ) | ( () ( (otherlv_14= RULE_FQN ) ) ) | ( () ( (otherlv_16= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token lv_value_7_0=null;
        Token lv_value_9_1=null;
        Token lv_value_9_2=null;
        Token lv_value_11_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Enumerator lv_unit_12_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:2667:2: ( ( ( () otherlv_1= 'accumulator' ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) ) | ( () ( (lv_value_11_0= RULE_DOUBLE ) ) ( (lv_unit_12_0= ruleValueUnit ) ) ) | ( () ( (otherlv_14= RULE_FQN ) ) ) | ( () ( (otherlv_16= RULE_ID ) ) ) ) )
            // InternalKPIFormulaDSL.g:2668:2: ( ( () otherlv_1= 'accumulator' ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) ) | ( () ( (lv_value_11_0= RULE_DOUBLE ) ) ( (lv_unit_12_0= ruleValueUnit ) ) ) | ( () ( (otherlv_14= RULE_FQN ) ) ) | ( () ( (otherlv_16= RULE_ID ) ) ) )
            {
            // InternalKPIFormulaDSL.g:2668:2: ( ( () otherlv_1= 'accumulator' ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) ) | ( () ( (lv_value_11_0= RULE_DOUBLE ) ) ( (lv_unit_12_0= ruleValueUnit ) ) ) | ( () ( (otherlv_14= RULE_FQN ) ) ) | ( () ( (otherlv_16= RULE_ID ) ) ) )
            int alt25=8;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalKPIFormulaDSL.g:2669:3: ( () otherlv_1= 'accumulator' )
                    {
                    // InternalKPIFormulaDSL.g:2669:3: ( () otherlv_1= 'accumulator' )
                    // InternalKPIFormulaDSL.g:2670:4: () otherlv_1= 'accumulator'
                    {
                    // InternalKPIFormulaDSL.g:2670:4: ()
                    // InternalKPIFormulaDSL.g:2671:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getAccumulatorAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getAtomicAccess().getAccumulatorKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:2683:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // InternalKPIFormulaDSL.g:2683:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // InternalKPIFormulaDSL.g:2684:4: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // InternalKPIFormulaDSL.g:2684:4: ()
                    // InternalKPIFormulaDSL.g:2685:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getIntConstantAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKPIFormulaDSL.g:2691:4: ( (lv_value_3_0= RULE_INT ) )
                    // InternalKPIFormulaDSL.g:2692:5: (lv_value_3_0= RULE_INT )
                    {
                    // InternalKPIFormulaDSL.g:2692:5: (lv_value_3_0= RULE_INT )
                    // InternalKPIFormulaDSL.g:2693:6: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKPIFormulaDSL.g:2711:3: ( () ( (lv_value_5_0= RULE_DOUBLE ) ) )
                    {
                    // InternalKPIFormulaDSL.g:2711:3: ( () ( (lv_value_5_0= RULE_DOUBLE ) ) )
                    // InternalKPIFormulaDSL.g:2712:4: () ( (lv_value_5_0= RULE_DOUBLE ) )
                    {
                    // InternalKPIFormulaDSL.g:2712:4: ()
                    // InternalKPIFormulaDSL.g:2713:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getRealConstantAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKPIFormulaDSL.g:2719:4: ( (lv_value_5_0= RULE_DOUBLE ) )
                    // InternalKPIFormulaDSL.g:2720:5: (lv_value_5_0= RULE_DOUBLE )
                    {
                    // InternalKPIFormulaDSL.g:2720:5: (lv_value_5_0= RULE_DOUBLE )
                    // InternalKPIFormulaDSL.g:2721:6: lv_value_5_0= RULE_DOUBLE
                    {
                    lv_value_5_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_5_0, grammarAccess.getAtomicAccess().getValueDOUBLETerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_5_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.DOUBLE");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalKPIFormulaDSL.g:2739:3: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // InternalKPIFormulaDSL.g:2739:3: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    // InternalKPIFormulaDSL.g:2740:4: () ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // InternalKPIFormulaDSL.g:2740:4: ()
                    // InternalKPIFormulaDSL.g:2741:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getTextConstantAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKPIFormulaDSL.g:2747:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalKPIFormulaDSL.g:2748:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalKPIFormulaDSL.g:2748:5: (lv_value_7_0= RULE_STRING )
                    // InternalKPIFormulaDSL.g:2749:6: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_7_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_7_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalKPIFormulaDSL.g:2767:3: ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) )
                    {
                    // InternalKPIFormulaDSL.g:2767:3: ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) )
                    // InternalKPIFormulaDSL.g:2768:4: () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) )
                    {
                    // InternalKPIFormulaDSL.g:2768:4: ()
                    // InternalKPIFormulaDSL.g:2769:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getBoolConstantAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKPIFormulaDSL.g:2775:4: ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) )
                    // InternalKPIFormulaDSL.g:2776:5: ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) )
                    {
                    // InternalKPIFormulaDSL.g:2776:5: ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) )
                    // InternalKPIFormulaDSL.g:2777:6: (lv_value_9_1= 'true' | lv_value_9_2= 'false' )
                    {
                    // InternalKPIFormulaDSL.g:2777:6: (lv_value_9_1= 'true' | lv_value_9_2= 'false' )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==65) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==66) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalKPIFormulaDSL.g:2778:7: lv_value_9_1= 'true'
                            {
                            lv_value_9_1=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_9_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_4_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAtomicRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_9_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalKPIFormulaDSL.g:2789:7: lv_value_9_2= 'false'
                            {
                            lv_value_9_2=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_9_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_4_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAtomicRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_9_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalKPIFormulaDSL.g:2804:3: ( () ( (lv_value_11_0= RULE_DOUBLE ) ) ( (lv_unit_12_0= ruleValueUnit ) ) )
                    {
                    // InternalKPIFormulaDSL.g:2804:3: ( () ( (lv_value_11_0= RULE_DOUBLE ) ) ( (lv_unit_12_0= ruleValueUnit ) ) )
                    // InternalKPIFormulaDSL.g:2805:4: () ( (lv_value_11_0= RULE_DOUBLE ) ) ( (lv_unit_12_0= ruleValueUnit ) )
                    {
                    // InternalKPIFormulaDSL.g:2805:4: ()
                    // InternalKPIFormulaDSL.g:2806:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getUnitConstantAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKPIFormulaDSL.g:2812:4: ( (lv_value_11_0= RULE_DOUBLE ) )
                    // InternalKPIFormulaDSL.g:2813:5: (lv_value_11_0= RULE_DOUBLE )
                    {
                    // InternalKPIFormulaDSL.g:2813:5: (lv_value_11_0= RULE_DOUBLE )
                    // InternalKPIFormulaDSL.g:2814:6: lv_value_11_0= RULE_DOUBLE
                    {
                    lv_value_11_0=(Token)match(input,RULE_DOUBLE,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_11_0, grammarAccess.getAtomicAccess().getValueDOUBLETerminalRuleCall_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_11_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.DOUBLE");
                      					
                    }

                    }


                    }

                    // InternalKPIFormulaDSL.g:2830:4: ( (lv_unit_12_0= ruleValueUnit ) )
                    // InternalKPIFormulaDSL.g:2831:5: (lv_unit_12_0= ruleValueUnit )
                    {
                    // InternalKPIFormulaDSL.g:2831:5: (lv_unit_12_0= ruleValueUnit )
                    // InternalKPIFormulaDSL.g:2832:6: lv_unit_12_0= ruleValueUnit
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getUnitValueUnitEnumRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_unit_12_0=ruleValueUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicRule());
                      						}
                      						set(
                      							current,
                      							"unit",
                      							lv_unit_12_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.ValueUnit");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalKPIFormulaDSL.g:2851:3: ( () ( (otherlv_14= RULE_FQN ) ) )
                    {
                    // InternalKPIFormulaDSL.g:2851:3: ( () ( (otherlv_14= RULE_FQN ) ) )
                    // InternalKPIFormulaDSL.g:2852:4: () ( (otherlv_14= RULE_FQN ) )
                    {
                    // InternalKPIFormulaDSL.g:2852:4: ()
                    // InternalKPIFormulaDSL.g:2853:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getEnumLiteralRefAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKPIFormulaDSL.g:2859:4: ( (otherlv_14= RULE_FQN ) )
                    // InternalKPIFormulaDSL.g:2860:5: (otherlv_14= RULE_FQN )
                    {
                    // InternalKPIFormulaDSL.g:2860:5: (otherlv_14= RULE_FQN )
                    // InternalKPIFormulaDSL.g:2861:6: otherlv_14= RULE_FQN
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      					
                    }
                    otherlv_14=(Token)match(input,RULE_FQN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_14, grammarAccess.getAtomicAccess().getLiteralEnumerationLiteralCrossReference_6_1_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalKPIFormulaDSL.g:2874:3: ( () ( (otherlv_16= RULE_ID ) ) )
                    {
                    // InternalKPIFormulaDSL.g:2874:3: ( () ( (otherlv_16= RULE_ID ) ) )
                    // InternalKPIFormulaDSL.g:2875:4: () ( (otherlv_16= RULE_ID ) )
                    {
                    // InternalKPIFormulaDSL.g:2875:4: ()
                    // InternalKPIFormulaDSL.g:2876:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getComputableRefAction_7_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKPIFormulaDSL.g:2882:4: ( (otherlv_16= RULE_ID ) )
                    // InternalKPIFormulaDSL.g:2883:5: (otherlv_16= RULE_ID )
                    {
                    // InternalKPIFormulaDSL.g:2883:5: (otherlv_16= RULE_ID )
                    // InternalKPIFormulaDSL.g:2884:6: otherlv_16= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      					
                    }
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_16, grammarAccess.getAtomicAccess().getComputableComputableCrossReference_7_1_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "ruleWindowUnit"
    // InternalKPIFormulaDSL.g:2900:1: ruleWindowUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'measurements' ) ) ;
    public final Enumerator ruleWindowUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:2906:2: ( ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'measurements' ) ) )
            // InternalKPIFormulaDSL.g:2907:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'measurements' ) )
            {
            // InternalKPIFormulaDSL.g:2907:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'measurements' ) )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt26=1;
                }
                break;
            case 68:
                {
                alt26=2;
                }
                break;
            case 69:
                {
                alt26=3;
                }
                break;
            case 70:
                {
                alt26=4;
                }
                break;
            case 71:
                {
                alt26=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalKPIFormulaDSL.g:2908:3: (enumLiteral_0= 'seconds' )
                    {
                    // InternalKPIFormulaDSL.g:2908:3: (enumLiteral_0= 'seconds' )
                    // InternalKPIFormulaDSL.g:2909:4: enumLiteral_0= 'seconds'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getWindowUnitAccess().getSECEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getWindowUnitAccess().getSECEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:2916:3: (enumLiteral_1= 'minutes' )
                    {
                    // InternalKPIFormulaDSL.g:2916:3: (enumLiteral_1= 'minutes' )
                    // InternalKPIFormulaDSL.g:2917:4: enumLiteral_1= 'minutes'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getWindowUnitAccess().getMINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getWindowUnitAccess().getMINEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKPIFormulaDSL.g:2924:3: (enumLiteral_2= 'hours' )
                    {
                    // InternalKPIFormulaDSL.g:2924:3: (enumLiteral_2= 'hours' )
                    // InternalKPIFormulaDSL.g:2925:4: enumLiteral_2= 'hours'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getWindowUnitAccess().getHOUREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getWindowUnitAccess().getHOUREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKPIFormulaDSL.g:2932:3: (enumLiteral_3= 'days' )
                    {
                    // InternalKPIFormulaDSL.g:2932:3: (enumLiteral_3= 'days' )
                    // InternalKPIFormulaDSL.g:2933:4: enumLiteral_3= 'days'
                    {
                    enumLiteral_3=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getWindowUnitAccess().getDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getWindowUnitAccess().getDAYEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKPIFormulaDSL.g:2940:3: (enumLiteral_4= 'measurements' )
                    {
                    // InternalKPIFormulaDSL.g:2940:3: (enumLiteral_4= 'measurements' )
                    // InternalKPIFormulaDSL.g:2941:4: enumLiteral_4= 'measurements'
                    {
                    enumLiteral_4=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getWindowUnitAccess().getMEASUREMENTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getWindowUnitAccess().getMEASUREMENTEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWindowUnit"


    // $ANTLR start "ruleValueUnit"
    // InternalKPIFormulaDSL.g:2951:1: ruleValueUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) | (enumLiteral_3= 'hours' ) | (enumLiteral_4= 'liters' ) | (enumLiteral_5= 'cubic meter' ) | (enumLiteral_6= 'Wh' ) | (enumLiteral_7= 'kWh' ) | (enumLiteral_8= 'gCO2eq' ) | (enumLiteral_9= 'kgCO2eq' ) ) ;
    public final Enumerator ruleValueUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:2957:2: ( ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) | (enumLiteral_3= 'hours' ) | (enumLiteral_4= 'liters' ) | (enumLiteral_5= 'cubic meter' ) | (enumLiteral_6= 'Wh' ) | (enumLiteral_7= 'kWh' ) | (enumLiteral_8= 'gCO2eq' ) | (enumLiteral_9= 'kgCO2eq' ) ) )
            // InternalKPIFormulaDSL.g:2958:2: ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) | (enumLiteral_3= 'hours' ) | (enumLiteral_4= 'liters' ) | (enumLiteral_5= 'cubic meter' ) | (enumLiteral_6= 'Wh' ) | (enumLiteral_7= 'kWh' ) | (enumLiteral_8= 'gCO2eq' ) | (enumLiteral_9= 'kgCO2eq' ) )
            {
            // InternalKPIFormulaDSL.g:2958:2: ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) | (enumLiteral_3= 'hours' ) | (enumLiteral_4= 'liters' ) | (enumLiteral_5= 'cubic meter' ) | (enumLiteral_6= 'Wh' ) | (enumLiteral_7= 'kWh' ) | (enumLiteral_8= 'gCO2eq' ) | (enumLiteral_9= 'kgCO2eq' ) )
            int alt27=10;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt27=1;
                }
                break;
            case 67:
                {
                alt27=2;
                }
                break;
            case 68:
                {
                alt27=3;
                }
                break;
            case 69:
                {
                alt27=4;
                }
                break;
            case 73:
                {
                alt27=5;
                }
                break;
            case 74:
                {
                alt27=6;
                }
                break;
            case 75:
                {
                alt27=7;
                }
                break;
            case 76:
                {
                alt27=8;
                }
                break;
            case 77:
                {
                alt27=9;
                }
                break;
            case 78:
                {
                alt27=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalKPIFormulaDSL.g:2959:3: (enumLiteral_0= 'milliseconds' )
                    {
                    // InternalKPIFormulaDSL.g:2959:3: (enumLiteral_0= 'milliseconds' )
                    // InternalKPIFormulaDSL.g:2960:4: enumLiteral_0= 'milliseconds'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getValueUnitAccess().getMILLIEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getValueUnitAccess().getMILLIEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:2967:3: (enumLiteral_1= 'seconds' )
                    {
                    // InternalKPIFormulaDSL.g:2967:3: (enumLiteral_1= 'seconds' )
                    // InternalKPIFormulaDSL.g:2968:4: enumLiteral_1= 'seconds'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getValueUnitAccess().getSECEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getValueUnitAccess().getSECEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKPIFormulaDSL.g:2975:3: (enumLiteral_2= 'minutes' )
                    {
                    // InternalKPIFormulaDSL.g:2975:3: (enumLiteral_2= 'minutes' )
                    // InternalKPIFormulaDSL.g:2976:4: enumLiteral_2= 'minutes'
                    {
                    enumLiteral_2=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getValueUnitAccess().getMINEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getValueUnitAccess().getMINEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKPIFormulaDSL.g:2983:3: (enumLiteral_3= 'hours' )
                    {
                    // InternalKPIFormulaDSL.g:2983:3: (enumLiteral_3= 'hours' )
                    // InternalKPIFormulaDSL.g:2984:4: enumLiteral_3= 'hours'
                    {
                    enumLiteral_3=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getValueUnitAccess().getHOUREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getValueUnitAccess().getHOUREnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKPIFormulaDSL.g:2991:3: (enumLiteral_4= 'liters' )
                    {
                    // InternalKPIFormulaDSL.g:2991:3: (enumLiteral_4= 'liters' )
                    // InternalKPIFormulaDSL.g:2992:4: enumLiteral_4= 'liters'
                    {
                    enumLiteral_4=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getValueUnitAccess().getLITERSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getValueUnitAccess().getLITERSEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKPIFormulaDSL.g:2999:3: (enumLiteral_5= 'cubic meter' )
                    {
                    // InternalKPIFormulaDSL.g:2999:3: (enumLiteral_5= 'cubic meter' )
                    // InternalKPIFormulaDSL.g:3000:4: enumLiteral_5= 'cubic meter'
                    {
                    enumLiteral_5=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getValueUnitAccess().getM3EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getValueUnitAccess().getM3EnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKPIFormulaDSL.g:3007:3: (enumLiteral_6= 'Wh' )
                    {
                    // InternalKPIFormulaDSL.g:3007:3: (enumLiteral_6= 'Wh' )
                    // InternalKPIFormulaDSL.g:3008:4: enumLiteral_6= 'Wh'
                    {
                    enumLiteral_6=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getValueUnitAccess().getWhEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getValueUnitAccess().getWhEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalKPIFormulaDSL.g:3015:3: (enumLiteral_7= 'kWh' )
                    {
                    // InternalKPIFormulaDSL.g:3015:3: (enumLiteral_7= 'kWh' )
                    // InternalKPIFormulaDSL.g:3016:4: enumLiteral_7= 'kWh'
                    {
                    enumLiteral_7=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getValueUnitAccess().getKWhEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getValueUnitAccess().getKWhEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalKPIFormulaDSL.g:3023:3: (enumLiteral_8= 'gCO2eq' )
                    {
                    // InternalKPIFormulaDSL.g:3023:3: (enumLiteral_8= 'gCO2eq' )
                    // InternalKPIFormulaDSL.g:3024:4: enumLiteral_8= 'gCO2eq'
                    {
                    enumLiteral_8=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getValueUnitAccess().getGCO2eqEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getValueUnitAccess().getGCO2eqEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalKPIFormulaDSL.g:3031:3: (enumLiteral_9= 'kgCO2eq' )
                    {
                    // InternalKPIFormulaDSL.g:3031:3: (enumLiteral_9= 'kgCO2eq' )
                    // InternalKPIFormulaDSL.g:3032:4: enumLiteral_9= 'kgCO2eq'
                    {
                    enumLiteral_9=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getValueUnitAccess().getKgCO2eqEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getValueUnitAccess().getKgCO2eqEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueUnit"

    // $ANTLR start synpred1_InternalKPIFormulaDSL
    public final void synpred1_InternalKPIFormulaDSL_fragment() throws RecognitionException {   
        // InternalKPIFormulaDSL.g:1112:4: ( ruleCondition )
        // InternalKPIFormulaDSL.g:1112:5: ruleCondition
        {
        pushFollow(FOLLOW_2);
        ruleCondition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalKPIFormulaDSL

    // $ANTLR start synpred2_InternalKPIFormulaDSL
    public final void synpred2_InternalKPIFormulaDSL_fragment() throws RecognitionException {   
        // InternalKPIFormulaDSL.g:1210:4: ( 'otherwise' )
        // InternalKPIFormulaDSL.g:1210:5: 'otherwise'
        {
        match(input,34,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalKPIFormulaDSL

    // Delegated rules

    public final boolean synpred1_InternalKPIFormulaDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalKPIFormulaDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalKPIFormulaDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalKPIFormulaDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA25 dfa25 = new DFA25(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\3\uffff\1\10\6\uffff";
    static final String dfa_3s = "\1\4\2\uffff\1\4\6\uffff";
    static final String dfa_4s = "\1\102\2\uffff\1\116\6\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\7\1\10\1\3\1\6";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\7\1\2\1\3\1\4\1\6\67\uffff\1\1\2\5",
            "",
            "",
            "\1\10\13\uffff\1\10\5\uffff\1\10\1\uffff\1\10\7\uffff\2\10\1\uffff\15\10\1\uffff\2\10\2\uffff\1\10\7\uffff\1\10\5\uffff\3\11\2\uffff\7\11",
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

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2668:2: ( ( () otherlv_1= 'accumulator' ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_9_1= 'true' | lv_value_9_2= 'false' ) ) ) ) | ( () ( (lv_value_11_0= RULE_DOUBLE ) ) ( (lv_unit_12_0= ruleValueUnit ) ) ) | ( () ( (otherlv_14= RULE_FQN ) ) ) | ( () ( (otherlv_16= RULE_ID ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0xD7D99000002001F0L,0x0000000000000007L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002BE0000L,0x0000000000007F38L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xD7D99004002001F0L,0x0000000000000007L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x2000000000000000L});

}