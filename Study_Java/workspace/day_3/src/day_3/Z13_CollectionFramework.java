package day_3;

import java.util.ArrayList;

/**
 * 
 * 자바 Collection Framework (jdk 1.2에서 제공됨)
 * 배열(순차적 접근시 가장 빠른 자료구조) ; 같은 타입만 저장가능, 크기를 지정해야만 함, 크기를 변경할 수 없음
 * 		(비순차적 접근시 성능이 떨어진다)(대안은 LinkedList 사용)
 * 배열을 대체하기 위한 자료구조 출현
 * List 계열 : 순서있음(index 존재함), 데이터 중복허용, ArrayList(=Vector), LinkedList, 내부적으로 배열기반
 * Set 계열 : 순서없음, 데이터 중복불가
 * Map 계열 : key = value 의 구조로 하나의 원소로 구성
 * @author Ryush
 *
 */
public class Z13_CollectionFramework {
//	void ppp(Object x) { // 모든 타입 인자
//	}
	
	public static void main(String[] args) {		
		// Object 클래스 : 모든 클래스의 최고 조상 클래스
		// 자바의 다형성 polymorphism : 여러가지 형태로 저장할 수 있는 성질, 부모의 참조변수에 자식의 객체를 저장할 수 있는 성질
		// 기본형 타입은 객체가 아니다. Object 의 자식이아니다.
		// Wrapper 클래스 : 각 기본형 타입 8가지에 대한 짝꿍 클래스
		// byte		Byte
		// short	Short
		// int		Integer
		// long		Long
		// float	Float
		// double	Double
		// char 	Character
		// boolean	Boolean
		
		 ArrayList al = new ArrayList(); //기본적으로 10개 공간이 생긴다
		 al.add("안녕");
//		 al.add(3.14); // double
		 al.add(new Double(3.14)); // Auto Boxing
		 al.add(true);
//		 al.add(100);
		 al.add(new Integer(100));// Auto Boxing
		 
		 System.out.println(al);
		 System.out.println(al.toString()); //al.toString();
		 
		 System.out.println(al.get(0));
//		 System.out.println(al.get(1));
//		 System.out.println(al.get(2));
//		 System.out.println(al.get(3));
		 
		 int x = 3;
		 Integer ii = x; // new Integer(x); // Auto Boxing
		 int y = x; // ii.intValue(); // Auto UnBoxing
		 
		 ArrayList bl1  = new ArrayList();
		 bl1.add("바나나");
		 bl1.add("수박");
		 bl1.add("메론");
		 System.out.println(bl1);
//		 Object s = bl1.get(0);
		 String s = (String) bl1.get(0); //읽어올때 Object 로 반환, 원래타입으로 캐스팅해서 해야야함.
		 System.out.println(s);
		 
		 ArrayList<String> bl2  = new ArrayList(); //제너릭스 표현 jdk 1.5에서 도입, ArrayList 에서 타입을 지정
		 //제너릭스 표현 장점
		 //1. 저장시 타입체크를 미리 해준다
		 //2. 형변환하지 않아도 된다.
		 bl2.add("대한민국");
		 bl2.add("미국");
		 bl2.add("중국");
		 bl2.add("일본");
		 System.out.println(bl2);
//		 Object s2 = bl2.get(0);
//		 String s2 = bl2.get(0);
		 System.out.println(bl2.get(0));
		 
		 
	} // end of main
} // end of class

class A  {} // 내가 만든 클래스 꼭대기 클래스에 컴파일 과정에서  extends Object 를 상속시킨다
class B extends A  {} // 자바는 단일 상속만 가능