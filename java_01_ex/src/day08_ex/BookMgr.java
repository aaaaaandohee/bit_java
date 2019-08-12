package day08_ex;

public class BookMgr {
	
	private Book[] bookList;
	int count = 0; //실질적으로 북 객체가 몇개인지 관리하는 변수
	
	public BookMgr() { 
		this(10); //매개변수 하나인 생성자 함수 호출
	}
	public BookMgr(int size) {
		bookList = new Book[size];
	}
	
	
//	public Book[] getBooklist() {  //null포인트 만나면 오류남. 제공하지않음.
//		return bookList;
//	}
	public void setBooklist(Book[] booklist) {
		this.bookList = booklist;
	}
	
	
	
	public void addBook(Book book) {
		if(count==bookList.length) { //입력데이터가 
			Book[] copy = new Book[bookList.length*2];
			System.arraycopy(bookList, 0, copy, 0, bookList.length);
			bookList = copy;
		}
		bookList[count] = book;
		count++;
	}

	public void printBookList() {
		for(int i=0 ; i<count ;i++) {
			bookList[i].print();
		}
	}
	
	public int printTotalPrice() {
		int sum = 0;
		for(int i=0 ; i<count ; i++) {
			sum += bookList[i].getPrice();
		}
		return sum;
	}
}
