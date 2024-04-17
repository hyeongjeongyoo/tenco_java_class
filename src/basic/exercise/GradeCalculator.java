package basic.exercise;

import java.util.Scanner;

public class GradeCalculator {

	// 코드의 시작점
	public static void main(String[] args) {

		System.out.println("성적을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();

		char grade = 'X';
		String message = "잘못된 입력입니다. 성적은 0에서 100 사이로 입력해주세요.";

		// t && f
		// if (score <= 100 && score >= 90) {
		// System.out.println("'A' 학점: \"우수한 성적이네요! 계속 좋은 성적 유지하길 바랍니다.\"");
		// } else if (score >= 80 && score < 90) {
		// System.out.println("'B' 학점: \"좋은 성적입니다. 조금만 더 노력하면 A도 가능해요!\"");
		// } else if (score >= 70 && score < 80) {
		// System.out.println("'C' 학점: \"괜찮은 성적이지만, 더 높은 등급을 위해 노력해봅시다.\"");
		// } else if (score >= 60 && score < 70) {
		// System.out.println("'D' 학점: \"학습에 더 집중할 필요가 있어요. 도움이 필요하면 말해주세요.\"");
		// } else{
		// System.out.println("'F' 학점: \"불합격입니다. 부족한 부분을 파악하고, 추가 학습이 필요해요.\"");
		// }

		// 풀이
		if (score <= 100 && score > 0) {
			if (score <= 100 && score >= 90) {
				grade = 'A';
				message = "우수한 성적이네요! 계속 좋은 성적 유지하길 바랍니다.";

				System.out.println(grade + "학점");
				System.out.println(message);
			} else if (score < 90 && score >= 80) {
				grade = 'B';
				message = "좋은 성적입니다. 조금만 더 노력하면 A도 가능해요!";

				System.out.println(grade + "학점");
				System.out.println(message);
			} else if (score < 80 && score >= 70) {
				grade = 'C';
				message = "괜찮은 성적이지만, 더 높은 등급을 위해 노력해봅시다.";

				System.out.println(grade + "학점");
				System.out.println(message);
			} else if (score < 70 && score >= 60) {
				grade = 'D';
				message = "학습에 더 집중할 필요가 있어요. 도움이 필요하면 말해주세요.";
				
				System.out.println(grade + "학점");
				System.out.println(message);
			} else {
				grade = 'F';
				message = "불합격입니다. 부족한 부분을 파악하고, 추가 학습이 필요해요.";
				
				System.out.println(grade + "학점");
				System.out.println(message);
			}
		}else {
			System.out.println(message);
		}

		sc.close();

	}// end of main

}// end of class
