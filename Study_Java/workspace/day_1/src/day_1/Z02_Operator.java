package day_1;

/**
 * 연산 3 + 4 일때
 * 연산자 Operator : +, 약속된 기능을 하는 기호 or 단어
 * 피연산자 : 3, 4 연산자에 의해서 연산당하는 것
 * @author ryush
 */
public class Z02_Operator {
	public static void main(String[] args) {
		//우선순위 존재 : 단항연산자, 이항연산자, 삼항연산자, 대입연산자

		//단항연산자 : 부호연산자, 증감연산자, 논리부정연산자, 캐스팅연산자
			//부호연산자
			int num = 3;
			System.out.println("부호연산자 : " + (-num)); // 부호연산자 - +
			
			//증감연산자
			int a = 3;
			a++; //값을 1 증가, a = a + 1;
			System.out.println("전치증감연산자 : " + a);
			a = 3;
			System.out.println("전치증감연산자 : " + a + " / " + (++a) + " / " + a); // 증감 후 참조
			a = 3;
			System.out.println("후치증감연산자 : " + a + " / " + (a++) + " / " + a); // 참조 후 증감
			
			//논리부정연산자
			boolean b = true;
			System.out.println("논리부정연산자 : " + !b); //논리부정연산자
			
			//타입캐스팅연산자
			int c = (int)3.14;
			
		//이항연산자 : 산술, 비교, 비트, 논리
			/*
			 * 1. 두 피연산자가 같은 타입이어야 한다.
			 * 2. 두 피연산자가 다른 타입일 경우, 컴파일러가 같은 타입으로 변경해준다.
			 * 		byte, short(2), char(2) -> int -> long -> float -> double (데이터의 손실이 없는 경우, 자동현변환)
			 * 3. 이항 연산결과는 같은 타입으로 리턴
			 * 4. int 형보다 작은 타입은 이항연산시 int 형으로 자동형변환 해준다.
			 */
			
		System.out.println("이항연산자 : 7 + 3 = " + (7 + 3)); //덧셈
		System.out.println("이항연산자 : 7 - 3 = " + (7 - 3)); //뺄셈
		System.out.println("이항연산자 : 7 * 3 = " + (7 * 3)); //곱셈
		System.out.println("이항연산자 : 7 / 3 = " + (7 / 3)); //나누기 몫
		System.out.println("이항연산자 : 7 / 3 = " + (7 / 3.0)); //나누기 몫
		System.out.println("이항연산자 : 7 / 3 = " + (7 / 3d)); //나누기 몫
		System.out.println("이항연산자 : 7 / 3 = " + (7 / 3f)); //나누기 몫
		System.out.println("이항연산자 : 7 / 3 = " + (7 / (float)3)); //나누기 몫
		System.out.println("이항연산자 : 7 % 3 = " + (7 % 3)); //나누기 나머지
		
		//비교연산자 <, <=, >, >=, ==, != (연산결과는 boolean 타입)
		System.out.println("비교연산자 : 3 < 7 = " + (3 < 7));
		System.out.println("비교연산자 : 3 <= 7 = " + (3 <= 7));
		System.out.println("비교연산자 : 3 > 7 = " + (3 > 7));
		System.out.println("비교연산자 : 3 >= 7 = " + (3 >= 7));
		System.out.println("비교연산자 : 3 == 7 = " + (3 == 7));
		System.out.println("비교연산자 : 3 != 7 = " + (3 != 7));
		
		//비트연산자
		//두 숫자를 이진수로 표현 -> 각 비트끼리 연산
		System.out.println("비트연산자 : 3 | 7 = " + (3 | 7)); // or : 둘다 0일경우 0
		System.out.println("비트연산자 : 3 & 7 = " + (3 & 7)); // and  : 둘다 1일경우 1
		System.out.println("비트연산자 : 3 ^ 7 = " + (3 ^ 7)); // 배타적 or : 다를경우 1
		
		System.out.println("비트연산자 : false | false = " + (false | false)); // false
		System.out.println("비트연산자 : true | false = " + (true | false)); // true
		System.out.println("비트연산자 : false | true = " + (false | true)); // true
		System.out.println("비트연산자 : true | true = " + (true | true)); // true
		
		System.out.println("비트연산자 : false & false = " + (false & false)); // true
		System.out.println("비트연산자 : true & false = " + (true & false)); // true
		System.out.println("비트연산자 : false & true = " + (false & true)); // true
		System.out.println("비트연산자 : true & true = " + (true & true)); // false
		
		System.out.println("비트연산자 : false ^ false = " + (false ^ false)); // 
		System.out.println("비트연산자 : true ^ false = " + (true ^ false)); // 
		System.out.println("비트연산자 : false ^ true = " + (false ^ true)); // 
		System.out.println("비트연산자 : true ^ true = " + (true ^ true)); // 
		
		//논리연산자 (||, &&) : 논리값의 연산을 위해 사용 
		System.out.println("논리연산자 : false || false = " + (false || false)); // false
		System.out.println("논리연산자 : true || false = " + (true || false)); // true
		System.out.println("논리연산자 : false || true = " + (false || true)); // true
		System.out.println("논리연산자 : true || true = " + (true || true)); // true
		
		System.out.println("논리연산자 : false && false = " + (false && false)); // true
		System.out.println("논리연산자 : true && false = " + (true && false)); // true
		System.out.println("논리연산자 : false && true = " + (false && true)); // true
		System.out.println("논리연산자 : true && true = " + (true && true)); // false
		
		//삼항연산자 조건식 ? 참일경우실행문 : 거짓일경우실행문
		int x1 = 3 < 5 ? 100 : 0;
		System.out.println(x1);
		System.out.println(3 > 5 ? 100 : "거짓");
		
		//대입연산자 : 이항연산자와 = 등호의 조합
		int c1 = 3;
		c1 += 2; // c1 = c1 + 2; 같음
		c1 -= 2;
		c1 *= 2;
		c1 /= 2;
		c1 %= 2;
		c1 |= 2;
		c1 &= 2;
		c1 ^= 2;
		
		// 연산의 우선순위 : () > 단항 > 이항 > 삼항 > 대입
		int xx = 3 + 4 < 8 * 2 ? 6 - 2 : 2 * ( 3 + 1);
		
		int t, r = 100, q; // 콤마연산자, 같은 타입의 벼누를 한번에 선언
		t = r = q = 3;
		
		int numberOfApples = 123; // 사과의 갯수
		int size = 10; //접시하나당 최대로 놓을 수 있는 사과갯수
		int result; //접시의 갯수
		result = (numberOfApples / size) + ((numberOfApples % size) != 0 ? 1 : 0);
		System.out.println("접시의 갯수 : " + result);
		
		int coin = 3790; // 거스름돈
		// 500, 100, 50, 10원 4종류 동전으로 거슬러주려면 어떻게 거슬러주나?
		int coin500 = coin / 500;
		int coin100 = (coin % 500) / 100;
		int coin50 = ((coin % 500) % 100) / 50;
		int coin10 = (((coin % 500) % 100) % 50) / 10;
		System.out.println("500원 : " + coin500);
		System.out.println("100원 : " + coin100);
		System.out.println("50원 : " + coin50);
		System.out.println("10원 : " + coin10);
		
		
	} // end of main
} // end of class
