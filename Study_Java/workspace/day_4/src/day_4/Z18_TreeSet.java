package day_4;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 
 * List : ��������, �ߺ����
 * Set : �ռ�����, �ߺ��Ұ�
 *   �ߺ�üũ ��� : Hash��� -> HashSet(�ߺ�üũ�� ���� ����) O[1]
 *  		: Binary Search Tree -> TreeSet O[log n]
 *  		: Linear search �����˻�(�ߺ�üũ�� ���� ����) O[n]
 * TreeSet 
 * �����߰��� �ߺ�üũ�ϰ�,
 * 1. hashCode()
 * 2. equals()
 * �ߺ��� ��ü���������� ����, �ߺ��� �ȵǾ������� ����
 * @author Ryush
 *
 */
public class Z18_TreeSet {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("ȣ����");
		ts.add("�⸰");
		ts.add("�ڳ���");
		ts.add("ȣ����"); //�ߺ��� ���� ������ �ȵȴ�.
		ts.add("�Ǿ�");
		ts.add("�ϱݰ�");
		
		System.out.println(ts); //hs.toString();
		System.out.println(ts.size());
		System.out.println(ts.contains("ķ��"));
		
		//��ȸ ����� HashSet�� ����
		//TreeSet �� �ִ� ������ ����, ����� ��ġ ��ü�� ���� �� ��
		//����, �������Ľ� TreeSet�� ���� �����ϴ�(���� ������)
		for (String s : ts) { // ���� for��
			System.out.print(s + ", ");
		}
		System.out.println();
		
		Iterator<String> iter = ts.iterator(); //��ȸ�� �ϱ� ���� �ܹ��� ���ͷ����� ��ü�� ����(1ȸ��)
		while (iter.hasNext()) {
			System.out.print(iter.next() + ", ");
		}
		System.out.println();
		
		System.out.println(ts.subSet("�⸰", "�Ǿ�"));
		System.out.println(ts.subSet("�⸰", true, "�Ǿ�", true)); //���Կ���
		
		TreeSet<Girl> tsGirl = new TreeSet<Girl>(new Comparator<Girl>() {

			@Override
			public int compare(Girl o1, Girl o2) {
				// TODO Auto-generated method stub
				//return 0;
				return o2.age - o1.age; //��������
			}
		});
		Girl g1 = new Girl("������", 22);
		Girl g2 = new Girl("������", 22);
		Girl g3 = new Girl("�ϴ�", 25);
		Girl g4 = new Girl("��â", 21);
		Girl g5 = new Girl("�ŵ�", 222);
		Girl g6 = new Girl("�ٺ�", 2442);
		tsGirl.add(g1);
		tsGirl.add(g2);
		tsGirl.add(g3);
		tsGirl.add(g4);
		tsGirl.add(g5);
		tsGirl.add(g6);
		System.out.println(tsGirl);
		System.out.println(tsGirl.size());
		System.out.println(g1.hashCode());
		System.out.println(g2.hashCode());
		System.out.println(g1.equals(g2));
	}
}

class Girl implements Comparable<Girl> { //��ü�� ���Ҽ� �ֵ���, �� �޼��� �ۼ�, ���κ񱳱���
	String name = "";
	int age;
	public Girl() { 
		// TODO Auto-generated constructor stub
	}
	public Girl(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Girl o) { // 0 : ����, ����: ū, ��� : ����
		// TODO Auto-generated method stub
//		return 0;
		return this.age - o.age;
	}
	@Override  //jdk 1.5������ �߰��� ������̼�
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + name + "], [" + age + "]"; 		
	}
}