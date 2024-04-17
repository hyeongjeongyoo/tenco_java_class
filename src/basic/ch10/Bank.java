package basic.ch10;

import java.util.Scanner;

//은행이라고 바라보자.
public class Bank {

	// 아무것도 지정하지 않으면 default 제어 지시자이다.
	// public String name;
	// private 은 클래스 안에서만 사용이 가능하다.
	// private int balance;

	private String name;
	private int balance;

	// 메서드
	// 1. 입금하다
	public void deposit(int money) {

		balance = balance + money;
		showInfo();
	}

	// 2. 출금하다
	public int withdraw(int money) {
		// 방어적 코드를 작성
		if(balance < money) {
			System.out.println("잘못된 요청입니다.");
			return 0; // int 값을 리턴해야 되니까 0;
		}
		balance = balance - money;
		showInfo();
		return money; // 반환해줘야 하니까 return
	}
	
	// 3. 현재 은행의 총 잔액을 출력하다
	public void showInfo() {
		System.out.println("현재 잔액은 : " + this.balance + " 입니다.");
	}
	
	// 정보 은닉()후에 getter, setter 메서드를 설계해 둘 수 있다.
	// get 메서드란 단순히 객체의 상태 변수를 리턴하는 메서드이다.
	public int getBalance() {
		return this.balance;
	}
	public String getName() {
		return this.name;
	}
	
	Scanner sc = new Scanner(System.in);
	String name2 = sc.next();
	
	// setter 멤버 변수에 접근해서 객체의 상태 값을 변경하게 하는 메서드(리턴 타입 없음)
	public void setName(String inputName) {
		if(name2.length() < 4) {
			System.out.println("3글자 이상 입력하세요.");
		}
		this.name = inputName;
	}
	public void setBalance(int money) {
		
		// 방어적 코드 작성하기
		if(money < 0) {
			System.out.println("잘못된 입력입니다.");
		}else {
			this.balance = money;			
		}
		
	}
	
}// end of class
