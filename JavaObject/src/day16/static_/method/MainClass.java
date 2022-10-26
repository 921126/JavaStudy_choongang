package day16.static_.method;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		//기존 메서드 호출
		Count c = new Count();
		c.some1();	//일반메서드
		c.some2();	//정적메서드
		
		//static 메서드 호출방법 > 클래스명.메서드();
		Count.some2();
		
		//현재 b는? 3
		
		//main은 static이기 때문에 
		a();
		
		//static 사용방법
		Math.random();
		Integer.parseInt("3");
		Arrays.toString(new int[3]);
	}
	
	public static void a() {
		
	}
}
