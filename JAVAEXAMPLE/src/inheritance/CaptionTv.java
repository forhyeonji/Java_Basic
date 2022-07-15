package inheritance;
// 자식클래스
public class CaptionTv extends Tv {
	// 확장시킬 기능에 대해서만 코딩하면 됨
	
	// 자막을 볼건지(true), 안 볼건지(false)
	boolean caption;
	
	// 자막을 보여주는 기능
	void displayCaption(String text) {
		// caption에 저장되어 있는 값이 true 면, 자막을 보여주세요
		if (caption) {
			// 자막을 보여주세요
			System.out.println(text);
		}
	}


}
