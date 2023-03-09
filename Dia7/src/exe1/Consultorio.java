package exe1;

public class Consultorio {

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
