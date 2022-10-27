package day24.api.util.collection;

import java.util.Arrays;

public class CollectionArray {
	
	public static void main(String[] args) {
		
		String[] arr = {"List", "Set", "Map"};
		//배열의 데이터를 수정하는 것은 가능하다.
		arr[2] = "HashTable";
		System.out.println(Arrays.toString(arr));
		
		//배열에 데이터를 추가
		//기존 배열보다 1개 더 큰 공간을 가지는 새로운 배열을 생성
		String[] arr2 = new String[arr.length + 1];
		//기존 배열의 내용을 복사하기
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		//신규배열 마지막에 신규 데이터 추가
		arr2[arr2.length-1] = "Properties";
		//신규 배열이 가르키는 곳을 기존배열이 가르키도록 한다.
		arr = arr2;
		System.out.println(Arrays.toString(arr2));
	
		//실습*** 배열의 "Set"데이터를 삭제
		
		String[] arr3 = new String[arr.length-2];
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] = arr[i];
			if(arr[i].equals("Set")) {
				arr3[i] = arr[i+1];
			}
		}
		System.out.println(Arrays.toString(arr3));
	}
}
