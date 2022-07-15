package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num=0;
		System.out.println("-------------------------------");
		System.out.println("1.학생수 ㅣ 2.점수입력 ㅣ 3.점수리스트 ㅣ 4.분석 ㅣ 5.종료");
		System.out.println("-------------------------------");
		System.out.print("선택> ");
		int op = s.nextInt();
		
		if (op==1) {
			System.out.print("학생수> ");
			num = s.nextInt();
		}
		
		int score[] = new int[num];
		
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("1.학생수 ㅣ 2.점수입력 ㅣ 3.점수리스트 ㅣ 4.분석 ㅣ 5.종료");
			System.out.println("-------------------------------");
			System.out.print("선택> ");
			int op2 = s.nextInt();
			
		
		if (op2==2) {
				for(int i=0;i<num;i++) {
					System.out.println((i+1)+"번째 학생>");
					score[i]=s.nextInt();
					}// for
		
				
				
				
		} else if (op2==3) {
			for(int i=0;i<num;i++) {
			System.out.println((i+1)+"번째 학생>"+score[i]);
					}
	
			
			
			
		} else if (op2==4) {
			Arrays.sort(score);
			double sum=0;
			for(int j=0;j<score.length;j++) {
				sum+=score[j];
			}
			System.out.println("최고 점수 : "+(double)score[score.length-1]);
			System.out.println("평균 점수 : "+sum/num);
		
		} else if (op2==5) {
			System.out.println("프로그램 종료");
			break;
		}
	
	
	}

		
}
}