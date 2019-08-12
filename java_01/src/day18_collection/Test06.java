package day18_collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test06 {

	public static void main(String[] args) {
		
		Set<Employee> set = new TreeSet<Employee>();
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

	
	
