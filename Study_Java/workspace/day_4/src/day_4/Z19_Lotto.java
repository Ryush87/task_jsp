package day_4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

/**
 * 
 * ������ �ذ�� 
 * �����ľ�
 * 1. �ڷᱸ���� ����
 * 2. �ڷᱸ���� �´� �˰��� ����
 * @author Ryush
 *
 */
public class Z19_Lotto {
	public static void main(String[] args) {
		// Lotto ��ȣ 1 ~ 45 �� 6���� ������ ���
		// �ڷᱸ�� ���� : �迭, list, set
		int sn = 1;
		int en = 10;
		int selectNum = 6;
		Random ran = new Random();
		
		System.out.println("====Array====");
		//ran.nextInt(10); // 0 <= int ���� < 10
		int[] arrayNum = new int[selectNum];
		for (int i = 0; i < arrayNum.length; i++) {
			int r = ran.nextInt(en) + 1;
			for (int j = 0; j < arrayNum.length; j++) {
				if(arrayNum[j] == r) {
					i--;
					break;
				}
			}
			arrayNum[i] = r;
		}
		System.out.println(Arrays.toString(arrayNum));
		Arrays.sort(arrayNum);
		System.out.println(Arrays.toString(arrayNum));
		
		System.out.println("====list====");
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < selectNum; i++) {
			int r = ran.nextInt(en) + 1;
			if (!al.contains(r)) {
				al.add(r);
			}
		}
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println("====Set====");
		TreeSet<Integer> ts = new TreeSet<Integer>();
		while (ts.size() < selectNum) {
			int r = ran.nextInt(en) + 1;
			ts.add(r);
		}
		System.out.println(ts);
	}
}
