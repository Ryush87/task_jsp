package day_3;

import java.io.FileInputStream;
import java.util.Arrays;

/**
 * 
 * ����Ʈ��� �Է½�Ʈ�� InputStream
 * @author Ryush
 *
 */
public class Z06_IO {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("src\\day_3\\ex_files\\input_test.txt")) {
//			byte[] data = new byte[4];
//			int num = fis.read(data); //���� ����Ʈ ���� ����
//			System.out.println(Arrays.toString(data));
//			String s = new String(data, 0, num);
//			System.out.println(s);
			
//			or
			
			while(true) {
				byte[] data = new byte[4];
				int num = fis.read(data); //���� ����Ʈ ���� ����
				if(num == -1) {
					break;
				}
				String s = new String(data, 0, num);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}