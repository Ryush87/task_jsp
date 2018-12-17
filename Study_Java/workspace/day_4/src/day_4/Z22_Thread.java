package day_4;

/**
 * 
 * ���μ��� : ���α׷��� ����� ��
 * ������ : ���μ������� �����ϴ� �۾�
 * ��Ƽ ������ : ���μ������� ���� �۾��� (�ú����Ͽ�) ���������� �����ϴ� �۾�
 * 1. Thread Ŭ���� ���
 * 2. Runnable �������̽� ����
 * @author Ryush
 *
 */
public class Z22_Thread {
	public static void main(String[] args) {
		MyThread mt = new MyThread(); //������ ��ü����
		mt.setPriority(10); //�켱���� ���̸�
		mt.start(); //������ ����		
		
		B b = new B(); //Runnable ������ ��ü�� ����
		Thread t = new Thread(b);
		t.setPriority(1); //�켱���� ���߱�
		t.setDaemon(true); //���� ������ ����
		t.start();
		
		for (int i = 0; i < 1000000; i++) {
			System.out.println("--");
		}
	}
}

class A {
	
}

class B extends A implements Runnable { //�ڹٴ� ���� ��Ӹ� ����ϹǷ�, �����带 ����Ϸ��� interface�� ����
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000000; i++) {
			System.out.println("//////");
		}
	} 
	
}
class MyThread extends Thread {
	@Override
	public void run() { //������ �����忡�� �����ϰ� ���� �۾� ���
		// TODO Auto-generated method stub
		//super.run();
		for (int i = 0; i < 1000000; i++) {
			System.out.println("|");
		}
	}
}