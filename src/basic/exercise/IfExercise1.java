package basic.exercise;

import java.util.Scanner;

public class IfExercise1 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 정수값 입력받기
		System.out.println("값을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();
		System.out.println("로깅 - 받은 값 확인 :" + point);
		
		// 조건문을 완성 하세요 
		// 90점 이상 -> A 학점 입니다. 
		// 80점 이상 -> B 학점 입니다. 
		// 70점 이상 -> C 학점 입니다.
		// 60점 이상 -> D 학점 입니다.
		// 59점 이하 -> F 학점 입니다.  
		
		if(point >= 90) {
			System.out.println("A 학점 입니다.");
		}else if(point >= 80) {
			System.out.println("B 학점 입니다.");
		}else if(point >= 70) {
			System.out.println("C 학점 입니다.");
		}else if(point >= 60) {
			System.out.println("D 학점 입니다.");
		}else{
			System.out.println("F 학점 입니다.");
		}
		sc.close();
		
	}//end of main

}//end of class