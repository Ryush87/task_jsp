package day_1;

/**
 * 자바의 반복문 : for, while, do~while
 * @author ryush
 */
public class Z05_For {
	public static void main(String[] args) {
		/*
		 for (초기식; 조건식; 증감식) { // 2개의 ; 세미콜론이 반드시 들어가야 한다.
			반복할 실행문;
		} // 반복할 실행문이 1개일 경우 생략가능
		// 반복순서 : 초기식 > 조건식 > 반복할실행문 > 증감식 > 반복
		 						└────────────────────────────┙
		//for 문 안에 있는 i 는 변수는 for문 내에서만 사용된다.
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
		
		//1~10 합
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지 합은 " + sum);
		
		// 30 ~ 100 중에 7의 배수 카운팅
		int cnt = 0;
		for (int i = 30; i <= 100; i++) {
			if((i % 7) == 0) {
				cnt++;
			}
		}
		System.out.println("30부터 100까지 수에서 7의 배수의 갯수는 " + cnt);
		
		//존재유무
		
		
		
	} // end of main
} // end of class
