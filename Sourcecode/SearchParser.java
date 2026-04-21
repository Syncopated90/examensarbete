// Generated from org/jabref/search/Search.g4 by ANTLR 4.13.2

package org.jabref.search;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SearchParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, LPAREN=2, RPAREN=3, EQUAL=4, CEQUAL=5, EEQUAL=6, CEEQUAL=7, REQUAL=8, 
		CREEQUAL=9, NEQUAL=10, NCEQUAL=11, NEEQUAL=12, NCEEQUAL=13, NREQUAL=14, 
		NCREEQUAL=15, AND=16, OR=17, CONTAINS=18, MATCHES=19, NOT=20, FIELD=21, 
		STRING_LITERAL=22, TERM=23;
	public static final int
		RULE_start = 0, RULE_andExpression = 1, RULE_expression = 2, RULE_comparison = 3, 
		RULE_operator = 4, RULE_searchValue = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "andExpression", "expression", "comparison", "operator", "searchValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'='", "'=!'", "'=='", "'==!'", "'=~'", "'=~!'", 
			"'!='", "'!=!'", "'!=='", "'!==!'", "'!=~'", "'!=~!'", "'AND'", "'OR'", 
			"'CONTAINS'", "'MATCHES'", "'NOT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LPAREN", "RPAREN", "EQUAL", "CEQUAL", "EEQUAL", "CEEQUAL", 
			"REQUAL", "CREEQUAL", "NEQUAL", "NCEQUAL", "NEEQUAL", "NCEEQUAL", "NREQUAL", 
			"NCREEQUAL", "AND", "OR", "CONTAINS", "MATCHES", "NOT", "FIELD", "STRING_LITERAL", 
			"TERM"
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

	@Override
	public String getGrammarFileName() { return "Search.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SearchParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SearchParser.EOF, 0); }
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchListener ) ((SearchListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchListener ) ((SearchListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchVisitor ) return ((SearchVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				match(EOF);
				}
				break;
			case LPAREN:
			case NOT:
			case FIELD:
			case STRING_LITERAL:
			case TERM:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				andExpression();
				setState(14);
				match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AndExpressionContext extends ParserRuleContext {
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
	 
		public AndExpressionContext() { }
		public void copyFrom(AndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImplicitAndExpressionContext extends AndExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ImplicitAndExpressionContext(AndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchListener ) ((SearchListener)listener).enterImplicitAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchListener ) ((SearchListener)listener).exitImplicitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchVisitor ) return ((SearchVisitor<? extends T>)visitor).visitImplicitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_andExpression);
		int _la;
		try {
			_localctx = new ImplicitAndExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				expression(0);
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 15728644L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token bin_op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SearchParser.AND, 0); }
		public TerminalNode OR() { return getToken(SearchParser.OR, 0); }
		public BinaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchListener ) ((SearchListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchListener ) ((SearchListener)listener).exitBinaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchVisitor ) return ((SearchVisitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegatedExpressionContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(SearchParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegatedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchListener ) ((SearchListener)listener).enterNegatedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchListener ) ((SearchListener)listener).exitNegatedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchVisitor ) return ((SearchVisitor<? extends T>)visitor).visitNegatedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ExpressionContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchListener ) ((SearchListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchListener ) ((SearchListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchVisitor ) return ((SearchVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(SearchParser.LPAREN, 0); }
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SearchParser.RPAREN, 0); }
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchListener ) ((SearchListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchListener ) ((SearchListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchVisitor ) return ((SearchVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(24);
				match(LPAREN);
				setState(25);
				andExpression();
				setState(26);
				match(RPAREN);
				}
				break;
			case NOT:
				{
				_localctx = new NegatedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28);
				match(NOT);
				setState(29);
				expression(4);
				}
				break;
			case FIELD:
			case STRING_LITERAL:
			case TERM:
				{
				_localctx = new ComparisonExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				comparison();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(39);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(33);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(34);
						((BinaryExpressionContext)_localctx).bin_op = match(AND);
						setState(35);
						((BinaryExpressionContext)_localctx).right = expression(4);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(36);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(37);
						((BinaryExpressionContext)_localctx).bin_op = match(OR);
						setState(38);
						((BinaryExpressionContext)_localctx).right = expression(3);
						}
						break;
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(SearchParser.FIELD, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public SearchValueContext searchValue() {
			return getRuleContext(SearchValueContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchListener ) ((SearchListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchListener ) ((SearchListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchVisitor ) return ((SearchVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comparison);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(FIELD);
				setState(45);
				operator();
				setState(46);
				searchValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				searchValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(SearchParser.EQUAL, 0); }
		public TerminalNode CEQUAL() { return getToken(SearchParser.CEQUAL, 0); }
		public TerminalNode EEQUAL() { return getToken(SearchParser.EEQUAL, 0); }
		public TerminalNode CEEQUAL() { return getToken(SearchParser.CEEQUAL, 0); }
		public TerminalNode REQUAL() { return getToken(SearchParser.REQUAL, 0); }
		public TerminalNode CREEQUAL() { return getToken(SearchParser.CREEQUAL, 0); }
		public TerminalNode NEQUAL() { return getToken(SearchParser.NEQUAL, 0); }
		public TerminalNode NCEQUAL() { return getToken(SearchParser.NCEQUAL, 0); }
		public TerminalNode NEEQUAL() { return getToken(SearchParser.NEEQUAL, 0); }
		public TerminalNode NCEEQUAL() { return getToken(SearchParser.NCEEQUAL, 0); }
		public TerminalNode NREQUAL() { return getToken(SearchParser.NREQUAL, 0); }
		public TerminalNode NCREEQUAL() { return getToken(SearchParser.NCREEQUAL, 0); }
		public TerminalNode CONTAINS() { return getToken(SearchParser.CONTAINS, 0); }
		public TerminalNode MATCHES() { return getToken(SearchParser.MATCHES, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchListener ) ((SearchListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchListener ) ((SearchListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchVisitor ) return ((SearchVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 851952L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SearchValueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SearchParser.STRING_LITERAL, 0); }
		public TerminalNode FIELD() { return getToken(SearchParser.FIELD, 0); }
		public TerminalNode TERM() { return getToken(SearchParser.TERM, 0); }
		public SearchValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchListener ) ((SearchListener)listener).enterSearchValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchListener ) ((SearchListener)listener).exitSearchValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchVisitor ) return ((SearchVisitor<? extends T>)visitor).visitSearchValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchValueContext searchValue() throws RecognitionException {
		SearchValueContext _localctx = new SearchValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_searchValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00178\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u0011\b\u0000\u0001\u0001\u0004\u0001\u0014\b\u0001\u000b\u0001"+
		"\f\u0001\u0015\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002 \b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"(\b\u0002\n\u0002\f\u0002+\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u00032\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0000\u0001\u0004\u0006\u0000\u0002"+
		"\u0004\u0006\b\n\u0000\u0002\u0002\u0000\u0004\u000f\u0012\u0013\u0001"+
		"\u0000\u0015\u00178\u0000\u0010\u0001\u0000\u0000\u0000\u0002\u0013\u0001"+
		"\u0000\u0000\u0000\u0004\u001f\u0001\u0000\u0000\u0000\u00061\u0001\u0000"+
		"\u0000\u0000\b3\u0001\u0000\u0000\u0000\n5\u0001\u0000\u0000\u0000\f\u0011"+
		"\u0005\u0000\u0000\u0001\r\u000e\u0003\u0002\u0001\u0000\u000e\u000f\u0005"+
		"\u0000\u0000\u0001\u000f\u0011\u0001\u0000\u0000\u0000\u0010\f\u0001\u0000"+
		"\u0000\u0000\u0010\r\u0001\u0000\u0000\u0000\u0011\u0001\u0001\u0000\u0000"+
		"\u0000\u0012\u0014\u0003\u0004\u0002\u0000\u0013\u0012\u0001\u0000\u0000"+
		"\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000"+
		"\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0003\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0006\u0002\uffff\uffff\u0000\u0018\u0019\u0005\u0002"+
		"\u0000\u0000\u0019\u001a\u0003\u0002\u0001\u0000\u001a\u001b\u0005\u0003"+
		"\u0000\u0000\u001b \u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0014\u0000"+
		"\u0000\u001d \u0003\u0004\u0002\u0004\u001e \u0003\u0006\u0003\u0000\u001f"+
		"\u0017\u0001\u0000\u0000\u0000\u001f\u001c\u0001\u0000\u0000\u0000\u001f"+
		"\u001e\u0001\u0000\u0000\u0000 )\u0001\u0000\u0000\u0000!\"\n\u0003\u0000"+
		"\u0000\"#\u0005\u0010\u0000\u0000#(\u0003\u0004\u0002\u0004$%\n\u0002"+
		"\u0000\u0000%&\u0005\u0011\u0000\u0000&(\u0003\u0004\u0002\u0003\'!\u0001"+
		"\u0000\u0000\u0000\'$\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000"+
		")\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*\u0005\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000,-\u0005\u0015\u0000\u0000-.\u0003"+
		"\b\u0004\u0000./\u0003\n\u0005\u0000/2\u0001\u0000\u0000\u000002\u0003"+
		"\n\u0005\u00001,\u0001\u0000\u0000\u000010\u0001\u0000\u0000\u00002\u0007"+
		"\u0001\u0000\u0000\u000034\u0007\u0000\u0000\u00004\t\u0001\u0000\u0000"+
		"\u000056\u0007\u0001\u0000\u00006\u000b\u0001\u0000\u0000\u0000\u0006"+
		"\u0010\u0015\u001f\')1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}