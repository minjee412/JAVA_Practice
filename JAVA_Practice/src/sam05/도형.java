package sam05;

public abstract class ���� {
	
	protected int x��ǥ��;
	protected int y��ǥ��;
	
	public ����(int x��ǥ��, int y��ǥ��) {
		this.x��ǥ�� = x��ǥ��;
		this.y��ǥ�� = y��ǥ��;
	}
	
	public void �ʱ�ȭ () {
		x��ǥ�� = 0;
		y��ǥ�� = 0;
	}

	public abstract void �׸���(); // �׸��� �޼ҵ�� ���� ���� �� �������� ���� ��� �޾Ƽ� �˾Ƽ� �����غ� ��� �ǹ̷� �߻�Ŭ������ abstract�� ���̰�, 
								 // {} ���� �ٷ� ;�� ��´�.
}
