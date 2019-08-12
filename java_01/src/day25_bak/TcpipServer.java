package day25_bak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpipServer {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		Socket socket = null;
		
		Scanner scan = new Scanner(System.in);
		
		
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 준비되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		while(true) {
			try {
				System.out.println("Client 요청을 기다립니다.");
				socket = serverSocket.accept(); //클라이언트가 들어오기를 기다리고 있음. 들어오면 클라이언트 연결정보 저장됨.
//				System.out.println(socket.getInetAddress() + " 와 연결중입니다.");
				
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				
				
//				System.out.println("이름를 입력하세요." + "\n");
				String name = br.readLine();
				
				
				System.out.println(name + "님이 접속했습니다." + "\n");//client가 readline을 하고있기 때문에 줄의 끝 알리는 \n 넣어야함.
				
				bw.write(name + " 안녕~" + "\n");
				bw.flush(); //해줘야 됨. 버퍼가 차는 것을 언제까지 기다릴 수 없기 때문에.
				
				String msg = null;
				while(true) {
					msg = br.readLine();
					System.out.println((name + " : " + msg + "\n"));
					
					bw.write(name + " : " + msg + "\n");
					bw.flush();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				
			}
		}
	}

}
