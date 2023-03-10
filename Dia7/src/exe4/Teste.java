package exe4;

public class Teste {

	public static void main(String[] args) {
		
		FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
		
		FuncionarioComissionado func1 = new FuncionarioComissionado("José", "Silva", 25000, 1000);
		FuncionarioComissionado func2 = new FuncionarioComissionado("Pedro", "Silva", 25000, 1000);
		
		func1.addVendas(7);
		func2.addVendas(5);
		
		FuncionarioHorario func3 = new FuncionarioHorario("Leonardo", "Furmann", 6.50);
		FuncionarioHorario func4 = new FuncionarioHorario("Valdirene", "Padilha", 6.50);
		
		func3.addHoras(40);
		func4.addHoras(46);
		
		folhaDePagamento.informacaoFuncionario(func1);
		folhaDePagamento.informacaoFuncionario(func2);
		folhaDePagamento.informacaoFuncionario(func3);
		folhaDePagamento.informacaoFuncionario(func4);
		
		Funcionario[] funcionarios = new Funcionario[4];
		funcionarios[0] = func1;
		funcionarios[1] = func2;
		funcionarios[2] = func3;
		funcionarios[3] = func4;
		
		folhaDePagamento.pagarFuncionaios(funcionarios);
		folhaDePagamento.relatorio();
		
		folhaDePagamento.calculaBonus(funcionarios);

	}

}
