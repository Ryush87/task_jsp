package day_3;

import java.io.FileWriter;

/**
 * 
 * ���ڱ�� ��½�Ʈ�� Writer
 * @author KOSTA
 *
 */
public class Z09_IO {
	public static void main(String[] args) {
		String fileUrl ="src\\day_3\\ex_files\\output_test_str.txt";
		try (FileWriter fw = new FileWriter(fileUrl)) {
			String str = "�ȳ��ϼ���\r\n�ڹٸ� ���ϰ� �ͳ׿�";
			fw.write(str);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	} // end of main
} // end of class