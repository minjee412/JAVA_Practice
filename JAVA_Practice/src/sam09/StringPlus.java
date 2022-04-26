package sam09;

public class StringPlus {
	StringBuilder sb = null;
	
	StringPlus(){
		sb = new StringBuilder(32); // 원래 StringBuilder는(16) 까지만 가능한데, 많은 문자열을 넣고 싶어서 (32)로 할 경우에는 ?
	}
	
	public void append(String str) {
		sb.append(str);
	}

	@Override
	public String toString() {
		return sb.toString();
	}
	
	
}
