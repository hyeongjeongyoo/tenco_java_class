package basic.ch06;

import java.util.Scanner;

public class findMax {

	// 코드의 시작점
	public static void main(String[] args) {
		
		//입력받은 두 수중에서 가장 큰 값을 반환하는 함수를 작성하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(findMax(num1, num2));

	}// end of main
	
	static int findMax(int num1, int num2) {

		//조건 ? num1 : num2;
		 int max = num1 > num2 ? num1 : num2;
		 return max;
	}

}// end of class
