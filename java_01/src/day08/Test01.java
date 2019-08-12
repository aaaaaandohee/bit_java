package day08;

import util.MyUtil;

public class Test01 {

	public static void main(String[] args) {
		
		System.out.println("max : "+ MyUtil.max(1,88,55,4445,12,97,333335,45));
		System.out.println("min : "+ MyUtil.min(1,88,55,4445,12,97,333335,45,-88,-98,-787));
		System.out.println("min : "+ MyUtil.min(new int[] {1,88,55,4445,12,97,333335,45,-88,-98,-787}));
		

	}

}
