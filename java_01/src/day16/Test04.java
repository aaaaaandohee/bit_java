package day16;

import java.io.IOException;

public class Test04 {

	public static void main(String[] args) {
		System.out.println(" main start");
		int jumsu = 90;
		
		try {
			if(!(jumsu>=0 && jumsu<=100))
				throw new IOException(" jumsu가 유효하지 않습니다. "); //예외 객체 생성. 입력한 메세지가 e.getMessage로 등록되어 출력됨.
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {

		} finally {
			
		}
		
		
		System.out.println(" main end");
	}

}

//		throw new RuntimeException("~ 예외 발생 ~"); //예외 객체 생성