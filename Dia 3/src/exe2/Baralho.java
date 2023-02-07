package exe2;


import java.util.List;

public class Baralho {
	
	public List<Carta> Maço;
	
		
 public void adicionar() {
		
		Carta carta = new Carta();
		
		
	for (int i = 0; i < 52; i++) {
		for (int j = 2; j <= 14; j++) {
			
			carta.setValor(j);
			
			if(i < 13) {
			carta.setNaipe("Ouro");
			}else if (i >= 13 && i < 26){
				carta.setNaipe("Copas");
			}else if (i >= 26 && i < 39){
				carta.setNaipe("Espadas");
			}else if (i >= 26 && i < 51){
				carta.setNaipe("Paus");
			}
			
			Maço.add(carta);
			
		}
	}
		
	
		
	}
}
