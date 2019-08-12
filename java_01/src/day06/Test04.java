package day06;

public class Test04 {
	
	public static void main(String[] args) {
		
		
		Employee emp2 = new Employee();
		emp2.setAge(30);
		emp2.setName("홍길동");
		emp2.setDept("인사부");
		emp2.setSingle(false);
		
		Employee emp3 = new Employee();
		emp3.setAge(28);
		emp3.setName("이지원");
		emp3.setDept("영업부");
		emp3.setSingle(true);
		
		Employee emp4 = new Employee();
		emp4.setAge(28);
		emp4.setName("최미카");
		emp4.setDept("영업부");
		emp4.setSingle(true);
		
		Employee emp5 = new Employee();
		emp5.setAge(28);
		emp5.setName("임지빈");
		emp5.setDept("연구부");
		emp5.setSingle(true);
		
		Employee emp6 = new Employee();
		emp6.setAge(26);
		emp6.setName("박소영");
		emp6.setDept("영업부");
		emp6.setSingle(true);
		
		Employee[] emp = {emp2, emp3, emp4, emp5, emp6};
		
		/*
		System.out.println("----------- 영업부에 근무하는 사원 목록 -----------");
		for(Employee data : emp) { 
//			System.out.println(data.getDept()); //부서이름 뽑아냄
			if(data.getDept().equals("영업부")) { //부서이름을 뽑아서 영업부랑 같은 데이터 출력
				data.display();
			}
		}*/
		
		//위 for문 보완. -> null값을 만나도 오류가 나지 않도록 
		System.out.println("----------- 영업부에 근무하는 사원 목록 -----------");
		double sum = 0;
		int count = 0;
		for(int i=0 ; i<emp.length ; i++) {
			if(emp[i].getDept()!=null && emp[i].getDept().equals("영업부")) { //null이면 오류이기 때문에 조건에 "null이 아니고"를 추가해줌
															                //null은 값이기 때문에 equals말고 =,!=로 비교
				sum += emp[i].getAge();
				count++;
				emp[i].display();
				
			}
		}
		System.out.printf("영업부의 평균 나이 : %.2f %n", sum/count);
		
		
		System.out.println("----------- single인 사원 목록 -----------");
		for(int i=0  ; i<emp.length ; i++) {
//			System.out.println(emp[i].isSingle());
			if(emp[i].isSingle()) {
				emp[i].display();
			}
		}
		
		
	}

}
