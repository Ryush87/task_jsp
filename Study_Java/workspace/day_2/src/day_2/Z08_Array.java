package day_2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 
 * ���� : �����͸� �����ϴ� ������, �⺻�� / ������
 * �迭 Array : ���� Ÿ�� �������� ����
 * @author kosta
 *
 */
public class Z08_Array {
	public static void main(String[] args) {
		int a; //������ ����
		a = 3; // ������ �ʱ�ȭ
		int b = 3; //������ ����� �ʱ�ȭ�� �ѹ���
		
		int[] arr; //�迭������ ����(������ ����)
		arr = new int[3]; //�迭������ ��ü����
		//new �� �޸𸮸� ������ �� Ÿ���� �⺻������ �ʱ�ȭ�ȴ�.
		//�������� 0, �Ǽ����� 0.0, ������ 0,  ������ false, ������ null
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(arr[0]);
		//System.out.println(arr[3]); //ArrayIndexOutOfBoundsException
		
		int[] brr = new int[3]; //�迭������ ����, ��ü����
		brr[0] = 10;
		brr[1] = 20;
		brr[2] = 30;
		
		int[] crr = new int[] {10, 20, 30, };
		int[] drr = {10, 20, 30,}; //�迭������ ����, ��ü����, �ʱ�ȭ�� �ѹ���, ������ ������ �޸� �ۼ��� ����
		for (int j = 0; j < drr.length; j++) {
			System.out.println(drr[j]);
		}
		
		//�迭�� ��
		int[] x = {3, 4, 5, 6, 7,};
		int sum=0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println("�迭���� x�� �� : " + sum);
		
		//�迭�� �ִ밪
		int[] y = {4, 7, 1, 2, 9, 8, 5,};
		int max=y[0];
		for (int j = 0; j < y.length; j++) {
			if(max < y[j]) {
				max = y[j];
			}
		}
		System.out.println("�迭�� �ִ밪 : " + max);
		
		//������ ���
		int[] z = {7,8,5,3,3,4,5,5,4,};
		System.out.println("�迭 ������ ��� : " + Arrays.toString(z)); //�迭�� ���Ҹ� ������ ���
		
		//�迭�� ����(�ּҸ� ����)
		//��
		int[] p = {5,6,7,8};
		int[] q;
		q = p; //�迭�� �ּҸ� �����ϱ� ������ ������ �ϳ���
		System.out.println("p �迭 : " + Arrays.toString(p));
		System.out.println("q �迭 : " + Arrays.toString(q));
		q[3] = 100;
		System.out.println("���� �� p �迭 : " + Arrays.toString(p));
		System.out.println("���� �� q �迭 : " + Arrays.toString(q));
		
		//�迭�� ����(�����͸� ����)
		int[] p2 = {5,6,7,8};
		int[] q2 = new int[p2.length];
		for (int i = 0; i < p2.length; i++) {
			q2[i] = p2[i];
		}		
		System.out.println("p2 �迭 : " + Arrays.toString(p2));
		System.out.println("q2 �迭 : " + Arrays.toString(q2));
		q2[3] = 100;
		System.out.println("���� �� p2 �迭 : " + Arrays.toString(p2));
		System.out.println("���� �� q2 �迭 : " + Arrays.toString(q2));
		
		//�迭�� ����(�����͸� ����)
		int[] p3 = {5,6,7,8};
		int[] q3 = new int[7];
		System.arraycopy(p3, 0, q3, 2, p3.length);
		System.out.println("p3 �迭 : " + Arrays.toString(p3));
		System.out.println("q3 �迭 : " + Arrays.toString(q3));
		q3[3] = 100;
		System.out.println("���� �� p3 �迭 : " + Arrays.toString(p3));
		System.out.println("���� �� q3 �迭 : " + Arrays.toString(q3));
		
		//������ �迭
		//���� : �����͸� �����ϴ� ������
		//1�����迭 : ���� Ÿ�� �������� ����
		//2�����迭 : 1���� �迭�� ����
		int[][] aa = new int[3][2];
		int[][] bb = { {1,2,}, {3,4,}, {5,6,},};
		System.out.println("bb�迭�� ���� " + bb.length);
		System.out.println("bb[0]�迭�� ���� " + bb[0].length);
		
		for (int i = 0; i < bb.length; i++) {
			System.out.print("bb�迭 ���� ");
			for (int j = 0; j < bb[i].length; j++) {
				System.out.print(bb[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println("bb �迭 : " + Arrays.toString(bb));  //bb�� 2�����̰�, array.toString�� 1������ ����
		System.out.println("bb �迭 : " + Arrays.toString(bb[0]));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // end of main
} // end of class
