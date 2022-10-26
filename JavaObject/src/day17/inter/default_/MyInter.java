package day17.inter.default_;

public interface MyInter {

	//상수, 추상, default, static
	
	//상수
	double PI = 3.14;
	
	//추상메서드
	void some1();
	
	//default 메서드란? 인터페이스에도 몸체를 가지는 메서드 선언이 가능하다.
	//오버라이딩 필요X
	default void some2() {
		System.out.println("default 메서드 실행");
	}
	
	//static 메서드
	//오버라이딩 필요X
	static void some3() {
		System.out.println("static 메서드 실행");
	}
	
}
