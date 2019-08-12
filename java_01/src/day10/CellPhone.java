package day10;

public class CellPhone {
	
	String model;
	String number;
	int chord;
	
	
	
	public CellPhone() {
		super();
	}
	public CellPhone(String model, String number, int chord) {
		super();
		this.model = model;
		this.number = number;
		this.chord = chord;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getChord() {
		return chord;
	}
	public void setChord(int chord) {
		this.chord = chord;
	}
	
	

}



class D_caPhone extends CellPhone{
	
	String pixel;

	public D_caPhone(String model, String num, int chord, String pixel) {
		super(model,num,chord);
		this.pixel = pixel;
	}
	
	
}


class MP3Phone extends CellPhone{
	
	int size;
	
	
	public MP3Phone(String model, String num, int chord, int size) {
		super(model,num,chord);
		this.size = size;
	}
}
