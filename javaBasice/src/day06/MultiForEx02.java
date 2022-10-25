package day06;

import java.util.Scanner;

public class MultiForEx02 {
		
	public static void main(String[] args) {
		
		//회전할 때마다 횟수가 변하는 중첩반복문
		//피라미드 형태의 삼각형 그리기
		//바깥 반복문은 행을 나타내고, 안쪽 반복문은 열을 나타낸다.
		
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		
		for(int i =1; i<=user; i++) {			//별찍기 시작	> i가 입력받은 값보다 작거나 같으면 반복
			
			for(int j =1; j<=user-i; j++) {		//공백 출력  	> j가 (입력받은 값-i) 보다 작거나 같다면 반복하면서 공백 출력
				System.out.print(" ");
			}
			for(int j = 1; j<=(i*2)-1; j++) {	//별 출력		> j가 규칙((i*2)-1) 보다 작거나 같다면 반복하면서 별 출력
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("- - - - - - - - - - ");
		
		int star = 5;
		for(int i = 1; i<= star; i++) {
			
			for(int j = 1; j<=i-1; j++) {		//공백찍기
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*(star-i)+1; j++) {		//별찍기
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
