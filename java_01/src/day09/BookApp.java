package day09;

import java.util.Scanner;

public class BookApp {
	
public static void main(String[] args) {
		BookMgr mgr = new BookMgr(10);
		
		Scanner input = new Scanner(System.in);
		String num = null;
		
	
		while(true) {
		
		System.out.println("");
		System.out.println("******* Book App *******\n");
		System.out.println("1. insert (등록)\n");  
		System.out.println("2. print list (목록 출력)\n");
		System.out.println("3. search (검색)\n");
		System.out.println("4. delete (삭제)\n");
		System.out.println("5. quit (종료)\n");
		System.out.println("************************\n");
		System.out.println("수행할 명령을 선택하세요!");
		System.out.println("1 2 3 4 5 중 하나를 입력하세요 : ");
		
		num = input.nextLine().trim();
		
		switch(num) {
		case "1":
			System.out.println("등록 명령을 실행합니다.\n");
			
			System.out.println("Book title을 입력하세요.");
			String title = input.nextLine();
			
			System.out.println("Book price를 입력하세요.");
			int price = input.nextInt();
			input.nextLine();
			mgr.addBook(new Book(title, price));
			break;
			
		case "2":
			System.out.println("목록 출력 명령을 실행합니다.\n");
			mgr.printBookList();
			break;
			
		case "3":
			System.out.println("검색 명령을 실행합니다.");
			System.out.println("검색할 title 입력하세요.");
			title = input.nextLine();
			mgr.searchBook(title);
			break;
			
		case "4":
			System.out.println("삭제 명령을 실행합니다.");
			System.out.println("삭제할 title 입력하세요.");
			title = input.nextLine();
			mgr.deleteBook(title);
			break;
			
		case "5":
			System.out.println("종료하시겠습니까. 종료를 원하면 q/Q 를 입력하세요.");
			String quit =  input.nextLine().trim();
			if(quit.equals("q")||quit.equals("Q")){
				System.out.println("종료합니다.");
				input.close();
				input = null;
				System.exit(0); // 앱 종료
			}break;
			
		default:
			System.out.println("알맞은 숫자를 입력해주세요.\n\n");
			break;
		}
		
		} 
		
	
		

	}

}
