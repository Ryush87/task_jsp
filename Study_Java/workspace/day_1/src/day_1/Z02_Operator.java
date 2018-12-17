package day_1;

/**
 * ���� 3 + 4 �϶�
 * ������ Operator : +, ��ӵ� ����� �ϴ� ��ȣ or �ܾ�
 * �ǿ����� : 3, 4 �����ڿ� ���ؼ� ������ϴ� ��
 * @author ryush
 */
public class Z02_Operator {
	public static void main(String[] args) {
		//�켱���� ���� : ���׿�����, ���׿�����, ���׿�����, ���Կ�����

		//���׿����� : ��ȣ������, ����������, ������������, ĳ���ÿ�����
			//��ȣ������
			int num = 3;
			System.out.println("��ȣ������ : " + (-num)); // ��ȣ������ - +
			
			//����������
			int a = 3;
			a++; //���� 1 ����, a = a + 1;
			System.out.println("��ġ���������� : " + a);
			a = 3;
			System.out.println("��ġ���������� : " + a + " / " + (++a) + " / " + a); // ���� �� ����
			a = 3;
			System.out.println("��ġ���������� : " + a + " / " + (a++) + " / " + a); // ���� �� ����
			
			//������������
			boolean b = true;
			System.out.println("������������ : " + !b); //������������
			
			//Ÿ��ĳ���ÿ�����
			int c = (int)3.14;
			
		//���׿����� : ���, ��, ��Ʈ, ��
			/*
			 * 1. �� �ǿ����ڰ� ���� Ÿ���̾�� �Ѵ�.
			 * 2. �� �ǿ����ڰ� �ٸ� Ÿ���� ���, �����Ϸ��� ���� Ÿ������ �������ش�.
			 * 		byte, short(2), char(2) -> int -> long -> float -> double (�������� �ս��� ���� ���, �ڵ�����ȯ)
			 * 3. ���� �������� ���� Ÿ������ ����
			 * 4. int ������ ���� Ÿ���� ���׿���� int ������ �ڵ�����ȯ ���ش�.
			 */
			
		System.out.println("���׿����� : 7 + 3 = " + (7 + 3)); //����
		System.out.println("���׿����� : 7 - 3 = " + (7 - 3)); //����
		System.out.println("���׿����� : 7 * 3 = " + (7 * 3)); //����
		System.out.println("���׿����� : 7 / 3 = " + (7 / 3)); //������ ��
		System.out.println("���׿����� : 7 / 3 = " + (7 / 3.0)); //������ ��
		System.out.println("���׿����� : 7 / 3 = " + (7 / 3d)); //������ ��
		System.out.println("���׿����� : 7 / 3 = " + (7 / 3f)); //������ ��
		System.out.println("���׿����� : 7 / 3 = " + (7 / (float)3)); //������ ��
		System.out.println("���׿����� : 7 % 3 = " + (7 % 3)); //������ ������
		
		//�񱳿����� <, <=, >, >=, ==, != (�������� boolean Ÿ��)
		System.out.println("�񱳿����� : 3 < 7 = " + (3 < 7));
		System.out.println("�񱳿����� : 3 <= 7 = " + (3 <= 7));
		System.out.println("�񱳿����� : 3 > 7 = " + (3 > 7));
		System.out.println("�񱳿����� : 3 >= 7 = " + (3 >= 7));
		System.out.println("�񱳿����� : 3 == 7 = " + (3 == 7));
		System.out.println("�񱳿����� : 3 != 7 = " + (3 != 7));
		
		//��Ʈ������
		//�� ���ڸ� �������� ǥ�� -> �� ��Ʈ���� ����
		System.out.println("��Ʈ������ : 3 | 7 = " + (3 | 7)); // or : �Ѵ� 0�ϰ�� 0
		System.out.println("��Ʈ������ : 3 & 7 = " + (3 & 7)); // and  : �Ѵ� 1�ϰ�� 1
		System.out.println("��Ʈ������ : 3 ^ 7 = " + (3 ^ 7)); // ��Ÿ�� or : �ٸ���� 1
		
		System.out.println("��Ʈ������ : false | false = " + (false | false)); // false
		System.out.println("��Ʈ������ : true | false = " + (true | false)); // true
		System.out.println("��Ʈ������ : false | true = " + (false | true)); // true
		System.out.println("��Ʈ������ : true | true = " + (true | true)); // true
		
		System.out.println("��Ʈ������ : false & false = " + (false & false)); // true
		System.out.println("��Ʈ������ : true & false = " + (true & false)); // true
		System.out.println("��Ʈ������ : false & true = " + (false & true)); // true
		System.out.println("��Ʈ������ : true & true = " + (true & true)); // false
		
		System.out.println("��Ʈ������ : false ^ false = " + (false ^ false)); // 
		System.out.println("��Ʈ������ : true ^ false = " + (true ^ false)); // 
		System.out.println("��Ʈ������ : false ^ true = " + (false ^ true)); // 
		System.out.println("��Ʈ������ : true ^ true = " + (true ^ true)); // 
		
		//�������� (||, &&) : ������ ������ ���� ��� 
		System.out.println("�������� : false || false = " + (false || false)); // false
		System.out.println("�������� : true || false = " + (true || false)); // true
		System.out.println("�������� : false || true = " + (false || true)); // true
		System.out.println("�������� : true || true = " + (true || true)); // true
		
		System.out.println("�������� : false && false = " + (false && false)); // true
		System.out.println("�������� : true && false = " + (true && false)); // true
		System.out.println("�������� : false && true = " + (false && true)); // true
		System.out.println("�������� : true && true = " + (true && true)); // false
		
		//���׿����� ���ǽ� ? ���ϰ����๮ : �����ϰ����๮
		int x1 = 3 < 5 ? 100 : 0;
		System.out.println(x1);
		System.out.println(3 > 5 ? 100 : "����");
		
		//���Կ����� : ���׿����ڿ� = ��ȣ�� ����
		int c1 = 3;
		c1 += 2; // c1 = c1 + 2; ����
		c1 -= 2;
		c1 *= 2;
		c1 /= 2;
		c1 %= 2;
		c1 |= 2;
		c1 &= 2;
		c1 ^= 2;
		
		// ������ �켱���� : () > ���� > ���� > ���� > ����
		int xx = 3 + 4 < 8 * 2 ? 6 - 2 : 2 * ( 3 + 1);
		
		int t, r = 100, q; // �޸�������, ���� Ÿ���� ������ �ѹ��� ����
		t = r = q = 3;
		
		int numberOfApples = 123; // ����� ����
		int size = 10; //�����ϳ��� �ִ�� ���� �� �ִ� �������
		int result; //������ ����
		result = (numberOfApples / size) + ((numberOfApples % size) != 0 ? 1 : 0);
		System.out.println("������ ���� : " + result);
		
		int coin = 3790; // �Ž�����
		// 500, 100, 50, 10�� 4���� �������� �Ž����ַ��� ��� �Ž����ֳ�?
		int coin500 = coin / 500;
		int coin100 = (coin % 500) / 100;
		int coin50 = ((coin % 500) % 100) / 50;
		int coin10 = (((coin % 500) % 100) % 50) / 10;
		System.out.println("500�� : " + coin500);
		System.out.println("100�� : " + coin100);
		System.out.println("50�� : " + coin50);
		System.out.println("10�� : " + coin10);
		
		
	} // end of main
} // end of class
