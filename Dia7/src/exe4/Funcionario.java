package exe4;

public abstract class Funcionario {
	
	private String primeiroNome;
	private String ultimoNome;
	private double remuneracao;
	
	public Funcionario(String primeiroNome, String ultimooNome, double remuneracao) {
		super();
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimooNome;
		this.remuneracao = remuneracao;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public double getRemuneracao() {
		return remuneracao;
	}
	
	public abstract String calcularBonus();
	
	public abstract double calcularPagamento();
	
	public void imprimirContracheque() {
		String nomeCompleto = ultimoNome + ", " + primeiroNome;
		System.out.println("Pagamento: " + ultimoNome + " $" + calcularPagamento());
	}
	
	
	

}
