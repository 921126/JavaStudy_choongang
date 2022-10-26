package day16.static_.singleton;

public class MainClass {

	public static void main(String[] args) {

		//기존 객체 선언방법
		//Singleton s = new Singleton();
		
		//static 싱글톤 선언
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
	
		System.out.println(s == s2);
		
		//동일한 변수가 사용된다.
		s.site = "이순신";
		System.out.println(s.site);
		System.out.println(s2.site);
	}
}

