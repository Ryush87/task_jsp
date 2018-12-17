package day_2;

/**
 * 
 * ���� scope : ����� ��ġ�� ����, �޸𸮿� ������ġ, ��������, �Ҹ����
 * @author ryush
 *
 */
public class Z12_Variable {
	public static void main(String[] args) {
		Variable v = new Variable();
		v.i =3;
		
		System.out.println(v.i);
//		System.out.println(v.ppp().l);
	} // end of main
} // end of class

class Variable {
	//�������� : Ŭ���� ���� && �޼��� �ٰ��ʿ��� ����
	int i;	// �ν��Ͻ�����, non-static ����, fields
			//�޸� �������� : �ν��Ͻ� ������
			//�޸� ������ġ : Heap ����
			//�޸� �Ҹ縮�� : ���������� �������� ���Ұ�, �������÷��Ͱ� �����ش�
			//�ʱⰪ : ��Ÿ���� �ʱⰪ���� �ʱ�ȭ ��
	static int ii;  // static ����, Ŭ��������, ���뺯��
					//�޸𸮼ļ����� : Ŭ���� ������ �ε��� ��
					//�޸� ������ġ : class Area (Method Area)
					//�޸𸮼Ҹ���� : ���α׷� ����ñ��� �����ȴ�, �Ⱦ�����.	
	void ppp() {
		//�������� : �޼��� ���ʿ��� ���� local variable
		//�޸� �������� : ���� �����
		//�޸� ������ġ : call stack ����
		//�޸� �Ҹ���� : ������ ���Ե� ���� ���� �� ��, ��� ����
		//�ʱⰪ�� �� ����ִ�.
		int l = 0;
		System.out.println(l); // �ʱ�ȭ �Ŀ� ���� �����ϴ�
		
	}
}