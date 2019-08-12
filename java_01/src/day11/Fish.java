package day11;

import day10.Animal;

public class Fish extends Animal{
	
		private String name;
		
		

		public Fish() { 
			super("물고기");
		}

		public Fish(String name) {
			super("물고기");
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
		
		public void fishPrint() {
			System.out.printf("[%s, %s]%n",kind, name);
		}
		
		
		//method 오버라이딩 - 부모로부터 물려받은 기능을 나의 상황에 맞게 재정의.
		//부모의 메소드 선언부를 그대로 유지해서 재정의함.
		@Override
		//오버라이딩이 제대로 됐는지 체크
		public void breath() {
			System.out.println(kind + " : 아가미로 숨쉬기~");
			
		}
		
		
		@Override
		public void print() {
//			System.out.printf("%s : %s%n", kind, name);
			this.fishPrint();
		}

}
