package day05;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		
		int[] scores = {77,99,100,95,87};
		int[] sc = new int[scores.length*2];
		
		System.arraycopy(scores, 0, sc, 0 , scores.length); //scores를 sc에 모두 카피
		//scores를, 0번째부터, sc에, 0번째부터에, scores의 길이만큼받을 것이다

		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(sc));
		
		String[] names = {"이지원","박소영","최소연","임지빈"};
		String[] names2 = new String[names.length*2];
		System.arraycopy(names, 0, names2, 0 , names.length); //names를 names2에 모두 카피
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(names2));
		
	}

}
