package day05;

public class DoWhileEx {

	public static void main(String[] args) {
		//while문이 do~while을 대체 할 수 있어서 많이 사용하지 않음.
		
		//기존 while문에서 1~10합 구하기
//		int i = 1;
//		int sum = 0;
//		
//		while(i<=10) {
//			sum += i;
//			i++;
//		}
//		System.out.println(sum);
	
		//do~while문으로 1~10합 구하기
		int i = 1;
		int sum = 0;
		
		do {
			sum += i;
			i++;
		}while(i <=10);
		
		System.out.println(sum);
	}
}


