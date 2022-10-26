package day14.modi.construct.pac1;

public class B {

	//같은 패키지 내 다른 클래스 생성자 불러오기
	A c = new A("a");	//프라이빗 불가능
	
	
	A b = new A(true); 	//디폴트 가능
	A a = new A(10); 	//퍼블릭 가능

}
