package day_2;

/**
 * 
 * 오버로딩 overloading : 하나의 클래스 내에서 동일한 메서드명을 사용하는 기법
 * 조건 : 메서드명은 같지만, 매개변수가 갯수 or 타입 or 순서가 달라야 한다. 
 * @author ryush
 *
 */
public class Z15_Overloading {	
	public static void main(String[] args) {
		add(3, 7);
		add(3, 7.5);
		add(1, 2, 4);
	}
	
	public static void add(int a, int b) {
		System.out.println(a + b);
	}
	public static void add(double a, int b) {
		System.out.println(a + b);
	}
	public static void add(double a, double b) {
		System.out.println(a + b);
	}	
	public static void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}
