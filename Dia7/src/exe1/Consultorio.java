package exe1;

public class Consultorio {

	public static void main(String[] args) {

		PsychiatristObject psicologo = new PsychiatristObject();
		
		HappyObject feliz = new  HappyObject();
		
		SadObject triste = new SadObject();
		
		psicologo.examine(triste);
		psicologo.examine(feliz);
		
		psicologo.observe(feliz);
		psicologo.observe(triste);

	}

}
