package sam09;

public class 스트링버퍼테스트 {

	public static void main(String[] args) {
		/*StringBuffer sb = new StringBuffer();
		//	append : 기존 문자열의 뒤쪽에 문자열을 추가
		//	append는 this를 리턴 하기 때문에 아래와 같이 (sb 생략) 표현 가능
		
		 sb.append("홍길동")
		 
		  .append(System.lineSeparator())
		  .append("학생")
		  .append(System.lineSeparator())
		  .append(20);
		
		System.out.println(sb);	// 홍길동
								// 학생
								// 20
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("홍길동")
			  .append(System.lineSeparator())
			  .append("학생")
			  .append(System.lineSeparator())
			  .append(20);
		
		System.out.println(sb2);	// 홍길동
									// 학생
									// 20
		*/
		
		String name = "홍길동";
		String jobs = "학생";
		int age = 20;
		
		StringPlus sp = new StringPlus();
//		sp.append(String.format("이름 : %s", name));
				
//		System.out.println(sp.toString()); 	
		// sam09.StringPlus@6d1e7682 (이렇게 나오는 이유 ? StringPlus에 toString을 구현하지 않았기때문에)
		// (StringPlus에 toString 구현 후) 이름 : 홍길동
		
		sp.appendFormat("이름: %s", name)
			.line()
			.appendFormat("직업: %s", jobs)
			.line()
			.appendFormat("나이: %d", age);
		System.out.println(sp.toString()); 	// 이름: 홍길동


	}

}
