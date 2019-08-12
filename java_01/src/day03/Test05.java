package day03;

public class Test05 {

	public static void main(String[] args) {
		
		int i;
		for(i=1 ; i<10 ; i++) {
			
			System.out.println("Hello java " + i);

	    }
		System.out.println(i);
		
		
		int j = 10;
		while(j>0) {
			System.out.println("while " + j);
			j--;
		}
		
		
		boolean flag = true;
		while(flag) {
			j++;
			System.out.println("~~~~~~~" + j);
			if(j==5) flag = !flag;
		}
		
		
		while(j<5) {
			System.out.println("do while"); // 수행 안됨 j가 5이기 때문
		}
		
		System.out.println("----------------------------------------------------" );
		
		do {
			System.out.println("do while"); //do~while은 먼저 처리한 후 조건문을 비교하기 때문에 최소한 한번은 수행함
		}while(j<5);
		
		
		
		
	}

}
