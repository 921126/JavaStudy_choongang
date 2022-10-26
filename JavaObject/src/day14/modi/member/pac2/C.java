package day14.modi.member.pac2;
import day14.modi.member.pac1.*;.

public class C {

	A a = new A();
	
	public C() {

		//변수의 사용
		a.var1 = 4;	//퍼블릭 사용가능
		a.var2 = 5;	//디폴트 사용 불가능
//		a.var3 = 6; //프라이빗 사용 불가능
	
		//메서드의 사용
		a.methode01(); //퍼블릭 사용가능
		a.methode02(); //디폴트 사용 불가능
//		a.methode03(); //프라이빗 사용 불가능

		
	}
}
