package abstract_interface;

// Programmer �� Swimable�� �������̽��̱� ������, ���� ��� ����
public class Alex extends Human implements Programmer, Swimable{

	public Alex(int x, int y, int age) {
		super(x, y, age);
	}

	@Override
	public void coding() {
		System.out.println("Hello World");
	}

	@Override
	public void printInfo() {
		System.out.println("Alex -> " + toString());
	}

	@Override
//	swimDown() �޼��带 �ٸ��� ��������. (�� �κп��� �߻�Ŭ�������ٴ� �������̽��� ���ٴ� ���� �� �� �ִ�.)
	public void swimDown(int yDistance) {
		setY(getY() + yDistance);
		
		if(getY() < -10) {
			System.out.println("�ʹ� ���� ���� ���� �� �־� !");
		}
	}
	
}
