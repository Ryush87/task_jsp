package day_1;

/**
 * �ڹ��� �帧���� : ���׿�����, if~else, switch~case
 * @author ryush
 *
 */
public class Z03_Ifelse {
	public static void main(String[] args) {
		/*if��  //{} ������ ������ �Ѱ��� ��� �����Ҽ� �ִ�.
		if(���ǽ� ) {
			���ǽ��� true �̸� ������ ����
		}
		else {
			���ǽ��� false �϶� ������ ����
		}
		*/
		int num = -3;
		if (num > 0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//¦��, Ȧ�� ����
		if (num % 2 == 0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}
		
		//���, 0, ����
		if (num < 0) {
			System.out.println("����");
		}else if (num == 0) {
			System.out.println("0");
		}else if (num > 0) {
			System.out.println("���");
		}
		
		//else if �� ��� �����ϴ� �ܰ迡�� if���� ���´�(���������� �켱����)
		if (num < 5) { 
			System.out.println("5���� �۴�");
		}else if (num < 4) {
			System.out.println("4���� �۴�");
		}else if (num < 3) {
			System.out.println("3���� �۴�");
		}
		
		num = 17;
		if ((num - 10) > 0) {
			System.out.println("���ڸ� ���̴�");
		}else if ((num - 10) <= 0) {
			System.out.println("���ڸ� ���̴�");
		}
		
		//�ִ밪�� ����ϱ�
		int a = 3;
		int b = 5;
		int c = 4;
		/*
		if(a > b) {
			if(a > c) {
				System.out.println(a);
			}else {
				System.out.println(c);
			}
		}else {
			if(b > c) {
				System.out.println(b);
			}else {
				System.out.println(c);
			}			
		}
		*/
		//���� ������ �߰��Ǹ�??
		int d = -7;
		/*
		if(a >= b && a >= c && a >= d) {
			System.out.println(a);
		}else if(b >= a && b >= c && b >= d) {
			System.out.println(b);
		}else if(c >= a && c >= b && c >= d) {
			System.out.println(c);
		}else {
			System.out.println(d);
		}
		*/
		int max= a; //�ִ밪 ������, �ʱⰪ�� �߿�
		max = Integer.MIN_VALUE; //int������ ���� ���� ��
		if(max < a) {
			max = a;
		}
		if(max < b ) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		if(max < d ) {
			max = d;
		}
		System.out.println("�ִ밪 : " + max);	
		
		
	}// end of main
} //end of class
