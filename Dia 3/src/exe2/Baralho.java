package exe2;

import java.util.ArrayList;

public class Baralho {
	
	private ArrayList<Carta> Maço = new ArrayList<>();
	
	public Baralho() {
		adicionarCartas();
	}

		
	public void adicionarCartas() {
		
			
	for (int i = 0; i < 4; i++) {
		for (int j = 2; j <= 14;j++) {
			
			Carta carta = new Carta();
			
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
			
			
		}
	}
		
	
		
	}
 
 	public int size() {
		return Maço.size();

 }
 
 
 
}
