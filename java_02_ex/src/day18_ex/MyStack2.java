package day18_ex;


public class MyStack2 {
	
	int size;
	int[] nums;
	int count = 0;
	
	public MyStack2() {
		this.size = 10;
		nums = new int[10];
	}
	
	public MyStack2(int size) {
		if(size<0) {
			this.size = 10;
			nums = new int[10];
		} else {
		this.size = size;
		nums = new int[size];
		}
	}

	
	void push(int n){
		nums[count] = n;
		count++;
	}
	
	boolean isEmpty() {
		return count==0 ? true : false;
	}
	
	boolean isFull() {
		return count==size ? true : false;
	}
	
	int top() {
		if(isEmpty()) return-1;
		return nums[count-1];
	}
	
	int pop() {
		if(count!=0) {
			count--;
			return nums[count];
		}else return -1;
	}
	
}
