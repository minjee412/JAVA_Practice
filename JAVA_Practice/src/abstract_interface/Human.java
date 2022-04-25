package abstract_interface;

public abstract class Human extends Creature implements Takable{
	//	인간도 생명체이기 때문에 Creature클래스 상속.
	public Human(int x, int y, int age) {
		super(x, y, age);
	}
	
	@Override
	public void attack() {
		System.out.println("슉 슈슉. 슉");		
	}
	
	@Override
	public void talk() {
		System.out.println("안녕하세요. 반갑습니다.");
	}
}
