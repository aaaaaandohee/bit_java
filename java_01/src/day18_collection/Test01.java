package day18_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		
		String[] names1 = {"이순신","김순신","한순신","강순신","박순신"};
		System.out.println(Arrays.toString(names1));
		Arrays.sort(names1); //배열 sort
		System.out.println(Arrays.toString(names1));
		
		System.out.println("=================================================");
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이길동");
		list.add("김길동");
		list.add("박길동");
		list.add("최길동");
		list.add("한길동");
		list.add("우길동");
		list.add("신길동");
		
		System.out.println(list);  //list.toString으로 호출됨.
		Collections.sort(list); //Collection sort 수행
		//Collections => list를 관리하는 클래스
		System.out.println(list);
		
		List<String> list2 = new ArrayList<String>(list.subList(1, 4));
		System.out.println(list2);
		
		Object[] obj = list.toArray();
		System.out.println("obj => " + Arrays.toString(obj)); //Object[] type
		
		String[] obj2 = new String[list.size()];
		list.toArray(obj2);
		System.out.println("obj2 => " + Arrays.toString(obj2)); //String[] type
		
		String[] sss = {"111","999","444","888"};
		List<String> sslist = new ArrayList<String>(Arrays.asList(sss)); //배열을 리스트로 컨버팅해줌
		System.out.println(sslist);
		
		
		System.out.println(" ==========   list   다루기     ========== ");
		System.out.println(list);
		System.out.println(list.contains("홍길동")); //홍길동이 있는지 묻는 것 => true/false
		
		for(int i=0 ; i<list.size() ; i++) { //list 루프돌기
			System.out.print(list.get(i).charAt(0) + "**  "); //list.get(i) => String type. 핸들링 가능
		}
		System.out.println("");
		
		for(String data : list) { //list 루프돌기
			System.out.print(data + "  ");
		}
		System.out.println("");
		
		Iterator<String> it = list.iterator(); //iterator만들기
		while(it.hasNext()) { //it가 요소를 가지고있는 동안 while
			String data = it.next();
			if(data.equals("김길동")) {
				System.out.println("김길동이 삭제되었습니다.");
				it.remove(); //삭제해도 위치인덱스 옮길필요없음 => ArrayList가 다 해줌.
			}
		}
		System.out.println(list);
		
		
	}

}
