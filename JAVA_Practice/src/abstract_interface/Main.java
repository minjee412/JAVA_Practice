package abstract_interface;

public class Main {

	public static void main(String[] args) {
		Pigeon pigeon = new Pigeon(5, 10, 2);
			pigeon.printInfo();
			pigeon.increaseAge();
			pigeon.move(50);
			pigeon.printInfo();
			pigeon.fly(3);
			pigeon.printInfo();
			pigeon.flyMove(10, 10);
			pigeon.printInfo();
			pigeon.attack();
			System.out.println();
			
		Alex alex = new Alex(0, 0, 25);
			alex.printInfo();
			alex.increaseAge();
			alex.move(10);
			alex.printInfo();
			alex.attack();
			alex.coding();
			alex.swimDown(20);
			alex.printInfo();
			System.out.println();
			
		Dog dog = new Dog(20, -100, 100);
			dog.printInfo();
			dog.increaseAge();
			dog.move(-50);
			dog.printInfo();
			dog.attack();
			dog.swimDown(1000);
			dog.printInfo();
	}

}
