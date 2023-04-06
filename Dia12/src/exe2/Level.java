package exe2;

public class Level {
	
	public static final  Level NOISE = new Level(0, "NOISE");
	public static final  Level INFO = new Level(1, "INFO");
	public static final  Level WARNING = new Level(2, "WARNING");
	public static final  Level ERROR = new Level(3, "ERROR");
	
	private int num;
	private String display;


	private Level(int num, String display) {
		this.num = num;
		this.display = display;
	}


	public int getNum() {
		return num;
	}


	public String getDisplay() {
		return display;
	}


	
	
	

}
