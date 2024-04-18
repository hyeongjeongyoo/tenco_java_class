package basic.ch12;

public class Bank {

	// 회사에 사원이 입사할 때 마다 새로운 사번이 필요한 경우

	// 1. 회사와 사번을 담을 변수가 필요함
	private int company;
	public static int companyNum;

	// 이 Bank 안에 회사와 사번을 담아둔다
	public Bank(int company) {
		this.company = company;
		companyNum = 202404;
	}

	public void CompanyNumberPrinter() {
		System.out.println(company + "의 사번은 " + companyNum);
		companyNum++;
	}
	
}