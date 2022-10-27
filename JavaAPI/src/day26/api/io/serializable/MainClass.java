package day26.api.io.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./multiObj.txt"));) {
			//인스턴스 단위로 파일에 기록할 수 있는 객체를 생성
			//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./multiObj.txt"));
			
			//기록할 인스턴스 생성
			StudentDTO dto = new StudentDTO(1,"학생1", new Date());
			StudentDTO dto2 = new StudentDTO(2,"학생2", new Date());
			
			//기록한 인스턴스가 여러개 이므로 하나의 List로 묶어준다.
			ArrayList<StudentDTO> list = new ArrayList<>();
			list.add(dto);
			list.add(dto2);
			
			//기록
			oos.writeObject(list);
			
			//oos.close();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
	
		
		//읽기 기능
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./multiObj.txt"));) {
			//인스턴스 단위로 파일을 읽을 수 있는 객체를 생성
			//ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./multiObj.txt"));
			
			//읽을기록 가져오기
			ArrayList list = (ArrayList)ois.readObject();
			
			for(Object obj : list) {
				System.out.println(obj);
			}
			
			//ois.close();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
	}
}
