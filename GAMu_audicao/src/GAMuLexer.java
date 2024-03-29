// Generated from GAMu.g4 by ANTLR 4.5.1

        import java.util.*;
        import java.lang.*;
        import java.text.*;
        import java.io.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GAMuLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		NOME=18, PAL=19, DATA=20, ANO=21, ID=22, HORA=23, DURACAO=24, SEGUNDOS=25, 
		INT=26, WS=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"NOME", "PAL", "DATA", "MES", "DIA", "ANO", "ID", "HORA", "DURACAO", "SEGUNDOS", 
		"HORAS", "MINUTOS", "INT", "WS", "STRING", "ESC_SEQ", "OCTAL_ESC", "UNICODE_ESC", 
		"HEX_DIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'AUDICAO:'", "'.'", "'TITULO'", "':'", "'SUBTITULO'", "'TEMA'", 
		"'DATA'", "'HORA'", "'LOCAL'", "'ORGANIZADOR'", "'DURACAO'", "'ATUACAO'", 
		"'OBRA'", "'INSTRUMENTOS'", "','", "'MAESTROS'", "'MUSICOS'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "NOME", "PAL", "DATA", "ANO", "ID", 
		"HORA", "DURACAO", "SEGUNDOS", "INT", "WS"
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





	public GAMuLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GAMu.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u0126\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\24\6\24\u00c3\n\24\r\24\16\24\u00c4\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\6\26\u00ce\n\26\r\26\16\26\u00cf\3\27\6\27\u00d3\n\27\r\27\16\27\u00d4"+
		"\3\30\6\30\u00d8\n\30\r\30\16\30\u00d9\3\31\6\31\u00dd\n\31\r\31\16\31"+
		"\u00de\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\6\34\u00ec"+
		"\n\34\r\34\16\34\u00ed\3\35\6\35\u00f1\n\35\r\35\16\35\u00f2\3\36\6\36"+
		"\u00f6\n\36\r\36\16\36\u00f7\3\37\6\37\u00fb\n\37\r\37\16\37\u00fc\3 "+
		"\3 \3 \3 \3!\3!\3!\7!\u0106\n!\f!\16!\u0109\13!\3!\3!\3\"\3\"\3\"\3\""+
		"\5\"\u0111\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u011c\n#\3$\3$\3$\3$\3$\3"+
		"$\3$\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\2/\27\61\30\63\31\65\32"+
		"\67\339\2;\2=\34?\35A\2C\2E\2G\2I\2\3\2\t\4\2C\\c|\3\2\62;\7\2))\62;C"+
		"\\aac|\5\2\13\f\17\17\"\"\3\2$$\n\2$$))^^ddhhppttvv\5\2\62;CHch\u012b"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3K\3\2\2\2\5T\3"+
		"\2\2\2\7V\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\ri\3\2\2\2\17n\3\2\2\2\21s\3"+
		"\2\2\2\23x\3\2\2\2\25~\3\2\2\2\27\u008a\3\2\2\2\31\u0092\3\2\2\2\33\u009a"+
		"\3\2\2\2\35\u009f\3\2\2\2\37\u00ac\3\2\2\2!\u00ae\3\2\2\2#\u00b7\3\2\2"+
		"\2%\u00bf\3\2\2\2\'\u00c2\3\2\2\2)\u00c6\3\2\2\2+\u00cd\3\2\2\2-\u00d2"+
		"\3\2\2\2/\u00d7\3\2\2\2\61\u00dc\3\2\2\2\63\u00e0\3\2\2\2\65\u00e4\3\2"+
		"\2\2\67\u00eb\3\2\2\29\u00f0\3\2\2\2;\u00f5\3\2\2\2=\u00fa\3\2\2\2?\u00fe"+
		"\3\2\2\2A\u0102\3\2\2\2C\u0110\3\2\2\2E\u011b\3\2\2\2G\u011d\3\2\2\2I"+
		"\u0124\3\2\2\2KL\7C\2\2LM\7W\2\2MN\7F\2\2NO\7K\2\2OP\7E\2\2PQ\7C\2\2Q"+
		"R\7Q\2\2RS\7<\2\2S\4\3\2\2\2TU\7\60\2\2U\6\3\2\2\2VW\7V\2\2WX\7K\2\2X"+
		"Y\7V\2\2YZ\7W\2\2Z[\7N\2\2[\\\7Q\2\2\\\b\3\2\2\2]^\7<\2\2^\n\3\2\2\2_"+
		"`\7U\2\2`a\7W\2\2ab\7D\2\2bc\7V\2\2cd\7K\2\2de\7V\2\2ef\7W\2\2fg\7N\2"+
		"\2gh\7Q\2\2h\f\3\2\2\2ij\7V\2\2jk\7G\2\2kl\7O\2\2lm\7C\2\2m\16\3\2\2\2"+
		"no\7F\2\2op\7C\2\2pq\7V\2\2qr\7C\2\2r\20\3\2\2\2st\7J\2\2tu\7Q\2\2uv\7"+
		"T\2\2vw\7C\2\2w\22\3\2\2\2xy\7N\2\2yz\7Q\2\2z{\7E\2\2{|\7C\2\2|}\7N\2"+
		"\2}\24\3\2\2\2~\177\7Q\2\2\177\u0080\7T\2\2\u0080\u0081\7I\2\2\u0081\u0082"+
		"\7C\2\2\u0082\u0083\7P\2\2\u0083\u0084\7K\2\2\u0084\u0085\7\\\2\2\u0085"+
		"\u0086\7C\2\2\u0086\u0087\7F\2\2\u0087\u0088\7Q\2\2\u0088\u0089\7T\2\2"+
		"\u0089\26\3\2\2\2\u008a\u008b\7F\2\2\u008b\u008c\7W\2\2\u008c\u008d\7"+
		"T\2\2\u008d\u008e\7C\2\2\u008e\u008f\7E\2\2\u008f\u0090\7C\2\2\u0090\u0091"+
		"\7Q\2\2\u0091\30\3\2\2\2\u0092\u0093\7C\2\2\u0093\u0094\7V\2\2\u0094\u0095"+
		"\7W\2\2\u0095\u0096\7C\2\2\u0096\u0097\7E\2\2\u0097\u0098\7C\2\2\u0098"+
		"\u0099\7Q\2\2\u0099\32\3\2\2\2\u009a\u009b\7Q\2\2\u009b\u009c\7D\2\2\u009c"+
		"\u009d\7T\2\2\u009d\u009e\7C\2\2\u009e\34\3\2\2\2\u009f\u00a0\7K\2\2\u00a0"+
		"\u00a1\7P\2\2\u00a1\u00a2\7U\2\2\u00a2\u00a3\7V\2\2\u00a3\u00a4\7T\2\2"+
		"\u00a4\u00a5\7W\2\2\u00a5\u00a6\7O\2\2\u00a6\u00a7\7G\2\2\u00a7\u00a8"+
		"\7P\2\2\u00a8\u00a9\7V\2\2\u00a9\u00aa\7Q\2\2\u00aa\u00ab\7U\2\2\u00ab"+
		"\36\3\2\2\2\u00ac\u00ad\7.\2\2\u00ad \3\2\2\2\u00ae\u00af\7O\2\2\u00af"+
		"\u00b0\7C\2\2\u00b0\u00b1\7G\2\2\u00b1\u00b2\7U\2\2\u00b2\u00b3\7V\2\2"+
		"\u00b3\u00b4\7T\2\2\u00b4\u00b5\7Q\2\2\u00b5\u00b6\7U\2\2\u00b6\"\3\2"+
		"\2\2\u00b7\u00b8\7O\2\2\u00b8\u00b9\7W\2\2\u00b9\u00ba\7U\2\2\u00ba\u00bb"+
		"\7K\2\2\u00bb\u00bc\7E\2\2\u00bc\u00bd\7Q\2\2\u00bd\u00be\7U\2\2\u00be"+
		"$\3\2\2\2\u00bf\u00c0\5A!\2\u00c0&\3\2\2\2\u00c1\u00c3\t\2\2\2\u00c2\u00c1"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"(\3\2\2\2\u00c6\u00c7\5/\30\2\u00c7\u00c8\7/\2\2\u00c8\u00c9\5+\26\2\u00c9"+
		"\u00ca\7/\2\2\u00ca\u00cb\5-\27\2\u00cb*\3\2\2\2\u00cc\u00ce\4\62;\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0,\3\2\2\2\u00d1\u00d3\4\62;\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5.\3\2\2\2\u00d6"+
		"\u00d8\t\3\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\60\3\2\2\2\u00db\u00dd\t\4\2\2\u00dc\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\62\3\2\2\2\u00e0\u00e1\59\35\2\u00e1\u00e2\7<\2\2\u00e2\u00e3\5;\36\2"+
		"\u00e3\64\3\2\2\2\u00e4\u00e5\59\35\2\u00e5\u00e6\7<\2\2\u00e6\u00e7\5"+
		";\36\2\u00e7\u00e8\7<\2\2\u00e8\u00e9\5\67\34\2\u00e9\66\3\2\2\2\u00ea"+
		"\u00ec\4\62;\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee8\3\2\2\2\u00ef\u00f1\4\62;\2\u00f0\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		":\3\2\2\2\u00f4\u00f6\4\62;\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2"+
		"\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8<\3\2\2\2\u00f9\u00fb\4"+
		"\62;\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd>\3\2\2\2\u00fe\u00ff\t\5\2\2\u00ff\u0100\3\2\2\2"+
		"\u0100\u0101\b \2\2\u0101@\3\2\2\2\u0102\u0107\7$\2\2\u0103\u0106\5C\""+
		"\2\u0104\u0106\n\6\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\u0109"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u010a\u010b\7$\2\2\u010bB\3\2\2\2\u010c\u010d\7^\2\2\u010d"+
		"\u0111\t\7\2\2\u010e\u0111\5G$\2\u010f\u0111\5E#\2\u0110\u010c\3\2\2\2"+
		"\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111D\3\2\2\2\u0112\u0113\7"+
		"^\2\2\u0113\u0114\4\62\65\2\u0114\u0115\4\629\2\u0115\u011c\4\629\2\u0116"+
		"\u0117\7^\2\2\u0117\u0118\4\629\2\u0118\u011c\4\629\2\u0119\u011a\7^\2"+
		"\2\u011a\u011c\4\629\2\u011b\u0112\3\2\2\2\u011b\u0116\3\2\2\2\u011b\u0119"+
		"\3\2\2\2\u011cF\3\2\2\2\u011d\u011e\7^\2\2\u011e\u011f\7w\2\2\u011f\u0120"+
		"\5I%\2\u0120\u0121\5I%\2\u0121\u0122\5I%\2\u0122\u0123\5I%\2\u0123H\3"+
		"\2\2\2\u0124\u0125\t\b\2\2\u0125J\3\2\2\2\20\2\u00c4\u00cf\u00d4\u00d9"+
		"\u00de\u00ed\u00f2\u00f7\u00fc\u0105\u0107\u0110\u011b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}