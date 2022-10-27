package day24.api.util.collection;

import java.util.LinkedList;

public class CollectionLinkedList {
	
	public static void main(String[] args) {
		
		//문자열을 저장하는 LinkedList 생성
		LinkedList<String> ll = new LinkedList<>();
		
		//샘플 데이터 추가
		ll.add("사과");
		ll.add("귤");
		
		//데이터 추가 작업
		long start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			ll.add(1, "포도");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		
		
	}
}
