package 생활코딩;

abstract class A{
	public abstract int b();
//	본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
	
//	public abstract int c(){System.out.println("Hello")}
//	😮 abstract를 사용하면, {} 안에 구체적인 내용이 있는 메소드는 사용할 수 없다. 😮
	
	//	추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다.
	public void d() {
		System.out.println("world");
	}
}

class B extends A{
//	class A를 상속 받은 class B가 
//	반드시 메소드 b의 구체적인 내용인 본체를 정의 해서 Override 해야 한다. 
	@Override
	public int b() {
		return 1;
	}
}


public class Abstract {

	public static void main(String[] args) {
//		A objA = new A(); // 오류

	}

}
