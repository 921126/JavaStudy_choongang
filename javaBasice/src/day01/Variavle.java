package day01;

public class Variavle {
	
	public static void main(String[] args) {
	
		/*
		 * 변수란?
		 * 
		 * 변수는 선언과 초기화 과정을 가진다.
		 * 변수는 초기화 과정이 없으면 사용이 불가능하다.
		 * 변수 값은 언제든지 바뀔 수 있다.
		 * 
		 * 선언 방법?
		 * 타입 이름;
		 * 
		 * int는  정수를 저장하는 대표적 타입
		 * String은 문자열을 저장하는 대표적인 타입이다.
		 * 
		 * 초기화 방법
		 * @@ 자바에서 = 는 같다라는 뜻이 아닌 값을 이름에 넣겠다 라는 의미이다.
		 * 이름 = 값; 예제1.
		 * 선언과 초기화 한번에도 가능 예제2
		 * 
		 * 변수의 값 변경
		 * 
		 */
		
		
		//예제1. 변수 선언
		int num;
		num = 10;
		
		System.out.println(num);
		
		//예제2. 한번에 변수 선언과 초기화
		int num2 = 20;
		System.out.println(num2);
		
		//예제3. 변수의 값 변경 
		num2 = 100;
		System.out.println(num2);
		
		//변수에는 다른 변수의 값을 넣을 수 있다.
		int result = num2;
		System.out.println(result);
		
		//변수에는 연산의 결과도 저장할 수 있다.
		int result2 = num + num2;
		System.out.println(result2);
	
		//문자열 저장은 문자 타입 변수에 저장 해야 한다.
		
		//int str = "10"; 안됨
		//String str = "10";
		//변수는 타입이 다르면 바로 저장 할 수 없다.
		
		
	
	}

}
