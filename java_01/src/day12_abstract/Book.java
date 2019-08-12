package day12_abstract;

public class Book {
	
	private String title;
	private int price;
	
	
	public Book() {
		super();
	}
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	public Book(int price, String title) {
		super();
		this.title = title;
		this.price = price;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Book 정보 - title:");
		sb.append(title);
		sb.append("/price:");
		sb.append(price);
		
//		return new String(sb); //sb가 스트링이 아니기 때문에 이렇게 이와같이 리턴해야함.
		return sb.toString();  //sb가 스트링이 아니기 때문에 이렇게 이와같이 리턴해야함.
	}
	
	
	@Override
	public boolean equals(Object obj) { //Object는 title,price에 접근할수없기때문에 다운캐스팅 필요.
		boolean flag = false;
		if(obj==null || !(obj instanceof Book)) {
			return false;
		}
		Book data = (Book)obj; //obj Book타입으로 다운캐스팅
		if(price==data.price && title.equals(data.title)) {
			flag = true;
		}
		return flag;
	}
	
	@Override
	protected void finalize() throws Throwable { //객체가 소멸되기 직전에 호출되는 메소드
		//객체가 소멸되기 직전에 호출되는 메소드이지만 자바에서는 사용안하고 별도의 자원반납 기능을 만들어 사용함.
		System.out.println("자원반납코드");
		super.finalize();
	}
	public void close() {
		System.out.println("close() 자원반납코드");
		
	}
	

}
