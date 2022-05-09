package sam12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		// List��� ���׸��� <Student>��� Ŭ������ �������� ��
		// (= �������� "Student"��� Ŭ������ ���� List�� ���鲨��)
		List<Student> students = new ArrayList<>();

		// Student s1 = new Student(2,"ȫ�浿");
		// s1.add(s1); �� �����
		students.add(new Student(2, "ȫ�浿2"));
		students.add(new Student(1, "ȫ�浿1"));
		students.add(new Student(3, "ȫ�浿3"));

		// ������ ���� ���, Collections.sort ���
		Collections.sort(students);

		for (Student x : students) {

			System.out.println(x.toString()); // sam12.Student@cac736f
												// sam12.Student@5e265ba4
												// toString �޼ҵ带 Student Ŭ������ @Override ���Ѿ� ��.
												// (toString �޼ҵ� ��) �й�: 2, �̸�: ȫ�浿2
												// (toString �޼ҵ� ��) �й�: 1, �̸�: ȫ�浿1
												// (toString �޼ҵ� ��) �й�: 3, �̸�: ȫ�浿3
												// (Collections.sort ��)�й�: 1, �̸�: ȫ�浿1
												// (Collections.sort ��)�й�: 2, �̸�: ȫ�浿2
												// (Collections.sort ��)�й�: 3, �̸�: ȫ�浿3
		}

	}

}
