package day_3;

public class Z04_ExceptionHandling {
	public static void main(String[] args) {
		MyException me = new MyException("���� ��ź");
		try {
			throw me;
		} catch (MyException e) {
			// TODO: handle exception
			System.out.println("���� ���� �ͼ����� �߻��ؼ� ó����");
			System.out.println("�ͼ����� ���� : " + e.getCause());
//			System.out.println("���� �߻������� callStack ���� : " + e.printStackTrace());
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