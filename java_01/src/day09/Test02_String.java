package day09;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Test02_String {

	public static void main(String[] args) {
		String msg = "java programming/23000";
		System.out.println(msg.indexOf("/"));
		
		String d1 = msg.substring(0,msg.indexOf("/"));
		String d2 = msg.substring(msg.indexOf("/")+1);
		
		System.out.println(d1);
		System.out.println(d2);
		
		String url = "http://127.0.0.1:8080/web1/list.do";
		System.out.println(url.lastIndexOf('/')); //마지막 / 위치 인덱스
		System.out.println(url.indexOf('/')); // /위치 인덱스
		System.out.println(url.substring(url.lastIndexOf('/')));
		
		System.out.println(url.contains("web1")); //해당 문자열을 포함하고 있는지
		
		
		String data ="2019001_홍길동/90 /20/ 40";
		System.out.println(data);
//		System.out.println(data.replace('_', '/')); //data 값 자체가 변하는 것이 아님. 바꾸어 출력하는 것임.
		data = data.replace('_', '/'); //data 값 자체가 변하는 것이 아님. 바꾸어 출력하는 것임.
		String[] sdata = data.split("/");
		System.out.println(Arrays.toString(sdata));
		
		System.out.println("=================StringTokenizer====================");
		data ="2019001_홍길동/90 /20/ 40";
		StringTokenizer st = new StringTokenizer(data);
		System.out.println(st.countTokens());
		
		
		StringTokenizer st1 = new StringTokenizer(data,"_");
		System.out.println(st1.countTokens());
		while(st1.hasMoreElements()) {
			System.out.print(st1.nextToken()+" , ");
		}
		
		
		StringTokenizer st2 = new StringTokenizer(data,"/_");
		System.out.println(st2.countTokens());
		while(st2.hasMoreElements()) {
			System.out.print(st2.nextToken()+" , ");
		}
		
	}

}
