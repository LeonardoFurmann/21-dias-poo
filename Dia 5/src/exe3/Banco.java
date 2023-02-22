package exe3;

public class Banco {

	public static void main(String[] args) {
		
		
		System.out.println(" \n \\\\\\\\\\\\\\\\  Poupança \\\\\\\\\\\\  \n"  );
		
		ContaPoupança conta1 = new ContaPoupança(0.05, 700);
		
		System.out.println(conta1.verificarSaldo());
		
		conta1.adicionarJuros();
		
		System.out.println(conta1.verificarSaldo());
		
		System.out.println("\n  \\\\\\\\\\\\\\\\ Vencimento Programado \\\\\\\\\\\\\\\\ \n");
		
		ContaVencimentoProgramado conta2 = new ContaVencimentoProgramado(0.05, true, 0.05, 1000);
		
		System.out.println(conta2.getMulta());
		
		System.out.println(conta2.sacarFundos(1000));
		
		System.out.println(conta2.verificarSaldo());
		
		
		System.out.println("\n \\\\\\\\\\\\\\  Cheque \\\\\\\\\\\\\\\\  \n");
		
		ContaComCheque conta3 = new ContaComCheque(3, 1, 1000);
		
		System.out.println(conta3.sacarFundos(100));
		System.out.println(conta3.sacarFundos(100));
		System.out.println(conta3.sacarFundos(100));
		System.out.println(conta3.sacarFundos(100));
		
		System.out.println(conta3.verificarSaldo());
		
		conta3.calculaTaxa();
		
		System.out.println(conta3.verificarSaldo());
		
		
		System.out.println("\n \\\\\\\\\\\\\\  Cheque Especial \\\\\\\\\\\\\\\\  \n");
		
		ContaComChequeEspecial conta4 = new ContaComChequeEspecial(0.05, 1000);
		
		System.out.println(conta4.sacarFundos(1500));
		
		System.out.println(conta4.verificarSaldo());
		
		System.out.println(conta4.getJuros());
		
		conta4.aplicarJuros();
		
		System.out.println(conta4.verificarSaldo());
	}

}
