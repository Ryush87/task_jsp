package day_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * �ڵ����ҽ� �ݱ�
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
		// �� �ڵ� ����ȭ( jdk 7�������� �߰�)
		// AutoCloseable �������̽��� �����ϰ� �ִ� ��ü�� ��밡��
		try(FileInputStream fis = new FileInputStream("");
			FileInputStream fos  = new FileInputStream("")) { // ��ü�� ������ ���� ����
			
		} catch (IOException e){
			
		}
	} // end of main
} // end of class
