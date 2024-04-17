package basic.ch09;

public class War {

	// 메인 코드
	public static void main(String[] args) {

		Warrior worrior1 = new Warrior("전사1", 10 , 90);
		Warrior worrior2 = new Warrior("전사2", 7, 100);
		
		System.out.println("------------------");
		worrior1.attchWarrior1(worrior2);
		System.out.println("전사2의 공격력 : " + worrior2.attack);
		System.out.println("전사2의 hp 확인 : "+ worrior2.hp);
		
		System.out.println("------------------");
		worrior2.attchWarrior2(worrior1);
		System.out.println("전사1의 공격력 : " + worrior1.attack);
		System.out.println("전사1의 hp 확인 : " + worrior1.hp);
		
	}// end of main

}// end of class
