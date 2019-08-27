package day17_ex;


public class DiceGame {

	public static void main(String[] args) {
		
		DiceGame game = new DiceGame ();
		 
	 	int result1 = 0;
		try {
			result1 = game.countSameEye(10);
			System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);
		} catch (SizeException e) {
			System.out.println(e.getMessage());
		}
	 
		int result2 = 0;
		try {
			result2 = game.countSameEye(-10);
			System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);
		} catch (SizeException e) {
			System.out.println(e.getMessage());
		}
	 
	 
 	}
	
	int countSameEye(int n) throws SizeException {
		
		if(n<0) throw new SizeException();
	
		int count = 0;
		
		Dice dice1 = new Dice(8);
		Dice dice2 = new Dice(8);
		
		for(int i=0 ; i<n ; i++) {
			
			int a = dice1.play();
			int b = dice2.play();
			
			System.out.print(a + " ");
			System.out.println(b);
		
			if(a==b) count++;
		}
		
		return count;
	}
}



