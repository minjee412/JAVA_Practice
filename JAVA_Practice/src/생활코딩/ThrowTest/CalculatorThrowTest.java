package ��Ȱ�ڵ�.ThrowTest;

//  java���� if(right == 0)�� ��������, ���ǿ� �ش�Ǵ� ���� ArithmeticException��� �ν��Ͻ� �ȿ� "0���� ���� �� �����ϴ�.."�� ����.
//  main ���� divide()�� ȣ�� �Ǿ�����, catch���� �̹� ArithmeticException �ν��Ͻ��ȿ� �־� �ξ��� "0���� ���� �� �����ϴ�.."��
//  'e'�ȿ� �ְ�, System.out.println(e.getMessage()); ���� "0���� ���� �� �����ϴ�.."�� �ֿܼ� ���´�.

class CalculatorThrow{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		if(right == 0){
	        throw new ArithmeticException("0���� ���� �� �����ϴ�..");
	      }
		try {
			System.out.println("��� ����� ");
			System.out.println(this.left / this.right);
			System.out.println("�Դϴ�.");
		}catch (Exception e) {
			System.out.println("\n\ne.getMessage()\n" + e.getMessage());
			System.out.println("\n\ne.toString()\n" + e.toString());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
		}
	}
}


public class CalculatorThrowTest {

	public static void main(String[] args) {
		CalculatorThrow c1 = new CalculatorThrow();
		c1.setOprands(10, 0);
		try {
			c1.divide();
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
