package day04;

import java.util.Scanner;

public class WhileEx05 {

	public static void main(String[] args) {
	
		/*
		 * 반복문 안에서의 입력
		 * 
		 * 1. 1개의 정수를 입력 받아 반복의 횟수 결정
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반복횟수> ");
		int num = sc.nextInt();
		
		int sum = 0; //누적할 변수
		
		int i =1;
		while(i <= num) {
			
			System.out.print(">");
			int a = sc.nextInt();
			sum += a; //입력받은 수의 누적
			
			i++;
		}
		
		System.out.println(sum);
		sc.close();
	}
}
