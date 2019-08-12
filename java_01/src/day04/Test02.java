package day04;

public class Test02 {

	public static void main(String[] args) {
		
		
		for(int j=0; j<5 ; j++) {
//			System.out.println("j = " + j);
			
			for(int i=0 ; i<=j ; i++) {
//				System.out.print("i = " + i);
				System.out.print('*');
			}
			System.out.println();
		}
		
		//역순으로 찍히게 처리
		for(int j=5; j>0 ; j--) {
			
			for(int i=0 ; i<j ; i++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		
		
	}

}
