package day21_ex;


import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BookApp {
	
	public static void main(String[] args) {
        
		new UI().createUI();
		
		}
	}



class UI extends JFrame implements ActionListener{
	
	JButton insert, delete, list, search ,q;
	TextArea output;
	JTextField titlet;
	JTextField pricet;
	
	Panel p1, p2;
	
	void createUI() {
		
		super.setTitle("BOOK APP");
		p1 = new Panel();
		p1.add(insert = new JButton("insert"));
		p1.add(delete = new JButton("delete"));
		p1.add(list = new JButton("list"));
		p1.add(search = new JButton("search"));
		p1.add(q = new JButton("q"));
		
		p2 = new Panel();
		p2.add(new JLabel("책 제목"));
		p2.add(titlet = new JTextField(20));
		p2.add(new JLabel("가격"));
		p2.add(pricet = new JTextField(20));
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.BEFORE_LINE_BEGINS);
		add(output = new TextArea(20, 30), BorderLayout.SOUTH);
		
		
		insert.addActionListener(this);
		delete.addActionListener(this);
		list.addActionListener(this);
		search.addActionListener(this);
		q.addActionListener(this);
		
		setSize(600, 600);
		setVisible(true);
		
		output.append("*******  명령 선택   ********\n");
		output.append("1. insert(등록) \n");
		output.append("2. delete(삭제) \n");
		output.append("3. list(목록) \n");
		output.append("4. search(검색) \n");
		output.append("q. quit(종료)   \n");
		output.append("************************** \n\n");
		output.append("수행할 명령을 선택하세요!\n ");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		BookMgr2 mgr = new BookMgr2();
		int isbn = 0;
		
			
			
			switch (e.getActionCommand()) { 
			case "insert":
				output.append("insert 작업을 수행하는 기능 호출\n");
				output.append("Book title 입력하세요\n");
				output.append("Book 가격  입력하세요\n");
				String title = String.valueOf(titlet.getText());
				String price = String.valueOf(pricet.getText());
				mgr.addBook(new Book(++isbn,title,price));
				break;
				
			case "delete":
				output.append("delete 작업을 수행하는 기능 호출\n");
				output.append("삭제할 Book title 입력하세요\n");
				title = titlet.getText();
				mgr.deleteBook(title);
				break;
				
			case "list":
				output.append("목록 출력 작업을 수행하는 기능 호출\n");
				output.append(mgr.bookListPrint());
				break;
				
			case "search":
				output.append("검색 작업을 수행하는 기능 호출\n");
				output.append("검색할  title 입력하세요\n");
				title = titlet.getText();
				output.append(mgr.searchTitleBook(title));
				break;
				
			case "q":
				output.append("App 종료\n");
				System.exit(0); // App 종료 
				break;
				
			default:
				output.append("잘못된 입력입니다.\n");
				break;
			}
			output.append("=======================================\n");
		
	
	}
}
