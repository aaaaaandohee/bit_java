package day12_ex;

class Parent {
	int x=100;
	Parent() {
		this(200); 
		System.out.println("1");
	}
	Parent(int x) {
		this.x = x;
		System.out.println("2");
	}
	
}
class Child extends Parent {
	int x = 3000;
	int y = 2000;
	Child() {
		this(1000,6000); 
		System.out.println("3");
	}
	Child(int x) {
		this.x = x;
		System.out.println("4");
	}
	Child(int x,int y) {
		this.x = x;
		this.y = y;
		System.out.println("5");
	}
	int getX() {
		return x;
	}
}
class Exercise7_7 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x="+c.getX());
	}
}
