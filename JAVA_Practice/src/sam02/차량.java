package sam02;

public class ���� {
	public String �̸� = "����";
//	�ڵ��� �̸� �׽�Ʈ�� ���� �ʱ�ȭ
	public double �ִ�ӵ�;
	public int ����;
	
	public ����() {
		// ������ �⺻ ������
		System.out.println("������ �⺻ ������ ȣ��!");
	}
	
	public ����(double �ִ�ӵ�,int ����) {
		System.out.println("������ ������[�Ű�����(�ִ�ӵ�, ����)]�� �޴� ȣ�� !");
		this.�ִ�ӵ� = �ִ�ӵ�;
		this.���� = ����;
	};
	
	public void �������() {
		System.out.println("�̸� : " + �̸�);
		System.out.println("�ִ�ӵ� : " + �ִ�ӵ�);
		System.out.println("���� : " + ����);
	}
}
