package variable;

public class Casting {

	public static void main(String[] args) {
		// 산술 연산자 (+,-,*,/,%)
		// 비교 연산자 (>,<,>=,<=,!=,==)
		// 논리 연산자 (&&, ||, !부정논리연산자)
		// 대입 연산자 (=, +=, -=, *=, /=, %=)
		// 삼항 연산자 조건식 ? 참 : 거짓
		
	int x = 2;
	int y = 5;
	char c = 'A';
	
	//System.out.print(y>=5 || x<0 && x>2); //true
	//System.out.print(y+=10 - x++); //15-2 = 13
	//System.out.print(y+=10 - ++x); //13+10 - (2+1+1)
	//System.out.print(x+=2); //6
	//System.out.print(!('A' <= c && c <= 'Z')); //false
	//System.out.print('C'-c); //2
	//System.out.print('5'-'0'); //5
	System.out.print(c+1); //66
	System.out.print(++c); //B
	System.out.print(c++); //B
	System.out.print(c); //C
	}

}
