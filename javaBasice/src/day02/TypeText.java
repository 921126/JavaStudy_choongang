package day02;

public class TypeText {

	public static void main(String[] args) {

		// 문자열의 원리
		// 단일 문자를 저장하는 char

		char c1 = 'A';
		char c2 = 65;	//문자를 저장하는 문자열 char을 이용하여 변수를 선언하였기 때문에 65가 나온다. **아스키코드 참조
		
		System.out.println(c1);
		System.out.println(c2);
		// 아스키코드 -> 유니코드의 등장으로 2byte로 확장되고 부호없는 비트값 65536개의 문자를 표기
		
		char c3 = '가';
		char c4 = 44032;	// 유니코드 숫자값
		char c5 ='\uAC00';  //유니코드 형태
		
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c3 + "-" + c4 + "-" + c5);
		
		System.out.println("---------------------------------------------------");
		
		String s1 = "hello";
		String s2 = " world"; //공백도 문자로 인식함.
		
		System.out.println(s1);
		System.out.println(s1 + s2); //문자열은 +로 연결하면 붙인 결과를 가져온다.
		
		//문자열의 길이를 확인 length() ** 기억하고 외워야 하는 함수!
		System.out.println(s1.length());
		
		
		//문자열과 다른 타입의 + 연산
		System.out.println(100+200);			// 숫자+숫자 
		System.out.println("100"+200);			// 문자+숫자 -- 문자는 가장 강력한 타입이여서 결과는 무조건 문자열이 된다.
		System.out.println(100+200+"world");	// 숫자+숫자+문자 
		System.out.println("hello"+100+200); 	// 문자+숫자+숫자 -- 문자열이 먼저 나오게된다면 무조건 문자열이 된다.
		
		System.out.println("---------------------------------------------------");

		//형변환
		System.out.println("A"+10);				//A10
		System.out.println('A'+10);				//75
		System.out.println((char)('A'+10));		//K
	}

}
