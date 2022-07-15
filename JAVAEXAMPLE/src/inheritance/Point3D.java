package inheritance;

public class Point3D extends Point2D {

	int z;
	
	Point3D(int x, int y, int z){
		super(x,y);  // 부모에 있는 생성자를 자식한테 줄때 쓰는 함수
		this.z=z;
	}
	
	
	String getLocation() {
		return "x: "+x+", y: "+y+", z: "+z;
	}
	
	
	
	
}
