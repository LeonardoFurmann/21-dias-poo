package exe3;

public class ContaPoupan�a extends Conta{
	
	private int juros;
		
	public ContaPoupan�a(int juros, double saldoInicial) {
		super(saldoInicial);
		setJuros(juros/100);
	}
	

	public int getJuros() {
		return juros;
	}


	public void setJuros(int juros) {
		this.juros = juros;
	}


	// aplica juros ao saldo da conta


	public void adicionarJuros() {
		
		double valor = 0;
		
		valor += getSaldo() * juros;
		
		setSaldo(valor); 
		
	}

}
