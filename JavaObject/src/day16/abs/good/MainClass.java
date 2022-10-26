package day16.abs.good;

public class MainClass {
	
	public static void main(String[] args) {
		
		//1. 추상클래스(부모클래스)는 객체 생성이 불가능하다.
		//2. 반드시 상속클래스(자식클래스)로 구체화 한다.
		
		SeoulStore ss = new SeoulStore();
		BusanStore b = new BusanStore();

		  ss.orange();
		System.out.println(ss.getName());	//상속받은 메서드
		ss.setName("또래오래");				//상속받은 메서드
		System.out.println(ss.getName());	
		
		b.apple();
		b.melon();
		b.orange();
	}
}
