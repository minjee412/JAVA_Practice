package sam08;

public class FormattingTest {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		int age = 24;
		double weight = 80.1;
		
		// �⺻���� ���
		System.out.println("�̸�: " + name + ", ����: " + age + ", ������: " + weight);	// �̸� : ȫ�浿, ���� : 24, ������ : 80.1

		// format()
		System.out.println(String.format("�̸�: %s, ����: %d, ������: %.2f", name, age, weight));
		//	%s : String �� , %d : double �� , %.2f : (�Ҽ��� �Ʒ� 2�ڸ� ����) �Ǽ��� 
		// �̸�: ȫ�浿, ����: 24, ������: 80.10
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           

	}

}
