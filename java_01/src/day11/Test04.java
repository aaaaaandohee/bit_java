package day11;

public class Test04 {

	public static void main(String[] args) {
		String msg1 = "hello";
		String msg2 = "hello";
		System.out.println(msg1); //  msg1만 넣어도 msg1.toString() 으로 자동으로 바뀌어서 처리됨. String클래스는 이미 toString이 오버라이딩되어있음.
		System.out.println(msg2);
		
		
		Book b1 = new Book("Java", 700);
		Book b2 = new Book("Java", 700);
		System.out.println(b1); //그냥 찍으면 주소가 뜨기때문에 toString() 오버라이딩 사용
		System.out.println(b2);
	}

}


class Book extends Object{
	String title;
	int price;
	
	
	public Book() {	}
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "[제목:"+title+"/가격:"+price+"]";
	}
	
	
	
}