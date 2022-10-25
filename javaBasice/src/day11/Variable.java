package day11;

public class Variable {

	//멤버변수: 초기화를 하지 않으면 기본값으로 자동 초기화
	String a;
	
	void printNum(int c) {
		int b =10; //지역변수는 초기값이 지정되어야 사용 가능하다.
		System.out.println("멤버변수:" + a);
		System.out.println("지역변수:" + b);
		System.out.println("매개변수:" + c);//매개변수도 지역변수의 일종이다.
	}
}


