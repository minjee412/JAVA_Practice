package sam07;


import java.util.Calendar;
import java.util.Date;

public class toStringEx {
	
	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.toString());	// java.lang.Object@626b2d4a
		System.out.println(obj1.hashCode());	// 1651191114
		System.out.println(Integer.toHexString(obj1.hashCode()));	// 626b2d4a

		String str = new String("홍길동");
		System.out.println(str.toString());	// 홍길동
		
		Date dt1 = Calendar.getInstance().getTime();
		System.out.println(dt1.toString());		// Mon Apr 25 16:53:27 KST 2022

		
		사람 홍길동 = new 사람("홍길동", 20);
		System.out.println(홍길동.toString());	// 이름 : 홍길동, 나이 : 20
	}

}
