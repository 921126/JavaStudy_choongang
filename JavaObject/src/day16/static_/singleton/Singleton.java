package day16.static_.singleton;

public class Singleton {
	
	//디자인패턴 - 클래스를 설계하는 기법이다.
	//싱글톤패턴 - 객체를 1개만 생성되도록 설계하는 기법
	
	//1. 나 자신을 객체 멤버변수로 선언하고, 1개로 고정한다.
	private static Singleton instance = new Singleton();
	
	//2. 객체생성을 못하도록 생성자를 private처리한다.
	private Singleton() {}
	
	//3. 변수(객체 본인)를 getter로 반환
	public static Singleton getInstance() {
		return instance;
	}
	
	public String site = "aaa";
}

