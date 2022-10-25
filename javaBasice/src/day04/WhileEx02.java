package day04;

public class WhileEx02 {

	public static void main(String[] args) {
		
		//반복문안의 조건
		
		//100바퀴 회전하는 반복무에서 짝수만 출력하기
		
		int i = 1;
		while(i<=100) {
			
			if(i % 2 == 0)
			{
				System.out.print(i+ " ");
			}
			
			i++;
		}
		
		System.out.println(); // while문에서 가로 출력이후엔 줄바꿈 필요
	
		//100바퀴 회전하는 반복문에서 다른 숫자만큼 상승하기  
		int j = 2;
		while (j <=100) {
			
			System.out.print(j + " ");
			j+=2;
		}
		System.out.println();
	}
	
	
}
