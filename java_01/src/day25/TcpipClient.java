package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpipClient extends Thread{

	public static void main(String[] args) {
		
		String serverIp = "127.0.0.1"; //'나'를 의미.
//		String serverIp = "192.168.0.135"; 
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		Socket socket = null;
		
		Scanner scan = new Scanner(System.in);
		
		
		try {
			System.out.println(serverIp + "  연결 시도");
			socket = new Socket(serverIp, 7777); //연결 시도. socket에 연결정보 담김
			System.out.println("서버와 연결이 되었습니다.");
			
			
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			new ClientThread(br).start();
			
			System.out.println("이름을 입력하세요.");
//			bw.write("안도희" + "\n");
			bw.write(scan.nextLine() + "\n");
			bw.flush();
			
//			System.out.println(br.readLine());
			
			String msg = null;
			while(true) {
				System.out.println("메세지를 입력하세요. (종료 : q/Q )");
				msg = scan.nextLine();
				if(msg.equals("q")||msg.equals("Q")) {
					bw.write(" << 접속 종료 >> " + "\n");
					bw.flush();
					break;
				}
				bw.write(msg + "\n");
				bw.flush();
				
//				System.out.println(br.readLine());
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			 try {
				if(socket!=null) socket.close();
				if(br!=null) br.close();
				if(bw!=null) bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}




class ClientThread extends Thread{ //읽기 전용 스레드
	
	BufferedReader br = null;
	
	public ClientThread(BufferedReader br) {
		this.br = br;
	}



	@Override
	public void run() {
		String msg = null;
		
		try {
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
		} catch (IOException e) {
			
		}
	}
}