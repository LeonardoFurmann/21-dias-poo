
public class Teller {

	public static void main(String[] args) {
		
		Account account1 = new Account(1000);
		Account account2 = new Account(500);
		Account account3 = new Account(400);
		Account account4 = new Account();
		Account account5 = new Account(1000);
		
		
		System.out.println("Valores retirados = " + account1.withrawFunds(999));
		System.out.println("Valores retirados = " + account5.withrawFunds(1500));
		
		System.out.println("A conta 1 tem o saldo de " + account1.getBalance());
		System.out.println("A conta 2 tem o saldo de " + account2.getBalance());
		System.out.println("A conta 3 tem o saldo de " + account3.getBalance());
		System.out.println("A conta 4 tem o saldo de " + account4.getBalance());
		System.out.println("A conta 5 tem o saldo de " + account5.getBalance());

		
	}

}
