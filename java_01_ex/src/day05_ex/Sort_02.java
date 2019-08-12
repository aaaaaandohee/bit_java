package day05_ex;

import java.util.Arrays;

public class Sort_02 {

	public static void main(String[] args) {
		
		int[] num = null;
		num = new int[6];
		
		for(int i =0 ; i<num.length ; i++) {
			num[i] = (int)(Math.random()*45) + 1; //1~45사이의 정수 랜덤발생. 더블형이기 때문에 인트로 형변환
			
			for(int j=0 ; j<i ; j++) {
				if(num[j]==num[i]) {
					i--;
					break;
				}
			}
//			System.out.println(Arrays.toString(num));
		}
		
		System.out.println(Arrays.toString(num));
		
		System.out.println("========== 정렬 ==========");
		
		int count = 0;
		
		//인트타입의 배열 정렬 코드
		for(int i=0 ; i<num.length-1 ; i++) {
			int min = i;
			for(int j=i+1 ; j<num.length ; j++) {
				if(num[min] > num[j]) {
					min = j;
				}
			}
			if(i!=min) { //min이랑 i가 같은 경우에는 스와핑 일어나지 않음. 다를 경우에만 스와핑 실행
			int tmp = num[i];
			num[i] = num[min];
			num[min] = tmp;
			count++;
			}
		}
	
		System.out.println(Arrays.toString(num));
		System.out.println(count);
		
	}

}
