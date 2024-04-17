package basic.ch06;

import java.util.Scanner;

public class checkAdultTest {

	// 메인 함수
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		int n1 = sc.nextInt();
		System.out.println(checkAdult(n1));

	}// end of main

	static boolean checkAdult(int n1) {

		boolean num = false;
		if (n1 >= 18) {
			num = true;
		}

		return num;
	}

}// end of class
