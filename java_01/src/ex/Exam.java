package ex;

import java.util.StringTokenizer;


public class Exam {

	public static void main(String[] args) {
		String r = "홍길동 / 이순신/김유신 /박철 ";
		String[] n = r.split("/");
		for(int j=0; j<n.length; j++) {
			System.out.print(n[j].trim().charAt(0));
			for(int i=0 ; i<n[j].trim().length()-1 ; i++) {
				System.out.print("*");
			}
			System.out.print(" ");
		}
		
		/*
		String r = "홍길동 / 이순신/김유신 /박철 ";
		StringTokenizer st = new StringTokenizer(r,"/");
		int index = 0;
		String[] str;
		str = new String[4];
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			str[index] = token.trim();
			index++;
		}
		for(String data: str) {
			System.out.print(data.charAt(0));
			for(int i=0 ; i<data.length()-1 ; i++) {
				System.out.print("*");
			}
			System.out.print(" ");
		}*/
	}
}


	