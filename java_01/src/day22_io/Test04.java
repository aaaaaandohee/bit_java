package day22_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {

	public static void main(String[] args) {
		
		String src  = "c://lib//Ben.mp3";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		System.out.println("< 파일 복사 시작 >");
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream("c://lib//copy3.mp3", false); //true : append모드 => 원본을 유지한 채 복사됨. 기존의 파일 내용 뒤에 복사.
			                                                       //false => 덮어씌움
			int read = 0;
			int count = 0;
			
			byte[] buffer = new byte[1024*1024]; //버퍼의 사이즈를 1메가로 지정.
			
			while((read = fis.read(buffer)) != -1) {
//				System.out.println("read : " + read);
				fos.write(buffer, 0, read); //0에서부터 읽은 바이트수만큼 기록. => 사이즈가 일치하는 파일이 생성됨.
				                            //해당 속성 지정하지 않으면 버퍼의 사이즈에 따라 파일의 사이즈가 달라짐.
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
