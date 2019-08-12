package day03;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("월(1~12)을 입력하세요 : ");
		String month = scan.nextLine();
		String res;
		
		scan.close();
		scan = null;
		
		switch(month) {
			case "1":
			case "3":
			case "5":
			case "7":
			case "8":
			case "10":
			case "12":
				res = "31";
				break;
			case "4":
			case "6":
			case "9":
			case "11":
				res = "30";
				break;
			case "2":
				res = "29";
				break;
			default:
				res = "몰라";
				
		}
		
		System.out.println(month + "월은 " + res + "일까지 입니다.");
	

	}

}
