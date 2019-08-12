package day08;

public class Test02 {

	public static void main(String[] args) {
		
		Student[] students = {
				new Student("홍길동",2019001,90,80,10),
				new Student("최길동",2019002,100,80,99),
				new Student("김길동",2019003,90,80,20),
				new Student("박길동",2019004,90,50,80),
				new Student("이길동",2019005,20,10,20),
		};
		
		for(Student data: students) {
			if(data.getGrade()=='F')
				data.print();
		}
		
		
		
//		Student s = new Student("홍길동",2019001,90,80,80); // 한명일 경우 이렇게 정보 입력. 여러명일 경우 배열 사용.
//		s.setGradeProcess();
//		s.print();
		
		
	}

}
	
class Student { //아래data들을 묶어서 클래스 만듬 -> 클래스도 data
	
	private String name;
	private int number;
	private int kor;
	private int eng;
	private int math;
	private char grade;
	
	
	public Student() {	}
	public Student(String name, int number, int kor, int eng, int math) {
		this.name = name;
		this.number = number;
//		this.kor = kor;
		this.setKor(kor); //set 메소드를 이용해야 유효성 검증한 데이터를 받을 수 있음.
//		this.eng = eng;
		this.setEng(eng);
//		this.math = math;
		this.setMath(math);
//		setGradeProcess();
	}
	public Student(String data) {
		
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if(!checkJumsu(kor)) return;
		this.kor = kor;
	}
	

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if(!checkJumsu(eng)) return;
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if(!checkJumsu(math)) return;
		this.math = math;
	}

	public char getGrade() {
		this.setGradeProcess(); //getGrade를 호출해야 setGradeProcess작동
		return grade;
	}

	private void setGradeProcess() {
		double avg = (kor+eng+math)/3.;
		this.grade = avg>=90 ? 'A' : (avg>=80 ? 'B' : (avg>=70 ? 'C' : (avg>=60 ? 'D' : 'F')));
	}

	public void print() {
		System.out.printf("%s, %.2f, %c %n",name, (kor+eng+math)/3., this.getGrade());
	}
	
	private boolean checkJumsu(int num){
		boolean flag = true;
		
		if(!(num>=0 && num<=100)) {
			System.out.println(num+" => 점수가 유효하지 않습니다.");
			flag = false;
		} 
		return flag;
		
	}
}
	

