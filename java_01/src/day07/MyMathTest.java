package day07;

import java.util.Arrays;

import util.MyUtil;

public class MyMathTest {

	public static void main(String[] args) {
		
		System.out.println(MyUtil.add(33,99));
		System.out.println(MyUtil.add(33.3,99.9));
		
		System.out.println(MyUtil.add(33.3,99.9,90));
		System.out.println(MyUtil.add(33.3,99.9,90,5.22));
		
		System.out.println(MyUtil.add(1,2,3,4,5,6,7,8,9,10));
//		System.out.println(MyUtil.add(new double[] {1,2,3,4,5,6,7,8,9,10}));
		
		
		
		double[] d = new double[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(d));
		
		int i  = 100; //기본형
//		Integer ii = new Integer(100); //wrapper클래스
		Integer ii = i; //기본형과 wrapper클래스 사이를 왔다 갔다 할 수 있음. 알아서 값을 꺼내서 동작해줌 -> *오토박싱,언박싱 *
		                //기본자료형의 경우, new 사용하지 않아도 됨. 자동으로 형변환 해줌
		System.out.println(i + "  " + ii); 
	}

}
