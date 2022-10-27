package day24.api.lang.arrays2;

public class NoRecursionFibonacci {
	
	//재귀를 이용하지 않고 해결하는 피보나치
	public static long fibonacci(String n) {
		
		long num = Long.parseLong(n);
		//이전항의 값과 이전의 이전 항의 값을 저장할 변수
		long f1 = 1;
		long f2 = 1;
		
		//피보나치 값을 저장할 변수
		long fibo = 1;
		
		//첫번째와 두번째는 처리할 필요가 없어서 반복문을 세번째 부터 적용
		for(int i =3; i<=num; i++) {
			fibo = f1+f2;
			f2 = f1;
			f1 = fibo;
		}
		return fibo;
	}

	public static void main(String[] args) {
		
		System.out.println(fibonacci("10"));
		
	}
	
}
