package basic.ch18;

public class CPU {

	private String name;
	
	public void on() {
		System.out.println("CPU가 켜집니다.");
	}
	public void off() {
		System.out.println("CPU가 꺼집니다.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
