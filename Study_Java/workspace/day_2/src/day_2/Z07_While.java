package day_2;

/**
 * �ڹ��� �ݺ��� : for, while, do~while
 * @author ryush
 */
public class Z07_While {
	public static void main(String[] args) {
		/*
		while (���ǽ�) { //  boolean �̾�� ��.
			�ݺ��� ���๮; // �ݺ��� ���๮�� 1���� ���� {}��������
		}
		*/
		
		int num = 3;
		while (num < 5) {
			System.out.println(num);
			num++; //�������� ���ٸ� ���� �ݺ�
		}
		
		//do~while : ���ǽ��� ���� �ڿ� �־� ���� �ѹ��� ���๮�� ����ȴ�.
		/*
		do {
			�ݺ��� ���๮;
		} while (���ǽ�); // �������� ; �� �� �ٿ��� �Ѵ�, {} ������ �� ����.
		// ���ǽĿ��� ����ϴ� ������ do~while ���� ������ ������� ���Ѵ�.
		*/
		int x = 3;
		do {
			System.out.println(x);
			x++;
		} while (x  < 3);
		
		/*
		 * for : �ݺ����� or Ƚ���� �˰� ���� ��
		 * while : �ݺ����� or Ƚ���� �̸� �𸣴� ���
		 * do~while : �ּ� 1���� ������ �����ؾ� �ϴ� ���
		 */
		
	}
}
