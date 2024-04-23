package basic.exercise;

public class PhoneBook {

	// 속성
	String name;
	String number;

	// 기능

	
	public PhoneBook(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	// getter
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	
}// end of class
