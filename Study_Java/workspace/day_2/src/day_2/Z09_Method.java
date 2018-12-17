package day_2;

/**
 * 
 * 함수 function : 실행문들의 묶음, class와 별도로 정의
 * 메서드 method : 실행문들의 묶음, class 내부에 포함되어 정의
 * @author kosta
 *
 */
public class Z09_Method {
	/*
	매개변수(파라미터) : 개수의 제한이 없다.
	리턴값 : 무조건 1개 or 0개 만 가능
	public static 리턴타입 메서드명(매개변수) { //{} 생략불가
		실행문
		return; // 나를 호출한 곳으로 돌아가기, 하나의 메소드에서 최소로 작성을 권장
	}
	*/
	public static int plus(int a, int b) { // 메서드 정의 
		//a 와 b를 더해서 return
		int sum = a + b;
		return sum;
		
	}
	public static int sub(int a, int b) { 
		int sub = a - b;
		return sub;
	}
	public static int div(int a, int b) { 
		if(b == 0) {
			System.out.println("0으로 나눌수 없습니다.");
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
		ppp("Plus = " + plus(3, 7)); // 메서드 호출
		ppp("Sub = " + sub(3, 7)); //뺄셈
		ppp("Div = " + div(3, 7)); //정수나눗셈
		ppp("Div2 = " + div2(3, 7)); //실수나눗셈
		ppp("Max = " + max(3, 7)); //최대값
		ppp("Abs = " + abs(-3)); //절대값
	} // end of main
} // end of class
