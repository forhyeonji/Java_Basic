package inheritance;

public class Point2D {
	
	int x;
	int y;
	
	Point2D(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	String getLocation() {
		return "x: "+x+"y: "+y;
	}
	
	
}
