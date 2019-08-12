package day18_collection;

public class Test05 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(2017001, "꺄륵", "기술부");
		Employee e2 = new Employee(2017001, "데헷", "기술부");
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
