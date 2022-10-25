package day07;

import java.util.Scanner;

public class BreakEx02 {
	public static void main(String[] args) {
		
		/*
		 * 무한 루프
		 * 반복의 횟수를 정확히 가늠할 수 없을 때 무한 루프를 만들고
		 * break문으로 빠져나오도록 처리한다.
		 * 
		 */
		
		//정답을 맞출때까지 계속 정답을 입력받는 프로그램
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println(" 4 x 6 = ?");
			System.out.print(">");
			
			int answer = sc.nextInt();

			//정답이라면 탈출
			if(answer == 24) {
				System.out.println("정답입니다!");
				break;
			}
			
			//정답이 아닐경우
			System.out.println("틀렸어요...");
		}
		
		sc.close();
		System.out.println("프로그램을 종료합니다.");

	}
}
