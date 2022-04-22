package sam05;

public abstract class 도형 {
	
	protected int x좌표값;
	protected int y좌표값;
	
	public 도형(int x좌표값, int y좌표값) {
		this.x좌표값 = x좌표값;
		this.y좌표값 = y좌표값;
	}
	
	public void 초기화 () {
		x좌표값 = 0;
		y좌표값 = 0;
	}

	public abstract void 그리기(); // 그리기 메소드는 내가 구현 할 수없으니 너희가 상속 받아서 알아서 구현해봐 라는 의미로 추상클래스인 abstract를 붇이고, 
								 // {} 없이 바로 ;을 찍는다.
}
