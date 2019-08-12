package day08;

public class BlockTest {
	public static void main(String[] args) {
		Block b1 = new Block();
		Block b2 = new Block();
		Block b3 = new Block();
		Block b4 = new Block();
	}
}



class Block {
	
	
	static{ //생성자 보다 먼저 수행됨. 딱 한번 수행됨 -> 스태틱초기화블락
		System.out.println("static{   }");
	}
	
	{ //생성자 보다 먼저 수행됨. -> 초기화블락
	  //생성자 오버로딩 할 때, 생성자에 중복되는 코드들을 따로 뽑아서 쓰기에 적합.
		System.out.println("{    }");
	
	}
	
	public Block() {
		System.out.println("생성자");
	}
	
}