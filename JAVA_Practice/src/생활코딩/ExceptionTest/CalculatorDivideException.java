package 생활코딩.ExceptionTest;

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
//	===== 에러처리) 방법 1 >> try catch문 사용
//	public void devide() {
//		try {
//			if(right == 0 ) {
//				throw new DivideException("0으로 나눌 수 없습니다.");
//			}
//			System.out.println(this.left / this.right);
//		} catch (DivideException e) {
//			e.printStackTrace();
//		}
//	}
	
//	===== 에러처리) 방법 2 >> throw 사용

	public void devide() throws DivideException{
			if(right == 0 ) {
				throw new DivideException("0으로 나눌 수 없습니다.", this.left, this.right);
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
			System.out.println(e.getMessage()); // 0으로 나눌 수 없습니다.
			System.out.println(e.left); // 10
			System.out.println(e.right); // 0
		}
	}
}
