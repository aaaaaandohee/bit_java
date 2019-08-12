package day12_ex;

public class Rectangle extends Shape{

	private double width;
	private double height;
	
	public Rectangle() {	}
	public Rectangle(String name, double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	


	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
	
	@Override
	public void calculationArea() {
		super.area = this.getHeight()*this.getWidth();
	}

}
