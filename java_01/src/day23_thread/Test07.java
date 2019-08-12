package day23_thread;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class Test07 {

	public static void main(String[] args) throws Exception {
		
		RandomAccessFile raf = new RandomAccessFile("rand.dat", "rw"); //rw => read, write 다 되는 모드
		
		String msg = "Hello, RandomAccessFile >_<";
		String result = null;
		
		raf.writeBytes(msg);
		raf.seek(0); //커서 위치 지정  0 => 커서를 맨 앞으로 지정
		while(true) {
			result = raf.readLine();
			if(result == null) break;
			System.out.println(result);
		}
		System.out.println("=========================");
		
		raf.seek(raf.length());
		msg = "\n hi~ java io test ~!";
		raf.writeBytes(msg);
		
		raf.seek(7);
		while(true) {
			result = raf.readLine();
			if(result == null) break;
			System.out.println(result);
		}
		System.out.println("=========================");
		
		raf.close();
	
	}

}
