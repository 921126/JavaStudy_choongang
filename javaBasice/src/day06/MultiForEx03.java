package day06;

import java.util.Scanner;

public class MultiForEx03 {
	public static void main(String[] args) {
		
		//입력받은 수(1~5)까지 소수를 출력.
		//소수? 나누어 떨어지는 수가 1과 자기 자신인 수
		//예) 5 -> 2 3 5 
		//힌트: 입력받은 수 까지 반복하고, 각 수를 자기 자신까지 나누면서 약수의 개수가 2개인 수
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >");
		
		int num = sc.nextInt();
		
		for(int i = 1; i<= num; i++) {	//입력받은 수까지 반복한다.
			
			int count = 0; //카운트 초기화

			for(int j = 1; j <= i; j++) {
				System.out.println(i + "-" + j);
				if( i % j == 0) {			//만약에 i%j의 나머지가 0이라면 카운트 누적한다.
					count++;
				}
			}
			if(count == 2) {				//나머지 카운트가 2라면 소수를 찾아라.
				System.out.println(i);
			}
		}
		
		sc.close();
		
	}
}
