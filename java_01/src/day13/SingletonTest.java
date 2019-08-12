package day13;

public class SingletonTest {

	public static void main(String[] args) {
		
//		Singleton s1 = new singleton(); // 불가능. 생성자 singleton()가 b private이기 때문.
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
	}

}


class Singleton{
	
	private static Singleton s = new Singleton(); //외부에서 객체를 같이 사용하기 위해 static선언.
	
	private Singleton(){  //생성자가 private 이기 때문에 외부에서 객체 생성 불가. 이 클래스에서 생성해서 넘겨줘야함 
		System.out.println("Singleton() 생성");
	}	
	
	public static Singleton getInstance() { //Singleton객체를 리턴해주는 메소드. static으로 해서 호출해서 사용가능하게 함.
		if(s==null) s = new Singleton();
		return s; //호출할때마다 이미 생성해놓은 s 리턴
	}
}