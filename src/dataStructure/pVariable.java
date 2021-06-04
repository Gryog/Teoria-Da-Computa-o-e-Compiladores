package dataStructure;

public class pVariable extends pSymbol{
	public static final int Integer = 0;
	public static final int Real = 1;
	public static final int Boolean = 2;
	public static final int String = 3;
	
	private int type;
	private String value;
	
	public pVariable(String name, int type, String value) {
		super(name);
		this.type = type;
		this.value = value;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "pVariable [name=" + name + ", type=" + type + ", value=" + value + "]"; 
	}
	
}
