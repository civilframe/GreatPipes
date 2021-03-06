// Generated from Tune.g4 by ANTLR 4.1

package pipes.editing.io;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TuneLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, TimeSignature=4, NOTENAME=5, NUMBER=6, EMBELLISHMENT=7, 
		WS=8, LINE=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'.'", "'-'", "'|'", "TimeSignature", "NOTENAME", "NUMBER", "EMBELLISHMENT", 
		"WS", "LINE"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "TimeSignature", "NOTENAME", "NUMBER", "EMBELLISHMENT", 
		"WS", "LINE"
	};


	public TuneLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tune.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\13V\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\6\7%\n\7\r\7\16\7"+
		"&\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\bK\n\b\3\t\6\tN\n\t\r\t\16\tO\3\n\5\nS\n\n\3\n\3\n\2\13\3\3\1\5\4\1\7"+
		"\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\3\2\4\5\2CCIIci\4\2\13\13"+
		"\"\"b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\27\3\2"+
		"\2\2\7\31\3\2\2\2\t\33\3\2\2\2\13!\3\2\2\2\r$\3\2\2\2\17J\3\2\2\2\21M"+
		"\3\2\2\2\23R\3\2\2\2\25\26\7\60\2\2\26\4\3\2\2\2\27\30\7/\2\2\30\6\3\2"+
		"\2\2\31\32\7~\2\2\32\b\3\2\2\2\33\34\7]\2\2\34\35\5\r\7\2\35\36\7\61\2"+
		"\2\36\37\5\r\7\2\37 \7_\2\2 \n\3\2\2\2!\"\t\2\2\2\"\f\3\2\2\2#%\4\62;"+
		"\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\16\3\2\2\2()\7)\2\2)K\7"+
		"C\2\2*+\7)\2\2+K\7I\2\2,-\7)\2\2-K\7f\2\2./\7)\2\2/K\7g\2\2\60\61\7f\2"+
		"\2\61\62\7d\2\2\62K\7n\2\2\63\64\7v\2\2\64\65\7j\2\2\65\66\7t\2\2\66K"+
		"\7y\2\2\678\7u\2\289\7v\2\29K\7t\2\2:;\7d\2\2;<\7k\2\2<=\7t\2\2=K\7n\2"+
		"\2>?\7i\2\2?@\7t\2\2@A\7k\2\2AK\7r\2\2BC\7v\2\2CD\7c\2\2DE\7q\2\2EK\7"+
		"t\2\2FG\7e\2\2GH\7t\2\2HI\7w\2\2IK\7p\2\2J(\3\2\2\2J*\3\2\2\2J,\3\2\2"+
		"\2J.\3\2\2\2J\60\3\2\2\2J\63\3\2\2\2J\67\3\2\2\2J:\3\2\2\2J>\3\2\2\2J"+
		"B\3\2\2\2JF\3\2\2\2K\20\3\2\2\2LN\t\3\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2"+
		"\2OP\3\2\2\2P\22\3\2\2\2QS\7\17\2\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7"+
		"\f\2\2U\24\3\2\2\2\7\2&JOR";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}