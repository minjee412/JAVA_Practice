package sam05;

public  class �ﰢ�� extends ����{
	
	int ����;
	int ����;
	
	public �ﰢ��(int x��ǥ��, int y��ǥ��, int ����, int ����) {
		super(x��ǥ��, y��ǥ��);
		
		this.���� = ����;
		this.���� = ����;
	}

//	�߻�Ŭ�������� ��� ���� ���, �߻� Ŭ���� �ȿ� �ִ� �޼ҵ�� �ݵ��
//	�����;� �Ѵ�.
	@Override
	public void �׸���() {
		System.out.println("�ﰢ�� �׸��� =============");
		System.out.println("��ǥ��: (" + x��ǥ�� + "," + y��ǥ�� + ")");
		System.out.println("����: " + ���� + ", ����" + ����);
		
	}
}
