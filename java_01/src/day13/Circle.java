package day13;

abstract class Shape{
	abstract double area();
}

interface Drawable{
	public abstract void draw();
}

public class Circle extends Shape implements Drawable{ //한번에 두개는 상속 받지못함. 깊이를 조절할지, has a관계를 할지 결정. 좀 더 중요한 클래스 상속.
	
	Point p; //has a 관계 
	double r;
	
	

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
	
	
	
	

}
