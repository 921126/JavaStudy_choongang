package day25.api.util.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class MainClass {
	
	public static void main(String[] args) {
		
		//프로퍼티스 인스턴스 생성
		Properties pp = new Properties();
		
		//없는 키를 사용하면 null이 리턴
		System.out.println(pp.getProperty("도도"));
		
		//데이터 저장
		pp.setProperty("도도", "귀염둥이");
		System.out.println(pp);
		
		//텍스트 파일로 저장
		try {
			//현재 작업 디렉토리에 파일로 저장
			//git에 연결된 사람은 workspace가 아닌 git 디렉토리에 있을 수도 있다.
			pp.store(new FileOutputStream("./myproject.properties"), "why only eng?");
			System.out.println("텍스트로 저장이 되부렀어요!");
		} catch (Exception e) {
			System.out.println("오류에용");
			System.out.println(e.getMessage());
		} 
		
		//XML파일로 저장
		try {
			pp.storeToXML(new FileOutputStream("./myproject.xml"), "XML로 저장할테야");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
