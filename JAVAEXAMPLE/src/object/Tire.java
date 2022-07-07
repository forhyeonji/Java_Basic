package object;

public class Tire {

	// 타이어 class 만듬. main메서드가 아님
	/*
	 	속성(변수)
	 	총 폭 (width): 205
	 	림 경 (kyung): 15
	 	편평비 (ratio): 75
	 */
	
	int width = 205;
	int kyung = 15;
	int ratio = 75;
	
	/*
		메서드(함수)
		하중(weight)을 지탱하는 기능
		진행방향을 전환(transform)하는 기능
		노면으로부터 충격을 완화(ease)하는 기능
	 */
	
	void weight(int a, int b) {
		System.out.println("하중(weight)을 지탱하는 기능");
	}
	
	void transform(int c) {
		System.out.println("진행방향을 전환(transform)하는 기능");
	}
	
	void ease(float d) {
		System.out.println("노면으로부터 충격을 완화(ease)하는 기능");
	}
	


}