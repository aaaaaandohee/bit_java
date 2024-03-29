package day22_io;

import java.io.File;
import java.util.Date;


public class Test01 {

	public static void main(String[] args) {
		
		File dir = new File("c:\\");
		String[] list = dir.list();
		
		File file = null;
		Date date = null;
		for(String data : list) {
			file = new File(dir,data); //dir폴더 안에 있는 data
			System.out.print(file.getName() + "\t");
			System.out.print(file.length() + "\t");
			date = new Date(file.lastModified());
			System.out.print(date + "\t");
			
			if(file.isDirectory()) System.out.println("<dir>");
			System.out.println();
		}
	}

}
