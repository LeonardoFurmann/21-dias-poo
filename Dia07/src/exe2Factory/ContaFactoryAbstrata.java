package exe2Factory;

import exe2.Conta;
import exe2.ContaComCheque;
import exe2.ContaComChequeEspecial;
import exe2.ContaPoupança;
import exe2.ContaRecompensas;
import exe2.ContaVencimentoProgramado;

public interface ContaFactoryAbstrata {
	
	
	public ContaPoupança criarContaPoupança(double juros, double saldoInicial);
	
	public ContaComCheque criarContaComCheque(int limiteTransações, double taxa, double saldoInicial);
	
	public ContaComChequeEspecial criarContaComChequeEspecial(double juros, double saldoInicial);
	
	public ContaRecompensas criarContaRecompensas(double juros, double saldoInicial, double nivelDeposito);
	
	public ContaVencimentoProgramado criarContaVencimentoProgramado(double multa, double juros, double saldoInicial);
}
