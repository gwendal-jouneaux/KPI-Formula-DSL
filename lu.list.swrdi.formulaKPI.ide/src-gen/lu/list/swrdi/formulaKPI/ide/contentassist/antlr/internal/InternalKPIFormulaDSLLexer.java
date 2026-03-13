package lu.list.swrdi.formulaKPI.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKPIFormulaDSLLexer extends Lexer {
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

    public InternalKPIFormulaDSLLexer() {;} 
    public InternalKPIFormulaDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalKPIFormulaDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalKPIFormulaDSL.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:11:7: ( 'true' )
            // InternalKPIFormulaDSL.g:11:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:12:7: ( 'false' )
            // InternalKPIFormulaDSL.g:12:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:13:7: ( 'seconds' )
            // InternalKPIFormulaDSL.g:13:9: 'seconds'
            {
            match("seconds"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:14:7: ( 'minutes' )
            // InternalKPIFormulaDSL.g:14:9: 'minutes'
            {
            match("minutes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:15:7: ( 'hours' )
            // InternalKPIFormulaDSL.g:15:9: 'hours'
            {
            match("hours"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:16:7: ( 'days' )
            // InternalKPIFormulaDSL.g:16:9: 'days'
            {
            match("days"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:17:7: ( 'measurements' )
            // InternalKPIFormulaDSL.g:17:9: 'measurements'
            {
            match("measurements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:18:7: ( 'milliseconds' )
            // InternalKPIFormulaDSL.g:18:9: 'milliseconds'
            {
            match("milliseconds"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:19:7: ( 'liters' )
            // InternalKPIFormulaDSL.g:19:9: 'liters'
            {
            match("liters"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:20:7: ( 'cubic meter' )
            // InternalKPIFormulaDSL.g:20:9: 'cubic meter'
            {
            match("cubic meter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:21:7: ( 'Wh' )
            // InternalKPIFormulaDSL.g:21:9: 'Wh'
            {
            match("Wh"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:22:7: ( 'kWh' )
            // InternalKPIFormulaDSL.g:22:9: 'kWh'
            {
            match("kWh"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:23:7: ( 'gCO2eq' )
            // InternalKPIFormulaDSL.g:23:9: 'gCO2eq'
            {
            match("gCO2eq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:24:7: ( 'kgCO2eq' )
            // InternalKPIFormulaDSL.g:24:9: 'kgCO2eq'
            {
            match("kgCO2eq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:25:7: ( '=' )
            // InternalKPIFormulaDSL.g:25:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:26:7: ( 'of' )
            // InternalKPIFormulaDSL.g:26:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:27:7: ( 'type' )
            // InternalKPIFormulaDSL.g:27:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:28:7: ( 'KPI' )
            // InternalKPIFormulaDSL.g:28:9: 'KPI'
            {
            match("KPI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:29:7: ( 'int' )
            // InternalKPIFormulaDSL.g:29:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:30:7: ( 'real' )
            // InternalKPIFormulaDSL.g:30:9: 'real'
            {
            match("real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:31:7: ( 'text' )
            // InternalKPIFormulaDSL.g:31:9: 'text'
            {
            match("text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:32:7: ( 'bool' )
            // InternalKPIFormulaDSL.g:32:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:33:7: ( '{' )
            // InternalKPIFormulaDSL.g:33:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:34:7: ( '}' )
            // InternalKPIFormulaDSL.g:34:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:35:7: ( 'aggregate' )
            // InternalKPIFormulaDSL.g:35:9: 'aggregate'
            {
            match("aggregate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:36:7: ( 'for' )
            // InternalKPIFormulaDSL.g:36:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:37:7: ( 'drift' )
            // InternalKPIFormulaDSL.g:37:9: 'drift'
            {
            match("drift"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:38:7: ( 'Minimum' )
            // InternalKPIFormulaDSL.g:38:9: 'Minimum'
            {
            match("Minimum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:39:7: ( 'Maximum' )
            // InternalKPIFormulaDSL.g:39:9: 'Maximum'
            {
            match("Maximum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:40:7: ( 'Average' )
            // InternalKPIFormulaDSL.g:40:9: 'Average'
            {
            match("Average"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:41:7: ( 'Median' )
            // InternalKPIFormulaDSL.g:41:9: 'Median'
            {
            match("Median"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:42:7: ( 'Standard' )
            // InternalKPIFormulaDSL.g:42:9: 'Standard'
            {
            match("Standard"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:43:7: ( 'deviation' )
            // InternalKPIFormulaDSL.g:43:9: 'deviation'
            {
            match("deviation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:44:7: ( 'otherwise' )
            // InternalKPIFormulaDSL.g:44:9: 'otherwise'
            {
            match("otherwise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:45:7: ( '->' )
            // InternalKPIFormulaDSL.g:45:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:46:7: ( ';' )
            // InternalKPIFormulaDSL.g:46:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:47:7: ( 'or' )
            // InternalKPIFormulaDSL.g:47:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:48:7: ( 'and' )
            // InternalKPIFormulaDSL.g:48:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:49:7: ( '==' )
            // InternalKPIFormulaDSL.g:49:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:50:7: ( '!=' )
            // InternalKPIFormulaDSL.g:50:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:51:7: ( '>=' )
            // InternalKPIFormulaDSL.g:51:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:52:7: ( '<=' )
            // InternalKPIFormulaDSL.g:52:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:53:7: ( '>' )
            // InternalKPIFormulaDSL.g:53:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:54:7: ( '<' )
            // InternalKPIFormulaDSL.g:54:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:55:7: ( '+' )
            // InternalKPIFormulaDSL.g:55:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:56:7: ( '-' )
            // InternalKPIFormulaDSL.g:56:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:57:7: ( '*' )
            // InternalKPIFormulaDSL.g:57:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:58:7: ( '/' )
            // InternalKPIFormulaDSL.g:58:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:59:7: ( '|' )
            // InternalKPIFormulaDSL.g:59:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:60:7: ( '[' )
            // InternalKPIFormulaDSL.g:60:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:61:7: ( ']' )
            // InternalKPIFormulaDSL.g:61:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:62:7: ( ',' )
            // InternalKPIFormulaDSL.g:62:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:63:7: ( 'AVERAGE' )
            // InternalKPIFormulaDSL.g:63:9: 'AVERAGE'
            {
            match("AVERAGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:64:7: ( '(' )
            // InternalKPIFormulaDSL.g:64:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:65:7: ( ')' )
            // InternalKPIFormulaDSL.g:65:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:66:7: ( 'WEIGHTED_SUM' )
            // InternalKPIFormulaDSL.g:66:9: 'WEIGHTED_SUM'
            {
            match("WEIGHTED_SUM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:67:7: ( 'SUM' )
            // InternalKPIFormulaDSL.g:67:9: 'SUM'
            {
            match("SUM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:68:7: ( 'MIN' )
            // InternalKPIFormulaDSL.g:68:9: 'MIN'
            {
            match("MIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:69:7: ( 'MAX' )
            // InternalKPIFormulaDSL.g:69:9: 'MAX'
            {
            match("MAX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:70:7: ( 'THRESHOLD' )
            // InternalKPIFormulaDSL.g:70:9: 'THRESHOLD'
            {
            match("THRESHOLD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:71:7: ( 'map' )
            // InternalKPIFormulaDSL.g:71:9: 'map'
            {
            match("map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:72:7: ( 'in' )
            // InternalKPIFormulaDSL.g:72:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:73:7: ( 'reduce' )
            // InternalKPIFormulaDSL.g:73:9: 'reduce'
            {
            match("reduce"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:74:7: ( 'starting' )
            // InternalKPIFormulaDSL.g:74:9: 'starting'
            {
            match("starting"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:75:7: ( 'filter' )
            // InternalKPIFormulaDSL.g:75:9: 'filter'
            {
            match("filter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:76:7: ( '!' )
            // InternalKPIFormulaDSL.g:76:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:77:7: ( 'accumulator' )
            // InternalKPIFormulaDSL.g:77:9: 'accumulator'
            {
            match("accumulator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:8213:13: ( RULE_INT '.' RULE_INT )
            // InternalKPIFormulaDSL.g:8213:15: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_FQN"
    public final void mRULE_FQN() throws RecognitionException {
        try {
            int _type = RULE_FQN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:8215:10: ( RULE_ID ( '.' RULE_ID )+ )
            // InternalKPIFormulaDSL.g:8215:12: RULE_ID ( '.' RULE_ID )+
            {
            mRULE_ID(); 
            // InternalKPIFormulaDSL.g:8215:20: ( '.' RULE_ID )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='.') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:8215:21: '.' RULE_ID
            	    {
            	    match('.'); 
            	    mRULE_ID(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FQN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:8217:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalKPIFormulaDSL.g:8217:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalKPIFormulaDSL.g:8217:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKPIFormulaDSL.g:8217:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalKPIFormulaDSL.g:8217:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:8219:10: ( ( '0' .. '9' )+ )
            // InternalKPIFormulaDSL.g:8219:12: ( '0' .. '9' )+
            {
            // InternalKPIFormulaDSL.g:8219:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:8219:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:8221:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalKPIFormulaDSL.g:8221:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalKPIFormulaDSL.g:8221:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalKPIFormulaDSL.g:8221:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalKPIFormulaDSL.g:8221:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalKPIFormulaDSL.g:8221:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKPIFormulaDSL.g:8221:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalKPIFormulaDSL.g:8221:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalKPIFormulaDSL.g:8221:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalKPIFormulaDSL.g:8221:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalKPIFormulaDSL.g:8221:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:8223:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalKPIFormulaDSL.g:8223:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalKPIFormulaDSL.g:8223:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:8223:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:8225:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalKPIFormulaDSL.g:8225:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalKPIFormulaDSL.g:8225:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:8225:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalKPIFormulaDSL.g:8225:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKPIFormulaDSL.g:8225:41: ( '\\r' )? '\\n'
                    {
                    // InternalKPIFormulaDSL.g:8225:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalKPIFormulaDSL.g:8225:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:8227:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalKPIFormulaDSL.g:8227:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalKPIFormulaDSL.g:8227:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKPIFormulaDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalKPIFormulaDSL.g:8229:16: ( . )
            // InternalKPIFormulaDSL.g:8229:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalKPIFormulaDSL.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | RULE_DOUBLE | RULE_FQN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=76;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalKPIFormulaDSL.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalKPIFormulaDSL.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalKPIFormulaDSL.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalKPIFormulaDSL.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalKPIFormulaDSL.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalKPIFormulaDSL.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalKPIFormulaDSL.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalKPIFormulaDSL.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalKPIFormulaDSL.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalKPIFormulaDSL.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalKPIFormulaDSL.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalKPIFormulaDSL.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalKPIFormulaDSL.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalKPIFormulaDSL.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalKPIFormulaDSL.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalKPIFormulaDSL.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalKPIFormulaDSL.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalKPIFormulaDSL.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalKPIFormulaDSL.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalKPIFormulaDSL.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalKPIFormulaDSL.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalKPIFormulaDSL.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalKPIFormulaDSL.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalKPIFormulaDSL.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalKPIFormulaDSL.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalKPIFormulaDSL.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalKPIFormulaDSL.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalKPIFormulaDSL.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalKPIFormulaDSL.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalKPIFormulaDSL.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalKPIFormulaDSL.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalKPIFormulaDSL.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalKPIFormulaDSL.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalKPIFormulaDSL.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // InternalKPIFormulaDSL.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // InternalKPIFormulaDSL.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // InternalKPIFormulaDSL.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // InternalKPIFormulaDSL.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // InternalKPIFormulaDSL.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // InternalKPIFormulaDSL.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // InternalKPIFormulaDSL.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // InternalKPIFormulaDSL.g:1:256: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // InternalKPIFormulaDSL.g:1:262: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // InternalKPIFormulaDSL.g:1:268: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // InternalKPIFormulaDSL.g:1:274: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // InternalKPIFormulaDSL.g:1:280: T__58
                {
                mT__58(); 

                }
                break;
            case 47 :
                // InternalKPIFormulaDSL.g:1:286: T__59
                {
                mT__59(); 

                }
                break;
            case 48 :
                // InternalKPIFormulaDSL.g:1:292: T__60
                {
                mT__60(); 

                }
                break;
            case 49 :
                // InternalKPIFormulaDSL.g:1:298: T__61
                {
                mT__61(); 

                }
                break;
            case 50 :
                // InternalKPIFormulaDSL.g:1:304: T__62
                {
                mT__62(); 

                }
                break;
            case 51 :
                // InternalKPIFormulaDSL.g:1:310: T__63
                {
                mT__63(); 

                }
                break;
            case 52 :
                // InternalKPIFormulaDSL.g:1:316: T__64
                {
                mT__64(); 

                }
                break;
            case 53 :
                // InternalKPIFormulaDSL.g:1:322: T__65
                {
                mT__65(); 

                }
                break;
            case 54 :
                // InternalKPIFormulaDSL.g:1:328: T__66
                {
                mT__66(); 

                }
                break;
            case 55 :
                // InternalKPIFormulaDSL.g:1:334: T__67
                {
                mT__67(); 

                }
                break;
            case 56 :
                // InternalKPIFormulaDSL.g:1:340: T__68
                {
                mT__68(); 

                }
                break;
            case 57 :
                // InternalKPIFormulaDSL.g:1:346: T__69
                {
                mT__69(); 

                }
                break;
            case 58 :
                // InternalKPIFormulaDSL.g:1:352: T__70
                {
                mT__70(); 

                }
                break;
            case 59 :
                // InternalKPIFormulaDSL.g:1:358: T__71
                {
                mT__71(); 

                }
                break;
            case 60 :
                // InternalKPIFormulaDSL.g:1:364: T__72
                {
                mT__72(); 

                }
                break;
            case 61 :
                // InternalKPIFormulaDSL.g:1:370: T__73
                {
                mT__73(); 

                }
                break;
            case 62 :
                // InternalKPIFormulaDSL.g:1:376: T__74
                {
                mT__74(); 

                }
                break;
            case 63 :
                // InternalKPIFormulaDSL.g:1:382: T__75
                {
                mT__75(); 

                }
                break;
            case 64 :
                // InternalKPIFormulaDSL.g:1:388: T__76
                {
                mT__76(); 

                }
                break;
            case 65 :
                // InternalKPIFormulaDSL.g:1:394: T__77
                {
                mT__77(); 

                }
                break;
            case 66 :
                // InternalKPIFormulaDSL.g:1:400: T__78
                {
                mT__78(); 

                }
                break;
            case 67 :
                // InternalKPIFormulaDSL.g:1:406: T__79
                {
                mT__79(); 

                }
                break;
            case 68 :
                // InternalKPIFormulaDSL.g:1:412: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 69 :
                // InternalKPIFormulaDSL.g:1:424: RULE_FQN
                {
                mRULE_FQN(); 

                }
                break;
            case 70 :
                // InternalKPIFormulaDSL.g:1:433: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 71 :
                // InternalKPIFormulaDSL.g:1:441: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 72 :
                // InternalKPIFormulaDSL.g:1:450: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 73 :
                // InternalKPIFormulaDSL.g:1:462: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 74 :
                // InternalKPIFormulaDSL.g:1:478: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 75 :
                // InternalKPIFormulaDSL.g:1:494: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 76 :
                // InternalKPIFormulaDSL.g:1:502: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\13\62\1\110\5\62\2\uffff\4\62\1\137\1\uffff\1\142\1\144\1\146\2\uffff\1\153\6\uffff\1\62\1\163\1\55\1\62\2\55\2\uffff\4\62\2\uffff\16\62\1\u008b\4\62\2\uffff\1\u0090\1\62\1\u0092\1\62\1\u0095\2\62\2\uffff\14\62\24\uffff\1\62\1\uffff\1\163\1\uffff\1\62\2\uffff\4\62\1\u00aa\6\62\1\u00b1\6\62\1\uffff\1\62\1\u00b9\2\62\1\uffff\1\62\1\uffff\1\u00bd\1\u00be\1\uffff\4\62\1\u00c3\4\62\1\u00c8\1\u00c9\3\62\1\u00cd\1\62\1\u00cf\1\u00d0\1\u00d1\1\62\1\uffff\6\62\1\uffff\1\62\1\u00da\5\62\1\uffff\3\62\2\uffff\1\u00e3\1\62\1\u00e5\1\62\1\uffff\4\62\2\uffff\3\62\1\uffff\1\62\3\uffff\1\u00ef\6\62\1\u00f6\1\uffff\1\u00f7\7\62\1\uffff\1\62\1\uffff\11\62\1\uffff\1\u0109\5\62\2\uffff\1\62\1\u0110\1\uffff\2\62\1\u0113\1\62\1\u0115\4\62\1\u011a\4\62\1\uffff\1\u011f\1\62\1\u0121\3\62\1\uffff\1\62\1\u0126\1\uffff\1\62\1\uffff\2\62\1\u012a\1\u012b\1\uffff\1\u012c\1\u012d\2\62\1\uffff\1\u0130\1\uffff\4\62\1\uffff\3\62\4\uffff\1\u0138\1\62\1\uffff\2\62\1\u013c\1\62\1\u013e\1\u013f\1\62\1\uffff\1\u0141\2\62\1\uffff\1\62\2\uffff\1\62\1\uffff\3\62\1\u0149\1\u014a\1\u014b\1\u014c\4\uffff";
    static final String DFA13_eofS =
        "\u014d\uffff";
    static final String DFA13_minS =
        "\1\0\13\56\1\75\5\56\2\uffff\4\56\1\76\1\uffff\3\75\2\uffff\1\52\6\uffff\2\56\1\101\1\56\2\0\2\uffff\4\56\2\uffff\23\56\2\uffff\7\56\2\uffff\14\56\24\uffff\1\56\1\uffff\1\56\1\uffff\1\56\2\uffff\22\56\1\uffff\4\56\1\uffff\1\56\1\uffff\2\56\1\uffff\24\56\1\uffff\6\56\1\uffff\7\56\1\uffff\3\56\2\uffff\4\56\1\uffff\4\56\2\uffff\3\56\1\uffff\1\56\3\uffff\10\56\1\uffff\3\56\1\40\4\56\1\uffff\1\56\1\uffff\11\56\1\uffff\6\56\2\uffff\2\56\1\uffff\16\56\1\uffff\6\56\1\uffff\2\56\1\uffff\1\56\1\uffff\4\56\1\uffff\4\56\1\uffff\1\56\1\uffff\4\56\1\uffff\3\56\4\uffff\2\56\1\uffff\7\56\1\uffff\3\56\1\uffff\1\56\2\uffff\1\56\1\uffff\7\56\4\uffff";
    static final String DFA13_maxS =
        "\1\uffff\13\172\1\75\5\172\2\uffff\4\172\1\76\1\uffff\3\75\2\uffff\1\57\6\uffff\1\172\1\71\2\172\2\uffff\2\uffff\4\172\2\uffff\23\172\2\uffff\7\172\2\uffff\14\172\24\uffff\1\172\1\uffff\1\71\1\uffff\1\172\2\uffff\22\172\1\uffff\4\172\1\uffff\1\172\1\uffff\2\172\1\uffff\24\172\1\uffff\6\172\1\uffff\7\172\1\uffff\3\172\2\uffff\4\172\1\uffff\4\172\2\uffff\3\172\1\uffff\1\172\3\uffff\10\172\1\uffff\10\172\1\uffff\1\172\1\uffff\11\172\1\uffff\6\172\2\uffff\2\172\1\uffff\16\172\1\uffff\6\172\1\uffff\2\172\1\uffff\1\172\1\uffff\4\172\1\uffff\4\172\1\uffff\1\172\1\uffff\4\172\1\uffff\3\172\4\uffff\2\172\1\uffff\7\172\1\uffff\3\172\1\uffff\1\172\2\uffff\1\172\1\uffff\7\172\4\uffff";
    static final String DFA13_acceptS =
        "\22\uffff\1\27\1\30\5\uffff\1\44\3\uffff\1\55\1\57\1\uffff\1\61\1\62\1\63\1\64\1\66\1\67\6\uffff\1\113\1\114\4\uffff\1\106\1\105\23\uffff\1\47\1\17\7\uffff\1\27\1\30\14\uffff\1\43\1\56\1\44\1\50\1\102\1\51\1\53\1\52\1\54\1\55\1\57\1\111\1\112\1\60\1\61\1\62\1\63\1\64\1\66\1\67\1\uffff\1\107\1\uffff\1\104\1\uffff\1\110\1\113\22\uffff\1\13\4\uffff\1\20\1\uffff\1\45\2\uffff\1\76\24\uffff\1\32\6\uffff\1\75\7\uffff\1\14\3\uffff\1\22\1\23\4\uffff\1\46\4\uffff\1\72\1\73\3\uffff\1\71\1\uffff\1\1\1\21\1\25\10\uffff\1\6\10\uffff\1\24\1\uffff\1\26\11\uffff\1\2\6\uffff\1\5\1\33\2\uffff\1\12\16\uffff\1\101\6\uffff\1\11\2\uffff\1\15\1\uffff\1\77\4\uffff\1\37\4\uffff\1\3\1\uffff\1\4\4\uffff\1\16\3\uffff\1\34\1\35\1\36\1\65\2\uffff\1\100\7\uffff\1\40\3\uffff\1\41\1\uffff\1\42\1\31\1\uffff\1\74\7\uffff\1\103\1\10\1\7\1\70";
    static final String DFA13_specialS =
        "\1\1\51\uffff\1\2\1\0\u0121\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\55\2\54\2\55\1\54\22\55\1\54\1\32\1\52\4\55\1\53\1\44\1\45\1\36\1\35\1\43\1\30\1\55\1\37\12\47\1\55\1\31\1\34\1\14\1\33\2\55\1\26\11\51\1\16\1\51\1\25\5\51\1\27\1\46\2\51\1\11\3\51\1\41\1\55\1\42\1\50\1\51\1\55\1\24\1\21\1\10\1\6\1\51\1\2\1\13\1\5\1\17\1\51\1\12\1\7\1\4\1\51\1\15\2\51\1\20\1\3\1\1\6\51\1\22\1\40\1\23\uff82\55",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\60\14\61\1\56\6\61\1\57\1\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\64\7\61\1\66\5\61\1\65\13\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\67\16\61\1\70\6\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\73\3\61\1\72\3\61\1\71\21\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\74\13\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\75\3\61\1\77\14\61\1\76\10\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\100\21\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\101\5\61",
            "\1\63\1\uffff\12\61\7\uffff\4\61\1\103\25\61\4\uffff\1\61\1\uffff\7\61\1\102\22\61",
            "\1\63\1\uffff\12\61\7\uffff\26\61\1\104\3\61\4\uffff\1\61\1\uffff\6\61\1\105\23\61",
            "\1\63\1\uffff\12\61\7\uffff\2\61\1\106\27\61\4\uffff\1\61\1\uffff\32\61",
            "\1\107",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\5\61\1\111\13\61\1\113\1\61\1\112\6\61",
            "\1\63\1\uffff\12\61\7\uffff\17\61\1\114\12\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\115\14\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\116\25\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\117\13\61",
            "",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\124\3\61\1\122\6\61\1\123\14\61",
            "\1\63\1\uffff\12\61\7\uffff\1\131\7\61\1\130\21\61\4\uffff\1\61\1\uffff\1\126\3\61\1\127\3\61\1\125\21\61",
            "\1\63\1\uffff\12\61\7\uffff\25\61\1\133\4\61\4\uffff\1\61\1\uffff\25\61\1\132\4\61",
            "\1\63\1\uffff\12\61\7\uffff\24\61\1\135\5\61\4\uffff\1\61\1\uffff\23\61\1\134\6\61",
            "\1\136",
            "",
            "\1\141",
            "\1\143",
            "\1\145",
            "",
            "",
            "\1\151\4\uffff\1\152",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63\1\uffff\12\61\7\uffff\7\61\1\162\22\61\4\uffff\1\61\1\uffff\32\61",
            "\1\165\1\uffff\12\164",
            "\32\166\4\uffff\1\166\1\uffff\32\166",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\0\167",
            "\0\167",
            "",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\171\5\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\17\61\1\172\12\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\27\61\1\173\2\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\174\16\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\175\10\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\176\16\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\177\27\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u0080\31\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u0082\1\61\1\u0081\14\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u0083\31\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\17\61\1\u0084\12\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\u0085\5\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\30\61\1\u0086\1\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u0087\21\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\25\61\1\u0088\4\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u0089\6\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\61\1\u008a\30\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\10\61\1\u008c\21\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\7\61\1\u008d\22\61",
            "\1\63\1\uffff\12\61\7\uffff\2\61\1\u008e\27\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\16\61\1\u008f\13\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\7\61\1\u0091\22\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\10\61\1\u0093\21\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u0094\6\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u0096\2\61\1\u0097\26\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\u0098\13\61",
            "",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\6\61\1\u0099\23\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u009a\26\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\u009b\27\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u009c\14\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\27\61\1\u009d\2\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u009e\26\61",
            "\1\63\1\uffff\12\61\7\uffff\15\61\1\u009f\14\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\27\61\1\u00a0\2\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00a1\25\61",
            "\1\63\1\uffff\12\61\7\uffff\4\61\1\u00a2\25\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u00a3\31\61",
            "\1\63\1\uffff\12\61\7\uffff\14\61\1\u00a4\15\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63\1\uffff\12\61\7\uffff\21\61\1\u00a5\10\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\165\1\uffff\12\164",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00a6\25\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00a7\25\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u00a8\6\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u00a9\7\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u00ab\6\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\u00ac\13\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u00ad\10\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\u00ae\5\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u00af\16\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u00b0\7\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u00b2\10\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u00b3\7\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\5\61\1\u00b4\24\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u00b5\21\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00b6\25\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u00b7\21\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\6\61\1\u00b8\23\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\16\61\1\u00ba\13\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\2\61\1\u00bb\7\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00bc\25\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u00bf\16\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\u00c0\5\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u00c1\16\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u00c2\10\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\u00c4\5\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u00c5\21\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u00c6\21\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u00c7\21\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u00ca\10\61",
            "\1\63\1\uffff\12\61\7\uffff\21\61\1\u00cb\10\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u00cc\14\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\4\61\1\u00ce\25\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00d2\25\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00d3\25\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u00d4\14\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u00d5\6\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u00d6\6\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u00d7\21\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\u00d8\5\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u00d9\7\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u00db\6\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u00dc\31\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u00dd\10\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\u00de\27\61",
            "\1\63\1\uffff\12\61\7\uffff\7\61\1\u00df\22\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\63\1\uffff\2\61\1\u00e0\7\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00e1\25\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u00e2\10\61",
            "",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\u00e4\27\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00e6\25\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\14\61\1\u00e7\15\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\14\61\1\u00e8\15\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\14\61\1\u00e9\15\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u00ea\31\61",
            "",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u00eb\31\61",
            "\1\63\1\uffff\12\61\7\uffff\1\u00ec\31\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u00ed\26\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\22\61\1\u00ee\7\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u00f0\10\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u00f1\26\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u00f2\21\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00f3\25\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u00f4\7\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u00f5\10\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u00f8\6\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u00f9\7\61",
            "\1\u00fa\15\uffff\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\23\61\1\u00fb\6\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00fc\25\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\20\61\1\u00fd\11\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\26\61\1\u00fe\3\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00ff\25\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\6\61\1\u0100\23\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\u0101\5\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\u0102\5\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\u0103\5\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u0104\14\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\6\61\1\u0105\23\61",
            "\1\63\1\uffff\12\61\7\uffff\6\61\1\u0106\23\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u0107\31\61",
            "\1\63\1\uffff\12\61\7\uffff\7\61\1\u0108\22\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u010a\7\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u010b\14\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u010c\7\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u010d\25\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u010e\25\61",
            "",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u010f\21\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\4\61\1\u0111\25\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\20\61\1\u0112\11\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\10\61\1\u0114\21\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u0116\31\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u0117\16\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\14\61\1\u0118\15\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\14\61\1\u0119\15\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u011b\25\61",
            "\1\63\1\uffff\12\61\7\uffff\4\61\1\u011c\25\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u011d\10\61",
            "\1\63\1\uffff\12\61\7\uffff\16\61\1\u011e\13\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\6\61\1\u0120\23\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\u0122\27\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\14\61\1\u0123\15\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\u0124\13\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\3\61\1\u0125\26\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u0127\7\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u0128\6\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1\u0129\31\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u012e\26\61",
            "\1\63\1\uffff\12\61\7\uffff\13\61\1\u012f\16\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\u0131\13\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0132\25\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u0133\14\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\u0134\1\uffff\32\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0135\25\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u0136\25\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u0137\6\61",
            "",
            "",
            "",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\3\61\1\u0139\26\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u013a\14\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\15\61\1\u013b\14\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\22\61\1\u013d\7\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\16\61\1\u0140\13\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u0142\26\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\23\61\1\u0143\6\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\24\61\1\u0144\5\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\21\61\1\u0145\10\61",
            "",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u0146\7\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u0147\7\61",
            "\1\63\1\uffff\12\61\7\uffff\14\61\1\u0148\15\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\1\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | RULE_DOUBLE | RULE_FQN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_43 = input.LA(1);

                        s = -1;
                        if ( ((LA13_43>='\u0000' && LA13_43<='\uFFFF')) ) {s = 119;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='t') ) {s = 1;}

                        else if ( (LA13_0=='f') ) {s = 2;}

                        else if ( (LA13_0=='s') ) {s = 3;}

                        else if ( (LA13_0=='m') ) {s = 4;}

                        else if ( (LA13_0=='h') ) {s = 5;}

                        else if ( (LA13_0=='d') ) {s = 6;}

                        else if ( (LA13_0=='l') ) {s = 7;}

                        else if ( (LA13_0=='c') ) {s = 8;}

                        else if ( (LA13_0=='W') ) {s = 9;}

                        else if ( (LA13_0=='k') ) {s = 10;}

                        else if ( (LA13_0=='g') ) {s = 11;}

                        else if ( (LA13_0=='=') ) {s = 12;}

                        else if ( (LA13_0=='o') ) {s = 13;}

                        else if ( (LA13_0=='K') ) {s = 14;}

                        else if ( (LA13_0=='i') ) {s = 15;}

                        else if ( (LA13_0=='r') ) {s = 16;}

                        else if ( (LA13_0=='b') ) {s = 17;}

                        else if ( (LA13_0=='{') ) {s = 18;}

                        else if ( (LA13_0=='}') ) {s = 19;}

                        else if ( (LA13_0=='a') ) {s = 20;}

                        else if ( (LA13_0=='M') ) {s = 21;}

                        else if ( (LA13_0=='A') ) {s = 22;}

                        else if ( (LA13_0=='S') ) {s = 23;}

                        else if ( (LA13_0=='-') ) {s = 24;}

                        else if ( (LA13_0==';') ) {s = 25;}

                        else if ( (LA13_0=='!') ) {s = 26;}

                        else if ( (LA13_0=='>') ) {s = 27;}

                        else if ( (LA13_0=='<') ) {s = 28;}

                        else if ( (LA13_0=='+') ) {s = 29;}

                        else if ( (LA13_0=='*') ) {s = 30;}

                        else if ( (LA13_0=='/') ) {s = 31;}

                        else if ( (LA13_0=='|') ) {s = 32;}

                        else if ( (LA13_0=='[') ) {s = 33;}

                        else if ( (LA13_0==']') ) {s = 34;}

                        else if ( (LA13_0==',') ) {s = 35;}

                        else if ( (LA13_0=='(') ) {s = 36;}

                        else if ( (LA13_0==')') ) {s = 37;}

                        else if ( (LA13_0=='T') ) {s = 38;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 39;}

                        else if ( (LA13_0=='^') ) {s = 40;}

                        else if ( ((LA13_0>='B' && LA13_0<='J')||LA13_0=='L'||(LA13_0>='N' && LA13_0<='R')||(LA13_0>='U' && LA13_0<='V')||(LA13_0>='X' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='e'||LA13_0=='j'||LA13_0=='n'||(LA13_0>='p' && LA13_0<='q')||(LA13_0>='u' && LA13_0<='z')) ) {s = 41;}

                        else if ( (LA13_0=='\"') ) {s = 42;}

                        else if ( (LA13_0=='\'') ) {s = 43;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 44;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='&')||LA13_0=='.'||LA13_0==':'||(LA13_0>='?' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_42 = input.LA(1);

                        s = -1;
                        if ( ((LA13_42>='\u0000' && LA13_42<='\uFFFF')) ) {s = 119;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}