package day_1;

/**
 * 자바의 흐름제어 : 삼항연산자, if~else, switch~case
 * @author ryush
 *
 */
public class Z03_Ifelse {
	public static void main(String[] args) {
		/*if문  //{} 실행할 문장이 한개일 경우 생각할수 있다.
		if(조건식 ) {
			조건식이 true 이면 실행할 문장
		}
		else {
			조건식이 false 일때 실행할 문자
		}
		*/
		int num = -3;
		if (num > 0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//짝수, 홀수 구분
		if (num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		//양수, 0, 음수
		if (num < 0) {
			System.out.println("음수");
		}else if (num == 0) {
			System.out.println("0");
		}else if (num > 0) {
			System.out.println("양수");
		}
		
		//else if 일 경우 만족하는 단계에서 if문을 나온다(나열순위가 우선순위)
		if (num < 5) { 
			System.out.println("5보다 작다");
		}else if (num < 4) {
			System.out.println("4보다 작다");
		}else if (num < 3) {
			System.out.println("3보다 작다");
		}
		
		num = 17;
		if ((num - 10) > 0) {
			System.out.println("두자리 수이다");
		}else if ((num - 10) <= 0) {
			System.out.println("한자리 수이다");
		}
		
		//최대값을 출력하기
		int a = 3;
		int b = 5;
		int c = 4;
		/*
		if(a > b) {
			if(a > c) {
				System.out.println(a);
			}else {
				System.out.println(c);
			}
		}else {
			if(b > c) {
				System.out.println(b);
			}else {
				System.out.println(c);
			}			
		}
		*/
		//만약 변수가 추가되면??
		int d = -7;
		/*
		if(a >= b && a >= c && a >= d) {
			System.out.println(a);
		}else if(b >= a && b >= c && b >= d) {
			System.out.println(b);
		}else if(c >= a && c >= b && c >= d) {
			System.out.println(c);
		}else {
			System.out.println(d);
		}
		*/
		int max= a; //최대값 보관용, 초기값이 중요
		max = Integer.MIN_VALUE; //int형에서 제일 작은 값
		if(max < a) {
			max = a;
		}
		if(max < b ) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		if(max < d ) {
			max = d;
		}
		System.out.println("최대값 : " + max);	
		
		
	}// end of main
} //end of class
