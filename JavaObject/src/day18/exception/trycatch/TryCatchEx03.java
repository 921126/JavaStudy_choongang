package day18.exception.trycatch;

import java.util.Scanner;

public class TryCatchEx03 {

	public static void main(String[] args) {

		//입력과 예외처리
		//0을 입력하기 전까지 숫자를 입력

		Scanner sc = new Scanner(System.in);
		
		while(true) {

			try {
				System.out.print("숫자를 입력해주세요 >");
				
				int num = sc.nextInt();
//				num = Integer.parseInt(sc.nextLine()); 
				
				if(num == 0) break;
			} catch (Exception e) {
				System.out.println("숫자로 입력하세요.");
				
				sc.nextLine();//엔터 개행 제거
				
			}
		}
		
	}

}
