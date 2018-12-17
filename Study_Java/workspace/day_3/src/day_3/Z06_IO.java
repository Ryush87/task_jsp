package day_3;

import java.io.FileInputStream;
import java.util.Arrays;

/**
 * 
 * 바이트기반 입력스트림 InputStream
 * @author Ryush
 *
 */
public class Z06_IO {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("src\\day_3\\ex_files\\input_test.txt")) {
//			byte[] data = new byte[4];
//			int num = fis.read(data); //읽은 바이트 수를 리턴
//			System.out.println(Arrays.toString(data));
//			String s = new String(data, 0, num);
//			System.out.println(s);
			
//			or
			
			while(true) {
				byte[] data = new byte[4];
				int num = fis.read(data); //읽은 바이트 수를 리턴
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
