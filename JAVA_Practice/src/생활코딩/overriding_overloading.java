package 생활코딩;

// overloading : 과적하다라는 의미, 상속과는 상관 없다. 메소드의 이름이 같더라도 형태만 다르면 사용가능하다.
// overriding : 부모 클래스에 올라타서 덮어쓰고 재정의한다.  Parent Class와 Child Class 내 동일한 Method가 있을 경우 
//				상속받은 Parent Class 에 있는 Method 는 실행이 안되고 자신의 Class에 있는 method 가 실행되는 것
class Cal{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	
	//	Overloading (부모클래스에 있던 자식 클래스에 있던 상관 없다. 그래서 상속과는 상관 없다.)
	public int sum(int v1, int v2, int v3) {
		return v1+v2+v3;
	}
}

class Cal3 extends Cal{
	public int minus(int v1, int v2){
	return v1-v2;
	}
	
	//	Overriding
	public int sum(int v1, int v2) {
		System.out.println("Cal3!!");
		return v1+v2;
	}
	
	public int sum(int v1, int v2, int v3) {
		return v1+v2+v3;
	}
}

public class overriding_overloading {

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(2, 1));
		System.out.println(c.sum(2, 1, 1));		
		
		Cal3 c3 = new Cal3();
		System.out.println(c3.sum(2, 1));
		System.out.println(c3.minus(2, 1));
		System.out.println(c3.sum(2, 1));
		System.out.println(c3.minus(2, 1));
	}
}
