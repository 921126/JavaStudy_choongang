package day17.inter.basic;

//인터페이스는 implements키워드로 상속받아 사용한다.
public class Basic implements Inter1, Inter2{

	@Override
	public void method01() {
		System.out.println("인터페이스(추상 메서드) 오버라이딩 메서드 1번");
	}

	@Override
	public void method02() {
		System.out.println("인터페이스(추상 메서드) 오버라이딩 메서드 2번");
	}

	
}
