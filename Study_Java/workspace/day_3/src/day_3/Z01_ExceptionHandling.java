package day_3;

/**
 * ����ó�� Exception Hnadling
 */
public class Z01_ExceptionHandling {
	public static void main(String[] args) {
		try{
			//int a = 3 / 0; //ArithmeticException
			int[] brr = new int[3]; // 0~2
			brr[5] = 100; //ArrayIndexOutOfBoundsException
		} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("ArithmeticException | ArrayIndexOutOfBoundsException");
		}
//		 catch(ArithmeticException e) {
//			System.out.println("ArithmeticException");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("ArrayIndexOutOfBoundsException");
//		} 
		catch(Exception e) { // ���� Ŭ�������� �����̱� ������ catch ���� ���� �������� �־����.
			System.out.println("Exception");
		} finally { //�ݵ�� �������� ��! �����ϴ� ����
			System.out.println("finally");
		}
		System.out.println("program end");
	} // end of main
} // end of class