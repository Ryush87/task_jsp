package day_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 자동리소스 닫기
 */
public class Z02_ExceptionHandling {
	public static void main(String[] args) {
		/*
		FileInputStream fis = null;
		try {
		 fis = new FileInputStream("fime name"); //get file
		 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		*/
		// 위 코드 간략화( jdk 7버전에서 추가)
		// AutoCloseable 인터페이스를 구현하고 있는 객체만 사용가능
		try(FileInputStream fis = new FileInputStream("");
			FileInputStream fos  = new FileInputStream("")) { // 객체를 복수로 관리 가능
			
		} catch (IOException e){
			
		}
	} // end of main
} // end of class
