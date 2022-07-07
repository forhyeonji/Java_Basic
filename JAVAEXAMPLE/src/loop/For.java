package loop;

public class For {

	public static void main(String[] args) {
	
		// 반복해서 실행.
		
		// for(초기값;조건식;증감값){반복할 문장}
		int sum = 0;
		int i=0;
		for(i=0;i<=100;i++) {
			
			sum+=i;
			
		}
		
		System.out.println("1~"+(i-1)+"까지의 합은 "+sum);
		// 1~100까지 숫자를 더하라.
		
		
		

	}

}
