package AccessModifier;

public class Account {

	private int balance=0;  //잔고
	private final int MAX_BALANCE=1000000;
	private final int MIN_BALANCE=0;
	
	Account(int balance){
		setBalance(balance);
	}
	
	
	public int getBalance() {return balance;}
	public void setBalance(int balance) {
		if(MIN_BALANCE<=balance && MAX_BALANCE>=balance){
			this.balance = balance;
			}
	
	
	
	
	
	
	}
}
