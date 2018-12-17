package day_3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 
 * ������Ʈ�� : �⺻������ Ȯ���� �� ��Ʈ���� ����Ʈ/���� ����� ü�踦 ����, �������, ������Ÿ�� ������� ������ ���
 * �������� ���޾� ��� ����(������Ʈ�� ü��)
 * @author KOSTA
 *
 */
public class Z12_IO {
	public static void main(String[] args) {
		String fileUrl ="src\\day_3\\ex_files\\input_test.txt";
		try (FileInputStream fis = new FileInputStream(fileUrl);
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr)) {
			while(true) {
				String s = br.readLine();
				if(s == null) {
					break;
				}
				System.out.println(s);
			}
//			br.close(); // ������� �ݾƾ� �Ѵ�. or ���� ���� ������ �ݾƵ� ��.
//			isr.close();
//			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
	} // end of main
} // end of class