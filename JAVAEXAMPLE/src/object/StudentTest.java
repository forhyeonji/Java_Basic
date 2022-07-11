package object;

public class StudentTest {

	public static void main(String[] args) {
		Student st = new Student();
		
		st.kor=10;
		st.eng=20;
		st.math=30;
		System.out.println(st.getTotal());
		System.out.println(Math.round(st.getAverage()*10)/10.0);
		// Math.round : 소수 첫째자리에서 반올림함.
		// 24.6666 * 10
		// 246.666 /10  -> 반올림 : 247 / 10
		// 24.7
	}

}
