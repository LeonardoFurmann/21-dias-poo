package exe1;

public class PsychiatristObject {
	
	public void examine(MoodyObject moodyObject) {
		System.out.println("Como voc� se sente?");
		moodyObject.queryMood();
		System.out.println();
	}
	
	public void observe(HappyObject happyObject) {
		happyObject.laugh();
		
		System.out.println("Por que est� feliz?");
	}
	
	public void observe(SadObject sadObject) {
		sadObject.cry();
		
		System.out.println("Por que est� triste?");
	}

}
