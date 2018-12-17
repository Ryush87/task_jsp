package day_4;

import java.util.Random;

/**
 * ������ ����ȭ
 */
public class Z24_Thread {
	public static void main(String[] args) {
		MyRun mr = new MyRun();
		Thread t1 = new Thread(mr);
		Thread t2 = new Thread(mr);
		t1.start();
		t2.start();
	} // end of main
} // end of class
class Account {
	int balance = 1000;
	public synchronized void withdraw(int money) { // money ��ŭ�� �ݾ��� balance �ܰ��� ���
		if (balance >= money) {
			try {
				Thread.sleep(1000); // ms ����, 1�� ���
			} catch (InterruptedException e) { }
			balance -= money; // ����
		}
	}
}
class MyRun implements Runnable {
	Account acc = new Account();
	public void run() {
		Random ran = new Random();
		while(acc.balance > 0) {
			int money = ran.nextInt(3) * 100 + 100; // 100, 200, 300
			acc.withdraw(money);
			System.out.println("�ܰ� : " + acc.balance);
		}
	}
}