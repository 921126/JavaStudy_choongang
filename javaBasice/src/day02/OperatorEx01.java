package day02;

public class OperatorEx01 {

	public static void main(String[] args) {
		
		//단항 연산자
		
		int i =-3;
		int j = -i;
		
		System.out.println(j); //3
		
		
		//++, --
		int k =1;
		k++;
		
		System.out.println(k);
		
		k--;
		System.out.println(k);
		//증감연사자는 a++, ++a의 의미가 조금 다르다.
		//뒤에 ++가 붙은 경우는 마지막에 숫자가 더해진다는 말이다. 먼저 대입, 이후 증가 
		k=1;
		int h = k++; // 먼저 대입, 이후 증가 
		System.out.println("k값:" + k);
		System.out.println("h값:" + h);
		
		k=1;
		int g = ++k; // 먼저 증가, 이후 대입
		System.out.println("k값: " + k);
		System.out.println("g값: " + g);
		
		// 가장 간단하게 판단 가능
		k=1;
		System.out.println(k++);
		System.out.println(++k);
		
		
		System.out.println("-----------------------------------------------------------");
		
		// ~ 연산자 - 2진수값을 반대로
		byte b = 10; 					// 0000 1010
		System.out.println(~b); 		// 1111 0101
		System.out.println(~b + 1); 	// -10
		
		System.out.println("-----------------------------------------------------------");

		//! 반전 연산자
		System.out.println(!true);
		
		boolean bool =!false;
		
		System.out.println(bool);
		
		System.out.println("-----------------------------------------------------------");
		
	}

}
