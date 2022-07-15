package test;
import java.util.Scanner;
public class Account2 {
	
	Scanner s = new Scanner(System.in);
	
	private int balance=0;  //잔고
	private final int MAX_BALANCE=1000000;
	private final int MIN_BALANCE=0;
	private int push=0;
	
	Account2(){
		setBalance();
	}
	
	
	
	public int getBalance() {return balance;}
	public void setBalance() {
		while(true) {
		System.out.println("입금액을 입력해주세요");
		push=s.nextInt();
		
		
		if(MIN_BALANCE<=push && MAX_BALANCE>=push){
				this.balance += push;
				System.out.println("잔액 : "+balance);
			} else {
				System.out.println("입금한도를 초과하였습니다.");
				System.out.println("잔액 : "+balance);
			}
		
		System.out.println(" ");
		System.out.println("그만두시겠습니까? 1. 예  2.아니오");
		int op=s.nextInt();
		if (op==1) {
			System.out.println("감사합니다.");
			break;
			}
		
		
		}
	
	
	
	
	
	}
}
