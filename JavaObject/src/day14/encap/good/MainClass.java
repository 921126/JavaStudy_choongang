package day14.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		 
		MyBirth me = new MyBirth();
		me.setYear(1992);			//set
		int year = me.getYear();	//get
		
		me.setMonth(11);
		int month = me.getMonth();

		me.setDay(26);
		int day = me.getDay();
		
		//me.setSsn("921126-1267");
		//String ssn = me.getSsn();
		
		
		System.out.println(year +"년도 " + month + "월 " + day + "일생");
		//System.out.println("주민번호: " + ssn);
	}
}
