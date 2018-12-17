package day_3;

/**
 * 
 * static (변수, 메서드)멤버에서는 non-static 멤버를 참조할 수 없다.
 * method 에 throws 를 사용하여 에러를 던질 수 있다.
 * main method 에는 throws를 사용해서는 안된다.
 * @author Ryush
 *
 */
public class Z03_ExceptionHandling {
	public static void b() throws ArithmeticException { // 나를 호출한 곳으로 Exception 던짐
		System.out.println("b Method start");
		/*
		try {
			int x = 3 / 0; //exception 발생
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception solved from b method");
		}
		*/		
		int x = 3 / 0; //exception 발생
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
	//main 메서드에 throws 하면 Exception 발생시 비정상 종료된다. 
	public static void main(String[] args) {
		System.out.println("main start");
		a();
		System.out.println("main end");
	} // end of main
} // end of class
