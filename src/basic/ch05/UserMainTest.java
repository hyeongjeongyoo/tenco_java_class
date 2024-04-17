package basic.ch05;

public class UserMainTest {

	// 코드의 시작점 - 메인함수
	public static void main(String[] args) {

		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		User user4 = new User();
		
		user1.name="유형정";
		user2.address="부산광역시 북구";
		user3.num="010-000-0000";
		user4.passWord="qwerty";
		
		System.out.println(user1.name);
		System.out.println(user2.address);
		System.out.println(user3.num);
		System.out.println(user4.passWord);
		
	}// end of main

}// end of class
