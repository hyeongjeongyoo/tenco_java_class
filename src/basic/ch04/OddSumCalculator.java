package basic.ch04;

import java.util.Scanner;

public class OddSumCalculator {

	// 코드의 시작점
	public static void main(String[] args) {

		// 사용자의 입력값을 받아서 1부터 maxNum 까지 숫자에서 홀수를 덧셈하고 출력하시오.
		// 1, 3, 5, 7, 9...
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 입력하세요 : ");
		
		int maxNum = sc.nextInt(); // 입력 받는 값
		int sum = 0; // 몇 번 반복하냐
		//             1      1
		// 1 ~ 10; 
		//sum =    1 2 3 4 5 6 7 8 9 10
		// 몇 번 반복인가 -> 5번 반복
		for(int i = 1; i <= maxNum; i = i + 2) {
			//     0 + 1
			sum = sum + i;
			// i = 어떻게 변하는게 
			System.out.print("sum : " + sum + "\n");
		}
		
	}// end of main

}// end of class
