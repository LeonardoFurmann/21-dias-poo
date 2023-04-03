package exe1;

public class CarefreeObject extends MoodyObject{

	@Override
	protected String getMood() {
		return "carefree";
	}
		
	public void whistle() {
		System.out.println("fiu fiu");
	}
}
