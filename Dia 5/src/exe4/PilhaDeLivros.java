package exe4;

public class PilhaDeLivros {

	public static void main(String[] args) {
		
		Livro livro = new Livro("Harry Potter", 500);
		Livro livro2 = new Livro("Narnia", 500);
		
		Stack pilha = new Stack();
		
		System.out.println(pilha.empty());
		
		try {
			System.out.println(pilha.peek().toString());
		} catch (Exception e) {

		}
		
		
		pilha.push(livro);
		
		pilha.push(livro2);
		
		
		try {
			System.out.println(pilha.peek().toString());
		} catch (Exception e) {

		}
		
		pilha.pop();
		
		try {
			System.out.println(pilha.peek().toString());
		} catch (Exception e) {

		}
		
		pilha.pop();
		
		
		try {
			System.out.println(pilha.peek().toString());
		} catch (Exception e) {

		}
	}

}
