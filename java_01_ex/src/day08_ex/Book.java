package day08_ex;

public class Book {
	
	private String title;
	private int price;
	
	
	public Book() {	}
	public Book(String title, int price) {
		
		this.setTitle(title);
		this.setPrice(price);
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
	
	public void print() {
		System.out.printf("Book[ %-6s : %-6d] %n", title,price);
	}
	

}
