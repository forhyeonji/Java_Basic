package object;

public class Return {

	
	
	int sol (int a, int b) {
		int sum=0;
		for(int i=1;i<=b;i++) {sum+=i;}
		
		
		int sum2=0;
		for(int j=1;j<a;j++) {sum2+=j;}
		
		
		return (sum-sum2);
		
	}
	
}
