package day22_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) {
		
		String src  = "c://lib//Ben.mp3";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		System.out.println("< 파일 복사 시작 >");
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream("c://lib//copy.mp3", true); //true : append모드 => 원본을 유지한 채 복사됨. 기존의 파일 내용 뒤에 복사.
			                                                       //false => 덮어씌움
			int read = 0;
			int count = 0;
			
			while((read = fis.read()) != -1) {
				fos.write(read);
				count++;
			}
			System.out.println("I/O 횟수 : " + count);
			System.out.println("< 파일 복사 완료 >");
			
		} catch (FileNotFoundException e) {
			System.out.println(src + " 파일(복사원본) 확인해주세요.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null) fis.close();
				if(fos!=null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("--- main end ---");
		
	}

}
