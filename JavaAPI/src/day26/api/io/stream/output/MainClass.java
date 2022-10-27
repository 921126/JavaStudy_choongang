package day26.api.io.stream.output;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class MainClass {
	
	public static void main(String[] args) {
		
		//바이트 단위로 파일에 기록하기
		try {
			//오늘 날짜를 문자열로 만들기
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh-mm");
			
			//uuid로 만들기
			String file = UUID.randomUUID().toString();
			
			//기록할 파일 만들기
			//FileOutputStream fos = new FileOutputStream("./" + sdf.format(date)  + ".txt" , true);
			FileOutputStream fos2 = new FileOutputStream("./" + file + ".txt", true); 
			//기록할 메세지 생성
			String str = "안녕하세요\n";
			String str2 = "제 이름은 오하영이에요.";
			
			//파일에 기록
			//fos.write(str.getBytes());
			fos2.write(str2.getBytes());
			
			//파일 닫기
			fos2.close();
		
		} catch (Exception e) {
			System.out.println("파일 기록(출력) 실패> " + e.getLocalizedMessage());
		}
		
	}
}
