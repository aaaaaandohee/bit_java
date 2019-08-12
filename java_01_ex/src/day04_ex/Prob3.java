package day04_ex;

public class Prob3 {

	public static void main(String[] args) {
		
		String sourceString = 
		"everyday we have is one more than we deserve";
		String encodedString = "";
				
		// 프로그램을 구현부 시작.	
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 
				
		
		for(int i=0 ; i<sourceString.length() ;i++) {  
			
			char ch = sourceString.charAt(i); 
			encodedString = encodedString + String.valueOf(ch>='a' && ch<'x' ? (char)(ch+3) : ch==32 ? ch=32 : (char)(ch-23));
		}
		
		// 프로그램 구현부 끝.
			
		
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
		
		
		
		System.out.println("\n=======================================\n");
		
		
		
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과를 계산하시오
		
		int sum = 0;
		int sum2 = 0;
		
		for(int i=1 ; i<11 ; i++) {
			
			sum += i;
			sum2 += sum;
			
		}
		System.out.println(sum2);
		
	}

}
