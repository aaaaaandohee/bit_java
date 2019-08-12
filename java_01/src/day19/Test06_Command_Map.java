package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Test06_Command_Map {

	public static void main(String[] args) {
		//Map 구조로 설계
		Map<String, Command> map = new HashMap<String, Command>();
		
		map.put("insert", new InsertCommand());
		map.put("update", new UpdateCommand());
		map.put("select", new SelectCommand());
		map.put("delete", new InsertCommand());
		map.put("new", new Command() { //Command를 implement한 익명클래스 선언.
							@Override
							public void exec() {
								System.out.println("기능 추가");
							} 
				});
		
//		String cmd = args[0]; //scanner를 통해 delete update select insert 중 하나가 들어감. => Command 창 통해서 입력
		Scanner scanner = new Scanner(System.in);
		System.out.println("delete update select insert 중 하나를 입력하세요 : ");
		String cmd = scanner.nextLine();
		
		if(map.get(cmd)!=null) {
			map.get(cmd).exec();
		} else System.out.println("잘못입력했습니다.");
			
	}
		
}


