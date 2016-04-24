// Generated from exercicio1_sonda.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class exercicio1_sondaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Numero=9, 
		NEWLINE=10, WS=11;
	public static final int
		RULE_instrucao = 0, RULE_comando = 1, RULE_condicao = 2, RULE_basico = 3, 
		RULE_distancia = 4;
	public static final String[] ruleNames = {
		"instrucao", "comando", "condicao", "basico", "distancia"
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

	@Override
	public String getGrammarFileName() { return "exercicio1_sonda.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public exercicio1_sondaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InstrucaoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(exercicio1_sondaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(exercicio1_sondaParser.NEWLINE, i);
		}
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exercicio1_sondaListener ) ((exercicio1_sondaListener)listener).enterInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exercicio1_sondaListener ) ((exercicio1_sondaListener)listener).exitInstrucao(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_instrucao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				{
				setState(10);
				comando();
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(11);
					match(NEWLINE);
					}
					}
					setState(16);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoContext extends ParserRuleContext {
		public BasicoContext basico() {
			return getRuleContext(BasicoContext.class,0);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exercicio1_sondaListener ) ((exercicio1_sondaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exercicio1_sondaListener ) ((exercicio1_sondaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comando);
		try {
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				basico();
				setState(23);
				condicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				basico();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				match(T__0);
				setState(27);
				comando();
				setState(28);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicaoContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exercicio1_sondaListener ) ((exercicio1_sondaListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exercicio1_sondaListener ) ((exercicio1_sondaListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_condicao);
		try {
			setState(36);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(T__2);
				setState(33);
				comando();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(T__3);
				setState(35);
				comando();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicoContext extends ParserRuleContext {
		public DistanciaContext distancia() {
			return getRuleContext(DistanciaContext.class,0);
		}
		public BasicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exercicio1_sondaListener ) ((exercicio1_sondaListener)listener).enterBasico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exercicio1_sondaListener ) ((exercicio1_sondaListener)listener).exitBasico(this);
		}
	}

	public final BasicoContext basico() throws RecognitionException {
		BasicoContext _localctx = new BasicoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_basico);
		try {
			setState(46);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(T__4);
				setState(39);
				distancia();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(T__5);
				setState(41);
				distancia();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(T__6);
				setState(43);
				distancia();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(T__7);
				setState(45);
				distancia();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistanciaContext extends ParserRuleContext {
		public TerminalNode Numero() { return getToken(exercicio1_sondaParser.Numero, 0); }
		public DistanciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distancia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exercicio1_sondaListener ) ((exercicio1_sondaListener)listener).enterDistancia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exercicio1_sondaListener ) ((exercicio1_sondaListener)listener).exitDistancia(this);
		}
	}

	public final DistanciaContext distancia() throws RecognitionException {
		DistanciaContext _localctx = new DistanciaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_distancia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(Numero);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r\65\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\7\2\24"+
		"\n\2\f\2\16\2\27\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\4\3\4"+
		"\3\4\3\4\5\4\'\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\61\n\5\3\6\3\6"+
		"\3\6\2\2\7\2\4\6\b\n\2\2\67\2\25\3\2\2\2\4 \3\2\2\2\6&\3\2\2\2\b\60\3"+
		"\2\2\2\n\62\3\2\2\2\f\20\5\4\3\2\r\17\7\f\2\2\16\r\3\2\2\2\17\22\3\2\2"+
		"\2\20\16\3\2\2\2\20\21\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\23\f\3\2\2"+
		"\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\25\3\2\2"+
		"\2\30\31\5\b\5\2\31\32\5\6\4\2\32!\3\2\2\2\33!\5\b\5\2\34\35\7\3\2\2\35"+
		"\36\5\4\3\2\36\37\7\4\2\2\37!\3\2\2\2 \30\3\2\2\2 \33\3\2\2\2 \34\3\2"+
		"\2\2!\5\3\2\2\2\"#\7\5\2\2#\'\5\4\3\2$%\7\6\2\2%\'\5\4\3\2&\"\3\2\2\2"+
		"&$\3\2\2\2\'\7\3\2\2\2()\7\7\2\2)\61\5\n\6\2*+\7\b\2\2+\61\5\n\6\2,-\7"+
		"\t\2\2-\61\5\n\6\2./\7\n\2\2/\61\5\n\6\2\60(\3\2\2\2\60*\3\2\2\2\60,\3"+
		"\2\2\2\60.\3\2\2\2\61\t\3\2\2\2\62\63\7\13\2\2\63\13\3\2\2\2\7\20\25 "+
		"&\60";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}