package day20_properties;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import day19.Employee;

public class Test01 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		
		list.forEach(i -> System.out.println(i));
		System.out.println();
		
		list.removeIf(i -> i%2==0); //조건에 맞는 것 삭제
		list.forEach(i -> System.out.println(i));
		System.out.println("--------------------------");
		
		
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(2017001, "이지원", "영업부"));
		emp.add(new Employee(2017002, "최소연", "인사부"));
		emp.add(new Employee(2017003, "박소영", "개발부"));
		emp.add(new Employee(2017004, "임지빈", "개발부"));
		emp.add(new Employee(2017005, "이은진", "인사부"));
		
		System.out.println(emp.stream().filter(i -> i.getNumber()>2017001).count());
		emp.stream()
		.filter(i -> i.getNumber()>2017001)
		.forEach(i -> System.out.println(i));
		
		
		Employee[] e = {
				new Employee(2017001, "이지원", "영업부"),
				new Employee(2017002, "최소연", "인사부"),
				new Employee(2017003, "박소영", "개발부"),
				new Employee(2017004, "임지빈", "개발부"),
				new Employee(2017005, "이은진", "인사부")
		};
		
		System.out.println("===== Array Stream 처리 =====");
//		Stream.of(e); //e 라는 배열을 스트림으로 만들겠다는 의미
		Stream.of(e).filter(i -> i.getDept().equals("인사부"))
		.forEach(i -> System.out.println(i)); //배열을 스트림으로 바꾼 후 인사부 사원만 추출하여 출력
		
		
		System.out.println();
		Stream.of(e).sorted().forEach(i -> System.out.println(i));
		
		
		System.out.println("=================================================");
		Stream.of(e).sorted(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		}).forEach(i -> System.out.println(i));
		
		//위 sort 람다식 표현
		System.out.println("=============== 람 다 식 =================");
		Stream.of(e)
		.sorted((o1,o2) -> o1.getName().compareTo(o2.getName()))
		.forEach(i -> System.out.println(i));

		
	}

}
