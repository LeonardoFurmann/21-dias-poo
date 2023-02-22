package exe3;

public class ContaComCheque extends Conta{
		
	private double taxaPorTransação;
	private int limiteTransações;
	private int totalTransações = 0;
	
	
	public ContaComCheque(int limiteTransações, double taxa, double saldoInicial) {
		super(saldoInicial);
		setLimiteTransações(limiteTransações);
		setTaxaPorTransação(taxa);
	}
	
	
	
	
	public int getLimiteTransações() {
		return limiteTransações;
	}


	public void setLimiteTransações(int limiteTransações) {
		this.limiteTransações = limiteTransações;
	}


	public double getTaxaPorTransação() {
		return taxaPorTransação;
	}

	
	public void setTaxaPorTransação(double taxaPorTransação) {
		this.taxaPorTransação = taxaPorTransação;
	}



	@Override
	public double sacarFundos(double fundos) {
		
		totalTransações++;
		
		return super.sacarFundos(fundos);
	}
	
	
	
	
	public void calculaTaxa() {
		
		int diferençaTransações = totalTransações - getLimiteTransações();
		
		
		if (diferençaTransações >  0) {
			
			double taxaTotal = diferençaTransações * getTaxaPorTransação();
			double saldo = getSaldo() - taxaTotal;
			setSaldo(saldo);
			
		}
		
		totalTransações = 0;
		
	}
	
	
	
	
	
}
