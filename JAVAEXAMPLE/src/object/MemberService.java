package object;

public class MemberService {

	public static void main(String[] args) {
		

		Member user1 = new Member("hong", "12345");
		Member user2 = new Member("java", "15");
		
		System.out.println(user1.login());
		System.out.println(user2.login());
		user1.logout("hong");
	}

}
