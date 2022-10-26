package day18.inter.inherit;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		MyClass me = new MyClass();
		me.some01();
		me.some02();
		me.some03();
		me.some04();
		me.some05();

		System.out.println("= = = = = 구분선 = = = = =");
		
		//Inter1, Inter2의 기능을 상속받으므로 전체 사용 가능.
		Inter3 i = new MyClass();
		i.some01();
		i.some02();
		i.some03();
		i.some04();
		i.some05();
		
		System.out.println("= = = = = 구분선 = = = = =");
		//Inter2의 기능만 사용 할 수 있다.(오버라이드 된 메서드 실행)
		Inter2 i2 = new MyClass();
		i2.some03();
		i2.some04();
		
		System.out.println("= = = = = 구분선 = = = = =");
		//Inter1의 기능만 사용 할 수 있다.(오버라이드 된 메서드 실행)
		Inter1 i3 = new MyClass();
		i3.some01();
		i3.some02();
	}

}
