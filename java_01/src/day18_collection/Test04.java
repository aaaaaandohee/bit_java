package day18_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test04 {

	public static void main(String[] args) {
		
		Set<Employee> set = new HashSet<Employee>();
		set.add(new Employee(2017001, "홍길동", "영업부"));
		set.add(new Employee(2017002, "이지원", "인사부"));
		set.add(new Employee(2017003, "임지빈", "영업부"));
		set.add(new Employee(2017005, "박소영", "영업부"));
		
		boolean flag = set.add(new Employee(2017006, "홍길동", "영업부"));
		if(!flag) System.out.println("이미 존재하는 데이터입니다.");
		
		flag = set.add(new Employee(2017004, "최소연", "기술부"));
		if(flag) System.out.println("등록되었습니다.");
		
		//set목록출력
		System.out.println(" ========== 사 원 목 록 ========== ");
		Iterator<Employee> ie = set.iterator();
		while(ie.hasNext()) {
			Employee data = ie.next();
			System.out.println(data);
		}
		
		//2017003 사번의 사원을 검색 출력하세요.
		ie = set.iterator();
		System.out.println(" [ 2017003 ] 검 색 결 과  ");
		while(ie.hasNext()) {
			Employee data = ie.next();
			if(data.number == 2017003) {
				System.out.println(data);
			}
		}
		
	}

}


class Employee implements Comparable<Employee>{
	
	int number;
	String name;
	String dept;
	
	public Employee() { }
	public Employee(int number, String name, String dept) {
		this.number = number;
		this.name = name;
		this.dept = dept;
	}
	
	
	@Override
	public String toString() {
		return "Employee [number=" + number + ", name=" + name + ", dept=" + dept + "]";
	}
	
	//number로 같은지 중복체크. => 만들 때 number만 체크.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
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
		Employee other = (Employee) obj;
		if (number != other.number)
			return false;
		return true;
	}
	@Override
	public int compareTo(Employee o) {
		return number-o.number;
	}
	
	
}