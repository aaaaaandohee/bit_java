package day05;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		
		int num1 = 99;
		int num2 = num1;
		System.out.println("num1= " + num1 + ",  num2= " + num2);
		num1 = 77;
		System.out.println("num1= " + num1 + ",  num2= " + num2);
		
		//*****************************
		//call by value
		//call by reference
		//두개의 차이점
		//*****************************

		int[] n1 = {11,22,33,44,55};
		int[] n2 = n1;
		
		int[] n3 = new int[n1.length];  // n1의 데이터를 보관하기 위한 공간 확보. 
										//참조형데이터는 변경하면 같은 주소 공유하는 것도 같이 바뀌므로 원본의 데이터를 위한 공간확보.
		
		for(int i=0; i<n1.length ; i++) { //n1의 데이터를 n3에 카피
			n3[i] = n1[i];
		}
		
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		System.out.println(Arrays.toString(n3));
		
		n1[2] = 0;
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		System.out.println(Arrays.toString(n3)); // 데이터가 바뀌지 않고 출력됨
	}

}
