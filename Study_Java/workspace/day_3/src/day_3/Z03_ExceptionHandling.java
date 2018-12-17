package day_3;

/**
 * 
 * static (����, �޼���)��������� non-static ����� ������ �� ����.
 * method �� throws �� ����Ͽ� ������ ���� �� �ִ�.
 * main method ���� throws�� ����ؼ��� �ȵȴ�.
 * @author Ryush
 *
 */
public class Z03_ExceptionHandling {
	public static void b() throws ArithmeticException { // ���� ȣ���� ������ Exception ����
		System.out.println("b Method start");
		/*
		try {
			int x = 3 / 0; //exception �߻�
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception solved from b method");
		}
		*/		
		int x = 3 / 0; //exception �߻�
		System.out.println("b Method end");
	}
	public static void a() {
		System.out.println("a Method start");
		try {
			b();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception solved from a method");
		}
		System.out.println("a Method end");
	}
	//main �޼��忡 throws �ϸ� Exception �߻��� ������ ����ȴ�. 
	public static void main(String[] args) {
		System.out.println("main start");
		a();
		System.out.println("main end");
	} // end of main
} // end of class