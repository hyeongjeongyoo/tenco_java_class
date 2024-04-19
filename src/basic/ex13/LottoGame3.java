package basic.ex13;

public class LottoGame3 {

	public static void main(String[] args) {

		// static 변수 -> 클래스 변수라고도 불린다.
		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();

		// 전체 1 ~ 6 까지 나온 결과값을 오름차순으로 정렬
		// 단, 중복값 제외

		// 수식을 작성해주세요
		// if -> 반복문 사용 금지 if 문 6개로 구성

		int temp = 0;
		// 5, 1, 9, 7, 2, 3 가정

		// 반복 횟수 : 6번
		for (int pass = 1; pass <= 6; pass++) {
			//	     5      >     1
			if (gameNumber1 > gameNumber2) {
				// 5
				temp = gameNumber1;
				// 1
				gameNumber1 = gameNumber2;
				// 5
				gameNumber2 = temp;
			}
			// 1, 5, 9, 7, 2, 3 
			//      5       >     9
			if (gameNumber2 > gameNumber3) {
				// 5
				temp = gameNumber2;
				// 9
				gameNumber2 = gameNumber3;
				// 5
				gameNumber3 = temp;
			}
			// 1, 5, 9, 7, 2, 3 
			//       9      >     7
			if (gameNumber3 > gameNumber4) {
				// 9
				temp = gameNumber3;
				// 7
				gameNumber3 = gameNumber4;
				// 9
				gameNumber4 = temp;
			}
			//        7     >     2
			if (gameNumber4 > gameNumber5) {
				// 7
				temp = gameNumber4;
				// 2
				gameNumber4 = gameNumber5;
				// 7
				gameNumber5 = temp;
			}
			//       7      >     3
			if (gameNumber5 > gameNumber6) {
				// 7
				temp = gameNumber5;
				// 3
				gameNumber5 = gameNumber6;
				// 7
				gameNumber6 = temp;
			}
		}

		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
		System.out.print(gameNumber3 + "\t");
		System.out.print(gameNumber4 + "\t");
		System.out.print(gameNumber5 + "\t");
		System.out.print(gameNumber6 + "\t");

	}// end of main

}// end of class
