package day05;

import java.util.Arrays;

public class WhileEx07 {
	
	public static void main(String[] args) {
		
		//최대값을 찾아라
		int[] arr = {50,30,40,60,70,90,100,110,20};
		
		//Arrays.sort(arr);
		//System.out.println(arr[arr.length-1]);	//최대값 구하기 기능
		
		int max = arr[0];
		int min = arr[0];
		
		int i =0;
		while(i < arr.length) {
			
			if(max <arr[i]) {
				max = arr[i];
			}else {
				min = arr[i];
			}
			i++;
		}
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
			
			
	}

}
