package sam10;

public class �޽��׽�Ʈ {
	
	public static void main(String[] args) {
		
		double d1 = 12.426;
		// �Ҽ��� 2°�ڸ����� ǥ�� �ϱ� ���ؼ�
		// �ø�, �ݿø�, ���� ���
		// 12.43
		// 12.43
		// 12.42
		
		System.out.println(d1); 	// 12.426
		System.out.println(Math.round(d1)); 	// 12 (�ݿø�)
		System.out.println(Math.ceil(d1)); 		// 13.0 (�ø�)
		System.out.println(Math.floor(d1)); 	// 12.0 (����)
		
		System.out.println("----------------");
			
		System.out.println(SmartMath.round(d1, 2)); 	// (want) 12.43 , (real) 12.43
		System.out.println(SmartMath.ceil(d1, 2)); 		// (want) 12.43 , (real) 12.43
		System.out.println(SmartMath.floor(d1, 2)); 	// (want) 12.42 , (real) 12.42
		
		System.out.println("----------------");

		double x1 = 0;
		double y1 = 0;
		double x2 = 3;
		double y2 = 4;
		
		System.out.println(SmartMath.distance(x1, y1, x2, y2)); 	// 5.0
				
	}
}
