package exe1;

public class SadObject extends MoodyObject{
	
	//sobrep�e o metodo getMood()
	
	@Override
	protected String getMood() {
		return "Sad";
	}
	
	//especializa��o
	public void cry() {
		System.out.println("boo hoo");
	}
	
	

}
