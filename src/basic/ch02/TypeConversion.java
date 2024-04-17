package basic.ch02;

/**
 * 형 변환이란?
 * 데이터 타입을 다른 타입으로 변경하는 것
 * 자동 형변환, 강제 형변환 2가지
 */
public class TypeConversion {

	// 메인 함수 - 코드의 시작점
	public static void main(String[] args) {

		int intDataBox = 100; // 4byte
		double doubleDataBox; // 8byte
		
		doubleDataBox = intDataBox;
		// 작은 상자에서 큰상자로 들어가는 개념이다.
		System.out.println(doubleDataBox);
		// 자동 형 변환
		
		System.out.println("------------------------------------");
		
		// 강제 형 변환이란
		final double PI = 3.14159;
		
		// int intBox = PI; // 컴파일러가 작은 상자에 큰 상자로 값을 넣을 수 없다고 알려주는거다.
		// 컴파일한테 "컴파일러야 괜찮으니까 그냥 강제로 넣어"
		int intBox = (int)PI; 
		System.out.println(intBox);
		// 소수점 값을 그냥 버림
		
		//연습
		double interestRate;
		int discount;
		
		interestRate = 15.5;
		// discount = 변수에 강제 형 변환해서 값을 넣어보자.
		discount = (int)interestRate;
		System.out.println(discount);
		System.out.println( (int)7.5 );
		
		
	}// end of main

}// end of class
