package day23_ex;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class BookMgr {
	//Book[] 관리
	List<Book> list = new ArrayList<Book>(); //List에서 Book[] 관리
	String fileName;
	
	BookMgr(){
		this("book.dat");
	}
	BookMgr(String fileName){
		this.fileName = fileName;
		list = (List<Book>) MyFile.load(fileName);
		if(list==null) {
			list = new ArrayList<Book>();
		}
		Thread t1 = new AutoSave();
		t1.start();
	}
	
	//CURD
	public void add(Book data) {
		list.add(data);
	}
	
	public List<Book> getBookList() {
		return list;
	}
	
	
	
	
	
	
	public void save() {
		MyFile.save(fileName, list);
	}
	
	class AutoSave extends Thread{
		
		public void run() {
			while (true) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				save();
				System.out.println("auto save ");
			}
		}
	}
}
