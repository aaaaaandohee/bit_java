package day04;

import java.util.Arrays;

public class Test05 {

	public static void main(String[] args) {
			//배열의 선언, 생성, 초기화
		
		int[] scores = {88,99,77,55,66,44,55,44,55};
		String[] names = {"안도희", "이지원", "최소연", "박소영", "임지빈", "이은진", "강동원", "김수현"};
		
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(names));
		
		if(names.length>9) {
		System.out.println(names[9]);
		}
		System.out.println("-----------------------------------------");
		
		
		for(String data : names) {
			System.out.println("**" + data.charAt(data.length()-1));
		}
		
		
		double sum = 0;
		for(int data : scores) {
			sum+=data;
		}
		System.out.printf("평균 = %.2f %n" ,sum/scores.length);
	}

}
