package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import day17.PriceException;

public class BookTest {

	public static void main(String[] args) {
		
		Scanner scanner = null;
		
		try{
			scanner = new Scanner(new File("c://lib//sample.txt"));
			
			while(scanner.hasNextLine()) { //스캐너에 읽을 라인이 있는 동안 수행하라는 의미
				String[] data = scanner.nextLine().replace('_','/').split("/"); //'_'를'/'로 대체한 후 '/'를 기준으로 쪼갬.
				
//				System.out.println(Arrays.toString(data));
				Book book = null;
				try {
					book = new Book(data[0], Integer.parseInt(data[1]));
					System.out.println(book);
				}
				catch(PriceException e) {
					System.out.println(e.getMessage());
				}
			}
			
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("sample.txt 파일을 확인해주세요.");
		} 
	
		System.out.println("--main end--");
	}
}

		
		
		
		
		
		
	

