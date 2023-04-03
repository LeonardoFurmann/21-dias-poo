
public class PilhaDeLivros implements Pilha{
	
	
	private Livro[] livros;
	private int topoPilha;   //ponteiro
	
	public PilhaDeLivros(int tamanho) {
		this.livros = new Livro[tamanho];
		this.topoPilha = -1;
	}

	@Override
	public void adicionar(Object obj) {
		 if (topoPilha == livros.length -1) {
			System.out.println("A Pilha está cheia");
		} else {
			topoPilha++;
			livros[topoPilha] = (Livro) obj;
		}
		
	}

	@Override
	public String remover() {
		if (topoPilha < 0) {
			System.out.println("A Pilha está cheia");
		} else {
			livros[topoPilha] = null;
			topoPilha--;
			
		}	
		return "Livro Removido";
	}

	@Override
	public boolean estaVazio() {
		
		if (topoPilha < 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object conferirPrimeiro() {	
		return livros[topoPilha].nome;
	}

}
