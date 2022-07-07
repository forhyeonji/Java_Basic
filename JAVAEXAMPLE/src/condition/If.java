package condition;

import java.util.Scanner;
// 자바는 다른 폴더에 있는 문서를 쓰려면 허락을 받아야함.java폴더 안의 util 폴더안에 Scanner가 있다는 말.

public class If {

	public static void main(String[] args) {
		// else가 없는 if 문
		// 평균이 70점 이상이면 합격
		// 평균을 저장하는 변수 (avg)
		/*float avg=70f;
		if (avg>=70) {
			System.out.println("합격");
		}
		
		// if ~ else 문
		float avg=71.5f
		if (avg>=70) {
			System.out.println("합격");
		}else{
			System.out.println("불합격");
		}*/
		
		// if ~ else if ~ else 문
		// 평균이 70점 이상이면 합격, 평균이 69.5점이면 보류, 그렇지 않으면 불합격
		/*float avg=69.7f;
		// 실수형과 정수형으로 비교했지만 실수형이 더 크니 정수형이 자동으로 실수형으로 바뀌었다.
		if (avg>=70) {
			System.out.println("합격");
		}else if (avg>=69.5) {
			System.out.println("보류");
		}
		else{
			System.out.println("불합격");
		}
*/
	
		Scanner s = new Scanner(System.in);  //scanner는 참조형 타입
		// int a = 10와 같은 형태
		System.out.println("평균값을 입력하세요.");
		float avg=s.nextFloat();
		// 실수형과 정수형으로 비교했지만 실수형이 더 크니 정수형이 자동으로 실수형으로 바뀌었다.
		if (avg>=70) {
			System.out.println("합격");
		}else if (avg>=69.5) {
			System.out.println("보류");
		}
		else{
			System.out.println("불합격");
		}
		
		
		
		
	}

}
