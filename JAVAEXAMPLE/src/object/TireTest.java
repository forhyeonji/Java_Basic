package object;

public class TireTest {

	public static void main(String[] args) {
		
		// 앞(front) 왼쪽(left) 타이어
		Tire fl = new Tire();  // -> Tire에 새로운 주소 만들고 0x100 이 주소를 fl라는 변수에 저장
		fl.kyung=20;
		System.out.println(fl.kyung);
		// 앞(front) 오른쪽(right) 타이어
		Tire fr = new Tire();  // -> Tire에 새로운 주소 만듬 0x200 이 주소를 fr라는 변수에 저장
		System.out.println(fr.kyung);
		// 뒤(back)  왼쪽(left) 타이어
		Tire bl = new Tire();  // -> Tire에 새로운 주소 만듬 0x300 이 주소를 bl라는 변수에 저장
		// 뒤(back)  오른쪽(right) 타이어
		Tire br = new Tire();  // -> Tire에 새로운 주소 만듬 0x400 이 주소를 br라는 변수에 저장
		
		

	}

}
