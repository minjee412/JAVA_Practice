package ��Ȱ�ڵ�.ThrowTest;

import java.io.*;

class Second{
	void run() throws FileNotFoundException, IOException {
		BufferedReader bReader = null;
        String input = null;
        
        	bReader = new BufferedReader(new FileReader("out.txt"));
        
        	input = bReader.readLine();
        
        System.out.println(input);
	}
}

class Third{
	void run() throws FileNotFoundException, IOException {
		Second b = new Second();
		b.run();
	}
}

public class ThrowTest {

	public static void main(String[] args) {
		Third c = new Third();
		try {
			c.run();
		}
//		FileNotFoundException�� ��������
//		���� ? IOException�ȿ� FileNotFoundException�� ���� �Ǿ� �ֱ� ������.
		catch (FileNotFoundException e) {
			System.out.println("out.txt ������ �ʿ��մϴ�.");;
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
