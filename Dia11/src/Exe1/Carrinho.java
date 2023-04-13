package Exe1;

import java.util.LinkedList;

public class Carrinho {
	
	LinkedList<Item> itens = new LinkedList<Item>();
	ItemDisplayFormatter format = new ItemTableRow();

	public Iterator iterator() {
		return new IteratorClass(itens);
	}
	
	
	public void addItem(Item item) {
		itens.add(item);
	}
	
	public void removeItem(Item item) {
		itens.remove(item);
	}
	
	public int getNumeroItens(){
		return itens.size();
	}
	
	public Item getItem(int index) {
		return  (Item) itens.get(index);
	}
	
//	public void descreverItens(Iterator iterator) {	
//		for (iterator.first(); !iterator.isDone(); iterator.next()) {
//	 	
//	 	Item item = (Item) iterator.currentItem();
//	 
//        System.out.println(item.display(format));
//    }
//	
//}

}
