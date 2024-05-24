package io.file.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedFileCopy {

	public static void main(String[] args) {

		// (바이트 기반 스트림을 활용)
		// 기반 스트림 + 보조 스트림을 활용해서
		// 파일 복사 기능을 만들고
		// 소요 시간을 측정하시오
		
		long start = System.nanoTime();
		
		String sourceFilePath = "D:\\workspace\\java\\teco_java\\b.zip";
		String desitnationFilePath = "b_copy.zip";
		
		try (
				FileInputStream fis = new FileInputStream(sourceFilePath);
				BufferedInputStream bis = new BufferedInputStream(fis);
				
				FileOutputStream fos = new FileOutputStream(desitnationFilePath);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				){
			
			int data;
			
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			bos.flush(); // 매번 입출력을 발생하는 것이 아니라 한 번에 입출력을 사용
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		long end = System.nanoTime();
		long duration = end - start;
		System.out.println(duration);
		
		// 소요 시간을 초 단위로 변환 - > 포맷팅
		double seconds = duration / 1_000_000_000.0;
		
		// String 클래스에 format 메서드 사용해보기
		String resultFormat = String.format("소요 시간은 : %.6f 입니다.", seconds);
		
		// %는 포맷 지정자의 시작
		// f 지정자는 float, double 유형의 변수를 인자로 받아 처리 하겠다.
		System.out.println(resultFormat);
		
		
	}// end of main

}// end of class
