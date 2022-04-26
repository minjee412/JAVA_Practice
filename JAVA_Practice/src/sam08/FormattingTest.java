package sam08;

public class FormattingTest {

	public static void main(String[] args) {
		String name = "홍길동";
		int age = 24;
		double weight = 80.1;
		
		// 기본적인 방법
		System.out.println("이름: " + name + ", 나이: " + age + ", 뭄무게: " + weight);	// 이름 : 홍길동, 나이 : 24, 뭄무게 : 80.1

		// format()
		System.out.println(String.format("이름: %s, 나이: %d, 몸무게: %.2f", name, age, weight));
		//	%s : String 형 , %d : double 형 , %.2f : (소수짐 아래 2자리 까지) 실수형 
		// 이름: 홍길동, 나이: 24, 몸무게: 80.10
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           

	}

}
