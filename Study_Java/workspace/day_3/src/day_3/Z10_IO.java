package day_3;

import java.util.Scanner;

/**
 * 
 * Scanner Ŭ���� Ȱ��
 * @author Ryush
 *
 */
public class Z10_IO {
	public static void main(String[] args) {
		//Scanner Ŭ���� : Ű����κ��� ����� �Է��� ���� �޾ƿ��� ���� ���� Ȱ��
		Scanner sc = new Scanner(System.in);
//		sc.nextLine(); // �����Է±����� ������ �޾ƿ�, ������ ���ʹ� ���� �� ���ڿ��� ����
		
		//���� ���ΰ� ���� �ٸ���.
//		sc.next(); // String �� �޾ƿ�, �պκ��� whileSpace(����, ��, �ٹٲ�) �� ����, �޺κ��� ���� ����
//		sc.nextInt(); // String �� �޾ƿ�
//		sc.nextDouble(); // String �� �޾ƿ�
//		sc.nextBoolean(); //String �� �޾ƿ�
		
		//
		System.out.println("���̸� �Է��ϼ���");
		int age = sc.nextInt();
		System.out.println("����� ���̴� " + age + " �Դϴ�.");
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.next();
		System.out.println("����� �̸��� " + name + " �Դϴ�.");
	} // end of main
} // end of class