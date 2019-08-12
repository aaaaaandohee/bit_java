package day17;

public class Test02 {

	public static void main(String[] args) {
		
		Book b1 = new Book("java", 1000); // 생략하면  <Object, Object>
		System.out.println(b1);
		if(b1.getTitle() instanceof String) 
			System.out.println(((String)(b1.getTitle())).charAt(0));
		
		
		Book<String, Integer> b2 = new Book<String, Integer>("jsp", 500);
		System.out.println(b2);
		System.out.println(b2.getTitle().charAt(0));

		Book<?, Integer> b3 = new Book<String, Integer>("Spring", 500);
		System.out.println(b3.getTitle()); // ? => Object
		
		Book<?, ? extends Number> b4 = new Book<String, Integer>("Spring", 500);
		System.out.println(b4.getPrice()); //? => Number type (넘버의 자식이 올 수 있음)
		
		Book<?, ? super Number> b5 = new Book<String, Object>("Spring", 500);
		System.out.println(b5.getPrice()); //? => Object (넘버의 부모가 올 수 있음)
	}

}
