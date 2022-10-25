package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySerch3 {
	
	public static void main(String[] args) {
	
		//이진탐색 - 절반으로 나누어가며 찾아가는 과장
		//조건 - 순서대로 나열된 데이터
		int[] arr = {30,50,80,100,110,250,300,500};
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int low =0;						//인덱스 제일 작은 값
		int high = arr.length-1;		//인덱스 제일 큰 값
		
		while(low <= high) {
			
			int mid = (low + high)/2;	//인덱스 중간값
			
			if(num == arr[mid]) {
				System.out.println("인덱스위치:" + mid);
				break;
			}
			
			if(num > arr[mid]) { 		//입력값이 중간값보다 큰 경우
				low = mid + 1;
			}else { 					//입력값이 중간값보다 작은 경우
				high = mid - 1;
			}
		}
		if(low > high) {
			System.out.println("찾는 값이 없습니다.");
		}

		System.out.println(Arrays.binarySearch(arr, 500));
	
	}

}
