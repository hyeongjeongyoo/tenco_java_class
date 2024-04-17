package basic.ch04;
// 변수명을 작성할 때 -> 약속(권장사항) -> 코딩 컨벤션
// int myScore; <- 카멜 표기법이라 한다 / 낙타등 같다고~
// 첫 시작의 단어를 대문자로 작성하고 연결의 단어도 대문자로 표기한다면
// -> 파스칼 케이스
public class IfTest {

	// 코드 시작점(메인 함수)
	public static void main(String[] args) {

		// 조건문(제어문) if
		// 주어진 조건에 따라서 실행이 이루어 지도록 흐름을 만든다.
		// if .... -> 만약 ~ 이라면
		
		boolean flag = true;
		
		if(flag) {
			//수행구문
			System.out.println("너 출력됨 ^-^");
			flag = false;
		}//end of if - 블록의 범위를 기억!
		
		System.out.println("코드가 여기까지 내려 옵니다. : " + flag);
		
	}//end of main

}// end of class
