package day_3;

import java.util.Scanner;

/**
 * 
 * Scanner 클래스 활용
 * @author Ryush
 *
 */
public class Z10_IO {
	public static void main(String[] args) {
		//Scanner 클래스 : 키보드로부터 사용자 입력을 쉽게 받아오기 위해 많이 활용
		Scanner sc = new Scanner(System.in);
//		sc.nextLine(); // 엔터입력까지의 한줄을 받아옴, 마지막 엔터는 제거 후 문자열로 리턴
		
		//위에 라인과 조금 다르다.
//		sc.next(); // String 을 받아옴, 앞부분의 whileSpace(공백, 탭, 줄바꿈) 는 제거, 뒷부분은 남아 있음
//		sc.nextInt(); // String 을 받아옴
//		sc.nextDouble(); // String 을 받아옴
//		sc.nextBoolean(); //String 을 받아옴
		
		//
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println("당신의 나이는 " + age + " 입니다.");
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.println("당신의 이름은 " + name + " 입니다.");
	} // end of main
} // end of class
