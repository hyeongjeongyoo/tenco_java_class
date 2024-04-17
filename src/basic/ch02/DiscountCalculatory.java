package basic.ch02;

public class DiscountCalculatory {

	// 코드 시작점 - 메인 함수
	public static void main(String[] args) {

		// 상수 선언 - 원가, 할인율
		final double PRICE = 59.99;
		final double DISCOUNT = 0.3; // 30% 할인
		
		// 할인된 가격 계산하기 (비지니스 로직)
		// 할인된 가격 = 원가 × (1 − 할인율)
		double disprice = PRICE * ( 1 - DISCOUNT );
		
		// 최종된 가격을 정수형으로 형 변환 처리
		int finalPrice = (int)disprice;
		
		// 결과출력
		System.out.println( "최종 가격 : " + finalPrice);
		System.out.println( "최종 가격(소수점) : " + disprice);
		
	}// end of main

}// end of class
