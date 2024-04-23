package basic.exercise;

import java.util.Scanner;

public class PhoneBookManager {

	static int LAST_INDEX = 0;

	public static void main(String[] args) {

		// 스캐너 사용
		Scanner sc = new Scanner(System.in);

		// 배열 선언 100개
		PhoneBook[] phonebook = new PhoneBook[100];
		phonebook[0] = new PhoneBook("유형정", "123456789");
		phonebook[1] = new PhoneBook("아무개", "234567890");
		phonebook[2] = new PhoneBook("호동이", "345678912");
		LAST_INDEX = 98;

		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] != null) {
				System.out.println(phonebook[i].getName());
				System.out.println(phonebook[i].getNumber());
				System.out.println("-------------------------");
			}
		}

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_NUMBER = "3";
		final String SEARCH_EDIT = "4";
		final String DELETE_ALL = "5";
		final String END = "0";
		boolean flag = true;

		// while
		while (flag) {
			System.out.println("**** 메뉴 선택 ****");
			System.out.println("1. 번호 저장 2. 번호 조회 3. 번호 선택 조회 4. 번호 수정 5. 번호 삭제 0. 끝내기");

			String selectNum = sc.nextLine();
			if (selectNum.equals(SAVE)) {
				System.out.println("**** 저장 ****");
				saveNumber(sc, phonebook);
			} else if (selectNum.equals(SEARCH_ALL)) {
				System.out.println("**** 번호 조회 ****");
				readPhone(phonebook);
			} else if (selectNum.equals(SEARCH_BY_NUMBER)) {
				System.out.println("**** 번호 선택 조회****");
				readChoice(sc, phonebook);
			} else if (selectNum.equals(SEARCH_EDIT)) {
				System.out.println("**** 번호 수정 ****");
				numEdit(sc, phonebook);
			} else if (selectNum.equals(DELETE_ALL)) {
				System.out.println("**** 번호 삭제 ****");
				deleteAll(phonebook);
			} else if (selectNum.equals(END)) {
				System.out.println("**** 프로그램 종료 ****");
				flag = false;
			} else {
				System.out.println("**** 잘못된 선택입니다. ****");
			}
		}

	}// end of main

	// 저장하기
	public static void saveNumber(Scanner sc, PhoneBook[] phonebook) {
		System.out.println("이름을 입력하세요");
		String personName = sc.nextLine();
		System.out.println("번호를 입력하세요");
		String personNum = sc.nextLine();

		PhoneBook phone = new PhoneBook(personName, personNum);
		if (LAST_INDEX >= phonebook.length) {
			System.out.println("번호를 저장할 공간이 없습니다");
			return;
		}
		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] == null) {
				phonebook[i] = phone;
				LAST_INDEX++;
				break;
			}
		}
		System.out.println("번호가 저장 되었습니다.");
	}

	// 전체 조회하기
	public static void readPhone(PhoneBook[] phonebook) {

		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] != null) {
				System.out.println(phonebook[i].getName() + " ," + phonebook[i].getNumber());
			}
		}
	}

	// 선택 조회하기
	public static void readChoice(Scanner sc, PhoneBook[] phonebook) {
		System.out.println("이름을 입력하세요.");
		String personName = sc.nextLine();

		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] != null) {

				if (phonebook[i].getName().equals(personName)) {
					System.out.println(phonebook[i].getName() + ": " + phonebook[i].getNumber());
				}
			}

		}
		System.out.println("입력한 이름이 없습니다.");
		// ..없다면 없다고 출력하기

	}

	// 번호 수정
	public static void numEdit(Scanner sc, PhoneBook[] phonebook) {
		System.out.println("이름을 입력하세요.");
		String personName = sc.nextLine();
		boolean isFind = false;
		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] != null) {
				if (phonebook[i].getName().equals(personName)) {
					// 수정할 번호 입력 저장
					System.out.println("변경할 번호를 입력하세요.");
					String personNum = sc.nextLine();
					phonebook[i].setNumber(personNum);
					// 이름이 있다고 변경할 번호를 받고 그 번호를 저장하기
					isFind = true;
					break;

				}
			}
			if (isFind == false) {
				System.out.println("입력하신 이름이 없습니다.");
			}
		}
	}

	// 전체 삭제하기
	public static void deleteAll(PhoneBook[] phonebook) {
		System.out.println(">>>> 전체 삭제하기 <<<<");

		for (int i = 0; i < phonebook.length; i++) {
			phonebook[i] = null;
		}
	}

}// end of class
