package day02;

public class CastingEx03 {

	public static void main(String[] args) {

		//연산에서의 형변환
		
		char c = 'C';//67
		int i = 2;
		
		//System.out.println(c+i);	//69
		
		// 1. 서로 다른 타입의 연산에서는 큰 타입을 따라간다.
		//char cc = c+i;		 	//불가능
		char cc = (char)(c+i);	 	//가능	E
		int ii = c+i;
		
		System.out.println(cc);	// E
		System.out.println(ii);	// 69
		
		int j = 10;
		double d = 3.14;
		double result = j+d;
		
		System.out.println(result);	//13.14
		
		//2. int형보다 작은 타입의 연산 결과는 무조건 int가 된다.
		byte b1 = 100;
		byte b2 = 10;
		byte b3 = (byte)(b1+b2);
		
		System.out.println(b3);
		
		short s1 = 100;
		byte s2 = 10;
		
		//short s3 = s1+s2; int 값으로 변환되어 오류 출력
		// 저장을 하고 싶다면 형변환 필요
		short s3 =(short)(s1 +s2);
		
		System.out.println(s3);
	}

}
