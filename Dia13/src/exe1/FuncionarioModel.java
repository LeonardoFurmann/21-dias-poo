package exe1;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class FuncionarioModel implements Observer{
		
		private String primeiroNome;
		private String ultimoNome;
		private double remuneracao;
		
		public ArrayList obervadores = new ArrayList();
		
		public FuncionarioModel(String primeiroNome, String ultimooNome, double remuneracao) {
			super();
			this.primeiroNome = primeiroNome;
			this.ultimoNome = ultimooNome;
			this.remuneracao = remuneracao;
		}

		public String getPrimeiroNome() {
			return primeiroNome;
		}

		public String getUltimoNome() {
			return ultimoNome;
		}

		public double getRemuneracao() {
			return remuneracao;
		}
		
		public abstract String calcularBonus();
		
		public abstract double calcularPagamento();
		
		public void imprimirContracheque() {
			String nomeCompleto = ultimoNome + ", " + primeiroNome;
			System.out.println("Pagamento: " + ultimoNome + " $" + calcularPagamento());
		}
		
		public void updateObservadores() {
			Iterator i = obervadores.iterator();
			
			while(i.hasNext()) {
				Observer o = (Observer) i.next();
				o.update();
			}
		}
		
}
