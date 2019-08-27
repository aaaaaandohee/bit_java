package day21_ex;

public class Book extends Object implements Comparable<Book>{
    private String title;
    private String price;
    private int isbn;
    
    public Book() {   }
	public Book(int isbn, String title, String price) {
		this.title = title;
		this.price = price;
		this.isbn = isbn;
	}

	
	public int getIsbn() {
		return isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void print() {
		System.out.println("Book [isbn=" + isbn + ", title=" + title + ", price=" + price + "]");
	}
	
	
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + isbn;
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn != other.isbn)
			return false;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public int compareTo(Book o) {
		return isbn - o.isbn;
	}
	
	
	
	
}
