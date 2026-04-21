// Generated from org/jabref/logic/journals/ltwa/Ltwa.g4 by ANTLR 4.13.2

package org.jabref.logic.journals.ltwa;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LtwaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABBREVIATION=1, PART=2, ORDINAL=3, ARTICLE=4, STOPWORD=5, HYPHEN=6, SYMBOLS=7, 
		WORD=8, WS=9;
	public static final int
		RULE_title = 0, RULE_singleWordTitle = 1, RULE_stopwordPlusAny = 2, RULE_anyPlusSymbols = 3, 
		RULE_normalTitle = 4, RULE_titleElement = 5, RULE_article = 6, RULE_stopword = 7, 
		RULE_symbols = 8, RULE_ordinal = 9, RULE_word = 10, RULE_hyphen = 11, 
		RULE_part = 12, RULE_abbreviation = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"title", "singleWordTitle", "stopwordPlusAny", "anyPlusSymbols", "normalTitle", 
			"titleElement", "article", "stopword", "symbols", "ordinal", "word", 
			"hyphen", "part", "abbreviation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABBREVIATION", "PART", "ORDINAL", "ARTICLE", "STOPWORD", "HYPHEN", 
			"SYMBOLS", "WORD", "WS"
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
	public String getGrammarFileName() { return "Ltwa.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LtwaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TitleContext extends ParserRuleContext {
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
	 
		public TitleContext() { }
		public void copyFrom(TitleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleWordTitleFullContext extends TitleContext {
		public SingleWordTitleContext singleWordTitle() {
			return getRuleContext(SingleWordTitleContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LtwaParser.EOF, 0); }
		public SingleWordTitleFullContext(TitleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterSingleWordTitleFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitSingleWordTitleFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitSingleWordTitleFull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StopwordPlusTitleFullContext extends TitleContext {
		public StopwordPlusAnyContext stopwordPlusAny() {
			return getRuleContext(StopwordPlusAnyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LtwaParser.EOF, 0); }
		public StopwordPlusTitleFullContext(TitleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterStopwordPlusTitleFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitStopwordPlusTitleFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitStopwordPlusTitleFull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalTitleFullContext extends TitleContext {
		public NormalTitleContext normalTitle() {
			return getRuleContext(NormalTitleContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LtwaParser.EOF, 0); }
		public NormalTitleFullContext(TitleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterNormalTitleFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitNormalTitleFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitNormalTitleFull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyPlusSymbolsFullContext extends TitleContext {
		public AnyPlusSymbolsContext anyPlusSymbols() {
			return getRuleContext(AnyPlusSymbolsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LtwaParser.EOF, 0); }
		public AnyPlusSymbolsFullContext(TitleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterAnyPlusSymbolsFull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitAnyPlusSymbolsFull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitAnyPlusSymbolsFull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_title);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new SingleWordTitleFullContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				singleWordTitle();
				setState(29);
				match(EOF);
				}
				break;
			case 2:
				_localctx = new StopwordPlusTitleFullContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				stopwordPlusAny();
				setState(32);
				match(EOF);
				}
				break;
			case 3:
				_localctx = new AnyPlusSymbolsFullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				anyPlusSymbols();
				setState(35);
				match(EOF);
				}
				break;
			case 4:
				_localctx = new NormalTitleFullContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				normalTitle();
				setState(38);
				match(EOF);
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
	public static class SingleWordTitleContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(LtwaParser.WORD, 0); }
		public TerminalNode STOPWORD() { return getToken(LtwaParser.STOPWORD, 0); }
		public TerminalNode PART() { return getToken(LtwaParser.PART, 0); }
		public TerminalNode ORDINAL() { return getToken(LtwaParser.ORDINAL, 0); }
		public TerminalNode ABBREVIATION() { return getToken(LtwaParser.ABBREVIATION, 0); }
		public SingleWordTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleWordTitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterSingleWordTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitSingleWordTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitSingleWordTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleWordTitleContext singleWordTitle() throws RecognitionException {
		SingleWordTitleContext _localctx = new SingleWordTitleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleWordTitle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 302L) != 0)) ) {
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
	public static class StopwordPlusAnyContext extends ParserRuleContext {
		public TerminalNode STOPWORD() { return getToken(LtwaParser.STOPWORD, 0); }
		public TerminalNode WORD() { return getToken(LtwaParser.WORD, 0); }
		public TerminalNode PART() { return getToken(LtwaParser.PART, 0); }
		public TerminalNode ORDINAL() { return getToken(LtwaParser.ORDINAL, 0); }
		public TerminalNode ABBREVIATION() { return getToken(LtwaParser.ABBREVIATION, 0); }
		public StopwordPlusAnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stopwordPlusAny; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterStopwordPlusAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitStopwordPlusAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitStopwordPlusAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StopwordPlusAnyContext stopwordPlusAny() throws RecognitionException {
		StopwordPlusAnyContext _localctx = new StopwordPlusAnyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stopwordPlusAny);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(STOPWORD);
			setState(45);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 270L) != 0)) ) {
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
	public static class AnyPlusSymbolsContext extends ParserRuleContext {
		public TerminalNode SYMBOLS() { return getToken(LtwaParser.SYMBOLS, 0); }
		public TerminalNode WORD() { return getToken(LtwaParser.WORD, 0); }
		public TerminalNode STOPWORD() { return getToken(LtwaParser.STOPWORD, 0); }
		public TerminalNode PART() { return getToken(LtwaParser.PART, 0); }
		public TerminalNode ORDINAL() { return getToken(LtwaParser.ORDINAL, 0); }
		public TerminalNode ABBREVIATION() { return getToken(LtwaParser.ABBREVIATION, 0); }
		public AnyPlusSymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyPlusSymbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterAnyPlusSymbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitAnyPlusSymbols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitAnyPlusSymbols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyPlusSymbolsContext anyPlusSymbols() throws RecognitionException {
		AnyPlusSymbolsContext _localctx = new AnyPlusSymbolsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_anyPlusSymbols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 302L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(48);
			match(SYMBOLS);
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
	public static class NormalTitleContext extends ParserRuleContext {
		public List<TitleElementContext> titleElement() {
			return getRuleContexts(TitleElementContext.class);
		}
		public TitleElementContext titleElement(int i) {
			return getRuleContext(TitleElementContext.class,i);
		}
		public NormalTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalTitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterNormalTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitNormalTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitNormalTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalTitleContext normalTitle() throws RecognitionException {
		NormalTitleContext _localctx = new NormalTitleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_normalTitle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				titleElement();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 510L) != 0) );
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
	public static class TitleElementContext extends ParserRuleContext {
		public TitleElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titleElement; }
	 
		public TitleElementContext() { }
		public void copyFrom(TitleElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PartElementContext extends TitleElementContext {
		public PartContext part() {
			return getRuleContext(PartContext.class,0);
		}
		public PartElementContext(TitleElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterPartElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitPartElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitPartElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SymbolsElementContext extends TitleElementContext {
		public SymbolsContext symbols() {
			return getRuleContext(SymbolsContext.class,0);
		}
		public SymbolsElementContext(TitleElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterSymbolsElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitSymbolsElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitSymbolsElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AbbreviationElementContext extends TitleElementContext {
		public AbbreviationContext abbreviation() {
			return getRuleContext(AbbreviationContext.class,0);
		}
		public AbbreviationElementContext(TitleElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterAbbreviationElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitAbbreviationElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitAbbreviationElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrdinalElementContext extends TitleElementContext {
		public OrdinalContext ordinal() {
			return getRuleContext(OrdinalContext.class,0);
		}
		public OrdinalElementContext(TitleElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterOrdinalElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitOrdinalElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitOrdinalElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WordElementContext extends TitleElementContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public WordElementContext(TitleElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterWordElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitWordElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitWordElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArticleElementContext extends TitleElementContext {
		public ArticleContext article() {
			return getRuleContext(ArticleContext.class,0);
		}
		public ArticleElementContext(TitleElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterArticleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitArticleElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitArticleElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HyphenElementContext extends TitleElementContext {
		public HyphenContext hyphen() {
			return getRuleContext(HyphenContext.class,0);
		}
		public HyphenElementContext(TitleElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterHyphenElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitHyphenElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitHyphenElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StopwordElementContext extends TitleElementContext {
		public StopwordContext stopword() {
			return getRuleContext(StopwordContext.class,0);
		}
		public StopwordElementContext(TitleElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterStopwordElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitStopwordElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitStopwordElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleElementContext titleElement() throws RecognitionException {
		TitleElementContext _localctx = new TitleElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_titleElement);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARTICLE:
				_localctx = new ArticleElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				article();
				}
				break;
			case STOPWORD:
				_localctx = new StopwordElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				stopword();
				}
				break;
			case SYMBOLS:
				_localctx = new SymbolsElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				symbols();
				}
				break;
			case ORDINAL:
				_localctx = new OrdinalElementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				ordinal();
				}
				break;
			case WORD:
				_localctx = new WordElementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				word();
				}
				break;
			case HYPHEN:
				_localctx = new HyphenElementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				hyphen();
				}
				break;
			case PART:
				_localctx = new PartElementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(61);
				part();
				}
				break;
			case ABBREVIATION:
				_localctx = new AbbreviationElementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(62);
				abbreviation();
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
	public static class ArticleContext extends ParserRuleContext {
		public TerminalNode ARTICLE() { return getToken(LtwaParser.ARTICLE, 0); }
		public ArticleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_article; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterArticle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitArticle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitArticle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArticleContext article() throws RecognitionException {
		ArticleContext _localctx = new ArticleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_article);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(ARTICLE);
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
	public static class StopwordContext extends ParserRuleContext {
		public TerminalNode STOPWORD() { return getToken(LtwaParser.STOPWORD, 0); }
		public StopwordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stopword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterStopword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitStopword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitStopword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StopwordContext stopword() throws RecognitionException {
		StopwordContext _localctx = new StopwordContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stopword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(STOPWORD);
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
	public static class SymbolsContext extends ParserRuleContext {
		public TerminalNode SYMBOLS() { return getToken(LtwaParser.SYMBOLS, 0); }
		public SymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterSymbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitSymbols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitSymbols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolsContext symbols() throws RecognitionException {
		SymbolsContext _localctx = new SymbolsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_symbols);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(SYMBOLS);
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
	public static class OrdinalContext extends ParserRuleContext {
		public TerminalNode ORDINAL() { return getToken(LtwaParser.ORDINAL, 0); }
		public OrdinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordinal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterOrdinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitOrdinal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitOrdinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdinalContext ordinal() throws RecognitionException {
		OrdinalContext _localctx = new OrdinalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ordinal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ORDINAL);
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
	public static class WordContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(LtwaParser.WORD, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(WORD);
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
	public static class HyphenContext extends ParserRuleContext {
		public TerminalNode HYPHEN() { return getToken(LtwaParser.HYPHEN, 0); }
		public HyphenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hyphen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterHyphen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitHyphen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitHyphen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HyphenContext hyphen() throws RecognitionException {
		HyphenContext _localctx = new HyphenContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_hyphen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(HYPHEN);
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
	public static class PartContext extends ParserRuleContext {
		public TerminalNode PART() { return getToken(LtwaParser.PART, 0); }
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(PART);
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
	public static class AbbreviationContext extends ParserRuleContext {
		public TerminalNode ABBREVIATION() { return getToken(LtwaParser.ABBREVIATION, 0); }
		public AbbreviationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abbreviation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).enterAbbreviation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LtwaListener ) ((LtwaListener)listener).exitAbbreviation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LtwaVisitor ) return ((LtwaVisitor<? extends T>)visitor).visitAbbreviation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbbreviationContext abbreviation() throws RecognitionException {
		AbbreviationContext _localctx = new AbbreviationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_abbreviation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(ABBREVIATION);
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
		"\u0004\u0001\tR\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000)\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0004\u00044\b\u0004\u000b\u0004\f\u00045\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005@\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0000\u0000\u000e\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000"+
		"\u0002\u0003\u0000\u0001\u0003\u0005\u0005\b\b\u0002\u0000\u0001\u0003"+
		"\b\bN\u0000(\u0001\u0000\u0000\u0000\u0002*\u0001\u0000\u0000\u0000\u0004"+
		",\u0001\u0000\u0000\u0000\u0006/\u0001\u0000\u0000\u0000\b3\u0001\u0000"+
		"\u0000\u0000\n?\u0001\u0000\u0000\u0000\fA\u0001\u0000\u0000\u0000\u000e"+
		"C\u0001\u0000\u0000\u0000\u0010E\u0001\u0000\u0000\u0000\u0012G\u0001"+
		"\u0000\u0000\u0000\u0014I\u0001\u0000\u0000\u0000\u0016K\u0001\u0000\u0000"+
		"\u0000\u0018M\u0001\u0000\u0000\u0000\u001aO\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0003\u0002\u0001\u0000\u001d\u001e\u0005\u0000\u0000\u0001\u001e"+
		")\u0001\u0000\u0000\u0000\u001f \u0003\u0004\u0002\u0000 !\u0005\u0000"+
		"\u0000\u0001!)\u0001\u0000\u0000\u0000\"#\u0003\u0006\u0003\u0000#$\u0005"+
		"\u0000\u0000\u0001$)\u0001\u0000\u0000\u0000%&\u0003\b\u0004\u0000&\'"+
		"\u0005\u0000\u0000\u0001\')\u0001\u0000\u0000\u0000(\u001c\u0001\u0000"+
		"\u0000\u0000(\u001f\u0001\u0000\u0000\u0000(\"\u0001\u0000\u0000\u0000"+
		"(%\u0001\u0000\u0000\u0000)\u0001\u0001\u0000\u0000\u0000*+\u0007\u0000"+
		"\u0000\u0000+\u0003\u0001\u0000\u0000\u0000,-\u0005\u0005\u0000\u0000"+
		"-.\u0007\u0001\u0000\u0000.\u0005\u0001\u0000\u0000\u0000/0\u0007\u0000"+
		"\u0000\u000001\u0005\u0007\u0000\u00001\u0007\u0001\u0000\u0000\u0000"+
		"24\u0003\n\u0005\u000032\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000"+
		"53\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006\t\u0001\u0000\u0000"+
		"\u00007@\u0003\f\u0006\u00008@\u0003\u000e\u0007\u00009@\u0003\u0010\b"+
		"\u0000:@\u0003\u0012\t\u0000;@\u0003\u0014\n\u0000<@\u0003\u0016\u000b"+
		"\u0000=@\u0003\u0018\f\u0000>@\u0003\u001a\r\u0000?7\u0001\u0000\u0000"+
		"\u0000?8\u0001\u0000\u0000\u0000?9\u0001\u0000\u0000\u0000?:\u0001\u0000"+
		"\u0000\u0000?;\u0001\u0000\u0000\u0000?<\u0001\u0000\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@\u000b\u0001\u0000\u0000"+
		"\u0000AB\u0005\u0004\u0000\u0000B\r\u0001\u0000\u0000\u0000CD\u0005\u0005"+
		"\u0000\u0000D\u000f\u0001\u0000\u0000\u0000EF\u0005\u0007\u0000\u0000"+
		"F\u0011\u0001\u0000\u0000\u0000GH\u0005\u0003\u0000\u0000H\u0013\u0001"+
		"\u0000\u0000\u0000IJ\u0005\b\u0000\u0000J\u0015\u0001\u0000\u0000\u0000"+
		"KL\u0005\u0006\u0000\u0000L\u0017\u0001\u0000\u0000\u0000MN\u0005\u0002"+
		"\u0000\u0000N\u0019\u0001\u0000\u0000\u0000OP\u0005\u0001\u0000\u0000"+
		"P\u001b\u0001\u0000\u0000\u0000\u0003(5?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}