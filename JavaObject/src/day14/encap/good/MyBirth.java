package day14.encap.good;

public class MyBirth {

	//멤버변수
	private int year;
	private int month;
	private int day;
	private String ssn; //주민번호
	
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMonth(int month) {
		if(month > 12 || month <1) {
			System.out.println("월은 1~12월 까지입니다.");
		}else {
			this.month = month;
		}
	}
	
	public void setDay(int day) {
		if(day > 31 || day < 1) {
			System.out.println("일자는 1~31일 까지입니다.");
		}else {
			this.day = day;
		}
	}
	
	public void setSsn(String ssn) {
		String result = ssn.replace("-", "");
			if(ssn.length() != 13) {
				System.out.println("주민번호는 하이픈을 제거하고 13자리까지만 저장가능합니다.");
			}else {
				this.ssn = result;
			}
	}
	
	/*
	 * getter 메서드
	 * 1. 값을 조회하는 메서드
	 * 2. public으로 선언하고 get + 멤버변수명으로 저장한다.
	 */
	
	public int getYear() {
		return this.year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public String getSsn() {
		return ssn;
	}
}
/*
 * getter/setter메서드를 사용한다.
 * 은닉된 변수에 접근할 때 클래스 설계자가 만들어 놓은
 * 
 * 국룰 > get시작(값) = 값을 얻는다.
 * 국룰 > set시작(값) = 값을 저장한다.
 * 
 * set메서드 제작방법
 * 1. 값을 저장하는 메서드
 * 2. public으로 선언하고 set + 멤버변수명으로 저장한다.
 *
 *
 */
