package basic.ch22;

public abstract class Calculator implements Calc{

	// 만약 n1 / n2를 나누면 0으로 나눌 수 없습니다 라고 sysout

	// 예상 테스트 값 n1 = 10, n2 = 0
	@Override
	public double divide(int n1, int n2) {
		if(n1 == 0 || n2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0.0;
		}
		return n1 / n2;
	}


	
}
