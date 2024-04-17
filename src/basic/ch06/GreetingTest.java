package basic.ch06;

import java.util.Scanner;

public class GreetingTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("안녕하세요, [" + greet(name) + "] 님!");

	}// end of main

	static String greet(String name) {
		return name;
	}

}// end of class
