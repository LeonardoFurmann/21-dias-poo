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
			return naipe + " " + "Ás" + "\n";
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

		

}

