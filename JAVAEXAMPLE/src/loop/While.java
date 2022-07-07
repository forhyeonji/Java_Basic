package loop;

public class While {

	public static void main(String[] args) {
	
		// while(조건식){반복할 문장}
		// 1~100까지 숫자의 합이 100 미만이 될 동안 반복하라.
		
		int sum=0;
		int i=0;
		while (sum<100) {
			sum+=i;
			i++;
		}
		
		System.out.println(sum);
		
		
		// do{반복할 문장} while(조건식)
		
		int sum=200;
		int i=0;
		do {
		
			sum+=i;
			i++;
		}
		while(sum<100);
		System.out.println(sum);
		
		
		
	}

}
