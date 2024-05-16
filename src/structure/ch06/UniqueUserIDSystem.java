package structure.ch06;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueUserIDSystem {

	private HashSet<String> UserIDs;

	public UniqueUserIDSystem() {
		this.UserIDs = new HashSet<String>();
	}

	// 사용자 ID 등록 기능
	// 정상적으로 들어가면 true
	// 중복 발생하면 false
	// HashSet 자료 저장
	// 저장이 잘 됐으면 true, 중복이면 false
	public boolean registerUserID(String userId) {
		return UserIDs.add(userId);
	}

	// 시스템 실행
	public void run() {
		// 동작 - 스캐너 활용
		// 실행 흐름 만들기 -> while, if
		// 결과 -> 정상 유저 등록
		// -> 이미 등록된 사용자 입니다.

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("아이디를 입력해주세요.");

			String scID = scanner.nextLine();

			// 사용자가 입력한 아이디 값을 받아야 함
			// 입력한 아이디가 UserIDs에 저장되는데 없다면 등록 있다면 다시 입력해라는 메세지 호출
			//
			// registerUserID(scID);

			boolean flag = registerUserID(scID);
			if (flag) {
				System.out.println("아이디가 정상 등록되었습니다.");
				System.out.println("프로그램이 종료됩니다.");
				return;
			} else {
				System.out.println("등록된 아이디입니다. 다시 입력하세요.");
			}

		}

	}

	// 코드 테스트
	public static void main(String[] args) {

		UniqueUserIDSystem system = new UniqueUserIDSystem();
		system.run();

	}// end of main

}// end of class
