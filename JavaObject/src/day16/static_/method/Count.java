package day16.static_.method;

public class Count {

	public int a;
	public static int b;
	
	//일반 메서드 - 일반변수, 정적변수 둘다 사용가능하다.
	public int some1() {
		
		a = 10;		//일반변수 사용가능
		return ++b; //정적변수 사용가능
	}
	
	//정적 메서드 - 정적변수만 사용가능(단, 객체생성시 일반변수 사용가능)
	public static int some2() {
//		a = 10;		//일반변수 사용 불가능
		
		Count c = new Count();	//객체생성
		c.a = 10;				//일반변수 사용 가능
		
		return ++b; //정적변수 사용 가능
	}
}
