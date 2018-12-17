package day_2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 
 * 변수 : 데이터를 저장하는 기억공간, 기본형 / 참조형
 * 배열 Array : 같은 타입 변수들의 묶음
 * @author kosta
 *
 */
public class Z08_Array {
	public static void main(String[] args) {
		int a; //변수의 선언
		a = 3; // 변수의 초기화
		int b = 3; //변수의 선언과 초기화를 한번에
		
		int[] arr; //배열변수의 선언(참조형 변수)
		arr = new int[3]; //배열변수의 객체생성
		//new 로 메모리를 생성시 각 타입의 기본갑으로 초기화된다.
		//정수형은 0, 실수형은 0.0, 문자형 0,  논리형은 false, 참조형 null
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(arr[0]);
		//System.out.println(arr[3]); //ArrayIndexOutOfBoundsException
		
		int[] brr = new int[3]; //배열변수의 선언, 객체생성
		brr[0] = 10;
		brr[1] = 20;
		brr[2] = 30;
		
		int[] crr = new int[] {10, 20, 30, };
		int[] drr = {10, 20, 30,}; //배열변수의 선언, 객체생성, 초기화를 한번에, 마지막 값에도 콤마 작성을 권장
		for (int j = 0; j < drr.length; j++) {
			System.out.println(drr[j]);
		}
		
		//배열의 합
		int[] x = {3, 4, 5, 6, 7,};
		int sum=0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println("배열변수 x의 합 : " + sum);
		
		//배열내 최대값
		int[] y = {4, 7, 1, 2, 9, 8, 5,};
		int max=y[0];
		for (int j = 0; j < y.length; j++) {
			if(max < y[j]) {
				max = y[j];
			}
		}
		System.out.println("배열내 최대값 : " + max);
		
		//간단히 출력
		int[] z = {7,8,5,3,3,4,5,5,4,};
		System.out.println("배열 간단히 출력 : " + Arrays.toString(z)); //배열의 원소를 간단히 출력
		
		//배열의 복사(주소만 복사)
		//ㅊ
		int[] p = {5,6,7,8};
		int[] q;
		q = p; //배열의 주소를 복사하기 때문에 원본이 하나임
		System.out.println("p 배열 : " + Arrays.toString(p));
		System.out.println("q 배열 : " + Arrays.toString(q));
		q[3] = 100;
		System.out.println("복사 후 p 배열 : " + Arrays.toString(p));
		System.out.println("복사 후 q 배열 : " + Arrays.toString(q));
		
		//배열의 복사(데이터를 복사)
		int[] p2 = {5,6,7,8};
		int[] q2 = new int[p2.length];
		for (int i = 0; i < p2.length; i++) {
			q2[i] = p2[i];
		}		
		System.out.println("p2 배열 : " + Arrays.toString(p2));
		System.out.println("q2 배열 : " + Arrays.toString(q2));
		q2[3] = 100;
		System.out.println("복사 후 p2 배열 : " + Arrays.toString(p2));
		System.out.println("복사 후 q2 배열 : " + Arrays.toString(q2));
		
		//배열의 복사(데이터를 복사)
		int[] p3 = {5,6,7,8};
		int[] q3 = new int[7];
		System.arraycopy(p3, 0, q3, 2, p3.length);
		System.out.println("p3 배열 : " + Arrays.toString(p3));
		System.out.println("q3 배열 : " + Arrays.toString(q3));
		q3[3] = 100;
		System.out.println("복사 후 p3 배열 : " + Arrays.toString(p3));
		System.out.println("복사 후 q3 배열 : " + Arrays.toString(q3));
		
		//다차원 배열
		//변수 : 데이터를 저장하는 기억공간
		//1차원배열 : 같은 타입 변수들의 묶음
		//2차원배열 : 1차원 배열의 묶음
		int[][] aa = new int[3][2];
		int[][] bb = { {1,2,}, {3,4,}, {5,6,},};
		System.out.println("bb배열의 갯수 " + bb.length);
		System.out.println("bb[0]배열의 갯수 " + bb[0].length);
		
		for (int i = 0; i < bb.length; i++) {
			System.out.print("bb배열 나열 ");
			for (int j = 0; j < bb[i].length; j++) {
				System.out.print(bb[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println("bb 배열 : " + Arrays.toString(bb));  //bb는 2차원이고, array.toString은 1차원만 나열
		System.out.println("bb 배열 : " + Arrays.toString(bb[0]));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // end of main
} // end of class
