package ��Ȱ�ڵ�.ExceptionTest;

class CalculatorException{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		try {
			System.out.println("��� ����� ");
			System.out.println(this.left / this.right);
			System.out.println("�Դϴ�.");
		}catch (Exception e) {
//			catch���� ������ ���� ��ü�� ����ִ�  �Ű����� 'e'�� Ÿ���� Exception�̶�� class�̰�
//			Exception�ȿ� getMessage��� �޼ҵ带 print �Ѵ�.
			System.out.println("������ �߻��߽��ϴ�. : " + e.getMessage());
		}
	}
}


public class CalculatorExceptionTest {

	public static void main(String[] args) {
		CalculatorException c1 = new CalculatorException();
		c1.setOprands(10, 0);
		c1.divide(); // ��� ����� 
					 // ������ �߻��߽��ϴ�. : / by zero
		
		CalculatorException c2 = new CalculatorException();
        c2.setOprands(10, 5);
        c2.divide();	// ��� ����� 
						// 2
						// �Դϴ�.
	}

}
