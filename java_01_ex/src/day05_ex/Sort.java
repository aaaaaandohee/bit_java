package day05_ex;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		
		int[] num = new int[6];
		
		for(int i=0 ; i<num.length ; i++) {
			num[i] = (int)(Math.random()*45)+1; 
			
			for(int j=0 ; j<i ; j++) {
				
					if(num[i]==num[j]) {
						i--;
						break;
						
				}
			}
		}

		
		int count = 0;
		
		for(int i=0 ; i<num.length-1 ; i++) { 
			int min = i;
			
			for(int j=i+1 ; j<num.length ; j++) {
				if(num[min]>num[j]) {
					min = j;
				}
			}
			
			int tmp = num[i];
			num[i] = num[min];
			num[min] = tmp;
			count++;
	     }
		System.out.println("---------- 정렬 ----------");
		System.out.println(Arrays.toString(num));
		System.out.println("count = " + count);
 }
}
