package day17_ex;

public class Dice {
	
	int size;
	
	Dice(int size){
		this.size = size;
	}
	
	
   
	int play(){
    	int number = (int)(Math.random() * size) + 1;
        return number;
    }


}
