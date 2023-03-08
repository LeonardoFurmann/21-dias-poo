package exe4;

import java.util.ArrayList;
//import java.util.Vector;

public class Stack implements IStack{
	
	
	private ArrayList<Object> lista; 
	
	//Vector vector // array de objetos
	
	public Stack() {
		lista = new ArrayList<>();
	}
	
	public boolean empty() {
		
		return lista.isEmpty();
		
	}
	
	public Object peek() {
		
		if (!empty()) {
			
			return lista.get(0);
		}
			
		System.out.println("Lista vazia");
		return null;
				
	}
	
	public Object pop() {
		
		 if (!empty()) {
			
			 Object obj = lista.get(0);
			 
			 lista.remove(obj);
			 
			 return obj;	 
		}
		
		 System.out.println("Lista vazia");
			return null;
	}
	
	public Object push(Object item) {
		
		lista.add(0, item);
			
		return item;
	}
	
	
	public int search(Object o ) {
		
		int index =  lista.indexOf(o);
		
		
		return index;
	}

}
