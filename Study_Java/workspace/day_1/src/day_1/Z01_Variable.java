package day_1;

/**
 * 
 * ���� Variable : �����͸� �����ϴ� ��� ����
 * @author ryush
 *
 */
public class Z01_Variable {
	public static void main(String[] args) {
		//������ �⺻��(8����), ������(�⺻���� �ƴϸ�)�� �ִ�.
		/*
		 * ������ : byte(1), short(2), [int(4)], long(8)
		 * �Ǽ��� : float(4), [double(8)]
		 * ������ : char(2)
		 * ���� : boolean(1)
		 */
		
		//������
		int a; //���� ����
		a = 8; //������ �ʱ�ȭ
		int b = 8; //������ ����� �ʱ�ȭ(���ÿ�)
		byte c = 7;
		short d = 9;
		int f = 10;
		long g = 100L; //���ͷ� ���̻簡 �ʿ� L or l
		
		//�Ǽ���
		float h = 3.14f; //���ͷ� ���̻簡 �ʿ� F or f
		double i = 3.14d; //���ͷ� ���̻簡 �ʿ� D or d or ��������
		
		//������
		char j = 'x'; //�ݵ�� ���� �ϳ��� ����, '' ��������ǥ���
		char k = '\u0054'; //java�� �����ڵ� ���
		
		//����
		boolean m = true; //���� �� true / ���� false
		
		/*�ĺ���(����)�� ��� ��Ģ
		 * 1. ���� ���������� ����� �� ����.
		 * 2. ���ڷ� ������ �� ����.
		 * 3. Ư������ _ �����, $ �޷� �ΰ����� �ȴ�.
		 * 4. ��ҹ��ڰ� ���еȴ�.
		 * 5. ���� ������ ����.
		 */
		
		/*�������
		 * �������� ù���� �ҹ���
		 * �޼������ ù���� �ҹ���
		 * Ŭ�������� ù���� �빮��
		 */
		
		//��� : ���� ������ �� ����. (flnal ���ξ�)
		//����� �빮�ڷ� �Ѵ�( _ ����� ���)
		final float Pi = 3.14f;
		int x = 3;
		int y = 4;
		//x = 100;
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		// swap : ���� ��ȯ
		int tempx = x;
		x = y;
		y = tempx;
		System.out.println("swap x : " + x);
		System.out.println("swap y : " + y);
		
		//����ǥ��
		int w = 9; //10����
		w = 0b11; // 2����, 0b or 0B ���� ���� (0~1 ǥ��)
		w = 011; //8����, 0 ���� ���� (0~7 ǥ��)
		w = 0x11; //16����, 0x or 0X ���� ���� (0~9, a~f ǥ��)		
		
		//�Ǽ�ǥ��
		double t = 3;
		t = 3d;
		t = 3.0;
		t = 3.;
		t = .5; //0 �� �����Ҽ� �ִ�
		
		//���ڿ�ǥ��
		String s = "�ȳ��ϼ���";
		
		//���ڿ�����
		s = "abc" + "xyz"; // ���ڿ��� ��������
		s = "abc" + 8; // ���ڿ� + ���ڿ��� ���ڿ��� ��������		 
		//s = 3 + 7; // ���ڿ��� ���� ��� ���� �߻�
		s = 3 + 7 + "abc"; //���ڿ� ������ ���ڿ��� ����ó�� ��
		s = 3 + 4 + "abc" + 3 + 4; //7abc34
		System.out.println(s);
		
		//����ȯ
		int ii =3;
		double dd = ii; //(double)ii; �����Ϸ��� �ڵ�����ȯ(������) ���ش�
		
		dd = 3.14;
		//ii = dd; //����, �������� �ս��� �߻��� �� �ִ� ���(double�� int ���� ũ�⶧����)
		ii = (int)dd; // 3 ���, int�� ����ȯ�����ν� .14 ����
		System.out.println(ii);
		
		char cc = 'a';
		System.out.println((int)cc); // ���� a�� �����ڵ� ���
		
		char cc2 = 98;
		System.out.println((char)cc2); // �����ڵ� 98�� �ش��ϴ� ���� ���
		
	} // end of main
} // end of class
