package basic.ch12;

public class Card {

	// 멤버 변수, static 변수
	private static int cardEmployee = 1000;
	private int cardNumber = 1000;
	static String name;

	// 멤버 변수
	public Card(String name) {
		cardEmployee = cardNumber++;
	}

	// 멤버 변수

	// get, set 작성

	public static int getCardEmployee() {
		return cardEmployee;
	}

	public static void setCardEmployee(int cardEmployee) {
		Card.cardEmployee = cardEmployee;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Card.name = name;
	}


	// 코드 테스트(메인 함수)
	public static void main(String[] args) {

		Card card1 = new Card("유형정1");
		Card card2 = new Card("유형정2");
		Card card3 = new Card("유형정3");

		System.out.println(card1.cardNumber);
		System.out.println(card2.cardNumber);
		System.out.println(card3.cardNumber);

	}// end of main

}// end of class
