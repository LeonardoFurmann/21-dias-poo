package Exe1;

public class Teste {

	public static void main(String[] args) {
		
		Carrinho carrinho = new Carrinho();
		
		carrinho.addItem(new Item(1, 4, 5, "Coca-Cola", 0));
		carrinho.addItem(new Item(1, 4, 5, "Coca-Cola", 0));
		
		carrinho.addItem(new Item(1, 4, 5, "Coca-Cola", 0));
		carrinho.addItem(new Item(1, 4, 5, "Coca-Cola", 0));
		carrinho.addItem(new Item(1, 4, 5, "Coca-Cola", 0));
		
		Iterator iterator = carrinho.iterator();
		
		carrinho.descreverItens(iterator);
		
		
		
		
		
	}

}
