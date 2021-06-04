// Generated from PascalLang.g4 by ANTLR 4.4

	import dataStructure.pSymbol;
	import dataStructure.pSymbolTable;
	import dataStructure.pVariable;
	import exceptions.pException;
	import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Digito=1, Letra=2, Relacao=3, PROGRAM=4, PROCEDURE=5, VAR=6, BEGIN=7, 
		END=8, THEN=9, ELSE=10, WHILE=11, DO=12, OR=13, DIV=14, AND=15, NOT=16, 
		Integer=17, Real=18, Boolean=19, Char=20, String=21, TRUE=22, FALSE=23, 
		PLUS=24, MINUS=25, TIMES=26, AP=27, FP=28, PV=29, VG=30, DP=31, ATB=32, 
		IF=33, WS=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'"
	};
	public static final String[] ruleNames = {
		"Digito", "Letra", "Relacao", "PROGRAM", "PROCEDURE", "VAR", "BEGIN", 
		"END", "THEN", "ELSE", "WHILE", "DO", "OR", "DIV", "AND", "NOT", "Integer", 
		"Real", "Boolean", "Char", "String", "TRUE", "FALSE", "PLUS", "MINUS", 
		"TIMES", "AP", "FP", "PV", "VG", "DP", "ATB", "IF", "WS"
	};


		private int _tipo;
		private String _varName;
		private String _varValue;
		private pSymbolTable  symbolTable = new pSymbolTable();
		private pSymbol symbol;
		
		public void verificaID(String id){
			if(!symbolTable.exists(id)){
				throw new pException("Symbol "+_varName+" already declared");
			}
		}


	public PascalLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PascalLang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u00df\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\5\3K\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4V\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#"+
		"\2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$\3\2\5\3\2\62;\5\2C\\aac|\5\2\13\f\17\17\"\"\u00e3\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5"+
		"J\3\2\2\2\7U\3\2\2\2\tW\3\2\2\2\13_\3\2\2\2\ri\3\2\2\2\17m\3\2\2\2\21"+
		"s\3\2\2\2\23w\3\2\2\2\25|\3\2\2\2\27\u0081\3\2\2\2\31\u0087\3\2\2\2\33"+
		"\u008a\3\2\2\2\35\u008d\3\2\2\2\37\u0091\3\2\2\2!\u0095\3\2\2\2#\u0099"+
		"\3\2\2\2%\u00a1\3\2\2\2\'\u00a6\3\2\2\2)\u00ae\3\2\2\2+\u00b3\3\2\2\2"+
		"-\u00ba\3\2\2\2/\u00bf\3\2\2\2\61\u00c5\3\2\2\2\63\u00c7\3\2\2\2\65\u00c9"+
		"\3\2\2\2\67\u00cb\3\2\2\29\u00cd\3\2\2\2;\u00cf\3\2\2\2=\u00d1\3\2\2\2"+
		"?\u00d3\3\2\2\2A\u00d5\3\2\2\2C\u00d8\3\2\2\2E\u00db\3\2\2\2GH\t\2\2\2"+
		"H\4\3\2\2\2IK\t\3\2\2JI\3\2\2\2K\6\3\2\2\2LV\7?\2\2MN\7>\2\2NV\7@\2\2"+
		"OV\7>\2\2PQ\7>\2\2QV\7?\2\2RS\7@\2\2SV\7?\2\2TV\7@\2\2UL\3\2\2\2UM\3\2"+
		"\2\2UO\3\2\2\2UP\3\2\2\2UR\3\2\2\2UT\3\2\2\2V\b\3\2\2\2WX\7r\2\2XY\7t"+
		"\2\2YZ\7q\2\2Z[\7i\2\2[\\\7t\2\2\\]\7c\2\2]^\7o\2\2^\n\3\2\2\2_`\7r\2"+
		"\2`a\7t\2\2ab\7q\2\2bc\7e\2\2cd\7g\2\2de\7f\2\2ef\7w\2\2fg\7t\2\2gh\7"+
		"g\2\2h\f\3\2\2\2ij\7x\2\2jk\7c\2\2kl\7t\2\2l\16\3\2\2\2mn\7d\2\2no\7g"+
		"\2\2op\7i\2\2pq\7k\2\2qr\7p\2\2r\20\3\2\2\2st\7g\2\2tu\7p\2\2uv\7f\2\2"+
		"v\22\3\2\2\2wx\7v\2\2xy\7j\2\2yz\7g\2\2z{\7p\2\2{\24\3\2\2\2|}\7g\2\2"+
		"}~\7n\2\2~\177\7u\2\2\177\u0080\7g\2\2\u0080\26\3\2\2\2\u0081\u0082\7"+
		"y\2\2\u0082\u0083\7j\2\2\u0083\u0084\7k\2\2\u0084\u0085\7n\2\2\u0085\u0086"+
		"\7g\2\2\u0086\30\3\2\2\2\u0087\u0088\7f\2\2\u0088\u0089\7q\2\2\u0089\32"+
		"\3\2\2\2\u008a\u008b\7q\2\2\u008b\u008c\7t\2\2\u008c\34\3\2\2\2\u008d"+
		"\u008e\7f\2\2\u008e\u008f\7k\2\2\u008f\u0090\7x\2\2\u0090\36\3\2\2\2\u0091"+
		"\u0092\7c\2\2\u0092\u0093\7p\2\2\u0093\u0094\7f\2\2\u0094 \3\2\2\2\u0095"+
		"\u0096\7p\2\2\u0096\u0097\7q\2\2\u0097\u0098\7v\2\2\u0098\"\3\2\2\2\u0099"+
		"\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c\7v\2\2\u009c\u009d\7g\2\2"+
		"\u009d\u009e\7i\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7t\2\2\u00a0$\3\2\2"+
		"\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5"+
		"\7n\2\2\u00a5&\3\2\2\2\u00a6\u00a7\7d\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9"+
		"\7q\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7c\2\2\u00ac"+
		"\u00ad\7p\2\2\u00ad(\3\2\2\2\u00ae\u00af\7e\2\2\u00af\u00b0\7j\2\2\u00b0"+
		"\u00b1\7c\2\2\u00b1\u00b2\7t\2\2\u00b2*\3\2\2\2\u00b3\u00b4\7U\2\2\u00b4"+
		"\u00b5\7v\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7p\2\2"+
		"\u00b8\u00b9\7i\2\2\u00b9,\3\2\2\2\u00ba\u00bb\7V\2\2\u00bb\u00bc\7T\2"+
		"\2\u00bc\u00bd\7W\2\2\u00bd\u00be\7G\2\2\u00be.\3\2\2\2\u00bf\u00c0\7"+
		"H\2\2\u00c0\u00c1\7C\2\2\u00c1\u00c2\7N\2\2\u00c2\u00c3\7U\2\2\u00c3\u00c4"+
		"\7G\2\2\u00c4\60\3\2\2\2\u00c5\u00c6\7-\2\2\u00c6\62\3\2\2\2\u00c7\u00c8"+
		"\7/\2\2\u00c8\64\3\2\2\2\u00c9\u00ca\7,\2\2\u00ca\66\3\2\2\2\u00cb\u00cc"+
		"\7*\2\2\u00cc8\3\2\2\2\u00cd\u00ce\7+\2\2\u00ce:\3\2\2\2\u00cf\u00d0\7"+
		"=\2\2\u00d0<\3\2\2\2\u00d1\u00d2\7.\2\2\u00d2>\3\2\2\2\u00d3\u00d4\7<"+
		"\2\2\u00d4@\3\2\2\2\u00d5\u00d6\7<\2\2\u00d6\u00d7\7?\2\2\u00d7B\3\2\2"+
		"\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7h\2\2\u00daD\3\2\2\2\u00db\u00dc\t"+
		"\4\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\b#\2\2\u00deF\3\2\2\2\5\2JU\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}