package day06;

public class Test01 {

	public static void main(String[] args) {
		
		int[] num = {2,4,6,8};
		
		/*
		int[] num2;
		num2 = new int[] {1,2,3,4,5,6,7}; // 이렇게 나눠서 생성할 땐, new 자료형[] 을 써줘야 함
		*/
		
		String[] arr = {"aa","vv","ee"};
		
		for(int data:num) { //배열 num의 데이터를 int타입의 data에 받겠다.
			System.out.println(data);
		}
		for(String data:arr) {
			System.out.println(data);
		}
	}

}
