package day_3;

/**
 * 예외처리 Exception Hnadling
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
		catch(Exception e) { // 예외 클래스들의 조상이기 때문에 catch 절의 가장 마지막에 넣어야함.
			System.out.println("Exception");
		} finally { //반드시 마지막에 꼭! 실행하는 블럭
			System.out.println("finally");
		}
		System.out.println("program end");
	} // end of main
} // end of class