package day15.poly.basic;

//하나의 클래스파일에 여러 클래스 선언이 가능하다.
//단, 파일명과 동일한 클래스가 public 이어야 한다.
class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Basic extends A { //사용자 클래스
	
	//다형성(클래스 형변환) > 자식의 주소가 부모에 저장되는 성질
	
	//멤버변수
	A a = new B();  //가능
	A a1 = new C(); //가능
	A a2 = new D(); //가능
	A a3 = new E(); //가능
	
	//다향성은 상속을 전제하로 한다.
//	B b = new A();  //불가능
//	B b1 = new C(); //불가능
	B b2 = new D(); //가능
//	B b3 = new E(); //불가능
	
	//Object형에는 모든 클래스를 저장할 수 있다.
	Object obj = 1;
	Object obj2 = 3.14;
	Object obj3 = "문자열";
	Object obj4 = new A();
	
}
