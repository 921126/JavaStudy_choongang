package day07;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		
		//정수형 선택정렬
		int[] arr = {5, 23, 1, 43, 100, 200, 40};
//		
//		for(int i = 0; i < arr.length-1; i++) {			//선택 값
//		
//			for(int j = i+1; j < arr.length; j++) {		//비교 대상
//				
//				if(arr[i] > arr[j]) {					//선택한 값이 비교대상보다 크다면
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		
		//퀵정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
}
