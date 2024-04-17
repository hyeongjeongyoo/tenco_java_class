package basic.ch01;


/**
 * <- 여러줄 주석 혹은 독 주석
 * 변수란 뭘까?
 * 변하는 수(변할 수 있는 데이터)
 * 데이터(값)를 담을 수 있는 메모리 공간(상자)
 */
public class variable {

	// 코드의 시작점 (메인 함수)
	public static void main(String[] args) {
		
		// 변수를 활용하는 3가지 유형
		
		// 1. 변수를 선언
		int ageBox; // 정수값을 담을 수 있는 상자를 선언
		int telBox; // 정수값을 담을 수 있는 상자를 선언
		
		// RAM 컴퓨터 주 기억 장치(메모리공간)
		// 프로그램을 실행시키면 어딘가에 상자 두 개를 만들어준것 (값을 담을 수 있는 공간)
		
		// 2. 변수에 값을 넣기
		ageBox = 30; //상자에 값을 넣다(초기화 하다) -> 어떤 상자에 접근해야 할지 이름이 필요하다.
		telBox = 300;
		
		// 3. 변수를 사용하기
		System.out.println(ageBox);
		ageBox = telBox;
		
		System.out.println("after -> ageBox : " + ageBox);
		System.out.println("-----------------------------");
		System.out.println(telBox);
		

	} // end of main

} // end of class
