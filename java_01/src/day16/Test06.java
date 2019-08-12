package day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test06 {

	public static void main(String[] args) {
		System.out.println("main start");
		FileInputStream fis = null; //구문안에서 선언하지말고 밖에 선언해줘야 함.
		
		try {
			fis = new FileInputStream("c://lib//samplesss.txt"); //경로 지정하지 않으면 현재 폴더 확인. 
			System.out.println("파일 준비 완료 ~ ");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("sample.txt 파일을 확인해주세요.");
		} catch(Exception e){ //다른 오류 발생해도 잡을 수 있도록 함.
			e.printStackTrace();
		} finally { //자원반납하는 코드는 반드시 finally에 넣어줘야 함.
			try {
				if(fis != null) { //fis가 널이어도 nullpointexception 예외발생하지않게 널이아닐때만 자원반납하도록 if구문해줌.
					fis.close(); //자원반납. 변수를 지역변수로 해줘야함. try catch구문에 들어가 있으면 안됨.
					fis=null;
				}
				System.out.println("자원 반납 완료");
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
		System.out.println("main end");
	}

}
