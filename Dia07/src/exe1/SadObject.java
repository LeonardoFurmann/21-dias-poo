package exe1;

public class SadObject extends MoodyObject{

	@Override
	protected String getMood() {
		return "sad";
	}

	public void cry() {
		System.out.println(";-;");
	}

}
