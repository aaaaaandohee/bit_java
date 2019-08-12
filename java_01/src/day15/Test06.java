package day15;

import javax.swing.JOptionPane;

public class Test06 {

	public static void main(String[] args) {
		String msg = JOptionPane.showInputDialog("1.list  2.update  3.insert  4.delete q.quit");
		
		Command list = () -> System.out.println(" *** list ***");
		
		Command update = () -> {
				                 System.out.println(" *** update ***");
							   };
		
		Command insert = () -> System.out.println(" *** insert ***");
		       
		Command delete = () -> System.out.println(" *** delete ***");

		 
		switch (msg) {
		case "1":
			list.exec();
			break;
		case "2":
			update.exec();
			break;
		case "3":
			insert.exec();
			break;
		case "4":
			delete.exec();
			break;
		
		default:
			list.exec();
			break;
		}
		
		
	
	}

}
