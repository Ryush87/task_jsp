package day_3;

import java.io.FileReader;
import java.util.Arrays;

/**
 * 
 * ���ڱ�� �Է½�Ʈ�� Reader
 * @author Ryush
 *
 */
public class Z08_IO {
	public static void main(String[] args) {
		String fileUrl ="src\\day_3\\ex_files\\input_test.txt";
		try (FileReader fr = new FileReader(fileUrl)) {
			//int data = fr.read();
			//System.out.println((char)data);
			
//			int data;
//			while ((data = fr.read()) != -1) {
//				System.out.println((char)data);
//			}
			
			char[] data = new char[4];
			int num = fr.read(data);
			System.out.println(Arrays.toString(data));
			String s = new String(data, 0, num);
			System.out.println(s);
			
			while(true) {
				char[] data2 = new char[4];
				int num2 = fr.read(data);
				if(num2 == -1) {
					break;
				}
				System.out.println("���� : " + new String(data2));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	} // end of main
} // end of class