package day14.modi.protec.pac1;

public class A {

	
	//멤버변수
	protected String s;
	//생성자
	protected A() {
		
	}
	//메소드
	protected void method() {
		
	}

	/*
	 * protected는 기본적으로 같은 패키지에서만 사용 가능하다.(defult와 동일)
	 * 단, 패키지가 다르더라도 상속 관계에서 super를 통한 접근은 가능함
	 * 
	 */
	//초록색은 퍼블릭이다.
	//빨강색은 프라이빗이다.
	//파란색은 디폴트이다.
	//노란색은 프로텍티드이다.
}
