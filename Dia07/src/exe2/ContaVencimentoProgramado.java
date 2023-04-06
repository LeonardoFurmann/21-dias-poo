package exe2;

public class ContaVencimentoProgramado extends ContaPoupança {
	
	
	private boolean prazo; 
	private double multa;
	
	
	// conta inicial
	public ContaVencimentoProgramado(double multa, double juros, double saldoInicial) {
		super(juros, saldoInicial);
		
		setMulta(multa);	
	}

	
	
	public ContaVencimentoProgramado() {
		super();
	}



	public boolean isPrazoVencido() {
		return prazo;
	}
	
	
	// vence o prazo
	public void vencerPrazo() {
		this.prazo = true;
	}



	public double getMulta() {
		return multa;
	}


	public void setMulta(double multa) {
		this.multa = multa;
	}


	// após sacar fundos pela superclasse verifica se o prazo está vencido e aplica multa
	@Override
	public double sacarFundos(double fundos ) {
		
		
		double saque = super.sacarFundos(fundos);
		
		
		if(isPrazoVencido()) {
			
			return saque - (saque * getMulta());
		} else {
			
			return saque;
		}
			
	}
	

}
