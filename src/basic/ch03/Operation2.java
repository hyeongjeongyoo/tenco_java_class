package basic.ch03;

public class Operation2 {

	// 메인 코드 시작 - 코드의 시작점
	public static void main(String[] args) {

		int result1 = 5 + 3;
		int result2 = 5 - 3;
		int result3 = 5 * 3;
		// 고민해볼 사항
		// int result4 = 5 / 3 ;
		double result4 = 5.0 / 3;
		int result5 = 5 % 3;
		
		System.out.println("result1 " + result1);
		System.out.println("result2 " + result2);
		System.out.println("result3 " + result3);
		System.out.println("result4 " + result4);
		System.out.println("result5 " + result5);
		
		
		// 문제
		// 1. (12+3) / 3 값을 화면에 출력해 보세요.
		// 변수명, 데이터 유형 스스로 결정하고 식을 만들어 보세요.
		
		int result6 = (12 + 3) / 3;
		System.out.println("result6 : " + result6);
		
		
		// 2. (25 % 2)값을 화면에 출력해 보세요.
		// 어떤 수를 2로 나누웠을 때 나머지가 0이면 짝수 1이면 홀수
		
		double result7 = (25 % 2);
		System.out.println("result7 : " + result7);
		
		
		// 3. 15를 4로 나눈 후, 그 결과의 절대값을 출력하세요.
		double result8 = 15.0 / 3;
		System.out.println("result8 : " + Math.abs(result8));
		
		// 도전 문제
		// 직접 산술 연산자 문제 만들기 - (2문제 생성)
		// 1. (27 % 5) 값을 절대 값으로 출력하세요.
		double devided = (27.0 % 5);
		System.out.println("27 % 5 의 절대 값 : " + Math.abs(devided));
		
		// 2.
		
	}// end of main

}// end of class