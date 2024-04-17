package basic.ch04;

public class BreakTest2 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 문제 1.
		// for 문 대신 while 변경해서 결과를 출력해보세요
		// 중간에 멈추는 break 문
		// 소수 7이면 반복문을 멈추어라
		int i = 1;
		// 단독 if 문은 수행이 될수도 있고 안될수도 있다
		while (i < 11) {
			if (i % 7 == 0) {
				// 중간에 멈추어라 > break
				break;
			}
			System.out.println("i의 값 : " + i);
			i++;
		}

	}// end of main

}// end of class