package sam12;

import java.util.Collections;

class Student implements Comparable<Student> {
	// Comparable�� ���׸��̱� ������ <> �ȿ� Ŭ������ �־������ (���� ���� Ŭ������ ����)
	// Comparable�� ����ϸ� �ؿ� �ݵ�� compareTo �޼ҵ带 Override����� ��.
	private int no;
	private String name;

	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		// ���� Ŭ������ this�� () �ȿ� o�� ���ϴ� �޼ҵ�
		return this.no - o.no;
		// �������� ���� ( �������� : o.no - this.no;)
	}

	@Override
	public String toString() {
		return String.format("�й�: %d, �̸�: %s", no, name);
	}

}
