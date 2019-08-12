package day03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		int jumsu;
		
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
//		jumsu = input.nextInt();
		jumsu = Integer.parseInt(input.nextLine()); //nextLine은 String이기 때문에 int로 형변환하여 사용
		
		
		input.close();
		input = null;
		
		
		
		if(!(jumsu>=0 && jumsu<100)) {
			System.out.println("유효하지 않은 점수입니다.");
			return; // 현재 수행중인 함수를 종료하고 호출한 자리로 돌아감. 메인함수 안에서 리턴을 하면 메인함수 종료를 의미
		} 
		
		
//		input.nextLine(); // 읽어들인 데이터 뒤의 나머지 데이터를 제거함
		
		
		/*
		if(jumsu>=80) {
			System.out.println("pass");
		} else {
			System.out.println("no pass");
		}*/
		
		String result = jumsu>=80? "pass" : "no pass";
		
		String grade = "F";
		
		if(jumsu>=90) {
			grade = "A";
		} else if(jumsu>=80) {
			grade = "B";
		} else if(jumsu>=70) {
			grade = "C";
		} else if(jumsu>=60 ) {
			grade = "D";
		} else {
			grade = "F";
		}
		
//		System.out.println("점수 : " + jumsu + " : " + result + " " + grade + "등급");
		System.out.printf("점수 : %d : %s %s등급%n", jumsu, result, grade);
		
		
		
		
		
		//삼항연산자로 등급처리 - 과제
		String s = jumsu>=90 ? "A" : (jumsu>=80 ?  "B" : (jumsu>=70 ? "C" : (jumsu>=60 ? "D" : "F")));
		System.out.println("\n*************삼항연산자로 등급처리****************");
		System.out.println("점수 : " + jumsu + " , 등급 : " + s);
		
		
		
		
		
		
		
		
		
		//switch로 등급처리
		System.out.println("\n***************switch 등급처리*****************");
		char c = ' ';
		switch(jumsu/10) {
			case 10:
			case 9:
				c = 'A';
				break;
			case 8:
				c = 'B';
				break;
			case 7:
				c = 'C';
				break;
			case 6:
				c = 'D';
				break;
			
			default:
				c = 'F';
			
		}
		System.out.println("switch등급처리 : " + c);
		
	}
}

	
