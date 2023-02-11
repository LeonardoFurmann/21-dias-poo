package exe2;

public class Carteador {
	
	private Baralho baralho;
	
	
	public Carteador(Baralho baralho) {
		this.baralho = baralho;
	}

	public void embaralhar() {
		
		
		int numeroCartas = baralho.size();
		
		
		for (int i = 0; i < numeroCartas; i++) {
			
			int indice = (int) (Math.random() * numeroCartas);
			
			Carta carta_i = (Carta) baralho.pegarCarta(i);
			Carta carta_indice = (Carta) baralho.pegarCarta(indice);
			
			baralho.trocar(i, carta_indice);
			baralho.trocar(indice, carta_i);
			
			
		}
		
		
	}
	
	
	

}
