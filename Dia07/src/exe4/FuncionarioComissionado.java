package exe4;

public class FuncionarioComissionado extends Funcionario{
	
	
	private double comissao;
	private int units;

	public FuncionarioComissionado(String primeiroNome, String ultimooNome, double remuneracao, double comissao) {
		super(primeiroNome, ultimooNome, remuneracao);
		
		this.comissao = comissao;
	}

	@Override
	public double calcularPagamento() {
		return getRemuneracao() + (comissao * units);
	}
	
	public void addVendas(int units) {
		this.units = units;
	}
	
	public int getVendas() { 
		return units;

	}

	public void resetSales() { 
		units = 0;
	
	}

	@Override
	public String calcularBonus() {
		
		int bonus = getVendas() * 100;
				
		return "Pagar bonus para " + getUltimoNome() + ", " + getPrimeiroNome() + " $" + bonus;
	}

}
