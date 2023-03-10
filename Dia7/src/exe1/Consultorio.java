package exe1;

import java.util.Scanner;

public class Consultorio {
	
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		PsychiatristObject psicologo = new PsychiatristObject();
		
		HappyObject feliz = new  HappyObject();	
		SadObject triste = new SadObject();
		CarefreeObject despreocupado = new CarefreeObject();
		
		psicologo.examine(triste);
		psicologo.examine(feliz);
		psicologo.examine(despreocupado);
		
		psicologo.observe(feliz);
		psicologo.observe(triste);
		

	}

}
