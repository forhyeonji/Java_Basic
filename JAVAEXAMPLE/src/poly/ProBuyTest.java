package poly;

public class ProBuyTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		// Product p = new Computer()
		b.buy(new Computer()); // 컴퓨터를 사겠다.

		// Product p = new Tv()
		b.buy(new Tv()); // Tv를 사겠다.
		
		System.out.println("현재 소유한 금액은"+b.money+"만원입니다.");
		
	}

}
