package day22_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class Test08 { //test07 를 properties 사용해서 구현.

	public static void main(String[] args) {
		
		FileReader fr = null;
		Properties prop = new Properties();
		
		try {
			fr = new FileReader("c://lib//dbinfo.txt");
			prop.load(fr);
			String id = prop.getProperty("user");
			String pw = prop.getProperty("pw");
			
			System.out.println("로그인 시도  - " + id + " / " + pw);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
		
		
	}

}
