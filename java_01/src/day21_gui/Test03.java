package day21_gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test03 {

	public static void main(String[] args) {
		new UI_3();
	}
}


class UI_3 extends Frame implements ActionListener{ // => is a 관계
	//ActionListener가 가진 추상메소드 오버라이딩 하겠다는 의미.
	
	Button red, blue, exit;
	Panel p1;
	
	UI_3(){
		super("awt UI Test ~~"); //frame을 extands했기 때문에 생성자 호출해서 생성.
		p1 = new Panel(); //panel생성
		p1.add(red = new Button("RED")); //panel에 버튼 추가
		p1.add(blue = new Button("BLUE")); //panel에 버튼 추가
		p1.add(exit = new Button("종료")); //panel에 버튼 추가
		add(p1, BorderLayout.SOUTH); //버튼세개가 추가된 panel을 나에게 추가 , 방향 조정
		
		setSize(300, 300);
		setVisible(true);
		
		
		red.addActionListener(this);
		blue.addActionListener(this);
		exit.addActionListener(this);
		
		
		
		
//		f1.addWindowListener(new WindowEventP());
		
		addWindowListener(new WindowAdapter() { //WindowAdapter를 extends한 익명클래스
			public void windowClosing(WindowEvent e) { 
				setVisible(false); //일단 눈에 안보이게 함.
				dispose(); //UI 파괴하는 작업
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "RED":
			p1.setBackground(Color.RED);
			break;
		case "BLUE":
			p1.setBackground(Color.BLUE);
			break;
		case "종료":
			System.exit(0);
			break;
		default:
			break;
		}
	}
	
	
	
	
	
	
	/*
	//class WindowEventP implements WindowListener{
	class WindowEventP extends WindowAdapter{ //WindowAdapter는 WindowListener를 implements했음. -> 필요한 함수만 놔두고 다른 함수 지워도 에러 안뜸.
	//f1에 접근하기 위해 이너클래스로 넣음.
		
		@Override
		public void windowClosing(WindowEvent e) {
//			f1.setVisible(false); //일단 눈에 안보이게 함.
//			f1.dispose(); //UI 파괴하는 작업
			System.exit(0);
		}
		
		
	}*/
	
	
	
}










