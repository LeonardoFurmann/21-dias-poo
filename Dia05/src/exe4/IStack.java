package exe4;

public interface IStack {
	
	public boolean empty() ; 
	public Object peek(); 
	public Object pop (); 
	public Object push( Object item ) ; 
	public int search( Object o ) ; 
}
