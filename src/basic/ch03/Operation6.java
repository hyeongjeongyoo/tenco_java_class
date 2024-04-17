package basic.ch03;
/**
 * 논리 연산자
 * 관계 연산자와 혼합하여 많이 사용된다.
 * 연산에 결과는 true, false 으로 반환된다.
 */
public class Operation6 {

	// 메인 코드 시작 - 코드의 시작점
	public static void main(String[] args) {

		// 논리 연산자는 3가지 종류가 있다.
		// 논리곱 && (엠퍼센트, 엠퍼센트)
		// 논리합 || (버티컬바, 버니컬 바)
		// 부정 !
		
		int num1 = 10;
		int num2 = 20;
		
		// 1. 논리곱(&&)
		//                10 T       &&   20 T
		// 논리곱은 전부 true면 true를 반환, 하나라도 거짓이면 false를 반환.
		boolean flag1 = (num1 > 0) && (num2 > 0);
		System.out.println("flag1 : " + flag1);
		
		//                T        &&   F
		boolean flag2 = (num1 > 0) && (num2 < 0);
		System.out.println(flag2);
		
		System.out.println("-----------------------------");
		
		
		
		
		// 2. 논리합(||)
		//                T        ||       F
		// 둘 중에 하나라도 true 이면 연산에 결과는 무조건 true다.
		boolean flag3 = (num1 > 0) || (num2 < 0);
		System.out.println(flag3);
		
		// 3. 부정(!)
		System.out.println("부정 논리 연산자 사용 : " + !flag3);
		//연산의 결과가 어떻게 되는지 궁금해서 확인하는 걸 로깅이라고 한다.
		
		System.out.println("flag3 : " + flag3);
		
		
	}// end of main

}// end of class