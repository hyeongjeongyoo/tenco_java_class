package basic.ex13;


// 가지고 오다. 수입하다.
import java.util.Random;

public class LottoNumberMaker {
	
	// 멤버 변수
	private String version = "1.0.0";

	// 메인 함수
	public static void main(String[] args) {
		
		System.out.print(makeNumber()+ "\t");
		System.out.print(makeNumber()+ "\t");
		System.out.print(makeNumber()+ "\t");
		System.out.print(makeNumber()+ "\t");
		System.out.print(makeNumber()+ "\t");
		System.out.print(makeNumber()+ "\t");

		// 중복값, 오름차순 or 내림차순으로 정렬할 수 있도록 해보기
		
	}// end of main
	
	// 인스턴스에 속하지 않는 함수 만들기
	public static int makeNumber() {
		// 자바 도구 - 표준 API
		// 난수 발생기 -> 랜덤적인 값을 생성
		
		// 참조타입        기본생성자
		// static 함수 안에 멤버 변수를 사용할 수 없다.
		// 메모리가 뜨는 순서 확인!!
		//System.out.println("version : " + version);
		Random random = new Random();
		
		//random.nextInt(45); // 0 ~ 44 까지 랜덤으로 생성
		int resultNumber = random.nextInt(45)+1; // 0부터 나오면 안되고 1~44 까지 나와야 하니까 int resultNumber
		return resultNumber;
	}
	
}// end of class