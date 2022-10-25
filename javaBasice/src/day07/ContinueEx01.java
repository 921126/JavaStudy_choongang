package day07;

public class ContinueEx01 {
	
	public static void main(String[] args) {
	
		//for문에서 continue의 사용
//		for(int i = 1; i <=10; i++) {
//			
//			if(i % 2 == 1) { //홀수일 경우 뛰어넘겠다.
//				continue;
//			}
//			System.out.println(i);
//		}
		
		//while문에서의 continue의 사용
		int i = 1;			//1로 시작할 경우 무한루프돌으므로 0시작
		while(i <=10) {
			
			if(i % 2 == 1) {
				i++;
				//continue;
				return;//메인의 종료를 의미함
			}
			System.out.println(i);
			i++;			//0으로 시작하므로 i의 값이 먼저 올라가게 설정
		}
		
		System.out.println("프로그램 정상 종료");
	}

}
