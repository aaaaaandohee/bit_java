package day09;

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
		System.out.println("==========Book List=========");
		for(int i=0 ; i<count ;i++) {
			System.out.printf("%d. ",i+1);
			bookList[i].print();
		}
		System.out.println("   총 " + count + "권");
		System.out.println("============================");
	}

	
	public void deleteBook(String title) {
		for(int i=0 ; i<count ; i++) {
			if(bookList[i].getTitle().equals(title)) {
				System.arraycopy(bookList, i+1, bookList, i, count-i-1);
				count--;
				System.out.println(title + " 삭제되었습니다.");
				return;
			}
		}
		System.out.println(title + " 도서가 없습니다.");
	}
	
	public void searchBook(String title) {
		System.out.println(title + " 검색 결과");
		    for(Book data : bookList){
		    	if(data==null) return; //중간에 널이 없다는 보장이 있을 때 널을 만나면 리턴하게 하여 종료.
		        if(data.getTitle().toUpperCase().contains(title.toUpperCase())){
		        	//데이터가 널이면 오류가 발생하기 때문에 널이 아니라는 조건포함
		        	//리스트의 제목과 검색키워드를 모두 대문자로 바꿔서 비교하여 검색
		        	data.print();
		        }
		    }
		    
		    
	}
	
	
}
