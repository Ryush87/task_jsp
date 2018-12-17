package day_2;

/**
 * 
 * 1세대언어 : 기계어, 2세대언어 : 어셈블리어, 3세대언어 : 절차지향언어/객체지향언어
 * 절차지향언어 : C
 * 객체지향언어 : C++, Python, java
 * 			   : 기존의 절차지향언어에  클래스의 개념을 추가한 언어
 * class : 새로운 타입의 정의, 사용자정의 타입
 * 		 : 구성요소 - 변수, 메서드
 * @author kosta
 *
 */
public class Z10_Class {
	public static void main(String[] args) {
		int a;
		a = 3;
		int b = 4;
		
		Tank t1; //참조변수의 선언
		t1 = new Tank(); // 클래스의 객체생성 (인스턴스화)
		Tank t2 = new Tank();
		
		t1.hp = 100; // . 멤버접근연산자
		t1.px = 20;
		t1.py = 30;
		t1.printTank();
		
		t2.hp = 200;
		t2.px = 120;
		t2.py = 30;
		t2.printTank();
		
	} // end of main
} // end of class

//변수명 : 첫글자 소문자
//메서드명 : 첫글자 소문자
//클래스명 : 첫글자 대문자
/*
class 클래스명 {
	구성요소 : 변수, 메서드
}
*/

class Tank { // 클래스 정의
	/** 체력 */
	int hp;
	/** 좌표 */
	int px;
	int py;
	/**변수의 내용을 출력하는 메서드 */
	void printTank() { 
		System.out.println("위치 x : " + px + ", y : " + py + ", 체력 : " + hp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}