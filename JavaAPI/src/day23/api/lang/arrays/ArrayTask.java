package day23.api.lang.arrays;

import java.util.Arrays;

public class ArrayTask {
	
	public static void main(String[] args) {
		
		//문자열 배열 생성
		String[] arr = {"카리나", "아이린", "윈터", "조이", "슬기" };
		
		//배열을 순회하면서 출력
		for (String singer : arr) {
			System.out.println(singer);
		}
		
		//배열의 정렬
		//Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		//a문자열의 크키를 비교하는 메서드: compareTo(), CompareToIgnorecase()
		System.out.println(arr[0].compareTo(arr[1]));
		
		//선택 정렬(실무 사용X, 하지만 정렬에 대한 설명 및 반복문 연습용)
		//배열의 복제
		String[] copyArr = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(copyArr));
		//첫번째 부터 n-1 번째 데이터 까지
		for(int i =0; i < copyArr.length-1; i++) {
			//자신의 뒤에 있는 모든 데이터와 비교해서
			for(int j = i+1; j < copyArr.length; j++) {
				//뒤에 있는 데이터가 더 크다면(작다면) 교환해라
				if(copyArr[i].compareTo(copyArr[j]) > 0) {
					String tmp = copyArr[i];
					copyArr[i] = copyArr[j];
					copyArr[j] = tmp;
				}
				
			}
		}
		System.out.println(Arrays.toString(copyArr));
	}
}
