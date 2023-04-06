package exe2;

public class Error {
	
	private Level level;

	public Error(Level level) {
		super();
		this.level = level;
	}
	
	public Level getLevel() {
		return level;
	}
	
	
	public String toString() {
		return level.getDisplay();
	}
	

}
