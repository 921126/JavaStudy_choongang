package day03;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {

		//IfEc02와 동일하게 실행되도록 switch 문으로 변겨하기
		//입력받은 점수에 따라서 A, B, C , D , F로 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수>");
		int point = sc.nextInt();
		
		point = point / 10;
		
		switch (point) {
		
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;

		default:
			System.out.println("E");
			break;
		}
		
		sc.close();
	}

}
