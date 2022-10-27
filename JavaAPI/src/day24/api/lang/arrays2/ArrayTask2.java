package day24.api.lang.arrays2;

import java.util.Arrays;

public class ArrayTask2 {
	
	public static void main(String[] args) {
		
		//문자열 배열 생성
		String[] arr = {"장원영", "안유진", "아이유", "태연", "수지", "보아", "전소연", "민니"};
		
		//이분 검색 수행 - sort를 진행하지 않아 잘못된 결과 리턴됨
		int result = Arrays.binarySearch(arr, "아이유");
		System.out.println(result);
	
		//데이터 정렬
		Arrays.sort(arr);
		//정렬한 데이터 확인
		System.out.println(Arrays.toString(arr));
		result = Arrays.binarySearch(arr, "수지");
		
		if(result >= 0) {
			System.out.printf("[%s]는 %d 번째 존재\n", "수지", (result+1));
		}else {
			System.out.printf("%f는 존재하지 않음\n", "수지");
		}
	}
}
