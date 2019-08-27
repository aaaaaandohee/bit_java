package day21_book_ex;


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
			output.setText("========= Book List =========\n");
			mgr.bookList().forEach(i -> output.append(i + "\n"));
			});
	
		
		add.addActionListener(
				e -> {
					int p = 0;
					try {
						p =  Integer.parseInt(price.getText());
					} catch (Exception e1) {
						output.setText("Book 등록 실패 \n");
						output.append("가격에 문자가 포함되면 안됩니다.\n");
						output.append(e1.getMessage());
						return;
					}
					
					
					boolean  b = mgr.addBook(new Book(++num, title.getText(), p));
					if(b) {
						output.setText("등록 성공");
					}else {
						output.setText("등록 실패");
					}
				}
		);
		
		delete.addActionListener(
				e -> {
					boolean b = mgr.deleteBook(title.getText());
					if(b) {
						output.setText("========== Book List =========\n");
						mgr.bookList().forEach(i -> output.append(i + "\n"));
					}else {
						output.setText("일치하는 title의 책이 없습니다.");
					}
				}
		);
		
		search.addActionListener(
				e -> {
					output.setText("========= Search =========\n");
					if(mgr.searchTitleBook(title.getText()).isEmpty()) output.append("일치하는 결과 없음");
					mgr.searchTitleBook(title.getText()).forEach(i -> output.append(i + "\n"));
				}
		);
		
		save.addActionListener(
				e -> {
					mgr.save();
					output.setText("<저장되었습니다.>");
				}
		);
		
		load.addActionListener(
				e -> {
					output.setText("========= Book List =========\n");
					mgr.load().forEach(i -> output.append(i + "\n"));
				}
		);
		
		exit.addActionListener(e -> System.exit(0));
		
		
		
	}
	
}

//class Autoload extends Thread {
//	@Override
//	public void run() {
//		BookMgr mgr = new BookMgr();
//		mgr.load();
////		mgr.save();
//	}
//}
//
//class Autosave extends Thread {
//	@Override
//	public void run() {
//		BookMgr mgr = new BookMgr();
////		mgr.load();
//		mgr.save();
//	}
//}





