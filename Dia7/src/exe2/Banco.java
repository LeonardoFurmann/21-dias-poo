package exe2;


import java.util.Hashtable;
import java.util.Map;
//import java.util.List;

public class Banco {
	
	Hashtable<String, Object> tabela = new Hashtable<>();
	//private List<Conta> contas;
	
	public void addConta(String nome, Conta conta) {
		
		tabela.put(nome, conta);
	}
	
	public double totalDinheiro() {
		
		int valor = 0;
		
		for (Map.Entry<String, Object> entry : tabela.entrySet()) {
			
			Conta conta = (Conta) entry.getValue();			
			
			System.out.println(conta.getSaldo());
			valor += conta.getSaldo();
			System.out.println(valor);
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
