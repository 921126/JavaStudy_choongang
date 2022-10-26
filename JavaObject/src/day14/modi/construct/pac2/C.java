package day14.modi.construct.pac2;

import day14.modi.construct.pac1.A;

public class C {
	
	//다른 패키지 내 다른 클래스 생성자 가져오기
	A b = new A(true); 	//디폴트 불가능
	
	
	A c = new A("a");	//프라이빗 불가능
	A a = new A(10); 	//퍼블릭 가능


}