package sam06;

public class �����׽�Ʈ {
	
	public static void method(int i , int j) throws Exception {
		
//	�� ���� ������ ���� ���� if�� �ȿ� ���ܰ� �Ǵ� ��Ȳ�� if ������
//	  ���� ���� throw���� ������. (���ܸ� ���� ���� ���� ģ��.)
		if(j == 0) {
			throw new Exception("0���� ������ �����ϴ�.");
		}
//	====================================================
		
//	�� ArithmeticException ���� �߻� ======
		int k = i / j;
		System.out.println(k);
	}
//	====================================

	public static void main(String[] args) {
		try {
			method(1, 0);
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
