package exe2;

public class Carta {
	
	private String naipe;
	private int valor;
	private int id;
	
	public Carta(String naipe, int valor) {
		this.naipe = naipe;
		this.valor = valor;
	}
	
	public Carta() {
		
	}
	

	public String Escrever(int valor) {	
		
		switch (valor) {
		case 11:
			return naipe + " " + "Valete" + "\n";
		case 12:
			return naipe + " " + "Dama" + "\n";
		case 13:
			return naipe + " " + "Rei" + "\n";
		case 14:
			return naipe + " " + "�s" + "\n";
		default:
			break;
		}
		
			return naipe + " " + valor + "\n";
	}
	
	
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
	

		

}



//= {"ouro", "copas", "espadas", "paus"};
//= {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
//= {"paraBaixo", "paraCima