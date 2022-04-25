package sam06;

public class 예외테스트 {
	
	public static void method(int i , int j) throws Exception {
		
//	② ①의 에러를 막기 위해 if문 안에 예외가 되는 상황을 if 문으로
//	  내가 먼저 throw문을 던진다. (예외를 내가 먼저 선수 친다.)
		if(j == 0) {
			throw new Exception("0으로 나눌수 없습니다.");
		}
//	====================================================
		
//	① ArithmeticException 에러 발생 ======
		int k = i / j;
		System.out.println(k);
	}
//	====================================

	public static void main(String[] args) {
		try {
			method(1, 0);
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
