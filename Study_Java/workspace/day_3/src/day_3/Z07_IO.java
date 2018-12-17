package day_3;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * ����Ʈ��� ��½�Ʈ�� OutputStream
 * @author Ryush
 *
 */
public class Z07_IO {
	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("src\\day_3\\ex_files\\output_test.txt", true)) { //�߰����
			String s = "Ryu\r\nSeunghyun\r\nHyun";
			byte[] data = s.getBytes(); // ���ڿ��� ����Ʈ �迭�� ����
			fos.write(data);
			//fos.write('a'); // 1����Ʈ�� ����
			//fos.flush(); // ���ۿ� �ܷ��ϰ� �ִ� �����͸� �о��(����)
			//fos.close();			
		} catch (IOException e) { // close method ȣ��� Exception handling �ؾߵ�
			// TODO: handle exception
			e.printStackTrace();
		}
	} // end of main
} // end of class
