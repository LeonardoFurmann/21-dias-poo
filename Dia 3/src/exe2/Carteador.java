package exe2;

public class Carteador {
	
	Baralho baralho = new Baralho();

	public String embaralhar() {
		
		String novoBaralho = "";
		baralho.adicionar();
		
		
		
		for (Carta carta : baralho.Ma�o) {
			
			int indice = (int) (Math.random() * 52);
			
			// colocar id para carta
			
			novoBaralho += baralho.Ma�o.get(indice).Escrever(carta.getValor());
		}
		
		
		return novoBaralho;
		
	}
	
	
	

}
