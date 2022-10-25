package day05;
import java.util.Scanner;


public class ForEx02 {
	
	public static void main(String[] args) {
		
		//정수를 입력받고, 입력한 정수가 소수인지 판별
		//소수 > 나누어 떨어지는 수가 1과 자기 자신인 수 2 3 5 7
		//조건 > 약수의 개수가 2개인 정수
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int count = 0;
		for(int i = 1; i <= num; ++i) {
			
			if(num % i == 0) {	//약수
				count++;
			}
			
			++i;
		}
		System.out.println(count == 2 ? num + "은 소수" : num + "은 소수가 아닙니다.");
		
		
		sc.close();
		
	}

}
