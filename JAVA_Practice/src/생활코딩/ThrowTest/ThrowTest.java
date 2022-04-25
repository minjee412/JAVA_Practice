package 생활코딩.ThrowTest;

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
//		FileNotFoundException는 생략가능
//		이유 ? IOException안에 FileNotFoundException가 포함 되어 있기 때문에.
		catch (FileNotFoundException e) {
			System.out.println("out.txt 파일이 필요합니다.");;
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
