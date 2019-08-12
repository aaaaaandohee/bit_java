package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test02 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("java01", "1234");
		map.put("java02", "1234");
		map.put("admin", "admin");
		
		for(int i=0 ; i<30 ;i++) {
			map.put("test"+i, (int)(Math.random()*3)+"aa");
		}
		System.out.println(map);
		
		System.out.println("admin => pw ?  " + map.get("admin"));
		System.out.println("java01 => pw ?  " + map.get("java01"));
		System.out.println("java09 => pw ?  " + map.get("java09")); // 해당 키값이 존재하지 않으면 null이 나옴
		
		System.out.println("test1 => pw ?  " + map.get("test1"));
		System.out.println("===============================");
		
		Set<String> keynames = map.keySet(); //key값만 뽑아서 set구조로 리턴해줌.
		Iterator<String> it = keynames.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("ID : " + key + " / PW : " + map.get(key));
		}
		
		
	}

}
