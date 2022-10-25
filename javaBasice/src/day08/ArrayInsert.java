package day08;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {
	
	public static void main(String[] args) {
		
		//입력받은 문자열을 배열에 순서대로 저장.
		//배열의 한계점 > 크기가 고정이다.
		
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[100];
		
		int count = 0; //인덱스용 변수
		
		//"그만" 문자가 들어오기 전까지 입력.
		while(true) {
			
			System.out.print(">");
			String menu = sc.nextLine();
		
			if(menu.equals("그만")) break;

			arr[count] = menu;	//입력된 값 저장
			count++;	//인덱스 증가
		}
		
		//출력
		String str = "[";
		
		for(int i = 0; i < count; i++) {
			str += arr[i];
			if(i == count -1) {
				str += "]";
				break;
			}
			str += ", ";
		}
		System.out.print(str);
		
		sc.close();
	}
}
