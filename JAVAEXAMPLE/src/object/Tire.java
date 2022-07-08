package object;

public class Tire {


	int width = 205;
	static int kyung = 15;
	int ratio = 75;

	
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