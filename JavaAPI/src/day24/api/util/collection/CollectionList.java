package day24.api.util.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionList {
	public static void main(String[] args) {
		
		//10000개의 데이터를 가지는 ArrayList와 LinkendList 생성
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < 5; i++) {
			al.add(i);
		}
		
		LinkedList<Integer> ll = new LinkedList<>();
		for(int i = 0 ; i < 5; i++) {
			ll.add(i);
		}
		
		//ArrayList에서 10000개의 데이터를 읽는데 걸리는 시간
		//데이터를 가져오는 메서드는 get(인덱스)
		long start = System.currentTimeMillis();
		for(int i = 0; i < 5; i++) {
			System.out.println(al.get(i));
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		//배열로 확인하기
		System.out.println(al);
		
	}

}
