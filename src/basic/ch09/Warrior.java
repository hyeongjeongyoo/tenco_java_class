package basic.ch09;

public class Warrior {
	
	String name;
	int attack;
	int hp;
	
	public Warrior(String myName, int myAttack, int myHp) {
		System.out.println("11111111111111111111");
		name = myName;
		attack = myAttack;
		hp = myHp;
	}
	
	// 전사1을 공격
	public void attchWarrior1(Warrior warrior1) {
		System.out.println("전사2가 전사1을 공격한다");
		warrior1.beAttack(this.attack);
	}
	
	// 전사2를 공격
	public void attchWarrior2(Warrior warrior2) {
		System.out.println("전사1이 전사2를 공격한다");
		warrior2.beAttack(this.attack);
	}

	// 내가 공격을 받는다
	public void beAttack(int attack) {
		System.out.println("2222222-2222222");
		// 때린다
		// hp -> -1
//		if(hp <= 0) {
//			System.out.println("이미 죽었습니다.");
//			return;
//		}
		this.hp -= attack;
		
	}
	

//	public void showInfo() {
//		
//		System.out.println("공격하는 애 : " + name);
//		System.out.println("공격 : " + attack);
//		System.out.println("피 : " + hp);
//		System.out.println("방어 : " + defense);
//		
//	}

	
}// end of class
