package day18_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
		
		Student[] s = new Student[10];
		Student[] sss = {
				new Student("최소연", 90, 100),
				new Student("임지빈", 50, 90),
				new Student("박소영", 20, 40),
			    new Student("이지원", 10, 10)
		};
		Arrays.sort(sss);
		
		//***ArrayList***
		
		List<Student> list = new ArrayList<Student>(); //내부에 Student[]를 만들어서 관리해줌.
		list.add(new Student("최소연", 90, 100));
		list.add(new Student("임지빈", 50, 90));
		list.add(new Student("박소영", 20, 40));
		list.add(new Student("이지원", 10, 10));
		
//		System.out.println(list);
		
		Iterator<Student> is = list.iterator();
		while(is.hasNext()) {
			Student data = is.next();
			if(data.getAvg()>=90)   System.out.println(data);
		}
		
		System.out.println(list.contains(new Student("이지원", 10, 10))); 
		//비교하기 위해서는 내부적으로 equals메소드 필요. 오버라이딩 해야함
		
		//C U R D -> CREAT UPDATE READ DELETE
		
		//홍길동 90 90 등록
		Student s1 = new Student("홍길동", 90, 90);
		boolean flag = list.add(s1);
		
		if(flag) System.out.println(s1 + " 등록 되었습니다.");
		else System.out.println(s1 + " 등록 실패");
		
		//홍길동 성적 100 100 수정
		is = list.iterator(); //iterator는 한 번 쓰면 다시 생성명령 해줘야함.
		while(is.hasNext()) {
			Student data = is.next();
			if(data.getName().equals("홍길동")) {
				data.setKo(100);
				data.setMath(100);
				data.setAvg();
				System.out.println(data + " 수정 되었습니다.");
			}
		}
		
		//s1 삭제
		System.out.println(" ===== 학생 " + s1 + "삭제 ===== ");
		is = list.iterator();
		while(is.hasNext()) {
			Student data = is.next();
			if(data.equals(s1)) {
				is.remove();
				System.out.println(s1 + " 삭제 되었습니다.");
			}
		}
				
			
		Collections.sort(list);
		
		//List 목록 출력
		System.out.println("===== Studen List =====");
		is = list.iterator();
		while(is.hasNext()) {
			Student data = is.next();
			System.out.println(data);
		}
	}

}



class Student extends Object implements Comparable<Student>{ //implements Comparable<Student> => 정렬가능하게 하기 위함.
	String name;
	int ko;
	int math;
	double avg;
	
	
	public Student() {	}
	public Student(String name, int ko, int math) {
		this.name = name;
		this.ko = ko;
		this.math = math;
		setAvg();
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKo() {
		return ko;
	}
	public void setKo(int ko) {
		this.ko = ko;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = (ko+math)/2.;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", ko=" + ko + ", math=" + math + ", avg=" + avg + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(avg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ko;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(avg) != Double.doubleToLongBits(other.avg))
			return false;
		if (ko != other.ko)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Student o) {
//		return (int)(o.avg-avg); //avg기준 정렬. 내림차순.
		return name.compareTo(o.name); //이름으로비교하여 정렬
	}
	
	
	
	
	
	
}