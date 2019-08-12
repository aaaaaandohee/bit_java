package day09;

import java.util.Date;

public class Test03 {

	public static void main(String[] args) {
		String msg = "";
		
		msg = msg + "hello  " + new java.util.Date() + "  java" + "  test";  //좋지 않은 코드.
		System.out.println(msg);
		
		String msg2 = " ";
		
//		StringBuffer sb = new StringBuffer(); //스트링을 이어붙이려면 스트링버퍼 클래스 이용
		StringBuilder sb = new StringBuilder(); //스트링버퍼를 스트링빌더로 바꿔도 똑같이 작용ㅇ함.
		sb.append("hello  ");
		sb.append(new Date());
		sb.append("  java");
		sb.append("  test");
		sb.append('A');
		sb.append(114);
		
//		msg2 = sb.toString(); //string 과 stringbuffer는 타입이 다르기 때문에 형변환을 시켜줘야함
		msg2 = new String(sb); // 위의 코드와 같음
		System.out.println(msg2);
	}

}
