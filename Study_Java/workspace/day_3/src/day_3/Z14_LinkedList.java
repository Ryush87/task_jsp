package day_3;

import java.util.LinkedList;

/**
 * 
 * LinkedList : ��������� ����/���� ����� ����
 * �ϳ��� ���Ұ� ������ + ���� ����� �ּ�
 * ���ټ��� ������ ���� ��ŧ�� ��ũ�帮��Ʈ�� �����Ǿ� ����
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
		System.out.println(ll.contains("England")); // ������ ���Կ���
	} // end of main
} // end of class
