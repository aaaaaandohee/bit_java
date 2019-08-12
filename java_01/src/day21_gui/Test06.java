package day21_gui;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.stream.Stream;


public class Test06 {

	public static void main(String[] args) {
		
		new DrawImg();
	}

}


class DrawImg extends Frame{
	
	Image im;
	
	
	DrawImg(){
		
		super.setTitle("DrawImg");
		
		im = Toolkit.getDefaultToolkit().getImage("c://img/cat.jpg");
		
		String[] fontlist = Toolkit.getDefaultToolkit().getFontList(); //줄 그어진 것 - deprecated된 API -> 이제는 사용하지 않음.
		Stream.of(fontlist).forEach(i -> System.out.println(i)); //폰트 리스트 출력
		
		setSize(500, 500);
		setVisible(true);
		
		
		repaint(); // **내부적으로 알아서 paint 함수를 호출해줌**
		
		addWindowListener(new WindowAdapter() { //WindowAdapter를 extends한 익명클래스
			public void windowClosing(WindowEvent e) { // 종료버튼 동작
				setVisible(false); //일단 눈에 안보이게 함.
				dispose(); //UI 파괴하는 작업
				System.exit(0);
			}
		});
		
		
	}
	
	public void paint(Graphics g) { // 이미지 그리려면 이 함수 호출해야함.
		g.drawImage(im, 20, 20, 450, 400, this);
	}
}
