package sam09;

public class StringPlus {
	StringBuilder sb = null;
	
	StringPlus(){
		sb = new StringBuilder(32); // ���� StringBuilder��(16) ������ �����ѵ�, ���� ���ڿ��� �ְ� �; (32)�� �� ��쿡�� ?
	}
	
	public void append(String str) {
		sb.append(str);
	}

	@Override
	public String toString() {
		return sb.toString();
	}
	
	// ��Ʈ�������׽�Ʈ���� .line()�� �� �ٿ� ���� ���ؼ��� ? 
	//	public void appendFormat(String format, Object... args) {
	//		sb.append(String.format(format, args));
	//	}
	
	// StringBuilder�� return �ؾ� �Ѵ�.
	public StringPlus appendFormat(String format, Object... args) {
		sb.append(String.format(format, args));
		return this;
	}
	
	
	public StringPlus line() {
		sb.append(System.lineSeparator());
		return this;
	}
	
	
}
