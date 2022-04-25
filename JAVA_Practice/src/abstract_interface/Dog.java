package abstract_interface;

public class Dog extends Animal implements Swimable{
	
	public Dog(int x, int y, int age) {
		super(x, y, age);
	}

	@Override
	public void swimDown(int yDistance) {
		setY(getY() + yDistance);
	}

	@Override
	public void printInfo() {
		System.out.println("Dog -> " + toString());
	}
}
