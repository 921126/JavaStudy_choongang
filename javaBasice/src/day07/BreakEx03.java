package day07;

public class BreakEx03 {
	public static void main(String[] args) {

		//중첩반복문의 탈출

		/* boolean flag = false;
		for(char c = 'A'; c <='Z'; c++) {

			for(char l = 'a'; l <= 'z'; l++) {

				System.out.println(c + " - " + l);

				if( l == 'f') {

					flag = true;
					break;
				}
			} //inner
			if(flag) break;	//flag가 true라면 탈출
			System.out.println("- - - - -");
		}*/

		//라벨을 이용하여 바깥쪽 반복문까지 탈출하는 방법
		ex: for(char c = 'A'; c <='Z'; c++) {

			for(char l = 'a'; l <= 'z'; l++) {

				System.out.println(c + " - " + l);

				if( l == 'f') break ex;

			} //inner
		}
	}
}
