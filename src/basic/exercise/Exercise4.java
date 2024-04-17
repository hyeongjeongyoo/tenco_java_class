package basic.exercise;

import java.util.Scanner;

public class Exercise4 {

	// 코드의 시작점 - 메인함수
	public static void main(String[] args) {

		// 사용자한테 값을 입력 받기
		// 횟수가 정해지면 for문, 횟수가 정해지지 않았다면(사용자자에게 달렸다면) while
		Scanner sc = new Scanner(System.in);
		int choice;
		// \n -> 무조건 한줄 내림
		boolean flag = true;
		while(flag) {
			
			System.out.println("\n메뉴 선택");
			System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
			System.out.print("선택 : ");
	
			choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.println("등록을 선택했습니다.");
			} else if (choice == 2) {
				System.out.println("조회를 선택했습니다.");
			} else if (choice == 3) {
				System.out.println("수정을 선택했습니다.");
			} else if (choice == 4) {
				System.out.println("삭제합니다.");
			} else if (choice == 0){
				System.out.println("프로그램을 종료합니다.");
				break; // while 반복문을 빠져나와 프로그램 종료
			} else {
				System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
			}
		}
		
		
		//내가 짠 코드
//		System.out.println("\n메뉴 선택");
//		System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
//		System.out.print("선택 : ");
//
//		choice = sc.nextInt();
//		boolean flag = true;
//		while (flag) {
//			
//			// 만약 사용자가 1을 선택했다면
//			if (choice == 1) {
//				System.out.println("등록을 선택했습니다.");
//				flag = false;
//			} else if (choice == 2) {
//				System.out.println("조회를 선택했습니다.");
//				flag = false;
//			} else if (choice == 3) {
//				System.out.println("수정을 선택했습니다.");
//				flag = false;
//			} else if (choice == 4) {
//				System.out.println("삭제합니다.");
//				flag = false;
//			} else if (choice == 0){
//				System.out.println("프로그램을 종료합니다.");
//				flag = false;
//			} else {
//				System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
//				choice = sc.nextInt();	
//				flag = true;
//			}
//			
//		}// end of while
		
		
		

	}// end of main

}// end of class