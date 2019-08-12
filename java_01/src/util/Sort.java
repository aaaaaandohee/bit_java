 package util;


public class Sort {
	
	public static int[] sort(int[] nums) {
		//배열 원본은 변경 되지 않도록 하고 오름차순으로 정렬된 int[] 리턴
		
		int[] copy = new int[nums.length]; //nums와 같은 크기의 배열 생성
		System.arraycopy(nums, 0, copy, 0, nums.length); //원본이 변경되지 않게 하기위해 복사본 생성
		
		int[] num = copy;
		for(int i=0 ; i<num.length-1 ; i++) {
			int min = i;
			for(int j=i+1 ; j<num.length ; j++) {
				if(num[min] > num[j]) {
					min = j;
				}
			}
			if(i!=min) { 
			int tmp = num[i];
			num[i] = num[min];
			num[min] = tmp;
			}
		}
		
		return num;
		
	}
	

}
