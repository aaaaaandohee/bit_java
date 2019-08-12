package day06_ex;

public class AnimalTest {
	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.setAge(3);
		a.setName("큰뿔소");
		a.setLive(true);
		a.print();
		
		System.out.printf("[이름:%-5s, 생존여부:%-5b]%n",a.getName(), a.isLive()); 
			
		
		
		a.setName("펭귄");
		System.out.printf("[이름:%-5s, 생존여부:%-5b]%n",a.getName(), a.isLive()); 
	}

	
}
