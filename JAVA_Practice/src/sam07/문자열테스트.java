package sam07;

public class 문자열테스트 {
	public static void p(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		
		String url = "https://FastCampus.co.kr/";
		final String FS = "https://fastcampus.co.kr/";

		// length()
		int length = url.length();
		p("문자열길이 : " + length);	// 문자열길이 : 25
		/*
		p("============================");
		// charAt() : 문자열을 하나씩 가져옴
		for(int i = 0; i < url.length() ; i++) {
			p(url.charAt(i));	// h
								// t
								// t
								// p ... (문자열 끝까지 출력)
		}
		*/
		/*
		p("============================");
		// toCharArray()
		for(char c1 : url.toCharArray()) {
			p(c1);	// h
					// t
					// t
					// p ... (문자열 끝까지 출력)
		}
		p("============================");	
		*/
		
		// contains() : 원하는 문자열 포함 여부확인 (boolean)			
		p(url.contains("http"));	// true

		// indexOf() : 원하는 문자열이 본문에서 (앞에서)몇번째에 있나?
		p(url.indexOf(".co"));		// 18
		
		// lastIndexOf() : 원하는 문자열이 본문에서 (끝에서)몇번째에 있나?
		p(url.lastIndexOf("."));	// 21
		
		p("[" + url + "]"); 	// [https://FastCampus.co.kr/       ]
		// trim() : 공백 제거
		p("[" + url.trim() + "]"); 	// [https://FastCampus.co.kr/]
		
		// toLowerCase() , toUpperCase()
		p(url.toLowerCase());	// https://fastcampus.co.kr/
		p(url.toUpperCase());	// HTTPS://FASTCAMPUS.CO.KR/
		
		// equals() : 대소문자 구분됨 , equalsIgnoreCase() : 대소문자 구분 없음 
		p(url.equals(FS));		// false
		p(url.equalsIgnoreCase(FS)); 	// true
		
		
		String url2 = "http://www.naver.com/news/tv/sbs";
//		news, 	tv,  	sbs
//		분류,  	매체, 	방송국
//		news, 	radio, 	kbs
		
		p(url2);	// http://www.naver.com/news/tv/sbs
		p(url2.replace("http://www.naver.com/", ""));	// news/tv/sbs
		p("-----------------------------------");
		
		// split() : ()안의 문자열을 기준으로 쪼개서 String[]에 담아 준다.
		// replace(a,b) : a를 b로 대체 시켜준다. 
		// replaceAll()
		String[] url2LiSt = url2.replace("http://www.naver.com/", "").split("/");
			/*
			 for(String u: url2LiSt) {
				p(u);	// news
						// tv
						// sbs
			 }
			*/
		p("분류: " + url2LiSt[0]);	// 분류: news
		p("매체: " + url2LiSt[1]);	// 매체: tv
		p("방송국: " + url2LiSt[2]);	// 방송국: sbs
		
		//	concat() : ()안에 있는 문자열을 뒤에 더 해준다.
		p(url2.concat("index.html"));	// http://www.naver.com/news/tv/sbsindex.html
		p(url2 + "index.html");		// http://www.naver.com/news/tv/sbsindex.html
		
//		✔️ concat()의 실무 적용 ✔️
//		mariadb, mysql 문자열 조합일때, concat('a','b','c')
//		Oracle -> 'a' || 'b' || 'c'
//		MSSQL -> 'a' + 'b' + 'c'
		
		// substring() : () 안에 범위에 해당 하는 내용을 가져오겠다.
		p(url.substring(8,18));	// FastCampus

		// valuable
		String v1 = String.valueOf(12);
		int n1 = Integer.valueOf(v1);
		
		String v2 = 13 + "";
		p(v2.getClass().getName());		// java.lang.String
		
		// compareTo() : 앞뒤 내용 비교하여 양수 음수로 표시
		
		String str1 = "홍길동";
		String str2 = "이순신";
		
		p(str1.compareTo(str2)); 	// 3801
		p(str2.compareTo(str1)); 	// -3801
		p(str1.compareTo(str1));	// 0
		
		
	}

}
