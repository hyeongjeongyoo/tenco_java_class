package basic_ch01;

/**
 * 문자 데이터 타입
 * char 자료형의 크기는 2byte 이다.
 */
public class DataType2 {

	// 코드 시작점
	public static void main(String[] args) {

		// 기본 자료형 중 - 문자 타입(사실은 정수형)
		// 문자를 저장하기 위한 변수를 선언할 때 사용
		// char 타입은 단, 하나의 문자만을 저장할 수 있다.
		
		char charBox;
		charBox = 'B';	// char 는 홑따옴표를 사용한다.
		System.out.println(charBox);
		
		// charBox = '가나'; // 대입불가
		
		// 참고 ! 두 개 이상에 문자가 연속된 형태를 (String) 문자열 -> "안녕반가워"
		
		System.out.println("-----------------------------------------------------");
		System.out.println( (int) charBox);
		
		System.out.println("-----------------------------------------------------");
		//문제 - 소문자 a, b, c, d는 정수 값으로 얼마일까?
		char chBox;
		chBox = 'a';
		System.out.println((int) chBox);
		
		char chBox2;
		chBox2 = 'b';
		System.out.println((int) chBox2);
		
		char chBox3;
		chBox3 = 'c';
		System.out.println((int) chBox3);
		
		char chBox4;
		chBox4 = 'd';
		System.out.println((int) chBox4);
	}// end of class

}// end of main
