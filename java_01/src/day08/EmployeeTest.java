package day08;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();  //기본생성자함수 수행
//		emp1.setName("홍길동");
//		emp1.setDept("인사부");
//		emp1.setSingle(true);
		emp1.print();
		
		Employee emp2 = new Employee("고길동","영업부",false);  //파라미터 3개값 넘겨받는 생성자함수 수행
		emp2.print(); 
		
		Employee emp3 = new Employee("김길동","영업부"); //파라미터 2개값 넘겨받는 생성자함수 수행
		emp3.print();
		
		Employee emp4 = new Employee("최길동","기술부",false);
		emp4.print();
	}

}
