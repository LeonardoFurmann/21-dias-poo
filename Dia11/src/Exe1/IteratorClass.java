package Exe1;

import java.util.LinkedList;

public class IteratorClass implements Iterator {
	
	private Object [] itens;
	private int index;
	
	
	public IteratorClass(LinkedList<Item> itens) {
		this.itens = itens.toArray();

	}

	@Override
	public void first() {
		index = 0;
		
	}

	@Override
	public void next() {
		if(!isDone()) {
			index++;
		}
		
	}

	@Override
	public boolean isDone() {
		
		if(index == itens.length) {
			return true;
		}	
		return false;
	}

	@Override
	public Object currentItem() {
		if(!isDone()) {
			return itens[index];
		}		
		return null;
	}

}
