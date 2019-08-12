package day06;

public class Employee {
	//클래스의 구성 요소 : 데이터(변수) + 기능(메소드)
	
	private String name;  //접근 지정자가 default - 같은 패키지에서만 접근 가능. public은 모든 접근 허용.다른 패키지 접근도 허용.
	private String dept;  //접근지정자 private는 해당 객체(클래스)안에서만 사용가능
	private int age;  //201901
	
	private boolean single;
	
	public void display() { //return뒤에 값을 가지고 가지않고 그냥 돌아가는 것이 void 
		
		System.out.printf("[나이:%-5d, 이름:%-5s, 부서:%-5s, 싱글:%-5b]%n",this.age, this.name, this.dept, this.single); //%-10d 이렇게 -붙이면 왼쪽정렬
		                                                              //이 부분의 this. 생략가능
		                                                              //this. 를 붙이는게 좀 더 정확한 주소 의미
//		System.out.printf("[나이:%-5d, 이름:%-5s, 부서:%-5s, 싱글:%-5b]%n",this.getAge(), this.getName(), this.getDept(), this.isSingle());
		                                                                
		return;
	}
	
	public void setName(String name) {
		this.name = name;
		return;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if(!(age>0 && age<=100)) {
			System.out.println("age(나이) 정보가 올바르지 않습니다.");
			return; //나이정보가 올바르지않으면 이곳에서 setAge함수 종료
		}
		this.age = age; //로컬변수this.age = 지역변수 int age
		//멤버변수임을 명시하기 위해서 this. 붙임
		return; //리턴될 타입이 없는 것이 void
	}
	public int getAge() {
		return age;
	}
	
	
	public void setDept(String dept) {
		this.dept = dept;
		return;
	}
	public String getDept() {
		return dept;
	}

	public boolean isSingle() {
		return single;
	}

	public void setSingle(boolean single) {
		this.single = single;
	}
	
	
}
