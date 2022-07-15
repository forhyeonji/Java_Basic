package inheritance;

public class Entry {

	String word; //인스턴스 변수(약어 저장)
	//메서드 종류 중에서 생성자
	Entry(){} //매개변수가 없는 생성자(기본생성자)
	Entry(String w){ //매개변수가 하나인 생성자
		word=w;
	}
	// 메서드(매개변수가 없고, 리턴도 없는 인스턴스 메서드)
	public void writeView() {  //약어출력
		System.out.println("*****약어사전******");
		System.out.println("약어 : "+word);
	};
	
	
	
	
}
