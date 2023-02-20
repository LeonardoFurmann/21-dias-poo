package exe3;

public class ContaComCheque extends Conta{
		
	private int taxaPorTransa��o;
	private int limiteTransa��es;
	private int totalTransa��es = 0;
	
	
	public ContaComCheque(int limiteTransa��es, int taxa) {
		super();
		this.limiteTransa��es = limiteTransa��es;
		this.taxaPorTransa��o = taxa/100;
	}
	
	
	
	
	public int getLimiteTransa��es() {
		return limiteTransa��es;
	}


	public void setLimiteTransa��es(int limiteTransa��es) {
		this.limiteTransa��es = limiteTransa��es;
	}


	public int getTaxaPorTransa��o() {
		return taxaPorTransa��o;
	}

	
	public void setTaxaPorTransa��o(int taxaPorTransa��o) {
		this.taxaPorTransa��o = taxaPorTransa��o;
	}




	@Override
	public double sacarFundos(double fundos) {
		
		totalTransa��es++;
		
		return super.sacarFundos(fundos);
	}
	
	
	
	
	public void calculaTaxa() {
		
		double taxa = (totalTransa��es - limiteTransa��es) * taxaPorTransa��o;
		
		
		if (taxa >  0) {
			
			setSaldo(getSaldo() + taxa);
			
		}
		
	}
	
	
	
	
	
}
