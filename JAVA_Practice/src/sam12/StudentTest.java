package sam12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		// List라는 제네릭에 <Student>라는 클래스를 선언해준 것
		// (= 내가만은 "Student"라는 클래스에 대한 List를 만들꺼야)
		List<Student> students = new ArrayList<>();

		// Student s1 = new Student(2,"홍길동");
		// s1.add(s1); 의 축약형
		students.add(new Student(2, "홍길동2"));
		students.add(new Student(1, "홍길동1"));
		students.add(new Student(3, "홍길동3"));

		// 정렬을 원할 경우, Collections.sort 사용
		Collections.sort(students);

		for (Student x : students) {

			System.out.println(x.toString()); // sam12.Student@cac736f
												// sam12.Student@5e265ba4
												// toString 메소드를 Student 클래스에 @Override 시켜야 함.
												// (toString 메소드 후) 학번: 2, 이름: 홍길동2
												// (toString 메소드 후) 학번: 1, 이름: 홍길동1
												// (toString 메소드 후) 학번: 3, 이름: 홍길동3
												// (Collections.sort 후)학번: 1, 이름: 홍길동1
												// (Collections.sort 후)학번: 2, 이름: 홍길동2
												// (Collections.sort 후)학번: 3, 이름: 홍길동3
		}

	}

}
