package day_2;

/**
 * 
 * Inheritance ��� : �� Ŭ���� ���� ���踦 �θ�/�ڽ��� ����� �ξ��ִ� ��
 * C++ ��� 		: ���߻��, ��ø�� �������� �ָŸ�ȣ�� ���� �߻�����(�����ڰ� ��� ȣ�� ���ϸ� ��)
 * python ��� 	: ���߻��, ��ӿ� �켱������ �ΰ� �θ� ȣ����.
 * java ��� 	: ���ϻ��
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
	//2������ǥ���� �� �ϳ��� �߻�ȭ�� Ŭ����
	int x;
	int y;
}

//�θ��� ���(����, �޼���)�� ��������.
//class �ڽ� extends �θ�
//java�� ����� ���� ���, ���� class�� ���ÿ� �����ϸ� �ȵ�.
class Point3D extends Point {
	//int x;
	//int y;
	int z;
}

class Point4D extends Point3D {
	int t;
}
