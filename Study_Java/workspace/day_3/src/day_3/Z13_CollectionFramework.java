package day_3;

import java.util.ArrayList;

/**
 * 
 * �ڹ� Collection Framework (jdk 1.2���� ������)
 * �迭(������ ���ٽ� ���� ���� �ڷᱸ��) ; ���� Ÿ�Ը� ���尡��, ũ�⸦ �����ؾ߸� ��, ũ�⸦ ������ �� ����
 * 		(������� ���ٽ� ������ ��������)(����� LinkedList ���)
 * �迭�� ��ü�ϱ� ���� �ڷᱸ�� ����
 * List �迭 : ��������(index ������), ������ �ߺ����, ArrayList(=Vector), LinkedList, ���������� �迭���
 * Set �迭 : ��������, ������ �ߺ��Ұ�
 * Map �迭 : key = value �� ������ �ϳ��� ���ҷ� ����
 * @author Ryush
 *
 */
public class Z13_CollectionFramework {
//	void ppp(Object x) { // ��� Ÿ�� ����
//	}
	
	public static void main(String[] args) {		
		// Object Ŭ���� : ��� Ŭ������ �ְ� ���� Ŭ����
		// �ڹ��� ������ polymorphism : �������� ���·� ������ �� �ִ� ����, �θ��� ���������� �ڽ��� ��ü�� ������ �� �ִ� ����
		// �⺻�� Ÿ���� ��ü�� �ƴϴ�. Object �� �ڽ��̾ƴϴ�.
		// Wrapper Ŭ���� : �� �⺻�� Ÿ�� 8������ ���� ¦�� Ŭ����
		// byte		Byte
		// short	Short
		// int		Integer
		// long		Long
		// float	Float
		// double	Double
		// char 	Character
		// boolean	Boolean
		
		 ArrayList al = new ArrayList(); //�⺻������ 10�� ������ �����
		 al.add("�ȳ�");
//		 al.add(3.14); // double
		 al.add(new Double(3.14)); // Auto Boxing
		 al.add(true);
//		 al.add(100);
		 al.add(new Integer(100));// Auto Boxing
		 
		 System.out.println(al);
		 System.out.println(al.toString()); //al.toString();
		 
		 System.out.println(al.get(0));
//		 System.out.println(al.get(1));
//		 System.out.println(al.get(2));
//		 System.out.println(al.get(3));
		 
		 int x = 3;
		 Integer ii = x; // new Integer(x); // Auto Boxing
		 int y = x; // ii.intValue(); // Auto UnBoxing
		 
		 ArrayList bl1  = new ArrayList();
		 bl1.add("�ٳ���");
		 bl1.add("����");
		 bl1.add("�޷�");
		 System.out.println(bl1);
//		 Object s = bl1.get(0);
		 String s = (String) bl1.get(0); //�о�ö� Object �� ��ȯ, ����Ÿ������ ĳ�����ؼ� �ؾ߾���.
		 System.out.println(s);
		 
		 ArrayList<String> bl2  = new ArrayList(); //���ʸ��� ǥ�� jdk 1.5���� ����, ArrayList ���� Ÿ���� ����
		 //���ʸ��� ǥ�� ����
		 //1. ����� Ÿ��üũ�� �̸� ���ش�
		 //2. ����ȯ���� �ʾƵ� �ȴ�.
		 bl2.add("���ѹα�");
		 bl2.add("�̱�");
		 bl2.add("�߱�");
		 bl2.add("�Ϻ�");
		 System.out.println(bl2);
//		 Object s2 = bl2.get(0);
//		 String s2 = bl2.get(0);
		 System.out.println(bl2.get(0));
		 
		 
	} // end of main
} // end of class

class A  {} // ���� ���� Ŭ���� ����� Ŭ������ ������ ��������  extends Object �� ��ӽ�Ų��
class B extends A  {} // �ڹٴ� ���� ��Ӹ� ����