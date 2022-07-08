package object;

import java.util.Scanner;

public class CalculatorTest2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("연산하고자 하는 식을 입력하세요");
		double num1 = s.nextDouble();
		String op = s.next();
		double num2 = s.nextDouble();
		
		Calculator2.cal(num1, op, num2);

	}
}

