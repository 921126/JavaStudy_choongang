package day02;

public class OperatorCondition {

	public static void main(String[] args) {

		//3항 연산자
		
		//프로그램에서 랜덤한 값은 유요한 의미를 가진다.
		//System.out.println(Math.random());	// 0이상 ~ 1.0 미만 랜던값 출력
		//유효한 정수 랜덤값 1~10
		
		int num = (int)(Math.random() * 10)+1;
		System.out.println(num); // 1 ~10까지의 랜던함 숫자가 나온다 
		
		/*
		 * 0<= x < 1.0
		 * 0<= x < 10
		 */
		
		//랜덤값이 3의 배수인지 아닌지 검사
		
		String result = num % 3 == 0 ? "3의 배수입니다." : "3의 배수가 아닙니다.";
		//					참이라면		1번을 출력해라		아니라면 2번을 출력해라
		System.out.println(result);
	
		System.out.println("-----------------------------------------------------------------------");
		
		//실습
		/*
		 * 1~100까지 랜덤한 정수를 생성
		 * 짝수 or 홀수인지 결과 출력
		 */
		
		int rNum = (int)(Math.random() * 100)+1; //캐스팅을 위해서 소괄호 필수
		System.out.println(rNum);
		
		String result2 = rNum % 2 == 0 ? "<짝수>입니다." : "<홀수>입니다.";
		
		System.out.println(result2);
		System.out.println("-----------------------------------------------------------------------");

		//실습
		/*
		 * -5 ~ 5까지의 랜덤한 정수를 생성 (0 ~10) -5
		 * 어떤 정수가 나오든 절대값으로 출력하기 (양의 정수)
		 */
		
		int a = (int)(Math.random() *11)-5;
		System.out.println(a);
		
		//String tt = a < 0 ? "음수" : "양수";	일단 구분을 위하여 출력하고 음수를 양수로 바꾸기 위해서 *-1이 필요하다는걸 캐치
		
		int result3 = a < 0 ? a*-1 : a;
		
		//System.out.println(tt);
		System.out.println(result3);
		
		System.out.println(a < 0? -a : a); //초간단깔꼼방식
		
	
	}

}
