package sam02;

public class 차량 {
	public String 이름 = "차량";
//	자동차 이름 테스트를 위한 초기화
	public double 최대속도;
	public int 정원;
	
	public void 정보출력() {
		System.out.println("이름 : " + 이름);
		System.out.println("최대속도 : " + 최대속도);
		System.out.println("정원 : " + 정원);
	}
}
