package day04;

public class Test03 {

	public static void main(String[] args) {
		
		
		OUT:for(int i=1; i<10; i++) { //for문에 OUT이라는 이름을 달아줌 : 라벨링
			
			for(int j=2; j<10; j++) {
				
//				if(j==5) break; //j가 5면 해당 for문 빠져나옴
				if(j==5) break OUT; //j가 5면 해당 OUT라벨링 되어있는 for문 빠져나옴
//				if(j==5) continue; //5단만 출력 안됨 for문의 증감식으로 넘어감 
				
//				System.out.print(j + "*" + i + "=" + j*i + "\t" + "|");
				System.out.printf("%d*%d=%2d |",j,i,j*i); //%2d => 두자리를 확보하여 단이 흐트러지는 것 방지
			}
			System.out.println("");
		}
	}

}
