package sam02;

public class �ڵ��� extends ����{
	public String �̸� = "�ڵ���";
	public String ��ⷮ;
	
	public �ڵ���() {
		super(); // super�� ���� ���, ���� ���� �;� �Ѵ�.
		// �׷��� ���� ���, Constructor call must be the first statement in a constructor
		// ���� �߻�
		System.out.println("�ڵ����� �⺻ ������ ȣ��!");
		// (�ڵ��� �⺻ ������)
		// ������ �����ڵ� ȣ��!
	}
	
	public �ڵ���(double �ִ�ӵ�, int ����, String ��ⷮ) {
		super(�ִ�ӵ�,����);
//		super.�ִ�ӵ� = �ִ�ӵ�;
//		super.���� = ����;
		
		this.��ⷮ = ��ⷮ;
		System.out.println("�ڵ����� ������[�Ű�����(�ִ�ӵ�, ����, ��ⷮ)]�� �޴� ������ ȣ��");
		
	}

	public void �������() {
		System.out.println("(����)�̸� : " + super.�̸�);
		System.out.println("�ִ�ӵ� : " + �ִ�ӵ�);
		System.out.println("���� : " + ����);
		
		System.out.println("��ⷮ : " + ��ⷮ);
		System.out.println("(�ڵ���)�̸� : " + �̸�);
	}
	
}
