package sam07;

public class ���ڿ��׽�Ʈ {
	public static void p(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		
		String url = "https://FastCampus.co.kr/";
		final String FS = "https://fastcampus.co.kr/";

		// length()
		int length = url.length();
		p("���ڿ����� : " + length);	// ���ڿ����� : 25
		/*
		p("============================");
		// charAt() : ���ڿ��� �ϳ��� ������
		for(int i = 0; i < url.length() ; i++) {
			p(url.charAt(i));	// h
								// t
								// t
								// p ... (���ڿ� ������ ���)
		}
		*/
		/*
		p("============================");
		// toCharArray()
		for(char c1 : url.toCharArray()) {
			p(c1);	// h
					// t
					// t
					// p ... (���ڿ� ������ ���)
		}
		p("============================");	
		*/
		
		// contains() : ���ϴ� ���ڿ� ���� ����Ȯ�� (boolean)			
		p(url.contains("http"));	// true

		// indexOf() : ���ϴ� ���ڿ��� �������� (�տ���)���°�� �ֳ�?
		p(url.indexOf(".co"));		// 18
		
		// lastIndexOf() : ���ϴ� ���ڿ��� �������� (������)���°�� �ֳ�?
		p(url.lastIndexOf("."));	// 21
		
		p("[" + url + "]"); 	// [https://FastCampus.co.kr/       ]
		// trim() : ���� ����
		p("[" + url.trim() + "]"); 	// [https://FastCampus.co.kr/]
		
		// toLowerCase() , toUpperCase()
		p(url.toLowerCase());	// https://fastcampus.co.kr/
		p(url.toUpperCase());	// HTTPS://FASTCAMPUS.CO.KR/
		
		// equals() : ��ҹ��� ���е� , equalsIgnoreCase() : ��ҹ��� ���� ���� 
		p(url.equals(FS));		// false
		p(url.equalsIgnoreCase(FS)); 	// true
		
		
		String url2 = "http://www.naver.com/news/tv/sbs";
//		news, 	tv,  	sbs
//		�з�,  	��ü, 	��۱�
//		news, 	radio, 	kbs
		
		p(url2);	// http://www.naver.com/news/tv/sbs
		p(url2.replace("http://www.naver.com/", ""));	// news/tv/sbs
		p("-----------------------------------");
		
		// split() : ()���� ���ڿ��� �������� �ɰ��� String[]�� ��� �ش�.
		// replace(a,b) : a�� b�� ��ü �����ش�. 
		// replaceAll()
		String[] url2LiSt = url2.replace("http://www.naver.com/", "").split("/");
			/*
			 for(String u: url2LiSt) {
				p(u);	// news
						// tv
						// sbs
			 }
			*/
		p("�з�: " + url2LiSt[0]);	// �з�: news
		p("��ü: " + url2LiSt[1]);	// ��ü: tv
		p("��۱�: " + url2LiSt[2]);	// ��۱�: sbs

	}

}
