package day_1;

/**
 * �ڹ��� �帧���� : ���׿�����, if~else, switch~case
 * @author ryush
 *
 */
public class Z04_Switchcase {
	public static void main(String[] args) {
		/*
		switch (���ǰ�) { //���ǰ��� int, String���ڿ� �� ��� ����
		case ��1:
			���ǰ��� ��1�� ���� ��� ������ ����
			break; // switch ���� ����������
		case ��2:
			���ǰ��� ��2�� ���� ��� ������ ����
			break;
		default:
			break;
		} // {} ������ �� ����.
		*/
		
		int num = 3;
		
		switch (num) {
		case 1:
			System.out.println("��");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("��");
			break;
		default:
			System.out.println("�ش����");
			break;
		}
		
		//�������
		String word = "å";
		switch (word) {// jdk 7 ���� �̿쿡 ���ڿ��� ����� �� �ְ� �Ǿ���. 
		case "å":
			System.out.println("book");
			break;
		case "���":
			System.out.println("apple");
			break;
		case "�ٳ���":
			System.out.println("banana");
			break;
		default:
			System.out.println("�� �������� �׷� �� ����.");
			break;
		}
		
		//�޷�
		int month = 3;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month+"���� ������ ��¥�� 31�� �Դϴ�.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month+"���� ������ ��¥�� 30�� �Դϴ�.");
			break;
		case 2:
			System.out.println(month+"���� ������ ��¥�� 28�� �Դϴ�.");
			break;
		default:
			System.out.println(month+"���� ������ ��¥�� �� �𸣰ڽ��ϴ�.");
			break;
		}
		
		/*
		 * ���׿����� : �ѹ��� ���ϸ� �Ǵ� ������ ��쿡 �ַ� ���
		 * if~else : �� �� ���ǵ鿡 ���
		 * switch : ������, ���ǰ��� int, string ���� ��� �����ϰ�, ���� ���� ��츸 ���(������ ���� ǥ���� �ȵ�)
		 */

	} // end of main
} // end of class
