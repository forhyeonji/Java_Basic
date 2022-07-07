package variable;

import java.util.Scanner;

public class sizar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("암호를 입력하시오.");
		String str= s.nextLine();
		
		char[] arr = new char[str.length()];
		
		for (int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if (ch>='a' && ch<='z') {
			ch = (char)(ch+3);
				if (ch>'z')
					ch-=26;
			
			} else if (ch>='A' && ch <='Z') {
			ch = (char)(ch+3);
			if (ch>'Z')
				ch-=26;
			}
			arr[i]=ch;
		}
	System.out.println(arr);
		
		
	
		
	}

}
