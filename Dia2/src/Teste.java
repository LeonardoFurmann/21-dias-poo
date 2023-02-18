import java.util.Stack;

public class Teste {

	public static void main(String[] args) {
		
		
//	PilhaDeLivros pilha = new PilhaDeLivros(5);   // da certo
	Pilha pilha = new PilhaDeLivros(5);			 // da certo
	
//	PilhaDeLivros pilha = new Pilha(5);			// não da certo
	
	
	Livro livro= new Livro("Guerra dos Tronos");
	
	pilha.adicionar(livro);
	
	System.out.println(pilha.conferirPrimeiro());
	System.out.println(pilha.estaVazio());
	System.out.println(pilha.remover());   
		
	pilha.remover(); 
		
		
	}

}
