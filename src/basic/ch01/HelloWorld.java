package basic.ch01;

//프로그래밍 세상과의 첫 인사
//화면에 문자열 Hello World를 출력하기
//
//프로그래밍을 처음 배우는 사람들이 가장 먼저 만들어보는
//프로그램 중 하나는 "Hello World"를 출력하는 프로그램입니다.

public class HelloWorld {

	// <- 주석, 한줄 주석(컴퍼일러가 무시하는 영역입니다.)
	public static void main(String[] args) {

		// 화면에 (콘솔창에) 출력하라
		System.out.println("Hello World");

		System.out.println(); // 출력 후 다음 줄로 넘어가는 역할을 합니다.

		// 숫자 0부터 9까지 화면에 하나씩 출력하시오
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);

		// 우리 일상에서는 10진수라는 개념을 많이 사용하고 있습니다.
		// 10진수란 뭘까?
		// 0 ~ 9 까지 사용하는 수를 말한다.
		// 10 <- 단위 1을 올리고 0부터 다시 시작하는 개념이다.
		
		// 그럼 이진수란
		// 0과 1로만 이루어진 숫자  체계이다.
		// 2진수로 2를 표현한다면
		// 1 -> 2 -> 단위 1을 올리고 -> 10(10진수에서 2이다.)
		// 2진수로 3을 표현한다면
		// 1 -> 10 -> 11(십진수 숫자 3이다.)
		
		System.out.println("코드를 수정 했어");
		
	} // end of main

} // end of class
