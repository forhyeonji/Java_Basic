package variable;

public class Q3 {

	public static void main(String[] args) {
			
	byte a = 10;
	byte b = 20;
	byte c = (byte) (a+b);
	
	char ch = 'A';
	
	//         char + int
	// int를 char로 바꿔야함
	ch = (char) (ch + 2);
	// 전체를 char 하는 이유는 2만 char로 하면 int로 다시 바뀜
	float f = 3/2f;
	long l = 3000*3000*3000L;
	// 접미사 L을 안붙이면 오버플로우 현상이 나타남.
	float f2 = 0.1f;
	double d = 0.1f;
	boolean result = d==f2;
	System.out.print("c="+c);
	System.out.print("ch="+ch);
	System.out.print("f="+f);
	System.out.print("l="+l);
	System.out.print("result="+result);
		
	
		
		
	}

}
