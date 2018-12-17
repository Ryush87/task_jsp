package day_3;

import java.util.LinkedList;

/**
 * 
 * LinkedList : 비순차적인 삽입/삭제 기능을 개선
 * 하나의 원소가 데이터 + 다음 노드의 주소
 * 접근성을 개선한 더블리 서큘러 링크드리스트로 구현되어 있음
 * @author Ryush
 *
 */
public class Z14_LinkedList {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("korea");
		ll.add("Australia");
		ll.add("England");
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.get(0));
		System.out.println(ll.indexOf("England")); //index
		System.out.println(ll.contains("England")); // 원소의 포함여부
	} // end of main
} // end of class
