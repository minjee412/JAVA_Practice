package ��Ȱ�ڵ�.ExceptionTest;

class DivideException extends Exception{
	public int left;
	public int right;
	public DivideException() {
		super();
	}
//	DivideException(String message){
//		super(message);
//	}
	
	DivideException(String message, int left, int right){
		super(message);
		this.left = left;
		this.right = right;
	}
}

class Calculator{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
//	===== ����ó��) ��� 1 >> try catch�� ���
//	public void devide() {
//		try {
//			if(right == 0 ) {
//				throw new DivideException("0���� ���� �� �����ϴ�.");
//			}
//			System.out.println(this.left / this.right);
//		} catch (DivideException e) {
//			e.printStackTrace();
//		}
//	}
	
//	===== ����ó��) ��� 2 >> throw ���

	public void devide() throws DivideException{
			if(right == 0 ) {
				throw new DivideException("0���� ���� �� �����ϴ�.", this.left, this.right);
			}
			System.out.println(this.left / this.right);
	}
}

public class CalculatorDivideException {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		try {
			c1.devide();
		}catch (DivideException e) {
			System.out.println(e.getMessage()); // 0���� ���� �� �����ϴ�.
			System.out.println(e.left); // 10
			System.out.println(e.right); // 0
		}
	}
}
