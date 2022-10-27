package day24.api.lang.arrays2;

public class RecursionFibonacci {
	
	//n번째 피보나치 수열의 값을 리턴해주는 메서드
	public static int fibonacci(int n) {
		//첫번째와 두번째는 1
		if( n ==1 || n == 2) {
			return 1;
		//세번째 부터는 앞 2개항의 합
		}else{
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

	public static void main(String[] args) {
		
		System.out.println(fibonacci(10));	//빠르게 답을 구해줌
//		System.out.println(fibonacci(100));	//굉장히 느림
		
	}
}
