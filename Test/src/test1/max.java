package test1;

import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);	
	
		
		while(true) {
			
			
		System.out.print("첫번째 값을 입력하시오 : ");
		double a = s.nextDouble();
		
		System.out.print("두번째 값을 입력하시오 : ");
		double b = s.nextDouble();
		
		System.out.println("최대값은 "+Math.max(a, b) + " 입니다.");
		System.out.println("");
		System.out.println("다시하시겠습니까? 1. 예  2. 아니오");
		
		int answer = s.nextInt();
		
		if(answer==2) {
			System.out.println("감사합니다.");
			break;
			
			
		}
		
		
		}
	}
}
