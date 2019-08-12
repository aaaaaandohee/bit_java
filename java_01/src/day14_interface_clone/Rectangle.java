package day14_interface_clone;

public class Rectangle extends Shape{
	
	Point p;
	private int width;  
	private int height;
	
	public Rectangle() {	} 
	public Rectangle(Point p, int width, int height) {
		super();
		this.p = p;
		this.width = width; 
		this.height = height;
	}
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}


	@Override
	double area() {
		return width * height;
	}

	@Override
	public void move(int m) {
		p.setX(p.getX()+m);
		p.setY(p.getY()+m);
	}
	@Override
	public void draw() {
		System.out.println("사각형 그리기");
	}
	
	@Override
	public String toString() {
		return "Rectangle [p=" + p + ", width=" + width + ", height=" + height + "]";
		//p를 찍을 때 값이 찍힐 수 있는 이유는 Point에 toString이 오버라이딩 되어있기때문. 
		//오버라이딩되어있지 않으면 주소찍힘
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + width;
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
		Rectangle other = (Rectangle) obj;
		if (height != other.height)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
	
	

}
