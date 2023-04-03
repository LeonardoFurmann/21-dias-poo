package exe2;

public class ContaComChequeEspecial extends Conta{
	
	private double juros;
	
	// conta inicial 
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

	
	// sobrepoe o método da superclasse para permitir o saldo negativo
	@Override
	public double sacarFundos(double fundos) {
			
		setSaldo(getSaldo() - fundos);

		
		return fundos;
	}
	
	
	// aplicar juros se o saldo for negativo
	
	public void aplicarJuros() {
		
		double valor = getSaldo();

		if (getSaldo() < 0) {	
			
			valor += getSaldo() * juros;
			
			setSaldo(valor); 
			
			System.out.println("Juro deduzido do saldo");
					
		}else {
			System.out.println("O saldo da conta é positivo");
		}
	}
	
	
	
	

}
