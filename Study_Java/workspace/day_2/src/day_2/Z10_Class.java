package day_2;

/**
 * 
 * 1������ : ����, 2������ : �������, 3������ : ����������/��ü������
 * ���������� : C
 * ��ü������ : C++, Python, java
 * 			   : ������ ���������  Ŭ������ ������ �߰��� ���
 * class : ���ο� Ÿ���� ����, ��������� Ÿ��
 * 		 : ������� - ����, �޼���
 * @author kosta
 *
 */
public class Z10_Class {
	public static void main(String[] args) {
		int a;
		a = 3;
		int b = 4;
		
		Tank t1; //���������� ����
		t1 = new Tank(); // Ŭ������ ��ü���� (�ν��Ͻ�ȭ)
		Tank t2 = new Tank();
		
		t1.hp = 100; // . ������ٿ�����
		t1.px = 20;
		t1.py = 30;
		t1.printTank();
		
		t2.hp = 200;
		t2.px = 120;
		t2.py = 30;
		t2.printTank();
		
	} // end of main
} // end of class

//������ : ù���� �ҹ���
//�޼���� : ù���� �ҹ���
//Ŭ������ : ù���� �빮��
/*
class Ŭ������ {
	������� : ����, �޼���
}
*/

class Tank { // Ŭ���� ����
	/** ü�� */
	int hp;
	/** ��ǥ */
	int px;
	int py;
	/**������ ������ ����ϴ� �޼��� */
	void printTank() { 
		System.out.println("��ġ x : " + px + ", y : " + py + ", ü�� : " + hp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}