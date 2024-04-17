package basic.exercise;

public class Exercise5 {

	// 코드의 시작점 - 메인함수
	public static void main(String[] args) {

		// 1단계 - 반복의 횟수 : 5번
		// *      - 1
		// **     - 2
		// ***    - 3
		// ****   - 4
		// *****  - 5
		
		for (int i = 0; i < 5; i++) { // 5 번
			
		}
		
		// 2단계
		System.out.print("*");
		System.out.println();
		System.out.print("**");
		System.out.println();
		System.out.print("***");
		System.out.println();
		System.out.print("****");
		System.out.println();
		System.out.print("*****");
		System.out.println();
		
		System.out.println("----------------");
		
		for (int j = 0; j < 1; j++) {	// 1번 동작
			System.out.print("*");		// print()이다
		}
		System.out.println();
		for (int j = 0; j < 2; j++) {	// 2번 동작
			System.out.print("*");		// print()이다
		}
		System.out.println();
		for (int j = 0; j < 3; j++) {	// 3번 동작
			System.out.print("*");		// print()이다
		}
		System.out.println();
		for (int j = 0; j < 4; j++) {	//4번 동작
			System.out.print("*");		// print()이다
		}
		System.out.println();
		for (int j = 0; j < 5; j++) {	// 5번 동작
			System.out.print("*");		// print()이다
		}
		System.out.println();
		System.out.println("-------------------");
		
		// 3단계
		// outer for문
		for (int i = 0; i < 5; i++) {
			
			// inner for문
			// 첫번째 동작이 왔을 때 j의 값 = 0, j <= 0   -----> 1번 동작 => * => 줄바꿈
			// 두번째 동작이 왔을 때 j의 값 = 0, j <= 1   -----> 2번 동작 => ** => 줄바꿈
			// 세번째 동작이 왔을 때 j의 값 = 0, j <= 2   -----> 3번 동작 => *** => 줄바꿈
			// ...
			// ...
			System.out.println();
			for (int j = 0; j <= i; j++) {	// 5번 동작
				System.out.print("*");		// print()이다
			}
			System.out.println();
			
		}
		
		
	}// end of main

}// end of class