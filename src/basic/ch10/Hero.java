package basic.ch10;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean isDie;
	
	// getter, setter 메서드를 만들어 주세요.
	// !! getter, setter 는 'only read' 만 가능하다 //
	// 그래서 private 값을 바꾸러면 setter 멤버변수에 접근해서 객체의 상태를 변경
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	public double getDefense() {
		return defense;
	}
	public void setDefense(double defense) {
		this.defense = defense;
	}
	
	public boolean getIsDie() {
		return isDie;
	}
	public void setIsDie(boolean isDie) {
		this.isDie = isDie;
	}
	
}// end of class
