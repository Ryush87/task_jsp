package day_2;

/**
 * 
 * static 변수 : 클래스변수, 공통변수
 * static 은 변수와 메서드에만 사용 가능, 클래스에는 적용 못함
 * @author ryush
 *
 */
public class Z13_StaticVariable {
	public static void main(String[] args) {
		
		Card c1 = new Card();
		Card c2 = new Card();
		c1.kind = "다이아몬드";
		c1.number = 1;
		c1.w = 10; // 참조변수명으로도 접근은 가능하지만,
		c1.h = 20;
		c1.printCard();
		c2.kind = "하트";
		c2.number = 10;
		Card.w = 30;  //static 벼누는 클래스명으로 접근을 권장
		Card.h = 40;  
		
		c1.printCard();
		c2.printCard();
		
		/*
		MyMath.mm = new MyMath();
		mm.max(7,3); 
		*/
		// 위에처럼 MyMath 객체를 만들어 사용할 수 도 있지만, static 메서드를 선언하면 바로 사용 가능
		MyMath.max(7, 3);
	} // end of main
} // end of class

/**
 * 카드 1장을 추상화한 클래스
 */
class Card {
	String kind = "";
	int number;
	int color;
	static int w;
	static int h;
	
	void printCard() { // 인스턴스 메서드
		System.out.println("[" + kind + "," + number + "]" + " width : " + w + " height : " + h);
	}
	
	static void ss() { //static 메서드 
		w = 20;
		//number = 13; //인스턴스 변수는 사용 못하고, static 변수만 사용 가능하다	
	}
}

class MyMath {
	static int max(int a, int b) {
		return a >= b ? a : b;		
	}
	static int sum(int a, int b) {
		return a + b;		
	}
}