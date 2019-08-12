package day12_abstract;

public abstract class Animal { //추상클래스 - 상속을 전제로 만들어진 클래스
	protected String kind = "동물의 종류";

	
	public Animal() {
		super();
	}

	public Animal(String kind) {
		super();
		this.kind = kind;
	}
	
	
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public abstract void breath() ; //abstract method 추상메소드 - 선언부만 있고, 구현부가 없음.
	                                //클래스도 abstract 해줘야함
	
	public void print() {
		System.out.printf("%s :" , kind);
	}
	
}
