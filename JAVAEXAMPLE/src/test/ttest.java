package test;

import java.util.Scanner;

public class ttest {

	public static void main(String[] args) {
		
		
		int button=0;							//실행할 것
		int student=0;							//학생수(입력받을 숫자의 갯수)
		int[] jumsu;								//점수(입력받을 숫자)
		int first=0;							//점수 중 최댓값
		double avg=0;
		double sum=0;
		avg=sum/student;
		
		Scanner s = new Scanner(System.in);
		
		
		jumsu = new int[student];
		for (int i=1; i<=student; i++) {
			jumsu[i] = s.nextInt();
		}
		
		
		
		
		
		

		
		while(true) {
			System.out.println("-----------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------");
			
			
			System.out.print("선택 :");
			
			
			
			button=s.nextInt();
			jumsu = new int[student];
			
			if(button==1) {
				System.out.print("1. 학생수 :");
				student = s.nextInt();
				//학생 수 입력하게 하기
				
			}else if(button==2) {
				System.out.print("2. 점수입력 :");
				for (int i = 1 ; i < student ; i++) {
					jumsu[i] = s.nextInt();		
					}
				//85, 95, 93
				//점수 입력하게 하기
				
			}else if(button==3) {
				System.out.print("3. 점수리스트 :");
				System.out.print("학생:");
			//입력 받은 점수 차례대로 나열
				
			}else if(button==4) {
				
				for(int i = 1; i <jumsu.length; i++){
					if(jumsu[i]>first){
						first=jumsu[i];
				}
				
				System.out.print("4. 분석 :");
				System.out.print("최고 점수 :"+first);
				System.out.print("평균 점수 :"+(avg=sum/student));
				//최고 점수
				//평균 점수
				}
			}else if(button==5) {
				System.out.print("5. 종료 :");
				break;
			}else {
				System.out.print("1~5 사이의 숫자만 입력하시오.");
			}
			
			
			
			
			
		}
		

	}

}