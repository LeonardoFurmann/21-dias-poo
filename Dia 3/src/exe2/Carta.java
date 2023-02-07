package exe2;

public class Carta {
	
	private String naipe;
	private int valor;
	//private String estado;
	
	
	public String getNaipe() {
		return naipe;
	}
	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
//	public String getEstado() {
//		return estado;
//	}
//	public void setEstado(String estado) {
//		this.estado = estado;
//	}
	
	
	public Carta(String naipe, int valor) {
		super();
		this.naipe = naipe;
		this.valor = valor;
		//this.estado = estado;
	}
	
	public Carta() {
		
	}
	
		

}



//= {"ouro", "copas", "espadas", "paus"};
//= {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
//= {"paraBaixo", "paraCima