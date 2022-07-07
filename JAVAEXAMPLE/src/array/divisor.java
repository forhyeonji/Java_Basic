package array;

import java.util.Scanner;

public class divisor {

	public static void main(String[] args) {
		

		Scanner s = new Scanner(System.in);
	
		System.out.print("약수가 궁금한 숫자를 입력해 주세요>");
		int num = s.nextInt();
		int sum = 0;
		System.out.print("{");
		for(int i=1;i<=num;i++) {
		
			if(num%i==0) {
				if(num==i) {
				System.out.print(i);
				}else {
				System.out.print(i+", ");
				}
				
				sum++;
			}
			
			
		}
		System.out.println("}");
		System.out.println("약수의 개수는 "+sum+"개 입니다.");
		
	}

}
