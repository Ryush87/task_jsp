package day_4;

import java.util.Scanner;

/**
 * 쓰레드 상태 제어
 */
public class Z23_Thread {
	public static void main(String[] args) {
		MyThrea2 mt = new MyThrea2();
		mt.start();
		Scanner sc = new Scanner(System.in);
		while(true) {
			int menu = sc.nextInt();
			switch (menu) {
			case 1: // 쓰레드 멈추기
				mt.stop = true; // mt.stop();
				System.out.println("쓰레드 정지, 종료");
				System.exit(0); // 프로그램 종료
				break;
			case 2: // 쓰레드 일시정지
				mt.suspend = true; // mt.suspend();
				System.out.println("쓰레드 일시정지");
				break;
			case 3: // 쓰레드 재시작
				mt.suspend = false; // mt.resume();
				System.out.println("쓰레드 리줌, 재시작");
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
