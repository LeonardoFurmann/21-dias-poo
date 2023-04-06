package exe2Factory;

import exe2.Conta;
import exe2.ContaComCheque;
import exe2.ContaComChequeEspecial;
import exe2.ContaPoupança;
import exe2.ContaRecompensas;
import exe2.ContaVencimentoProgramado;

public class ContaFactoryConcreta implements ContaFactoryAbstrata {


	@Override
	public ContaPoupança criarContaPoupança(double juros, double saldoInicial) {
		return new ContaPoupança(juros, saldoInicial);
	}

	@Override
	public ContaComCheque criarContaComCheque(int limiteTransações, double taxa, double saldoInicial) {
		return new ContaComCheque(limiteTransações, taxa, saldoInicial);
	}

	@Override
	public ContaComChequeEspecial criarContaComChequeEspecial(double juros, double saldoInicial) {
		return new ContaComChequeEspecial(juros, saldoInicial);
	}

	@Override
	public ContaRecompensas criarContaRecompensas(double juros, double saldoInicial, double nivelDeposito) {
		return new ContaRecompensas(juros, saldoInicial, nivelDeposito);
	}

	@Override
	public ContaVencimentoProgramado criarContaVencimentoProgramado(double multa, double juros, double saldoInicial) {
			return new ContaVencimentoProgramado(multa, juros, saldoInicial);
	}
	
		

}
