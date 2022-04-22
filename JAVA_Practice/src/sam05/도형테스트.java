package sam05;

public abstract class 도형테스트 {
	
	public static void main(String[] args) {
//		도형 도형1 = new 도형(10, 10); // 에러 (추상클래스이기 때문에) 
		
		삼각형 삼각형1 = new 삼각형(10,10,100,120);
		삼각형1.그리기();
		
		원 원1 = new 원(25,24, 300);
		원1.그리기();
		원1.초기화();
		원1.그리기(); // 도형.java의 초기화 메소드로 인해 x와 y 좌표값이 0으로 초기화 됨.
				   // 반지름까지 초기화 하고 싶을때는 ? 원.java에서 Override로 반지름 초기화
		원1.초기화();
	}
}
