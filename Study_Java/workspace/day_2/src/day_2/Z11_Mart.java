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

class Mart { // Ŭ��������
	String goods_name = ""; //���ڿ��� �ʱ�ȭ�� �� �����ڿ��� ����
	int price_pen;
	int price_ball;
	
	/**
	 * pen, ball ������ 10% �����ϴ� �޼���
	 */
	void sale() {
		price_pen = (int) (price_pen - (price_pen * 0.01));
		price_ball = (int) (price_ball - (price_ball * 0.01));
		System.out.print("���� �� ");
		printMart();
	}
	void printMart() {
		System.out.println(goods_name + "�� ��������");
		System.out.println("�� : " + price_pen +"��, �� : " + price_ball + "�� \n");
	}
}
