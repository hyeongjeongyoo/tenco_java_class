package basic.ch03;

/**
 * 부호 연산자
 * 단항 연산자 -> 변수에 부호를 변경(리터럴 값이 부호를 변경)
 */
public class Operator {

	public static void main(String[] args) {

		int intData = 1000;
		System.out.println(+intData);
		System.out.println(-intData);
		System.out.println("-----------------------");
		System.out.println(intData);
		// !!반드시 기억 -> 부호 연산자는 변수에 실제 값이 변경 된 것은 아니다.
		
		// 메모리 공간 안에 실제 값을 변경하려면 어떻게 해야 할까?
		// 답은 "대입연산자"와 함께 사용
		
		intData = intData;
		System.out.println("실제 변수 안에 들어있는 값 : " + intData);
		
		
		// 연습
		int oneStepDistance = 1;
		final int ZERO_POINT = 0; // 상수를 사용할 때는 대문자를 권장한다.
		int currentPosition = 0;
		
		// 제로 포인트에서 왼쪽으로 3칸 이동한 값을 출력 하시오.
		// 식
		currentPosition = ZERO_POINT - (oneStepDistance * 3);
		
		// 결과 값 출력
		System.out.println(currentPosition);
		
		// 절대값이란?
		// 절대값이란 어떤 수의 크기를 나타내는 것으로 그 수가 0에서 얼마나 떨어져
		// 있는지를 표시하는 값이다.
		// 즉, 어떤 수의 절대값은 그 수가 양수이든 음수이든 상관없이 항상 양수이다.
		// 참고로 0의 절대값은 0이다.
		
		// currentPosition 값이 양수 였다면 부호 연산자를 통해 변경하고 
		// 절대값이 틀려지게 된다.
		System.out.println(-currentPosition);
		// currentPosition이 현재 왼쪽으로 3칸 이동 즉 -3이기 때문에 -를 넣어 +로 만듬
		// 상단의 코드는 정확하지 않다.

		// 우리는 절대 값을 구하는 알고리즘을 만들어야 한다.
		
		// 자바 개발자들이 이미 만들어 둔 도구이다.
		// Math math; // 수학과 관련된 기능들에 모음, 
		System.out.println("Math 라이브러 사용 : " + Math.abs(currentPosition));
		
	}// end of main

}// end of class
