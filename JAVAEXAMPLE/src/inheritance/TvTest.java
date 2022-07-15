package inheritance;

public class TvTest {

	public static void main(String[] args) {
		// static이 없는 인스턴스 메서드에 연결 하려면 new 써야함
		// Tv클래스를 인스턴스 생성 (Tv t = new Tv();)
		// new Tv() (Tv 클래스의 주소를 생성)
		// Tv()는 생성자를 호출
		
		// 포함관계 : TvTest 안에 Tv 클래스를 포함시킨 것
		CaptionTv t = new CaptionTv();
		
		
		// Tv클래스에 있는 channel 변수에 10을 초기화
		t.channel=10;
		t.channelUp(); //channel++; 메서드 이므로 채널은 11이 됨
		System.out.println(t.channel);
	
		// boolean의 기본값은 false
		t.displayCaption("자막 봄1");
		t.caption=true;
		t.displayCaption("자막 봄2");
		
	}

}
