package basic.ch22;

interface Animal {

	// interface 에는 추상 메서드만 선언 가능
	// public abstract void eat();
	// public abstract void move();

	// 축약 가능
	void eat();
	void move();

}

// implements - 구현하다
class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("강아지가 먹이를 먹다.");
	}

	@Override
	public void move() {
		System.out.println("강아지가 촐랑촐랑 다닌다.");
	}
		
}

class Bird implements Animal{
	
	@Override
	public void eat() {
		System.out.println("참새가 모이를 먹다.");
	}
	
	@Override
	public void move() {
		System.out.println("참새가 날아 다니다.");
	}
	
}