
public class Teste {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		Pilha pilha = null;
		
		pilha.adicionar(livro);
		
		pilha.conferirPrimeiro();
		
		
	}

}
