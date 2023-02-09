package exe2;

public class Carteador {
	
	Baralho baralho = new Baralho();

	public String embaralhar() {
		
		String novoBaralho = "";
		baralho.adicionar();
		
		
		
		for (Carta carta : baralho.Maço) {
			
			int indice = (int) (Math.random() * 52);
			
			// colocar id para carta
			
			novoBaralho += baralho.Maço.get(indice).Escrever(carta.getValor());
		}
		
		
		return novoBaralho;
		
	}
	
	
	

}
