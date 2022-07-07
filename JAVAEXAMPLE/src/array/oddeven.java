package array;

public class oddeven {

	public static void main(String[] args) {

		int[] numarr = {3,4,5,6,7};
		int even = 0;
		int odd = 0;
		for (int i =0; i<numarr.length; i++) {
			if(numarr[i]%2==0) {
				even++;
			}//if
			else {
				odd++;
			}//else
		}//for
 System.out.println("= 홀수 : "+odd+"개, 짝수 : "+even+"개");
		
	}

}
