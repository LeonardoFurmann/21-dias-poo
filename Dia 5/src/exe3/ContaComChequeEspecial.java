package exe3;

public class ContaComChequeEspecial extends Conta{
	
	private double juros;
	
	public ContaComChequeEspecial(double juros, double saldoInicial) {
		super(saldoInicial);
		this.juros = juros;
	}
	
	
	public double getJuros() {
		return juros;
	}

	public void setJuros(int juros) {
		this.juros = juros;
	}

	
	
	@Override
	public double sacarFundos(double fundos) {
			
		setSaldo(getSaldo() - fundos);

		
		return fundos;
	}
	
	
	
	
	public void aplicarJuros() {
		
		if (getSaldo() < 0) {
			
			double valor = getSaldo();
			
			valor += getSaldo() * juros;
			
			setSaldo(valor); 
			
			System.out.println("Juro deduzido do saldo");
					
		}else {
			System.out.println("O saldo da conta é positivo");
		}
	}
	
	
	
	

}
