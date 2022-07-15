package inheritance;

public class SubHealth extends Health {

	// 속성
	double s_weight;	// 표준체중 저장(인스턴스 변수)
	double fat;			// 비만도 저장(인스턴스 변수)
	String result;		// 결과값 저장(인스턴스 변수)
	

	// 생성자
	SubHealth() {		// 매개변수가 없는 생성자(기본생성자)
		s_weight = 0.0;
		fat = 0.0;
		result = null;
	}


	// 메서드
	double calculate(){		// 매개변수가 없고 리턴도 없는 메서드

	if (gender.equals("M")) {
		s_weight=(tall-100)*0.9;
		
	}else {

		s_weight=(tall-100)*0.85;
	}
	
	 fat =	(weight/s_weight)*100;
	 return fat;
	}
	
	
	void output() {			// 매개변수가 없고 리턴도 없는 메서드
		System.out.println("***** 비만도 Check *****");
		System.out.println("성별(M/F) : "+gender);
		System.out.println("신장(Cm) : "+tall);
		System.out.println("체중(Kg)  : "+weight);
			
		if (fat>=150) {
			result = "고도비만";
		}else if(fat>=131){
			result = "중도비만";
		}else if(fat>=121){
			result = "경도비만";
		}else if(fat>=111){
			result = "과체중";
		}else if(fat>=91){
			result = "정상(표준체중)";
		}else if(fat<90){
			result = "저체중";
		}
		
		System.out.println("당신은 비만도"+(Math.round(fat*100)/100.0)+"이고, "+result+"입니다.");
	}
	
	
	
	
}
