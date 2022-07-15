package AccessModifier;

import test.protectedvsDefault;

public class protectedvsDefaultTest extends protectedvsDefault {

	public static void main(String[] args) {
		protectedvsDefaultTest pvd = new protectedvsDefaultTest();
		
		// protected 는 동일한 패키지거나 상속받았을때
		// default 는 동일한 패키지 안에서만
		
		pvd.Protected=10;
		pvd.Default=10;
		pvd.proadd();
		pvd.defadd();

	}

}
