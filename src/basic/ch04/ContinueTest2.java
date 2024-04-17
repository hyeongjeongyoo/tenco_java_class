package basic.ch04;

public class ContinueTest2 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 1부터 100까지 숫자 중에 3의 배수를 출력하세요.
		// 1 ~ 100 -> 반복적인 패턴이 확인
		// 만약 3의 배수라면 화면에 숫자를 출력하세요.
		// 반복문 while 을 사용해 주세요
		// 3 6 9 12 15 18
		// 반복은 100번
		// i++; 식 사용하기 (무한 반복 예방)

		// 풀이 1.
//		int i = 1;
//		while(i < 101) {
//			if(i % 3 == 0) {
//				System.out.println(i);
//			}
//			i++;
//		}

		// 풀이 2.
		// 특정 조건이 되었을 때 반복문을 멈추어라
		int num = 1;

		boolean flag = true;
		while (flag) {

			if (num % 3 == 0) {
				System.out.println("3의 배수 : " + num);
			}

			// while 특정 조건일 때 깃발을 바꾼다
			if (num == 100) {
				flag = false;
				// num == 100
				// break; 도 가능
			}

			num++; // i == 101

//			sum = num * 3;
//			System.out.println("sum : " + num);
//			System.out.println("sum : " + sum);

		} // end of while

	}// end of main

}// end of class
