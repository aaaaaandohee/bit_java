package day10;

public class Test03 {

	public static void main(String[] args) {
		Time t1 = new Time(13,20,20);
		
	}

}

class Time{
	int hour;
	int minute;
	int second;
	
	
	public Time() {	}
	public Time(int hour, int minute, int second) {
//		super(); //지워도 자동으로 들어감. 생략되어 있음. 없어도 자동호출. 첫번째에 와야됨. first statement
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}


	
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		
		this.second = second;
	}
	
	
}
