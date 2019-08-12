package day08;

/**
 * 
 * @author adh
 * @since 2019.07.16
 * @version 1.0
 *
 */
public class Employee {
	static String cName = "BIT";
	private String name;
	private String dept;
	private boolean single;
	
	public Employee() { //생성자함수 - 클래스명과 이름이 같고, 리턴타입을 정의하지 않는다.
		//주로 초기화 작업을 담당
//		System.out.println("Employee() call");
//		name = "사원이름";
//		dept = "ㅇㅇㅇ부서";
//		single = true;
		this("안도희","ㅇㅇㅇ부서",true); // **나의 또다른 생성자 함수 호출**
	}
	
	public Employee(String name, String dept, boolean single) { //생성자함수 - 클래스명과 이름이 같고, 리턴타입을 정의하지 않는다.
		//주로 초기화 작업을 담당
		super(); //first statement 에만 허용
//		System.out.printf("Employee(%s, %s, %s) call%n", name, dept, single);
		this.name = name;  //넘겨받은 값을 멤버변수에 셋팅
		this.dept = dept;
		this.single = single;
	}
	
	public Employee(String name, String dept) { //생성자함수 - 클래스명과 이름이 같고, 리턴타입을 정의하지 않는다.
		//주로 초기화 작업을 담당
//		System.out.printf("Employee(%s, %s) call%n", name, dept);
//		this.name = name;  //넘겨받은 값을 멤버변수에 셋팅
//		this.dept = dept;
		this(name,dept,false);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public boolean isSingle() {
		return single;
	}
	
	/**
	 * 
	 * @param single 미혼이면 true 기혼이면 false
	 * 	 
	 */
	public void setSingle(boolean single) {
		this.single = single;
	}
	
	/**
	 * Employee 정보 출력
	 */
	public void print() { //static 붙이면 에러남. instance자원에 접근하고 있기 때문에.
		System.out.printf("[사원명 :%-8s 부서 :%-8s 싱글 :%-8b]%n",name, dept,single);
//		System.out.println("회사명 : " +cName);
	}
	

}
