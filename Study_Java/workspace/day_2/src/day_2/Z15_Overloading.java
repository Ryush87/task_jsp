package day_2;

/**
 * 
 * �����ε� overloading : �ϳ��� Ŭ���� ������ ������ �޼������ ����ϴ� ���
 * ���� : �޼������ ������, �Ű������� ���� or Ÿ�� or ������ �޶�� �Ѵ�. 
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
