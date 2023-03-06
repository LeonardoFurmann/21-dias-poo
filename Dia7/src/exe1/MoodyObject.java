package exe1;

public abstract class MoodyObject {
	
	protected abstract String getMood();
	
	public void queryMood() {
		System.out.println("I fell " + getMood() + " today");
	}

}
