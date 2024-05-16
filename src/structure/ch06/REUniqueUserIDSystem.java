package structure.ch06;

import java.util.HashSet;
import java.util.Scanner;

public class REUniqueUserIDSystem {

	private HashSet<String> UserIDs;

	public REUniqueUserIDSystem() {
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

			boolean flag = registerUserID(scID);
			if (flag) {
				System.out.println("새로운 아이디가 등록되었습니다." + scID);
				System.out.println("시스템을 종료합니다.");
				break; // while 종료
			} else {
				System.out.println("이미 등록된 사용자입니다." + scID);
			}

		} // while end

	}// run end

	// 코드 테스트
	public static void main(String[] args) {

		REUniqueUserIDSystem system = new REUniqueUserIDSystem();
		system.run();

	}// end of main

}// end of class
