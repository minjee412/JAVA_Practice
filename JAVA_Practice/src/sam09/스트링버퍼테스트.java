package sam09;

public class ��Ʈ�������׽�Ʈ {

	public static void main(String[] args) {
		/*StringBuffer sb = new StringBuffer();
		//	append : ���� ���ڿ��� ���ʿ� ���ڿ��� �߰�
		//	append�� this�� ���� �ϱ� ������ �Ʒ��� ���� (sb ����) ǥ�� ����
		
		 sb.append("ȫ�浿")
		 
		  .append(System.lineSeparator())
		  .append("�л�")
		  .append(System.lineSeparator())
		  .append(20);
		
		System.out.println(sb);	// ȫ�浿
								// �л�
								// 20
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("ȫ�浿")
			  .append(System.lineSeparator())
			  .append("�л�")
			  .append(System.lineSeparator())
			  .append(20);
		
		System.out.println(sb2);	// ȫ�浿
									// �л�
									// 20
		*/
		
		String name = "ȫ�浿";
		String jobs = "�л�";
		int age = 20;
		
		StringPlus sp = new StringPlus();
//		sp.append(String.format("�̸� : %s", name));
				
//		System.out.println(sp.toString()); 	
		// sam09.StringPlus@6d1e7682 (�̷��� ������ ���� ? StringPlus�� toString�� �������� �ʾұ⶧����)
		// (StringPlus�� toString ���� ��) �̸� : ȫ�浿
		
		sp.appendFormat("�̸�: %s", name)
			.line()
			.appendFormat("����: %s", jobs)
			.line()
			.appendFormat("����: %d", age);
		System.out.println(sp.toString()); 	// �̸�: ȫ�浿


	}

}
