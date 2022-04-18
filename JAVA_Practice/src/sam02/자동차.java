package sam02;

public class 자동차 extends 차량{
	public String 이름 = "자동차";
	public String 배기량;
	
	public 자동차() {
		super(); // super를 넣을 경우, 제일 위에 와야 한다.
		// 그렇지 않을 경우, Constructor call must be the first statement in a constructor
		// 에러 발생
		System.out.println("자동차의 기본 생성자 호출!");
		// (자동차 기본 생성자)
		// 차량의 생성자도 호출!
	}
	
	public 자동차(double 최대속도, int 정원, String 배기량) {
		super(최대속도,정원);
//		super.최대속도 = 최대속도;
//		super.정원 = 정원;
		
		this.배기량 = 배기량;
		System.out.println("자동차의 생성자[매개변수(최대속도, 정원, 배기량)]를 받는 생성자 호출");
		
	}

	public void 정보출력() {
		System.out.println("(차량)이름 : " + super.이름);
		System.out.println("최대속도 : " + 최대속도);
		System.out.println("정원 : " + 정원);
		
		System.out.println("배기량 : " + 배기량);
		System.out.println("(자동차)이름 : " + 이름);
	}
	
}
