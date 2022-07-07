package array;

import java.util.Scanner;

public class money {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);	
		/*
		System.out.println("금액을 입력해 주세요.");
		int money = s.nextInt();
		int mill1 = money/10000;
		int mill2 = (money-mill1*10000)/5000;
		int mill3 = (money-(mill1*10000)-(mill2*5000))/1000;
		int mill4 = (money-(mill1*10000)-(mill2*5000)-(mill3*1000))/500;
		int mill5 = (money-(mill1*10000)-(mill2*5000)-(mill3*1000)-(mill4*500))/100;
		int mill6 = (money-(mill1*10000)-(mill2*5000)-(mill3*1000)-(mill4*500)-(mill5*100))/10;
		
		System.out.println("금액 : "+money+"원");
		System.out.println("만원권 "+mill1+"장");
		System.out.println("오천원권 "+mill2+"장");
		System.out.println("천원권 "+mill3+"장");
		System.out.println("오백원권 "+mill4+"장");
		System.out.println("백원권 "+mill5+"장");
		System.out.println("십원권 "+mill6+"장");
		
		-----------------------------------
		
		System.out.println("금액을 입력해 주세요.");
		int money = s.nextInt();
		int _50000 = 0;
		int _10000 = 0;
		int _5000 = 0;
		int _1000 = 0;
		int _500 = 0;
		int _10 = 0;
		
		_50000 = money/50000;
		_10000 = money % 50000 / 10000;
		_5000 = money % 50000 % 10000 / 5000;
		_1000 = money % 50000 % 10000 % 5000 / 1000 ;
		_500 = money % 50000 % 10000 % 5000 % 1000 / 500 ;
		_10 = money % 50000 % 10000 % 5000 % 1000 % 500 / 10 ;
		
		System.out.println("오만원권 : "+_50000+"장");
		System.out.println("만원권    : "+_10000+"장");
		System.out.println("오천원권 : "+_5000+"장");
		System.out.println("천원권    : "+_1000+"장");
		System.out.println("오백원권 : "+_500+"장");
		System.out.println("십원권    : "+_10+"장");
		*/
		
		
		// 금액을 저장하는 변수
		int money = 37210;
		// 지폐 또는 동전의 갯수를 저장하는 배열
		int [] coincnt= {50000,10000,5000,1000,500,100,50,10};
		// for문
		System.out.println(money+"의 거스름돈");
		System.out.println(" ");
		for (int i =0;i<coincnt.length;i++) {
			System.out.println(coincnt[i]+"원 : " + money/coincnt[i] + "장");
			money%=coincnt[i];
		}
	}

}
