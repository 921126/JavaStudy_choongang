package day26.api.io.stream.input;

import java.io.FileInputStream;

public class MainClass {
	
	public static void main(String[] args) {
		
		//작성된 파일 읽기
		try {
			//읽기 위한 파일 생성
			FileInputStream fis = new FileInputStream("./2022-10-27-11-41.txt");
			
			//읽어서 저장할 바이트 배열 생성
			byte[] b = new byte[fis.available()];
			
			//읽기
			fis.read(b);
			
			//읽어온 내용 출력을 위해 형변환 인코딩을 진행
			System.out.println(new String(b));
			
			fis.close();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}
}
