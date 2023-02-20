package exe3;

public class Conta {
	
	private double saldo;
	
	public Conta () {
		this.saldo = 0;
	}
	
	public Conta(double saldoInicial) {
		this.saldo = saldoInicial;
	}
	
	public void depositarFundos(double fundos){
		this.saldo += fundos;
	}
	
	public double verificarSaldo() {
		return this.saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
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
