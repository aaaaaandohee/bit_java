package day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Test07_foreach {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(2017001, "홍길동", "영업부"));
		list.add(new Employee(2017002, "이지원", "인사부"));
		list.add(new Employee(2017003, "임지빈", "영업부"));
		list.add(new Employee(2017005, "박소영", "영업부"));
		list.add(new Employee(2018005, "으헤헤", "개발부"));
		list.add(new Employee(2018001, "꾸에엥", "개발부"));
		
		
		//iterator 기반 목록 출력
		System.out.println(" ===== Iterator 기반 목록 출력 ===== ");
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			Employee data = it.next();
			System.out.println(data);
		}
		System.out.println();
		
		
		//foreach 기반 목록 출력
		System.out.println(" ===== foreach 기반 목록 출력 ===== ");
		list.forEach(new Consumer<Employee>() { //Comsumer를 implements한 익명클래스. 제네릭 Employee
			@Override
			public void accept(Employee t) {
				System.out.println(t);
			}
		});
		System.out.println();
		
		
		//foreach 람다로 표현
		System.out.println(" ===== foreach 람다로 표현하여 출력 ===== "); //위 코드 그대로 가져와서 수정함.
		list.forEach(
			(Employee t) -> {
				System.out.println(t);
			}
		);
		
		System.out.println();
		
		
		//foreach 람다로 표현 2
		System.out.println(" ===== foreach 람다로 표현하여 출력  2 ===== "); //위 코드 그대로 가져와서 수정함.
		list.forEach( t -> System.out.println(t) ); //foreach로 list 루프 돌면서 출력.
		
		System.out.println();
		
		
		//foreach 람다로 표현 3
		System.out.println(" ===== foreach 람다로 표현하여 출력 3 ===== "); //위 코드 그대로 가져와서 수정함.
		list.forEach(System.out::println); //foreach로 list 루프 돌면서 출력.
		
		
		
		
	}

}
