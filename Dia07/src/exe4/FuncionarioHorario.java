package exe4;

public class FuncionarioHorario extends Funcionario{
	
	private int horas;
	
	public FuncionarioHorario(String primeiroNome, String ultimooNome, double remuneracao) {
		super(primeiroNome, ultimooNome, remuneracao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPagamento() {
		return getRemuneracao() * horas;
	}	
	
	public void addHoras(int horas) {
			this.horas+= horas;
		}

	public int getHoras() {
		return horas;
	}
	
	public void resetHoras() {
		horas = 0;
	}

	@Override
	public String calcularBonus() {
		return "Pagar bonus para " + getUltimoNome() + ", " + getPrimeiroNome() + " $100";
	}
	
}
