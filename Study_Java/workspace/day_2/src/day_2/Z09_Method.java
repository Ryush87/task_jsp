package day_2;

/**
 * 
 * �Լ� function : ���๮���� ����, class�� ������ ����
 * �޼��� method : ���๮���� ����, class ���ο� ���ԵǾ� ����
 * @author kosta
 *
 */
public class Z09_Method {
	/*
	�Ű�����(�Ķ����) : ������ ������ ����.
	���ϰ� : ������ 1�� or 0�� �� ����
	public static ����Ÿ�� �޼����(�Ű�����) { //{} �����Ұ�
		���๮
		return; // ���� ȣ���� ������ ���ư���, �ϳ��� �޼ҵ忡�� �ּҷ� �ۼ��� ����
	}
	*/
	public static int plus(int a, int b) { // �޼��� ���� 
		//a �� b�� ���ؼ� return
		int sum = a + b;
		return sum;
		
	}
	public static int sub(int a, int b) { 
		int sub = a - b;
		return sub;
	}
	public static int div(int a, int b) { 
		if(b == 0) {
			System.out.println("0���� ������ �����ϴ�.");
			return 0;
		}
		int div = a / b;
		return div;
	}
	public static double div2(int a, int b) { 
		double div2 = a / (double)b;
		return div2;
	}
	public static int max(int a, int b) { 
		int max = a;
		if(max < a) {
			max = a;
		}
		if(max < b) {
			max = b;
		}
		return max;
	}
	public static int abs(int a) { 
		int abs = 0;
		if(a > 0) {
			abs = a;
		}else if(a < 0) {
			abs = -a;
		}
		return abs;
	}
	
	public static void ppp(String w) {
		System.out.println(w);
		return;
	}
	
	public static void main(String[] args) {
		ppp("Plus = " + plus(3, 7)); // �޼��� ȣ��
		ppp("Sub = " + sub(3, 7)); //����
		ppp("Div = " + div(3, 7)); //����������
		ppp("Div2 = " + div2(3, 7)); //�Ǽ�������
		ppp("Max = " + max(3, 7)); //�ִ밪
		ppp("Abs = " + abs(-3)); //���밪
	} // end of main
} // end of class
