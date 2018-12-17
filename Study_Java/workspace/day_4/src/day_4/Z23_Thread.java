package day_4;

import java.util.Scanner;

/**
 * ������ ���� ����
 */
public class Z23_Thread {
	public static void main(String[] args) {
		MyThrea2 mt = new MyThrea2();
		mt.start();
		Scanner sc = new Scanner(System.in);
		while(true) {
			int menu = sc.nextInt();
			switch (menu) {
			case 1: // ������ ���߱�
				mt.stop = true; // mt.stop();
				System.out.println("������ ����, ����");
				System.exit(0); // ���α׷� ����
				break;
			case 2: // ������ �Ͻ�����
				mt.suspend = true; // mt.suspend();
				System.out.println("������ �Ͻ�����");
				break;
			case 3: // ������ �����
				mt.suspend = false; // mt.resume();
				System.out.println("������ ����, �����");
				break;
			}
		}
	} // end of main
} // end of class
class MyThrea2 extends Thread {
	boolean stop = false;
	boolean suspend = false;
	@Override
	public void run() {
		while(!stop) {
			if (!suspend) {
				System.out.println("|");
			}
		}
	}
}
