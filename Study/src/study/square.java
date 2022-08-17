package study;
import java.util.Scanner;
public class square {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("x :");
		int x = s.nextInt();
		System.out.print("y :");
		int y = s.nextInt();
		System.out.print("w :");
		int w = s.nextInt();
		System.out.print("h :");
		int h = s.nextInt();
		
		System.out.print("최단거리 :");
		
		int min=Math.abs(x-w);
		
		if(Math.abs(x-h)<=min){
			min=Math.abs(x-h);
		}
		
		if (x<=min) {
			min=x;
		}
		
		if (Math.abs(y-w)<=min) {
			min=Math.abs(y-w);
		}
		
		if (Math.abs(y-h)<=min) {
			min=Math.abs(y-h);
		}
		
		if (y<=min) {
			min=y;
		}
		
		System.out.println(min);
		

	}

}
