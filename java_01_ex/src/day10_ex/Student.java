package day10_ex;

public class Student extends Person{
	
	private int id;
	

	public Student() {	}
	public Student(int id) {
		super();
		this.id = id;
	}
	public Student(String name, int age, int id) {
		super(name,age);
		this.id = id;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void print() {
		System.out.printf("이  름 : %-6s 나  이 : %-6s 학      번 : %-6s%n",
				super.getName(),super.getAge(),id);
	}

}
