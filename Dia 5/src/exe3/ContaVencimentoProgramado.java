package exe3;

public class ContaVencimentoProgramado extends ContaPoupança {
	
	
	private boolean prazoVecido; 
	private int multa;
	
	
	
	public ContaVencimentoProgramado(int multa, boolean prazo, int juros, double saldoInicial) {
		super(juros, saldoInicial);
		
		setMulta(multa/100);
		setPrazo(prazo);
		
	}

	
	
	public boolean prazo() {
		return prazoVecido;
	}
	
	public void setPrazo(boolean prazo) {
		this.prazoVecido = prazo;
	}



	public int getMulta() {
		return multa;
	}


	public void setMulta(int multa) {
		this.multa = multa/100;
	}


	@Override
	public double sacarFundos(double fundos ) {
		
		
		double saque = super.sacarFundos(fundos);
		
		
		if(prazoVecido) {
			
			return saque - (saque * getMulta());
		} else {
			
			return saque;
		}
		
		
	}
	
	

}
