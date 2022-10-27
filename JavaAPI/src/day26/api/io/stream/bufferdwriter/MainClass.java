package day26.api.io.stream.bufferdwriter;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class MainClass {
	
	public static void main(String[] args) {
		try {
			//버퍼를 이용해서 출력하는 스트림 만들기(텍스트 파일로 제작)
			PrintStream ps = new PrintStream(new FileOutputStream("./buffer.txt"));
			
			//문자열 입력
			ps.print("문자열을 버퍼를 이용해서 출력");
			//바로 출력
			ps.flush();
			//닫기
			ps.close();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
	}
}
