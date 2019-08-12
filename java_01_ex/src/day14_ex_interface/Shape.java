package day14_ex_interface;

public abstract class Shape {
	
	private int numSieds;
	
	public Shape() {	}
	public Shape(int numSieds) {
		super();
		this.numSieds = numSieds;
	}

	
	public int getNumSieds() {
		return numSieds;
		
	}
	public void setNumSieds(int numSieds) {
		this.numSieds = numSieds;
	}
	
	
	abstract double getArea();

	
	@Override
	public String toString() {
		return "Shape [numSieds=" + numSieds + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numSieds;
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
		Shape other = (Shape) obj;
		if (numSieds != other.numSieds)
			return false;
		return true;
	}
	
	
	

}
