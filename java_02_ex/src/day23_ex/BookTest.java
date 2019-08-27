package day23_ex;

public class BookTest {

	public static void main(String[] args) {
		
		BookMgr bookMgr = new BookMgr();
		
//		bookMgr.add(new Book("java", 9000));
//		bookMgr.add(new Book("jsp", 2000));
//		bookMgr.add(new Book("db", 25000));
//		bookMgr.add(new Book("dd", 2700));
//		
//		bookMgr.save();
		
		bookMgr.getBookList().forEach(i -> System.out.println(i));
//		
//		bookMgr.add(new Book("~!~!~!", 0));
		
//		bookMgr.save();
	}

}
