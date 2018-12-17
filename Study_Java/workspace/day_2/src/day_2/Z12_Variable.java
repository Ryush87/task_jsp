package day_2;

/**
 * 
 * 변수 scope : 선언된 위치에 따라, 메모리에 생성위치, 생서이점, 소멸시점
 * @author ryush
 *
 */
public class Z12_Variable {
	public static void main(String[] args) {
		Variable v = new Variable();
		v.i =3;
		
		System.out.println(v.i);
//		System.out.println(v.ppp().l);
	} // end of main
} // end of class

class Variable {
	//전역변수 : 클래스 안쪽 && 메서드 바같쪽에서 선언
	int i;	// 인스턴스변수, non-static 변수, fields
			//메모리 생성시점 : 인스턴스 생성시
			//메모리 생성위치 : Heap 영역
			//메모리 소며리점 : 참조변수가 없어지면 사용불가, 가비지컬렉터가 지워준다
			//초기값 : 각타입의 초기값으로 초기화 됨
	static int ii;  // static 변수, 클래스변수, 공통변수
					//메모리셍성시점 : 클래스 정보가 로딩될 때
					//메모리 생성위치 : class Area (Method Area)
					//메모리소명시점 : 프로그램 종료시까지 유지된다, 안없어짐.	
	void ppp() {
		//지역변수 : 메서드 안쪽에서 선언 local variable
		//메모리 생성시점 : 선언문 실행시
		//메모리 생성위치 : call stack 영역
		//메모리 소멸시점 : 선언문이 포함된 블럭이 종료 될 때, 즉시 삭제
		//초기값이 안 들어있다.
		int l = 0;
		System.out.println(l); // 초기화 후에 참조 가능하다
		
	}
}