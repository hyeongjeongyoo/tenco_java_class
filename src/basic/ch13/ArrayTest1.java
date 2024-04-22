package basic.ch13;

public class ArrayTest1 {

	// 코드의 시작점 - 메인 함수
	public static void main(String[] args) {

		// 배열이란?
		// 연관된 데이터를 모아서 통으로 관리하기 위한 데이터 타입

		// 배열의 특징 (중요)
		// 배열은 사용하기 전에 반드시 몇 개의 데이터가 들어갈지
		// 크기를 지정해야 사용할 수 있다.

		// 배열 메모리 공간 만들기
		int[] numbers = new int[3];
		int intBoxes[] = new int[5];

		// 값 넣기 (초기화)
		// 배열의 길이 -> 3
		// 인덱스의 길이 -> 2
		numbers[0] = 1000;
		numbers[1] = 1001;
		numbers[2] = 1002;
		// numbers[3] = 1003; // -> 인덱스의 길이를 벗어 났음, 오류 발생
		
		// 사전 기반 지식
		// 모든 프로그래밍의 인덱스 번호 시작은 0부터 시작한다.
		
		// 배열의 선언과 동시에 초기화
		int[] grades = new int[] {5, 3, 1};
		int[] grades2 = {5, 3, 1}; // new int[] 생략 가능
		
		// 문제 1
		// 5개의 크기를 가지는 double 타입의 배열을 선언하시오.
		// 단, 배열의 이름은 마음대로 작성하세요.
		double[] num = new double[5]; // [][][][][]
		
		// 문제 2
		// 위에서 선언한 배열의 값을 인덱스 0 ~ 2 까지 초기화 하시오.
		// 값은 아무거나 상관없음
		num[0] = 10.5;
		num[1] = 20.45;
		num[2] = 30.65;
		// 값을 넣지 않으면 실수로 초기화
		// num[3] = 0.0;
		// num[4] = 0.0;
		
		// 문제 3
		// String 타입의 배열을 선언, 배열의 크기는 3개
		// 선언과 동시에 초기화 하세요.
		String[] food = new String[] {"떡볶이", "만두", "튀김"};
		String[] food2 = {"떡볶이", "만두", "튀김"};
		
	}// end of main

}// end of class