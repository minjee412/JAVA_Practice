package ObjectŬ����;

class Cal{
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
	
	public String toString() {
		return "left: " + this.left + ", right: " + this.right;
	}
}

public class CalDemo {

	public static void main(String[] args) {
		Cal c1 = new Cal();
		c1.setOprands(10, 20);
//		System.out.println(c1); 	// ObjectŬ����.Cal@379619aa
		System.out.println(c1.toString()); 		// (toString() �޼ҵ� ���� ��) left: 10, right: 20
		System.out.println(c1); 	// (toString() �޼ҵ� ���� ��) left: 10, right: 20


	}

}
