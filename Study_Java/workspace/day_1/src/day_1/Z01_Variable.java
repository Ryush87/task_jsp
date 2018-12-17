package day_1;

/**
 * 
 * 변수 Variable : 데이터를 저장하는 기억 공간
 * @author ryush
 *
 */
public class Z01_Variable {
	public static void main(String[] args) {
		//변수는 기본형(8가지), 참조형(기본형이 아니면)이 있다.
		/*
		 * 정수형 : byte(1), short(2), [int(4)], long(8)
		 * 실수형 : float(4), [double(8)]
		 * 문자형 : char(2)
		 * 논리형 : boolean(1)
		 */
		
		//정수형
		int a; //변수 선언
		a = 8; //변수의 초기화
		int b = 8; //변수와 선언과 초기화(동시에)
		byte c = 7;
		short d = 9;
		int f = 10;
		long g = 100L; //리터럴 접미사가 필요 L or l
		
		//실수형
		float h = 3.14f; //리터럴 접미사가 필요 F or f
		double i = 3.14d; //리터럴 접미사가 필요 D or d or 생략가능
		
		//문자형
		char j = 'x'; //반드시 글자 하나를 저장, '' 직은따옴표사용
		char k = '\u0054'; //java는 유니코드 사용
		
		//논리형
		boolean m = true; //논리형 참 true / 거짓 false
		
		/*식별자(변수)의 명명 규칙
		 * 1. 예약어를 변수명으로 사용할 수 없다.
		 * 2. 숫자로 시작할 수 없다.
		 * 3. 특수문자 _ 언더바, $ 달러 두가지만 된다.
		 * 4. 대소문자가 구분된다.
		 * 5. 길이 제한이 없다.
		 */
		
		/*권장사항
		 * 변수명은 첫글자 소문자
		 * 메서드명은 첫글자 소문자
		 * 클래스명은 첫글자 대문자
		 */
		
		//상수 : 값을 변경할 수 없다. (flnal 접두어)
		//상수는 대문자로 한다( _ 언더바 사용)
		final float Pi = 3.14f;
		int x = 3;
		int y = 4;
		//x = 100;
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		// swap : 값을 교환
		int tempx = x;
		x = y;
		y = tempx;
		System.out.println("swap x : " + x);
		System.out.println("swap y : " + y);
		
		//정수표현
		int w = 9; //10진수
		w = 0b11; // 2진수, 0b or 0B 으로 시작 (0~1 표현)
		w = 011; //8진수, 0 으로 시작 (0~7 표현)
		w = 0x11; //16진수, 0x or 0X 으로 시작 (0~9, a~f 표현)		
		
		//실수표현
		double t = 3;
		t = 3d;
		t = 3.0;
		t = 3.;
		t = .5; //0 을 생략할수 있다
		
		//문자열표현
		String s = "안녕하세요";
		
		//문자열연산
		s = "abc" + "xyz"; // 문자열의 덧셈연산
		s = "abc" + 8; // 문자열 + 비문자열을 문자열로 덧셈연산		 
		//s = 3 + 7; // 비문자열만 있을 경우 에러 발생
		s = 3 + 7 + "abc"; //문자열 이전의 비문자열은 연산처리 됨
		s = 3 + 4 + "abc" + 3 + 4; //7abc34
		System.out.println(s);
		
		//형변환
		int ii =3;
		double dd = ii; //(double)ii; 컴파일러가 자동형변환(묵시적) 해준다
		
		dd = 3.14;
		//ii = dd; //에러, 데이터의 손실이 발생할 수 있는 경우(double이 int 보다 크기때문에)
		ii = (int)dd; // 3 출력, int로 형변환함으로써 .14 삭제
		System.out.println(ii);
		
		char cc = 'a';
		System.out.println((int)cc); // 문자 a의 유니코드 출력
		
		char cc2 = 98;
		System.out.println((char)cc2); // 유니코드 98의 해당하는 문자 출력
		
	} // end of main
} // end of class
