package day26.api.io.serializable;

import java.io.Serializable;
import java.util.Date;

//인스턴스 단위로 읽고 쓰기 가능한 클래스 - Serializable 인터페이스 때문에
public class StudentDTO implements Serializable{

	private int num;
	private String name;
	private Date bday;
	
	//생성자
	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	//매개변수 있는 생성자
	public StudentDTO(int num, String name, Date bday) {
		super();
		this.num = num;
		this.name = name;
		this.bday = bday;
	}

	//게터세터
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBday() {
		return bday;
	}

	public void setBday(Date bday) {
		this.bday = bday;
	}

	
	@Override
	public String toString() {
		return "StudentDTO [num=" + num + ", name=" + name + ", bday=" + bday + "]";
	}

	
	

}
