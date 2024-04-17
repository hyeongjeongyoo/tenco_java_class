package basic.ch06;

import java.util.Scanner;

public class SquareTest {

	// 메인 함수
	public static void main(String[] args) {

		// 하나의 정수를 입력받아 그 수의 제곱을 반환하는 함수입니다.

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int result = square(num);
		System.out.println(result);

	}// end of main

	static int square(int n1) {
		int result = 0;
		result = n1 * n1;
		return result;
	}
}// end of class
