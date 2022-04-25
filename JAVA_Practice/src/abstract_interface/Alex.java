package abstract_interface;

// Programmer 와 Swimable이 인터페이스이기 때문에, 다중 상속 가능
public class Alex extends Human implements Programmer, Swimable{

	public Alex(int x, int y, int age) {
		super(x, y, age);
	}

	@Override
	public void coding() {
		System.out.println("Hello World");
	}

	@Override
	public void printInfo() {
		System.out.println("Alex -> " + toString());
	}

	@Override
//	swimDown() 메서드를 다르게 재정의함. (이 부분에서 추상클래스보다는 인터페이스가 좋다는 것을 알 수 있다.)
	public void swimDown(int yDistance) {
		setY(getY() + yDistance);
		
		if(getY() < -10) {
			System.out.println("너무 깊이 들어가면 죽을 수 있어 !");
		}
	}
	
}
