package Exception;

import java.util.Scanner;
import java.util.InputMismatchException;

public class randomDice {

	public static void main(String[] args) {
		
		
	
		int sum=0;
		int answer=(int)(Math.random()*100)+1;
		int input=0;
		System.out.println(answer);

	
			while(true) {
			
				sum++;
				
				System.out.println("1과 100 사이의 값을 입력하세요.");
				
			try {
				Scanner s = new Scanner(System.in);
				input=s.nextInt();
			
			} catch(InputMismatchException e) {
				
				System.out.println("숫자만 입력할 수 있습니다. 다시 입력해 주세요~");
				continue;
		
			} 
	
			if (answer==input) {
				System.out.println("정답!!");
				System.out.println(sum+"번만에 맞추셨습니다!!");
				break;
			}
			
			if (input<answer) {
				System.out.println("더 큰 수를 입력하세요.");
			}else if (input>answer) {
				System.out.println("더 작은 수를 입력하세요.");
			}
	}
		

	}

}
