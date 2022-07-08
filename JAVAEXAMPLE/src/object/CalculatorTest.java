package object;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		System.out.print("연산하고자 하는 두 정수값과 연산자를 입력하세요>");
		System.out.println("x를 입력하세요");
		int num1=s.nextInt();
		System.out.println("연산자를 입력하세요");
		String op=s.next();
		System.out.println("y를 입력하세요");
		int num2=s.nextInt();
		
		if(op.equals("+")) {Calculator.getAdd(num1, num2);}
		else if(op.equals("-")) {Calculator.getSub(num1, num2);}
		else if(op.equals("*")) {Calculator.getMul(num1, num2);}
		else if(op.equals("/")) {Calculator.getDiv(num1, num2);}
		

	}
}





/*		
	while(true) {
			System.out.print("연산하고자 하는 두 정수값과 연산자를 입력하세요>");
			String cal=s.next();
			
			char[] arr = new char[cal.length()];
			
			for (int i=0;i<cal.length();i++) {
				char ch = cal.charAt(i);
				arr[i]=ch;
			}
			

			if (cal.indexOf("+")>=1) {
				Calculator.getAdd(arr[0]-48,arr[2]-48);
			} else if (cal.indexOf("-")>=1) {
				Calculator.getSub(arr[0]-48, arr[2]-48);
			} else if (cal.indexOf("*")>=1) {
				Calculator.getMul(arr[0]-48, arr[2]-48);
			} else if (cal.indexOf("/")>=1) {
				Calculator.getDiv(arr[0]-48, arr[2]-48);
			}
			
			System.out.println("계속하시겠습니까? 1.예  2.아니오");
			int answer2=s.nextInt();
			
			if (answer2==2) {
				System.out.println("감사합니다.");
				break;
			}
			
		}//while

	}
}

*/










