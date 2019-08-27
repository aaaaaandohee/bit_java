package day19_ex;


import java.util.Scanner;

public class BookApp {
	
	public static void main(String[] args) {
        
		BookMgr2 mgr = new BookMgr2();
		int isbn = 0;
		
		Scanner scanner = new Scanner(System.in);
		String cmd = null;
		
		while (true) {
			System.out.println("*******  명령 선택   ********\n");
			System.out.println("1. insert(등록) \n");
			System.out.println("2. delete(삭제) \n");
			System.out.println("3. list(목록) \n");
			System.out.println("4. search(검색) \n");
			System.out.println("q. quit(종료)   \n");
			System.out.println("************************** \n\n");
			System.out.println("수행할 명령을 선택하세요! ");
			System.out.print("1 2 3 4 중 하나를 선택하세요 : ");

			//cmd = scanner.nextInt()+"";
            //scanner.nextLine();
            
			cmd = scanner.nextLine().trim();
			
			switch (cmd.trim()) {  //문자열의 공백 제거
			case "1":
				System.out.println("insert 작업을 수행하는 기능 호출");
				System.out.println("Book title 입력하세요");
				String title = scanner.nextLine();
				System.out.println("Book 가격  입력하세요");
				int price = scanner.nextInt();
				scanner.nextLine();
				mgr.addBook(new Book(title,price,++isbn));
				break;
				
			case "2":
				System.out.println("delete 작업을 수행하는 기능 호출");
				System.out.println("삭제할 Book title 입력하세요");
				title = scanner.nextLine();
				mgr.deleteBook(title);
				break;
				
			case "3":
				System.out.println("목록 출력 작업을 수행하는 기능 호출");
                mgr.bookListPrint();
				break;
				
			case "4":
				System.out.println("검색 작업을 수행하는 기능 호출");
				System.out.println("검색할  title 입력하세요");
				title = scanner.nextLine();
				mgr.searchTitleBook(title);
				break;
				
			case "q":
				System.out.println("정말 종료 하려면 q/Q 를 입력하세요");
				String quit =  scanner.nextLine().trim();
				if(quit.equals("q") || quit.equals("Q") ) {
					System.out.println("App 종료");
					scanner.close();
					scanner=null;
					//return; //현재의 함수 종료 의미
					System.exit(0); // App 종료 
				}
				break;
				
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}

			System.out.println("=======================================");
		}
	}
}
