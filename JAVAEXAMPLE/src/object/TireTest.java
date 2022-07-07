package object;

public class TireTest {

	public static void main(String[] args) {
		// main에다가 각각의 클래스를 조립하는 것
		// 기본형 변수 (int a = 10;) : 값을 저장
		// 참조형 변수 (Tire fl = new Tire();) : 주소를 저장 (데이터가 클수록)
		// => Tire 클래스에 새로운 주소를 생성하라
		// Tire에는 원래 주소가 없었음. TireTest에서 new 키워드를 써서 Tire에 주소를 만들어줌.
		
		// 앞(front) 왼쪽(left) 타이어
		Tire fl = new Tire();  // -> Tire에 새로운 주소 만들고 0x100 이 주소를 fl라는 변수에 저장
		System.out.println(fl.kyung);
		// 앞(front) 오른쪽(right) 타이어
		Tire fr = new Tire();  // -> Tire에 새로운 주소 만듬 0x200 이 주소를 fr라는 변수에 저장
		// 뒤(back)  왼쪽(left) 타이어
		Tire bl = new Tire();  // -> Tire에 새로운 주소 만듬 0x300 이 주소를 bl라는 변수에 저장
		// 뒤(back)  오른쪽(right) 타이어
		Tire br = new Tire();  // -> Tire에 새로운 주소 만듬 0x400 이 주소를 br라는 변수에 저장
		
		

	}

}
