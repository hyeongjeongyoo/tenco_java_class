package basic.exercise;

public class WhileTest2_2 {

	// 코드의 시작점
	public static void main(String[] args) {
		//1 부터 10까지 덧셈에 연산을 콘솔창에 출력 하시오 단, while 구문 작성
		int start = 1;
		int end = 10;
		int sum = 0;
		
		boolean flag = true; 
		while (flag) {
			if(start == end) {
				flag = false;
			}
			//0 = 0   +   1  -> sum : 1
			//1 = 1   +   2  -> sum : 3
			//3 = 3   +   3  -> sum : 6
			sum = sum + start;
			System.out.println("sum(" + start +") : " + sum);
			start++;
		}
		
	}// end of main

}// end of class