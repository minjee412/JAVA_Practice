package abstract_interface;

public abstract class Animal extends Creature {
	// ������ ����ü�̱� ������ Creature �߻� Ŭ���� ���
	// ���� ����Ͽ� �����ϱ� ������ attack() �޼��� �������̵�
	// pintInfo()�� �������� �ʾҴ�. >> ���� Ŭ������ �߻� Ŭ�����̱� ������, ���� Ŭ�������� ������ �߻�޼��带 ������ ���� Ŭ������ ����� Ŭ�������� ����
	
	public Animal(int x, int y, int age) {
		super(x, y, age);
	}
	
	@Override
	public void attack() {
		System.out.println("�����ġ��!");
	}
	
}
