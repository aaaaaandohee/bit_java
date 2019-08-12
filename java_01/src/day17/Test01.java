package day17;

public class Test01 {

	public static void main(String[] args) {
		
		Book1 b1 = new Book1("java",10000); //T에 대해 언급해주지 않으면 Object로 자동처리됨.
		System.out.println(b1);
		
//		Book<String> b2 = new Book<String>("html", "700"); //Number의 자식만 T로 허용하기 때문에 오류남.
//		System.out.println(b2);
		
		Book1<Double> b2 = new Book1<Double>("html", 700.0);
		System.out.println(b2);
		
		Book1<Integer> b3 = new Book1<Integer>("db", 2000);
		System.out.println(b3);
	}

}
