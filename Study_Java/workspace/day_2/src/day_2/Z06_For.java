package day_2;

/**
 * 자바의 반복문 : for, while, do~while
 * @author ryush
 */
public class Z06_For {
	public static void main(String[] args) {
		//탈출기법 : 보통 조건식과 함께 사용
		//break : 가장 가까운 switch문 or 반복문을 하나만 탈출
		//continue : 가장 가까운 반복문의 다음차ㅜ로 넘어간다
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 3) {
				break;
			}			
		}
		
		//홀수만 출력
		for (int i = 10; i < 20; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("------------------");
		
		//라벨 : 분기할 시점을 명시, 반복문 앞에 사용
		ex : for (int i = 0; i < 3; i++) {
			ex2 : for (int j = 10; j < 14; j++) {
				System.out.println(i + "--" + j);
				if (i == 0 && j == 12) {
					break ex;
				}
				
			}
		}
		
		//존재유무 : 59~67 중에서 13의 배수
		//1. flag 변수 사용 : 성능은 좋지만, 변수를 잘 관리해야 한다.
		int temp = 0;
		for (int i = 59; i < 67; i++) {
			if(i % 13 == 0) {
				temp++;
				break;
			}
		}
		if(temp > 0) {
			System.out.println("59~67 중에 13의 배수는 존재한다");			
		}else {
			System.out.println("59~67 중에 13의 배수는 존재하지 않는다");
		}
		
		//2. flag 변수 없이 : 
		for (int i = 59; i < 67; i++) {
			if(i % 17 == 0) {	
				System.out.println("59~67 중에 17의 배수는 존재한다");
				break;
			}else if(i == 66) {
				System.out.println("59~67 중에 17의 배수는 존재하지 않는다");
			}
		}
		
	} // end of main
} // end of class
 