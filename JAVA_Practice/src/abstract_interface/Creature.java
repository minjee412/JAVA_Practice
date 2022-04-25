package abstract_interface;

public abstract class Creature {
	private int x;
	private int y;
	private int age;
	
	public Creature(int x, int y, int age) {
		this.x = x;
		this.y = y;
		this.age = age;
	}
	
//	공격하는 것은 모든 생명체에게 필요한 기능이지만, 각 생명체마다 다른 기능으로 구현해야 하기 때문에 추상 메서드로 구현
	public abstract void attack();
	public abstract void printInfo();
	
//	생명체는 누구나 나이를 먹고, 움직이는 것이 공통 기능이기 때문에 하위 클래스에서 간단하게 상속할 수 있도록 일반 메서드로 구현
	public void increaseAge() {
		age++;
	}
	
	public void move(int xDistance) {
		x += xDistance;
	}
	
	// Getter, Setter를 사용하는 이유 : 객체들의 데이터(필드)를 외부에서 직접적으로 접근하는 것을 막아놓습니다.
	// 필드들을 private 접근 제한자로 막아두고, 각 필드의 Getter, Setter로 접근하는 방식을 사용합니다.
	// 이렇게 프로그래밍 하는 이유는 객체의 무결성을 보장하기 위함입니다.
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 클래스 내부에서 public String toString()라는 메소드를 선언해서 
	// System.out.println(인스턴스의 이름)을 호출 했을 때 출력 될 문자열을 지정할 수 있는 것입니다.
	public String toString() {
		return "x : " + x + ", y : " + y + ", age : " + age ;
	}	
}
