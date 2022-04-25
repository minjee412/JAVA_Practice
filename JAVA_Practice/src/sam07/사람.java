package sam07;

public class 사람 {
	public String 이름;
	public int 나이;
	
	public 사람(String 이름, int 나이) {
		this.이름 = 이름;
		this.나이 = 나이;
	}

	@Override
	public String toString() {
		return "이름 : " + 이름 + ", 나이 : " + 나이 ;
	}
}
