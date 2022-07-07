package array;

import java.util.Scanner;

public class random2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		int num = (int)(Math.random()*100)+1;
		int sum = 0;
		while(true) {
				System.out.println("★★★ 제가 생각한 숫자를 맞춰보세요 ★★★");			
				System.out.print("1과 100 사이의 값을 입력하세요>");
				int answer = s.nextInt();
				
		if(num!=answer) {
			if(num>answer) {
			System.out.println("더 큰 수를 입력하세요.");
			System.out.println(" ");
			System.out.println(" ");
			} else if (num<answer){
				System.out.println("더 작은 수를 입력하세요.");
				System.out.println(" ");
				System.out.println(" ");
			}
		sum++;
		} // 첫번째 if
		else {
			sum++;
			System.out.println("맞췄습니다.");
			System.out.println("시도 횟수는 "+sum+"번입니다");
			break;
		}//else
	} // while
		
		
	}

}
