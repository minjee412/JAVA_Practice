package sam07;

public class ObjectClass {
	
	public static boolean isHonggildong(String str) {
//		======= 기본 비교 방법 =======
//		if(str.equals("홍길동")) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	
//		======= 실무 비교 방법 =======
//		(비교하려는 주체를 놓고 비교 한다.)
		String gender = "";
		
		if(gender.equals("M")) {
		} else if (gender.equals("F")) {
		}
		
		if("M".equals(gender)) {
		} else if ("F".equals(gender)) {
		}
		
//		if(str != null && str.equals("홍길동")) {
//			return true;
//		} else {
//			return false;
//		}
		
//		👩‍💻 아래같은 방식으로 표현 하면 구지 str이 null 인지 아닌지 확인하는 로직을 구현할 필요가 없다.
		if("홍길동".equals(str)){
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "이순신";
		String str3 = null;
		int num1 = 1;
		int num2 = 2;
		
//		실무 : 숫자 또는 정수 (기본형) 비교에 == 활용
		if (num1 == num2) {
		}
		
//		실무: 문자열은 equals 활용
		if(str1.equals(str2)) {
		}
		
		System.out.println(isHonggildong(str1));	// true
		System.out.println(isHonggildong(str2));	// false
		System.out.println(isHonggildong(str3));	// NullPointerException 에러발생


	}

}
