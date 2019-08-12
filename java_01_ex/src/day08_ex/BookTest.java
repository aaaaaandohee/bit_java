package day08_ex;

import java.util.Arrays;

public class BookTest {

	public static void main(String[] args) {
		BookMgr mgr = new BookMgr(5); //객체생성
		mgr.addBook(new Book("java",10000));
		mgr.addBook(new Book("db",30000));
		mgr.addBook(new Book("sql",35000));
		mgr.addBook(new Book("html5",20000));
		mgr.addBook(new Book("jsp",15000));
		mgr.addBook(new Book("dd",30000));
		
		mgr.printBookList();
		System.out.println("합계 : " + mgr.printTotalPrice());
		
		
//		System.out.println(Arrays.toString(mgr.getBooklist()));
		
		
	}

}
