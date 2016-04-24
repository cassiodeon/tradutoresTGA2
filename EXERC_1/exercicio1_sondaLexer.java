// Generated from exercicio1_sonda.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class exercicio1_sondaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Numero=9, 
		NEWLINE=10, WS=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "Numero", 
		"NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'ENTAO'", "'APOS'", "'FRENTE'", "'ESQUERDA'", "'DIREITA'", 
		"'TRAS'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "Numero", "NEWLINE", 
		"WS"
	};
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


	public exercicio1_sondaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "exercicio1_sonda.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\r^\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\6\nG\n\n\r\n\16\n"+
		"H\3\n\3\n\6\nM\n\n\r\n\16\nN\7\nQ\n\n\f\n\16\nT\13\n\3\13\6\13W\n\13\r"+
		"\13\16\13X\3\f\3\f\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\3\2\5\3\2\62;\4\2\f\f\17\17\5\2\"\"VV^^a\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5\33"+
		"\3\2\2\2\7\35\3\2\2\2\t#\3\2\2\2\13(\3\2\2\2\r/\3\2\2\2\178\3\2\2\2\21"+
		"@\3\2\2\2\23F\3\2\2\2\25V\3\2\2\2\27Z\3\2\2\2\31\32\7*\2\2\32\4\3\2\2"+
		"\2\33\34\7+\2\2\34\6\3\2\2\2\35\36\7G\2\2\36\37\7P\2\2\37 \7V\2\2 !\7"+
		"C\2\2!\"\7Q\2\2\"\b\3\2\2\2#$\7C\2\2$%\7R\2\2%&\7Q\2\2&\'\7U\2\2\'\n\3"+
		"\2\2\2()\7H\2\2)*\7T\2\2*+\7G\2\2+,\7P\2\2,-\7V\2\2-.\7G\2\2.\f\3\2\2"+
		"\2/\60\7G\2\2\60\61\7U\2\2\61\62\7S\2\2\62\63\7W\2\2\63\64\7G\2\2\64\65"+
		"\7T\2\2\65\66\7F\2\2\66\67\7C\2\2\67\16\3\2\2\289\7F\2\29:\7K\2\2:;\7"+
		"T\2\2;<\7G\2\2<=\7K\2\2=>\7V\2\2>?\7C\2\2?\20\3\2\2\2@A\7V\2\2AB\7T\2"+
		"\2BC\7C\2\2CD\7U\2\2D\22\3\2\2\2EG\t\2\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2"+
		"\2HI\3\2\2\2IR\3\2\2\2JL\13\2\2\2KM\t\2\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2"+
		"\2\2NO\3\2\2\2OQ\3\2\2\2PJ\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\24\3"+
		"\2\2\2TR\3\2\2\2UW\t\3\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\26"+
		"\3\2\2\2Z[\t\4\2\2[\\\3\2\2\2\\]\b\f\2\2]\30\3\2\2\2\7\2HNRX\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}