package 생활코딩.ThrowTest;

//  java에서 if(right == 0)를 만났을때, 조건에 해당되는 순간 ArithmeticException라는 인스턴스 안에 "0으로 나눌 수 없습니다.."가 들어간다.
//  main 에서 divide()가 호출 되었을때, catch에서 이미 ArithmeticException 인스턴스안에 넣어 두었던 "0으로 나눌 수 없습니다.."를
//  'e'안에 넣고, System.out.println(e.getMessage()); 통해 "0으로 나눌 수 없습니다.."가 콘솔에 나온다.

class CalculatorThrow{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		if(right == 0){
	        throw new ArithmeticException("0으로 나눌 수 없습니다..");
	      }
		try {
			System.out.println("계산 결과는 ");
			System.out.println(this.left / this.right);
			System.out.println("입니다.");
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
