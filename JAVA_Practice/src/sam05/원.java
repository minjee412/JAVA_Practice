package sam05;

public  class �� extends ����{
	
	int ������;
	
	public ��(int x��ǥ��, int y��ǥ��, int ������) {
		super(x��ǥ��, y��ǥ��);
		
		this.������ = ������;
	}
	
	@Override
	public void �ʱ�ȭ() {
		x��ǥ�� = 0;
		y��ǥ�� = 0;
		������ = 0;
	}

//	�߻�Ŭ�������� ��� ���� ���, �߻� Ŭ���� �ȿ� �ִ� �޼ҵ�� �ݵ��
//	�����;� �Ѵ�.
	@Override
	public void �׸���() {
		System.out.println("�� �׸��� =============");
		System.out.println("��ǥ��: (" + x��ǥ�� + "," + y��ǥ�� + ")");
		System.out.println("������: " + ������);
		
	}
}
