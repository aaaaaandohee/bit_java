package day18_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Test03 {

	public static void main(String[] args) {
		
		Student[] s = new Student[10];
		Student[] sss = {
				new Student("최소연", 90, 100),
				new Student("임지빈", 50, 90),
				new Student("박소영", 20, 40),
			    new Student("이지원", 10, 10)
		};
		Arrays.sort(sss);
		
		//***Vector***
		
		Vector<Student> list = new Vector<Student>(5, 10); 
		//내부에 Student[]를 만들어서 관리해줌. 처음에 5개 만들고 모자르면 10개씩 증가한다는 뜻
		
		System.out.println("capacity : " + list.capacity());
		System.out.println("size : " + list.size());
		list.add(new Student("최소연", 90, 100));
		list.add(new Student("임지빈", 50, 90));
		list.add(new Student("박소영", 20, 40));
		list.add(new Student("이지원", 10, 10));
		
		System.out.println("capacity : " + list.capacity());
		System.out.println("size : " + list.size());
		
//		System.out.println(list);
		
		Iterator<Student> is = list.iterator();
		while(is.hasNext()) {
			Student data = is.next();
			if(data.getAvg()>=90)   System.out.println(data);
		}
		
		System.out.println(list.contains(new Student("이지원", 10, 10))); 
		//비교하기 위해서는 내부적으로 equals메소드 필요. 오버라이딩 해야함
		
		//C U R D -> CREAT UPDATE READ DELETE
		
		//홍길동 90 90 등록
		Student s1 = new Student("홍길동", 90, 90);
		boolean flag = list.add(s1);
		
		if(flag) System.out.println(s1 + " 등록 되었습니다.");
		else System.out.println(s1 + " 등록 실패");
		
		//홍길동 성적 100 100 수정
		is = list.iterator(); //iterator는 한 번 쓰면 다시 생성명령 해줘야함.
		while(is.hasNext()) {
			Student data = is.next();
			if(data.getName().equals("홍길동")) {
				data.setKo(100);
				data.setMath(100);
				data.setAvg();
				System.out.println(data + " 수정 되었습니다.");
			}
		}
		
		//s1 삭제
		System.out.println(" ===== 학생 " + s1 + "삭제 ===== ");
		is = list.iterator();
		while(is.hasNext()) {
			Student data = is.next();
			if(data.equals(s1)) {
				is.remove();
				System.out.println(s1 + " 삭제 되었습니다.");
			}
		}
				
			
		Collections.sort(list);
		
		//List 목록 출력
		System.out.println("===== Studen List =====");
		is = list.iterator();
		while(is.hasNext()) {
			Student data = is.next();
			System.out.println(data);
		}
	}

}




	
