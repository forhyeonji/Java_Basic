package Exception;

public class Exception {

	public static void main(String[] args) {
	/*	
		// 컴파일 에러가 아닌 실행 후 일어나는 산술적인 에러
		int a = 10;
		int b = 0;
		System.out.println(a/b); // 10은 0으로 못나눔, 0은 10으로 나누면 0
	*/	
		int a=0;
		int b=0;
		
		System.out.println(1);
		System.out.println(2);
		try {
		System.out.println(3);
		System.out.println(0/0);
		System.out.println(4);
		} catch(ArithmeticException ae) {
			System.out.println(5);
			if(a==0) {
				a=1;
			}
			if (b==0){
				b=1;
			}
		
			System.out.println(a/b);
		
		} //catch
		
		finally{ System.out.println(4);
		}
		
		System.out.println(6);
		
		
		
		// 1. 예외가 발생한 경우
		// try → catch → finally
		// 2. 예외가 발생하지 않은 경우 (catch 실행 안된다.)
		// try → finally
		
		
		


	}

}
