package day02;

public class OperatorEx02 {

	public static void main(String[] args) {

		//2항 연산자 - 항이 2개인 연산자
		
		int i = 7 / 3; //몫을 구하는 연산 2
		int j = 7 % 3; //나머지 구하는 연산 1
		int k = 7 * 3; //곲을 구하는 연산 21
		
		
		//비교 연산
		System.out.println(i == j);		//false 같다 
		System.out.println(i != j);		//ture  같지 않다 
		System.out.println(i >= 1);		//ture  1보다 크다 않다 
		System.out.println(i < j);		//false 1보다 작다 		
		System.out.println(k != 21);	//false 21과 같지 않다
		
		
		//**** 꿀팁! 배수 구하기 코드
		System.out.println(k % 2 != 0);	//true 짝수인지 판별할때 많이 사용함.
		System.out.println(k % 2 == 0);	//해당 값이 true라면 짝수이다. false라면 홀수이다.
		System.out.println(k % 7 == 0); //true 하면 7의 배수라는 뜻
		
		
	}

}
