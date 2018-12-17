package day_2;

/**
 * 자바의 반복문 : for, while, do~while
 * @author ryush
 */
public class Z07_While {
	public static void main(String[] args) {
		/*
		while (조건식) { //  boolean 이어야 함.
			반복할 실행문; // 반복한 실행문이 1개일 경우는 {}생략가능
		}
		*/
		
		int num = 3;
		while (num < 5) {
			System.out.println(num);
			num++; //증감식이 없다면 무한 반복
		}
		
		//do~while : 조건식이 문자 뒤에 있어 최초 한번은 실행문이 실행된다.
		/*
		do {
			반복할 실행문;
		} while (조건식); // 마지막에 ; 을 꼭 붙여야 한다, {} 생략할 수 없다.
		// 조건식에서 사용하는 변수는 do~while 내에 변수는 사용하지 못한다.
		*/
		int x = 3;
		do {
			System.out.println(x);
			x++;
		} while (x  < 3);
		
		/*
		 * for : 반복범위 or 횟수를 알고 있을 때
		 * while : 반복범위 or 횟수를 미리 모르는 경우
		 * do~while : 최소 1번의 실행을 보장해야 하는 경우
		 */
		
	}
}
