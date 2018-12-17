package day_3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 
 * 보조스트림 : 기본적으로 확보된 주 스트림을 바이트/문자 기반의 체계를 변경, 성능향상, 데이터타입 추출등의 이유로 사용
 * 여러개를 연달아 사용 가능(보조스트림 체인)
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
//			br.close(); // 순서대로 닫아야 한다. or 제일 안쪽 블럭만 닫아도 됨.
//			isr.close();
//			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
	} // end of main
} // end of class
