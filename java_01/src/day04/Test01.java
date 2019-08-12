package day04;

import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args) {
		/*
		System.out.println("알파벳 아스키 코드 값 확인");
		
		char a = 'a';
		char b = 'A';
		
		
		for(int i=0 ; i<26 ; i++) {
		System.out.println(a + " : "+ (int)a++ + "    " + b + " : " + (int)b++);
		}
		*/
		
		//변수 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경하는 코드
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String msg = scan.nextLine();
		
		/*for(int i=0 ; i<msg.length() ;i++) {
		char ch = msg.charAt(i); 
		char s = ch>='A' && ch<='Z' ? (char)(ch+32) : ch;
		//ch+32는 ch가 int로 형변환이 일어나기때문에 앞에 (char)로 char형으로 다시 바꿔야한다.
		
//		System.out.print(ch + " -> " + s );
		System.out.print(s);
		}*/
		
		
		
		
		
		//*****과제  소문자>대문자,  대문자>소문자로 변경*****
		
		for(int i=0 ; i<msg.length() ;i++) {
			char ch = msg.charAt(i); 
			char s = ch>='A' && ch<='Z' ? (char)(ch+32) : (ch>='a' && ch<='z' ?  (char)(ch-32) : ch);
			System.out.print(s);
		
		}
		
	
		
		
		
		scan.close();
		scan=null;
		
		
	}
}
