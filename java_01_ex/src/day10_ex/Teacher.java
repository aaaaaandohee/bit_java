package day10_ex;

public class Teacher extends Person {
	
	private String subject;
	
	
	

	public Teacher() {	}
	public Teacher(String subject) {
		super();
		this.subject = subject;
	}
	public Teacher(String name, int age, String subject) {
		super(name,age);
		this.subject = subject;
	}
	

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	public void print() {
		System.out.printf("이  름 : %-6s 나  이 : %-6s 담당과목 : %-6s%n",
				super.getName(),super.getAge(),subject);
	}
	

}
