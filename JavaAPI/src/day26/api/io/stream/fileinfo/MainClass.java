package day26.api.io.stream.fileinfo;

import java.io.File;
import java.util.Date;

public class MainClass {
	
	public static void main(String[] args) {
		//파일에 대한 정보 확인
		
		try {
			//windows에서는 디렉토리 구분기호가 \인데
			//프로그래밍 언어에서는 \가 오고 하나의 문자가 오면 제어문자로 인식하므로 \\으로 입력해야한다.
			
			//File인스턴스 생성
			File f = new File("C:\\Users\\nabom\\OneDrive\\Desktop\\자바 공부\\20220920_공부해야할것.txt");

			//파일의 존재 여부 확인(있다면 true)
			System.out.println(f.exists());
			
			//마지막 수정 날짜
			System.out.println(f.lastModified());			//단순 데이터 비교시
			System.out.println(new Date(f.lastModified())); //정확한 날짜로 확인이 필요할때
			
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
	}

}
