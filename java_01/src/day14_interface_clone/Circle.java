package day14_interface_clone;
 
abstract class Shape implements DrawAndMove, Cloneable{
	abstract double area(); //abstract class는 abstract메소드와 instance메소드 둘다 있을 수 있기 때문에 abstract메소드는 명시해줘야한다.
	@Override
	public Shape clone() throws CloneNotSupportedException {
			return (Shape) super.clone();
	}
}

interface Drawable{
	public abstract void draw();
}

interface Moveable{
	void move(int m); //interface에서는 생략해도 자동으로 public abstract 처리됨.
}

interface DrawAndMove extends Drawable, Moveable{}

public class Circle extends Shape implements Cloneable{ 
	//한번에 두개는 상속 받지못함. 깊이를 조절할지, has a관계를 할지 결정. 좀 더 중요한 클래스 상속.
	
	public Point p; //has a 관계 
	public double r;
	
	

	public Circle() {	}
	public Circle(Point p, double r) {
		super();
		this.p = p;
		this.r = r;
	}

	@Override
	double area() {
		return r*r*Math.PI;
	}

	@Override
	public void draw() {
		System.out.println(getClass().getName() + " 그리기");
	}
	
	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		long temp;
		temp = Double.doubleToLongBits(r);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
			return false;
		return true;
	}
	@Override
	public void move(int m) {
		p.setX(p.getX()+m);
		p.setY(p.getY()+m);
	}
	
	@Override
	public Circle clone() throws CloneNotSupportedException {
		Circle circle = (Circle)super.clone();
		this.p = (Point)p.clone(); 
//		Point p = circle.p.clone(); 
//		circle.p = p;
		return circle;
	}
	
	
	
	
	

}
