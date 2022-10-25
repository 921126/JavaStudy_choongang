package day05;

import java.util.Arrays;

public class ForEx04 {
	public static void main(String[] args) {
		
		//변수의 swap
		
//		int x =10;
//		int y = 5;
//		int tmp = 0;
//		
//		tmp = x;
//		x = y;
//		y = tmp;
//		
//		System.out.println(x);
//		System.out.println(y);
		
		//배열의 swap - 배열을 1번 랜덤하게 섞는다.
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int randN = (int)(Math.random()*9)+1; // 1 ~ 10 미만의 랜덤한 수	
		
		int tmp = arr[0];
		arr[0] = arr[randN];
		arr[randN] = tmp;
		
		//System.out.print("랜덤 인덱스>" + randN);
		System.err.println(Arrays.toString(arr));
		
		
	}
}
