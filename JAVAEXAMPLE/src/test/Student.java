package test;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int m = 0;
		int student=0;  // 학생수
		int grade=0;
		int[] gradeA = null;
		//int[] gradeA = new int[3];
		int i =0;
		int sum=0;
		//int max =0;  // 최대값 초기값 세팅
		
		while(true) {
			
		System.out.println("---------------------------------------------------");
		System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
		System.out.println("---------------------------------------------------");
		System.out.println("선택> ");
	
		m = in.nextInt();
		// 1을 입력하면
		if (m == 1) {
			// 
			System.out.println("학생수> ");
			student = in.nextInt();  
			gradeA = new int [student];
		}
		// 2를 입력하면
		else if (m == 2) {
			
			for(i=0; i<gradeA.length; i++) {
				System.out.println((i+1)+" 번째 학생 > ");
				grade=in.nextInt();	// 배열에 입력을 받겠다.
				gradeA[i] = grade;

			}
		}
		// 3을 입력하면
		else if (m == 3) {
			for(i=0; i<gradeA.length; i++) {
			System.out.println((i+1)+" 번째 학생 > "+gradeA[i]);
			}
		}
		// 4를 입력하면
		else if (m == 4) {
			int max =0;
			for(i=0; i<student; i++) {
			//max = gradeA[0];  
			sum += gradeA[i];
			
			if(gradeA[i]>max) {
				max = gradeA[i];
			}
		}
			System.out.println("최고점수 > "+ max); 
			System.out.println("평균점수 > "+ (float)sum/gradeA.length);
		}
		// 5를 입력하면
		else {
			// 프로그램 종료 출력
			System.out.println("프로그램 종료");
			break;
		}
			
		}
		

	}

}
