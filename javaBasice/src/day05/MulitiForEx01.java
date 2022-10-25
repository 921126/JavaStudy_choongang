package day05;

public class MulitiForEx01 {

	public static void main(String[] args) {
		
		//1~9까지 
		for(int i = 1; i <= 9; i++) {		//i가 1일때
			
			System.out.println(i);
			
			for(int j = 1; j <= 9; j++) {	//j를 9번 반복
				
				System.out.println(i + " - " + j);
				
			}
			System.out.println("---------------");
		}
	}
}
