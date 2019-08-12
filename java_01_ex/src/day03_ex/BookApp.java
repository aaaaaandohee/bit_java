package day03_ex;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		
	
		do {
			
		System.out.println("******* 명령 선택 *******\n");
		System.out.println("1. insert (등록)\n");
		System.out.println("2. delete (삭제)\n");
		System.out.println("3. update (수정)\n");
		System.out.println("4. quit (종료)\n");
		System.out.println("**********************\n");
		System.out.println("수행할 명령을 선택하세요!");
		System.out.println("1 2 3 4 중 하나를 선택하세요 : ");
		
		num = input.nextInt();
		
		if(num==1) {
			System.out.println("등록 명령을 실행합니다.\n\n");
		} else if(num==2) {
			System.out.println("삭제 명령을 실행합니다.\n\n");
		} else if(num==3) {
			System.out.println("수정 명령을 실행합니다.\n\n");
		} else if(num==4) {
			System.out.println("종료합니다.");
		} else {
			System.out.println("알맞은 숫자를 입력해주세요.\n\n");
		}
		
		} while(num!=4);
		
		
		
		input.close();
		input = null;
		

	}

}
