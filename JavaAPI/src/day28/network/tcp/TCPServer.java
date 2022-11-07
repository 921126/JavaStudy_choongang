package day28.network.tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	
	public static void main(String[] args) {
		
		//try ~ resources 구문으로 메모리 해제하지 않아도됨
		
		try (ServerSocket ss = new ServerSocket(9999);){
			System.out.println("서버 대기 중");
			
			//클라이언트의 요청 대기
			try {
				Socket sk = null;
				while(true) {
					//클라리언트의 요청을 대기하다가 클라리언트의 요청이 오면 접속됨
					sk = ss.accept();
					//접속자 정보 출력
					System.out.println("접속자 정보:" + sk.toString());
					//접속자와 문장ㄹ을 읽을 수 있는 스트림을 생성
					BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
					//한줄 메세지 읽기
					String m = br.readLine();
					System.out.println(m);
				
					
					//메세지를 보낼 수 있는 스트림을 생성
					PrintWriter pw = new PrintWriter(sk.getOutputStream());
					pw.println("서버가 보내는 메세지");
					pw.flush();
					
					
					//정리작성
					pw.close();
					br.close();
					sk.close();
				}
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
