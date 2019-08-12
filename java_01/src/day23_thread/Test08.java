package day23_thread;

public class Test08 {

	public static void main(String[] args) {
		
//		System.out.println(Thread.MAX_PRIORITY); //우선순위 10
//		System.out.println(Thread.MIN_PRIORITY); //1
//		System.out.println(Thread.NORM_PRIORITY); //5
		
		System.out.println("-- main start --");
		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		Thread.yield(); //무시됨 => 실행대기큐에 아무도 기다리고 있지 않기 때문에 무시됨.
		System.out.println(Thread.currentThread()); //현재 cpu점유한 스레드 
		
		//스레드 생성
		Job1 job1 = new Job1();
		Thread t1 = new Thread(job1);

		Job2 job2 = new Job2();
		Thread t2 = new Thread(job2);
		
		//스레드 실행대기 큐에 넣기
		t1.start();
		t2.start();
		
		
		try { 
			t1.join(); //수행이 끝나야 밑에 있는 것들이 수행됨. => 홀수합짝수합 완벽하게 출력됨
			t2.join(); //수행이 끝나야 밑에 있는 것들이 수행됨. => 홀수합짝수합 완벽하게 출력됨
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("홀수 합 + 짝수 합 = " + (job1.sum + job2.sum)); // 0 출력됨
		
		System.out.println("-- main end --");
	}

}



class Job1 implements Runnable {

	int sum = 0;
	
	@Override
	public void run() {
		for(int i=1 ; i<100 ; i=i+2) {
			sum += i;
			System.out.print(Thread.currentThread() + "  ");
			System.out.println("1~" + i + " 홀수 합 : " + sum);
			Thread.yield();
		}
	}
	
}

class Job2 implements Runnable {

	int sum = 0;
	
	@Override
	public void run() {
		for(int i=0 ; i<100 ; i=i+2) {
			sum += i;
			System.out.print(Thread.currentThread() + "  ");
			System.out.println("0~" + i + " 짝수 합 : " + sum);
			Thread.yield();
		}
	}
	
}