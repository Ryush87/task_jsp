package day_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 
 * Stack : LIFO ����, �ⱸ, �Ա� �ϳ�
 * Queue : FIFO ����, �ⱸ, �Ա� �ٸ���
 * @author Ryush
 *
 */
public class Z15_StackQueue {
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>(); //���ʸ��� ǥ��
		st.push("���");
		st.push("�ٳ���");
		st.push("��");
		System.out.println(st);
		System.out.println(st.pop()); //LIFO ������ ���� �������� ����� ���� ���´�.
		System.out.println(st.pop());
		if (!st.empty()) {
			System.out.println(st.pop());
		}
		System.out.println(st);
		
		//Queue �� interface �� ��ü�� ������ �� ����.
		LinkedList<String> lt = new LinkedList<String>();
		lt.offer("���屹");
		lt.offer("û����");
		lt.offer("�δ��");
		System.out.println(lt);
		System.out.println(lt.poll()); //FIFO ������ ���� �� ���� ���� ���´�.
		System.out.println(lt.poll());
		if(!lt.isEmpty()) {
			System.out.println(lt.poll());
		}
		System.out.println(lt);
		
	} // end of main
} // end of class