package day17.inter.basic;

public interface Inter1 {
	//인터페이스는 객체 생성이 불가능하다.
	//상수, 추상메서드 + (Default메서드, static메서드)
	
	//인터페이스에 변수를 선언하면 public 상수로 선언된다.
	//그렇기 때문에 초기화 작업이 필수로 필요하다.
	double PI = 3.14;
	
	//인터페이스에 메서드를 선언하면 추상 public 메서드가 된다.
	//그렇기 때문에 꼭 오버라이딩이 필요하다.
	void method01();
	
	
}
