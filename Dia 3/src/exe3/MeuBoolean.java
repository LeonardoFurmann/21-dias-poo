package exe3;

public class MeuBoolean {
	
	private boolean valor;

	public MeuBoolean(boolean valor) {
		this.valor = valor;
	}
	
	public  MeuBoolean() {
		valor = false;
	}
	
	public boolean retronaValor() {
		return valor;
		
	}
	
	public  void setBoolean(boolean valor) {
		this.valor = valor;
		
	}
	
	
	public static boolean getBoolean(String name) {
		return Boolean.getBoolean(name);
	}
	
	public static MeuBoolean valueOf(String s) {
		return new MeuBoolean(Boolean.getBoolean(s));
	}
	
	
	
}
