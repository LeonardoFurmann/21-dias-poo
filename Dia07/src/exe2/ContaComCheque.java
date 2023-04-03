package exe2;

public class ContaComCheque extends Conta{
		
	private double taxaPorTransa��o;
	private int limiteTransa��es;
	private int totalTransa��es = 0;
	
	// conta inicial
	public ContaComCheque(int limiteTransa��es, double taxa, double saldoInicial) {
		super(saldoInicial);
		setLimiteTransa��es(limiteTransa��es);
		setTaxaPorTransa��o(taxa);
	}
	
	
	
	
	public int getLimiteTransa��es() {
		return limiteTransa��es;
	}


	public void setLimiteTransa��es(int limiteTransa��es) {
		this.limiteTransa��es = limiteTransa��es;
	}


	public double getTaxaPorTransa��o() {
		return taxaPorTransa��o;
	}

	
	public void setTaxaPorTransa��o(double taxaPorTransa��o) {
		this.taxaPorTransa��o = taxaPorTransa��o;
	}


	// conta as transa��es de saque
	@Override
	public double sacarFundos(double fundos) {
		
		totalTransa��es++;
		
		return super.sacarFundos(fundos);
	}
	
	
	
	// verifica se o numero de transa��es ultrapassa o limite e aplica taxa
	public void calculaTaxa() {
		
		int diferen�aTransa��es = totalTransa��es - getLimiteTransa��es();
		
		
		if (diferen�aTransa��es >  0) {
			
			double taxaTotal = diferen�aTransa��es * getTaxaPorTransa��o();
			double saldo = getSaldo() - taxaTotal;
			setSaldo(saldo);
			
		}
		
		totalTransa��es = 0;
		
	}
	
	
	
	
	
}
