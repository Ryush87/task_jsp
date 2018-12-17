package day_2;

/**
 * 
 * 
 * @author ryush
 *
 */
public class Z16_Tv {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		t1.name ="삼성파브";
		t1.channel = 11;
		Tv t2 = new Tv("LG커브", 7);
		//t2.name ="LG커브";
		//t2.channel = 7;
	} //end of main
} //end of class

//모든 클래스는 반드시 하나 이상의 생성자가 존재해야 한다.
//생성자를 작성하지 않으면, 컴파일러는 기본 생성자를 추가해준다.
//생성자를 작성하면, 더이상 컴파일러는 기본 생성자를 추가해주지 않는다.
//생성자를 작성시, 기본생성자를 추가해주는 것이 필요하다.
class Tv {
	String name = "";
	int channel;
	//생성자 constructor : 클래스명과 동일, 객체생성시마다 한번씩 호출됨.
	//생성자는 초기화작업이 목적이다.
	//return 이 없다.(그래서 void도 사용하지 않는다)
	Tv() { //기본생성자
		
	} 
	Tv(String name, int channel) { 
		//name = n;
		//channel = c;
		//name = name;
		//channel = channel;
		this.name = name;
		this.channel = channel;
	}
	
	void printTv() {
		System.out.println(name + "," + channel);
	}
}