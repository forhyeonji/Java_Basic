package inheritance;

import java.util.Scanner;

public class Health {
	
	Scanner s = new Scanner(System.in);
	// 속성
	String gender;	// 성별저장(인스턴스 변수)
	double tall;	// 신장저장(인스턴스 변수)
	double weight;	// 체중저장(인스턴스 변수)
	
/*	public Health(String x, double y, double z){
		gender=x;
		tall=y;
		weight=z;
	}*/
/*	public Health(double x) {
		weight=x;
	}*/

	
	
	// 생성자
	Health(){}	// 매개변수가 없는 생성자(기본생성자)
	
	
	void input(){	// 매개변수가 없고 리턴도 없는 메서드
		System.out.println("성별을 입력해주세요. M/F");
		gender = s.next();
		
		System.out.println("키를 입력해주세요.");
		tall = s.nextDouble();
		
		System.out.println("몸무게를 입력해주세요.");
		weight = s.nextDouble();
	}
	
	
	void output() {	// 매개변수가 없고 리턴도 없는 메서드
		System.out.println("***** 비만도 Check *****");
		System.out.println("성별(M/F) : "+gender);
		System.out.println("신장(Cm) : "+tall);
		System.out.println("체중(Kg)  : "+weight);
	}
	
}
