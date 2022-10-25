package day10;

public class MethodEx03 {

	public static void main(String[] args) {
		/*
		 * 반환유형(return type)
		 * 1. 반환유형은 메서드가 돌려주는 값에 대한 타입이다.
		 * 2. 반환유형이 있는 메서드는 호출 구문이 값이 되기 때문에 메서드의 매개값으로 사용될 수 있다.
		 * 3. 모든 메서드는 return을 강제종료 된다.
		 * 4. 리턴문 아래에는 코드 작성이 불가능하다.(강제종료이므로)
		 */
		
//		int result = add(3,5);
//		System.out.println(result);
//		System.out.println(add(3,5));
		
		int result = add(add(1,2), add(2,3));
		System.out.println(result);
		
		sub(1,2);
		noReturn("hello");
		noReturn("bbye");
	}
	
	//매개변수 o 반환 o
	static int add(int a, int b) {
		return a+b;
	}

	//매개변수 o 반환 x > 리턴없는 메서드
	static void sub(int a, int b) {
		System.out.println("a-b=" + (a-b));
	}
	
	//void형에서 return - 종료
	static void noReturn(String s) {
		if(s.equals("hello")) {
			System.out.println("실행종료");
			return;//종료
		}
		System.out.println(s);
	}
	
}


