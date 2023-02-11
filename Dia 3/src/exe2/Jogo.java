package exe2;

public class Jogo {

	public static void main(String[] args) {
		
		Baralho baralho = new Baralho();
		
	//System.out.print(baralho.escreverBaralho() + "\n\n");
		
		Carteador carteador = new Carteador(baralho);
		
		carteador.embaralhar();
		
		
		System.out.print(baralho.escreverBaralho());

	}

}
