package sam12;

import java.util.Collections;

class Student implements Comparable<Student> {
	// Comparable은 제네릭이기 때문에 <> 안에 클래스를 넣어줘야함 (내가 만든 클래스도 가능)
	// Comparable을 사용하면 밑에 반드시 compareTo 메소드를 Override해줘야 함.
	private int no;
	private String name;

	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		// 현재 클래서의 this와 () 안에 o를 비교하는 메소드
		return this.no - o.no;
		// 오름차순 정렬 ( 내림차순 : o.no - this.no;)
	}

	@Override
	public String toString() {
		return String.format("학번: %d, 이름: %s", no, name);
	}

}
