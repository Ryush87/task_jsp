package day_3;

import java.io.File;

/**
 * 
 * ����, ���丮
 * @author Ryush
 *
 */
public class Z11_File {
	public static void main(String[] args) {
		String fileUrl1 = "G:\\Works\\Edu\\Study_Java\\workspace\\day_3\\src\\day_3\\ex_files\\depth1";
		String fileUrl2 = "G:\\Works\\Edu\\Study_Java\\workspace\\day_3\\src\\day_3\\ex_files\\depth2";
		String fileUrl3 = "G:\\Works\\Edu\\Study_Java\\workspace\\day_3\\src\\day_3\\ex_files\\depth3";
		File fl1 = new File(fileUrl1);
		File fl2 = new File(fileUrl2);
		File fl3 = new File(fileUrl3);
		
		System.out.println("depth1 ���� ���翩�� " + fl1.exists()); // ������ ���翩��
		System.out.println("depth2 ���� ���翩�� " + fl2.exists()); // ������ ���翩��
		System.out.println("depth3 ���� ���翩�� " + fl3.exists()); // ������ ���翩��
		
		if(!fl2.exists()) {
			fl2.mkdir(); //��� �� ������ ������ ������
		}
		if(!fl3.exists()) {
			fl3.mkdir(); //��� �� ������ ������ ������
		}
	} // end of main
} // end of class