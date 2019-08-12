package day07;

import java.util.Arrays;

import util.Sort;

public class SortTest {

	public static void main(String[] args) {
		int[] src = {5,9,7,1,99,44,11,88,2};
		
		int[] result = Sort.sort(src);
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(result));
	}

}
