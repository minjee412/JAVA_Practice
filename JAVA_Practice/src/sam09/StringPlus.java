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
	
	
}
