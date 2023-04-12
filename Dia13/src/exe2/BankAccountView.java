//package exe2;
//
//import javax.swing.JPanel; 
//import javax.swing.JLabel; 
//import java.awt.BorderLayout; 
//import javax.swing.JTextField; 
//import javax.swing.JButton;
//import java.util.ArrayList; 
//import java.awt.event.ActionListener; 
//import java.awt.event.ActionEvent;
//
//public class BankAccountView {
//	
//	public final static String DEPOSIT = "Deposit";
//	public final static String WITHDRAW " Withdraw"; 
//	
//	
//	private BankAccountModel model;
//	private BankAccountController controller;
//	
//	private JButton depositButton = new JButton( DEPOSIT ); 
//	private JButton withdrawButton = new JButton( WITHDRAW );
//	private JTextField amountField = new JTextField(); 
//	private JLabel balancelabel = new JLabel();
//	
//	public BankAccountView( BankAccountModel model ) {
//			this.model = model;
//			this.model.register(this); 
//			attachController(makeController());
//			buildUI(); 
//			}
//
//		public void update() { 
//		balancelabel.setText( "Balance: "  + model.getBalance()); 
//		
//		
//		}
//}