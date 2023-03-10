package exe4;

public class FolhaDePagamento {
	
	private int totalHoras;
	private int totalVendas;
	private int totalPagamento;
	
	public void pagarFuncionaios(Funcionario[] funcionarios) {
		for (int i = 0; i < funcionarios.length; i++) {
			Funcionario funcionario = funcionarios[i];
			totalPagamento+= funcionario.calcularPagamento();
			funcionario.imprimirContracheque();
		}
		
	}
	
	public void calculaBonus(Funcionario[] funcionarios) {
		for (int i = 0; i < funcionarios.length; i++) {
			Funcionario funcionario = funcionarios[i];
			
			System.out.println(funcionario.calcularBonus());
		}
	}
	
	public void informacaoFuncionario(FuncionarioComissionado func) {
		totalVendas+= func.getVendas();
	}
	
	public void informacaoFuncionario(FuncionarioHorario func) {
		totalHoras+= func.getHoras();
	}
	
	public void relatorio() {
		System.out.println("Relatório de pagamento: ");
		System.out.println("Total horas " + totalHoras);
		System.out.println("Total vendas " + totalVendas);
		System.out.println("Total pagamento " + totalPagamento);
	}
}
