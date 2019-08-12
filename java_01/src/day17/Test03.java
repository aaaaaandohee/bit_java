package day17;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class Test03 {

	public static void main(String[] args) {
		
//		List list = new ArrayList(); //Object[] 로 관리됨. 
		List list = new Vector();  //Object[] 로 관리됨.
		list.add("hello");
		list.add("java");
		list.add(200);
		list.add(new Date());
		list.add(new Book("spring", 20000));
		
		System.out.println(list);
		
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(list.get(i)); //다 Object
		}
		
		
	}

}
