package day_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * Input/Output
 * ����Ʈ��� �Է½�Ʈ�� : InputStream
 * @author Ryush
 *
 */
public class Z05_IO {
	public static void main(String[] args) {
		// �ڵ����ҽ� �ݱ⿡�� ��밡���� ��ü : AutoCoseable �������̽��� ������ ��ü�� ���� 
//		try (FileInputStream fis = new FileInputStream("G:\\Works\\Edu\\Study_Java\\workspace\\day_3\\src\\day_3\\ex_files\\input_test.txt");) {
		try (FileInputStream fis = new FileInputStream("src\\day_3\\ex_files\\input_test.txt")) {
			//���ϸ� : ������, �����(����������Ʈ ����)
//			FileInputStream fis = new FileInputStream("G:\\Works\\Edu\\Study_Java\\workspace\\day_3\\src\\day_3\\ex_files\\input_test.txt"); //������
//			FileInputStream fis = new FileInputStream("input_test.txt"); //�����

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
