package basic.ch05;

public class WarriorMainTest {

	// 메인 함수 - 코드의 시작점 -> JVM Stack
	public static void main(String[] args) {

		// new -> 예약어, () <- 생성자
		Warrior worrior1 = new Warrior();
		// 메모리에 올라가면 객체라 부른다. heap (동적 메모리 영역에 올라간다.)
		// 객체의 접근은 . 연산자를 통해서 접근할 수 있다.

		Warrior worrior2 = new Warrior();

		worrior1.name = "티모";
		worrior1.health = 100;
		worrior1.attackPower = 30;
		worrior1.defencsPower = 1;

		System.out.println("--------------");

		worrior2.name = "야스오";
		worrior2.health = 120;
		worrior2.attackPower = 20;
		worrior2.defencsPower = 2;

		System.out.println("--------------");

		System.out.println(worrior1.name);
		System.out.println(worrior2.name);

	}// end of main

}// end of class
