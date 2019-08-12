package day12_abstract;

public class BookTest {

	public static void main(String[] args) {
		String msg1 = "hello";
		String msg2 = "hello";
		System.out.println(msg1.toString());
		System.out.println(msg1.equals(msg2));
		System.out.println(msg2);
		
		
		Book b1 = new Book("java", 2200);
		Book b2 = new Book("java", 2200);
		System.out.println(b1.toString()); //타이틀과 가격이 뜨게하려면 String의 toString을 오버라이딩처리해줘야함.
		System.out.println(b1.equals(b2)); //equals 오버라이딩 해야함
		System.out.println(b2);
		
		b1.close();
		b2.close();
		b1 = null;
		b2 = null;
		
		System.gc();
		
		System.out.println("==== main end====");
		
	}

}
