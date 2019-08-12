package util;

import java.util.Arrays;

public class MyUtil {
	
	/*
	 //method overloading - 하나의 클래스에 동일한 이름의 메소드가 여러개 존재 -> 매개변수의 타입이나 개수가 다름.
	public static long add(int a, int b) {
		return a+b;   //리턴타입은 오버로딩의 조건에 영향을 미치지 않음.
	}
	public static double add(double a, double b) {
		return a+b;
	}
	public static double add(double a, double b, double c) {
		return a+b+c;
	}*/
	
	//가변인자는 항상 매개변수 중 제일 마지막 위치에 와야함
	public static double add(double ... nums) { //내부적으로 배열[]처리. nums는 배열. - 몇개가 들어올지 모름. -> *가변인자*
		
		double sum = 0;
		for(double data : nums) {
			sum += data;
		}
		return sum;
	}
	/*
	public static double add(double[] a) { //위의 것과 차이점 - 매개변수를 넘겨줄 때 배열로 처리해줘야함.
		
		double sum = 0;
		for(double data : a) {
			sum += data;
		}
		return sum;
	}*/
	
	
	public static String leftPad(String str, int size, char padChar) {
		
		String result="";
		String sum ="";
		if(str.length()>size) {
			result = str;
		}else {
			for(int i=0 ; i<size-str.length() ; i++) {
				sum += padChar;
			}
			result = sum + str;
		}
	return result;
	}
	
	
	public static String rightPad(String str, int size, char padChar) {
		
		String result="";
		String sum ="";
		if(str.length()>size) {
			result = str;
		}else {
			for(int i=0 ; i<size-str.length() ; i++) {
				sum += padChar;
			}
			result = str + sum;
		}
	return result;
	}
	
	
	public static int[] sort(int[] nums) {
		//배열 원본은 변경 되지 않도록 하고 오름차순으로 정렬된 int[] 리턴
		
		int[] copy = new int[nums.length]; //nums와 같은 크기의 배열 생성
		System.arraycopy(nums, 0, copy, 0, nums.length); //원본이 변경되지 않게 하기위해 복사본 생성
		
		int[] num = copy;
		for(int i=0 ; i<copy.length-1 ; i++) {
			int min = i;
			for(int j=i+1 ; j<copy.length ; j++) {
				if(copy[min] > copy[j]) {
					min = j;
				}
			}
			if(i!=min) { 
			int tmp = copy[i];
			copy[i] = copy[min];
			copy[min] = tmp;
			}
		}
		return copy;
	}
	
	
	//숫자를 넘겨 받아 그 중 가장 큰수를 리턴하는 함수 max
	public static int max(int ... nums) {
		
		int m = Integer.MIN_VALUE; //임의의 가장 작은 값 넣어줌
		
		for(int data : nums) {
			if(m<data) m = data;
		}
		return m;
	}
	
	//숫자를 넘겨 받아 그 중 가장 큰수를 리턴하는 함수 min
	public static int min(int ... nums) {
		
		int m = Integer.MAX_VALUE; //임의의 가장 작은 값 넣어줌
		
		for(int data : nums) {
			if(m>data) m = data;
		}
		return m;
	}
	
	public static void main(String[] args) {
		int[] n = {2,9,4,1,22,45,18};
		sort(n);
		System.out.println(Arrays.toString(n));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
