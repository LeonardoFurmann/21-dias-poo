package Exe1;

import java.util.LinkedList;

public class IteratorClass implements Iterator {
	
	private Object [] itens;
	private int index = 0;
	
	
	public IteratorClass(LinkedList<Item> itens) {
		this.itens = itens.toArray();

	}

	@Override
	public void first() {
		index = 0;
		
	}

	@Override
	public void next() {
		index++;
		
	}

	@Override
	public boolean isDone() {
		return index >= itens.length;
		
	}

	@Override
	public Object currentItem() {	
		return itens[index];			
		
	}

	public int getItens() {
		return itens.length;
	}

	public void setItens(Object[] itens) {
		this.itens = itens;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
