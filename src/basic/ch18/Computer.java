package basic.ch18;

public class Computer {
	
	private CPU cpu;
	
	public Computer() {
		cpu = new CPU(); // 콤포지션 관계
		cpu.setName("인텔10");
	}

	public void ComputerOn() {
		System.out.println("컴퓨터가 켜집니다.");
		cpu.on();
	}
	public void ComputerOff() {
		System.out.println("컴퓨터가 꺼집니다.");
		cpu.off();
	}
	
	// 필요하다면 setter 메서드를 만들 수 있다.
	// 외부에서 주입 받을 수 있다.
	public void setCPU(CPU cpu) {
		this.cpu = cpu;
	}
	
	// 외부에서 접근 가능한 getter
	public CPU getCPU() {
		return this.cpu;
	}
	
	
}
