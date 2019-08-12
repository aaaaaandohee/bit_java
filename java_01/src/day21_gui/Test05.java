package day21_gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test05 {

	public static void main(String[] args) {
		new UI_5().createUI(); //createUI()는 사용자 정의 메소드이기 때문에 호출해줘야 함.
	}
}


class UI_5 extends JFrame implements ActionListener{ // => is a 관계
	//ActionListener가 가진 추상메소드 오버라이딩 하겠다는 의미.
	//앞에 J붙으면 Swing => JFrame
	
	JButton red, blue, exit;
	TextField msg;
	TextArea output;
	
	Panel p1, p2;
	
	void createUI(){
		super.setTitle("awt UI Test ~~"); //frame을 extands했기 때문에 생성자 호출해서 생성.
		p1 = new Panel(); //panel생성
		p1.add(red = new JButton("RED")); //panel에 버튼 추가
		p1.add(blue = new JButton("BLUE")); //panel에 버튼 추가
		p1.add(exit = new JButton("종료")); //panel에 버튼 추가
		add(p1, BorderLayout.SOUTH); //버튼세개가 추가된 panel을 나에게 추가 , 방향 조정
		
		p2 = new Panel();
//		p2.setLayout(new GridLayout(1, 2)); //GridLayout 등 레이아웃 지정 안하면 디폴드 - FlowLayout
		p2.add(new JLabel("메세지창"));
		p2.add(msg = new TextField(20));
		add(p2, BorderLayout.NORTH);
		
		add(output = new TextArea(15, 40));
		output.setFont(new Font("SansSerif", 1, 20));
		
		setSize(300, 300);
		setVisible(true);
		
		
		red.addActionListener(this);
		blue.addActionListener(this);
		exit.addActionListener(this);
		
		
		
		
//		f1.addWindowListener(new WindowEventP());
		
		
		
//		addWindowListener(new WindowAdapter() { //WindowAdapter를 extends한 익명클래스
//			public void windowClosing(WindowEvent e) { 
//				setVisible(false); //일단 눈에 안보이게 함.
//				dispose(); //UI 파괴하는 작업
//				System.exit(0);
//			}
//		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrame에 추가된 종료 동작. 위의 것과 같은 기능.
		
		
		msg.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				output.append(msg.getText() + "\n");
				msg.setText("");
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










