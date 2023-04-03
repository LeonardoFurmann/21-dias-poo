package exe1;

public class PsychiatristObject {
	
	public void examine(MoodyObject moodyObject) {
		System.out.println("Como você se sente?");
		moodyObject.queryMood();
		System.out.println();
	}
	
	public void observe(HappyObject happyObject) {
		happyObject.laugh();
		
		System.out.println("Por que está feliz?");
	}
	
	public void observe(SadObject sadObject) {
		sadObject.cry();
		
		System.out.println("Por que está triste?");
	}

}
