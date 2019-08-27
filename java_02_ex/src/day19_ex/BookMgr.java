package day19_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


public class BookMgr {
	
	List<Book> list = new ArrayList<Book>();
    
	public BookMgr() {
//		list = new LinkedList<Book>();
//		list = new Vector<Book>();
		list = new ArrayList<Book>();
		
	}
	public BookMgr(List<Book> list) {
		this.list = list;
	}

	public void addBook(Book book) {
		list.add(book);
	}
	
	
	public void deleteBook(String title) {
		Iterator<Book> it = list.iterator();
		while(it.hasNext()) {
			Book data = it.next();
			if(data.getTitle().equals(title)) {
				System.out.println(data + " => 삭제 되었습니다.");
				it.remove();
			}
		}
	}
	
	
	public void searchTitleBook(String title) {
		Iterator<Book> it = list.iterator();
		System.out.println(title+" 검색");
		while(it.hasNext()) {
			Book data = it.next();
			if(data.getTitle().toUpperCase().contains(title.toUpperCase())) {
				System.out.println(data);
			}
		}
	}
	
	
	public void bookListPrint() {
		System.out.println("=========Book List ==========");
		list.forEach(i -> System.out.println(i));
		System.out.println("총 " + list.size() + " 권 ");
		System.out.println("=============================");
		}
     
}




