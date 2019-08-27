package day17_ex;

public class SizeException extends Exception {
	
	public SizeException() { 
		super("SizeException : 음수 허용 안됨 ");
	}
	public SizeException(String msg) {
		super(msg);
	}

}
