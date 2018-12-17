package day_3;

public class Z04_ExceptionHandling {
	public static void main(String[] args) {
		MyException me = new MyException("나의 폭탄");
		try {
			throw me;
		} catch (MyException e) {
			// TODO: handle exception
			System.out.println("내가 만든 익셉션이 발생해서 처리함");
			System.out.println("익셉션의 원인 : " + e.getCause());
//			System.out.println("예외 발생시점의 callStack 정보 : " + e.printStackTrace());
			e.printStackTrace();
		}
	} // end of main
} // end of class

class MyException extends Exception {
	public MyException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}