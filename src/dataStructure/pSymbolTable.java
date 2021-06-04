package dataStructure;

import java.util.HashMap;

public class pSymbolTable {
	
	private HashMap<String, pSymbol> map;
	
	public pSymbolTable() {
		map = new HashMap<String, pSymbol>();
	}
	
	public add(pSymbol symbol) {
		map.put(symbol.getName(), symbol);
	}
	
	public boolean exists(String symbolName) {
		return map.get(symbolName) != null;
	}
	
	public pSymbol get(String symbolName) {
		return map.get(symbolName);
	}
	
}