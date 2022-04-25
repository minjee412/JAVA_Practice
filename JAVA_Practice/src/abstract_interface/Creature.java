package abstract_interface;

public abstract class Creature {
	private int x;
	private int y;
	private int age;
	
	public Creature(int x, int y, int age) {
		this.x = x;
		this.y = y;
		this.age = age;
	}
	
//	�����ϴ� ���� ��� ����ü���� �ʿ��� ���������, �� ����ü���� �ٸ� ������� �����ؾ� �ϱ� ������ �߻� �޼���� ����
	public abstract void attack();
	public abstract void printInfo();
	
//	����ü�� ������ ���̸� �԰�, �����̴� ���� ���� ����̱� ������ ���� Ŭ�������� �����ϰ� ����� �� �ֵ��� �Ϲ� �޼���� ����
	public void increaseAge() {
		age++;
	}
	
	public void move(int xDistance) {
		x += xDistance;
	}
	
	// Getter, Setter�� ����ϴ� ���� : ��ü���� ������(�ʵ�)�� �ܺο��� ���������� �����ϴ� ���� ���Ƴ����ϴ�.
	// �ʵ���� private ���� �����ڷ� ���Ƶΰ�, �� �ʵ��� Getter, Setter�� �����ϴ� ����� ����մϴ�.
	// �̷��� ���α׷��� �ϴ� ������ ��ü�� ���Ἲ�� �����ϱ� �����Դϴ�.
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// Ŭ���� ���ο��� public String toString()��� �޼ҵ带 �����ؼ� 
	// System.out.println(�ν��Ͻ��� �̸�)�� ȣ�� ���� �� ��� �� ���ڿ��� ������ �� �ִ� ���Դϴ�.
	public String toString() {
		return "x : " + x + ", y : " + y + ", age : " + age ;
	}	
}
