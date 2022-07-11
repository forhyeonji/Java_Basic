package object;

public class Member {

	String name;
	String id;
	String password;
	int age;
	
	Member(String id, String password){
		this.id=id;
		this.password=id;
	}
		
	boolean login() {
		if(id=="hong" && password=="12345") {
			return true;
		}else { return false;}
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}




}



