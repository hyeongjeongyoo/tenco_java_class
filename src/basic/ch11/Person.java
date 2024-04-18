package basic.ch11;

public class Person {

	// this 의 3가지 사용방법
	// 1. this 는 자기 자신을 가리킨다. (인스턴스의 주소)
	// 2. 생성자에서 다른 생성자를 호출할 때 사용할 수 있다.
	// 3. 자신의 주소(참조값, 주소값)를 반환 시킬 수 있다.

	// 변수 세팅 -> private
	private String name;
	private int age;
	private String phone;
	private String gender;

	// 1.
	// 생성자
	public Person(String name, int age) {

		// 자기 자신의 멤버 변수 name 외부에서 들어오는 지역 변수 name 을 대입한다.
		this.name = name;
		this.age = age;

	}

	// 2.
	// 생성자에서 다른 생성자를 호출 할 수 있다 this();
	public Person(String name, int age, String phone) {
		this(name, age);
		this.phone = phone;
//		다른 생성자를 가장 먼저 호출하고 다른 수식을 작성해야 한다. 
//		this.name = name;
//		this.age = age;
//		this(name, age);
	}

	public Person(String name, int age, String phone, String gender) {
		this(name, age, phone);
//		this.name = name;
//		this.age = age;
//		this.phone = phone;
		this.gender = gender;
	}

	// 3.
	// 자신의 주소값을 반환 시킬 수 있다.
	public Person getPerson() {
		// 자신의 주소값을 반환 시킨다.
		return this;
	}

	public void showInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}

	// 연습문제
	// setName 메서드를 만들어 주세요
	public void setName(String name) {
		this.name = name;
	}

	// getter 를 이용해서 만들어주기
	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

}// end of class
