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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DOUBLE", "RULE_STRING", "RULE_FQN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'of'", "'type'", "'KPI'", "'int'", "'real'", "'text'", "'bool'", "'{'", "'}'", "'aggregate'", "'for'", "'drift'", "'Minimum'", "'Maximum'", "'Average'", "'Median'", "'Standard'", "'deviation'", "'->'", "';'", "'otherwise'", "'or'", "'and'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'!'", "'AVERAGE'", "','", "'WEIGHTED_SUM'", "':'", "'MIN'", "'MAX'", "'THRESHOLD'", "'true'", "'false'", "'seconds'", "'minutes'", "'hours'", "'days'", "'measurements'", "'milliseconds'", "'liters'", "'cubic meter'", "'Wh'", "'kWh'", "'gCO2eq'", "'kgCO2eq'"
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
    // InternalKPIFormulaDSL.g:72:1: ruleKPIFormulaDSL returns [EObject current=null] : ( ( (lv_declarations_0_0= ruleDeclaration ) )+ ( (lv_computations_1_0= ruleComputation ) )+ ) ;
    public final EObject ruleKPIFormulaDSL() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_0_0 = null;

        EObject lv_computations_1_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:78:2: ( ( ( (lv_declarations_0_0= ruleDeclaration ) )+ ( (lv_computations_1_0= ruleComputation ) )+ ) )
            // InternalKPIFormulaDSL.g:79:2: ( ( (lv_declarations_0_0= ruleDeclaration ) )+ ( (lv_computations_1_0= ruleComputation ) )+ )
            {
            // InternalKPIFormulaDSL.g:79:2: ( ( (lv_declarations_0_0= ruleDeclaration ) )+ ( (lv_computations_1_0= ruleComputation ) )+ )
            // InternalKPIFormulaDSL.g:80:3: ( (lv_declarations_0_0= ruleDeclaration ) )+ ( (lv_computations_1_0= ruleComputation ) )+
            {
            // InternalKPIFormulaDSL.g:80:3: ( (lv_declarations_0_0= ruleDeclaration ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==14) ) {
                        alt1=1;
                    }


                }
                else if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
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
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalKPIFormulaDSL.g:99:3: ( (lv_computations_1_0= ruleComputation ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:100:4: (lv_computations_1_0= ruleComputation )
            	    {
            	    // InternalKPIFormulaDSL.g:100:4: (lv_computations_1_0= ruleComputation )
            	    // InternalKPIFormulaDSL.g:101:5: lv_computations_1_0= ruleComputation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getKPIFormulaDSLAccess().getComputationsComputationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
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
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "ruleKPIFormulaDSL"


    // $ANTLR start "entryRuleDeclaration"
    // InternalKPIFormulaDSL.g:122:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalKPIFormulaDSL.g:122:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalKPIFormulaDSL.g:123:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalKPIFormulaDSL.g:129:1: ruleDeclaration returns [EObject current=null] : ( (lv_declared_0_0= ruleDeclarable ) ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_declared_0_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:135:2: ( ( (lv_declared_0_0= ruleDeclarable ) ) )
            // InternalKPIFormulaDSL.g:136:2: ( (lv_declared_0_0= ruleDeclarable ) )
            {
            // InternalKPIFormulaDSL.g:136:2: ( (lv_declared_0_0= ruleDeclarable ) )
            // InternalKPIFormulaDSL.g:137:3: (lv_declared_0_0= ruleDeclarable )
            {
            // InternalKPIFormulaDSL.g:137:3: (lv_declared_0_0= ruleDeclarable )
            // InternalKPIFormulaDSL.g:138:4: lv_declared_0_0= ruleDeclarable
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
    // InternalKPIFormulaDSL.g:158:1: entryRuleComputation returns [EObject current=null] : iv_ruleComputation= ruleComputation EOF ;
    public final EObject entryRuleComputation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputation = null;


        try {
            // InternalKPIFormulaDSL.g:158:52: (iv_ruleComputation= ruleComputation EOF )
            // InternalKPIFormulaDSL.g:159:2: iv_ruleComputation= ruleComputation EOF
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
    // InternalKPIFormulaDSL.g:165:1: ruleComputation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_formula_2_1= ruleExpression | lv_formula_2_2= ruleCondition ) ) ) ) ;
    public final EObject ruleComputation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_formula_2_1 = null;

        EObject lv_formula_2_2 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:171:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_formula_2_1= ruleExpression | lv_formula_2_2= ruleCondition ) ) ) ) )
            // InternalKPIFormulaDSL.g:172:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_formula_2_1= ruleExpression | lv_formula_2_2= ruleCondition ) ) ) )
            {
            // InternalKPIFormulaDSL.g:172:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_formula_2_1= ruleExpression | lv_formula_2_2= ruleCondition ) ) ) )
            // InternalKPIFormulaDSL.g:173:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_formula_2_1= ruleExpression | lv_formula_2_2= ruleCondition ) ) )
            {
            // InternalKPIFormulaDSL.g:173:3: ( (otherlv_0= RULE_ID ) )
            // InternalKPIFormulaDSL.g:174:4: (otherlv_0= RULE_ID )
            {
            // InternalKPIFormulaDSL.g:174:4: (otherlv_0= RULE_ID )
            // InternalKPIFormulaDSL.g:175:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComputationRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getComputationAccess().getComputedComputableCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getComputationAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalKPIFormulaDSL.g:190:3: ( ( (lv_formula_2_1= ruleExpression | lv_formula_2_2= ruleCondition ) ) )
            // InternalKPIFormulaDSL.g:191:4: ( (lv_formula_2_1= ruleExpression | lv_formula_2_2= ruleCondition ) )
            {
            // InternalKPIFormulaDSL.g:191:4: ( (lv_formula_2_1= ruleExpression | lv_formula_2_2= ruleCondition ) )
            // InternalKPIFormulaDSL.g:192:5: (lv_formula_2_1= ruleExpression | lv_formula_2_2= ruleCondition )
            {
            // InternalKPIFormulaDSL.g:192:5: (lv_formula_2_1= ruleExpression | lv_formula_2_2= ruleCondition )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_FQN)||LA3_0==44||LA3_0==47||(LA3_0>=49 && LA3_0<=50)||LA3_0==52||(LA3_0>=54 && LA3_0<=58)) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalKPIFormulaDSL.g:193:6: lv_formula_2_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComputationAccess().getFormulaExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_formula_2_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComputationRule());
                      						}
                      						set(
                      							current,
                      							"formula",
                      							lv_formula_2_1,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:209:6: lv_formula_2_2= ruleCondition
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComputationAccess().getFormulaConditionParserRuleCall_2_0_1());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_formula_2_2=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComputationRule());
                      						}
                      						set(
                      							current,
                      							"formula",
                      							lv_formula_2_2,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Condition");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

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
    // InternalKPIFormulaDSL.g:231:1: entryRuleDeclarable returns [EObject current=null] : iv_ruleDeclarable= ruleDeclarable EOF ;
    public final EObject entryRuleDeclarable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarable = null;


        try {
            // InternalKPIFormulaDSL.g:231:51: (iv_ruleDeclarable= ruleDeclarable EOF )
            // InternalKPIFormulaDSL.g:232:2: iv_ruleDeclarable= ruleDeclarable EOF
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
    // InternalKPIFormulaDSL.g:238:1: ruleDeclarable returns [EObject current=null] : (this_KPI_0= ruleKPI | this_Metric_1= ruleMetric ) ;
    public final EObject ruleDeclarable() throws RecognitionException {
        EObject current = null;

        EObject this_KPI_0 = null;

        EObject this_Metric_1 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:244:2: ( (this_KPI_0= ruleKPI | this_Metric_1= ruleMetric ) )
            // InternalKPIFormulaDSL.g:245:2: (this_KPI_0= ruleKPI | this_Metric_1= ruleMetric )
            {
            // InternalKPIFormulaDSL.g:245:2: (this_KPI_0= ruleKPI | this_Metric_1= ruleMetric )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalKPIFormulaDSL.g:246:3: this_KPI_0= ruleKPI
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
                    // InternalKPIFormulaDSL.g:255:3: this_Metric_1= ruleMetric
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
    // InternalKPIFormulaDSL.g:267:1: entryRuleMetric returns [EObject current=null] : iv_ruleMetric= ruleMetric EOF ;
    public final EObject entryRuleMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetric = null;


        try {
            // InternalKPIFormulaDSL.g:267:47: (iv_ruleMetric= ruleMetric EOF )
            // InternalKPIFormulaDSL.g:268:2: iv_ruleMetric= ruleMetric EOF
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
    // InternalKPIFormulaDSL.g:274:1: ruleMetric returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleValueType ) ) ) ;
    public final EObject ruleMetric() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:280:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleValueType ) ) ) )
            // InternalKPIFormulaDSL.g:281:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleValueType ) ) )
            {
            // InternalKPIFormulaDSL.g:281:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleValueType ) ) )
            // InternalKPIFormulaDSL.g:282:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleValueType ) )
            {
            // InternalKPIFormulaDSL.g:282:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalKPIFormulaDSL.g:283:4: (lv_name_0_0= RULE_ID )
            {
            // InternalKPIFormulaDSL.g:283:4: (lv_name_0_0= RULE_ID )
            // InternalKPIFormulaDSL.g:284:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMetricAccess().getOfKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMetricAccess().getTypeKeyword_2());
              		
            }
            // InternalKPIFormulaDSL.g:308:3: ( (lv_type_3_0= ruleValueType ) )
            // InternalKPIFormulaDSL.g:309:4: (lv_type_3_0= ruleValueType )
            {
            // InternalKPIFormulaDSL.g:309:4: (lv_type_3_0= ruleValueType )
            // InternalKPIFormulaDSL.g:310:5: lv_type_3_0= ruleValueType
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
    // InternalKPIFormulaDSL.g:331:1: entryRuleKPI returns [EObject current=null] : iv_ruleKPI= ruleKPI EOF ;
    public final EObject entryRuleKPI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPI = null;


        try {
            // InternalKPIFormulaDSL.g:331:44: (iv_ruleKPI= ruleKPI EOF )
            // InternalKPIFormulaDSL.g:332:2: iv_ruleKPI= ruleKPI EOF
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
    // InternalKPIFormulaDSL.g:338:1: ruleKPI returns [EObject current=null] : (otherlv_0= 'KPI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (lv_type_4_0= ruleValueType ) ) ) ;
    public final EObject ruleKPI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:344:2: ( (otherlv_0= 'KPI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (lv_type_4_0= ruleValueType ) ) ) )
            // InternalKPIFormulaDSL.g:345:2: (otherlv_0= 'KPI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (lv_type_4_0= ruleValueType ) ) )
            {
            // InternalKPIFormulaDSL.g:345:2: (otherlv_0= 'KPI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (lv_type_4_0= ruleValueType ) ) )
            // InternalKPIFormulaDSL.g:346:3: otherlv_0= 'KPI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (lv_type_4_0= ruleValueType ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getKPIAccess().getKPIKeyword_0());
              		
            }
            // InternalKPIFormulaDSL.g:350:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalKPIFormulaDSL.g:351:4: (lv_name_1_0= RULE_ID )
            {
            // InternalKPIFormulaDSL.g:351:4: (lv_name_1_0= RULE_ID )
            // InternalKPIFormulaDSL.g:352:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getKPIAccess().getOfKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getKPIAccess().getTypeKeyword_3());
              		
            }
            // InternalKPIFormulaDSL.g:376:3: ( (lv_type_4_0= ruleValueType ) )
            // InternalKPIFormulaDSL.g:377:4: (lv_type_4_0= ruleValueType )
            {
            // InternalKPIFormulaDSL.g:377:4: (lv_type_4_0= ruleValueType )
            // InternalKPIFormulaDSL.g:378:5: lv_type_4_0= ruleValueType
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
    // InternalKPIFormulaDSL.g:399:1: entryRuleValueType returns [EObject current=null] : iv_ruleValueType= ruleValueType EOF ;
    public final EObject entryRuleValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType = null;


        try {
            // InternalKPIFormulaDSL.g:399:50: (iv_ruleValueType= ruleValueType EOF )
            // InternalKPIFormulaDSL.g:400:2: iv_ruleValueType= ruleValueType EOF
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
    // InternalKPIFormulaDSL.g:406:1: ruleValueType returns [EObject current=null] : (this_IntegerValue_0= ruleIntegerValue | this_RealValue_1= ruleRealValue | this_TextualValue_2= ruleTextualValue | this_BooleanValue_3= ruleBooleanValue | this_EnumerationValue_4= ruleEnumerationValue | this_AggregationValue_5= ruleAggregationValue | this_DriftValue_6= ruleDriftValue | this_UnitValue_7= ruleUnitValue ) ;
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
            // InternalKPIFormulaDSL.g:412:2: ( (this_IntegerValue_0= ruleIntegerValue | this_RealValue_1= ruleRealValue | this_TextualValue_2= ruleTextualValue | this_BooleanValue_3= ruleBooleanValue | this_EnumerationValue_4= ruleEnumerationValue | this_AggregationValue_5= ruleAggregationValue | this_DriftValue_6= ruleDriftValue | this_UnitValue_7= ruleUnitValue ) )
            // InternalKPIFormulaDSL.g:413:2: (this_IntegerValue_0= ruleIntegerValue | this_RealValue_1= ruleRealValue | this_TextualValue_2= ruleTextualValue | this_BooleanValue_3= ruleBooleanValue | this_EnumerationValue_4= ruleEnumerationValue | this_AggregationValue_5= ruleAggregationValue | this_DriftValue_6= ruleDriftValue | this_UnitValue_7= ruleUnitValue )
            {
            // InternalKPIFormulaDSL.g:413:2: (this_IntegerValue_0= ruleIntegerValue | this_RealValue_1= ruleRealValue | this_TextualValue_2= ruleTextualValue | this_BooleanValue_3= ruleBooleanValue | this_EnumerationValue_4= ruleEnumerationValue | this_AggregationValue_5= ruleAggregationValue | this_DriftValue_6= ruleDriftValue | this_UnitValue_7= ruleUnitValue )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            case 20:
                {
                alt5=4;
                }
                break;
            case 21:
                {
                alt5=5;
                }
                break;
            case 23:
                {
                alt5=6;
                }
                break;
            case 25:
                {
                alt5=7;
                }
                break;
            case 59:
            case 60:
            case 61:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
                {
                alt5=8;
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
                    // InternalKPIFormulaDSL.g:414:3: this_IntegerValue_0= ruleIntegerValue
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
                    // InternalKPIFormulaDSL.g:423:3: this_RealValue_1= ruleRealValue
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
                    // InternalKPIFormulaDSL.g:432:3: this_TextualValue_2= ruleTextualValue
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
                    // InternalKPIFormulaDSL.g:441:3: this_BooleanValue_3= ruleBooleanValue
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
                    // InternalKPIFormulaDSL.g:450:3: this_EnumerationValue_4= ruleEnumerationValue
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
                    // InternalKPIFormulaDSL.g:459:3: this_AggregationValue_5= ruleAggregationValue
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
                    // InternalKPIFormulaDSL.g:468:3: this_DriftValue_6= ruleDriftValue
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
                    // InternalKPIFormulaDSL.g:477:3: this_UnitValue_7= ruleUnitValue
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
    // InternalKPIFormulaDSL.g:489:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // InternalKPIFormulaDSL.g:489:53: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // InternalKPIFormulaDSL.g:490:2: iv_ruleIntegerValue= ruleIntegerValue EOF
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
    // InternalKPIFormulaDSL.g:496:1: ruleIntegerValue returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:502:2: ( ( () otherlv_1= 'int' ) )
            // InternalKPIFormulaDSL.g:503:2: ( () otherlv_1= 'int' )
            {
            // InternalKPIFormulaDSL.g:503:2: ( () otherlv_1= 'int' )
            // InternalKPIFormulaDSL.g:504:3: () otherlv_1= 'int'
            {
            // InternalKPIFormulaDSL.g:504:3: ()
            // InternalKPIFormulaDSL.g:505:4: 
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
    // InternalKPIFormulaDSL.g:519:1: entryRuleRealValue returns [EObject current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final EObject entryRuleRealValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealValue = null;


        try {
            // InternalKPIFormulaDSL.g:519:50: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalKPIFormulaDSL.g:520:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalKPIFormulaDSL.g:526:1: ruleRealValue returns [EObject current=null] : ( () otherlv_1= 'real' ) ;
    public final EObject ruleRealValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:532:2: ( ( () otherlv_1= 'real' ) )
            // InternalKPIFormulaDSL.g:533:2: ( () otherlv_1= 'real' )
            {
            // InternalKPIFormulaDSL.g:533:2: ( () otherlv_1= 'real' )
            // InternalKPIFormulaDSL.g:534:3: () otherlv_1= 'real'
            {
            // InternalKPIFormulaDSL.g:534:3: ()
            // InternalKPIFormulaDSL.g:535:4: 
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
    // InternalKPIFormulaDSL.g:549:1: entryRuleTextualValue returns [EObject current=null] : iv_ruleTextualValue= ruleTextualValue EOF ;
    public final EObject entryRuleTextualValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextualValue = null;


        try {
            // InternalKPIFormulaDSL.g:549:53: (iv_ruleTextualValue= ruleTextualValue EOF )
            // InternalKPIFormulaDSL.g:550:2: iv_ruleTextualValue= ruleTextualValue EOF
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
    // InternalKPIFormulaDSL.g:556:1: ruleTextualValue returns [EObject current=null] : ( () otherlv_1= 'text' ) ;
    public final EObject ruleTextualValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:562:2: ( ( () otherlv_1= 'text' ) )
            // InternalKPIFormulaDSL.g:563:2: ( () otherlv_1= 'text' )
            {
            // InternalKPIFormulaDSL.g:563:2: ( () otherlv_1= 'text' )
            // InternalKPIFormulaDSL.g:564:3: () otherlv_1= 'text'
            {
            // InternalKPIFormulaDSL.g:564:3: ()
            // InternalKPIFormulaDSL.g:565:4: 
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
    // InternalKPIFormulaDSL.g:579:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalKPIFormulaDSL.g:579:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalKPIFormulaDSL.g:580:2: iv_ruleBooleanValue= ruleBooleanValue EOF
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
    // InternalKPIFormulaDSL.g:586:1: ruleBooleanValue returns [EObject current=null] : ( () otherlv_1= 'bool' ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:592:2: ( ( () otherlv_1= 'bool' ) )
            // InternalKPIFormulaDSL.g:593:2: ( () otherlv_1= 'bool' )
            {
            // InternalKPIFormulaDSL.g:593:2: ( () otherlv_1= 'bool' )
            // InternalKPIFormulaDSL.g:594:3: () otherlv_1= 'bool'
            {
            // InternalKPIFormulaDSL.g:594:3: ()
            // InternalKPIFormulaDSL.g:595:4: 
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
    // InternalKPIFormulaDSL.g:609:1: entryRuleEnumerationValue returns [EObject current=null] : iv_ruleEnumerationValue= ruleEnumerationValue EOF ;
    public final EObject entryRuleEnumerationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationValue = null;


        try {
            // InternalKPIFormulaDSL.g:609:57: (iv_ruleEnumerationValue= ruleEnumerationValue EOF )
            // InternalKPIFormulaDSL.g:610:2: iv_ruleEnumerationValue= ruleEnumerationValue EOF
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
    // InternalKPIFormulaDSL.g:616:1: ruleEnumerationValue returns [EObject current=null] : (otherlv_0= '{' ( (lv_literals_1_0= ruleEnumerationLiteral ) )+ otherlv_2= '}' ) ;
    public final EObject ruleEnumerationValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_literals_1_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:622:2: ( (otherlv_0= '{' ( (lv_literals_1_0= ruleEnumerationLiteral ) )+ otherlv_2= '}' ) )
            // InternalKPIFormulaDSL.g:623:2: (otherlv_0= '{' ( (lv_literals_1_0= ruleEnumerationLiteral ) )+ otherlv_2= '}' )
            {
            // InternalKPIFormulaDSL.g:623:2: (otherlv_0= '{' ( (lv_literals_1_0= ruleEnumerationLiteral ) )+ otherlv_2= '}' )
            // InternalKPIFormulaDSL.g:624:3: otherlv_0= '{' ( (lv_literals_1_0= ruleEnumerationLiteral ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumerationValueAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalKPIFormulaDSL.g:628:3: ( (lv_literals_1_0= ruleEnumerationLiteral ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:629:4: (lv_literals_1_0= ruleEnumerationLiteral )
            	    {
            	    // InternalKPIFormulaDSL.g:629:4: (lv_literals_1_0= ruleEnumerationLiteral )
            	    // InternalKPIFormulaDSL.g:630:5: lv_literals_1_0= ruleEnumerationLiteral
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnumerationValueAccess().getLiteralsEnumerationLiteralParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
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
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // InternalKPIFormulaDSL.g:655:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalKPIFormulaDSL.g:655:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalKPIFormulaDSL.g:656:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
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
    // InternalKPIFormulaDSL.g:662:1: ruleEnumerationLiteral returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:668:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalKPIFormulaDSL.g:669:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalKPIFormulaDSL.g:669:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalKPIFormulaDSL.g:670:3: (lv_name_0_0= RULE_ID )
            {
            // InternalKPIFormulaDSL.g:670:3: (lv_name_0_0= RULE_ID )
            // InternalKPIFormulaDSL.g:671:4: lv_name_0_0= RULE_ID
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
    // InternalKPIFormulaDSL.g:690:1: entryRuleUnitValue returns [EObject current=null] : iv_ruleUnitValue= ruleUnitValue EOF ;
    public final EObject entryRuleUnitValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitValue = null;


        try {
            // InternalKPIFormulaDSL.g:690:50: (iv_ruleUnitValue= ruleUnitValue EOF )
            // InternalKPIFormulaDSL.g:691:2: iv_ruleUnitValue= ruleUnitValue EOF
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
    // InternalKPIFormulaDSL.g:697:1: ruleUnitValue returns [EObject current=null] : ( (lv_unit_0_0= ruleValueUnit ) ) ;
    public final EObject ruleUnitValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_unit_0_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:703:2: ( ( (lv_unit_0_0= ruleValueUnit ) ) )
            // InternalKPIFormulaDSL.g:704:2: ( (lv_unit_0_0= ruleValueUnit ) )
            {
            // InternalKPIFormulaDSL.g:704:2: ( (lv_unit_0_0= ruleValueUnit ) )
            // InternalKPIFormulaDSL.g:705:3: (lv_unit_0_0= ruleValueUnit )
            {
            // InternalKPIFormulaDSL.g:705:3: (lv_unit_0_0= ruleValueUnit )
            // InternalKPIFormulaDSL.g:706:4: lv_unit_0_0= ruleValueUnit
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
    // InternalKPIFormulaDSL.g:726:1: entryRuleAggregationValue returns [EObject current=null] : iv_ruleAggregationValue= ruleAggregationValue EOF ;
    public final EObject entryRuleAggregationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregationValue = null;


        try {
            // InternalKPIFormulaDSL.g:726:57: (iv_ruleAggregationValue= ruleAggregationValue EOF )
            // InternalKPIFormulaDSL.g:727:2: iv_ruleAggregationValue= ruleAggregationValue EOF
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
    // InternalKPIFormulaDSL.g:733:1: ruleAggregationValue returns [EObject current=null] : (otherlv_0= 'aggregate' ( (lv_operation_1_0= ruleOperation ) ) otherlv_2= 'for' ( (lv_window_3_0= RULE_INT ) ) ( (lv_windowUnit_4_0= ruleWindowUnit ) ) ) ;
    public final EObject ruleAggregationValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_window_3_0=null;
        EObject lv_operation_1_0 = null;

        Enumerator lv_windowUnit_4_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:739:2: ( (otherlv_0= 'aggregate' ( (lv_operation_1_0= ruleOperation ) ) otherlv_2= 'for' ( (lv_window_3_0= RULE_INT ) ) ( (lv_windowUnit_4_0= ruleWindowUnit ) ) ) )
            // InternalKPIFormulaDSL.g:740:2: (otherlv_0= 'aggregate' ( (lv_operation_1_0= ruleOperation ) ) otherlv_2= 'for' ( (lv_window_3_0= RULE_INT ) ) ( (lv_windowUnit_4_0= ruleWindowUnit ) ) )
            {
            // InternalKPIFormulaDSL.g:740:2: (otherlv_0= 'aggregate' ( (lv_operation_1_0= ruleOperation ) ) otherlv_2= 'for' ( (lv_window_3_0= RULE_INT ) ) ( (lv_windowUnit_4_0= ruleWindowUnit ) ) )
            // InternalKPIFormulaDSL.g:741:3: otherlv_0= 'aggregate' ( (lv_operation_1_0= ruleOperation ) ) otherlv_2= 'for' ( (lv_window_3_0= RULE_INT ) ) ( (lv_windowUnit_4_0= ruleWindowUnit ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAggregationValueAccess().getAggregateKeyword_0());
              		
            }
            // InternalKPIFormulaDSL.g:745:3: ( (lv_operation_1_0= ruleOperation ) )
            // InternalKPIFormulaDSL.g:746:4: (lv_operation_1_0= ruleOperation )
            {
            // InternalKPIFormulaDSL.g:746:4: (lv_operation_1_0= ruleOperation )
            // InternalKPIFormulaDSL.g:747:5: lv_operation_1_0= ruleOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAggregationValueAccess().getOperationOperationParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_2=(Token)match(input,24,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAggregationValueAccess().getForKeyword_2());
              		
            }
            // InternalKPIFormulaDSL.g:768:3: ( (lv_window_3_0= RULE_INT ) )
            // InternalKPIFormulaDSL.g:769:4: (lv_window_3_0= RULE_INT )
            {
            // InternalKPIFormulaDSL.g:769:4: (lv_window_3_0= RULE_INT )
            // InternalKPIFormulaDSL.g:770:5: lv_window_3_0= RULE_INT
            {
            lv_window_3_0=(Token)match(input,RULE_INT,FOLLOW_15); if (state.failed) return current;
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

            // InternalKPIFormulaDSL.g:786:3: ( (lv_windowUnit_4_0= ruleWindowUnit ) )
            // InternalKPIFormulaDSL.g:787:4: (lv_windowUnit_4_0= ruleWindowUnit )
            {
            // InternalKPIFormulaDSL.g:787:4: (lv_windowUnit_4_0= ruleWindowUnit )
            // InternalKPIFormulaDSL.g:788:5: lv_windowUnit_4_0= ruleWindowUnit
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
    // InternalKPIFormulaDSL.g:809:1: entryRuleDriftValue returns [EObject current=null] : iv_ruleDriftValue= ruleDriftValue EOF ;
    public final EObject entryRuleDriftValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDriftValue = null;


        try {
            // InternalKPIFormulaDSL.g:809:51: (iv_ruleDriftValue= ruleDriftValue EOF )
            // InternalKPIFormulaDSL.g:810:2: iv_ruleDriftValue= ruleDriftValue EOF
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
    // InternalKPIFormulaDSL.g:816:1: ruleDriftValue returns [EObject current=null] : (otherlv_0= 'drift' otherlv_1= 'of' ( (lv_operation_2_0= ruleOperation ) ) otherlv_3= 'for' ( (lv_window_4_0= RULE_INT ) ) ( (lv_windowUnit_5_0= ruleWindowUnit ) ) ) ;
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
            // InternalKPIFormulaDSL.g:822:2: ( (otherlv_0= 'drift' otherlv_1= 'of' ( (lv_operation_2_0= ruleOperation ) ) otherlv_3= 'for' ( (lv_window_4_0= RULE_INT ) ) ( (lv_windowUnit_5_0= ruleWindowUnit ) ) ) )
            // InternalKPIFormulaDSL.g:823:2: (otherlv_0= 'drift' otherlv_1= 'of' ( (lv_operation_2_0= ruleOperation ) ) otherlv_3= 'for' ( (lv_window_4_0= RULE_INT ) ) ( (lv_windowUnit_5_0= ruleWindowUnit ) ) )
            {
            // InternalKPIFormulaDSL.g:823:2: (otherlv_0= 'drift' otherlv_1= 'of' ( (lv_operation_2_0= ruleOperation ) ) otherlv_3= 'for' ( (lv_window_4_0= RULE_INT ) ) ( (lv_windowUnit_5_0= ruleWindowUnit ) ) )
            // InternalKPIFormulaDSL.g:824:3: otherlv_0= 'drift' otherlv_1= 'of' ( (lv_operation_2_0= ruleOperation ) ) otherlv_3= 'for' ( (lv_window_4_0= RULE_INT ) ) ( (lv_windowUnit_5_0= ruleWindowUnit ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDriftValueAccess().getDriftKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDriftValueAccess().getOfKeyword_1());
              		
            }
            // InternalKPIFormulaDSL.g:832:3: ( (lv_operation_2_0= ruleOperation ) )
            // InternalKPIFormulaDSL.g:833:4: (lv_operation_2_0= ruleOperation )
            {
            // InternalKPIFormulaDSL.g:833:4: (lv_operation_2_0= ruleOperation )
            // InternalKPIFormulaDSL.g:834:5: lv_operation_2_0= ruleOperation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDriftValueAccess().getOperationOperationParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_3=(Token)match(input,24,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDriftValueAccess().getForKeyword_3());
              		
            }
            // InternalKPIFormulaDSL.g:855:3: ( (lv_window_4_0= RULE_INT ) )
            // InternalKPIFormulaDSL.g:856:4: (lv_window_4_0= RULE_INT )
            {
            // InternalKPIFormulaDSL.g:856:4: (lv_window_4_0= RULE_INT )
            // InternalKPIFormulaDSL.g:857:5: lv_window_4_0= RULE_INT
            {
            lv_window_4_0=(Token)match(input,RULE_INT,FOLLOW_15); if (state.failed) return current;
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

            // InternalKPIFormulaDSL.g:873:3: ( (lv_windowUnit_5_0= ruleWindowUnit ) )
            // InternalKPIFormulaDSL.g:874:4: (lv_windowUnit_5_0= ruleWindowUnit )
            {
            // InternalKPIFormulaDSL.g:874:4: (lv_windowUnit_5_0= ruleWindowUnit )
            // InternalKPIFormulaDSL.g:875:5: lv_windowUnit_5_0= ruleWindowUnit
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
    // InternalKPIFormulaDSL.g:896:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalKPIFormulaDSL.g:896:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalKPIFormulaDSL.g:897:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalKPIFormulaDSL.g:903:1: ruleOperation returns [EObject current=null] : (this_Minimum_0= ruleMinimum | this_Maximum_1= ruleMaximum | this_Average_2= ruleAverage | this_Median_3= ruleMedian | this_StandardDeviation_4= ruleStandardDeviation ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Minimum_0 = null;

        EObject this_Maximum_1 = null;

        EObject this_Average_2 = null;

        EObject this_Median_3 = null;

        EObject this_StandardDeviation_4 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:909:2: ( (this_Minimum_0= ruleMinimum | this_Maximum_1= ruleMaximum | this_Average_2= ruleAverage | this_Median_3= ruleMedian | this_StandardDeviation_4= ruleStandardDeviation ) )
            // InternalKPIFormulaDSL.g:910:2: (this_Minimum_0= ruleMinimum | this_Maximum_1= ruleMaximum | this_Average_2= ruleAverage | this_Median_3= ruleMedian | this_StandardDeviation_4= ruleStandardDeviation )
            {
            // InternalKPIFormulaDSL.g:910:2: (this_Minimum_0= ruleMinimum | this_Maximum_1= ruleMaximum | this_Average_2= ruleAverage | this_Median_3= ruleMedian | this_StandardDeviation_4= ruleStandardDeviation )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            case 29:
                {
                alt7=4;
                }
                break;
            case 30:
                {
                alt7=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalKPIFormulaDSL.g:911:3: this_Minimum_0= ruleMinimum
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
                    // InternalKPIFormulaDSL.g:920:3: this_Maximum_1= ruleMaximum
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
                    // InternalKPIFormulaDSL.g:929:3: this_Average_2= ruleAverage
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
                    // InternalKPIFormulaDSL.g:938:3: this_Median_3= ruleMedian
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
                    // InternalKPIFormulaDSL.g:947:3: this_StandardDeviation_4= ruleStandardDeviation
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
    // InternalKPIFormulaDSL.g:959:1: entryRuleMinimum returns [EObject current=null] : iv_ruleMinimum= ruleMinimum EOF ;
    public final EObject entryRuleMinimum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimum = null;


        try {
            // InternalKPIFormulaDSL.g:959:48: (iv_ruleMinimum= ruleMinimum EOF )
            // InternalKPIFormulaDSL.g:960:2: iv_ruleMinimum= ruleMinimum EOF
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
    // InternalKPIFormulaDSL.g:966:1: ruleMinimum returns [EObject current=null] : ( () otherlv_1= 'Minimum' ) ;
    public final EObject ruleMinimum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:972:2: ( ( () otherlv_1= 'Minimum' ) )
            // InternalKPIFormulaDSL.g:973:2: ( () otherlv_1= 'Minimum' )
            {
            // InternalKPIFormulaDSL.g:973:2: ( () otherlv_1= 'Minimum' )
            // InternalKPIFormulaDSL.g:974:3: () otherlv_1= 'Minimum'
            {
            // InternalKPIFormulaDSL.g:974:3: ()
            // InternalKPIFormulaDSL.g:975:4: 
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
    // InternalKPIFormulaDSL.g:989:1: entryRuleMaximum returns [EObject current=null] : iv_ruleMaximum= ruleMaximum EOF ;
    public final EObject entryRuleMaximum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximum = null;


        try {
            // InternalKPIFormulaDSL.g:989:48: (iv_ruleMaximum= ruleMaximum EOF )
            // InternalKPIFormulaDSL.g:990:2: iv_ruleMaximum= ruleMaximum EOF
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
    // InternalKPIFormulaDSL.g:996:1: ruleMaximum returns [EObject current=null] : ( () otherlv_1= 'Maximum' ) ;
    public final EObject ruleMaximum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1002:2: ( ( () otherlv_1= 'Maximum' ) )
            // InternalKPIFormulaDSL.g:1003:2: ( () otherlv_1= 'Maximum' )
            {
            // InternalKPIFormulaDSL.g:1003:2: ( () otherlv_1= 'Maximum' )
            // InternalKPIFormulaDSL.g:1004:3: () otherlv_1= 'Maximum'
            {
            // InternalKPIFormulaDSL.g:1004:3: ()
            // InternalKPIFormulaDSL.g:1005:4: 
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
    // InternalKPIFormulaDSL.g:1019:1: entryRuleAverage returns [EObject current=null] : iv_ruleAverage= ruleAverage EOF ;
    public final EObject entryRuleAverage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAverage = null;


        try {
            // InternalKPIFormulaDSL.g:1019:48: (iv_ruleAverage= ruleAverage EOF )
            // InternalKPIFormulaDSL.g:1020:2: iv_ruleAverage= ruleAverage EOF
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
    // InternalKPIFormulaDSL.g:1026:1: ruleAverage returns [EObject current=null] : ( () otherlv_1= 'Average' ) ;
    public final EObject ruleAverage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1032:2: ( ( () otherlv_1= 'Average' ) )
            // InternalKPIFormulaDSL.g:1033:2: ( () otherlv_1= 'Average' )
            {
            // InternalKPIFormulaDSL.g:1033:2: ( () otherlv_1= 'Average' )
            // InternalKPIFormulaDSL.g:1034:3: () otherlv_1= 'Average'
            {
            // InternalKPIFormulaDSL.g:1034:3: ()
            // InternalKPIFormulaDSL.g:1035:4: 
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
    // InternalKPIFormulaDSL.g:1049:1: entryRuleMedian returns [EObject current=null] : iv_ruleMedian= ruleMedian EOF ;
    public final EObject entryRuleMedian() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMedian = null;


        try {
            // InternalKPIFormulaDSL.g:1049:47: (iv_ruleMedian= ruleMedian EOF )
            // InternalKPIFormulaDSL.g:1050:2: iv_ruleMedian= ruleMedian EOF
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
    // InternalKPIFormulaDSL.g:1056:1: ruleMedian returns [EObject current=null] : ( () otherlv_1= 'Median' ) ;
    public final EObject ruleMedian() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1062:2: ( ( () otherlv_1= 'Median' ) )
            // InternalKPIFormulaDSL.g:1063:2: ( () otherlv_1= 'Median' )
            {
            // InternalKPIFormulaDSL.g:1063:2: ( () otherlv_1= 'Median' )
            // InternalKPIFormulaDSL.g:1064:3: () otherlv_1= 'Median'
            {
            // InternalKPIFormulaDSL.g:1064:3: ()
            // InternalKPIFormulaDSL.g:1065:4: 
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
    // InternalKPIFormulaDSL.g:1079:1: entryRuleStandardDeviation returns [EObject current=null] : iv_ruleStandardDeviation= ruleStandardDeviation EOF ;
    public final EObject entryRuleStandardDeviation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardDeviation = null;


        try {
            // InternalKPIFormulaDSL.g:1079:58: (iv_ruleStandardDeviation= ruleStandardDeviation EOF )
            // InternalKPIFormulaDSL.g:1080:2: iv_ruleStandardDeviation= ruleStandardDeviation EOF
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
    // InternalKPIFormulaDSL.g:1086:1: ruleStandardDeviation returns [EObject current=null] : ( () otherlv_1= 'Standard' otherlv_2= 'deviation' ) ;
    public final EObject ruleStandardDeviation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1092:2: ( ( () otherlv_1= 'Standard' otherlv_2= 'deviation' ) )
            // InternalKPIFormulaDSL.g:1093:2: ( () otherlv_1= 'Standard' otherlv_2= 'deviation' )
            {
            // InternalKPIFormulaDSL.g:1093:2: ( () otherlv_1= 'Standard' otherlv_2= 'deviation' )
            // InternalKPIFormulaDSL.g:1094:3: () otherlv_1= 'Standard' otherlv_2= 'deviation'
            {
            // InternalKPIFormulaDSL.g:1094:3: ()
            // InternalKPIFormulaDSL.g:1095:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStandardDeviationAccess().getStandardDeviationAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_16); if (state.failed) return current;
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


    // $ANTLR start "entryRuleCondition"
    // InternalKPIFormulaDSL.g:1113:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalKPIFormulaDSL.g:1113:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalKPIFormulaDSL.g:1114:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalKPIFormulaDSL.g:1120:1: ruleCondition returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_conditions_1_0= ruleExpression ) ) otherlv_2= '->' ( (lv_results_3_0= ruleExpression ) ) otherlv_4= ';' )+ ( ( 'otherwise' )=>otherlv_5= 'otherwise' ) otherlv_6= '->' ( (lv_results_7_0= ruleExpression ) ) otherlv_8= '}' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_conditions_1_0 = null;

        EObject lv_results_3_0 = null;

        EObject lv_results_7_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1126:2: ( (otherlv_0= '{' ( ( (lv_conditions_1_0= ruleExpression ) ) otherlv_2= '->' ( (lv_results_3_0= ruleExpression ) ) otherlv_4= ';' )+ ( ( 'otherwise' )=>otherlv_5= 'otherwise' ) otherlv_6= '->' ( (lv_results_7_0= ruleExpression ) ) otherlv_8= '}' ) )
            // InternalKPIFormulaDSL.g:1127:2: (otherlv_0= '{' ( ( (lv_conditions_1_0= ruleExpression ) ) otherlv_2= '->' ( (lv_results_3_0= ruleExpression ) ) otherlv_4= ';' )+ ( ( 'otherwise' )=>otherlv_5= 'otherwise' ) otherlv_6= '->' ( (lv_results_7_0= ruleExpression ) ) otherlv_8= '}' )
            {
            // InternalKPIFormulaDSL.g:1127:2: (otherlv_0= '{' ( ( (lv_conditions_1_0= ruleExpression ) ) otherlv_2= '->' ( (lv_results_3_0= ruleExpression ) ) otherlv_4= ';' )+ ( ( 'otherwise' )=>otherlv_5= 'otherwise' ) otherlv_6= '->' ( (lv_results_7_0= ruleExpression ) ) otherlv_8= '}' )
            // InternalKPIFormulaDSL.g:1128:3: otherlv_0= '{' ( ( (lv_conditions_1_0= ruleExpression ) ) otherlv_2= '->' ( (lv_results_3_0= ruleExpression ) ) otherlv_4= ';' )+ ( ( 'otherwise' )=>otherlv_5= 'otherwise' ) otherlv_6= '->' ( (lv_results_7_0= ruleExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalKPIFormulaDSL.g:1132:3: ( ( (lv_conditions_1_0= ruleExpression ) ) otherlv_2= '->' ( (lv_results_3_0= ruleExpression ) ) otherlv_4= ';' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_FQN)||LA8_0==44||LA8_0==47||(LA8_0>=49 && LA8_0<=50)||LA8_0==52||(LA8_0>=54 && LA8_0<=58)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:1133:4: ( (lv_conditions_1_0= ruleExpression ) ) otherlv_2= '->' ( (lv_results_3_0= ruleExpression ) ) otherlv_4= ';'
            	    {
            	    // InternalKPIFormulaDSL.g:1133:4: ( (lv_conditions_1_0= ruleExpression ) )
            	    // InternalKPIFormulaDSL.g:1134:5: (lv_conditions_1_0= ruleExpression )
            	    {
            	    // InternalKPIFormulaDSL.g:1134:5: (lv_conditions_1_0= ruleExpression )
            	    // InternalKPIFormulaDSL.g:1135:6: lv_conditions_1_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConditionAccess().getConditionsExpressionParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_conditions_1_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConditionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"conditions",
            	      							lv_conditions_1_0,
            	      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
            	      			
            	    }
            	    // InternalKPIFormulaDSL.g:1156:4: ( (lv_results_3_0= ruleExpression ) )
            	    // InternalKPIFormulaDSL.g:1157:5: (lv_results_3_0= ruleExpression )
            	    {
            	    // InternalKPIFormulaDSL.g:1157:5: (lv_results_3_0= ruleExpression )
            	    // InternalKPIFormulaDSL.g:1158:6: lv_results_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConditionAccess().getResultsExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_results_3_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConditionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"results",
            	      							lv_results_3_0,
            	      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,33,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getSemicolonKeyword_1_3());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // InternalKPIFormulaDSL.g:1180:3: ( ( 'otherwise' )=>otherlv_5= 'otherwise' )
            // InternalKPIFormulaDSL.g:1181:4: ( 'otherwise' )=>otherlv_5= 'otherwise'
            {
            otherlv_5=(Token)match(input,34,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getOtherwiseKeyword_2());
              			
            }

            }

            otherlv_6=(Token)match(input,32,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getHyphenMinusGreaterThanSignKeyword_3());
              		
            }
            // InternalKPIFormulaDSL.g:1191:3: ( (lv_results_7_0= ruleExpression ) )
            // InternalKPIFormulaDSL.g:1192:4: (lv_results_7_0= ruleExpression )
            {
            // InternalKPIFormulaDSL.g:1192:4: (lv_results_7_0= ruleExpression )
            // InternalKPIFormulaDSL.g:1193:5: lv_results_7_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionAccess().getResultsExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_results_7_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionRule());
              					}
              					add(
              						current,
              						"results",
              						lv_results_7_0,
              						"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_5());
              		
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
    // InternalKPIFormulaDSL.g:1218:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalKPIFormulaDSL.g:1218:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalKPIFormulaDSL.g:1219:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalKPIFormulaDSL.g:1225:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1231:2: (this_Or_0= ruleOr )
            // InternalKPIFormulaDSL.g:1232:2: this_Or_0= ruleOr
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
    // InternalKPIFormulaDSL.g:1243:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalKPIFormulaDSL.g:1243:43: (iv_ruleOr= ruleOr EOF )
            // InternalKPIFormulaDSL.g:1244:2: iv_ruleOr= ruleOr EOF
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
    // InternalKPIFormulaDSL.g:1250:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1256:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalKPIFormulaDSL.g:1257:2: (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalKPIFormulaDSL.g:1257:2: (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalKPIFormulaDSL.g:1258:3: this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_22);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKPIFormulaDSL.g:1266:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:1267:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalKPIFormulaDSL.g:1267:4: ()
            	    // InternalKPIFormulaDSL.g:1268:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,35,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1());
            	      			
            	    }
            	    // InternalKPIFormulaDSL.g:1278:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalKPIFormulaDSL.g:1279:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalKPIFormulaDSL.g:1279:5: (lv_right_3_0= ruleAnd )
            	    // InternalKPIFormulaDSL.g:1280:6: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalKPIFormulaDSL.g:1302:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalKPIFormulaDSL.g:1302:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalKPIFormulaDSL.g:1303:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalKPIFormulaDSL.g:1309:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1315:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalKPIFormulaDSL.g:1316:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalKPIFormulaDSL.g:1316:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalKPIFormulaDSL.g:1317:3: this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_23);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKPIFormulaDSL.g:1325:3: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:1326:4: () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalKPIFormulaDSL.g:1326:4: ()
            	    // InternalKPIFormulaDSL.g:1327:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1());
            	      			
            	    }
            	    // InternalKPIFormulaDSL.g:1337:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalKPIFormulaDSL.g:1338:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalKPIFormulaDSL.g:1338:5: (lv_right_3_0= ruleEquality )
            	    // InternalKPIFormulaDSL.g:1339:6: lv_right_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_23);
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
            	    break loop10;
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
    // InternalKPIFormulaDSL.g:1361:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalKPIFormulaDSL.g:1361:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalKPIFormulaDSL.g:1362:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalKPIFormulaDSL.g:1368:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1374:2: ( (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )* ) )
            // InternalKPIFormulaDSL.g:1375:2: (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )* )
            {
            // InternalKPIFormulaDSL.g:1375:2: (this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )* )
            // InternalKPIFormulaDSL.g:1376:3: this_Comparison_0= ruleComparison ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKPIFormulaDSL.g:1384:3: ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=37 && LA12_0<=38)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:1385:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) ) ( (lv_right_5_0= ruleComparison ) )
            	    {
            	    // InternalKPIFormulaDSL.g:1385:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==37) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==38) ) {
            	        alt11=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalKPIFormulaDSL.g:1386:5: ( () otherlv_2= '==' )
            	            {
            	            // InternalKPIFormulaDSL.g:1386:5: ( () otherlv_2= '==' )
            	            // InternalKPIFormulaDSL.g:1387:6: () otherlv_2= '=='
            	            {
            	            // InternalKPIFormulaDSL.g:1387:6: ()
            	            // InternalKPIFormulaDSL.g:1388:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,37,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalKPIFormulaDSL.g:1400:5: ( () otherlv_4= '!=' )
            	            {
            	            // InternalKPIFormulaDSL.g:1400:5: ( () otherlv_4= '!=' )
            	            // InternalKPIFormulaDSL.g:1401:6: () otherlv_4= '!='
            	            {
            	            // InternalKPIFormulaDSL.g:1401:6: ()
            	            // InternalKPIFormulaDSL.g:1402:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getEqualityAccess().getInequalityLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,38,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalKPIFormulaDSL.g:1414:4: ( (lv_right_5_0= ruleComparison ) )
            	    // InternalKPIFormulaDSL.g:1415:5: (lv_right_5_0= ruleComparison )
            	    {
            	    // InternalKPIFormulaDSL.g:1415:5: (lv_right_5_0= ruleComparison )
            	    // InternalKPIFormulaDSL.g:1416:6: lv_right_5_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_24);
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
            	    break loop12;
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
    // InternalKPIFormulaDSL.g:1438:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalKPIFormulaDSL.g:1438:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalKPIFormulaDSL.g:1439:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalKPIFormulaDSL.g:1445:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= rulePlusOrMinus ) ) )* ) ;
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
            // InternalKPIFormulaDSL.g:1451:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= rulePlusOrMinus ) ) )* ) )
            // InternalKPIFormulaDSL.g:1452:2: (this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= rulePlusOrMinus ) ) )* )
            {
            // InternalKPIFormulaDSL.g:1452:2: (this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= rulePlusOrMinus ) ) )* )
            // InternalKPIFormulaDSL.g:1453:3: this_PlusOrMinus_0= rulePlusOrMinus ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_25);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PlusOrMinus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKPIFormulaDSL.g:1461:3: ( ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= rulePlusOrMinus ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=39 && LA14_0<=42)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:1462:4: ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) ) ( (lv_right_9_0= rulePlusOrMinus ) )
            	    {
            	    // InternalKPIFormulaDSL.g:1462:4: ( ( () otherlv_2= '>=' ) | ( () otherlv_4= '<=' ) | ( () otherlv_6= '>' ) | ( () otherlv_8= '<' ) )
            	    int alt13=4;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt13=3;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt13=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt13) {
            	        case 1 :
            	            // InternalKPIFormulaDSL.g:1463:5: ( () otherlv_2= '>=' )
            	            {
            	            // InternalKPIFormulaDSL.g:1463:5: ( () otherlv_2= '>=' )
            	            // InternalKPIFormulaDSL.g:1464:6: () otherlv_2= '>='
            	            {
            	            // InternalKPIFormulaDSL.g:1464:6: ()
            	            // InternalKPIFormulaDSL.g:1465:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getComparisonAccess().getGreaterEqLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,39,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalKPIFormulaDSL.g:1477:5: ( () otherlv_4= '<=' )
            	            {
            	            // InternalKPIFormulaDSL.g:1477:5: ( () otherlv_4= '<=' )
            	            // InternalKPIFormulaDSL.g:1478:6: () otherlv_4= '<='
            	            {
            	            // InternalKPIFormulaDSL.g:1478:6: ()
            	            // InternalKPIFormulaDSL.g:1479:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getComparisonAccess().getLessEqLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,40,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalKPIFormulaDSL.g:1491:5: ( () otherlv_6= '>' )
            	            {
            	            // InternalKPIFormulaDSL.g:1491:5: ( () otherlv_6= '>' )
            	            // InternalKPIFormulaDSL.g:1492:6: () otherlv_6= '>'
            	            {
            	            // InternalKPIFormulaDSL.g:1492:6: ()
            	            // InternalKPIFormulaDSL.g:1493:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getComparisonAccess().getGreaterLeftAction_1_0_2_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_6=(Token)match(input,41,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_6, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_2_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalKPIFormulaDSL.g:1505:5: ( () otherlv_8= '<' )
            	            {
            	            // InternalKPIFormulaDSL.g:1505:5: ( () otherlv_8= '<' )
            	            // InternalKPIFormulaDSL.g:1506:6: () otherlv_8= '<'
            	            {
            	            // InternalKPIFormulaDSL.g:1506:6: ()
            	            // InternalKPIFormulaDSL.g:1507:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getComparisonAccess().getLessLeftAction_1_0_3_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_8=(Token)match(input,42,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_8, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_3_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalKPIFormulaDSL.g:1519:4: ( (lv_right_9_0= rulePlusOrMinus ) )
            	    // InternalKPIFormulaDSL.g:1520:5: (lv_right_9_0= rulePlusOrMinus )
            	    {
            	    // InternalKPIFormulaDSL.g:1520:5: (lv_right_9_0= rulePlusOrMinus )
            	    // InternalKPIFormulaDSL.g:1521:6: lv_right_9_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_25);
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
            	    break loop14;
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
    // InternalKPIFormulaDSL.g:1543:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalKPIFormulaDSL.g:1543:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalKPIFormulaDSL.g:1544:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalKPIFormulaDSL.g:1550:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1556:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalKPIFormulaDSL.g:1557:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalKPIFormulaDSL.g:1557:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalKPIFormulaDSL.g:1558:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_26);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulOrDiv_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKPIFormulaDSL.g:1566:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=43 && LA16_0<=44)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:1567:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalKPIFormulaDSL.g:1567:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==43) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==44) ) {
            	        alt15=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalKPIFormulaDSL.g:1568:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalKPIFormulaDSL.g:1568:5: ( () otherlv_2= '+' )
            	            // InternalKPIFormulaDSL.g:1569:6: () otherlv_2= '+'
            	            {
            	            // InternalKPIFormulaDSL.g:1569:6: ()
            	            // InternalKPIFormulaDSL.g:1570:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,43,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalKPIFormulaDSL.g:1582:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalKPIFormulaDSL.g:1582:5: ( () otherlv_4= '-' )
            	            // InternalKPIFormulaDSL.g:1583:6: () otherlv_4= '-'
            	            {
            	            // InternalKPIFormulaDSL.g:1583:6: ()
            	            // InternalKPIFormulaDSL.g:1584:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,44,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalKPIFormulaDSL.g:1596:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalKPIFormulaDSL.g:1597:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalKPIFormulaDSL.g:1597:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalKPIFormulaDSL.g:1598:6: lv_right_5_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
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
            	    break loop16;
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
    // InternalKPIFormulaDSL.g:1620:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalKPIFormulaDSL.g:1620:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalKPIFormulaDSL.g:1621:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalKPIFormulaDSL.g:1627:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1633:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalKPIFormulaDSL.g:1634:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalKPIFormulaDSL.g:1634:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalKPIFormulaDSL.g:1635:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_27);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKPIFormulaDSL.g:1643:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=45 && LA18_0<=46)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:1644:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalKPIFormulaDSL.g:1644:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==45) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==46) ) {
            	        alt17=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalKPIFormulaDSL.g:1645:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalKPIFormulaDSL.g:1645:5: ( () otherlv_2= '*' )
            	            // InternalKPIFormulaDSL.g:1646:6: () otherlv_2= '*'
            	            {
            	            // InternalKPIFormulaDSL.g:1646:6: ()
            	            // InternalKPIFormulaDSL.g:1647:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getMulOrDivAccess().getMultiplyLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,45,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalKPIFormulaDSL.g:1659:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalKPIFormulaDSL.g:1659:5: ( () otherlv_4= '/' )
            	            // InternalKPIFormulaDSL.g:1660:6: () otherlv_4= '/'
            	            {
            	            // InternalKPIFormulaDSL.g:1660:6: ()
            	            // InternalKPIFormulaDSL.g:1661:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getMulOrDivAccess().getDivideLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,46,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalKPIFormulaDSL.g:1673:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalKPIFormulaDSL.g:1674:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalKPIFormulaDSL.g:1674:5: (lv_right_5_0= rulePrimary )
            	    // InternalKPIFormulaDSL.g:1675:6: lv_right_5_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_right_5_0=rulePrimary();

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
            	      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Primary");
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


    // $ANTLR start "entryRulePrimary"
    // InternalKPIFormulaDSL.g:1697:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalKPIFormulaDSL.g:1697:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalKPIFormulaDSL.g:1698:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalKPIFormulaDSL.g:1704:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'AVERAGE' otherlv_11= '(' ( (lv_expressions_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expressions_14_0= ruleExpression ) ) )* otherlv_15= ')' ) | ( () otherlv_17= 'WEIGHTED_SUM' otherlv_18= '(' ( (lv_expressions_19_0= ruleExpression ) ) otherlv_20= ':' ( (lv_weights_21_0= ruleExpression ) ) (otherlv_22= ',' ( (lv_expressions_23_0= ruleExpression ) ) otherlv_24= ':' ( (lv_weights_25_0= ruleExpression ) ) )* otherlv_26= ')' ) | ( () otherlv_28= 'MIN' otherlv_29= '(' ( (lv_expressions_30_0= ruleExpression ) ) (otherlv_31= ',' ( (lv_expressions_32_0= ruleExpression ) ) )* otherlv_33= ')' ) | ( () otherlv_35= 'MAX' otherlv_36= '(' ( (lv_expressions_37_0= ruleExpression ) ) (otherlv_38= ',' ( (lv_expressions_39_0= ruleExpression ) ) )* otherlv_40= ')' ) | ( () otherlv_42= 'THRESHOLD' otherlv_43= '(' ( (lv_expression_44_0= ruleExpression ) ) otherlv_45= ',' ( (lv_threshold_46_0= ruleExpression ) ) otherlv_47= ')' ) | this_Atomic_48= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_expression_8_0 = null;

        EObject lv_expressions_12_0 = null;

        EObject lv_expressions_14_0 = null;

        EObject lv_expressions_19_0 = null;

        EObject lv_weights_21_0 = null;

        EObject lv_expressions_23_0 = null;

        EObject lv_weights_25_0 = null;

        EObject lv_expressions_30_0 = null;

        EObject lv_expressions_32_0 = null;

        EObject lv_expressions_37_0 = null;

        EObject lv_expressions_39_0 = null;

        EObject lv_expression_44_0 = null;

        EObject lv_threshold_46_0 = null;

        EObject this_Atomic_48 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:1710:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'AVERAGE' otherlv_11= '(' ( (lv_expressions_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expressions_14_0= ruleExpression ) ) )* otherlv_15= ')' ) | ( () otherlv_17= 'WEIGHTED_SUM' otherlv_18= '(' ( (lv_expressions_19_0= ruleExpression ) ) otherlv_20= ':' ( (lv_weights_21_0= ruleExpression ) ) (otherlv_22= ',' ( (lv_expressions_23_0= ruleExpression ) ) otherlv_24= ':' ( (lv_weights_25_0= ruleExpression ) ) )* otherlv_26= ')' ) | ( () otherlv_28= 'MIN' otherlv_29= '(' ( (lv_expressions_30_0= ruleExpression ) ) (otherlv_31= ',' ( (lv_expressions_32_0= ruleExpression ) ) )* otherlv_33= ')' ) | ( () otherlv_35= 'MAX' otherlv_36= '(' ( (lv_expressions_37_0= ruleExpression ) ) (otherlv_38= ',' ( (lv_expressions_39_0= ruleExpression ) ) )* otherlv_40= ')' ) | ( () otherlv_42= 'THRESHOLD' otherlv_43= '(' ( (lv_expression_44_0= ruleExpression ) ) otherlv_45= ',' ( (lv_threshold_46_0= ruleExpression ) ) otherlv_47= ')' ) | this_Atomic_48= ruleAtomic ) )
            // InternalKPIFormulaDSL.g:1711:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'AVERAGE' otherlv_11= '(' ( (lv_expressions_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expressions_14_0= ruleExpression ) ) )* otherlv_15= ')' ) | ( () otherlv_17= 'WEIGHTED_SUM' otherlv_18= '(' ( (lv_expressions_19_0= ruleExpression ) ) otherlv_20= ':' ( (lv_weights_21_0= ruleExpression ) ) (otherlv_22= ',' ( (lv_expressions_23_0= ruleExpression ) ) otherlv_24= ':' ( (lv_weights_25_0= ruleExpression ) ) )* otherlv_26= ')' ) | ( () otherlv_28= 'MIN' otherlv_29= '(' ( (lv_expressions_30_0= ruleExpression ) ) (otherlv_31= ',' ( (lv_expressions_32_0= ruleExpression ) ) )* otherlv_33= ')' ) | ( () otherlv_35= 'MAX' otherlv_36= '(' ( (lv_expressions_37_0= ruleExpression ) ) (otherlv_38= ',' ( (lv_expressions_39_0= ruleExpression ) ) )* otherlv_40= ')' ) | ( () otherlv_42= 'THRESHOLD' otherlv_43= '(' ( (lv_expression_44_0= ruleExpression ) ) otherlv_45= ',' ( (lv_threshold_46_0= ruleExpression ) ) otherlv_47= ')' ) | this_Atomic_48= ruleAtomic )
            {
            // InternalKPIFormulaDSL.g:1711:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'AVERAGE' otherlv_11= '(' ( (lv_expressions_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expressions_14_0= ruleExpression ) ) )* otherlv_15= ')' ) | ( () otherlv_17= 'WEIGHTED_SUM' otherlv_18= '(' ( (lv_expressions_19_0= ruleExpression ) ) otherlv_20= ':' ( (lv_weights_21_0= ruleExpression ) ) (otherlv_22= ',' ( (lv_expressions_23_0= ruleExpression ) ) otherlv_24= ':' ( (lv_weights_25_0= ruleExpression ) ) )* otherlv_26= ')' ) | ( () otherlv_28= 'MIN' otherlv_29= '(' ( (lv_expressions_30_0= ruleExpression ) ) (otherlv_31= ',' ( (lv_expressions_32_0= ruleExpression ) ) )* otherlv_33= ')' ) | ( () otherlv_35= 'MAX' otherlv_36= '(' ( (lv_expressions_37_0= ruleExpression ) ) (otherlv_38= ',' ( (lv_expressions_39_0= ruleExpression ) ) )* otherlv_40= ')' ) | ( () otherlv_42= 'THRESHOLD' otherlv_43= '(' ( (lv_expression_44_0= ruleExpression ) ) otherlv_45= ',' ( (lv_threshold_46_0= ruleExpression ) ) otherlv_47= ')' ) | this_Atomic_48= ruleAtomic )
            int alt23=9;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt23=1;
                }
                break;
            case 49:
                {
                alt23=2;
                }
                break;
            case 44:
                {
                alt23=3;
                }
                break;
            case 50:
                {
                alt23=4;
                }
                break;
            case 52:
                {
                alt23=5;
                }
                break;
            case 54:
                {
                alt23=6;
                }
                break;
            case 55:
                {
                alt23=7;
                }
                break;
            case 56:
                {
                alt23=8;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_STRING:
            case RULE_FQN:
            case 57:
            case 58:
                {
                alt23=9;
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
                    // InternalKPIFormulaDSL.g:1712:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalKPIFormulaDSL.g:1712:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalKPIFormulaDSL.g:1713:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,47,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_28);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:1731:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalKPIFormulaDSL.g:1731:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalKPIFormulaDSL.g:1732:4: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalKPIFormulaDSL.g:1732:4: ()
                    // InternalKPIFormulaDSL.g:1733:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,49,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                      			
                    }
                    // InternalKPIFormulaDSL.g:1743:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalKPIFormulaDSL.g:1744:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalKPIFormulaDSL.g:1744:5: (lv_expression_5_0= rulePrimary )
                    // InternalKPIFormulaDSL.g:1745:6: lv_expression_5_0= rulePrimary
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
                    // InternalKPIFormulaDSL.g:1764:3: ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) )
                    {
                    // InternalKPIFormulaDSL.g:1764:3: ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) )
                    // InternalKPIFormulaDSL.g:1765:4: () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) )
                    {
                    // InternalKPIFormulaDSL.g:1765:4: ()
                    // InternalKPIFormulaDSL.g:1766:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getUnaryMinusAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,44,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1());
                      			
                    }
                    // InternalKPIFormulaDSL.g:1776:4: ( (lv_expression_8_0= rulePrimary ) )
                    // InternalKPIFormulaDSL.g:1777:5: (lv_expression_8_0= rulePrimary )
                    {
                    // InternalKPIFormulaDSL.g:1777:5: (lv_expression_8_0= rulePrimary )
                    // InternalKPIFormulaDSL.g:1778:6: lv_expression_8_0= rulePrimary
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
                    // InternalKPIFormulaDSL.g:1797:3: ( () otherlv_10= 'AVERAGE' otherlv_11= '(' ( (lv_expressions_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expressions_14_0= ruleExpression ) ) )* otherlv_15= ')' )
                    {
                    // InternalKPIFormulaDSL.g:1797:3: ( () otherlv_10= 'AVERAGE' otherlv_11= '(' ( (lv_expressions_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expressions_14_0= ruleExpression ) ) )* otherlv_15= ')' )
                    // InternalKPIFormulaDSL.g:1798:4: () otherlv_10= 'AVERAGE' otherlv_11= '(' ( (lv_expressions_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expressions_14_0= ruleExpression ) ) )* otherlv_15= ')'
                    {
                    // InternalKPIFormulaDSL.g:1798:4: ()
                    // InternalKPIFormulaDSL.g:1799:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getAvgOpAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_10=(Token)match(input,50,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getPrimaryAccess().getAVERAGEKeyword_3_1());
                      			
                    }
                    otherlv_11=(Token)match(input,47,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_2());
                      			
                    }
                    // InternalKPIFormulaDSL.g:1813:4: ( (lv_expressions_12_0= ruleExpression ) )
                    // InternalKPIFormulaDSL.g:1814:5: (lv_expressions_12_0= ruleExpression )
                    {
                    // InternalKPIFormulaDSL.g:1814:5: (lv_expressions_12_0= ruleExpression )
                    // InternalKPIFormulaDSL.g:1815:6: lv_expressions_12_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_3_3_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    lv_expressions_12_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						add(
                      							current,
                      							"expressions",
                      							lv_expressions_12_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKPIFormulaDSL.g:1832:4: (otherlv_13= ',' ( (lv_expressions_14_0= ruleExpression ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==51) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalKPIFormulaDSL.g:1833:5: otherlv_13= ',' ( (lv_expressions_14_0= ruleExpression ) )
                    	    {
                    	    otherlv_13=(Token)match(input,51,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_13, grammarAccess.getPrimaryAccess().getCommaKeyword_3_4_0());
                    	      				
                    	    }
                    	    // InternalKPIFormulaDSL.g:1837:5: ( (lv_expressions_14_0= ruleExpression ) )
                    	    // InternalKPIFormulaDSL.g:1838:6: (lv_expressions_14_0= ruleExpression )
                    	    {
                    	    // InternalKPIFormulaDSL.g:1838:6: (lv_expressions_14_0= ruleExpression )
                    	    // InternalKPIFormulaDSL.g:1839:7: lv_expressions_14_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_3_4_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_30);
                    	    lv_expressions_14_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"expressions",
                    	      								lv_expressions_14_0,
                    	      								"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
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

                    otherlv_15=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_5());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKPIFormulaDSL.g:1863:3: ( () otherlv_17= 'WEIGHTED_SUM' otherlv_18= '(' ( (lv_expressions_19_0= ruleExpression ) ) otherlv_20= ':' ( (lv_weights_21_0= ruleExpression ) ) (otherlv_22= ',' ( (lv_expressions_23_0= ruleExpression ) ) otherlv_24= ':' ( (lv_weights_25_0= ruleExpression ) ) )* otherlv_26= ')' )
                    {
                    // InternalKPIFormulaDSL.g:1863:3: ( () otherlv_17= 'WEIGHTED_SUM' otherlv_18= '(' ( (lv_expressions_19_0= ruleExpression ) ) otherlv_20= ':' ( (lv_weights_21_0= ruleExpression ) ) (otherlv_22= ',' ( (lv_expressions_23_0= ruleExpression ) ) otherlv_24= ':' ( (lv_weights_25_0= ruleExpression ) ) )* otherlv_26= ')' )
                    // InternalKPIFormulaDSL.g:1864:4: () otherlv_17= 'WEIGHTED_SUM' otherlv_18= '(' ( (lv_expressions_19_0= ruleExpression ) ) otherlv_20= ':' ( (lv_weights_21_0= ruleExpression ) ) (otherlv_22= ',' ( (lv_expressions_23_0= ruleExpression ) ) otherlv_24= ':' ( (lv_weights_25_0= ruleExpression ) ) )* otherlv_26= ')'
                    {
                    // InternalKPIFormulaDSL.g:1864:4: ()
                    // InternalKPIFormulaDSL.g:1865:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getWeightedSumOpAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_17=(Token)match(input,52,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getPrimaryAccess().getWEIGHTED_SUMKeyword_4_1());
                      			
                    }
                    otherlv_18=(Token)match(input,47,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_4_2());
                      			
                    }
                    // InternalKPIFormulaDSL.g:1879:4: ( (lv_expressions_19_0= ruleExpression ) )
                    // InternalKPIFormulaDSL.g:1880:5: (lv_expressions_19_0= ruleExpression )
                    {
                    // InternalKPIFormulaDSL.g:1880:5: (lv_expressions_19_0= ruleExpression )
                    // InternalKPIFormulaDSL.g:1881:6: lv_expressions_19_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_4_3_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
                    lv_expressions_19_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						add(
                      							current,
                      							"expressions",
                      							lv_expressions_19_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_20=(Token)match(input,53,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getPrimaryAccess().getColonKeyword_4_4());
                      			
                    }
                    // InternalKPIFormulaDSL.g:1902:4: ( (lv_weights_21_0= ruleExpression ) )
                    // InternalKPIFormulaDSL.g:1903:5: (lv_weights_21_0= ruleExpression )
                    {
                    // InternalKPIFormulaDSL.g:1903:5: (lv_weights_21_0= ruleExpression )
                    // InternalKPIFormulaDSL.g:1904:6: lv_weights_21_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getWeightsExpressionParserRuleCall_4_5_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    lv_weights_21_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						add(
                      							current,
                      							"weights",
                      							lv_weights_21_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKPIFormulaDSL.g:1921:4: (otherlv_22= ',' ( (lv_expressions_23_0= ruleExpression ) ) otherlv_24= ':' ( (lv_weights_25_0= ruleExpression ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==51) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalKPIFormulaDSL.g:1922:5: otherlv_22= ',' ( (lv_expressions_23_0= ruleExpression ) ) otherlv_24= ':' ( (lv_weights_25_0= ruleExpression ) )
                    	    {
                    	    otherlv_22=(Token)match(input,51,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_22, grammarAccess.getPrimaryAccess().getCommaKeyword_4_6_0());
                    	      				
                    	    }
                    	    // InternalKPIFormulaDSL.g:1926:5: ( (lv_expressions_23_0= ruleExpression ) )
                    	    // InternalKPIFormulaDSL.g:1927:6: (lv_expressions_23_0= ruleExpression )
                    	    {
                    	    // InternalKPIFormulaDSL.g:1927:6: (lv_expressions_23_0= ruleExpression )
                    	    // InternalKPIFormulaDSL.g:1928:7: lv_expressions_23_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_4_6_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_31);
                    	    lv_expressions_23_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"expressions",
                    	      								lv_expressions_23_0,
                    	      								"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    otherlv_24=(Token)match(input,53,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_24, grammarAccess.getPrimaryAccess().getColonKeyword_4_6_2());
                    	      				
                    	    }
                    	    // InternalKPIFormulaDSL.g:1949:5: ( (lv_weights_25_0= ruleExpression ) )
                    	    // InternalKPIFormulaDSL.g:1950:6: (lv_weights_25_0= ruleExpression )
                    	    {
                    	    // InternalKPIFormulaDSL.g:1950:6: (lv_weights_25_0= ruleExpression )
                    	    // InternalKPIFormulaDSL.g:1951:7: lv_weights_25_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPrimaryAccess().getWeightsExpressionParserRuleCall_4_6_3_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_30);
                    	    lv_weights_25_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"weights",
                    	      								lv_weights_25_0,
                    	      								"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
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

                    otherlv_26=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_4_7());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKPIFormulaDSL.g:1975:3: ( () otherlv_28= 'MIN' otherlv_29= '(' ( (lv_expressions_30_0= ruleExpression ) ) (otherlv_31= ',' ( (lv_expressions_32_0= ruleExpression ) ) )* otherlv_33= ')' )
                    {
                    // InternalKPIFormulaDSL.g:1975:3: ( () otherlv_28= 'MIN' otherlv_29= '(' ( (lv_expressions_30_0= ruleExpression ) ) (otherlv_31= ',' ( (lv_expressions_32_0= ruleExpression ) ) )* otherlv_33= ')' )
                    // InternalKPIFormulaDSL.g:1976:4: () otherlv_28= 'MIN' otherlv_29= '(' ( (lv_expressions_30_0= ruleExpression ) ) (otherlv_31= ',' ( (lv_expressions_32_0= ruleExpression ) ) )* otherlv_33= ')'
                    {
                    // InternalKPIFormulaDSL.g:1976:4: ()
                    // InternalKPIFormulaDSL.g:1977:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getMinOpAction_5_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_28=(Token)match(input,54,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_28, grammarAccess.getPrimaryAccess().getMINKeyword_5_1());
                      			
                    }
                    otherlv_29=(Token)match(input,47,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_29, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_5_2());
                      			
                    }
                    // InternalKPIFormulaDSL.g:1991:4: ( (lv_expressions_30_0= ruleExpression ) )
                    // InternalKPIFormulaDSL.g:1992:5: (lv_expressions_30_0= ruleExpression )
                    {
                    // InternalKPIFormulaDSL.g:1992:5: (lv_expressions_30_0= ruleExpression )
                    // InternalKPIFormulaDSL.g:1993:6: lv_expressions_30_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_5_3_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    lv_expressions_30_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						add(
                      							current,
                      							"expressions",
                      							lv_expressions_30_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKPIFormulaDSL.g:2010:4: (otherlv_31= ',' ( (lv_expressions_32_0= ruleExpression ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==51) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalKPIFormulaDSL.g:2011:5: otherlv_31= ',' ( (lv_expressions_32_0= ruleExpression ) )
                    	    {
                    	    otherlv_31=(Token)match(input,51,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_31, grammarAccess.getPrimaryAccess().getCommaKeyword_5_4_0());
                    	      				
                    	    }
                    	    // InternalKPIFormulaDSL.g:2015:5: ( (lv_expressions_32_0= ruleExpression ) )
                    	    // InternalKPIFormulaDSL.g:2016:6: (lv_expressions_32_0= ruleExpression )
                    	    {
                    	    // InternalKPIFormulaDSL.g:2016:6: (lv_expressions_32_0= ruleExpression )
                    	    // InternalKPIFormulaDSL.g:2017:7: lv_expressions_32_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_5_4_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_30);
                    	    lv_expressions_32_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"expressions",
                    	      								lv_expressions_32_0,
                    	      								"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
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

                    otherlv_33=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_33, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_5_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKPIFormulaDSL.g:2041:3: ( () otherlv_35= 'MAX' otherlv_36= '(' ( (lv_expressions_37_0= ruleExpression ) ) (otherlv_38= ',' ( (lv_expressions_39_0= ruleExpression ) ) )* otherlv_40= ')' )
                    {
                    // InternalKPIFormulaDSL.g:2041:3: ( () otherlv_35= 'MAX' otherlv_36= '(' ( (lv_expressions_37_0= ruleExpression ) ) (otherlv_38= ',' ( (lv_expressions_39_0= ruleExpression ) ) )* otherlv_40= ')' )
                    // InternalKPIFormulaDSL.g:2042:4: () otherlv_35= 'MAX' otherlv_36= '(' ( (lv_expressions_37_0= ruleExpression ) ) (otherlv_38= ',' ( (lv_expressions_39_0= ruleExpression ) ) )* otherlv_40= ')'
                    {
                    // InternalKPIFormulaDSL.g:2042:4: ()
                    // InternalKPIFormulaDSL.g:2043:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getMaxOpAction_6_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_35=(Token)match(input,55,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_35, grammarAccess.getPrimaryAccess().getMAXKeyword_6_1());
                      			
                    }
                    otherlv_36=(Token)match(input,47,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_36, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_6_2());
                      			
                    }
                    // InternalKPIFormulaDSL.g:2057:4: ( (lv_expressions_37_0= ruleExpression ) )
                    // InternalKPIFormulaDSL.g:2058:5: (lv_expressions_37_0= ruleExpression )
                    {
                    // InternalKPIFormulaDSL.g:2058:5: (lv_expressions_37_0= ruleExpression )
                    // InternalKPIFormulaDSL.g:2059:6: lv_expressions_37_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_6_3_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    lv_expressions_37_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						add(
                      							current,
                      							"expressions",
                      							lv_expressions_37_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKPIFormulaDSL.g:2076:4: (otherlv_38= ',' ( (lv_expressions_39_0= ruleExpression ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==51) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalKPIFormulaDSL.g:2077:5: otherlv_38= ',' ( (lv_expressions_39_0= ruleExpression ) )
                    	    {
                    	    otherlv_38=(Token)match(input,51,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_38, grammarAccess.getPrimaryAccess().getCommaKeyword_6_4_0());
                    	      				
                    	    }
                    	    // InternalKPIFormulaDSL.g:2081:5: ( (lv_expressions_39_0= ruleExpression ) )
                    	    // InternalKPIFormulaDSL.g:2082:6: (lv_expressions_39_0= ruleExpression )
                    	    {
                    	    // InternalKPIFormulaDSL.g:2082:6: (lv_expressions_39_0= ruleExpression )
                    	    // InternalKPIFormulaDSL.g:2083:7: lv_expressions_39_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionsExpressionParserRuleCall_6_4_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_30);
                    	    lv_expressions_39_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"expressions",
                    	      								lv_expressions_39_0,
                    	      								"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_40=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_40, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_6_5());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalKPIFormulaDSL.g:2107:3: ( () otherlv_42= 'THRESHOLD' otherlv_43= '(' ( (lv_expression_44_0= ruleExpression ) ) otherlv_45= ',' ( (lv_threshold_46_0= ruleExpression ) ) otherlv_47= ')' )
                    {
                    // InternalKPIFormulaDSL.g:2107:3: ( () otherlv_42= 'THRESHOLD' otherlv_43= '(' ( (lv_expression_44_0= ruleExpression ) ) otherlv_45= ',' ( (lv_threshold_46_0= ruleExpression ) ) otherlv_47= ')' )
                    // InternalKPIFormulaDSL.g:2108:4: () otherlv_42= 'THRESHOLD' otherlv_43= '(' ( (lv_expression_44_0= ruleExpression ) ) otherlv_45= ',' ( (lv_threshold_46_0= ruleExpression ) ) otherlv_47= ')'
                    {
                    // InternalKPIFormulaDSL.g:2108:4: ()
                    // InternalKPIFormulaDSL.g:2109:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getThresholdOpAction_7_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_42=(Token)match(input,56,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_42, grammarAccess.getPrimaryAccess().getTHRESHOLDKeyword_7_1());
                      			
                    }
                    otherlv_43=(Token)match(input,47,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_43, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_7_2());
                      			
                    }
                    // InternalKPIFormulaDSL.g:2123:4: ( (lv_expression_44_0= ruleExpression ) )
                    // InternalKPIFormulaDSL.g:2124:5: (lv_expression_44_0= ruleExpression )
                    {
                    // InternalKPIFormulaDSL.g:2124:5: (lv_expression_44_0= ruleExpression )
                    // InternalKPIFormulaDSL.g:2125:6: lv_expression_44_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_7_3_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
                    lv_expression_44_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_44_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_45=(Token)match(input,51,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_45, grammarAccess.getPrimaryAccess().getCommaKeyword_7_4());
                      			
                    }
                    // InternalKPIFormulaDSL.g:2146:4: ( (lv_threshold_46_0= ruleExpression ) )
                    // InternalKPIFormulaDSL.g:2147:5: (lv_threshold_46_0= ruleExpression )
                    {
                    // InternalKPIFormulaDSL.g:2147:5: (lv_threshold_46_0= ruleExpression )
                    // InternalKPIFormulaDSL.g:2148:6: lv_threshold_46_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getThresholdExpressionParserRuleCall_7_5_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_threshold_46_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"threshold",
                      							lv_threshold_46_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_47=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_47, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_7_6());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalKPIFormulaDSL.g:2171:3: this_Atomic_48= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Atomic_48=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Atomic_48;
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


    // $ANTLR start "entryRuleAtomic"
    // InternalKPIFormulaDSL.g:2183:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalKPIFormulaDSL.g:2183:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalKPIFormulaDSL.g:2184:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalKPIFormulaDSL.g:2190:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( (lv_value_9_0= RULE_DOUBLE ) ) ( (lv_unit_10_0= ruleValueUnit ) ) ) | ( () ( (otherlv_12= RULE_FQN ) ) ) | ( () ( (otherlv_14= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token lv_value_7_1=null;
        Token lv_value_7_2=null;
        Token lv_value_9_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Enumerator lv_unit_10_0 = null;



        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:2196:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( (lv_value_9_0= RULE_DOUBLE ) ) ( (lv_unit_10_0= ruleValueUnit ) ) ) | ( () ( (otherlv_12= RULE_FQN ) ) ) | ( () ( (otherlv_14= RULE_ID ) ) ) ) )
            // InternalKPIFormulaDSL.g:2197:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( (lv_value_9_0= RULE_DOUBLE ) ) ( (lv_unit_10_0= ruleValueUnit ) ) ) | ( () ( (otherlv_12= RULE_FQN ) ) ) | ( () ( (otherlv_14= RULE_ID ) ) ) )
            {
            // InternalKPIFormulaDSL.g:2197:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_DOUBLE ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( (lv_value_9_0= RULE_DOUBLE ) ) ( (lv_unit_10_0= ruleValueUnit ) ) ) | ( () ( (otherlv_12= RULE_FQN ) ) ) | ( () ( (otherlv_14= RULE_ID ) ) ) )
            int alt25=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt25=1;
                }
                break;
            case RULE_DOUBLE:
                {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==EOF||LA25_2==RULE_ID||LA25_2==22||(LA25_2>=32 && LA25_2<=33)||(LA25_2>=35 && LA25_2<=46)||LA25_2==48||LA25_2==51||LA25_2==53) ) {
                    alt25=2;
                }
                else if ( ((LA25_2>=59 && LA25_2<=61)||(LA25_2>=64 && LA25_2<=70)) ) {
                    alt25=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt25=3;
                }
                break;
            case 57:
            case 58:
                {
                alt25=4;
                }
                break;
            case RULE_FQN:
                {
                alt25=6;
                }
                break;
            case RULE_ID:
                {
                alt25=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalKPIFormulaDSL.g:2198:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalKPIFormulaDSL.g:2198:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalKPIFormulaDSL.g:2199:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalKPIFormulaDSL.g:2199:4: ()
                    // InternalKPIFormulaDSL.g:2200:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKPIFormulaDSL.g:2206:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalKPIFormulaDSL.g:2207:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalKPIFormulaDSL.g:2207:5: (lv_value_1_0= RULE_INT )
                    // InternalKPIFormulaDSL.g:2208:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:2226:3: ( () ( (lv_value_3_0= RULE_DOUBLE ) ) )
                    {
                    // InternalKPIFormulaDSL.g:2226:3: ( () ( (lv_value_3_0= RULE_DOUBLE ) ) )
                    // InternalKPIFormulaDSL.g:2227:4: () ( (lv_value_3_0= RULE_DOUBLE ) )
                    {
                    // InternalKPIFormulaDSL.g:2227:4: ()
                    // InternalKPIFormulaDSL.g:2228:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getRealConstantAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKPIFormulaDSL.g:2234:4: ( (lv_value_3_0= RULE_DOUBLE ) )
                    // InternalKPIFormulaDSL.g:2235:5: (lv_value_3_0= RULE_DOUBLE )
                    {
                    // InternalKPIFormulaDSL.g:2235:5: (lv_value_3_0= RULE_DOUBLE )
                    // InternalKPIFormulaDSL.g:2236:6: lv_value_3_0= RULE_DOUBLE
                    {
                    lv_value_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueDOUBLETerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.DOUBLE");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKPIFormulaDSL.g:2254:3: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    {
                    // InternalKPIFormulaDSL.g:2254:3: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    // InternalKPIFormulaDSL.g:2255:4: () ( (lv_value_5_0= RULE_STRING ) )
                    {
                    // InternalKPIFormulaDSL.g:2255:4: ()
                    // InternalKPIFormulaDSL.g:2256:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getTextConstantAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKPIFormulaDSL.g:2262:4: ( (lv_value_5_0= RULE_STRING ) )
                    // InternalKPIFormulaDSL.g:2263:5: (lv_value_5_0= RULE_STRING )
                    {
                    // InternalKPIFormulaDSL.g:2263:5: (lv_value_5_0= RULE_STRING )
                    // InternalKPIFormulaDSL.g:2264:6: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_5_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_5_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalKPIFormulaDSL.g:2282:3: ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) )
                    {
                    // InternalKPIFormulaDSL.g:2282:3: ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) )
                    // InternalKPIFormulaDSL.g:2283:4: () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) )
                    {
                    // InternalKPIFormulaDSL.g:2283:4: ()
                    // InternalKPIFormulaDSL.g:2284:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getBoolConstantAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKPIFormulaDSL.g:2290:4: ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) )
                    // InternalKPIFormulaDSL.g:2291:5: ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) )
                    {
                    // InternalKPIFormulaDSL.g:2291:5: ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) )
                    // InternalKPIFormulaDSL.g:2292:6: (lv_value_7_1= 'true' | lv_value_7_2= 'false' )
                    {
                    // InternalKPIFormulaDSL.g:2292:6: (lv_value_7_1= 'true' | lv_value_7_2= 'false' )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==57) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==58) ) {
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
                            // InternalKPIFormulaDSL.g:2293:7: lv_value_7_1= 'true'
                            {
                            lv_value_7_1=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_7_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_3_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAtomicRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_7_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalKPIFormulaDSL.g:2304:7: lv_value_7_2= 'false'
                            {
                            lv_value_7_2=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_7_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_3_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAtomicRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_7_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalKPIFormulaDSL.g:2319:3: ( () ( (lv_value_9_0= RULE_DOUBLE ) ) ( (lv_unit_10_0= ruleValueUnit ) ) )
                    {
                    // InternalKPIFormulaDSL.g:2319:3: ( () ( (lv_value_9_0= RULE_DOUBLE ) ) ( (lv_unit_10_0= ruleValueUnit ) ) )
                    // InternalKPIFormulaDSL.g:2320:4: () ( (lv_value_9_0= RULE_DOUBLE ) ) ( (lv_unit_10_0= ruleValueUnit ) )
                    {
                    // InternalKPIFormulaDSL.g:2320:4: ()
                    // InternalKPIFormulaDSL.g:2321:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getUnitConstantAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKPIFormulaDSL.g:2327:4: ( (lv_value_9_0= RULE_DOUBLE ) )
                    // InternalKPIFormulaDSL.g:2328:5: (lv_value_9_0= RULE_DOUBLE )
                    {
                    // InternalKPIFormulaDSL.g:2328:5: (lv_value_9_0= RULE_DOUBLE )
                    // InternalKPIFormulaDSL.g:2329:6: lv_value_9_0= RULE_DOUBLE
                    {
                    lv_value_9_0=(Token)match(input,RULE_DOUBLE,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_9_0, grammarAccess.getAtomicAccess().getValueDOUBLETerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_9_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.DOUBLE");
                      					
                    }

                    }


                    }

                    // InternalKPIFormulaDSL.g:2345:4: ( (lv_unit_10_0= ruleValueUnit ) )
                    // InternalKPIFormulaDSL.g:2346:5: (lv_unit_10_0= ruleValueUnit )
                    {
                    // InternalKPIFormulaDSL.g:2346:5: (lv_unit_10_0= ruleValueUnit )
                    // InternalKPIFormulaDSL.g:2347:6: lv_unit_10_0= ruleValueUnit
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getUnitValueUnitEnumRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_unit_10_0=ruleValueUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicRule());
                      						}
                      						set(
                      							current,
                      							"unit",
                      							lv_unit_10_0,
                      							"lu.list.swrdi.formulaKPI.KPIFormulaDSL.ValueUnit");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalKPIFormulaDSL.g:2366:3: ( () ( (otherlv_12= RULE_FQN ) ) )
                    {
                    // InternalKPIFormulaDSL.g:2366:3: ( () ( (otherlv_12= RULE_FQN ) ) )
                    // InternalKPIFormulaDSL.g:2367:4: () ( (otherlv_12= RULE_FQN ) )
                    {
                    // InternalKPIFormulaDSL.g:2367:4: ()
                    // InternalKPIFormulaDSL.g:2368:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getEnumLiteralRefAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKPIFormulaDSL.g:2374:4: ( (otherlv_12= RULE_FQN ) )
                    // InternalKPIFormulaDSL.g:2375:5: (otherlv_12= RULE_FQN )
                    {
                    // InternalKPIFormulaDSL.g:2375:5: (otherlv_12= RULE_FQN )
                    // InternalKPIFormulaDSL.g:2376:6: otherlv_12= RULE_FQN
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      					
                    }
                    otherlv_12=(Token)match(input,RULE_FQN,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_12, grammarAccess.getAtomicAccess().getLiteralEnumerationLiteralCrossReference_5_1_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalKPIFormulaDSL.g:2389:3: ( () ( (otherlv_14= RULE_ID ) ) )
                    {
                    // InternalKPIFormulaDSL.g:2389:3: ( () ( (otherlv_14= RULE_ID ) ) )
                    // InternalKPIFormulaDSL.g:2390:4: () ( (otherlv_14= RULE_ID ) )
                    {
                    // InternalKPIFormulaDSL.g:2390:4: ()
                    // InternalKPIFormulaDSL.g:2391:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getComputableRefAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKPIFormulaDSL.g:2397:4: ( (otherlv_14= RULE_ID ) )
                    // InternalKPIFormulaDSL.g:2398:5: (otherlv_14= RULE_ID )
                    {
                    // InternalKPIFormulaDSL.g:2398:5: (otherlv_14= RULE_ID )
                    // InternalKPIFormulaDSL.g:2399:6: otherlv_14= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      					
                    }
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_14, grammarAccess.getAtomicAccess().getComputableComputableCrossReference_6_1_0());
                      					
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
    // InternalKPIFormulaDSL.g:2415:1: ruleWindowUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'measurements' ) ) ;
    public final Enumerator ruleWindowUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalKPIFormulaDSL.g:2421:2: ( ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'measurements' ) ) )
            // InternalKPIFormulaDSL.g:2422:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'measurements' ) )
            {
            // InternalKPIFormulaDSL.g:2422:2: ( (enumLiteral_0= 'seconds' ) | (enumLiteral_1= 'minutes' ) | (enumLiteral_2= 'hours' ) | (enumLiteral_3= 'days' ) | (enumLiteral_4= 'measurements' ) )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt26=1;
                }
                break;
            case 60:
                {
                alt26=2;
                }
                break;
            case 61:
                {
                alt26=3;
                }
                break;
            case 62:
                {
                alt26=4;
                }
                break;
            case 63:
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
                    // InternalKPIFormulaDSL.g:2423:3: (enumLiteral_0= 'seconds' )
                    {
                    // InternalKPIFormulaDSL.g:2423:3: (enumLiteral_0= 'seconds' )
                    // InternalKPIFormulaDSL.g:2424:4: enumLiteral_0= 'seconds'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getWindowUnitAccess().getSECEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getWindowUnitAccess().getSECEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:2431:3: (enumLiteral_1= 'minutes' )
                    {
                    // InternalKPIFormulaDSL.g:2431:3: (enumLiteral_1= 'minutes' )
                    // InternalKPIFormulaDSL.g:2432:4: enumLiteral_1= 'minutes'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getWindowUnitAccess().getMINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getWindowUnitAccess().getMINEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKPIFormulaDSL.g:2439:3: (enumLiteral_2= 'hours' )
                    {
                    // InternalKPIFormulaDSL.g:2439:3: (enumLiteral_2= 'hours' )
                    // InternalKPIFormulaDSL.g:2440:4: enumLiteral_2= 'hours'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getWindowUnitAccess().getHOUREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getWindowUnitAccess().getHOUREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKPIFormulaDSL.g:2447:3: (enumLiteral_3= 'days' )
                    {
                    // InternalKPIFormulaDSL.g:2447:3: (enumLiteral_3= 'days' )
                    // InternalKPIFormulaDSL.g:2448:4: enumLiteral_3= 'days'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getWindowUnitAccess().getDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getWindowUnitAccess().getDAYEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKPIFormulaDSL.g:2455:3: (enumLiteral_4= 'measurements' )
                    {
                    // InternalKPIFormulaDSL.g:2455:3: (enumLiteral_4= 'measurements' )
                    // InternalKPIFormulaDSL.g:2456:4: enumLiteral_4= 'measurements'
                    {
                    enumLiteral_4=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
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
    // InternalKPIFormulaDSL.g:2466:1: ruleValueUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) | (enumLiteral_3= 'hours' ) | (enumLiteral_4= 'liters' ) | (enumLiteral_5= 'cubic meter' ) | (enumLiteral_6= 'Wh' ) | (enumLiteral_7= 'kWh' ) | (enumLiteral_8= 'gCO2eq' ) | (enumLiteral_9= 'kgCO2eq' ) ) ;
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
            // InternalKPIFormulaDSL.g:2472:2: ( ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) | (enumLiteral_3= 'hours' ) | (enumLiteral_4= 'liters' ) | (enumLiteral_5= 'cubic meter' ) | (enumLiteral_6= 'Wh' ) | (enumLiteral_7= 'kWh' ) | (enumLiteral_8= 'gCO2eq' ) | (enumLiteral_9= 'kgCO2eq' ) ) )
            // InternalKPIFormulaDSL.g:2473:2: ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) | (enumLiteral_3= 'hours' ) | (enumLiteral_4= 'liters' ) | (enumLiteral_5= 'cubic meter' ) | (enumLiteral_6= 'Wh' ) | (enumLiteral_7= 'kWh' ) | (enumLiteral_8= 'gCO2eq' ) | (enumLiteral_9= 'kgCO2eq' ) )
            {
            // InternalKPIFormulaDSL.g:2473:2: ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) | (enumLiteral_3= 'hours' ) | (enumLiteral_4= 'liters' ) | (enumLiteral_5= 'cubic meter' ) | (enumLiteral_6= 'Wh' ) | (enumLiteral_7= 'kWh' ) | (enumLiteral_8= 'gCO2eq' ) | (enumLiteral_9= 'kgCO2eq' ) )
            int alt27=10;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt27=1;
                }
                break;
            case 59:
                {
                alt27=2;
                }
                break;
            case 60:
                {
                alt27=3;
                }
                break;
            case 61:
                {
                alt27=4;
                }
                break;
            case 65:
                {
                alt27=5;
                }
                break;
            case 66:
                {
                alt27=6;
                }
                break;
            case 67:
                {
                alt27=7;
                }
                break;
            case 68:
                {
                alt27=8;
                }
                break;
            case 69:
                {
                alt27=9;
                }
                break;
            case 70:
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
                    // InternalKPIFormulaDSL.g:2474:3: (enumLiteral_0= 'milliseconds' )
                    {
                    // InternalKPIFormulaDSL.g:2474:3: (enumLiteral_0= 'milliseconds' )
                    // InternalKPIFormulaDSL.g:2475:4: enumLiteral_0= 'milliseconds'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getValueUnitAccess().getMILLIEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getValueUnitAccess().getMILLIEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:2482:3: (enumLiteral_1= 'seconds' )
                    {
                    // InternalKPIFormulaDSL.g:2482:3: (enumLiteral_1= 'seconds' )
                    // InternalKPIFormulaDSL.g:2483:4: enumLiteral_1= 'seconds'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getValueUnitAccess().getSECEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getValueUnitAccess().getSECEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKPIFormulaDSL.g:2490:3: (enumLiteral_2= 'minutes' )
                    {
                    // InternalKPIFormulaDSL.g:2490:3: (enumLiteral_2= 'minutes' )
                    // InternalKPIFormulaDSL.g:2491:4: enumLiteral_2= 'minutes'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getValueUnitAccess().getMINEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getValueUnitAccess().getMINEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKPIFormulaDSL.g:2498:3: (enumLiteral_3= 'hours' )
                    {
                    // InternalKPIFormulaDSL.g:2498:3: (enumLiteral_3= 'hours' )
                    // InternalKPIFormulaDSL.g:2499:4: enumLiteral_3= 'hours'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getValueUnitAccess().getHOUREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getValueUnitAccess().getHOUREnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKPIFormulaDSL.g:2506:3: (enumLiteral_4= 'liters' )
                    {
                    // InternalKPIFormulaDSL.g:2506:3: (enumLiteral_4= 'liters' )
                    // InternalKPIFormulaDSL.g:2507:4: enumLiteral_4= 'liters'
                    {
                    enumLiteral_4=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getValueUnitAccess().getLITERSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getValueUnitAccess().getLITERSEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKPIFormulaDSL.g:2514:3: (enumLiteral_5= 'cubic meter' )
                    {
                    // InternalKPIFormulaDSL.g:2514:3: (enumLiteral_5= 'cubic meter' )
                    // InternalKPIFormulaDSL.g:2515:4: enumLiteral_5= 'cubic meter'
                    {
                    enumLiteral_5=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getValueUnitAccess().getM3EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getValueUnitAccess().getM3EnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalKPIFormulaDSL.g:2522:3: (enumLiteral_6= 'Wh' )
                    {
                    // InternalKPIFormulaDSL.g:2522:3: (enumLiteral_6= 'Wh' )
                    // InternalKPIFormulaDSL.g:2523:4: enumLiteral_6= 'Wh'
                    {
                    enumLiteral_6=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getValueUnitAccess().getWhEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getValueUnitAccess().getWhEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalKPIFormulaDSL.g:2530:3: (enumLiteral_7= 'kWh' )
                    {
                    // InternalKPIFormulaDSL.g:2530:3: (enumLiteral_7= 'kWh' )
                    // InternalKPIFormulaDSL.g:2531:4: enumLiteral_7= 'kWh'
                    {
                    enumLiteral_7=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getValueUnitAccess().getKWhEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getValueUnitAccess().getKWhEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalKPIFormulaDSL.g:2538:3: (enumLiteral_8= 'gCO2eq' )
                    {
                    // InternalKPIFormulaDSL.g:2538:3: (enumLiteral_8= 'gCO2eq' )
                    // InternalKPIFormulaDSL.g:2539:4: enumLiteral_8= 'gCO2eq'
                    {
                    enumLiteral_8=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getValueUnitAccess().getGCO2eqEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getValueUnitAccess().getGCO2eqEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalKPIFormulaDSL.g:2546:3: (enumLiteral_9= 'kgCO2eq' )
                    {
                    // InternalKPIFormulaDSL.g:2546:3: (enumLiteral_9= 'kgCO2eq' )
                    // InternalKPIFormulaDSL.g:2547:4: enumLiteral_9= 'kgCO2eq'
                    {
                    enumLiteral_9=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
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
        // InternalKPIFormulaDSL.g:1181:4: ( 'otherwise' )
        // InternalKPIFormulaDSL.g:1181:5: 'otherwise'
        {
        match(input,34,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalKPIFormulaDSL

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x07D69000002001F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x3800000002BE0000L,0x000000000000007FL});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xF800000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x07D69000000001F0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x07D69004000001F0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0008000000000000L});

}