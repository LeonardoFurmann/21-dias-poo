package exe3;

public class Banco {

	public static void main(String[] args) {
		
		
		ContaPoupança conta1 = new ContaPoupança(5, 700);
		
		System.out.println(conta1.verificarSaldo());
		
		conta1.adicionarJuros();
		
		System.out.println(conta1.verificarSaldo());
		
		System.out.println("\n\\\\\\\\\\\\\\\\n \n");
		
		ContaVencimentoProgramado conta2 = new ContaVencimentoProgramado(5, true, 5, 1000);
		
		conta2.setMulta(5);
		
		System.out.println( conta2.getMulta());
		
		System.out.println(conta2.verificarSaldo());
		
		System.out.println(conta2.sacarFundos(200));
		
		System.out.println(conta2.verificarSaldo());
		

	}

}
