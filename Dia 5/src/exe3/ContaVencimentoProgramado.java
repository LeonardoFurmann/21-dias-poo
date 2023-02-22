package exe3;

public class ContaVencimentoProgramado extends ContaPoupança {
	
	
	private boolean prazoVencido; 
	private double multa;
	
	
	
	public ContaVencimentoProgramado(double multa, boolean prazo, double juros, double saldoInicial) {
		super(juros, saldoInicial);
		
		setMulta(multa);
		setPrazo(prazo);
		
	}

	
	
	public boolean prazo() {
		return prazoVencido;
	}
	
	public void setPrazo(boolean prazo) {
		this.prazoVencido = prazo;
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
		
		
		if(prazoVencido) {
			
			return saque - (saque * getMulta());
		} else {
			
			return saque;
		}
		
		
	}
	
	

}
