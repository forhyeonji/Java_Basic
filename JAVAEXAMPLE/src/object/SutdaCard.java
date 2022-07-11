package object;





public class SutdaCard {
	
	int num;
	boolean isKwang;

	
	SutdaCard(int num, boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;

	}
	
	SutdaCard(){
		this(1, true);
		
	}

	public String info() {
			String a="";
		if (isKwang==true) {
			a = num+"K";
		} else if (isKwang==false) {
			a = num+" ";
		}
			
			return a;
	
			
		
	}

}