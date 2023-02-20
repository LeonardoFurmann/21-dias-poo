package exe3;

public class ContaComChequeEspecial extends Conta{
	
	private int juros;
	
	
	public int getJuros() {
		return juros;
	}

	public void setJuros(int juros) {
		this.juros = juros;
	}

	public ContaComChequeEspecial(int juros) {
		super();
		this.juros = juros;
	}
	
	@Override
	public double sacarFundos(double fundos) {
			
		setSaldo(getSaldo() - fundos);

		
		return fundos;
	}
	
	
	
	
	public void aplicarJuros() {
		
		if (getSaldo() < 0) {
			
			double valor = 0;
			
			valor += getSaldo() * juros;
			
			setSaldo(valor); 
					
		}else {
			System.out.println("O saldo da conta é positivo");
		}
	}
	
	
	
	

}
