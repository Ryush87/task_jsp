package day_4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * 
 * List : ��������, �ߺ����
 * Set : �ռ�����, �ߺ��Ұ�
 *   �ߺ�üũ ��� : Hash��� -> HashSet(�ߺ�üũ�� ���� ����) O[1]
 *  		: Binary Search Tree -> TreeSet O[log n]
 *  		: Linear search �����˻�(�ߺ�üũ�� ���� ����) O[n]
 *  HashSet
 * �����߰��� �ߺ�üũ�ϰ�,
 * 1. hashCode()
 * 2. equals()
 * �ߺ��� ��ü���������� ����, �ߺ��� �ȵǾ������� ����
 * @author Ryush
 *
 */
public class Z17_HashSet {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("ķ��");
		hs.add("11");
		hs.add("3.14");
		hs.add("true");
		System.out.println(hs); //hs.toString();
		System.out.println(hs.size());
		System.out.println(hs.contains("ķ��"));
		
		//��ȸ
		for (String s : hs) { // ���� for��
			System.out.print(s + ", ");
		}
		System.out.println();
		
		Iterator<String> iter = hs.iterator(); //��ȸ�� �ϱ� ���� �ܹ��� ���ͷ����� ��ü�� ����(1ȸ��)
		while (iter.hasNext()) {
			System.out.print(iter.next() + ", ");
		}
		System.out.println();
		
//		ListIterator<String> liter = hs.listIterator<String>(); // ����� ��ȸ�� ������
//		System.out.print(liter.next() + ", ");
//		System.out.print(liter.next() + ", ");
//		System.out.print(liter.next() + ", ");
//		System.out.print(liter.previous() + ", ");
		
		Boy b1 = new Boy(new String("������"), 26);
		Boy b11 = new Boy(new String("������"), 26);
		Boy b2 = new Boy(new String("�Ǳ۷�"), 46);
		Boy b3 = new Boy(new String("����"), 56);
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
	public Boy( ) { //���ڰ��� ���� �޼��� �⺻������
		
	}
	public Boy(String name, int age) { //���ڰ��� �ִ� �޼���, ������
		this.name = name;
		this.age = age;
	}
	
	//��ü�� ���ڿ��� �̻ڰ� ǥ�����ִ� �ʵ�
	@Override  //jdk 1.5������ �߰��� ������̼�
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + name + "], [" + age + "]"; 		
	}
	@Override
	public int hashCode() { //�� ��ü�� ������ hashcode ���� �����ؼ� ����
		// TODO Auto-generated method stub
		//return super.hashCode();
		//return (name+age).hashCode();
		return name.hashCode() + new Integer(age).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		//this, obj �ΰ�ü�� �ν��Ͻ� ������ ��� ������ true, �ϳ��� �ٸ��� false;
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