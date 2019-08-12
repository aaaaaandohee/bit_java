package day03;

public class Test06 {

	public static void main(String[] args) {
		
		int sum = 0;
		int sum4 = 0;
		for(int i=1 ; i<=100 ; i++) {
			
			sum += i;
			
			if(i%4==0) {
				sum4 += i;
			}
		}
		System.out.println("1~100의 합 : " + sum);
		System.out.println("1~100 중 4의 배수의 합 : " + sum4);

	}
 
}
