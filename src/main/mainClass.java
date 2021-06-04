package main;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import parser.PascalLangLexer;
import parser.PascalLangParser;

public class mainClass {
	public static void main(String[] args) {
		try {
			PascalLangLexer lexer;
			PascalLangParser parser;
			
			lexer = new PascalLangLexer(CharStreams.fromFileName("input.pas"));
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			parser = new PascalLangParser(tokenStream);
			
			parser.programa();
			
		}
		catch (Exception ex) {
			System.err.println("ERROR"+ex.getMessage());
		}
	}

}
