package exe2;

public class ContaRecompensas extends ContaPoupança{
	
	private int pontosRecompensa = 0;
	private double nivelDeposito;

	public ContaRecompensas(double juros, double saldoInicial, double nivelDeposito) {
		super(juros, saldoInicial);
		
		setNivelDeposito(nivelDeposito);
	}
	
	
	public ContaRecompensas() {
		super();
	}


	public int getPontosRecompensa() {
		return pontosRecompensa;
	}

	public void resetPontosRecompensa(int pontosRecompensa) {
		this.pontosRecompensa = 0;
	}

	public double getNivelDeposito() {
		return nivelDeposito;
	}

	public void setNivelDeposito(double nivelDeposito) {
		this.nivelDeposito = nivelDeposito;
	}
	
	
	@Override
	public void depositarFundos(double fundos) {
		
		if (fundos >= nivelDeposito) {
			pontosRecompensa++;
		}
		
		
		super.depositarFundos(fundos);
	}
}
