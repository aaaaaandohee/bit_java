package day13;

import java.util.Calendar;
import java.util.Formatter;

public class Test01 {

	public static void main(String[] args) throws Exception{
		
		Calendar c = Calendar.getInstance(); //Calendar는 직접 객체생성이 안됨. getInstance이용해서 객체 생성.
		
		System.out.println(c);
		String date = String.format("현재시간은 %tk시 %tM분 %tS초 %n", c,c,c); //**String.format**
		System.out.println(date); 
		 
		String f = String.format("%f", Math.PI);
		System.out.println(f);
		
		
		
		System.out.println("================================");
		StringBuffer sb = new StringBuffer();
		
//		Formatter fm = new Formatter(sb); //sb에 연결돼서 스트링버퍼에 쌓임.
//		fm.format("현재시간은 %tk시 %tM분 %tS초 %n", c,c,c);  //sb에 연결돼서 스트링버퍼에 쌓임.
//		System.out.println(sb);
		
		Formatter fm = new Formatter("sss.txt"); //sss.txt파일에 기록.
//		Formatter fm = new Formatter(); //sss.txt파일에 기록.
//		Formatter fm = new Formatter(System.out); //콘솔창에 출력
		fm.format("현재시간은 %tk시 %tM분 %tS초 %n", c,c,c);  //sss.txt파일에 기록되는 내용. -> 스트링버퍼 sb에 쌓임.
		fm.format("%f%n", Math.PI);
		System.out.println(sb);
		fm.flush(); //버퍼에 있는 내용을 데이터들을 파일에 가서 기록하라는 명령어
		
		System.out.println("main end");

	}
}
