package day07_ex;

public class Prob1 {

	public static void main(String[] args) {
		Prob1 prob1 = new Prob1(); //leftPad가 인스턴스 메소드이기 때문에 new로 선언해주고 사용
		
		System.out.println( prob1.leftPad("bit", 6, '#') );
		System.out.println( prob1.leftPad("bit", 5, '$') ); 
		System.out.println( prob1.leftPad("bit", 2, '&') ); 
		System.out.println( prob1.rightPad("bit", 6, '#') );
		System.out.println( prob1.rightPad("bit", 5, '$') ); 
		System.out.println( prob1.rightPad("bit", 2, '&') ); 
		}
	
		public String leftPad(String str, int size, char padChar) {
			
			String result="";
			String sum ="";
			if(str.length()>size) {
				result = str;
			}else {
				for(int i=0 ; i<size-str.length() ; i++) {
					sum += padChar;
				}
				result = sum + str;
			}
		
		return result;
		}
		
		public String rightPad(String str, int size, char padChar) {
			
			String result="";
			String sum ="";
			if(str.length()>size) {
				result = str;
			}else {
				for(int i=0 ; i<size-str.length() ; i++) { //string 변수를 만들지않고 str.length()를 변수에 넣어서 할 수도 있음.
					sum += padChar;
				}
				result = str + sum;
			}
		
		return result;
		}
}


