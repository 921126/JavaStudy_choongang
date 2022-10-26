package day16.final_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Person hong = new Person("123123-123123" , "홍길동");
//		hong.nation = "김김김";		//값의 변경 불가능
//		hong.ssn = "999999-";		//값의 변경 불가능
	
		Person park = new Person("222222-222222" , "박찬호");
		
		System.out.println(hong.ssn);
		System.out.println(park.ssn);
		
		//////////////////////////////////////
		
		//상수의 사용
		System.out.println(Constant.PI);
		System.out.println(Constant.EARTH_RADIUS);
		System.out.println(Constant.O2);
		
		
		
		
		
	}
}

