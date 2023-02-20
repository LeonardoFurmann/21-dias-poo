package exe1;

public class MoodyDriver {

	public static void main(String[] args) {
		
	//	MoodyObject moodyObject = new MoodyObject();  classe abstrata
		SadObject sadObject = new SadObject();
		HappyObject happyObject = new HappyObject();
		
	//	System.out.println("How does the moody object feel today?");
	//	moodyObject.queryMood();
	//	System.out.println("");
		
		System.out.println("How does the moody object feel today?");
		sadObject.queryMood();  // note que a sobreposição muda o humor
		sadObject.cry();
		System.out.println("");
		
		System.out.println("How does the moody object feel today?");
		happyObject.queryMood();
		happyObject.laugh();
		System.out.println("");

	}

}
