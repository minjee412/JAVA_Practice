package sam04.a2;

import java.util.Calendar;

import sam04.a1.계좌;

public class 저축계좌체크테스트 {
	
//	같은 패키지 → x
//	상속 → x
	public static void main(String[] args) {
		계좌 계좌1 = new 계좌();
		계좌1.이름 = "은행계좌";
//		계좌1.개설일 = Calendar.getInstance().getTime();		// protected → x
//		계좌1.계좌번호 = 12345;	// default → x
//		계좌1.금액 = 1000;		// private → x
	}
		
}
