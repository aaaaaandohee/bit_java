package day16;

public class Test03 {

	public static void main(String[] args) {
		System.out.println(" main start");
		String msg = null;
		msg = "xmlaaa";
		try {
			if(msg != null) {
				System.out.println(msg.charAt(3)); //nullpointexception은 잡히지 않게 if로 핸들링 하는 것이 좋음.
				int num = Integer.parseInt(msg);
			}
		} catch(Exception e) { //모든예외를 하나로 잡으면 예외 발생이유가 확실하지 않기 때문에 사용하지 않음.
			System.out.println("예외 발생 : " + e.getMessage()); 
		} finally {
			System.out.println("finally {자원 반납 코드}"); //finally에는 항상 자원 반납 코드가 들어가줘야 함.
		}
		System.out.println(" main end");
	}

}
