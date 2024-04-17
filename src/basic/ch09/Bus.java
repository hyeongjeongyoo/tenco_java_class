package basic.ch09;

public class Bus {

	int busNumber;
	int passengerCount; // 승객 수
	int money; // 수익금
	
	// 강제성 부여
	public Bus(int number) {
		// 객체 생성시에 제일 먼저 실행되는 부분
		busNumber = number;
	}
	
	// 메서드 기능 - 승객을 태운다.
	public void take(int pay) {
		// money = money + pay;
		// 복합대입연산자
		money += pay;
		// passengerCount = passengerCount + 1;
		passengerCount++;
	}
	
	// 현재 상황을 보여주는 기능을 만들어 보자.
	public void showInfo() {
		System.out.println("버스 번호 : " + busNumber);
		System.out.println("버스 승객수 : " + passengerCount);
		System.out.println("버스 수익금 : " + money);
	}
	
}// end of class
