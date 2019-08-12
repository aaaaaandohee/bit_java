package day10_ex;

public class PersonTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("홍길동", 20, 200201);
		s1.print();
		
		Teacher t1 = new Teacher("이순신", 30, "JAVA");
		t1.print();
		
		Employee e1 = new Employee("유관순", 40, "교무과");
		e1.print();
	}

}
