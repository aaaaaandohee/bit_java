package day06_ex;

public class Animal {
	
	boolean live;
	int age;
	String name;
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void print() {
		System.out.printf("[이름:%-5s, 나이:%-5s, 생존여부:%-5b]%n",getName(), getAge(), isLive());
	}
	
	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.setAge(3);      // instance method - 주소가 있어야만 호출할 수 있는 메소드
		a.name="큰뿔소";    // instance variable - 주소가 있어야지만 호출할 수 있는 변수
		a.setLive(true);
		a.print();
		
		System.out.printf("[이름:%-5s, 생존여부:%-5b]%n",a.getName(), a.isLive()); 
			
		
		
		a.setName("펭귄");
		System.out.printf("[이름:%-5s, 생존여부:%-5b]%n",a.getName(), a.isLive()); 
	}
	
	

}
