package loop;

import java.util.Scanner;

public class bankQ2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int selectNo=1;
		int balance = 3000;
		while (true) {
			System.out.println("-------현지은행---------");			
			System.out.println(" 1.예금 2.출금 3.조회 4.종료");
			System.out.println("---------------------");
			System.out.print("선택>");
			selectNo=s.nextInt();			
			
			
			if	(selectNo == 1) {
				
			System.out.println("예금하실 금액을 입력해주세요.");
			System.out.print("예금액>");
			int plus = s.nextInt();
			balance = balance + plus;
			System.out.println(plus +"원을 입금하였습니다");
			System.out.println("잔액 : "+balance+"원");
			}
			
			
			
			else if (selectNo == 2) {
			
			System.out.println("출금하실 금액을 입력해주세요.");
			System.out.print("출금액>");
			int minus = s.nextInt();
				if(balance<minus) {
					System.out.println("잔액이 부족합니다.");
					System.out.println("잔액 : "+balance+"원");
				} else {
				balance = balance - minus;
				
				System.out.println(minus + "원을 출금하였습니다.");
				System.out.println("잔액 : "+balance+"원");
				}
			
			}
			
			
			
			else if (selectNo == 3) {
			System.out.println("잔액 : "+balance+"원");
			}
			
			
			else if(selectNo == 4){
			System.out.println("이용해 주셔서 감사합니다.");
			break;
			}
			
			
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			

			
		}//while
		
		
	}

}
