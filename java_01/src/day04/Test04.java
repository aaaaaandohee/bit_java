package day04;

import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {

		int[] scores; //배열선언
//		int scores[];   //이렇게 선언해도 됨
		
		scores = new int[5]; //배열생성.
		
		for(int i=0 ; i<5 ; i++) {
		System.out.print(scores[i] + "     ");
		}
		
		System.out.println();
		
		
		String[] names = new String[5]; //배열선언과 동시에 생성
		for(int i=0 ; i<5 ; i++) {
			System.out.print(names[i] + "  ");
		}
		
		System.out.println("\n-------------------------------------\n");
		
		scores[0] = 99;
		scores[1] = 79;
		scores[2] = 59;
		scores[3] = 99;
		scores[4] = 100;
		
		names[0] = "안도희";
		names[1] = "이지원";
		names[2] = "최소연";
		names[3] = "임지빈";
		names[4] = "박소영";
		
		double avg = 0.0;
		double sum = 0;
		for(int i=0 ; i<scores.length ; i++) {
			sum += scores[i];
		}
		avg = sum/scores.length;
		
		System.out.println(Arrays.toString(scores)); //배열에 있는 걸 꺼내서 스트링으로 처리해줌
		System.out.println(Arrays.toString(names));
		
		System.out.println("\n-------------------------------------\n");
		
		//홍** 99 평균이상
		for(int i=0 ; i<names.length ; i++) {
			
//			System.out.print((names[i].charAt(0)) + "**  " + scores[i]);
			System.out.printf("%s**  %3d  %s", names[i].charAt(0), scores[i], scores[i] >= avg ? "  "
					+ "평균이상\n" : "  평균이하\n");
			
			/*
				if(scores[i]>avg) {
					System.out.println("  평균이상");
				} else {
					System.out.println("  평균이하");
				}*/
			
			
		}
		
		
	}

}
















