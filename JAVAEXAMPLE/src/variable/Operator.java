package variable;

public class Operator {

	public static void main(String[] args) {
		int a = 85;
		
		// java는 기본적인 정수 int 타입으로 인식을 함
		// 타입 일치 필요
		// 형변환 방법 : (타입) 변수명
		
		// 1) int → byte
		
		byte b = (byte)a;  // 강제형변환 (데이터손실이 일어남)
		
		// 2) byte → int
		
		b=10;  // 자동형변환 (작은쪽에서 큰쪽으로 갈 때)
		a=b;
		
		
		// int(4) → float(4)		
		float c = a;		
		// float(4) → int(4)	
		a=(int)c; //실수로 강제형변환
		// 똑같은 크기이지만 더 많이 표현되는것이 더 크다. 즉, 정수보다 실수가 더 크다.
	
		
		// 자동 형변환을 고르시오
		/* e
		 byte b = 10;
		 char ch = 'A';
		 int i = 100;
		 long l = 1000L;
		 
		 a. b = (byte)i;			// byte(1)<int(4)   : 강제형변환
		 b. ch = (char)b;			// char(2)>byte(1)  : 강제형변환 ★ 서로 데이터 손실이 일어날 수 밖에 없어서
		 c. short s = (short)ch;	// short(2)>char(2) : 강제형변환 ★ 서로 데이터 손실이 일어날 수 밖에 없어서
		 d. float f = (float)l		// float(4)<long(8) : 자동형변환 ★ 크기가 크든 작든 실수는 정수보다 크다
		 e. i = (int)ch;			// int(4)>char(2)   : 자동형변환
		
	
		char 0~65,535
		byte -128~127
		
		char 0~65,535
		short -32,768~32,767
		
		* 양쪽 다 데이터 손실이 일어날 수 밖에 없음 그래서 무조건 강제 형변환
		* 실수는 정수보다 크다
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	
	}

}
