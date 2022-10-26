package day18.exception.throw_;

public class ThrowEx {
	public static void main(String[] args) {
		
		try {
			System.out.println(calc(10));
			System.out.println(calc(-10));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage()); //예외생성시에 만들어진 메세지 확인가능
		}
	}

	//잘못된 값이 전달되면 예외를 만들어서 메서드를 강제 종료
	public static int calc(int n) throws Exception {
		if(n <= 0) {
			throw new Exception("0이상으로 값을 전달하세요."); //예외 강제성
		}
		
		int sum = 0;
		for(int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
}


