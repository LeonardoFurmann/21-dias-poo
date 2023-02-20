package exe3;

public class ContaComCheque extends Conta{
		
	private int taxaPorTransação;
	private int limiteTransações;
	private int totalTransações = 0;
	
	
	public ContaComCheque(int limiteTransações, int taxa) {
		super();
		this.limiteTransações = limiteTransações;
		this.taxaPorTransação = taxa/100;
	}
	
	
	
	
	public int getLimiteTransações() {
		return limiteTransações;
	}


	public void setLimiteTransações(int limiteTransações) {
		this.limiteTransações = limiteTransações;
	}


	public int getTaxaPorTransação() {
		return taxaPorTransação;
	}

	
	public void setTaxaPorTransação(int taxaPorTransação) {
		this.taxaPorTransação = taxaPorTransação;
	}




	@Override
	public double sacarFundos(double fundos) {
		
		totalTransações++;
		
		return super.sacarFundos(fundos);
	}
	
	
	
	
	public void calculaTaxa() {
		
		double taxa = (totalTransações - limiteTransações) * taxaPorTransação;
		
		
		if (taxa >  0) {
			
			setSaldo(getSaldo() + taxa);
			
		}
		
	}
	
	
	
	
	
}
