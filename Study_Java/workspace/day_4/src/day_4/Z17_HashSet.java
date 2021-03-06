package day_4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * 
 * List : 순서존재, 중복허용
 * Set : 손서없이, 중복불가
 *   중복체크 방법 : Hash기법 -> HashSet(중복체크가 가장 빠름) O[1]
 *  		: Binary Search Tree -> TreeSet O[log n]
 *  		: Linear search 순차검색(중복체크가 가장 느림) O[n]
 *  HashSet
 * 원소추가시 중복체크하고,
 * 1. hashCode()
 * 2. equals()
 * 중복된 객체면저장하지 않음, 중복이 안되었을때만 저장
 * @author Ryush
 *
 */
public class Z17_HashSet {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("캠핑");
		hs.add("11");
		hs.add("3.14");
		hs.add("true");
		System.out.println(hs); //hs.toString();
		System.out.println(hs.size());
		System.out.println(hs.contains("캠핑"));
		
		//순회
		for (String s : hs) { // 향상된 for문
			System.out.print(s + ", ");
		}
		System.out.println();
		
		Iterator<String> iter = hs.iterator(); //순회를 하기 위한 단방향 이터레이터 객체를 얻어옴(1회용)
		while (iter.hasNext()) {
			System.out.print(iter.next() + ", ");
		}
		System.out.println();
		
//		ListIterator<String> liter = hs.listIterator<String>(); // 양방향 순회가 가능함
//		System.out.print(liter.next() + ", ");
//		System.out.print(liter.next() + ", ");
//		System.out.print(liter.next() + ", ");
//		System.out.print(liter.previous() + ", ");
		
		Boy b1 = new Boy(new String("곰돌이"), 26);
		Boy b11 = new Boy(new String("곰돌이"), 26);
		Boy b2 = new Boy(new String("피글렛"), 46);
		Boy b3 = new Boy(new String("말벌"), 56);
		HashSet<Boy> hsBoy = new HashSet<Boy>();
		hsBoy.add(b1);
		hsBoy.add(b11);
		hsBoy.add(b2);
		hsBoy.add(b3);
		System.out.println(hsBoy);
		System.out.println(hsBoy.size());
		System.out.println(b1.hashCode());
		System.out.println(b11.hashCode());
		System.out.println(b1.equals(b2));
				
	}
}

class Boy {
	String name = "";
	int age;	
	public Boy( ) { //인자값이 없는 메서드 기본생성자
		
	}
	public Boy(String name, int age) { //인자값이 있는 메서드, 생성자
		this.name = name;
		this.age = age;
	}
	
	//객체를 문자열로 이쁘게 표현해주는 필드
	@Override  //jdk 1.5버전에 추가된 어노테이션
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + name + "], [" + age + "]"; 		
	}
	@Override
	public int hashCode() { //각 객체의 고유한 hashcode 값을 생성해서 리턴
		// TODO Auto-generated method stub
		//return super.hashCode();
		//return (name+age).hashCode();
		return name.hashCode() + new Integer(age).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		//this, obj 두객체의 인스턴스 변수가 모두 같으면 true, 하나라도 다르면 false;
		if (obj instanceof Boy) {
			Boy b = (Boy) obj;
			if (this.name.equals(b.name) && this.age == b.age) {
				return true;
			}
		}
		Boy b = (Boy)obj;
		return false;
	}
}
