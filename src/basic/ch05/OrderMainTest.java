package basic.ch05;

public class OrderMainTest {

	// 코드의 시작점 - 메인함수
	public static void main(String[] args) {

		Order order1 = new Order();
		Order order2 = new Order();
		Order order3 = new Order();

		order1.number = 3;
		System.out.println(order1.number);
		order2.name = "유형정";
		System.out.println(order2.name);
		order3.address = "부산광역시 북구";
		System.out.println(order3.address);

	}// end of main

}// end of class
