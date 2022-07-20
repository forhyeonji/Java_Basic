package Exception;
import java.util.Scanner;
import java.util.ArrayList;

public class studystudent {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("학생수 : ");
		int num = s.nextInt();
		study[] stu = new study[num];
		
		for(int i=0;i<num;i++) {
			
			stu[i]=new study();
			System.out.print("학생이름 : ");
			stu[i].name=s.next();
			
			
			System.out.print("학과 (간호, 전기, 컴퓨터) : ");
			stu[i].major=s.next();
	
			
			System.out.print("학년 (1,2,3,4) : ");
			stu[i].grade=s.nextInt();

			
			}
		

		System.out.println(stu[0].name);
		System.out.println(stu[0].major);
		System.out.println(stu[0].grade);
		
		System.out.println(stu[1].name);
		System.out.println(stu[1].major);
		System.out.println(stu[1].grade);

		
	}

}
