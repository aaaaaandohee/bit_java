package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Test03 {

	public static void main(String[] args) {
		
		String adress = "https://www.naver.com/index.html";
		String line = null;
		
		URL url = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			url = new URL(adress);
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			fw = new FileWriter("naver.html");
			bw = new BufferedWriter(fw);
//			bw = new BufferedWriter(new FileWriter("naver.html"));
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
				bw.write(line+"\n"); 
			}
//			bw.flush(); //바로 나가는 건 flush명령 필요하지만 bw.close 때 flush되므로 안해줘도 파일에 저장 완료됨.
			System.out.println("파일 기록 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
				try {
					if(br!=null) br.close();
					if(bw!=null) bw.close();
					if(fw!=null) fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
