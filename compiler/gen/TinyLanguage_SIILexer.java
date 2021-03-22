// Generated from C:/Users/Administrateur/IdeaProjects/compiler/src\TinyLanguage_SII.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TinyLanguage_SIILexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, ID=19, COMPIL=20, Var=21, NomProg=22, COMM=23, Space=24, Op=25, 
		Entier=26, Reel=27, Comp=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "ID", "COMPIL", "Var", "NomProg", "COMM", "Space", "Op", "Entier", 
			"Reel", "Comp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'()'", "'{'", "'}'", "';'", "'intCompil'", "'floatCompil'", "'StringCompil'", 
			"','", "'if'", "'('", "')'", "'then'", "'else'", "'do'", "'while'", "'scanCompil'", 
			"'printCompil ('", "') ;'", null, "'COMPIL'", null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ID", "COMPIL", "Var", "NomProg", 
			"COMM", "Space", "Op", "Entier", "Reel", "Comp"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public TinyLanguage_SIILexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TinyLanguage_SII.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 22:
			COMM_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			Space_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void Space_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00e7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\7\24\u00a3\n\24\f\24\16\24\u00a6\13\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\6\26\u00b0\n\26\r\26\16\26\u00b1\3\27\3\27\7"+
		"\27\u00b6\n\27\f\27\16\27\u00b9\13\27\3\30\3\30\3\30\3\30\7\30\u00bf\n"+
		"\30\f\30\16\30\u00c2\13\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\6\33\u00d0\n\33\r\33\16\33\u00d1\3\34\6\34\u00d5\n\34"+
		"\r\34\16\34\u00d6\3\34\5\34\u00da\n\34\3\34\6\34\u00dd\n\34\r\34\16\34"+
		"\u00de\3\35\3\35\3\35\3\35\3\35\5\35\u00e6\n\35\2\2\36\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\t\4\2C\\c|\6\2\""+
		"\"\62;C\\c|\3\2C\\\5\2\"\"C\\c|\5\2,-//\61\61\3\2\62;\4\2>>@@\2\u00f0"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3"+
		"\2\2\2\5>\3\2\2\2\7@\3\2\2\2\tB\3\2\2\2\13D\3\2\2\2\rN\3\2\2\2\17Z\3\2"+
		"\2\2\21g\3\2\2\2\23i\3\2\2\2\25l\3\2\2\2\27n\3\2\2\2\31p\3\2\2\2\33u\3"+
		"\2\2\2\35z\3\2\2\2\37}\3\2\2\2!\u0083\3\2\2\2#\u008e\3\2\2\2%\u009c\3"+
		"\2\2\2\'\u00a0\3\2\2\2)\u00a7\3\2\2\2+\u00af\3\2\2\2-\u00b3\3\2\2\2/\u00ba"+
		"\3\2\2\2\61\u00c8\3\2\2\2\63\u00cc\3\2\2\2\65\u00cf\3\2\2\2\67\u00d4\3"+
		"\2\2\29\u00e5\3\2\2\2;<\7*\2\2<=\7+\2\2=\4\3\2\2\2>?\7}\2\2?\6\3\2\2\2"+
		"@A\7\177\2\2A\b\3\2\2\2BC\7=\2\2C\n\3\2\2\2DE\7k\2\2EF\7p\2\2FG\7v\2\2"+
		"GH\7E\2\2HI\7q\2\2IJ\7o\2\2JK\7r\2\2KL\7k\2\2LM\7n\2\2M\f\3\2\2\2NO\7"+
		"h\2\2OP\7n\2\2PQ\7q\2\2QR\7c\2\2RS\7v\2\2ST\7E\2\2TU\7q\2\2UV\7o\2\2V"+
		"W\7r\2\2WX\7k\2\2XY\7n\2\2Y\16\3\2\2\2Z[\7U\2\2[\\\7v\2\2\\]\7t\2\2]^"+
		"\7k\2\2^_\7p\2\2_`\7i\2\2`a\7E\2\2ab\7q\2\2bc\7o\2\2cd\7r\2\2de\7k\2\2"+
		"ef\7n\2\2f\20\3\2\2\2gh\7.\2\2h\22\3\2\2\2ij\7k\2\2jk\7h\2\2k\24\3\2\2"+
		"\2lm\7*\2\2m\26\3\2\2\2no\7+\2\2o\30\3\2\2\2pq\7v\2\2qr\7j\2\2rs\7g\2"+
		"\2st\7p\2\2t\32\3\2\2\2uv\7g\2\2vw\7n\2\2wx\7u\2\2xy\7g\2\2y\34\3\2\2"+
		"\2z{\7f\2\2{|\7q\2\2|\36\3\2\2\2}~\7y\2\2~\177\7j\2\2\177\u0080\7k\2\2"+
		"\u0080\u0081\7n\2\2\u0081\u0082\7g\2\2\u0082 \3\2\2\2\u0083\u0084\7u\2"+
		"\2\u0084\u0085\7e\2\2\u0085\u0086\7c\2\2\u0086\u0087\7p\2\2\u0087\u0088"+
		"\7E\2\2\u0088\u0089\7q\2\2\u0089\u008a\7o\2\2\u008a\u008b\7r\2\2\u008b"+
		"\u008c\7k\2\2\u008c\u008d\7n\2\2\u008d\"\3\2\2\2\u008e\u008f\7r\2\2\u008f"+
		"\u0090\7t\2\2\u0090\u0091\7k\2\2\u0091\u0092\7p\2\2\u0092\u0093\7v\2\2"+
		"\u0093\u0094\7E\2\2\u0094\u0095\7q\2\2\u0095\u0096\7o\2\2\u0096\u0097"+
		"\7r\2\2\u0097\u0098\7k\2\2\u0098\u0099\7n\2\2\u0099\u009a\7\"\2\2\u009a"+
		"\u009b\7*\2\2\u009b$\3\2\2\2\u009c\u009d\7+\2\2\u009d\u009e\7\"\2\2\u009e"+
		"\u009f\7=\2\2\u009f&\3\2\2\2\u00a0\u00a4\t\2\2\2\u00a1\u00a3\t\3\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5(\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7E\2\2\u00a8\u00a9"+
		"\7Q\2\2\u00a9\u00aa\7O\2\2\u00aa\u00ab\7R\2\2\u00ab\u00ac\7K\2\2\u00ac"+
		"\u00ad\7N\2\2\u00ad*\3\2\2\2\u00ae\u00b0\13\2\2\2\u00af\u00ae\3\2\2\2"+
		"\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2,\3"+
		"\2\2\2\u00b3\u00b7\t\4\2\2\u00b4\u00b6\t\5\2\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8.\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\61\2\2\u00bb\u00bc\7,\2\2\u00bc\u00c0"+
		"\3\2\2\2\u00bd\u00bf\13\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2"+
		"\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c3\u00c4\7,\2\2\u00c4\u00c5\7\61\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c7\b\30\2\2\u00c7\60\3\2\2\2\u00c8\u00c9\7\"\2\2\u00c9\u00ca\3\2\2"+
		"\2\u00ca\u00cb\b\31\3\2\u00cb\62\3\2\2\2\u00cc\u00cd\t\6\2\2\u00cd\64"+
		"\3\2\2\2\u00ce\u00d0\t\7\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\66\3\2\2\2\u00d3\u00d5\t\7\2"+
		"\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00da\7.\2\2\u00d9\u00d8\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00dd\t\7\2\2\u00dc\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"8\3\2\2\2\u00e0\u00e6\t\b\2\2\u00e1\u00e2\7?\2\2\u00e2\u00e6\7?\2\2\u00e3"+
		"\u00e4\7#\2\2\u00e4\u00e6\7?\2\2\u00e5\u00e0\3\2\2\2\u00e5\u00e1\3\2\2"+
		"\2\u00e5\u00e3\3\2\2\2\u00e6:\3\2\2\2\f\2\u00a4\u00b1\u00b7\u00c0\u00d1"+
		"\u00d6\u00d9\u00de\u00e5\4\3\30\2\3\31\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}