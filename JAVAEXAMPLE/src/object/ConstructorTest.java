package object;

public class ConstructorTest {

	public static void main(String[] args) {
		/* ~~~~~~~~~~ 명시적 초기화 ~~~~~~~~~~ */
		
		// 인스턴스 생성          // 생성자 호출

		// Constructor 클래스에 있는 a 변수에 10 초기화
		// int 의 기본값은 0
		// co.a=10;
		// Constructor 클래스에 있는 b 변수에 20 초기화
		// co.b=20;
		// Constructor 클래스에 있는 c 변수에 30 초기화
		// co.c=30;
		
		
		/* ~~~~~~~~~~ 생성자 초기화 ~~~~~~~~~~ */
		Constructor c1 = new Constructor(10,20,30);
		Constructor c2 = new Constructor(40,50,60);
		Constructor c3 = new Constructor(70,80,90);

	}

}
