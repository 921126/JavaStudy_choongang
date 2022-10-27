package day24.api.util.collection;

import java.util.ArrayList;

public class CollectionArrayList {
	public static void main(String[] args) {
		
		//문자열을 저장하는 ArrayList 생성
		ArrayList<String> al = new ArrayList<>();
		
		//샘플 데이터 추가
		al.add("사과");
		al.add("귤");
		
		long start = System.currentTimeMillis();
		//데이터 추가 작업 사과와 귤 사이에 10개가 추가된다.
		for(int i = 0; i < 10; i++) {
			al.add(1, "포도");
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - start);

		//ArrayList 마지막 값 출력방법
		System.out.println(al.get(al.size()-1));
		
	}

}
