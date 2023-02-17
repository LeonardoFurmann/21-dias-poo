package exe1;

public class HappyObject extends MoodyObject {
	
	//sobrepõe o metodo getMood()
	
	@Override
	protected String getMood() {
		return "Happy";
	}
	
	public void laugh() {
		System.out.println("hahaha");
	}

}
