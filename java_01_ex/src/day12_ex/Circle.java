package day12_ex;

public class Circle extends Shape{
	
	private double radius;
	
	
	public Circle() {	}
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}



	@Override
	public void calculationArea() {
		super.area = this.getRadius()*this.getRadius()*Math.PI;
	}

}
