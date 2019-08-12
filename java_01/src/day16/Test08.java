package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		
		//try ()안에 넣어주면 알아서 자원반납 해줌.
		try(FileInputStream fis = new FileInputStream("c://lib//sample.txt");) 
		{
			System.out.println("~ file 처리 ~");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {   }
		
		
		
		try(Scanner scanner = new Scanner(new File("c://lib//sample.txt"));) 
		{
		
		} catch(FileNotFoundException e) {
		 	e.printStackTrace();
		} finally {   }
		
		
		
		
		System.out.println("main end");
	}

}
