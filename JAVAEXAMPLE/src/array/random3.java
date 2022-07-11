package array;

import java.util.Scanner;

public class random3 {

	public static void main(String[] args) {
		
		// 1~100까지의 정수 중에서 3의 배수의 총합을 구하라
		int sum=0;
		for(int i=1;3*i<=100;i++) {
			sum+=3*i;
		}
		System.out.println(sum);
		
		
		// 주사위 랜덤 게임, 눈의 합이 5가 되면 실행을 멈춘다.
		Scanner s = new Scanner(System.in);	
		
		
		
		while(true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
				System.out.println("★★★ 주사위 눈의 합이 5가 되면 당신이 승리합니다. ★★★");			
				System.out.println("---> 주사위를 굴리겠습니까?");
				System.out.println("           네 : 1, 아니오 : 2");
				int answer = s.nextInt();
				
		if(answer==1) {
				if ((num1+num2)==5) {
					System.out.println("("+num1+","+num2+")");
					System.out.println("당신이 승리하였습니다.");
					System.out.println(" ");
					System.out.println(" ");
					break;
				} else {
					System.out.println("("+num1+","+num2+")");
					System.out.println("당신이 졌습니다.");
					System.out.println(" ");
					System.out.println(" ");
				}
		} else if (answer==2) {
			System.out.println("주사위 게임이 종료되었습니다.");
			System.out.println(" ");
			System.out.println(" ");
			break;
		} // 첫번째 if
			
	} // while
		
		
		
		
		
		
		
		
		
		
		
		
	}

