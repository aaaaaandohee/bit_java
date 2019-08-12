package day05;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) { 

			String msg = "hello JAVA ~~~ ";
			String msg2 = "hi ~~~ SQL ";
			
			char [] c = new char[msg.length()];
			for(int i=0 ; i<msg.length() ; i++) { //문자열을 배열에 넣음
				c[i] = msg.charAt(i);
			}

			char[] cc = msg.toCharArray(); //위 line12-15의 역할을 함
			cc[0] = 'Q';
			
			String ne = new String(cc); //char배열이었던 cc를 문자열에 넣음
			
			char[] cc2 = msg2.toCharArray();
			
			System.out.println(msg);
			System.out.println(Arrays.toString(c));
			System.out.println(Arrays.toString(cc));
			System.out.println(ne);
			System.out.println(Arrays.toString(cc2));
			
	}

}
