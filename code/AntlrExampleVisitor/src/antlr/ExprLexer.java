// Generated from Expr.g4 by ANTLR 4.9.2

    package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ID=5, NUM=6, INT_TYPE=7, COMMENT=8, WS=9, 
		NEWLINE=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "ID", "NUM", "INT_TYPE", "COMMENT", "WS", 
			"NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'='", "'*'", "'+'", null, null, "'INT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "ID", "NUM", "INT_TYPE", "COMMENT", "WS", 
			"NEWLINE"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fT\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\7\6\"\n\6\f\6\16\6%\13\6\3"+
		"\7\3\7\5\7)\n\7\3\7\3\7\7\7-\n\7\f\7\16\7\60\13\7\5\7\62\n\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\7\t<\n\t\f\t\16\t?\13\t\3\t\3\t\3\n\6\nD\n\n\r"+
		"\n\16\nE\3\n\3\n\3\13\5\13K\n\13\3\13\3\13\6\13O\n\13\r\13\16\13P\3\13"+
		"\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\b\3\2c|"+
		"\6\2\62;C\\aac|\3\2\63;\3\2\62;\4\2\f\f\17\17\4\2\13\f\"\"\2\\\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\31\3\2"+
		"\2\2\7\33\3\2\2\2\t\35\3\2\2\2\13\37\3\2\2\2\r\61\3\2\2\2\17\63\3\2\2"+
		"\2\21\67\3\2\2\2\23C\3\2\2\2\25N\3\2\2\2\27\30\7<\2\2\30\4\3\2\2\2\31"+
		"\32\7?\2\2\32\6\3\2\2\2\33\34\7,\2\2\34\b\3\2\2\2\35\36\7-\2\2\36\n\3"+
		"\2\2\2\37#\t\2\2\2 \"\t\3\2\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2"+
		"$\f\3\2\2\2%#\3\2\2\2&\62\7\62\2\2\')\7/\2\2(\'\3\2\2\2()\3\2\2\2)*\3"+
		"\2\2\2*.\t\4\2\2+-\t\5\2\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/"+
		"\62\3\2\2\2\60.\3\2\2\2\61&\3\2\2\2\61(\3\2\2\2\62\16\3\2\2\2\63\64\7"+
		"K\2\2\64\65\7P\2\2\65\66\7V\2\2\66\20\3\2\2\2\678\7/\2\289\7/\2\29=\3"+
		"\2\2\2:<\n\6\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3"+
		"\2\2\2@A\b\t\2\2A\22\3\2\2\2BD\t\7\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2E"+
		"F\3\2\2\2FG\3\2\2\2GH\b\n\2\2H\24\3\2\2\2IK\7\17\2\2JI\3\2\2\2JK\3\2\2"+
		"\2KL\3\2\2\2LO\7\f\2\2MO\7\17\2\2NJ\3\2\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2"+
		"\2\2PQ\3\2\2\2QR\3\2\2\2RS\b\13\2\2S\26\3\2\2\2\f\2#(.\61=EJNP\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}