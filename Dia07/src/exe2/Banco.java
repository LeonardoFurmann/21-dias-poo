package exe2;


import java.util.Hashtable;
import java.util.Map;
//import java.util.List;

public class Banco {
	
	Hashtable<String, Object> tabela = new Hashtable<>();
	
		// instancia de banco Singleton
	private static Banco instanciaBanco;
	
		// construtor protegido para não haver instancias de banco indesejadas
	protected Banco(){}
	
		// funçaõ que retorna a instancia de banco
	public static Banco getInstancia() {
		if(instanciaBanco == null) {
			instanciaBanco = new Banco();
		}
		return instanciaBanco;
	}
	
	public void addConta(String nome, Conta conta) {
		
		tabela.put(nome, conta);
	}
	
	public double totalDinheiro() {
		
		int valor = 0;
		
		for (Map.Entry<String, Object> entry : tabela.entrySet()) {
			
			Conta conta = (Conta) entry.getValue();			
			
			valor += conta.getSaldo();
			
		}
			
		return valor;
		
	}
	
	public int totalContas() {
		return tabela.size();
		
	}
	
	public void depositar(String nome, double fundos) {
		
		Conta conta = (Conta) tabela.get(nome);
		
		conta.depositarFundos(fundos);
		
	}
	
	public double saldo(String nome) {
		
		Conta conta = (Conta) tabela.get(nome);
		
		
		
		return conta.getSaldo();
		
	}
	
	
	
	

}
