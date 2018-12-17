package day_3;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * 바이트기반 출력스트림 OutputStream
 * @author Ryush
 *
 */
public class Z07_IO {
	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("src\\day_3\\ex_files\\output_test.txt", true)) { //추가모드
			String s = "Ryu\r\nSeunghyun\r\nHyun";
			byte[] data = s.getBytes(); // 문자열을 바이트 배열로 추출
			fos.write(data);
			//fos.write('a'); // 1바이트만 쓰기
			//fos.flush(); // 버퍼에 잔류하고 있는 데이터를 밀어내기(전송)
			//fos.close();			
		} catch (IOException e) { // close method 호출시 Exception handling 해야됨
			// TODO: handle exception
			e.printStackTrace();
		}
	} // end of main
} // end of class
