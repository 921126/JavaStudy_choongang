package day13.overload;

public class Basic {
	
	/*
	 * 오버로딩 - 같은 이름의 메서드를 여러개 만드는 방법
	 * 규칙
	 * 1. 반환유형 or 접근제어자는 영향을 미치지 않는다.
	 * 2. 매개변수 타입 or 종류 or 순서 중 한개만 다르면 된다.
	 * 
	 */
	
	void input(int a) {
		System.out.println("정수 1개 입력");
	}
	
//	int input(int a) {//불가능
//		return 0;
//	}
	
	void input(String s) { //가능
		System.out.println("문자열 1개 입력");
	}
	
	void input(String s, int a) {
		System.out.println("문자열 1개, 정수 1개 입력");
	}
	
	void input(int a, String s) {
		System.out.println("정수 1개, 문자열 1개 입력");
	}
	
	void input(double a, double b, int c) {
		System.out.println("실수 2개, 정수 1개 입력");
	}
	
	

}
