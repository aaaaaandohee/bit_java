package day21_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;


public class BookMgr2 {
	
	Map<Integer,Book> map = null;
    
	public BookMgr2() {
		map = new HashMap<Integer,Book>();
		
	}

	public void addBook(Book book) {
		map.put(book.getIsbn(),book);
	}
	
	
	public void deleteBook(String title) {
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			Integer isbn = it.next();
			Book data = map.get(isbn);
			if(data.getTitle().equals(title)) {
				System.out.println(data + "삭제됩니다.");
				it.remove();
			}
		}
	}
	
	
	public String searchTitleBook(String title) {
		System.out.println(title+" 검색");
		Iterator<Integer> it = map.keySet().iterator();
		String s = null;
		while(it.hasNext()) {
			Integer isbn = it.next();
			Book data = map.get(isbn);
			if(data.getTitle().toUpperCase().contains(title.toUpperCase())) {
				s += (data+"\n");
			}
		}
		return s;
	}
	
	
	public String bookListPrint() {
//		System.out.println("=========Book List ==========");
//		list.forEach(i -> System.out.println(i)); //list의 forEach 람다식
		
//		map.forEach((k, v) -> System.out.println(v)); //map의 forEach 람다식
		Iterator<Integer> it = map.keySet().iterator();
		String s = null;
		while(it.hasNext()) {
			Integer isbn = it.next();
			Book data = map.get(isbn);
				s += (data+"\n");
		}
		return s;
//		System.out.println("총 " + map.size() + " 권 ");
//		System.out.println("=============================");
		}
     
}




