package array;

public class ObjectArrayTest {

	public static void main(String[] args) {
	/*	일반 배열
		int[] array=new int[8];
		//int[] array = {10,20,30,40,50,60,70,80};
		
		array[0]=10;
		array[1]=20;
		
		*/
		
		/*객체 배열*/
		ObjectArray[] objarray = new ObjectArray[5];
		
		//objarray[0]=10; 형태는x score인지 name인지 모르기때문
		objarray[0]=new ObjectArray();
		objarray[0].name="정자바";
		objarray[0].score=100;
		
		objarray[1]=new ObjectArray();
		objarray[1].name="최C";
		objarray[1].score=88;
		
		objarray[2]=new ObjectArray();
		objarray[2].name="이씨샵";
		objarray[2].score=100;
		
		// 나머지 index 3,4는 null값임. if로 값이 null이면
		// break; 해서 for문을 빠져나올 수 있다.

		System.out.println(objarray[0].name);
		System.out.println(objarray[1].score);
		
	}

}
