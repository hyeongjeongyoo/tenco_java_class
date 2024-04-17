package basic.ch02;

public class TraingleAreaCalculatior {

	// 코드의 시작점 - 메인함수
	public static void main(String[] args) {

		// 삼각형에 밑변 BASE, 단 상수로 선언
		final double BASE = 50;
		
		// 삼각형의 높이 HEIGHT, 단 상수로 선언
		final double HEIGHT = 30;
		
		//결과 값을 area 변수에 저장
		double area = (BASE * HEIGHT) / 2;
		
		// 결과 출력하기
		System.out.println("삼각형의 면적 : " + area);
		
	}// end of main

}// end of class
