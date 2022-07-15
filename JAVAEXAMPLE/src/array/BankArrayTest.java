package array;

import java.util.Scanner;

public class BankArrayTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BankArray[] bank = new BankArray[5];

		int push=0;
		int i=0;
		
		
		bank[0]=new BankArray();
		bank[1]=new BankArray();
		bank[2]=new BankArray();
		bank[3]=new BankArray();
		bank[4]=new BankArray();
		
		while(true) {
			System.out.println("===============================");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("===============================");
			System.out.print("선택>");
			int op = s.nextInt();
			if(op==1) {	
				while (true) {
					
					System.out.println("---------");
					System.out.println("계좌생성");
					System.out.println("---------");
					System.out.print("계좌번호 : ");
					
					if(bank[0].account==null) {
						bank[0].account = s.next();
					}else {
					
						String over = s.next();
						for(int k=0;k<i;k++) {
							if(!bank[k].account.equals(over)) {
								bank[i].account = over;
								break;}
							if(bank[k].account.equals(over)) {
								System.out.println("계좌가 중복됩니다.");
								break;
							}else {
								continue;
							}
						}
						
					}
					
				if(bank[i]!=null) {	
					
					System.out.print("계좌주 : ");
					bank[i].name=s.next();
					System.out.print("초기입금액 : ");
					bank[i].balance=s.nextInt();
					System.out.println("결과 : 계좌가 생성되었습니다.");
					

					System.out.println("계속 생성 하시겠습니까? 1.예 2.아니오");
					int answer=s.nextInt();
					if(answer==1){
						i++;
					}else {
						i=0;
						break;
					} 
				}
				
				
				}// op1-while
				
				
		} else if(op==2) {
			
				
				System.out.println("---------");
				System.out.println("계좌목록");
				System.out.println("---------");
				
				
				for(i=0;i<bank.length;i++) {
					if(bank[i].account!=null) {
						System.out.println(bank[i].account+" "+bank[i].name+" "+bank[i].balance);
					}
				}//op2-for
				
				
		} else if(op==3) {
			System.out.println("---------");
			System.out.println("예금");
			System.out.println("---------");
			System.out.print("계좌번호 : ");
			String plus = s.next();
			System.out.print("예금액 : ");
			push = s.nextInt();
			
			
			for(i=0;i<bank.length;i++) {
				
				if(!bank[i].account.equals(plus)) {
					System.out.println("정확한 계좌를 입력해 주세요.");
					break;
				}
				
				if(bank[i].account.equals(plus)) {
					bank[i].balance+=push;
					System.out.println("결과 : 예금이 성공되었습니다.");
					System.out.println("남은금액 : "+bank[i].balance+"원");
					break;
				} else {
					continue;		
				}
			}//for
			
		} else if(op==4) {

			System.out.println("---------");
			System.out.println("출금");
			System.out.println("---------");
			System.out.print("계좌번호 : ");
			String minus = s.next();
			System.out.print("출금액 : ");
			push = s.nextInt();
			
			for(i=0;i<bank.length;i++) {
				
				if(!bank[i].account.equals(minus)) {
					System.out.println("정확한 계좌를 입력해 주세요.");
					break;
				}
				if(bank[i].account.equals(minus)) {
							if(bank[i].balance>=push) {
								bank[i].balance-=push;
								System.out.println("결과 : 출금이 성공되었습니다.");
								System.out.println("남은금액 : "+bank[i].balance+"원");
								break;
							}else if (bank[i].balance<push){
								System.out.println("잔액이 부족합니다.");
								System.out.println("남은금액 : "+bank[i].balance+"원");
								break;
							}
							
				} else {
					continue;
					}
				
				
				
			}//for
			
		} else if(op==5) {
			System.out.println("프로그램 종료");
			break;
		}
		}//while
	}	//end
}  //end

