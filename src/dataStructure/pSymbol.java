package dataStructure;

public abstract class pSymbol {
	protected String name;
	
	public pSymbol(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "pSymbol [name=" + name + "]"; 
	}
}
