package day17.inter.basic;

public class MainClass {
	
	public static void main(String[] args) {

		//인터페이스는 객체 생성이 불가능하다.
		//Inter1 = new Inter1();

		//인터페이스도 부모 타입이 될 수 있다.
		//부모 타입으로 선언된 인터페이스는 본인 타입의 기능만 사용 가능하다.
		Inter1 i = new Basic();
		i.method01();
//		i.method02();
		
		//인터페이스가 적용된 클래스 사용하기.
		Basic b = new Basic();
		b.method01();
		b.method02();

		//인터페이스의 형변환
		Inter2 i2 = b; //클래스 형변환
		i2.method02();
		
		Basic bb = (Basic)b; //클래스 형변환
	
	}
}
