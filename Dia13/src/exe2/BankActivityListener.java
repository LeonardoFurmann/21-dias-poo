package exe2;

public interface BankActivityListener {
		
	public void withdrawPerformed(BankActivityEvent e );
	
	public void depositPerformed(BankActivityEvent e);
}
