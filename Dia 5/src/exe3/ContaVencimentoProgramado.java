package exe3;

public class ContaVencimentoProgramado extends ContaPoupança {
	
	
	private boolean prazo; 
	private double multa;
	
	
	
	public ContaVencimentoProgramado(double multa, double juros, double saldoInicial) {
		super(juros, saldoInicial);
		
		setMulta(multa);
	
		
	}

	
	
	public boolean isPrazoVencido() {
		return prazo;
	}
	
	public void vencerPrazo() {
		this.prazo = true;
	}



	public double getMulta() {
		return multa;
	}


	public void setMulta(double multa) {
		this.multa = multa;
	}


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
