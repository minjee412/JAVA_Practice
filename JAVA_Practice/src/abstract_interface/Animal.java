package abstract_interface;

public abstract class Animal extends Creature {
	// 동물은 생명체이기 때문에 Creature 추상 클래스 상속
	// 몸을 사용하여 공격하기 때문에 attack() 메서드 오버라이딩
	// pintInfo()는 구현하지 않았다. >> 동물 클래스도 추상 클래스이기 때문에, 상위 클래스에서 선언한 추상메서드를 앞으로 동물 클래스를 상속할 클래스에게 위임
	
	public Animal(int x, int y, int age) {
		super(x, y, age);
	}
	
	@Override
	public void attack() {
		System.out.println("몸통박치기!");
	}
	
}
