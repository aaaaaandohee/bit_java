package day06;

public class Test03 {

	public static void main(String[] args) {
		
//		int num;
//		String name;
		
		Employee emp1 = new Employee(); //객체생성 (instance=object)
//		System.out.println(emp1.number + " : " + emp1.name + " : " + emp1.dept);
		emp1.display();
		
		Employee emp2 = new Employee();
//		emp2.age = 201901;
		emp2.setAge(30);
//		emp2.name = "홍길동";
		emp2.setName("홍길동");
//		emp2.dept = "인사부";
		emp2.setDept("인사부");
		emp2.setSingle(false);
//		System.out.println(emp2.number + " : " + emp2.name + " : " + emp2.dept);
		emp2.display();
		
		Employee emp3 = new Employee();
//		emp3.age = 201902;
		emp3.setAge(28);
//		emp3.name = "이지원";
		emp3.setName("이지원");
//		emp3.dept = "영업부";
		emp3.setDept("영업부");
		emp3.setSingle(true);
//		System.out.println(emp3.number + " : " + emp3.name + " : " + emp3.dept);
		emp3.display();
	}

}
