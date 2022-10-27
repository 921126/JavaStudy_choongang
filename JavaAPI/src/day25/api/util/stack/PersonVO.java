package day25.api.util.stack;

import java.util.Date;

//여러 개의 값을 묶어서 표현하기 위한 클래스 - Value Object(VO)
//getter 와 constructor는 만들지만 setter는 만들지 않는 경우가 많다.
public class PersonVO {
	
	//번호, 이름, 생일, 전화번호, 성별을 저장
	private long num;
	private String name;
	private String gender;
	private Date birthday;
	private String phone;
	
	//기본 생성자 - default constructor 
	public PersonVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	//매개변수가 전부 있는 생성자(보통 데이터를 의미하는 클래스에서 많이 만듬) - AllArgsConsturctor
	public PersonVO(long num, String name, String gender, Date birthday, String phone) {
		super();
		this.num = num;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.phone = phone;
	}
	
	//읽기 전용으로 getter만 제작
	public long getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public String getPhone() {
		return phone;
	}
	
	//값을 빠르게 확인하기 위한 메서드
	//디버깅을 위한 메서드 - 개발 과정 중 값을 확인하기 위한 목적
	public String toString() {
		return "PersonVO [num=" + num + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday + ", phone="
				+ phone + "]";
	}
	
	
	
	
	
}
