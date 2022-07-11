package object;

public class Return {

	
/*	
	int sol (int a, int b) {
		int sum=0;
		for(int i=1;i<=b;i++) {sum+=i;}
		
		
		int sum2=0;
		for(int j=1;j<a;j++) {sum2+=j;}
		
		
		return (sum-sum2);
		
*/

 int sol (int a, int b){
	int sum=0;
	int tmp = 0;
	// a>b 이면,
	if(a>b) {
	// a값을 tmp변수에 저장
		tmp=a;
	
	// b값을 a변수에 저장
		a=b;
	// tmp 변수값을 b변수에 저장
		b=tmp;
	
	}
	
	for (int i=a; i<=b;i++) {
		sum+=i;
	}
	return sum;
	
	
	}
	
}
