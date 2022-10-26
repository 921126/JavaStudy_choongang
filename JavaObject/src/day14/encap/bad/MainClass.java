package day14.encap.bad;

public class MainClass {

	public static void main(String[] args) {
		
		//변수를 public으로 만들면, 잘못된 값이 저장될 수 있다.
		MyBirth mb = new MyBirth();
		mb.year = 2023;
		mb.month = 13;
		mb.day = 32;
		mb.ssn = "아무값";
		
		mb.info();
		
	}
}
