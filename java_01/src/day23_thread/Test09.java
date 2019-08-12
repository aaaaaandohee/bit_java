package day23_thread;

public class Test09 {

	public static void main(String[] args) {
		
//		System.out.println(Thread.MAX_PRIORITY); //우선순위 10
//		System.out.println(Thread.MIN_PRIORITY); //1
//		System.out.println(Thread.NORM_PRIORITY); //5
		
		System.out.println("-- main start --");
		System.out.println(Thread.currentThread()); //현재 cpu점유한 스레드 
		
		//스레드 생성
		T1 t1 = new T1();
		T2 t2 = new T2();
		
		//스레드 실행대기 큐에 넣기
		t1.start();
		t2.start();
		
		try { 
			t1.join(); //수행이 끝나야 밑에 있는 것들이 수행됨. => 홀수합짝수합 완벽하게 출력됨
			t2.join(); //수행이 끝나야 밑에 있는 것들이 수행됨. => 홀수합짝수합 완벽하게 출력됨
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("홀수 합 + 짝수 합 = " + (t1.sum + t2.sum));  // 0 출력됨
		
		System.out.println("-- main end --");
	}

}



class T1 extends Thread { //Thread를 extends했기 때문에 스레드역할 가능

	int sum = 0;
	
	@Override
	public void run() {
		for(int i=1 ; i<100 ; i=i+2) {
			sum += i;
			System.out.print(Thread.currentThread() + "  ");
			System.out.println("1~" + i + " 홀수 합 : " + sum);
		}
	}
	
}

class T2 extends Thread {

	int sum = 0;
	
	@Override
	public void run() {
		for(int i=0 ; i<100 ; i=i+2) {
			sum += i;
			System.out.print(Thread.currentThread() + "  ");
			System.out.println("0~" + i + " 짝수 합 : " + sum);
		}
	}
	
}