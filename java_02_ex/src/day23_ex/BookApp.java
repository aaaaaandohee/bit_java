package day23_ex;


import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BookApp {
	static int isbn = 0;
	
	public static void main(String[] args) {
		
        new Gui();
       
        
	
	}
}

class Gui extends JFrame{
	
	static int num = 0;
	BookMgr mgr;
	JButton add, list, delete, search, exit, save, load;
	TextField title, price, isbn;
	TextArea output;
	
	class Autosave extends Thread {
		
		public void run() {
			while(true) {
				mgr.save();
				try {
					Thread.sleep(8000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	Gui(){
		mgr = new BookMgr();
		
		Panel p1 = new Panel();
		p1.add(add = new JButton("ADD"));
		p1.add(list = new JButton("LIST"));
		p1.add(delete = new JButton("DELETE"));
		p1.add(search = new JButton("SEARCH"));
		p1.add(save = new JButton("SAVE"));
		p1.add(load = new JButton("LOAD"));
		p1.add(exit = new JButton("EXIT"));
		add(p1, BorderLayout.SOUTH);
		
		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(3, 2));
		p2.add(new JLabel("I S B N"));
		p2.add(isbn = new TextField(20));
		p2.add(new JLabel("T I T L E"));
		p2.add(title = new TextField(20));
		p2.add(new JLabel("P R I C E"));
		p2.add(price = new TextField(20));
		add(p2, BorderLayout.NORTH);
		
		add(output = new TextArea(15, 40));
		output.setFont(new Font(null, 1, 20));
		
		pack(); //알아서 사이즈 설정하는 명령어
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임의 X가 동작함.
		
		
		
		
		list.addActionListener( e -> {
			output.setText(" === BookList === \n");
			mgr.getBookList().forEach(i -> {
				output.append(i + "\n");
			});
		});
		
		add.addActionListener(e -> {
			mgr.add(new Book(title.getText(), Integer.parseInt(price.getText())));
			output.setText("저장 완료 ");
		});
		
		exit.addActionListener(e -> {
			mgr.save();
			System.exit(0);
		});
		
		
		
	}
	



}





