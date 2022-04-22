package 생활코딩;

abstract class Calculator{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	int _sum() {
		return this.left + this.right;
	}
	
	public abstract void sum();
	public abstract void avg();
	public void run() {
		sum();
		avg();
	}
}

class CalculatorDecoPlus extends Calculator{
	public void sum() {
		System.out.println("+sum: " + _sum());
	}
	
	public void avg() {
		System.out.println("+avg: " + (this.left+this.right)/2);
	}
}

class CalculatorDecoMinus extends Calculator{
	public void sum() {
		System.out.println("-sum: " + _sum());
	}
	
	public void avg() {
		System.out.println("-avg: " + (this.left + this.right)/2);
	}
}

public class CalculatorDemo {
//	② execute 내부에서는 매개변수로 전달된 객체의 메소드 run을 호출
//	만약 메소드 execute의 매개변수 데이터 타입이 Calculator가 아니라면 어떻게 해야할까? 
//	위와 같은 로직을 처리 할 수 없을 것이다. 메소드 execute 입장에서는 매개변수로 전달된 값이 
//	Calculator이거나 그 자식이라면 메소드 run을 가지고 있다는 것을 보장 받을 수 있게 되는 것이다.
	public static void execute(Calculator cal) {
		System.out.println("실행결과");
		cal.run();
	}
//	------------------------------------------------
	public static void main(String[] args) {
		Calculator c1 = new CalculatorDecoPlus();
		c1.setOprands(10, 20);
//	①	c1.run();
		
		Calculator c2 = new CalculatorDecoMinus();
		c2.setOprands(10, 20);
//	①	c2.run();
		
/*②*/		execute(c1);
/*②*/		execute(c2);
	}

}
