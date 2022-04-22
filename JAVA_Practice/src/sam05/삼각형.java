package sam05;

public  class 삼각형 extends 도형{
	
	int 길이;
	int 높이;
	
	public 삼각형(int x좌표값, int y좌표값, int 길이, int 높이) {
		super(x좌표값, y좌표값);
		
		this.길이 = 길이;
		this.높이 = 높이;
	}

//	추상클래스에서 상속 받을 경우, 추상 클래스 안에 있는 메소드는 반드시
//	가져와야 한다.
	@Override
	public void 그리기() {
		System.out.println("삼각형 그리기 =============");
		System.out.println("좌표값: (" + x좌표값 + "," + y좌표값 + ")");
		System.out.println("길이: " + 길이 + ", 높이" + 높이);
		
	}
}
