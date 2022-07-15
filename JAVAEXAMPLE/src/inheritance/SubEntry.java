package inheritance;

public class SubEntry extends Entry {
	//속성
	String definition;	// 인스턴스 변수 (원어 저장)
	int year;			// 인스턴스 변수 (시기 저장)
	
	SubEntry(String w){
		word=w;
	}
	SubEntry(String w, String d, int y){
		this(w);
		definition=d;
		year=y;
	}
	public void printView() {
	System.out.println("원어 : "+definition);
	System.out.println("시기 : "+year+"년");
	}
}
