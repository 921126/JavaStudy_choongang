package day14.modi.protec.pac2;
import day14.modi.protec.pac1.A;

//protected는 상속받아 사용 가능하다.
public class C extends A{
	
	public C() {

		//패키지가 다르더라도 상속받으면 super 키워드를 통한 접근 가능
		super();
		super.s = "홍길동";
		super.method();
	}

}

