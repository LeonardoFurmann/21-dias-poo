package exe1;

public class SadObject extends MoodyObject{
	
	//sobrepõe o metodo getMood()
	
	@Override
	protected String getMood() {
		return "Sad";
	}
	
	//especialização
	public void cry() {
		System.out.println("boo hoo");
	}
	
	

}
