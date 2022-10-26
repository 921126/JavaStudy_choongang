package day18.exception.trycatch;

public class TryCatchEx01 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		System.out.println(a + b);
	
		try {
			//예외 발생 가능성 있는 코드 작성
			System.out.println(a / b);
			
		} catch (Exception e) {
			//예외 발생 시 예외 처리 할 수 있는 예외 종류가 들어간다.
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		System.out.println(a - b);
		
	}
}


