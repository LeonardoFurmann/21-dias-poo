package exe3;

public class ContaPoupança extends Conta{
	
	private double juros;
		
	public ContaPoupança(double juros, double saldoInicial) {
		super(saldoInicial);
		setJuros(juros);
	}
	

	public double getJuros() {
		return juros;
	}


	public void setJuros(double juros) {
		this.juros = juros;
	}


	// aplica juros ao saldo da conta


	public void adicionarJuros() {
		
		double valor = 0;
		
		valor += getSaldo() * juros;
		
		setSaldo(valor); 
		
	}

}
