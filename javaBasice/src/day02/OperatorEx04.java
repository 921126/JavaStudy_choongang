package day02;

public class OperatorEx04 {

	public static void main(String[] args) {

		//대입연산자
		
		int a = 6;
		int b = 5;
		
		a += 3;		// a = a + 3과 동일한 표현이다. 주의사항!! 연산자를 반대로 입력하면 안된다.
		
		System.out.println(a);	//9
		
		a -= 4;		//5
		a *= 10;	//50
		a /= 3;		//16
		a %= 4;		//0
		
		System.out.println(a);
		
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		
		
		System.out.println(y += 10 - x++); // 15-2 = 13
		System.out.println(x+=2); // 5
		System.out.println( !('A' <= c && c <='Z') ); // 
		System.out.println('C'-c); // 0
		System.out.println(c+1); // 66
		System.out.println(++c); //66
		System.out.println(c++); //65
		System.out.println(c);  //A		
		
	}

}
