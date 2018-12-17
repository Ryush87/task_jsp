package day_2;

/**
 * 
 * static ���� : Ŭ��������, ���뺯��
 * static �� ������ �޼��忡�� ��� ����, Ŭ�������� ���� ����
 * @author ryush
 *
 */
public class Z13_StaticVariable {
	public static void main(String[] args) {
		
		Card c1 = new Card();
		Card c2 = new Card();
		c1.kind = "���̾Ƹ��";
		c1.number = 1;
		c1.w = 10; // �������������ε� ������ ����������,
		c1.h = 20;
		c1.printCard();
		c2.kind = "��Ʈ";
		c2.number = 10;
		Card.w = 30;  //static ������ Ŭ���������� ������ ����
		Card.h = 40;  
		
		c1.printCard();
		c2.printCard();
		
		/*
		MyMath.mm = new MyMath();
		mm.max(7,3); 
		*/
		// ����ó�� MyMath ��ü�� ����� ����� �� �� ������, static �޼��带 �����ϸ� �ٷ� ��� ����
		MyMath.max(7, 3);
	} // end of main
} // end of class

/**
 * ī�� 1���� �߻�ȭ�� Ŭ����
 */
class Card {
	String kind = "";
	int number;
	int color;
	static int w;
	static int h;
	
	void printCard() { // �ν��Ͻ� �޼���
		System.out.println("[" + kind + "," + number + "]" + " width : " + w + " height : " + h);
	}
	
	static void ss() { //static �޼��� 
		w = 20;
		//number = 13; //�ν��Ͻ� ������ ��� ���ϰ�, static ������ ��� �����ϴ�	
	}
}

class MyMath {
	static int max(int a, int b) {
		return a >= b ? a : b;		
	}
	static int sum(int a, int b) {
		return a + b;		
	}
}