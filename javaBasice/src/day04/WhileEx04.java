package day04;

import java.util.Scanner;

public class WhileEx04 {

	public static void main(String[] args) {

		//정수를 입력 받는다.
		//입력받은 정수까지의 합을 구해라.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수> ");
		int uNum = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		while( i <= uNum) {
			
			//i의 합
			sum += i;
			i++;
		}
		System.out.println(uNum + "까지 합: " + sum);		
		sc.close();
	}
}
