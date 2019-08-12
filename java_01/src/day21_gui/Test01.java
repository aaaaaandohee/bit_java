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

public class Test01 {

	public static void main(String[] args) {
		new UI_5();
	}
}


class UI_1{
	
	Frame f1;
	Button red, blue, exit;
	Panel p1;
	
	UI_1(){
		f1 = new Frame("awt UI Test ~~"); //frame생성
		p1 = new Panel(); //panel생성
		p1.add(red = new Button("RED")); //panel에 버튼 추가
		p1.add(blue = new Button("BLUE")); //panel에 버튼 추가
		p1.add(exit = new Button("EXIT")); //panel에 버튼 추가
		f1.add(p1, BorderLayout.SOUTH); //버튼세개가 추가된 panel을 frame에 추가 , 방향 조정
		
		f1.setSize(300, 300);
		f1.setVisible(true);
		
		
		red.addActionListener(new ActionListener() { //ActionListener는 추상메소드가 하나뿐이기때문에 ActionAdapter는 존재하지않음.
			@Override
			public void actionPerformed(ActionEvent e) {
				p1.setBackground(Color.RED);
			}
		});
		
		blue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				p1.setBackground(Color.BLUE);
			}
		});
		
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		
		
//		f1.addWindowListener(new WindowEventP());
		
		f1.addWindowListener(new WindowAdapter() { //WindowAdapter를 extends한 익명클래스
			public void windowClosing(WindowEvent e) { 
				f1.setVisible(false); //일단 눈에 안보이게 함.
				f1.dispose(); //UI 파괴하는 작업
				System.exit(0);
			}
		});
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

//class WindowEventP implements WindowListener{
class WindowEventP extends WindowAdapter{ //WindowAdapter는 WindowListener를 implements했음. -> 필요한 함수만 놔두고 다른 함수 지워도 에러 안뜸.
//f1에 접근하기 위해 이너클래스로 넣음.
		
		@Override
		public void windowClosing(WindowEvent e) {
//			f1.setVisible(false); //일단 눈에 안보이게 함.
//			f1.dispose(); //UI 파괴하는 작업
			System.exit(0);
		}
		
		
}










