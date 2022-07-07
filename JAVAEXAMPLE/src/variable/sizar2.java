package variable;

import java.util.Scanner;

public class sizar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("암호를 입력하시오.");
		String str= s.nextLine(); // next() => nextLine()  nextLine : 한 줄단위. nextInt : 숫자입력받기
		char[] arr = new char[str.length()];

		for (int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if (ch>='a' && ch<='z') {
				ch = (char)(ch+3); 	// ch = (char)(ch+3) => ch += 3 형변환 안해줘도 이렇게하면 됨
				if (ch>'z') { ch-=26; }		//보통 if안 내용이 한줄일때는 이런식으로 많이 사용함. 코드 줄 수 줄이기 위해서?
			} else if (ch>='A' && ch <='Z') {
				ch = (char)(ch+3); // ch = (char)(ch+3) => ch += 3 형변환 안해줘도 이렇게하면 됨
				if (ch>'Z') 	// 줄바꿈을 하든 안하든 괄호로 구분하는 습관 들이기
					ch-=26;
			}

			arr[i]=ch;
		}
	System.out.println(arr);
	}
}
