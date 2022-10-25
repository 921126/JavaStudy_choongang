package day08;

import java.util.Arrays;
import java.util.Scanner;

import day02.SystemOut;

public class ArrayUpdate {
	public static void main(String[] args) {
		
		//배열값의 수정
		//탐색 -> 변경 -> 결과출력의 과정을 가진다.
		String[] arr = {"어피치", "라이언", "제이지", "네오", "무지", "튜브"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("찾을 이름>");
		String name = sc.next();
		
		boolean flag = false; 
		
		for(int i = 0; i < arr.length; i++) {
			if(name.equals(arr[i])) {	//데이터 탐색 조건
				System.out.print("변경할 이름>");
				String n = sc.next();
				arr[i] = n;				//데이터 수정
				flag = true;
			}
		}
		//찾음, 못찾음의 구분
		if(flag) {
			System.out.println("이름이 수정되었습니다.");
		}else {
			System.out.println("이름이 존재하지 않습니다.");
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
