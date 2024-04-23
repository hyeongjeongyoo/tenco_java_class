package basic.ch18;

public class ComputerTest {

	public static void main(String[] args) {

		Computer computer1 = new Computer();
		CPU cpu = new CPU();
		cpu.setName("AMD");
		computer1.setCPU(cpu);
		
		// 우리 컴퓨터에 장착되어 있는 CPU 이름
		// 출력하고 싶다면?
		
		System.out.println(computer1.getCPU().getName());
		
	}// end of main

}// end of class
