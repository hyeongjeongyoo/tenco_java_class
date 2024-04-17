package basic.ch06;

import java.util.Scanner;

public class signOfNumber {

	// 메인 함수
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		System.out.println(signOfNumber(num));

	}// end of main

	static int signOfNumber(int num) {

		if (num == 0) {
			System.out.println("zero");
		} else if (num > 0) {
			System.out.println("positive");
		} else if (num < 0) {
			System.out.println("negative");
		}
		return num;
	}

}// end of class
