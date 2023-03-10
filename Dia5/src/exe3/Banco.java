package exe3;

public class Banco {

	public static void main(String[] args) {
		
		
		System.out.println(" \n \\\\\\\\\\\\\\\\  Poupança \\\\\\\\\\\\  \n"  );
		
		ContaPoupança conta1 = new ContaPoupança(0.05, 700);
		
		System.out.println("Saldo na conta: " + conta1.verificarSaldo());
		
		conta1.adicionarJuros();
		
		System.out.println("Saldo com juros adicionados na conta: " +conta1.verificarSaldo());
		
		
		
		System.out.println("\n  \\\\\\\\\\\\\\\\ Vencimento Programado \\\\\\\\\\\\\\\\ \n");
		
		ContaVencimentoProgramado conta2 = new ContaVencimentoProgramado(0.05, 0.05, 1000);
		
		System.out.println("Multa: " + conta2.getMulta());
		
		System.out.println("Saque: " + conta2.sacarFundos(500));
		
		System.out.println("Saldo na conta: " + conta2.verificarSaldo());
		
		conta2.vencerPrazo();
		
		System.out.println("Saque com multa pelo prazo vencido :" + conta2.sacarFundos(200));
		
		System.out.println("Saldo na conta: " + conta2.verificarSaldo());
		
		
		
		System.out.println("\n \\\\\\\\\\\\\\  Cheque \\\\\\\\\\\\\\\\  \n");
		
		ContaComCheque conta3 = new ContaComCheque(3, 1, 1000);
		
		System.out.println("Saque: " + conta3.sacarFundos(100));
		System.out.println("Saque: " + conta3.sacarFundos(100));
		System.out.println("Saque: " + conta3.sacarFundos(100));
		System.out.println("Saque: " + conta3.sacarFundos(100));
		
		System.out.println("Saldo na conta: " + conta3.verificarSaldo());
		
		conta3.calculaTaxa();
		
		System.out.println("Saldo com taxa de limite de transações ultrapassado: " + conta3.verificarSaldo());
		
		
		System.out.println("\n \\\\\\\\\\\\\\  Cheque Especial \\\\\\\\\\\\\\\\  \n");
		
		ContaComChequeEspecial conta4 = new ContaComChequeEspecial(0.05, 1000);
		
		System.out.println("Saque: " + conta4.sacarFundos(1500));
		
		System.out.println("Saldo na conta: " + conta4.verificarSaldo());
		
		System.out.println("Juros: " + conta4.getJuros());
		
		conta4.aplicarJuros();
		
		System.out.println("Juros de saldo negativo aplicados no saldo: " +  conta4.verificarSaldo());
	}

}
