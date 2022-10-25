package day05;

public class ForEx01 {
	
	public static void main(String[] args) {
	
		//1~10합계 구하기
		int sum = 0;
		for(int i =1; i <=10; i++) {
			sum += i;			
		}
		System.out.println(sum);
		System.out.println("---------------------");
		
		//10~1까지 반복하는 숫자
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
	}
}
