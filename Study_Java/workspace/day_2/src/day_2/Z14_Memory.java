package day_2;


public class Z14_Memory {
	public static void main(String[] args) {
		Cup c1;
		c1 = new Cup();
		c1.tt();
		
	} // end of main
} // end of class

/*
 * 메모리 설명 : 프로그램이 실행될때마다 생성됨
 * call stack : 지역변수, 메서드 호출정보
 * heap : 인스턴스 변수, 객체생성
 * Method Area(class 변수) : static 변수, 클래스정보로딩
 */
class Cup {
	int a;
	int a2 = a;
	static int size;
	static int size2 = size;
	int a3 = size;
	//static int size3 = a;	//변수 선언 안됨 (인스턴스 변수(a)와 static 변수(size3) 생성 타이밍 차이 
							//size3 이 먼저 생성되지만 이 곳에 넣은 인스턴스 변수(a)가 존재하지 않음)
	
	void i1( ) {}
	static void s1() {}
	void i2() { //인스턴스 메서드
		a++;
		size++;
		i1();
		s1();
	}
	
	static void s2() {
//		a++;
		size++;
//		i1();
		s1();		
	}
	//static 멤버(변수와 메서드)는 non-static 멤버를 참조 할 수 없다.
	void tt(){
		int x;
		System.out.println("tt Method");
		uu();
	}
	void uu(){
		int y;
		System.out.println("uu Method");
	}
	static void ss(){
		int s;
		System.out.println("ss Method");
	}
}
