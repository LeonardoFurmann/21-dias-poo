package exe4;

public class Livro {
	
	private String nome;
	private int numeroPaginas;
	
	
	public Livro(String nome, int numeroPaginas) {
		this.nome = nome;
		this.numeroPaginas = numeroPaginas;
	}


	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", numeroPaginas=" + numeroPaginas + "]";
	} 
	
	

}
