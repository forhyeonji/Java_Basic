package AccessModifier;

import test.PublicvsDefault;

public class PublicvsDefaultTest2 {

	public static void main(String[] args) {
		PublicvsDefault pvp = new PublicvsDefault();
		
		pvp.Public=10;
		pvp.Default=20;
		
		pvp.pubadd();
		pvp.defadd();
		
	}

}
