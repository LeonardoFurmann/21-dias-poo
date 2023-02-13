package exe2;

import java.util.ArrayList;

public class Baralho {
	
	//int id = 1;
	
	private ArrayList<Carta> Maço = new ArrayList<>();
	
	public Baralho() {
		adicionarCartas();
	}

		
	public void adicionarCartas() {
		
			
	for (int i = 0; i < 4; i++) {
		for (int j = 2; j <= 14;j++) {
			
			Carta carta = new Carta();
				
			
			//carta.setId(id);
			carta.setValor(j);
			
			if(i == 0) {
			carta.setNaipe("Ouro");
			}else if (i == 1){
				carta.setNaipe("Copas");
			}else if (i == 2){
				carta.setNaipe("Espadas");
			}else if (i == 3){
				carta.setNaipe("Paus");
			}
			
			Maço.add(carta);
			//id++;
			
			
			}
		}	
	}
	
	
	public String escreverBaralho() {
		
		String novoBaralho = " ";
		
		for (Carta carta : Maço) {
			
			novoBaralho += carta.Escrever(carta.getValor());
		}
		
		return novoBaralho;
		
	}
	
	
	public Carta pegarCarta(int indice) {
		if(indice < Maço.size()) {
			return (Carta) Maço.get(indice); 
		}
		return null;
	}
	
	
 
 	public int size() {
		return Maço.size();

 }


	public void trocar(int indice, Carta carta) {
		Maço.set(indice, carta);
	}
 
 
 
}
