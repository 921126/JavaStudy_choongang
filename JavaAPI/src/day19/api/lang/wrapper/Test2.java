package day19.api.lang.wrapper;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//실수 문자열을 입력받아 실수로 변경하고 출력하는 프로그램
		System.out.print("실수를 입력하세요 :");
		String su = sc.nextLine();
		
		
		try {
			//실수 문자열을 실수로 변경
			Double silsu = Double.parseDouble(su);

			//실수를 문자열로 변환
			String msg = silsu.toString();
			System.out.println(msg);
			
		} catch (Exception e) {
			System.out.println("변환 실패");
		}
		
		sc.close();
	}

}
