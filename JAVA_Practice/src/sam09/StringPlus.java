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
	
	// 스트링버퍼테스트에서 .line()을 한 줄에 쓰기 위해서는 ? 
	//	public void appendFormat(String format, Object... args) {
	//		sb.append(String.format(format, args));
	//	}
	
	// StringBuilder를 return 해야 한다.
	public StringPlus appendFormat(String format, Object... args) {
		sb.append(String.format(format, args));
		return this;
	}
	
	
	public StringPlus line() {
		sb.append(System.lineSeparator());
		return this;
	}
	
	
}
