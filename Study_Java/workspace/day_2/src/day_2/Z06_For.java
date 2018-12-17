package day_2;

/**
 * �ڹ��� �ݺ��� : for, while, do~while
 * @author ryush
 */
public class Z06_For {
	public static void main(String[] args) {
		//Ż���� : ���� ���ǽİ� �Բ� ���
		//break : ���� ����� switch�� or �ݺ����� �ϳ��� Ż��
		//continue : ���� ����� �ݺ����� �������̷� �Ѿ��
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 3) {
				break;
			}			
		}
		
		//Ȧ���� ���
		for (int i = 10; i < 20; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("------------------");
		
		//�� : �б��� ������ ���, �ݺ��� �տ� ���
		ex : for (int i = 0; i < 3; i++) {
			ex2 : for (int j = 10; j < 14; j++) {
				System.out.println(i + "--" + j);
				if (i == 0 && j == 12) {
					break ex;
				}
				
			}
		}
		
		//�������� : 59~67 �߿��� 13�� ���
		//1. flag ���� ��� : ������ ������, ������ �� �����ؾ� �Ѵ�.
		int temp = 0;
		for (int i = 59; i < 67; i++) {
			if(i % 13 == 0) {
				temp++;
				break;
			}
		}
		if(temp > 0) {
			System.out.println("59~67 �߿� 13�� ����� �����Ѵ�");			
		}else {
			System.out.println("59~67 �߿� 13�� ����� �������� �ʴ´�");
		}
		
		//2. flag ���� ���� : 
		for (int i = 59; i < 67; i++) {
			if(i % 17 == 0) {	
				System.out.println("59~67 �߿� 17�� ����� �����Ѵ�");
				break;
			}else if(i == 66) {
				System.out.println("59~67 �߿� 17�� ����� �������� �ʴ´�");
			}
		}
		
	} // end of main
} // end of class
 