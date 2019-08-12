package day19;

import java.util.Scanner;

public class Test05_Command {

	public static void main(String[] args) {
		
		Command delete = new DeleteCommand();
		Command update = new UpdateCommand();
		Command select = new SelectCommand();
		Command insert = new InsertCommand();
		
//		String cmd = args[0]; //scanner를 통해 delete update select insert 중 하나가 들어감. => Command 창 통해서 입력
		Scanner scanner = new Scanner(System.in);
		System.out.println("delete update select insert 중 하나를 입력하세요 : ");
		String cmd = scanner.nextLine();
		
		
		switch(cmd) {
		case"insert":
			insert.exec();
			break;
			
		case"update":
			update.exec();
			break;
			
		case"select":
			select.exec();
			break;
			
		case"delete":
			delete.exec();
			break;
			
		default:
			System.out.println("잘못입력했습니다.");
			break;
		}
	}

}
