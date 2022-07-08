package object;

import java.util.Scanner;

public class ReturnTest {

	public static void main(String[] args) {
	Return re = new Return();
	Scanner s = new Scanner(System.in);
	
	System.out.println("두 숫자를 입력해 주세요>");
	int num1=s.nextInt();
	int num2=s.nextInt();
	
	System.out.println(num1+" "+num2+" "+re.sol(num1,num2));
	
	
	}

}
