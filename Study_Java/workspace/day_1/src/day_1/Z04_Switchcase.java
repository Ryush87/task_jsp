package day_1;

/**
 * 자바의 흐름제어 : 삼항연산자, if~else, switch~case
 * @author ryush
 *
 */
public class Z04_Switchcase {
	public static void main(String[] args) {
		/*
		switch (조건값) { //조건값은 int, String문자열 만 사용 가능
		case 값1:
			조건값과 값1이 같은 경우 실행할 문장
			break; // switch 문을 빠져나간다
		case 값2:
			조건값과 값2이 같은 경우 실행할 문장
			break;
		default:
			break;
		} // {} 생략할 수 없다.
		*/
		
		int num = 3;
		
		switch (num) {
		case 1:
			System.out.println("일");
			break;
		case 2:
			System.out.println("이");
			break;
		case 3:
			System.out.println("삼");
			break;
		default:
			System.out.println("해당없음");
			break;
		}
		
		//영어사전
		String word = "책";
		switch (word) {// jdk 7 버전 이우에 문자열도 사용할 수 있게 되었음. 
		case "책":
			System.out.println("book");
			break;
		case "사과":
			System.out.println("apple");
			break;
		case "바나나":
			System.out.println("banana");
			break;
		default:
			System.out.println("내 사전에는 그런 말 없다.");
			break;
		}
		
		//달력
		int month = 3;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month+"월의 마지막 날짜는 31일 입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month+"월의 마지막 날짜는 30일 입니다.");
			break;
		case 2:
			System.out.println(month+"월의 마지막 날짜는 28일 입니다.");
			break;
		default:
			System.out.println(month+"월의 마지막 날짜는 잘 모르겠습니다.");
			break;
		}
		
		/*
		 * 삼항연산자 : 한번만 비교하면 되는 간단한 경우에 주로 사용
		 * if~else : 그 외 조건들에 사용
		 * switch : 빠르다, 조건값이 int, string 형만 사용 가능하고, 값이 같은 경우만 사용(범위에 대한 표현이 안됨)
		 */

	} // end of main
} // end of class
