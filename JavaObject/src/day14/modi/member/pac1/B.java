package day14.modi.member.pac1;

public class B {

	//같은 패키지 다른 클래스 접근
	A a = new A();
	
	//생성자
	public B() {
		//변수의 사용
		a.var1 = 4;	//퍼블릭 사용가능
		a.var2 = 5;	//디폴트 사용가능
//		a.var3 = 6; //프라이빗 사용 불가능
	
		//메서드의 사용
		a.methode01(); //퍼블릭 사용가능
		a.methode02(); //디폴트 사용가능
//		a.methode03(); //프라이빗 사용 불가능
	}


}
