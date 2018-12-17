package day_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * Input/Output
 * 바이트기반 입력스트림 : InputStream
 * @author Ryush
 *
 */
public class Z05_IO {
	public static void main(String[] args) {
		// 자동리소스 닫기에서 사용가능한 객체 : AutoCoseable 인터페이스를 구현한 객체만 가능 
//		try (FileInputStream fis = new FileInputStream("G:\\Works\\Edu\\Study_Java\\workspace\\day_3\\src\\day_3\\ex_files\\input_test.txt");) {
		try (FileInputStream fis = new FileInputStream("src\\day_3\\ex_files\\input_test.txt")) {
			//파일명 : 절대경로, 상대경로(현재프로젝트 폴더)
//			FileInputStream fis = new FileInputStream("G:\\Works\\Edu\\Study_Java\\workspace\\day_3\\src\\day_3\\ex_files\\input_test.txt"); //절대경로
//			FileInputStream fis = new FileInputStream("input_test.txt"); //상대경로

//			int data = fis.read(); //1byte read
//			System.out.println((char)data);

			//or

//			while (true) {
//				int data = fis.read();
//				if(data == -1) {
//					break;
//				}
//				System.out.println((char)data);
//			}
			
			//or
			
			int data;
			while((data = fis.read()) != -1) {
				System.out.println((char)data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // end of main
} // end of class
