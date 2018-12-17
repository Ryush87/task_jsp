package day_2;

/**
 * 
 * Inheritance 상속 : 두 클래스 간의 관계를 부모/자식의 관계로 맺어주는 것
 * C++ 상속 		: 다중상속, 중첩된 네임으로 애매모호한 에러 발생가능(개발자가 사용 호줄 안하면 됨)
 * python 상속 	: 다중상속, 상속에 우선순위를 두고 부모를 호출함.
 * java 상속 	: 단일상속
 * @author ryush
 *
 */
public class Z17_Inheritance {
	public static void main(String[] args) {
		Point3D ppp = new Point3D();
		ppp.x = 1;
		ppp.y = 2;
		ppp.z = 3;
		Point4D pppp = new Point4D();
		pppp.t = 4;
		
	} //end of main
} //end of class

class Point {
	//2차원좌표계의 점 하나를 추상화한 클래스
	int x;
	int y;
}

//부모의 멤버(변수, 메서드)를 물려받음.
//class 자식 extends 부모
//java의 상속은 단일 상속, 여러 class를 동시에 연결하면 안됨.
class Point3D extends Point {
	//int x;
	//int y;
	int z;
}

class Point4D extends Point3D {
	int t;
}
