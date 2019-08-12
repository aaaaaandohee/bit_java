package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		System.out.println("main start");
		
		
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(new File("c://lib//sample.txt"));
			
			while(scanner.hasNextLine()) { //스캐너에 읽을 라인이 있는 동안 수행하라는 의미
				String[] data = scanner.nextLine().replace('_','/').split("/"); //'_'를'/'로 대체한 후 '/'를 기준으로 쪼갬.
				System.out.println(Arrays.toString(data));
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("sample.txt 파일을 확인해주세요.");
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(scanner!=null) {
			scanner.close();
			scanner = null;
			}
			System.out.println("자원 반납 완료");
		}
		
		
		System.out.println("main end");
	}

}
