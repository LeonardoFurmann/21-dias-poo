package exe3;

public class Conta {
	
	private double saldo;
	
	// conta inicial zerada
	public Conta () {
		this.saldo = 0;
	}
	
	// conta inicial
	public Conta(double saldoInicial) {
		this.saldo = saldoInicial;
	}
	
	//despositar fundos
	public void depositarFundos(double fundos){
		this.saldo += fundos;
	}
	
	//verificar fundos
	public double verificarSaldo() {
		return this.saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	// sacar fundos
	public double sacarFundos(double fundos) {
		
		if (fundos > saldo) {
			
			fundos = saldo;
			saldo = 0; 
			
			return fundos;
		} else {
			saldo -= fundos;
			return fundos;
		}
	}

}
