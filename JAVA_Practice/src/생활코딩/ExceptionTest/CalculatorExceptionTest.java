package 생활코딩.ExceptionTest;

class CalculatorException{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		try {
			System.out.println("계산 결과는 ");
			System.out.println(this.left / this.right);
			System.out.println("입니다.");
		}catch (Exception e) {
//			catch에서 에러의 정보 객체를 담고있는  매개변수 'e'는 타입이 Exception이라는 class이고
//			Exception안에 getMessage라는 메소드를 print 한다.
			System.out.println("오류가 발생했습니다. : " + e.getMessage());
		}
	}
}


public class CalculatorExceptionTest {

	public static void main(String[] args) {
		CalculatorException c1 = new CalculatorException();
		c1.setOprands(10, 0);
		c1.divide(); // 계산 결과는 
					 // 오류가 발생했습니다. : / by zero
		
		CalculatorException c2 = new CalculatorException();
        c2.setOprands(10, 5);
        c2.divide();	// 계산 결과는 
						// 2
						// 입니다.
	}

}
