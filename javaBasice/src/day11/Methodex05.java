package day11;

public class Methodex05 {
	
	public static void main(String[] args) {
		
		//메서드의 (동기적)실행 > 순서대로
		test01();
		
		//메서드의 재귀적 실행 > 자기 자신을 호출해서 무한 반복 .. 등차수열/등비수열과 같이 특정 규칙을 가진 프로그램을 만들때 사용한다.
		recursive(0);
		
		int result = fac(5);
		System.out.println(result);
	}
	
	static void test01() {
		System.out.println("1번 메서드 실행");
		test02();
		System.out.println("1번 메서드 종료");
	}
	
	static void test02() {
		System.out.println("2번 메서드 실행");
		System.out.println("2번 메서드 종료");
	}

	static void recursive(int a) {
		//재귀적 함수는 탈출할 구문을 반드시 명시해야 한다. **return 키워드 이용
		if(a == 10) return;
		
		System.out.println(a + "번 호출");
		a++; //1증가
		recursive(a);
	}
	
	static int fac(int a) { //팩토리얼 형식의 재귀적 함수 . 복잡한 규칙성을 만들때 사용
		
		if(a==1) return 1; //f(1) = 1
		return a * fac(a-1);
	}
}
