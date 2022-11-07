package day28.network.tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient { 
	//자기 컴퓨터에 전송할때는 127.0.0.1 이나 localhost라고 하면 된다. 172.30.1.28
	//외부의 컴퓨터에서 내 컴퓨터로 전송이 가능하도록 할 때는 방화벽을 해제해 줘야 한다.
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in);) {
			
			while(true) {
			
				Socket soket = new Socket(InetAddress.getByName("127.0.0.1"),9999); 
				
				System.out.print("보낼 메세지>");
				String m = sc.nextLine();
				
				//메세지 보내기
				PrintWriter pw = new PrintWriter(soket.getOutputStream(), true);
				pw.println(m + "\n");
				pw.flush();
				//pw.close();
				
				//메세지 받기
				BufferedReader br = new BufferedReader(new InputStreamReader(soket.getInputStream()));
				String response = br.readLine();
				System.out.println(response);
				
				//챗봇
				if(m.equals("저기요")) {
					System.out.println("왜요");
				}
				
				br.close();
				pw.close();
				soket.close();
			}

		} catch (Exception e) {
			System.out.println("메세지 전송 실패");
		}
		
	}
}
