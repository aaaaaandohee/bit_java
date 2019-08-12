package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Test04 {

	public static void main(String[] args) {
		//Map구조를 이용하여  Employee객체를 관리
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		map.put(2017001, new Employee(2017001, "홍길동", "영업부"));
		map.put(2017002, new Employee(2017002, "김길동", "기술부"));
		map.put(2017003, new Employee(2017003, "이길동", "마케팅부"));
		map.put(2017004, new Employee(2017004, "박길동", "영업부"));
		map.put(2017005, new Employee(2017005, "최길동", "기술부"));
		map.put(2017006, new Employee(2017006, "한길동", "영업부"));
		
		//사원 조회 => 사번을 입력하세요 ex)2017001
		System.out.println("2017001 사번의 사원 조회 결과 ");
		System.out.println(map.get(2017001));
		
		//마케팅부 사원 목록 출력
		System.out.println("마케팅부 사원 목록 출력");
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			Integer num = it.next();
			Employee emp = map.get(num);
			if(emp.dept.equals("마케팅부")) {
				System.out.println(emp);
			}
		}
		
		//사번기준으로 삭제하기 2017006
		System.out.println("2017006 사번의 사원 삭제 (퇴사처리)");
		System.out.println("삭제 정보 : " + map.remove(2017006));
		System.out.println("2017006 사원 정보 => " + map.get(2017006));
		System.out.println("삭제 정보 : " + map.remove(2017006));
		
		
		}
	}







