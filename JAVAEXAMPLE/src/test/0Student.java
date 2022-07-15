
	package test;

	import java.util.Scanner;

	public class Student {
		private static final int i = 0;

		public static void main(String[] args) {
			
			boolean run = true;
		    int stunum = 0;
		    int[] scores = null;
		    Scanner scanner = new Scanner(System.in);

		    while (run) {
		      System.out.println("----------------------------------------------");
		      System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		      System.out.println("----------------------------------------------");
		      System.out.print("선택 > ");

		      int selectNo = scanner.nextInt();

		      if (selectNo == 1) {
		        System.out.print("학생수 : ");
		        stunum = scanner.nextInt();
		        scores = new int[stunum];
		      } else {
		        if (scores == null) {
		          System.out.println("학생 수를 먼저 입력해주세요.");
		          continue;
		        }
		        if (selectNo == 2) {
		          for (int i = 0; i < scores.length; i++) {
		            System.out.print("scores[" + i + "] : ");
		            scores[i] = scanner.nextInt();
		          }
		          System.out.println();
		        } else if (selectNo == 3) {
		          for (int i = 0; i < scores.length; i++) {
		            System.out.print("scores[" + i + "] : " + scores[i] + " ");
		          }
		          System.out.println();
		        } else if (selectNo == 4) {
		          int max = 0;
		          int sum = 0;
		          for (int i = 0; i < scores.length; i++) {
		            if (scores[i] > scores[max])
		              max = i;
		          }
		          System.out.println("최고 점수 : " + scores[max]);
		          for (int score : scores) {
		            sum += score;
		          }
		          System.out.println("평균 점수 : " + sum / 3);
		        }else if (selectNo == 5) {
			        run = false;
			      } 
		      }
		    }
		    System.out.println("프로그램 종료");
		}
	}
		


