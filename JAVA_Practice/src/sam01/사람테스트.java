package sam01;

public class 사람테스트 {

	public static void main(String[] args) {
//		사람 사람1 = new 사람();	//에러발생 → 사람.java에서 이름과 번호를 받는 생성자를 만들었기 때문에
		사람 사람1 = new 사람("박하은", 1111);
		
		System.out.println("이름 : " + 사람1.이름);
		System.out.println("번호 : " + 사람1.번호);
	}

}
