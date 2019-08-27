package day21_book_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;



public class BookMgr implements Serializable{
	
	List<Book> list = new ArrayList<Book>();
    
	public BookMgr() {
		list = new ArrayList<Book>();
		
	}
	public BookMgr(List<Book> list) {
		this.list = list;
	}

	public boolean addBook(Book book) {
		return list.add(book);
	}
	
	
	public boolean deleteBook(String title) {
		Iterator<Book> it = list.iterator();
		while(it.hasNext()) {
			Book data = it.next();
			if(data.getTitle().equals(title)) {
				it.remove();
				return true;
			}
		}
		return false;
	}
	
	
	public List<Book> searchTitleBook(String title) {
		List<Book> slist = new ArrayList<Book>();
		Iterator<Book> it = list.iterator();
		while(it.hasNext()) {
			Book data = it.next();
			if(data.getTitle().toUpperCase().contains(title.toUpperCase())) {
				slist.add(data);
			}
		}
		return slist;
	}
	
	
	public List<Book> bookList() {
		return list;
		}
	
	
	public void save() {
		
		String fileName = "book.book";
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(fileName);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
			oos.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) oos.close();
				if(fos != null) fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
		
	
	public List<Book> load() {
		
		String fileName = "book.book";
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		List<Book> slist = null;
		
		try {
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);
			
			slist = (List<Book>)ois.readObject();
			list = slist;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois != null) ois.close();
				if(fis != null) fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return slist;
	}
	
     
}




