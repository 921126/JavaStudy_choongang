package day03;

public class SwitchEx {

		public static void main(String[] args) {
			
			int a = 1;
			
			//switch 구문의 (Key)에는 값이나 값에대한 연산식이 들어갈 수 있다.
			switch (a) {
			case 1:
				System.out.println("1입니다.");
				break;
			case 2:
				System.out.println("2입니다.");
				break;
			case 3:
				System.out.println("3입니다.");
				break;
			case 4:
				System.out.println("4입니다.");
				break;

			default:
				System.out.println("1~4가 아닙니다.");
				break;
			}
			
		}
}
