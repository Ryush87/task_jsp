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
		t1.name ="�Ｚ�ĺ�";
		t1.channel = 11;
		Tv t2 = new Tv("LGĿ��", 7);
		//t2.name ="LGĿ��";
		//t2.channel = 7;
	} //end of main
} //end of class

//��� Ŭ������ �ݵ�� �ϳ� �̻��� �����ڰ� �����ؾ� �Ѵ�.
//�����ڸ� �ۼ����� ������, �����Ϸ��� �⺻ �����ڸ� �߰����ش�.
//�����ڸ� �ۼ��ϸ�, ���̻� �����Ϸ��� �⺻ �����ڸ� �߰������� �ʴ´�.
//�����ڸ� �ۼ���, �⺻�����ڸ� �߰����ִ� ���� �ʿ��ϴ�.
class Tv {
	String name = "";
	int channel;
	//������ constructor : Ŭ������� ����, ��ü�����ø��� �ѹ��� ȣ���.
	//�����ڴ� �ʱ�ȭ�۾��� �����̴�.
	//return �� ����.(�׷��� void�� ������� �ʴ´�)
	Tv() { //�⺻������
		
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