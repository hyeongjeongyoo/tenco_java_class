package basic.ch20;

public class FruitTest {

	public static void main(String[] args) {
		
		// 다형성
		// 다양한 형태로 클래스(데이터 타입)를 바라 볼 수 있다.
		
		Fruit fruit1 = new Banana(); // 업캐스팅된 상태 부모의 데이터 타입으로 자식에게 부여된 것
		Fruit fruit2 = new Peach();
		
		fruit1.showInfo();
		fruit2.showInfo();
		
		System.out.println("----------------------------------------");
		
		// 다형성을 사용하면 코드를 유연하게 작성할 수 있다.
		
		Banana banana1 = new Banana(); // 업캐스팅된 상태 부모의 데이터 타입으로 자식에게 부여된 것
		Peach peach1 = new Peach();
		Peach peach2 = new Peach();
		
		
		// 배열
		Fruit[] fruits = new Fruit[3];
		fruits[0] = banana1;
		fruits[1] = peach1;
		fruits[2] = peach2;
		
		System.out.println("-----------------------------------------");
		// fruit[0] -> 바나나
		// 바나나의 속성인 origin 을 출력하시오.
		// 바나나의 기능인 slaeBanan() 메서드를 호출하시오.
		// Banana bananaCasting = ((Banana)fruits[0]);
		// bababaCasting.origin;
		System.out.println(((Banana)fruits[0]).origin);
		((Banana)fruits[0]).saleBanana();
		
		System.out.println("-----------------------------------------");
		
		// 배열은 반복문과 함께 많이 사용된다.
		// 0 -> 바나나
		// 1 -> 복숭아
		// -> classcastexception
		
		// instanceof 연산자를 알아야 한다.
		// instanceof : 실행시점(런타임)에 객체가 특정 클래스의 인스턴지인지 확인하는 키워드
		for(int i = 0; i < fruits.length; i++) {
			// 방어적코드
			if(fruits[i] instanceof Banana) {
				((Banana)fruits[i]).saleBanana();				
			}else {
				fruits[i].showInfo();
			}
		}
		
		
	}// end of main
	
}// end of class
