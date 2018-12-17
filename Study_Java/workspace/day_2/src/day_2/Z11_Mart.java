package day_2;

/**
 * 
 * @author ryush
 *
 */
public class Z11_Mart {
	public static void main(String[] args) {
		Mart mart1 = new Mart();
		mart1.goods_name = "Homeplus";
		mart1.price_pen = 1000;
		mart1.price_ball = 2000;
		mart1.printMart();
		mart1.sale();
		
		Mart mart2 = new Mart();
		mart2.goods_name = "Emart";
		mart2.price_pen = 4000;
		mart2.price_ball = 8000;
		mart2.printMart();
		mart2.sale();
		
	} // end of main
} // end of class

class Mart { // 클래스정의
	String goods_name = ""; //문자열의 초기화는 빈 문자자열로 권장
	int price_pen;
	int price_ball;
	
	/**
	 * pen, ball 가격을 10% 할인하는 메서드
	 */
	void sale() {
		price_pen = (int) (price_pen - (price_pen * 0.01));
		price_ball = (int) (price_ball - (price_ball * 0.01));
		System.out.print("할인 후 ");
		printMart();
	}
	void printMart() {
		System.out.println(goods_name + "의 가격정보");
		System.out.println("펜 : " + price_pen +"원, 공 : " + price_ball + "원 \n");
	}
}
