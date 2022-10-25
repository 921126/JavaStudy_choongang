package day07;

import java.util.Scanner;

public class ArraySerch2 {

	public static void main(String[] args) {
		
		//순차탐색과 문자열 비교
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"홍길동", "이순신", "카카오", "네이버", "박찬호"};
		String name = sc.next();
		
		int index = -1;
		for(int i = 0; i<arr.length; i++) {
			
			if(name.equals(arr[i])) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println(name + "은 없습니다.");
		}else {
			System.out.println(name + "은 " + index +"번째에 위치합니다.");
		}
		sc.close();
	}
}
