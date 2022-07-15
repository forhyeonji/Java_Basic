package inheritance;
// 자식클래스
public class Child extends Parent {
	
	int x=20;
	
	
	void method() {
		
		System.out.println("x="+x); //나한테 있는 x
		System.out.println("this.x="+this.x); //나한테 있는 x
		System.out.println("super.x="+super.x); //부모한테 있는 x
		
	}
}
