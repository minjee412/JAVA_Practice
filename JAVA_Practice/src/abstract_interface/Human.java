package abstract_interface;

public abstract class Human extends Creature implements Takable{
	//	�ΰ��� ����ü�̱� ������ CreatureŬ���� ���.
	public Human(int x, int y, int age) {
		super(x, y, age);
	}
	
	@Override
	public void attack() {
		System.out.println("�� ����. ��");		
	}
	
	@Override
	public void talk() {
		System.out.println("�ȳ��ϼ���. �ݰ����ϴ�.");
	}
}
