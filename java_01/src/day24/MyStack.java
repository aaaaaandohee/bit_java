package day24;

public class MyStack {

	int[] stack;
	int top = 0;
	
	public MyStack() {
		stack = new int[10];
	}
	
	public MyStack(int size) {
		if(size<0) {
			stack = new int[10];
		} else {
			stack = new int[size];
		}
	}

	
	public synchronized void push(int n){
		if(isFull())  {
			//return;
			try {
				wait(); //wait pool에 빠지기 때문에 pop에서 꺼내줘야 함.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		stack[top] = n;
		top++;
		System.out.println("push => " + n);
		
		notifyAll(); //wait pool에 빠진 거 꺼내줌
	}
	
	public synchronized boolean isEmpty() {
		return top==0 ? true : false;
	}
	
	public synchronized boolean isFull() {
		return top==stack.length ? true : false;
	}
	
	public synchronized int top() {
		if(isEmpty()) return -1;
		return stack[top-1];
	}
	
	public synchronized int pop() {
		if(isEmpty()) {
			//return -1;
			try {
				wait(); //wait pool에 빠지기 때문에 push에서 꺼내줘야 함. => dead lock에 걸리지 않기 위함.
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int data = stack[--top];
		System.out.println("                  pop ==>  " + data);
		notifyAll(); //wait pool에 빠진 거 꺼내줌
		return data;
	}
}
