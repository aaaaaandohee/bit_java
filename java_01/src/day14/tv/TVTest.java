package day14.tv;

public class TVTest {

	public static void main(String[] args) {
		
//		TV user = new STV();
		
		play(new STV()); //play메소드는 세개의 타입 모두 처리 가능.
		play(new LTV());
		play(new ITV());
		
		/*
		user = new LTV();
		user.poweron();
		user.poweroff();
		
		user = new ITV();
		user.poweron();
		user.poweroff();*/
	}
	
	public static void play(TV tv) { //세개의 타입이 모두 처리가능한데, 오버로딩 아니므로 부모타입이 매개변수.
		tv.poweron();
		tv.poweroff();
	}

}
