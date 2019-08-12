package day16;

public class Test02 {

	public static void main(String[] args) {
		System.out.println(" main start");
		String msg = null;
		msg = "xmlaaa";
		try {
			System.out.println(msg.charAt(3));
			int num = Integer.parseInt(msg);
		} catch(NullPointerException e) {
			System.out.println("예외 발생 : " + e.getMessage()); //null
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("예외 발생 : " + e.getMessage()); //string index
		} catch(NumberFormatException e) {
			System.out.println("예외 발생 : 정수로 입력해주세요.");
		} catch(Exception e) {
			System.out.println("예외 발생 : " + e.getMessage()); 
		} finally {
			System.out.println("finally {자원 반납 코드}"); //finally에는 항상 자원 반납 코드가 들어가줘야 함.
		}
		System.out.println(" main end");
	}

}
