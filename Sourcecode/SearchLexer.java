// Generated from org/jabref/search/Search.g4 by ANTLR 4.13.2

package org.jabref.search;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SearchLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, LPAREN=2, RPAREN=3, EQUAL=4, CEQUAL=5, EEQUAL=6, CEEQUAL=7, REQUAL=8, 
		CREEQUAL=9, NEQUAL=10, NCEQUAL=11, NEEQUAL=12, NCEEQUAL=13, NREQUAL=14, 
		NCREEQUAL=15, AND=16, OR=17, CONTAINS=18, MATCHES=19, NOT=20, FIELD=21, 
		STRING_LITERAL=22, TERM=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "LPAREN", "RPAREN", "EQUAL", "CEQUAL", "EEQUAL", "CEEQUAL", "REQUAL", 
			"CREEQUAL", "NEQUAL", "NCEQUAL", "NEEQUAL", "NCEEQUAL", "NREQUAL", "NCREEQUAL", 
			"AND", "OR", "CONTAINS", "MATCHES", "NOT", "FIELD", "STRING_LITERAL", 
			"TERM"
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


	public SearchLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Search.g4"; }

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

	public static final String _serializedATN =
		"\u0004\u0000\u0017\u009b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0004\u0000"+
		"1\b\u0000\u000b\u0000\f\u00002\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u0085\b\u0014"+
		"\n\u0014\f\u0014\u0088\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u008e\b\u0015\n\u0015\f\u0015\u0091\t\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0004\u0016\u0098\b\u0016"+
		"\u000b\u0016\f\u0016\u0099\u0000\u0000\u0017\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001\u0000\u0012\u0003\u0000"+
		"\t\n\r\r  \u0002\u0000AAaa\u0002\u0000NNnn\u0002\u0000DDdd\u0002\u0000"+
		"OOoo\u0002\u0000RRrr\u0002\u0000CCcc\u0002\u0000TTtt\u0002\u0000IIii\u0002"+
		"\u0000SSss\u0002\u0000MMmm\u0002\u0000HHhh\u0002\u0000EEee\u0002\u0000"+
		"AZaz\u0004\u0000--AZ__az\u0001\u0000\"\"\u0004\u0000!!()==~~\u0006\u0000"+
		"\t\n\r\r !()==~~\u00a0\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u00010\u0001\u0000\u0000\u0000\u00036\u0001\u0000\u0000"+
		"\u0000\u00058\u0001\u0000\u0000\u0000\u0007:\u0001\u0000\u0000\u0000\t"+
		"<\u0001\u0000\u0000\u0000\u000b?\u0001\u0000\u0000\u0000\rB\u0001\u0000"+
		"\u0000\u0000\u000fF\u0001\u0000\u0000\u0000\u0011I\u0001\u0000\u0000\u0000"+
		"\u0013M\u0001\u0000\u0000\u0000\u0015P\u0001\u0000\u0000\u0000\u0017T"+
		"\u0001\u0000\u0000\u0000\u0019X\u0001\u0000\u0000\u0000\u001b]\u0001\u0000"+
		"\u0000\u0000\u001da\u0001\u0000\u0000\u0000\u001ff\u0001\u0000\u0000\u0000"+
		"!j\u0001\u0000\u0000\u0000#m\u0001\u0000\u0000\u0000%v\u0001\u0000\u0000"+
		"\u0000\'~\u0001\u0000\u0000\u0000)\u0082\u0001\u0000\u0000\u0000+\u0089"+
		"\u0001\u0000\u0000\u0000-\u0097\u0001\u0000\u0000\u0000/1\u0007\u0000"+
		"\u0000\u00000/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"45\u0006\u0000\u0000\u00005\u0002\u0001\u0000\u0000\u000067\u0005(\u0000"+
		"\u00007\u0004\u0001\u0000\u0000\u000089\u0005)\u0000\u00009\u0006\u0001"+
		"\u0000\u0000\u0000:;\u0005=\u0000\u0000;\b\u0001\u0000\u0000\u0000<=\u0005"+
		"=\u0000\u0000=>\u0005!\u0000\u0000>\n\u0001\u0000\u0000\u0000?@\u0005"+
		"=\u0000\u0000@A\u0005=\u0000\u0000A\f\u0001\u0000\u0000\u0000BC\u0005"+
		"=\u0000\u0000CD\u0005=\u0000\u0000DE\u0005!\u0000\u0000E\u000e\u0001\u0000"+
		"\u0000\u0000FG\u0005=\u0000\u0000GH\u0005~\u0000\u0000H\u0010\u0001\u0000"+
		"\u0000\u0000IJ\u0005=\u0000\u0000JK\u0005~\u0000\u0000KL\u0005!\u0000"+
		"\u0000L\u0012\u0001\u0000\u0000\u0000MN\u0005!\u0000\u0000NO\u0005=\u0000"+
		"\u0000O\u0014\u0001\u0000\u0000\u0000PQ\u0005!\u0000\u0000QR\u0005=\u0000"+
		"\u0000RS\u0005!\u0000\u0000S\u0016\u0001\u0000\u0000\u0000TU\u0005!\u0000"+
		"\u0000UV\u0005=\u0000\u0000VW\u0005=\u0000\u0000W\u0018\u0001\u0000\u0000"+
		"\u0000XY\u0005!\u0000\u0000YZ\u0005=\u0000\u0000Z[\u0005=\u0000\u0000"+
		"[\\\u0005!\u0000\u0000\\\u001a\u0001\u0000\u0000\u0000]^\u0005!\u0000"+
		"\u0000^_\u0005=\u0000\u0000_`\u0005~\u0000\u0000`\u001c\u0001\u0000\u0000"+
		"\u0000ab\u0005!\u0000\u0000bc\u0005=\u0000\u0000cd\u0005~\u0000\u0000"+
		"de\u0005!\u0000\u0000e\u001e\u0001\u0000\u0000\u0000fg\u0007\u0001\u0000"+
		"\u0000gh\u0007\u0002\u0000\u0000hi\u0007\u0003\u0000\u0000i \u0001\u0000"+
		"\u0000\u0000jk\u0007\u0004\u0000\u0000kl\u0007\u0005\u0000\u0000l\"\u0001"+
		"\u0000\u0000\u0000mn\u0007\u0006\u0000\u0000no\u0007\u0004\u0000\u0000"+
		"op\u0007\u0002\u0000\u0000pq\u0007\u0007\u0000\u0000qr\u0007\u0001\u0000"+
		"\u0000rs\u0007\b\u0000\u0000st\u0007\u0002\u0000\u0000tu\u0007\t\u0000"+
		"\u0000u$\u0001\u0000\u0000\u0000vw\u0007\n\u0000\u0000wx\u0007\u0001\u0000"+
		"\u0000xy\u0007\u0007\u0000\u0000yz\u0007\u0006\u0000\u0000z{\u0007\u000b"+
		"\u0000\u0000{|\u0007\f\u0000\u0000|}\u0007\t\u0000\u0000}&\u0001\u0000"+
		"\u0000\u0000~\u007f\u0007\u0002\u0000\u0000\u007f\u0080\u0007\u0004\u0000"+
		"\u0000\u0080\u0081\u0007\u0007\u0000\u0000\u0081(\u0001\u0000\u0000\u0000"+
		"\u0082\u0086\u0007\r\u0000\u0000\u0083\u0085\u0007\u000e\u0000\u0000\u0084"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"*\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008f"+
		"\u0005\"\u0000\u0000\u008a\u008b\u0005\\\u0000\u0000\u008b\u008e\u0005"+
		"\"\u0000\u0000\u008c\u008e\b\u000f\u0000\u0000\u008d\u008a\u0001\u0000"+
		"\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000"+
		"\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0005\"\u0000\u0000\u0093,\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005\\\u0000\u0000\u0095\u0098\u0007\u0010\u0000\u0000"+
		"\u0096\u0098\b\u0011\u0000\u0000\u0097\u0094\u0001\u0000\u0000\u0000\u0097"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a"+
		".\u0001\u0000\u0000\u0000\b\u00002\u0084\u0086\u008d\u008f\u0097\u0099"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}