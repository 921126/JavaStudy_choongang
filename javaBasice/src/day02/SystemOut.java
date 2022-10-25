package day02;

public class SystemOut {

	public static void main(String[] args) {

		/*
		 * 단축키 모음
		 * 
		 * 줄단위 선택
		 * shift + end or home 누를 시 커서를 처음 또는 마지막으로 이동시켜 전체 선택 가능
		 * 
		 * 전체 정렬하기
		 * ctrl + a , ctrl + i
		 * 
		 * 행 삭제
		 * ctrl + d
		 *
		 * 행 복사
		 * ctrl + alt + 방향키
		 * 
		 * 코드 이동
		 * alt + 방향키
		 * 
		 * 빠른 주석
		 * ctrl + /
		 * 
		 */

		//문자와 숫자
		//ctrl + s, ctrl + f11

		System.out.print("1");
		System.out.print("\n");
		System.out.print(1);
		System.out.print("\n");

		//ctrl + space 자동완성 
		System.out.println("안녕하세요.");
		System.out.println("반갑습니다.");

		//형식을 지정하는 출력문 printf
		//문자 형식을 미리 지정하고, 필요한 출력값을 지정하는 형태
		/*
		 * 서식문자
		 * %s - 문자열을 입력 받을 수 있음.
		 * %d - 정수를 입력 받을 수 있음.
		 * %f - 실수를 입력 받을 수 있음.(%.2f - 소수부 자리수를 표현 할 수있음)
		 * \n - 줄바꿈
		 * \t - 8칸 간격 들여쓰기 출력
		 */
		System.out.printf("안녕하세요. 제 이름은 %s 입니당~!\n","홍길동");
		System.out.printf("오늘은 %d월 %d일 입니다.\n", 9,20);
		System.out.printf("파이의 값은 %f입니다.\n",3.14);
		System.out.printf("파이의 값은 %.2f입니다\n",3.14); //소수부 2째 자리까지 출력

		System.out.printf("%d x %d = %d\n%d x %d = %d\n", 2, 1, 2, 2, 2, 4);
		System.out.printf("%d x %d = %d \t %d x %d = %d", 2, 1, 2, 2, 2, 4);	//8칸 뒤로 줄바꿈

	}
}
