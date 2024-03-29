package day20_properties;

import java.util.Iterator;
import java.util.Properties;

public class Test02 {

	public static void main(String[] args) {
		Properties p = new Properties();
		p.setProperty("java01", "1234");
		p.setProperty("java02", "1234");
		p.setProperty("java03", "1234");
		p.setProperty("java04", "1234");
		p.setProperty("java05", "1234");
		p.setProperty("java06", "1234");
		p.setProperty("java07", "1234");
		
		System.out.println(p.getProperty("java01"));
		
		Iterator it = p.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next(); //it가 Object형태로 나오기 때문에 String으로 형변환.
			System.out.println(key + " : " + p.getProperty(key));
		}
		
	}

}
