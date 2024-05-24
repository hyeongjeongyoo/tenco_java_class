package io.file.ch01;

import java.io.FileInputStream;

public class MyFileInputStream_copy {

	public static void main(String[] args) {

		// 외부에 있는 파일 데이터를 읽으려면 input 이 필요하다.
		// 자바 IO 라이브러리 안에 있는 InputStream 을 가져옴
		
		
		// try-catch 리소스를 활용하지 않았기 때문에 밖에서 생성
		// try-catch 리소스를 활용하면 자동으로 닫아줌
		
		// 초기화 null 이유
		// FileInputStream in; 으로 하면 마지막에 자원을 닫아주어야 되는데 ( finally  catch{in.close} )
		// -> 그때 초기화하라고 오류가 남
		FileInputStream in = null;
		
		try {
			in = new FileInputStream("aa.txt");
	
		} catch (Exception e) {

		}
		
		
		
	}// end of main

}
