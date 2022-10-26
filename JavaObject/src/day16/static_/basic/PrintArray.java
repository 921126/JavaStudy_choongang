package day16.static_.basic;

import java.util.Arrays;

public class PrintArray {
	
	private PrintArray() {} //생성자를 객체생성불가로 선언
	
	//메서드
	public static void toArray(int[] arr) {
		System.out.print("[");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i == arr.length-1) {
			 System.out.println("]");	
			}else {
				System.out.print(",");
			}
		}
	}

	public static void toArray(char[] arr) {
		System.out.print("[");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i == arr.length-1) {
			 System.out.println("]");	
			}else {
				System.out.print(",");
			}
		}
	}
	
	public static void toArray(String[] arr) {
		System.out.print("[");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i == arr.length-1) {
			 System.out.println("]");	
			}else {
				System.out.print(",");
			}
		}
	}
	


}
