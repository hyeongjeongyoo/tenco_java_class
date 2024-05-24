package io.file.ch04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 문자 기반 스트림 + 보조 문자 기반 스트림 확인
// 현재 코드는 한 줄 입력하면 종료 됨
// 여러줄 반복적으로 동작할 수 있도록 기능을 추가해주세요.
public class StandardInputExample2 {

	public static void main(String[] args) {

		// 문자 기반 스트림 + 보조 문자 기반 스트림을 사용한다.
		try (
				InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
				BufferedReader br = new BufferedReader(isr)
				){
			
			boolean flag = true;
			while(flag) {

				// isr -> 한 문자씩 읽는 기능 read() 를 가지고 있었다.
				// br -> 한 번에 한 라인씩 읽을 수 있는 기능을 가지고 있다.
				System.out.println("여러줄의 텍스트를 입력하세요.");
				System.out.println("입력을 종료하려면 빈줄에서 엔터를 누르세요.");
				
				// isr.read(); -> 기능 확정인
				String inputUserData = br.readLine();
				System.out.println("입력 확인 : " + inputUserData);
				
				if(inputUserData == "") {
					System.out.println("종료됩니다.");
					flag = false;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}// end of main

}// end of class
