package day_1;

/**
 * �ڹ��� �ݺ��� : for, while, do~while
 * @author ryush
 */
public class Z05_For {
	public static void main(String[] args) {
		/*
		 for (�ʱ��; ���ǽ�; ������) { // 2���� ; �����ݷ��� �ݵ�� ���� �Ѵ�.
			�ݺ��� ���๮;
		} // �ݺ��� ���๮�� 1���� ��� ��������
		// �ݺ����� : �ʱ�� > ���ǽ� > �ݺ��ҽ��๮ > ������ > �ݺ�
		 						������������������������������������������������������������
		//for �� �ȿ� �ִ� i �� ������ for�� �������� ���ȴ�.
		*/
		
		// 0 1 2 3 4 5
		for (int i = 0; i < 6; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 3 4 5 6 7
		for (int i = 3; i < 8; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 2 4 6 8 10
		for (int i = 2; i < 11; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 5 4 3 2 1
		for (int i = 5; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//1~10 ��
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1���� 10���� ���� " + sum);
		
		// 30 ~ 100 �߿� 7�� ��� ī����
		int cnt = 0;
		for (int i = 30; i <= 100; i++) {
			if((i % 7) == 0) {
				cnt++;
			}
		}
		System.out.println("30���� 100���� ������ 7�� ����� ������ " + cnt);
		
		//��������
		
		
		
	} // end of main
} // end of class
