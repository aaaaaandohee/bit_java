package day14_interface_clone;

import javax.swing.JOptionPane;

public class CommandTest {

	public static void main(String[] args) {
		Command cmd = null;
		String key = JOptionPane.showInputDialog("list / delete / insert / update 중 하나 입력하세요");
		
		switch (key) {
		case "list":
			cmd = new ListCommand();
			break;
		case "delete":
			cmd = new DeleteCommand();
			break;
		case "insert":
			cmd = new InsertCommand();
			break;
		case "update":
			cmd = new UpdateCommand();
			break;
		default:
			cmd = new ListCommand();
			break;
		}
		
		cmd.exec();
		cmd.check();
	}

}
