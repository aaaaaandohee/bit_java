package day22_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Test07 {

	public static void main(String[] args) {
		//dbinfo.txt 로 부터 user, pw 정보 추출하기
		String src ="c://lib//dbinfo.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(src);
			br = new BufferedReader(fr);
			
			String id = null;
			String pw = null;
			
			String read = null;
			
			while((read = br.readLine()) != null) {
				String[] data = read.split("=");
				if(data[0].equals("user")) id = data[1];
				if(data[0].equals("pw")) pw = data[1];
				
			}
			
			System.out.println("로그인 시도  - " + id + " / " + pw);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null) {
					br.close();
					br = null;
				}
				if(fr!=null) {
					fr.close();
					fr = null;
				}
			}catch(Exception e2){
				e2.printStackTrace();
			}
		}
		
		
		
	}

}
