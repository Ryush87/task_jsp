package day_2;


public class Z14_Memory {
	public static void main(String[] args) {
		Cup c1;
		c1 = new Cup();
		c1.tt();
		
	} // end of main
} // end of class

/*
 * �޸� ���� : ���α׷��� ����ɶ����� ������
 * call stack : ��������, �޼��� ȣ������
 * heap : �ν��Ͻ� ����, ��ü����
 * Method Area(class ����) : static ����, Ŭ���������ε�
 */
class Cup {
	int a;
	int a2 = a;
	static int size;
	static int size2 = size;
	int a3 = size;
	//static int size3 = a;	//���� ���� �ȵ� (�ν��Ͻ� ����(a)�� static ����(size3) ���� Ÿ�̹� ���� 
							//size3 �� ���� ���������� �� ���� ���� �ν��Ͻ� ����(a)�� �������� ����)
	
	void i1( ) {}
	static void s1() {}
	void i2() { //�ν��Ͻ� �޼���
		a++;
		size++;
		i1();
		s1();
	}
	
	static void s2() {
//		a++;
		size++;
//		i1();
		s1();		
	}
	//static ���(������ �޼���)�� non-static ����� ���� �� �� ����.
	void tt(){
		int x;
		System.out.println("tt Method");
		uu();
	}
	void uu(){
		int y;
		System.out.println("uu Method");
	}
	static void ss(){
		int s;
		System.out.println("ss Method");
	}
}
