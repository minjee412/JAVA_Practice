package sam05;

public  class 원 extends 도형{
	
	int 반지름;
	
	public 원(int x좌표값, int y좌표값, int 반지름) {
		super(x좌표값, y좌표값);
		
		this.반지름 = 반지름;
	}
	
	@Override
	public void 초기화() {
		x좌표값 = 0;
		y좌표값 = 0;
		반지름 = 0;
	}

//	추상클래스에서 상속 받을 경우, 추상 클래스 안에 있는 메소드는 반드시
//	가져와야 한다.
	@Override
	public void 그리기() {
		System.out.println("원 그리기 =============");
		System.out.println("좌표값: (" + x좌표값 + "," + y좌표값 + ")");
		System.out.println("반지름: " + 반지름);
		
	}
}
