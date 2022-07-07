package array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// 배열 선언 및 초기화
		// 10 명의 학생의 점수에 총점, 평균, 최대값, 최소값을 구해보자
		//79, 88, 91, 33, 99, 55, 95, 60, 72, 57
		
		
		Scanner s = new Scanner(System.in);		
		int[] score = new int[10];
		int sum=0;
		float avg=0f;
		int max=0;
		int min=100;
		for (int i=0;i<score.length;i++) {
			System.out.println((i+1)+"번째 학생의 점수를 입력하시오.");
			
			score[i]=s.nextInt();
			sum+=score[i];
			avg=sum/(float)score.length; // 실수끼리 나누었을때는 소수점이 표현 x. 표현 안된 상태로 avg따라 f가 되면 소용x. 그래서 나눠주는 실수 한군데에 f로 바꿔줘야함!
		
			
			if (score[i]>max) {
				max=score[i];
			}
			if (score[i]<min) {
				min=score[i];
			}
		}
		System.out.println("총점 : "+sum+"점");
		System.out.println("평균 : "+avg+"점");
		System.out.println("최고점수 : "+max+"점");
		System.out.println("최저점수 : "+min+"점");
		
		
		
	}

}
