package day02;

public class OperatorEx03 {

	public static void main(String[] args) {

		//논리연산자
		int x = 10;
		int y = 20;

		//if뒤에는 조건이 온다. true 라면 if문 실행, false 라면 else문 실행
		// &&, || 앞 항을 검사해서 결과가 정해지면, 뒤를 실행하지 않는다.
		if(x != 10 && ++y ==21) {

			System.out.println("참 입니다.");

		}else {

			System.out.println("거짓 입니다.");

		}

		System.out.println("x값: " + x + ", y값: " + y);
		
		if(x ==10 || ++y == 21) {
			
			System.out.println("참 입니다.");
			
		} else {
			
			System.out.println("거짓 입니다.");
			
		}
		
		System.out.println("x값: " + x + ", y값: " + y);
	}

}
