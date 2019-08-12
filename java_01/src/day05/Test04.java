package day05;

import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
		
//		System.out.println((int)(Math.random()*10)); //난수발생  - Math.random은 더블형을 기본으로 0과1사이의 난수를 발생시킴
		
		if(args.length == 0) {
			System.out.println("배열의 사이즈 정보를 실행 매개변수로 넘겨주세요.");
			System.out.println("실행 예) java day05.Test04 5");
			return;
		}
		
		int[] nums = new int[Integer.parseInt(args[0])]; //매개변수가 args이기 때문에 실행과정에서 변수를 넘겨받는다 > 도스창에서 실행해야함
		                                                 //아니면 run configuratons에 매개변수 입력
		for(int i=0 ; i<nums.length ; i++) {
			nums[i] = (int)(Math.random()*45)+1; //1~45 사이의 정수 랜덤 생성
		}
		System.out.println(Arrays.toString(nums));
		
		
		/*
		System.out.println("---------- 오름차순정렬 -----------");
		for(int i=0 ; i<nums.length-1 ; i++) {
			for(int j=i+1 ; j<nums.length ; j++) {
				if(nums[i]>nums[j]) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
			}
			
			}
		}System.out.println(Arrays.toString(nums));*/
		
		System.out.println("---------- 내림차순정렬 -----------"); //****과제**** 카운트 횟수 줄이기=>4 (변수선언이용)
		
		int count = 0;
		for(int i=0 ; i<nums.length-1 ; i++) { //맨마지막것은 비교할필요가 없으므로 length-1
			for(int j=i+1 ; j<nums.length ; j++) {
				if(nums[i]<nums[j]) {
					int tmp = nums[j];
					nums[j] = nums[i];
					nums[i] = tmp;
					count++;
				}
			}
//			System.out.println(Arrays.toString(nums));
			
		}
		
		System.out.println(Arrays.toString(nums));
		System.out.println("count = " + count);
		//****과제**** 카운트 횟수 줄이기
	}

}
