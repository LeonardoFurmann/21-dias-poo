package exe2;

public class ContaPoupan�a extends Conta{
	
	private double juros;
		
	// conta inicial
	public ContaPoupan�a(double juros, double saldoInicial) {
		super(saldoInicial);
		setJuros(juros);
	}
	
	

	public ContaPoupan�a() {
		super();
	}



	public double getJuros() {
		return juros;
	}


	public void setJuros(double juros) {
		this.juros = juros;
	}


	// aplica juros ao saldo da conta
	public void adicionarJuros() {
		
		double saldo = getSaldo();
		double juros = getJuros();
		
		double novoSaldo = saldo + (saldo * juros);
		
		setSaldo(novoSaldo); 
		
	}

}
